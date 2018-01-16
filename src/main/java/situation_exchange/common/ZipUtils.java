package situation_exchange.common;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Enumeration;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;

import org.apache.commons.compress.utils.IOUtils;

public abstract class ZipUtils {

	public static void unzipArchive(File archive, File outputDir) throws IOException {
		ZipFile zipfile = new ZipFile(archive);
		for (Enumeration<? extends ZipEntry> e = zipfile.entries(); e.hasMoreElements();) {
			ZipEntry entry = (ZipEntry) e.nextElement();
			unzipEntry(zipfile, entry, outputDir);
		}
	}

	public static void unzipEntry(ZipFile zipfile, ZipEntry entry, File outputDir) throws IOException {

		if (entry.isDirectory()) {
			createDir(new File(outputDir, entry.getName()));
			return;
		}

		File outputFile = new File(outputDir, entry.getName());
		if (!outputFile.getParentFile().exists()) {
			createDir(outputFile.getParentFile());
		}

		BufferedInputStream in = new BufferedInputStream(zipfile.getInputStream(entry));
		BufferedOutputStream out = new BufferedOutputStream(new FileOutputStream(outputFile));

		try {
			IOUtils.copy(in, out);
		} finally {
			out.close();
			in.close();
		}
	}

	public static void createDir(File dir) throws IOException {
		if (!dir.mkdirs())
			throw new IOException("Can not create dir " + dir);
	}

}
