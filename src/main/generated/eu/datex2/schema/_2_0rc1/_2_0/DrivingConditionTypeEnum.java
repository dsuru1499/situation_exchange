
package eu.datex2.schema._2_0rc1._2_0;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour DrivingConditionTypeEnum.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * <p>
 * <pre>
 * &lt;simpleType name="DrivingConditionTypeEnum">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="impossible"/>
 *     &lt;enumeration value="hazardous"/>
 *     &lt;enumeration value="normal"/>
 *     &lt;enumeration value="passableWithCare"/>
 *     &lt;enumeration value="unknown"/>
 *     &lt;enumeration value="veryHazardous"/>
 *     &lt;enumeration value="winterConditions"/>
 *     &lt;enumeration value="other"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "DrivingConditionTypeEnum")
@XmlEnum
public enum DrivingConditionTypeEnum {

    @XmlEnumValue("impossible")
    IMPOSSIBLE("impossible"),
    @XmlEnumValue("hazardous")
    HAZARDOUS("hazardous"),
    @XmlEnumValue("normal")
    NORMAL("normal"),
    @XmlEnumValue("passableWithCare")
    PASSABLE_WITH_CARE("passableWithCare"),
    @XmlEnumValue("unknown")
    UNKNOWN("unknown"),
    @XmlEnumValue("veryHazardous")
    VERY_HAZARDOUS("veryHazardous"),
    @XmlEnumValue("winterConditions")
    WINTER_CONDITIONS("winterConditions"),
    @XmlEnumValue("other")
    OTHER("other");
    private final String value;

    DrivingConditionTypeEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static DrivingConditionTypeEnum fromValue(String v) {
        for (DrivingConditionTypeEnum c: DrivingConditionTypeEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
