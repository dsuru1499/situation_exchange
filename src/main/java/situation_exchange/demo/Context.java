package situation_exchange.demo;

import java.util.Set;

import gtfs.model.Agency;
import gtfs.model.Calendar;
import gtfs.model.CalendarDate;
import gtfs.model.Route;
import gtfs.model.Stop;
import gtfs.model.StopTime;
import gtfs.model.Trip;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
public class Context {

	Agency agency;
	Calendar calendar;
	CalendarDate calendarDate;
	Route route;
	Trip trip;
	StopTime stopTime;
	Stop stop;

	String originRef;
	String originName;
	long originAimedDepartureTime;
	String destinationRef;
	String destinationName;
	long destinationAimedArrivalTime;
	String originDisplay;
	String destinationDisplay;

	Set<String> lineRefs;
	Set<AnnotatedLineDestination> destinations;

	@Data
	@AllArgsConstructor
	public class AnnotatedLineDestination {
		String DestinationRef;
		String PlaceName;
	}
}
