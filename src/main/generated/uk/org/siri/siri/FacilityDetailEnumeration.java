
package uk.org.siri.siri;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour FacilityDetailEnumeration.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * <p>
 * <pre>
 * &lt;simpleType name="FacilityDetailEnumeration">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN">
 *     &lt;enumeration value="minimum"/>
 *     &lt;enumeration value="normal"/>
 *     &lt;enumeration value="full"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "FacilityDetailEnumeration")
@XmlEnum
public enum FacilityDetailEnumeration {


    /**
     * Return only the name and identifier of the Facility.
     * 
     */
    @XmlEnumValue("minimum")
    MINIMUM("minimum"),

    /**
     * Return name, identifier and coordinates of the Facility.
     * 
     */
    @XmlEnumValue("normal")
    NORMAL("normal"),

    /**
     * Return all available data for each Facility.
     * 
     */
    @XmlEnumValue("full")
    FULL("full");
    private final String value;

    FacilityDetailEnumeration(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static FacilityDetailEnumeration fromValue(String v) {
        for (FacilityDetailEnumeration c: FacilityDetailEnumeration.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
