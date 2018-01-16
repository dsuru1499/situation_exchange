
package eu.datex2.schema._2_0rc1._2_0;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour InjuryStatusTypeEnum.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * <p>
 * <pre>
 * &lt;simpleType name="InjuryStatusTypeEnum">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="dead"/>
 *     &lt;enumeration value="injured"/>
 *     &lt;enumeration value="seriouslyInjured"/>
 *     &lt;enumeration value="slightlyInjured"/>
 *     &lt;enumeration value="uninjured"/>
 *     &lt;enumeration value="unknown"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "InjuryStatusTypeEnum")
@XmlEnum
public enum InjuryStatusTypeEnum {

    @XmlEnumValue("dead")
    DEAD("dead"),
    @XmlEnumValue("injured")
    INJURED("injured"),
    @XmlEnumValue("seriouslyInjured")
    SERIOUSLY_INJURED("seriouslyInjured"),
    @XmlEnumValue("slightlyInjured")
    SLIGHTLY_INJURED("slightlyInjured"),
    @XmlEnumValue("uninjured")
    UNINJURED("uninjured"),
    @XmlEnumValue("unknown")
    UNKNOWN("unknown");
    private final String value;

    InjuryStatusTypeEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static InjuryStatusTypeEnum fromValue(String v) {
        for (InjuryStatusTypeEnum c: InjuryStatusTypeEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
