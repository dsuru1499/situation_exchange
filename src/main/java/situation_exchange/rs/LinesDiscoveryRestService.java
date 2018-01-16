package situation_exchange.rs;

import static situation_exchange.common.SituationExchangeUtils.resume;

import javax.validation.Valid;
import javax.ws.rs.BeanParam;
import javax.ws.rs.GET;
import javax.ws.rs.OPTIONS;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.container.AsyncResponse;
import javax.ws.rs.container.Suspended;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response.Status;

import org.apache.commons.lang3.exception.ExceptionUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.stereotype.Service;

import io.swagger.annotations.Api;
import lombok.extern.log4j.Log4j;
import reactor.core.publisher.Mono;
import situation_exchange.common.MonitorSubscriber;
import situation_exchange.repositories.AnnotatedLineStructureRepository;
import situation_exchange.repositories.datatables.DataTablesInput;
import situation_exchange.repositories.datatables.DataTablesOutput;
import situation_exchange.services.LinesDiscovery;
import situation_exchange.services.LinesDiscoveryParameters;
import uk.org.siri.siri.AnnotatedLineStructure;
import uk.org.siri.siri.Siri;

@Path("/lines-discovery")
@Api("/lines-discovery")
@Service
@Log4j
public class LinesDiscoveryRestService extends LinesDiscovery {

	@Autowired
	private AnnotatedLineStructureRepository annotatedLineDAO;

	@OPTIONS
	public void options(@Suspended final AsyncResponse response) {
		resume(response, Status.OK, null);
	}

	@GET
	@Path("/datatables")
	@Produces({ MediaType.APPLICATION_JSON })
	public void linesDiscovery(@Valid DataTablesInput input, @Suspended final AsyncResponse response) {

		log.info("[DSU] configuration : " + configuration);
		log.info("[DSU] " + SERVICE_NAME + " : " + input);

		annotatedLineDAO.findAll(AnnotatedLineStructure.class, input).subscribe(MonitorSubscriber.create(SERVICE_NAME, t -> {
			resume(response, Status.OK, t);
		}, e -> {
			DataTablesOutput<AnnotatedLineStructure> result = new DataTablesOutput<AnnotatedLineStructure>();
			result.setError(ExceptionUtils.getMessage(e));
			resume(response, Status.BAD_REQUEST, result);
		}));

	}

	@GET
	@Produces({ MediaType.APPLICATION_JSON })
	public void linesDiscovery(@BeanParam @Valid LinesDiscoveryParameters parameters, @Suspended final AsyncResponse response) {

		log.info("[DSU] configuration : " + configuration);
		log.info("[DSU] " + SERVICE_NAME + " : " + parameters);

		validate(parameters).flatMapMany(t -> {
			Criteria criteria = createCriteria(t);
			return annotatedLineDAO.findAll(AnnotatedLineStructure.class, criteria);
		}).collectList().map(this::onSuccess).onErrorResume(t -> Mono.just(this.onError(t)))
				.subscribe(MonitorSubscriber.create(SERVICE_NAME, t -> {
					Siri entity = factory.createSiri();
					entity.setLinesDelivery(t);
					if (t.isStatus()) {
						resume(response, Status.OK, entity);
					} else {
						resume(response, Status.BAD_REQUEST, entity);
					}
				}));
	}

}
