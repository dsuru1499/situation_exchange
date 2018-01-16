
package eu.datex2.schema._2_0rc1._2_0;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour TpegLoc03OtherPointDescriptorSubtypeEnum.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * <p>
 * <pre>
 * &lt;simpleType name="TpegLoc03OtherPointDescriptorSubtypeEnum">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="administrativeAreaName"/>
 *     &lt;enumeration value="administrativeReferenceName"/>
 *     &lt;enumeration value="airportName"/>
 *     &lt;enumeration value="areaName"/>
 *     &lt;enumeration value="buildingName"/>
 *     &lt;enumeration value="busStopIdentifier"/>
 *     &lt;enumeration value="busStopName"/>
 *     &lt;enumeration value="canalName"/>
 *     &lt;enumeration value="countyName"/>
 *     &lt;enumeration value="ferryPortName"/>
 *     &lt;enumeration value="intersectionName"/>
 *     &lt;enumeration value="lakeName"/>
 *     &lt;enumeration value="linkName"/>
 *     &lt;enumeration value="localLinkName"/>
 *     &lt;enumeration value="metroStationName"/>
 *     &lt;enumeration value="nationName"/>
 *     &lt;enumeration value="nonLinkedPointName"/>
 *     &lt;enumeration value="parkingFacilityName"/>
 *     &lt;enumeration value="pointName"/>
 *     &lt;enumeration value="pointOfInterestName"/>
 *     &lt;enumeration value="railwayStation"/>
 *     &lt;enumeration value="regionName"/>
 *     &lt;enumeration value="riverName"/>
 *     &lt;enumeration value="seaName"/>
 *     &lt;enumeration value="serviceAreaName"/>
 *     &lt;enumeration value="tidalRiverName"/>
 *     &lt;enumeration value="townName"/>
 *     &lt;enumeration value="other"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "TpegLoc03OtherPointDescriptorSubtypeEnum")
@XmlEnum
public enum TpegLoc03OtherPointDescriptorSubtypeEnum {

    @XmlEnumValue("administrativeAreaName")
    ADMINISTRATIVE_AREA_NAME("administrativeAreaName"),
    @XmlEnumValue("administrativeReferenceName")
    ADMINISTRATIVE_REFERENCE_NAME("administrativeReferenceName"),
    @XmlEnumValue("airportName")
    AIRPORT_NAME("airportName"),
    @XmlEnumValue("areaName")
    AREA_NAME("areaName"),
    @XmlEnumValue("buildingName")
    BUILDING_NAME("buildingName"),
    @XmlEnumValue("busStopIdentifier")
    BUS_STOP_IDENTIFIER("busStopIdentifier"),
    @XmlEnumValue("busStopName")
    BUS_STOP_NAME("busStopName"),
    @XmlEnumValue("canalName")
    CANAL_NAME("canalName"),
    @XmlEnumValue("countyName")
    COUNTY_NAME("countyName"),
    @XmlEnumValue("ferryPortName")
    FERRY_PORT_NAME("ferryPortName"),
    @XmlEnumValue("intersectionName")
    INTERSECTION_NAME("intersectionName"),
    @XmlEnumValue("lakeName")
    LAKE_NAME("lakeName"),
    @XmlEnumValue("linkName")
    LINK_NAME("linkName"),
    @XmlEnumValue("localLinkName")
    LOCAL_LINK_NAME("localLinkName"),
    @XmlEnumValue("metroStationName")
    METRO_STATION_NAME("metroStationName"),
    @XmlEnumValue("nationName")
    NATION_NAME("nationName"),
    @XmlEnumValue("nonLinkedPointName")
    NON_LINKED_POINT_NAME("nonLinkedPointName"),
    @XmlEnumValue("parkingFacilityName")
    PARKING_FACILITY_NAME("parkingFacilityName"),
    @XmlEnumValue("pointName")
    POINT_NAME("pointName"),
    @XmlEnumValue("pointOfInterestName")
    POINT_OF_INTEREST_NAME("pointOfInterestName"),
    @XmlEnumValue("railwayStation")
    RAILWAY_STATION("railwayStation"),
    @XmlEnumValue("regionName")
    REGION_NAME("regionName"),
    @XmlEnumValue("riverName")
    RIVER_NAME("riverName"),
    @XmlEnumValue("seaName")
    SEA_NAME("seaName"),
    @XmlEnumValue("serviceAreaName")
    SERVICE_AREA_NAME("serviceAreaName"),
    @XmlEnumValue("tidalRiverName")
    TIDAL_RIVER_NAME("tidalRiverName"),
    @XmlEnumValue("townName")
    TOWN_NAME("townName"),
    @XmlEnumValue("other")
    OTHER("other");
    private final String value;

    TpegLoc03OtherPointDescriptorSubtypeEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TpegLoc03OtherPointDescriptorSubtypeEnum fromValue(String v) {
        for (TpegLoc03OtherPointDescriptorSubtypeEnum c: TpegLoc03OtherPointDescriptorSubtypeEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
