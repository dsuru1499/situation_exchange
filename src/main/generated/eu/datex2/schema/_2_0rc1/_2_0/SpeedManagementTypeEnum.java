
package eu.datex2.schema._2_0rc1._2_0;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour SpeedManagementTypeEnum.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * <p>
 * <pre>
 * &lt;simpleType name="SpeedManagementTypeEnum">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="activeSpeedControlInOperation"/>
 *     &lt;enumeration value="doNotSlowdownUnnecessarily"/>
 *     &lt;enumeration value="observeSpeedLimit"/>
 *     &lt;enumeration value="policeSpeedChecksInOperation"/>
 *     &lt;enumeration value="reduceYourSpeed"/>
 *     &lt;enumeration value="other"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "SpeedManagementTypeEnum")
@XmlEnum
public enum SpeedManagementTypeEnum {

    @XmlEnumValue("activeSpeedControlInOperation")
    ACTIVE_SPEED_CONTROL_IN_OPERATION("activeSpeedControlInOperation"),
    @XmlEnumValue("doNotSlowdownUnnecessarily")
    DO_NOT_SLOWDOWN_UNNECESSARILY("doNotSlowdownUnnecessarily"),
    @XmlEnumValue("observeSpeedLimit")
    OBSERVE_SPEED_LIMIT("observeSpeedLimit"),
    @XmlEnumValue("policeSpeedChecksInOperation")
    POLICE_SPEED_CHECKS_IN_OPERATION("policeSpeedChecksInOperation"),
    @XmlEnumValue("reduceYourSpeed")
    REDUCE_YOUR_SPEED("reduceYourSpeed"),
    @XmlEnumValue("other")
    OTHER("other");
    private final String value;

    SpeedManagementTypeEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static SpeedManagementTypeEnum fromValue(String v) {
        for (SpeedManagementTypeEnum c: SpeedManagementTypeEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
