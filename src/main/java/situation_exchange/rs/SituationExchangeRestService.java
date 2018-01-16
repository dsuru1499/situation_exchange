package situation_exchange.rs;

import static situation_exchange.common.SituationExchangeUtils.resume;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Collection;
import java.util.UUID;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import javax.ws.rs.BeanParam;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.OPTIONS;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.container.AsyncResponse;
import javax.ws.rs.container.Suspended;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;
import javax.xml.bind.annotation.XmlType;

import org.apache.commons.lang3.StringUtils;
import org.apache.commons.lang3.exception.ExceptionUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.stereotype.Service;

import io.swagger.annotations.Api;
import lombok.extern.log4j.Log4j;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;
import situation_exchange.common.MonitorSubscriber;
import situation_exchange.common.XmlStructureFactory;
import situation_exchange.repositories.SituationExchangeRepository;
import situation_exchange.repositories.datatables.DataTablesInput;
import situation_exchange.repositories.datatables.DataTablesOutput;
import situation_exchange.services.SituationExchange;
import situation_exchange.services.SituationExchangeParameters;
import uk.org.siri.siri.EntryQualifierStructure;
import uk.org.siri.siri.ParticipantRefStructure;
import uk.org.siri.siri.PtSituationElementStructure;
import uk.org.siri.siri.ServiceDelivery;
import uk.org.siri.siri.Siri;
import uk.org.siri.siri.SituationVersion;

@Path("/situation-exchange")
@Api("/situation-exchange")
@Service
@Log4j
public class SituationExchangeRestService extends SituationExchange {

	@Autowired
	private SituationExchangeRepository situationsDAO;

	@GET
	@Produces({ MediaType.APPLICATION_JSON })
	public void getSituationExchange(@BeanParam @Valid SituationExchangeParameters parameters,
			@Suspended final AsyncResponse response) {
		log.info("[DSU] configuration : " + configuration);
		log.info("[DSU] " + SERVICE_NAME + " : " + parameters);

		try {
			validate(parameters).flatMapMany(t -> {
				Criteria criteria = createCriteria(t);
				return situationsDAO.findAll(PtSituationElementStructure.class, criteria);
			}).collectList().map(this::onSuccess).onErrorResume(t -> Mono.just(this.onError(t)))
					.subscribe(MonitorSubscriber.create(SERVICE_NAME, t -> {
						Siri entity = factory.createSiri();
						ServiceDelivery deliveries = factory.createServiceDelivery();
						deliveries.getSituationExchangeDelivery().add(t);
						entity.setServiceDelivery(deliveries);
						if (t.isStatus()) {
							resume(response, Status.OK, entity);
						} else {
							resume(response, Status.BAD_REQUEST, entity);
						}
					}));
		} catch (Exception e) {
			log.error(e.getMessage(), e);
		}
	}

	@GET
	@Path("/datatables")
	@Produces({ MediaType.APPLICATION_JSON })
	public void getSituationExchange(@Valid DataTablesInput input, @Suspended final AsyncResponse response) {
		log.info("[DSU] configuration : " + configuration);
		log.info("[DSU] " + SERVICE_NAME + " : " + input);

		try {
			situationsDAO.findAll(PtSituationElementStructure.class, input).subscribe(MonitorSubscriber.create(SERVICE_NAME, t -> {
				resume(response, Status.OK, t);
			}, e -> {
				DataTablesOutput<PtSituationElementStructure> output = new DataTablesOutput<PtSituationElementStructure>();
				output.setError(ExceptionUtils.getMessage(e));
				resume(response, Status.BAD_REQUEST, output);
			}));
		} catch (Exception e) {
			log.error(e.getMessage(), e);
		}
	}

	@OPTIONS
	@Path("/ext")
	public void options(@Suspended final AsyncResponse response) {
		resume(response, Status.OK, null);
	}

