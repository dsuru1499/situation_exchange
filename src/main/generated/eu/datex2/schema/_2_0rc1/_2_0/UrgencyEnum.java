
package eu.datex2.schema._2_0rc1._2_0;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour UrgencyEnum.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * <p>
 * <pre>
 * &lt;simpleType name="UrgencyEnum">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="extremelyUrgent"/>
 *     &lt;enumeration value="urgent"/>
 *     &lt;enumeration value="normalUrgency"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "UrgencyEnum")
@XmlEnum
public enum UrgencyEnum {

    @XmlEnumValue("extremelyUrgent")
    EXTREMELY_URGENT("extremelyUrgent"),
    @XmlEnumValue("urgent")
    URGENT("urgent"),
    @XmlEnumValue("normalUrgency")
    NORMAL_URGENCY("normalUrgency");
    private final String value;

    UrgencyEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static UrgencyEnum fromValue(String v) {
        for (UrgencyEnum c: UrgencyEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
