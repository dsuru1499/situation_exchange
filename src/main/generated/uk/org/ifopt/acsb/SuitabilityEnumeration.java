
package uk.org.ifopt.acsb;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour SuitabilityEnumeration.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * <p>
 * <pre>
 * &lt;simpleType name="SuitabilityEnumeration">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN">
 *     &lt;enumeration value="suitable"/>
 *     &lt;enumeration value="notSuitable"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "SuitabilityEnumeration")
@XmlEnum
public enum SuitabilityEnumeration {

    @XmlEnumValue("suitable")
    SUITABLE("suitable"),
    @XmlEnumValue("notSuitable")
    NOT_SUITABLE("notSuitable");
    private final String value;

    SuitabilityEnumeration(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static SuitabilityEnumeration fromValue(String v) {
        for (SuitabilityEnumeration c: SuitabilityEnumeration.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