	@POST
	@Path("/ext")
	@Consumes({ MediaType.APPLICATION_JSON })
	@Produces({ MediaType.APPLICATION_JSON })
	public void create(@NotNull @Valid PtSituationElementStructure entity, @Suspended final AsyncResponse response) {
		log.info("[DSU] configuration : " + configuration);
		log.info("[DSU] create " + SERVICE_NAME + " : " + entity);

		try {
			EntryQualifierStructure situationNumber = factory.createEntryQualifierStructure();
			situationNumber.setValue(UUID.randomUUID().toString());
			entity.setSituationNumber(situationNumber);
			entity.setCreationTime(XmlStructureFactory.getTimestamp());
			SituationVersion version = factory.createSituationVersion();
			version.setValue(BigInteger.valueOf(System.currentTimeMillis()));
			entity.setVersion(version);
			ParticipantRefStructure participantRef = factory.createParticipantRefStructure();
			participantRef.setValue(configuration.getParticipantRef());
			entity.setParticipantRef(participantRef);

			situationsDAO.save(entity).subscribe(MonitorSubscriber.create(SERVICE_NAME, t -> {
				resume(response, Status.OK, t);
			}, e -> {
				log.error(e.getMessage(), e);
				resume(response, Status.NOT_FOUND, e);
			}));
		} catch (Exception e) {
			log.error(e.getMessage(), e);
		}
	}

	@GET
	@Path("/ext")
	@Produces({ MediaType.APPLICATION_JSON })
	public void read(@QueryParam("id") String situationNumber, @Suspended final AsyncResponse response) {
		log.info("[DSU] configuration : " + configuration);
		log.info("[DSU] read " + SERVICE_NAME + " : " + situationNumber);

		try {
			Flux<PtSituationElementStructure> publisher;
			if (StringUtils.isBlank(situationNumber)) {
				publisher = situationsDAO.findAll();
			} else {
				Criteria criteria = Criteria.where("SituationNumber.value").is(situationNumber);
				publisher = situationsDAO.findAll(PtSituationElementStructure.class, criteria);
			}
			publisher.collectList().subscribe(MonitorSubscriber.create(SERVICE_NAME, t -> {
				uk.org.siri.siri.SituationExchangeDeliveryStructure.Situations result = factory
						.createSituationExchangeDeliveryStructureSituations();
				result.getPtSituationElement().addAll(t);

				Situations u = new Situations(t);
				resume(response, Status.OK, u);
			}, e -> {
				log.error(e.getMessage(), e);
				resume(response, Status.NOT_FOUND, e);
			}));
		} catch (Exception e) {
			log.error(e.getMessage(), e);
		}
	}

	@PUT
	@Path("/ext")
	@Consumes({ MediaType.APPLICATION_JSON })
	@Produces({ MediaType.APPLICATION_JSON })
	public void update(@QueryParam("id") String situationNumber, PtSituationElementStructure entity,
			@Suspended final AsyncResponse response) {
		log.info("[DSU] configuration : " + configuration);
		log.info("[DSU] update " + SERVICE_NAME + " : " + situationNumber);

		try {
			Criteria criteria = Criteria.where("SituationNumber.value").is(situationNumber);
			situationsDAO.update(PtSituationElementStructure.class, criteria, entity)
					.subscribe(MonitorSubscriber.create(SERVICE_NAME, t -> {
						resume(response, Status.OK, t);
					}, e -> {
						log.error(e.getMessage(), e);
						resume(response, Status.NOT_FOUND, e);
					}));
		} catch (Exception e) {
			log.error(e.getMessage(), e);
		}
	}

	@DELETE
	@Path("/ext")
	public void delete(@QueryParam("id") String situationNumber, @Suspended final AsyncResponse response) {
		log.info("[DSU] configuration : " + configuration);
		log.info("[DSU] delete " + SERVICE_NAME + " : " + situationNumber);
		resume(response, Status.OK);
		try {
			Criteria criteria = Criteria.where("SituationNumber.value").is(situationNumber);
			situationsDAO.deleteAll(PtSituationElementStructure.class, criteria)
					.subscribe(MonitorSubscriber.create(SERVICE_NAME, t -> {
						log.error("resume : " + Status.NO_CONTENT);
						response.resume(Response.noContent().build());
						// resume(response, Status.NO_CONTENT);
					}, e -> {
						log.error(e.getMessage(), e);
						resume(response, Status.NOT_FOUND);
					}));
		} catch (Exception e) {
			log.error(e.getMessage(), e);
		}
	}

	@XmlType
	class Situations extends ArrayList<PtSituationElementStructure> {

		private static final long serialVersionUID = 1L;

		public Situations(Collection<? extends PtSituationElementStructure> arg0) {
			super(arg0);
		}

	}

}
