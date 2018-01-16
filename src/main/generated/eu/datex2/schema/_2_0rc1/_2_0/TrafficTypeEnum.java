
package eu.datex2.schema._2_0rc1._2_0;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour TrafficTypeEnum.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * <p>
 * <pre>
 * &lt;simpleType name="TrafficTypeEnum">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="accessOnlyTraffic"/>
 *     &lt;enumeration value="destinedForAirport"/>
 *     &lt;enumeration value="destinedForAirportArrivals"/>
 *     &lt;enumeration value="destinedForAirportDepartures"/>
 *     &lt;enumeration value="destinedForFerryService"/>
 *     &lt;enumeration value="destinedForRailService"/>
 *     &lt;enumeration value="holidayTraffic"/>
 *     &lt;enumeration value="localTraffic"/>
 *     &lt;enumeration value="longDistanceTraffic"/>
 *     &lt;enumeration value="regionalTraffic"/>
 *     &lt;enumeration value="residentsOnlyTraffic"/>
 *     &lt;enumeration value="throughTraffic"/>
 *     &lt;enumeration value="visitorTraffic"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "TrafficTypeEnum")
@XmlEnum
public enum TrafficTypeEnum {

    @XmlEnumValue("accessOnlyTraffic")
    ACCESS_ONLY_TRAFFIC("accessOnlyTraffic"),
    @XmlEnumValue("destinedForAirport")
    DESTINED_FOR_AIRPORT("destinedForAirport"),
    @XmlEnumValue("destinedForAirportArrivals")
    DESTINED_FOR_AIRPORT_ARRIVALS("destinedForAirportArrivals"),
    @XmlEnumValue("destinedForAirportDepartures")
    DESTINED_FOR_AIRPORT_DEPARTURES("destinedForAirportDepartures"),
    @XmlEnumValue("destinedForFerryService")
    DESTINED_FOR_FERRY_SERVICE("destinedForFerryService"),
    @XmlEnumValue("destinedForRailService")
    DESTINED_FOR_RAIL_SERVICE("destinedForRailService"),
    @XmlEnumValue("holidayTraffic")
    HOLIDAY_TRAFFIC("holidayTraffic"),
    @XmlEnumValue("localTraffic")
    LOCAL_TRAFFIC("localTraffic"),
    @XmlEnumValue("longDistanceTraffic")
    LONG_DISTANCE_TRAFFIC("longDistanceTraffic"),
    @XmlEnumValue("regionalTraffic")
    REGIONAL_TRAFFIC("regionalTraffic"),
    @XmlEnumValue("residentsOnlyTraffic")
    RESIDENTS_ONLY_TRAFFIC("residentsOnlyTraffic"),
    @XmlEnumValue("throughTraffic")
    THROUGH_TRAFFIC("throughTraffic"),
    @XmlEnumValue("visitorTraffic")
    VISITOR_TRAFFIC("visitorTraffic");
    private final String value;

    TrafficTypeEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TrafficTypeEnum fromValue(String v) {
        for (TrafficTypeEnum c: TrafficTypeEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
