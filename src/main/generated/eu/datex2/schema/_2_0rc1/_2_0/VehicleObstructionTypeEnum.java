
package eu.datex2.schema._2_0rc1._2_0;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour VehicleObstructionTypeEnum.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * <p>
 * <pre>
 * &lt;simpleType name="VehicleObstructionTypeEnum">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="abandonedVehicle"/>
 *     &lt;enumeration value="abnormalLoad"/>
 *     &lt;enumeration value="brokenDownBus"/>
 *     &lt;enumeration value="brokenDownHeavyLorry"/>
 *     &lt;enumeration value="brokenDownVehicle"/>
 *     &lt;enumeration value="convoy"/>
 *     &lt;enumeration value="damagedVehicle"/>
 *     &lt;enumeration value="dangerousSlowMovingVehicle"/>
 *     &lt;enumeration value="emergencyVehicle"/>
 *     &lt;enumeration value="highSpeedEmergencyVehicle"/>
 *     &lt;enumeration value="longLoad"/>
 *     &lt;enumeration value="militaryConvoy"/>
 *     &lt;enumeration value="overheightVehicle"/>
 *     &lt;enumeration value="prohibitedVehicleOnTheRoadway"/>
 *     &lt;enumeration value="saltingOrGrittingVehicleInUse"/>
 *     &lt;enumeration value="slowMovingMaintenanceVehicle"/>
 *     &lt;enumeration value="slowVehicle"/>
 *     &lt;enumeration value="snowplough"/>
 *     &lt;enumeration value="trackLayingVehicle"/>
 *     &lt;enumeration value="unlitVehicleOnTheRoad"/>
 *     &lt;enumeration value="vehicleOnFire"/>
 *     &lt;enumeration value="vehicleCarryingHazardousMaterials"/>
 *     &lt;enumeration value="vehicleInDifficulty"/>
 *     &lt;enumeration value="vehicleOnWrongCarriageway"/>
 *     &lt;enumeration value="vehicleStuck"/>
 *     &lt;enumeration value="vehicleStuckUnderBridge"/>
 *     &lt;enumeration value="vehicleWithOverheightLoad"/>
 *     &lt;enumeration value="vehicleWithOverwideLoad"/>
 *     &lt;enumeration value="other"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "VehicleObstructionTypeEnum")
@XmlEnum
public enum VehicleObstructionTypeEnum {

    @XmlEnumValue("abandonedVehicle")
    ABANDONED_VEHICLE("abandonedVehicle"),
    @XmlEnumValue("abnormalLoad")
    ABNORMAL_LOAD("abnormalLoad"),
    @XmlEnumValue("brokenDownBus")
    BROKEN_DOWN_BUS("brokenDownBus"),
    @XmlEnumValue("brokenDownHeavyLorry")
    BROKEN_DOWN_HEAVY_LORRY("brokenDownHeavyLorry"),
    @XmlEnumValue("brokenDownVehicle")
    BROKEN_DOWN_VEHICLE("brokenDownVehicle"),
    @XmlEnumValue("convoy")
    CONVOY("convoy"),
    @XmlEnumValue("damagedVehicle")
    DAMAGED_VEHICLE("damagedVehicle"),
    @XmlEnumValue("dangerousSlowMovingVehicle")
    DANGEROUS_SLOW_MOVING_VEHICLE("dangerousSlowMovingVehicle"),
    @XmlEnumValue("emergencyVehicle")
    EMERGENCY_VEHICLE("emergencyVehicle"),
    @XmlEnumValue("highSpeedEmergencyVehicle")
    HIGH_SPEED_EMERGENCY_VEHICLE("highSpeedEmergencyVehicle"),
    @XmlEnumValue("longLoad")
    LONG_LOAD("longLoad"),
    @XmlEnumValue("militaryConvoy")
    MILITARY_CONVOY("militaryConvoy"),
    @XmlEnumValue("overheightVehicle")
    OVERHEIGHT_VEHICLE("overheightVehicle"),
    @XmlEnumValue("prohibitedVehicleOnTheRoadway")
    PROHIBITED_VEHICLE_ON_THE_ROADWAY("prohibitedVehicleOnTheRoadway"),
    @XmlEnumValue("saltingOrGrittingVehicleInUse")
    SALTING_OR_GRITTING_VEHICLE_IN_USE("saltingOrGrittingVehicleInUse"),
    @XmlEnumValue("slowMovingMaintenanceVehicle")
    SLOW_MOVING_MAINTENANCE_VEHICLE("slowMovingMaintenanceVehicle"),
    @XmlEnumValue("slowVehicle")
    SLOW_VEHICLE("slowVehicle"),
    @XmlEnumValue("snowplough")
    SNOWPLOUGH("snowplough"),
    @XmlEnumValue("trackLayingVehicle")
    TRACK_LAYING_VEHICLE("trackLayingVehicle"),
    @XmlEnumValue("unlitVehicleOnTheRoad")
    UNLIT_VEHICLE_ON_THE_ROAD("unlitVehicleOnTheRoad"),
    @XmlEnumValue("vehicleOnFire")
    VEHICLE_ON_FIRE("vehicleOnFire"),
    @XmlEnumValue("vehicleCarryingHazardousMaterials")
    VEHICLE_CARRYING_HAZARDOUS_MATERIALS("vehicleCarryingHazardousMaterials"),
    @XmlEnumValue("vehicleInDifficulty")
    VEHICLE_IN_DIFFICULTY("vehicleInDifficulty"),
    @XmlEnumValue("vehicleOnWrongCarriageway")
    VEHICLE_ON_WRONG_CARRIAGEWAY("vehicleOnWrongCarriageway"),
    @XmlEnumValue("vehicleStuck")
    VEHICLE_STUCK("vehicleStuck"),
    @XmlEnumValue("vehicleStuckUnderBridge")
    VEHICLE_STUCK_UNDER_BRIDGE("vehicleStuckUnderBridge"),
    @XmlEnumValue("vehicleWithOverheightLoad")
    VEHICLE_WITH_OVERHEIGHT_LOAD("vehicleWithOverheightLoad"),
    @XmlEnumValue("vehicleWithOverwideLoad")
    VEHICLE_WITH_OVERWIDE_LOAD("vehicleWithOverwideLoad"),
    @XmlEnumValue("other")
    OTHER("other");
    private final String value;

    VehicleObstructionTypeEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static VehicleObstructionTypeEnum fromValue(String v) {
        for (VehicleObstructionTypeEnum c: VehicleObstructionTypeEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
