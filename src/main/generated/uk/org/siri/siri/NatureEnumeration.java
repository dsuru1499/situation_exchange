
package uk.org.siri.siri;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour NatureEnumeration.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * <p>
 * <pre>
 * &lt;simpleType name="NatureEnumeration">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="plannedOnly"/>
 *     &lt;enumeration value="unplannedOnly"/>
 *     &lt;enumeration value="both"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "NatureEnumeration")
@XmlEnum
public enum NatureEnumeration {

    @XmlEnumValue("plannedOnly")
    PLANNED_ONLY("plannedOnly"),
    @XmlEnumValue("unplannedOnly")
    UNPLANNED_ONLY("unplannedOnly"),
    @XmlEnumValue("both")
    BOTH("both");
    private final String value;

    NatureEnumeration(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static NatureEnumeration fromValue(String v) {
        for (NatureEnumeration c: NatureEnumeration.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
