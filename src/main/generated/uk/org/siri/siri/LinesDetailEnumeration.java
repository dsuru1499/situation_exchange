
package uk.org.siri.siri;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour LinesDetailEnumeration.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * <p>
 * <pre>
 * &lt;simpleType name="LinesDetailEnumeration">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN">
 *     &lt;enumeration value="minimum"/>
 *     &lt;enumeration value="normal"/>
 *     &lt;enumeration value="stops"/>
 *     &lt;enumeration value="full"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "LinesDetailEnumeration")
@XmlEnum
public enum LinesDetailEnumeration {


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
    @XmlEnumValue("stops")
    STOPS("stops"),

    /**
     * Return all available data for each stop.
     * 
     */
    @XmlEnumValue("full")
    FULL("full");
    private final String value;

    LinesDetailEnumeration(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static LinesDetailEnumeration fromValue(String v) {
        for (LinesDetailEnumeration c: LinesDetailEnumeration.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
