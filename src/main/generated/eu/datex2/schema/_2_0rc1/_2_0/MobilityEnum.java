
package eu.datex2.schema._2_0rc1._2_0;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour MobilityEnum.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * <p>
 * <pre>
 * &lt;simpleType name="MobilityEnum">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="mobile"/>
 *     &lt;enumeration value="stationary"/>
 *     &lt;enumeration value="unknown"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "MobilityEnum")
@XmlEnum
public enum MobilityEnum {

    @XmlEnumValue("mobile")
    MOBILE("mobile"),
    @XmlEnumValue("stationary")
    STATIONARY("stationary"),
    @XmlEnumValue("unknown")
    UNKNOWN("unknown");
    private final String value;

    MobilityEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static MobilityEnum fromValue(String v) {
        for (MobilityEnum c: MobilityEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
