
package uk.org.siri.siri;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour PredictabilityEnumeration.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * <p>
 * <pre>
 * &lt;simpleType name="PredictabilityEnumeration">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN">
 *     &lt;enumeration value="planned"/>
 *     &lt;enumeration value="unplanned"/>
 *     &lt;enumeration value="all"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "PredictabilityEnumeration")
@XmlEnum
public enum PredictabilityEnumeration {

    @XmlEnumValue("planned")
    PLANNED("planned"),
    @XmlEnumValue("unplanned")
    UNPLANNED("unplanned"),
    @XmlEnumValue("all")
    ALL("all");
    private final String value;

    PredictabilityEnumeration(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static PredictabilityEnumeration fromValue(String v) {
        for (PredictabilityEnumeration c: PredictabilityEnumeration.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
