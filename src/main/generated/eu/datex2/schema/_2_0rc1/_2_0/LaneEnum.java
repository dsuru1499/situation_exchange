
package eu.datex2.schema._2_0rc1._2_0;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour LaneEnum.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * <p>
 * <pre>
 * &lt;simpleType name="LaneEnum">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="allLanesCompleteCarriageway"/>
 *     &lt;enumeration value="busLane"/>
 *     &lt;enumeration value="busStop"/>
 *     &lt;enumeration value="carPoolLane"/>
 *     &lt;enumeration value="centralReservation"/>
 *     &lt;enumeration value="crawlerLane"/>
 *     &lt;enumeration value="emergencyLane"/>
 *     &lt;enumeration value="escapeLane"/>
 *     &lt;enumeration value="expressLane"/>
 *     &lt;enumeration value="hardShoulder"/>
 *     &lt;enumeration value="heavyVehicleLane"/>
 *     &lt;enumeration value="lane1"/>
 *     &lt;enumeration value="lane2"/>
 *     &lt;enumeration value="lane3"/>
 *     &lt;enumeration value="lane4"/>
 *     &lt;enumeration value="lane5"/>
 *     &lt;enumeration value="lane6"/>
 *     &lt;enumeration value="lane7"/>
 *     &lt;enumeration value="lane8"/>
 *     &lt;enumeration value="lane9"/>
 *     &lt;enumeration value="layBy"/>
 *     &lt;enumeration value="leftHandTurningLane"/>
 *     &lt;enumeration value="leftLane"/>
 *     &lt;enumeration value="localTrafficLane"/>
 *     &lt;enumeration value="middleLane"/>
 *     &lt;enumeration value="opposingLanes"/>
 *     &lt;enumeration value="overtakingLane"/>
 *     &lt;enumeration value="rightHandTurningLane"/>
 *     &lt;enumeration value="rightLane"/>
 *     &lt;enumeration value="rushHourLane"/>
 *     &lt;enumeration value="setDownArea"/>
 *     &lt;enumeration value="slowVehicleLane"/>
 *     &lt;enumeration value="throughTrafficLane"/>
 *     &lt;enumeration value="tidalFlowLane"/>
 *     &lt;enumeration value="turningLane"/>
 *     &lt;enumeration value="verge"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "LaneEnum")
@XmlEnum
public enum LaneEnum {

    @XmlEnumValue("allLanesCompleteCarriageway")
    ALL_LANES_COMPLETE_CARRIAGEWAY("allLanesCompleteCarriageway"),
    @XmlEnumValue("busLane")
    BUS_LANE("busLane"),
    @XmlEnumValue("busStop")
    BUS_STOP("busStop"),
    @XmlEnumValue("carPoolLane")
    CAR_POOL_LANE("carPoolLane"),
    @XmlEnumValue("centralReservation")
    CENTRAL_RESERVATION("centralReservation"),
    @XmlEnumValue("crawlerLane")
    CRAWLER_LANE("crawlerLane"),
    @XmlEnumValue("emergencyLane")
    EMERGENCY_LANE("emergencyLane"),
    @XmlEnumValue("escapeLane")
    ESCAPE_LANE("escapeLane"),
    @XmlEnumValue("expressLane")
    EXPRESS_LANE("expressLane"),
    @XmlEnumValue("hardShoulder")
    HARD_SHOULDER("hardShoulder"),
    @XmlEnumValue("heavyVehicleLane")
    HEAVY_VEHICLE_LANE("heavyVehicleLane"),
    @XmlEnumValue("lane1")
    LANE_1("lane1"),
    @XmlEnumValue("lane2")
    LANE_2("lane2"),
    @XmlEnumValue("lane3")
    LANE_3("lane3"),
    @XmlEnumValue("lane4")
    LANE_4("lane4"),
    @XmlEnumValue("lane5")
    LANE_5("lane5"),
    @XmlEnumValue("lane6")
    LANE_6("lane6"),
    @XmlEnumValue("lane7")
    LANE_7("lane7"),
    @XmlEnumValue("lane8")
    LANE_8("lane8"),
    @XmlEnumValue("lane9")
    LANE_9("lane9"),
    @XmlEnumValue("layBy")
    LAY_BY("layBy"),
    @XmlEnumValue("leftHandTurningLane")
    LEFT_HAND_TURNING_LANE("leftHandTurningLane"),
    @XmlEnumValue("leftLane")
    LEFT_LANE("leftLane"),
    @XmlEnumValue("localTrafficLane")
    LOCAL_TRAFFIC_LANE("localTrafficLane"),
    @XmlEnumValue("middleLane")
    MIDDLE_LANE("middleLane"),
    @XmlEnumValue("opposingLanes")
    OPPOSING_LANES("opposingLanes"),
    @XmlEnumValue("overtakingLane")
    OVERTAKING_LANE("overtakingLane"),
    @XmlEnumValue("rightHandTurningLane")
    RIGHT_HAND_TURNING_LANE("rightHandTurningLane"),
    @XmlEnumValue("rightLane")
    RIGHT_LANE("rightLane"),
    @XmlEnumValue("rushHourLane")
    RUSH_HOUR_LANE("rushHourLane"),
    @XmlEnumValue("setDownArea")
    SET_DOWN_AREA("setDownArea"),
    @XmlEnumValue("slowVehicleLane")
    SLOW_VEHICLE_LANE("slowVehicleLane"),
    @XmlEnumValue("throughTrafficLane")
    THROUGH_TRAFFIC_LANE("throughTrafficLane"),
    @XmlEnumValue("tidalFlowLane")
    TIDAL_FLOW_LANE("tidalFlowLane"),
    @XmlEnumValue("turningLane")
    TURNING_LANE("turningLane"),
    @XmlEnumValue("verge")
    VERGE("verge");
    private final String value;

    LaneEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static LaneEnum fromValue(String v) {
        for (LaneEnum c: LaneEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
