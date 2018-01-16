
package eu.datex2.schema._2_0rc1._2_0;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour OverallSeverityEnum.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * <p>
 * <pre>
 * &lt;simpleType name="OverallSeverityEnum">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="highest"/>
 *     &lt;enumeration value="high"/>
 *     &lt;enumeration value="medium"/>
 *     &lt;enumeration value="low"/>
 *     &lt;enumeration value="lowest"/>
 *     &lt;enumeration value="none"/>
 *     &lt;enumeration value="unknown"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "OverallSeverityEnum")
@XmlEnum
public enum OverallSeverityEnum {

    @XmlEnumValue("highest")
    HIGHEST("highest"),
    @XmlEnumValue("high")
    HIGH("high"),
    @XmlEnumValue("medium")
    MEDIUM("medium"),
    @XmlEnumValue("low")
    LOW("low"),
    @XmlEnumValue("lowest")
    LOWEST("lowest"),
    @XmlEnumValue("none")
    NONE("none"),
    @XmlEnumValue("unknown")
    UNKNOWN("unknown");
    private final String value;

    OverallSeverityEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static OverallSeverityEnum fromValue(String v) {
        for (OverallSeverityEnum c: OverallSeverityEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
