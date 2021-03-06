
package uk.org.siri.siri;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour StopPointsDetailEnumeration.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * <p>
 * <pre>
 * &lt;simpleType name="StopPointsDetailEnumeration">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN">
 *     &lt;enumeration value="minimum"/>
 *     &lt;enumeration value="normal"/>
 *     &lt;enumeration value="full"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "StopPointsDetailEnumeration")
@XmlEnum
public enum StopPointsDetailEnumeration {


    /**
     * Return only the name and identifier of the stop.
     * 
     */
    @XmlEnumValue("minimum")
    MINIMUM("minimum"),

    /**
     * Return name, dientifier and coordinates of the stop.
     * 
     */
    @XmlEnumValue("normal")
    NORMAL("normal"),

    /**
     * Return all available data for each stop.
     * 
     */
    @XmlEnumValue("full")
    FULL("full");
    private final String value;

    StopPointsDetailEnumeration(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static StopPointsDetailEnumeration fromValue(String v) {
        for (StopPointsDetailEnumeration c: StopPointsDetailEnumeration.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
