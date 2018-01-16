
package uk.org.ifopt.acsb;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour AccessibilityEnumeration.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * <p>
 * <pre>
 * &lt;simpleType name="AccessibilityEnumeration">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="unknown"/>
 *     &lt;enumeration value="false"/>
 *     &lt;enumeration value="true"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "AccessibilityEnumeration")
@XmlEnum
public enum AccessibilityEnumeration {

    @XmlEnumValue("unknown")
    UNKNOWN("unknown"),
    @XmlEnumValue("false")
    FALSE("false"),
    @XmlEnumValue("true")
    TRUE("true");
    private final String value;

    AccessibilityEnumeration(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static AccessibilityEnumeration fromValue(String v) {
        for (AccessibilityEnumeration c: AccessibilityEnumeration.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
