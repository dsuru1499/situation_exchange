package situation_exchange.rs.serializer;

import java.util.Arrays;
import java.util.List;

import uk.org.siri.siri.AdviceRefStructure;
import uk.org.siri.siri.AnnotatedLineStructure;
import uk.org.siri.siri.AnnotatedStopPointStructure;
import uk.org.siri.siri.BlockRefStructure;
import uk.org.siri.siri.CapabilityRefStructure;
import uk.org.siri.siri.ClearDownRefStructure;
import uk.org.siri.siri.ConnectionLinkRefStructure;
import uk.org.siri.siri.CourseOfJourneyRefStructure;
import uk.org.siri.siri.DataFrameRefStructure;
import uk.org.siri.siri.DatedVehicleJourneyRefStructure;
import uk.org.siri.siri.DestinationRefStructure;
import uk.org.siri.siri.DirectionRefStructure;
import uk.org.siri.siri.DriverRefStructure;
import uk.org.siri.siri.EntryQualifierStructure;
import uk.org.siri.siri.ErrorDescriptionStructure;
import uk.org.siri.siri.FacilityRefStructure;
import uk.org.siri.siri.FeatureRefStructure;
import uk.org.siri.siri.GroupOfLinesRefStructure;
import uk.org.siri.siri.InfoChannelRefStructure;
import uk.org.siri.siri.InfoMessageRefStructure;
import uk.org.siri.siri.InterchangeRefStructure;
import uk.org.siri.siri.ItemRefStructure;
import uk.org.siri.siri.JourneyPartRefStructure;
import uk.org.siri.siri.JourneyPatternRefStructure;
import uk.org.siri.siri.JourneyPlaceRefStructure;
import uk.org.siri.siri.LineRefStructure;
import uk.org.siri.siri.MessageQualifierStructure;
import uk.org.siri.siri.MonitoringRefStructure;
import uk.org.siri.siri.NetworkRefStructure;
import uk.org.siri.siri.OperatorRefStructure;
import uk.org.siri.siri.OrganisationRefStructure;
import uk.org.siri.siri.ParticipantRefStructure;
import uk.org.siri.siri.ProductCategoryRefStructure;
import uk.org.siri.siri.PtSituationElementStructure;
import uk.org.siri.siri.QuayRefStructure;
import uk.org.siri.siri.RouteLinkRefStructure;
import uk.org.siri.siri.RouteRefStructure;
import uk.org.siri.siri.SectionRefStructure;
import uk.org.siri.siri.ServiceFeatureRefStructure;
import uk.org.siri.siri.SituationSimpleRefStructure;
import uk.org.siri.siri.StopAreaRefStructure;
import uk.org.siri.siri.StopPointRefStructure;
import uk.org.siri.siri.SubscriptionFilterRefStructure;
import uk.org.siri.siri.SubscriptionFilterStructure;
import uk.org.siri.siri.SubscriptionQualifierStructure;
import uk.org.siri.siri.TrainNumberRefStructure;
import uk.org.siri.siri.TrainPartRefStructure;
import uk.org.siri.siri.VehicleFeatureRefStructure;
import uk.org.siri.siri.VehicleJourneyRefStructure;
import uk.org.siri.siri.VehicleMonitoringRefStructure;
import uk.org.siri.siri.VehicleRefStructure;
import uk.org.siri.siri.VersionRefStructure;
import uk.org.siri.siri.ZoneRefStructure;

public class SiriConstants {

	public static final List<Class<?>> classes = Arrays.asList(AdviceRefStructure.class, BlockRefStructure.class,
			CapabilityRefStructure.class, ClearDownRefStructure.class, ConnectionLinkRefStructure.class,
			CourseOfJourneyRefStructure.class, DataFrameRefStructure.class, DatedVehicleJourneyRefStructure.class,
			DestinationRefStructure.class, DirectionRefStructure.class, DriverRefStructure.class, EntryQualifierStructure.class,
			ErrorDescriptionStructure.class, FacilityRefStructure.class, FeatureRefStructure.class, GroupOfLinesRefStructure.class,
			InfoChannelRefStructure.class, InfoMessageRefStructure.class, InterchangeRefStructure.class, ItemRefStructure.class,
			JourneyPartRefStructure.class, JourneyPatternRefStructure.class, JourneyPlaceRefStructure.class, LineRefStructure.class,
			MessageQualifierStructure.class, MonitoringRefStructure.class, NetworkRefStructure.class, OperatorRefStructure.class,
			OrganisationRefStructure.class, ParticipantRefStructure.class, ProductCategoryRefStructure.class,
			QuayRefStructure.class, RouteLinkRefStructure.class, RouteRefStructure.class, SectionRefStructure.class,
			ServiceFeatureRefStructure.class, SituationSimpleRefStructure.class, StopAreaRefStructure.class,
			StopPointRefStructure.class, SubscriptionFilterRefStructure.class, SubscriptionFilterStructure.class,
			SubscriptionQualifierStructure.class, TrainNumberRefStructure.class, TrainPartRefStructure.class,
			VehicleFeatureRefStructure.class, VehicleJourneyRefStructure.class, VehicleMonitoringRefStructure.class,
			VehicleRefStructure.class, VersionRefStructure.class, ZoneRefStructure.class);

	public static final List<Class<?>> extensions = Arrays.asList(PtSituationElementStructure.class, AnnotatedLineStructure.class,
			AnnotatedStopPointStructure.class);
}
