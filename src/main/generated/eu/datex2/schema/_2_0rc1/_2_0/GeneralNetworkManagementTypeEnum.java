
package eu.datex2.schema._2_0rc1._2_0;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour GeneralNetworkManagementTypeEnum.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * <p>
 * <pre>
 * &lt;simpleType name="GeneralNetworkManagementTypeEnum">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="bridgeSwingInOperation"/>
 *     &lt;enumeration value="convoyService"/>
 *     &lt;enumeration value="obstacleSignalling"/>
 *     &lt;enumeration value="rampMeteringInOperation"/>
 *     &lt;enumeration value="temporaryTrafficLights"/>
 *     &lt;enumeration value="tollGatesOpen"/>
 *     &lt;enumeration value="trafficBeingManuallyDirected"/>
 *     &lt;enumeration value="trafficHeld"/>
 *     &lt;enumeration value="other"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "GeneralNetworkManagementTypeEnum")
@XmlEnum
public enum GeneralNetworkManagementTypeEnum {

    @XmlEnumValue("bridgeSwingInOperation")
    BRIDGE_SWING_IN_OPERATION("bridgeSwingInOperation"),
    @XmlEnumValue("convoyService")
    CONVOY_SERVICE("convoyService"),
    @XmlEnumValue("obstacleSignalling")
    OBSTACLE_SIGNALLING("obstacleSignalling"),
    @XmlEnumValue("rampMeteringInOperation")
    RAMP_METERING_IN_OPERATION("rampMeteringInOperation"),
    @XmlEnumValue("temporaryTrafficLights")
    TEMPORARY_TRAFFIC_LIGHTS("temporaryTrafficLights"),
    @XmlEnumValue("tollGatesOpen")
    TOLL_GATES_OPEN("tollGatesOpen"),
    @XmlEnumValue("trafficBeingManuallyDirected")
    TRAFFIC_BEING_MANUALLY_DIRECTED("trafficBeingManuallyDirected"),
    @XmlEnumValue("trafficHeld")
    TRAFFIC_HELD("trafficHeld"),
    @XmlEnumValue("other")
    OTHER("other");
    private final String value;

    GeneralNetworkManagementTypeEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static GeneralNetworkManagementTypeEnum fromValue(String v) {
        for (GeneralNetworkManagementTypeEnum c: GeneralNetworkManagementTypeEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
