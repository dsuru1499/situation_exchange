
package eu.datex2.schema._2_0rc1._2_0;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour GeneralInstructionToRoadUsersTypeEnum.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * <p>
 * <pre>
 * &lt;simpleType name="GeneralInstructionToRoadUsersTypeEnum">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="allowEmergencyVehiclesToPass"/>
 *     &lt;enumeration value="approachWithCare"/>
 *     &lt;enumeration value="avoidTheArea"/>
 *     &lt;enumeration value="closeAllWindowsTurnOffHeaterAndVents"/>
 *     &lt;enumeration value="crossJunctionWithCare"/>
 *     &lt;enumeration value="doNotAllowUnnecessaryGaps"/>
 *     &lt;enumeration value="doNotLeaveYourVehicle"/>
 *     &lt;enumeration value="doNotThrowOutAnyBurningObjects"/>
 *     &lt;enumeration value="doNotUseNavigationSystems"/>
 *     &lt;enumeration value="driveCarefully"/>
 *     &lt;enumeration value="driveWithExtremeCaution"/>
 *     &lt;enumeration value="flashYourLights"/>
 *     &lt;enumeration value="followTheVehicleInFrontSmoothly"/>
 *     &lt;enumeration value="increaseNormalFollowingDistance"/>
 *     &lt;enumeration value="inEmergencyWaitForPatrolService"/>
 *     &lt;enumeration value="keepYourDistance"/>
 *     &lt;enumeration value="leaveYourVehicleProceedToNextSafePlace"/>
 *     &lt;enumeration value="noNakedFlames"/>
 *     &lt;enumeration value="noOvertaking"/>
 *     &lt;enumeration value="noSmoking"/>
 *     &lt;enumeration value="noStopping"/>
 *     &lt;enumeration value="noUturns"/>
 *     &lt;enumeration value="observeSignals"/>
 *     &lt;enumeration value="observeSigns"/>
 *     &lt;enumeration value="onlyTravelIfAbsolutelyNecessary"/>
 *     &lt;enumeration value="overtakeWithCare"/>
 *     &lt;enumeration value="pullOverToTheEdgeOfTheRoadway"/>
 *     &lt;enumeration value="stopAtNextSafePlace"/>
 *     &lt;enumeration value="stopAtNextServiceArea"/>
 *     &lt;enumeration value="switchOffEngine"/>
 *     &lt;enumeration value="switchOffMobilePhonesAndTwoWayRadios"/>
 *     &lt;enumeration value="testYourBrakes"/>
 *     &lt;enumeration value="useBusService"/>
 *     &lt;enumeration value="useFogLights"/>
 *     &lt;enumeration value="useHazardWarningLights"/>
 *     &lt;enumeration value="useHeadlights"/>
 *     &lt;enumeration value="useRailService"/>
 *     &lt;enumeration value="useTramService"/>
 *     &lt;enumeration value="useUndergroundService"/>
 *     &lt;enumeration value="waitForEscortVehicle"/>
 *     &lt;enumeration value="other"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "GeneralInstructionToRoadUsersTypeEnum")
@XmlEnum
public enum GeneralInstructionToRoadUsersTypeEnum {

