
package eu.datex2.schema._2_0rc1._2_0;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour RoadOperatorServiceDisruptionTypeEnum.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * <p>
 * <pre>
 * &lt;simpleType name="RoadOperatorServiceDisruptionTypeEnum">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="emergencyTelephoneNumberOutOfService"/>
 *     &lt;enumeration value="informationServiceTelephoneNumberOutOfService"/>
 *     &lt;enumeration value="noTrafficOfficerPatrolService"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "RoadOperatorServiceDisruptionTypeEnum")
@XmlEnum
public enum RoadOperatorServiceDisruptionTypeEnum {

    @XmlEnumValue("emergencyTelephoneNumberOutOfService")
    EMERGENCY_TELEPHONE_NUMBER_OUT_OF_SERVICE("emergencyTelephoneNumberOutOfService"),
    @XmlEnumValue("informationServiceTelephoneNumberOutOfService")
    INFORMATION_SERVICE_TELEPHONE_NUMBER_OUT_OF_SERVICE("informationServiceTelephoneNumberOutOfService"),
    @XmlEnumValue("noTrafficOfficerPatrolService")
    NO_TRAFFIC_OFFICER_PATROL_SERVICE("noTrafficOfficerPatrolService");
    private final String value;

    RoadOperatorServiceDisruptionTypeEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static RoadOperatorServiceDisruptionTypeEnum fromValue(String v) {
        for (RoadOperatorServiceDisruptionTypeEnum c: RoadOperatorServiceDisruptionTypeEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
