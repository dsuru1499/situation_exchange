
package uk.org.ifopt.ifopt;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour CheckPointServiceEnumeration.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * <p>
 * <pre>
 * &lt;simpleType name="CheckPointServiceEnumeration">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="selfserviceMachine"/>
 *     &lt;enumeration value="counterService"/>
 *     &lt;enumeration value="other"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "CheckPointServiceEnumeration")
@XmlEnum
public enum CheckPointServiceEnumeration {

    @XmlEnumValue("selfserviceMachine")
    SELFSERVICE_MACHINE("selfserviceMachine"),
    @XmlEnumValue("counterService")
    COUNTER_SERVICE("counterService"),
    @XmlEnumValue("other")
    OTHER("other");
    private final String value;

    CheckPointServiceEnumeration(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static CheckPointServiceEnumeration fromValue(String v) {
        for (CheckPointServiceEnumeration c: CheckPointServiceEnumeration.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