    @XmlEnumValue("allowEmergencyVehiclesToPass")
    ALLOW_EMERGENCY_VEHICLES_TO_PASS("allowEmergencyVehiclesToPass"),
    @XmlEnumValue("approachWithCare")
    APPROACH_WITH_CARE("approachWithCare"),
    @XmlEnumValue("avoidTheArea")
    AVOID_THE_AREA("avoidTheArea"),
    @XmlEnumValue("closeAllWindowsTurnOffHeaterAndVents")
    CLOSE_ALL_WINDOWS_TURN_OFF_HEATER_AND_VENTS("closeAllWindowsTurnOffHeaterAndVents"),
    @XmlEnumValue("crossJunctionWithCare")
    CROSS_JUNCTION_WITH_CARE("crossJunctionWithCare"),
    @XmlEnumValue("doNotAllowUnnecessaryGaps")
    DO_NOT_ALLOW_UNNECESSARY_GAPS("doNotAllowUnnecessaryGaps"),
    @XmlEnumValue("doNotLeaveYourVehicle")
    DO_NOT_LEAVE_YOUR_VEHICLE("doNotLeaveYourVehicle"),
    @XmlEnumValue("doNotThrowOutAnyBurningObjects")
    DO_NOT_THROW_OUT_ANY_BURNING_OBJECTS("doNotThrowOutAnyBurningObjects"),
    @XmlEnumValue("doNotUseNavigationSystems")
    DO_NOT_USE_NAVIGATION_SYSTEMS("doNotUseNavigationSystems"),
    @XmlEnumValue("driveCarefully")
    DRIVE_CAREFULLY("driveCarefully"),
    @XmlEnumValue("driveWithExtremeCaution")
    DRIVE_WITH_EXTREME_CAUTION("driveWithExtremeCaution"),
    @XmlEnumValue("flashYourLights")
    FLASH_YOUR_LIGHTS("flashYourLights"),
    @XmlEnumValue("followTheVehicleInFrontSmoothly")
    FOLLOW_THE_VEHICLE_IN_FRONT_SMOOTHLY("followTheVehicleInFrontSmoothly"),
    @XmlEnumValue("increaseNormalFollowingDistance")
    INCREASE_NORMAL_FOLLOWING_DISTANCE("increaseNormalFollowingDistance"),
    @XmlEnumValue("inEmergencyWaitForPatrolService")
    IN_EMERGENCY_WAIT_FOR_PATROL_SERVICE("inEmergencyWaitForPatrolService"),
    @XmlEnumValue("keepYourDistance")
    KEEP_YOUR_DISTANCE("keepYourDistance"),
    @XmlEnumValue("leaveYourVehicleProceedToNextSafePlace")
    LEAVE_YOUR_VEHICLE_PROCEED_TO_NEXT_SAFE_PLACE("leaveYourVehicleProceedToNextSafePlace"),
    @XmlEnumValue("noNakedFlames")
    NO_NAKED_FLAMES("noNakedFlames"),
    @XmlEnumValue("noOvertaking")
    NO_OVERTAKING("noOvertaking"),
    @XmlEnumValue("noSmoking")
    NO_SMOKING("noSmoking"),
    @XmlEnumValue("noStopping")
    NO_STOPPING("noStopping"),
    @XmlEnumValue("noUturns")
    NO_UTURNS("noUturns"),
    @XmlEnumValue("observeSignals")
    OBSERVE_SIGNALS("observeSignals"),
    @XmlEnumValue("observeSigns")
    OBSERVE_SIGNS("observeSigns"),
    @XmlEnumValue("onlyTravelIfAbsolutelyNecessary")
    ONLY_TRAVEL_IF_ABSOLUTELY_NECESSARY("onlyTravelIfAbsolutelyNecessary"),
    @XmlEnumValue("overtakeWithCare")
    OVERTAKE_WITH_CARE("overtakeWithCare"),
    @XmlEnumValue("pullOverToTheEdgeOfTheRoadway")
    PULL_OVER_TO_THE_EDGE_OF_THE_ROADWAY("pullOverToTheEdgeOfTheRoadway"),
    @XmlEnumValue("stopAtNextSafePlace")
    STOP_AT_NEXT_SAFE_PLACE("stopAtNextSafePlace"),
    @XmlEnumValue("stopAtNextServiceArea")
    STOP_AT_NEXT_SERVICE_AREA("stopAtNextServiceArea"),
    @XmlEnumValue("switchOffEngine")
    SWITCH_OFF_ENGINE("switchOffEngine"),
    @XmlEnumValue("switchOffMobilePhonesAndTwoWayRadios")
    SWITCH_OFF_MOBILE_PHONES_AND_TWO_WAY_RADIOS("switchOffMobilePhonesAndTwoWayRadios"),
    @XmlEnumValue("testYourBrakes")
    TEST_YOUR_BRAKES("testYourBrakes"),
    @XmlEnumValue("useBusService")
    USE_BUS_SERVICE("useBusService"),
    @XmlEnumValue("useFogLights")
    USE_FOG_LIGHTS("useFogLights"),
    @XmlEnumValue("useHazardWarningLights")
    USE_HAZARD_WARNING_LIGHTS("useHazardWarningLights"),
    @XmlEnumValue("useHeadlights")
    USE_HEADLIGHTS("useHeadlights"),
    @XmlEnumValue("useRailService")
    USE_RAIL_SERVICE("useRailService"),
    @XmlEnumValue("useTramService")
    USE_TRAM_SERVICE("useTramService"),
    @XmlEnumValue("useUndergroundService")
    USE_UNDERGROUND_SERVICE("useUndergroundService"),
    @XmlEnumValue("waitForEscortVehicle")
    WAIT_FOR_ESCORT_VEHICLE("waitForEscortVehicle"),
    @XmlEnumValue("other")
    OTHER("other");
    private final String value;

    GeneralInstructionToRoadUsersTypeEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static GeneralInstructionToRoadUsersTypeEnum fromValue(String v) {
        for (GeneralInstructionToRoadUsersTypeEnum c: GeneralInstructionToRoadUsersTypeEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
