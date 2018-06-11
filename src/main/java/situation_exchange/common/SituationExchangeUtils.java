package situation_exchange.common;

import java.nio.charset.StandardCharsets;

import javax.ws.rs.container.AsyncResponse;
import javax.ws.rs.core.CacheControl;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.ResponseBuilder;
import javax.ws.rs.core.Response.Status;

import lombok.extern.java.Log;
import lombok.extern.log4j.Log4j;

@Log4j
public class SituationExchangeUtils {

	public static void resume(AsyncResponse response, Status status) {
		ResponseBuilder builder = status(status);
		response.resume(builder.build());
	}

	public static void resume(AsyncResponse response, Status status, Object entity) {
		ResponseBuilder builder = status(status).entity(entity);
		builder.type(MediaType.APPLICATION_JSON_TYPE.withCharset(StandardCharsets.UTF_8.toString()));
		CacheControl cache = new CacheControl();
		cache.setMaxAge(60 * 10);
		builder.cacheControl(cache);
		response.resume(builder.build());
	}

	private static ResponseBuilder status(Status status) {
		ResponseBuilder builder = Response.status(status).header("Access-Control-Allow-Origin", "*")
				.header("Access-Control-Allow-Methods", "GET, POST, PUT, DELETE")
				.header("Access-Control-Allow-Headers", "origin, content-type, accept, authorization, x-requested-with")
				.header("Access-Control-Allow-Credentials", "true").allow("OPTIONS");

		return builder;
	}

}
