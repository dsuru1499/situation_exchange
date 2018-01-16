
package uk.org.ifopt.ifopt;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour StopPlaceTypeEnumeration.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * <p>
 * <pre>
 * &lt;simpleType name="StopPlaceTypeEnumeration">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="airport"/>
 *     &lt;enumeration value="railStation"/>
 *     &lt;enumeration value="metroStation"/>
 *     &lt;enumeration value="coachStation"/>
 *     &lt;enumeration value="busStation"/>
 *     &lt;enumeration value="harbourPort"/>
 *     &lt;enumeration value="ferrytPort"/>
 *     &lt;enumeration value="ferryStop"/>
 *     &lt;enumeration value="onStreetBus"/>
 *     &lt;enumeration value="onStreetTram"/>
 *     &lt;enumeration value="skiLift"/>
 *     &lt;enumeration value="other"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "StopPlaceTypeEnumeration")
@XmlEnum
public enum StopPlaceTypeEnumeration {

    @XmlEnumValue("airport")
    AIRPORT("airport"),
    @XmlEnumValue("railStation")
    RAIL_STATION("railStation"),
    @XmlEnumValue("metroStation")
    METRO_STATION("metroStation"),
    @XmlEnumValue("coachStation")
    COACH_STATION("coachStation"),
    @XmlEnumValue("busStation")
    BUS_STATION("busStation"),
    @XmlEnumValue("harbourPort")
    HARBOUR_PORT("harbourPort"),
    @XmlEnumValue("ferrytPort")
    FERRYT_PORT("ferrytPort"),
    @XmlEnumValue("ferryStop")
    FERRY_STOP("ferryStop"),
    @XmlEnumValue("onStreetBus")
    ON_STREET_BUS("onStreetBus"),
    @XmlEnumValue("onStreetTram")
    ON_STREET_TRAM("onStreetTram"),
    @XmlEnumValue("skiLift")
    SKI_LIFT("skiLift"),
    @XmlEnumValue("other")
    OTHER("other");
    private final String value;

    StopPlaceTypeEnumeration(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static StopPlaceTypeEnumeration fromValue(String v) {
        for (StopPlaceTypeEnumeration c: StopPlaceTypeEnumeration.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
