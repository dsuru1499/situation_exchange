
package eu.datex2.schema._2_0rc1._2_0;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour RoadsideAssistanceTypeEnum.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * <p>
 * <pre>
 * &lt;simpleType name="RoadsideAssistanceTypeEnum">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="airAmbulance"/>
 *     &lt;enumeration value="busPassengerAssistance"/>
 *     &lt;enumeration value="emergencyServices"/>
 *     &lt;enumeration value="firstAid"/>
 *     &lt;enumeration value="foodDelivery"/>
 *     &lt;enumeration value="helicopterRescue"/>
 *     &lt;enumeration value="vehicleRepair"/>
 *     &lt;enumeration value="vehicleRecovery"/>
 *     &lt;enumeration value="other"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "RoadsideAssistanceTypeEnum")
@XmlEnum
public enum RoadsideAssistanceTypeEnum {

    @XmlEnumValue("airAmbulance")
    AIR_AMBULANCE("airAmbulance"),
    @XmlEnumValue("busPassengerAssistance")
    BUS_PASSENGER_ASSISTANCE("busPassengerAssistance"),
    @XmlEnumValue("emergencyServices")
    EMERGENCY_SERVICES("emergencyServices"),
    @XmlEnumValue("firstAid")
    FIRST_AID("firstAid"),
    @XmlEnumValue("foodDelivery")
    FOOD_DELIVERY("foodDelivery"),
    @XmlEnumValue("helicopterRescue")
    HELICOPTER_RESCUE("helicopterRescue"),
    @XmlEnumValue("vehicleRepair")
    VEHICLE_REPAIR("vehicleRepair"),
    @XmlEnumValue("vehicleRecovery")
    VEHICLE_RECOVERY("vehicleRecovery"),
    @XmlEnumValue("other")
    OTHER("other");
    private final String value;

    RoadsideAssistanceTypeEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static RoadsideAssistanceTypeEnum fromValue(String v) {
        for (RoadsideAssistanceTypeEnum c: RoadsideAssistanceTypeEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}