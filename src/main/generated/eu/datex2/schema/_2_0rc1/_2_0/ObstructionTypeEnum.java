
package eu.datex2.schema._2_0rc1._2_0;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour ObstructionTypeEnum.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * <p>
 * <pre>
 * &lt;simpleType name="ObstructionTypeEnum">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="airCrash"/>
 *     &lt;enumeration value="childrenOnRoadway"/>
 *     &lt;enumeration value="clearanceWork"/>
 *     &lt;enumeration value="craneOperating"/>
 *     &lt;enumeration value="cyclistsOnRoadway"/>
 *     &lt;enumeration value="debris"/>
 *     &lt;enumeration value="explosion"/>
 *     &lt;enumeration value="explosionHazard"/>
 *     &lt;enumeration value="hazardsOnTheRoad"/>
 *     &lt;enumeration value="highSpeedChase"/>
 *     &lt;enumeration value="houseFire"/>
 *     &lt;enumeration value="incident"/>
 *     &lt;enumeration value="industrialAccident"/>
 *     &lt;enumeration value="objectOnTheRoad"/>
 *     &lt;enumeration value="objectsFallingFromMovingVehicle"/>
 *     &lt;enumeration value="obstructionOnTheRoad"/>
 *     &lt;enumeration value="peopleOnRoadway"/>
 *     &lt;enumeration value="railCrash"/>
 *     &lt;enumeration value="recklessDriver"/>
 *     &lt;enumeration value="rescueAndRecoveryWork"/>
 *     &lt;enumeration value="severeFrostDamagedRoadway"/>
 *     &lt;enumeration value="shedLoad"/>
 *     &lt;enumeration value="snowAndIceDebris"/>
 *     &lt;enumeration value="spillageOccurringFromMovingVehicle"/>
 *     &lt;enumeration value="spillageOnTheRoad"/>
 *     &lt;enumeration value="unprotectedAccidentArea"/>
 *     &lt;enumeration value="other"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ObstructionTypeEnum")
@XmlEnum
public enum ObstructionTypeEnum {

    @XmlEnumValue("airCrash")
    AIR_CRASH("airCrash"),
    @XmlEnumValue("childrenOnRoadway")
    CHILDREN_ON_ROADWAY("childrenOnRoadway"),
    @XmlEnumValue("clearanceWork")
    CLEARANCE_WORK("clearanceWork"),
    @XmlEnumValue("craneOperating")
    CRANE_OPERATING("craneOperating"),
    @XmlEnumValue("cyclistsOnRoadway")
    CYCLISTS_ON_ROADWAY("cyclistsOnRoadway"),
    @XmlEnumValue("debris")
    DEBRIS("debris"),
    @XmlEnumValue("explosion")
    EXPLOSION("explosion"),
    @XmlEnumValue("explosionHazard")
    EXPLOSION_HAZARD("explosionHazard"),
    @XmlEnumValue("hazardsOnTheRoad")
    HAZARDS_ON_THE_ROAD("hazardsOnTheRoad"),
    @XmlEnumValue("highSpeedChase")
    HIGH_SPEED_CHASE("highSpeedChase"),
    @XmlEnumValue("houseFire")
    HOUSE_FIRE("houseFire"),
    @XmlEnumValue("incident")
    INCIDENT("incident"),
    @XmlEnumValue("industrialAccident")
    INDUSTRIAL_ACCIDENT("industrialAccident"),
    @XmlEnumValue("objectOnTheRoad")
    OBJECT_ON_THE_ROAD("objectOnTheRoad"),
    @XmlEnumValue("objectsFallingFromMovingVehicle")
    OBJECTS_FALLING_FROM_MOVING_VEHICLE("objectsFallingFromMovingVehicle"),
    @XmlEnumValue("obstructionOnTheRoad")
    OBSTRUCTION_ON_THE_ROAD("obstructionOnTheRoad"),
    @XmlEnumValue("peopleOnRoadway")
    PEOPLE_ON_ROADWAY("peopleOnRoadway"),
    @XmlEnumValue("railCrash")
    RAIL_CRASH("railCrash"),
    @XmlEnumValue("recklessDriver")
    RECKLESS_DRIVER("recklessDriver"),
    @XmlEnumValue("rescueAndRecoveryWork")
    RESCUE_AND_RECOVERY_WORK("rescueAndRecoveryWork"),
    @XmlEnumValue("severeFrostDamagedRoadway")
    SEVERE_FROST_DAMAGED_ROADWAY("severeFrostDamagedRoadway"),
    @XmlEnumValue("shedLoad")
    SHED_LOAD("shedLoad"),
    @XmlEnumValue("snowAndIceDebris")
    SNOW_AND_ICE_DEBRIS("snowAndIceDebris"),
    @XmlEnumValue("spillageOccurringFromMovingVehicle")
    SPILLAGE_OCCURRING_FROM_MOVING_VEHICLE("spillageOccurringFromMovingVehicle"),
    @XmlEnumValue("spillageOnTheRoad")
    SPILLAGE_ON_THE_ROAD("spillageOnTheRoad"),
    @XmlEnumValue("unprotectedAccidentArea")
    UNPROTECTED_ACCIDENT_AREA("unprotectedAccidentArea"),
    @XmlEnumValue("other")
    OTHER("other");
    private final String value;

    ObstructionTypeEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ObstructionTypeEnum fromValue(String v) {
        for (ObstructionTypeEnum c: ObstructionTypeEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
