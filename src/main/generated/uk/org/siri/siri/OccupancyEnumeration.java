
package uk.org.siri.siri;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour OccupancyEnumeration.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * <p>
 * <pre>
 * &lt;simpleType name="OccupancyEnumeration">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN">
 *     &lt;enumeration value="full"/>
 *     &lt;enumeration value="seatsAvailable"/>
 *     &lt;enumeration value="standingAvailable"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "OccupancyEnumeration")
@XmlEnum
public enum OccupancyEnumeration {

    @XmlEnumValue("full")
    FULL("full"),
    @XmlEnumValue("seatsAvailable")
    SEATS_AVAILABLE("seatsAvailable"),
    @XmlEnumValue("standingAvailable")
    STANDING_AVAILABLE("standingAvailable");
    private final String value;

    OccupancyEnumeration(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static OccupancyEnumeration fromValue(String v) {
        for (OccupancyEnumeration c: OccupancyEnumeration.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
