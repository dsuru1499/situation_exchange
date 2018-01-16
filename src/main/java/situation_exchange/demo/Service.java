package situation_exchange.demo;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;

import org.apache.commons.collections4.SetValuedMap;
import org.apache.commons.collections4.multimap.HashSetValuedHashMap;
import org.apache.commons.compress.utils.IOUtils;
import org.apache.commons.io.FileUtils;
import org.springframework.beans.factory.annotation.Autowired;

import com.jamonapi.Monitor;
import com.jamonapi.MonitorFactory;

import gtfs.importer.GtfsImporter;
import gtfs.importer.Index;
import gtfs.model.Route;
import gtfs.model.Stop;
import lombok.extern.log4j.Log4j;
import situation_exchange.common.Color;
import situation_exchange.common.ZipUtils;
import situation_exchange.demo.Context.AnnotatedLineDestination;
import situation_exchange.repositories.AnnotatedLineStructureRepository;
import situation_exchange.repositories.AnnotatedStopPointStructureRepository;
import uk.org.siri.siri.AnnotatedLineStructure;
import uk.org.siri.siri.AnnotatedStopPointStructure;

@Log4j
@org.springframework.stereotype.Service
public class Service {

	private static final String ARCHIVE = "data.zip";
	private static final String OUTPUT_DIR = "siri";

	@Autowired
	AnnotatedLineStructureRepository lineDAO;

	@Autowired
	private AnnotatedStopPointStructureRepository stopPointDAO;

	@PostConstruct
	public void initialize() {

		Monitor monitor = MonitorFactory.start();
		log.info(Color.YELLOW + "[DSU] initialize model (~ 1mn)" + Color.NORMAL);

		// String temp = System.getProperty("user.home");
		String temp = System.getProperty("java.io.tmpdir");
		Path path = Paths.get(temp, OUTPUT_DIR);
		try {
			if (Files.notExists(path)) {
				extractArchive(path);
			}
		} catch (Exception e) {

			try {
				FileUtils.deleteDirectory(path.toFile());
			} catch (IOException ignored) {
			}
			log.error(e.getMessage(), e);
		}

		GtfsImporter importer = new GtfsImporter(path.toString());

		SetValuedMap<String, AnnotatedLineDestination> destinations = new HashSetValuedHashMap<String, AnnotatedLineDestination>();
		SetValuedMap<String, String> lineRefs = new HashSetValuedHashMap<String, String>();
		fillAnnotatedLine(importer, destinations);
		fillAnnotatedStopPoint(importer, lineRefs);

		importer.dispose();

		log.info(Color.YELLOW + "[DSU] model initialized : " + monitor.stop() + Color.NORMAL);

	}

	protected void fillAnnotatedLine(GtfsImporter importer, SetValuedMap<String, AnnotatedLineDestination> destinations) {

		Monitor monitor = MonitorFactory.start("annotated-line");

		try {
			lineDAO.count().filter(t -> t == 0).subscribe(t -> {

				log.info(Color.YELLOW + "[DSU] initialize AnnotatedLine (s) " + Color.NORMAL);

				Context context = new Context();
				Index<Route> routes = importer.getRouteById();

				List<AnnotatedLineStructure> entities = new ArrayList<AnnotatedLineStructure>();
				for (Route route : routes) {
					context.setRoute(route);
					context.setDestinations(destinations.get(route.getRouteId()));

					AnnotatedLineStructure entity = AnnotatedLineFactory.create(context);
					entities.add(entity);
				}

				lineDAO.saveAll(entities).subscribe();

			});

		} catch (Exception e) {
			log.error(e.getMessage(), e);
		} finally {
			log.info(Color.YELLOW + monitor.stop() + Color.NORMAL);
		}
	}

	protected void fillAnnotatedStopPoint(GtfsImporter importer, SetValuedMap<String, String> lineRefs) {

		Monitor monitor = MonitorFactory.start("annotated-stoppoint");

		try {

			stopPointDAO.count().filter(t -> t == 0).subscribe(t -> {

				log.info(Color.YELLOW + "[DSU] initialize AnnotatedStopPoint (s) " + Color.NORMAL);

				Context context = new Context();
				Index<Stop> stops = importer.getStopById();

				List<AnnotatedStopPointStructure> entities = new ArrayList<AnnotatedStopPointStructure>();
				for (Stop stop : stops) {
					context.setStop(stop);
					context.setLineRefs(lineRefs.get(stop.getStopId()));

					AnnotatedStopPointStructure entity = AnnotatedStopPointFactory.create(context);
					entities.add(entity);
				}

				stopPointDAO.saveAll(entities).subscribe();
			});
		} catch (Exception e) {
			log.error(e.getMessage(), e);
		} finally {
			log.info(Color.YELLOW + monitor.stop() + Color.NORMAL);
		}
	}

	private void extractArchive(Path path) throws IOException {
		Monitor monitor = MonitorFactory.start();

		String temp = System.getProperty("java.io.tmpdir");
		Files.createDirectories(path);

		ClassLoader loader = Thread.currentThread().getContextClassLoader();
		InputStream in = new BufferedInputStream(loader.getResourceAsStream(ARCHIVE));
		File file = Paths.get(temp, OUTPUT_DIR, ARCHIVE).toFile();
		OutputStream out = new BufferedOutputStream(new FileOutputStream(file));
		IOUtils.copy(in, out);
		out.close();
		in.close();

		ZipUtils.unzipArchive(file, path.toFile());
		log.info(Color.YELLOW + "[DSU] extract archive : " + path + " " + monitor.stop() + Color.NORMAL);

	}

}
