
package eu.datex2.schema._2_0rc1._2_0;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour PrecipitationTypeEnum.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * <p>
 * <pre>
 * &lt;simpleType name="PrecipitationTypeEnum">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="drizzle"/>
 *     &lt;enumeration value="freezingRain"/>
 *     &lt;enumeration value="hail"/>
 *     &lt;enumeration value="rain"/>
 *     &lt;enumeration value="sleet"/>
 *     &lt;enumeration value="snow"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "PrecipitationTypeEnum")
@XmlEnum
public enum PrecipitationTypeEnum {

    @XmlEnumValue("drizzle")
    DRIZZLE("drizzle"),
    @XmlEnumValue("freezingRain")
    FREEZING_RAIN("freezingRain"),
    @XmlEnumValue("hail")
    HAIL("hail"),
    @XmlEnumValue("rain")
    RAIN("rain"),
    @XmlEnumValue("sleet")
    SLEET("sleet"),
    @XmlEnumValue("snow")
    SNOW("snow");
    private final String value;

    PrecipitationTypeEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static PrecipitationTypeEnum fromValue(String v) {
        for (PrecipitationTypeEnum c: PrecipitationTypeEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
