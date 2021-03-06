
package eu.datex2.schema._2_0rc1._2_0;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour EquipmentOrSystemTypeEnum.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * <p>
 * <pre>
 * &lt;simpleType name="EquipmentOrSystemTypeEnum">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="automatedTollSystem"/>
 *     &lt;enumeration value="emergencyRoadsideTelephones"/>
 *     &lt;enumeration value="galleryLights"/>
 *     &lt;enumeration value="laneControlSigns"/>
 *     &lt;enumeration value="levelCrossing"/>
 *     &lt;enumeration value="matrixSigns"/>
 *     &lt;enumeration value="rampControls"/>
 *     &lt;enumeration value="roadsideCommunicationsSystem"/>
 *     &lt;enumeration value="roadsidePowerSystem"/>
 *     &lt;enumeration value="speedControlSigns"/>
 *     &lt;enumeration value="streetLighting"/>
 *     &lt;enumeration value="temporaryTrafficLights"/>
 *     &lt;enumeration value="tollGates"/>
 *     &lt;enumeration value="trafficLightSets"/>
 *     &lt;enumeration value="trafficSignals"/>
 *     &lt;enumeration value="tunnelLights"/>
 *     &lt;enumeration value="tunnelVentilation"/>
 *     &lt;enumeration value="variableMessageSigns"/>
 *     &lt;enumeration value="other"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "EquipmentOrSystemTypeEnum")
@XmlEnum
public enum EquipmentOrSystemTypeEnum {

    @XmlEnumValue("automatedTollSystem")
    AUTOMATED_TOLL_SYSTEM("automatedTollSystem"),
    @XmlEnumValue("emergencyRoadsideTelephones")
    EMERGENCY_ROADSIDE_TELEPHONES("emergencyRoadsideTelephones"),
    @XmlEnumValue("galleryLights")
    GALLERY_LIGHTS("galleryLights"),
    @XmlEnumValue("laneControlSigns")
    LANE_CONTROL_SIGNS("laneControlSigns"),
    @XmlEnumValue("levelCrossing")
    LEVEL_CROSSING("levelCrossing"),
    @XmlEnumValue("matrixSigns")
    MATRIX_SIGNS("matrixSigns"),
    @XmlEnumValue("rampControls")
    RAMP_CONTROLS("rampControls"),
    @XmlEnumValue("roadsideCommunicationsSystem")
    ROADSIDE_COMMUNICATIONS_SYSTEM("roadsideCommunicationsSystem"),
    @XmlEnumValue("roadsidePowerSystem")
    ROADSIDE_POWER_SYSTEM("roadsidePowerSystem"),
    @XmlEnumValue("speedControlSigns")
    SPEED_CONTROL_SIGNS("speedControlSigns"),
    @XmlEnumValue("streetLighting")
    STREET_LIGHTING("streetLighting"),
    @XmlEnumValue("temporaryTrafficLights")
    TEMPORARY_TRAFFIC_LIGHTS("temporaryTrafficLights"),
    @XmlEnumValue("tollGates")
    TOLL_GATES("tollGates"),
    @XmlEnumValue("trafficLightSets")
    TRAFFIC_LIGHT_SETS("trafficLightSets"),
    @XmlEnumValue("trafficSignals")
    TRAFFIC_SIGNALS("trafficSignals"),
    @XmlEnumValue("tunnelLights")
    TUNNEL_LIGHTS("tunnelLights"),
    @XmlEnumValue("tunnelVentilation")
    TUNNEL_VENTILATION("tunnelVentilation"),
    @XmlEnumValue("variableMessageSigns")
    VARIABLE_MESSAGE_SIGNS("variableMessageSigns"),
    @XmlEnumValue("other")
    OTHER("other");
    private final String value;

    EquipmentOrSystemTypeEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static EquipmentOrSystemTypeEnum fromValue(String v) {
        for (EquipmentOrSystemTypeEnum c: EquipmentOrSystemTypeEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
