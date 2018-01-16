
package uk.org.siri.siri;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour EquipmentSubReasonEnumeration.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * <p>
 * <pre>
 * &lt;simpleType name="EquipmentSubReasonEnumeration">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN">
 *     &lt;enumeration value="unknown"/>
 *     &lt;enumeration value="pointsProblem"/>
 *     &lt;enumeration value="pointsFailure"/>
 *     &lt;enumeration value="signalProblem"/>
 *     &lt;enumeration value="trainWarningSystemProblem"/>
 *     &lt;enumeration value="trackCircuitProblem"/>
 *     &lt;enumeration value="signalFailure"/>
 *     &lt;enumeration value="signalAndSwitchFailure"/>
 *     &lt;enumeration value="derailment"/>
 *     &lt;enumeration value="engineFailure"/>
 *     &lt;enumeration value="tractionFailure"/>
 *     &lt;enumeration value="breakDown"/>
 *     &lt;enumeration value="technicalProblem"/>
 *     &lt;enumeration value="brokenRail"/>
 *     &lt;enumeration value="poorRailConditions"/>
 *     &lt;enumeration value="wheelImpactLoad"/>
 *     &lt;enumeration value="lackOfOperationalStock"/>
 *     &lt;enumeration value="defectiveFireAlarmEquipment"/>
 *     &lt;enumeration value="defectivePlatformEdgeDoors"/>
 *     &lt;enumeration value="defectiveCctv"/>
 *     &lt;enumeration value="defectivePublicAnnouncementSystem"/>
 *     &lt;enumeration value="ticketingSystemNotAvailable"/>
 *     &lt;enumeration value="leveCrossingFailure"/>
 *     &lt;enumeration value="repairWork"/>
 *     &lt;enumeration value="constructionWork"/>
 *     &lt;enumeration value="maintenanceWork"/>
 *     &lt;enumeration value="emergencyEngineeringWork"/>
 *     &lt;enumeration value="lateFinishToEngineeringWork"/>
 *     &lt;enumeration value="powerProblem"/>
 *     &lt;enumeration value="oveheadWireFailure"/>
 *     &lt;enumeration value="fuelProblem"/>
 *     &lt;enumeration value="swingBridgeFailure"/>
 *     &lt;enumeration value="escalatorFailure"/>
 *     &lt;enumeration value="liftFailure"/>
 *     &lt;enumeration value="gangwayProblem"/>
 *     &lt;enumeration value="closedForMaintenance"/>
 *     &lt;enumeration value="fuelShortage"/>
 *     &lt;enumeration value="deicingWork"/>
 *     &lt;enumeration value="wheelProblem"/>
 *     &lt;enumeration value="slipperyTrack"/>
 *     &lt;enumeration value="luggageCarouselProblem"/>
 *     &lt;enumeration value="undefinedEquipmentProblem"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "EquipmentSubReasonEnumeration")
@XmlEnum
public enum EquipmentSubReasonEnumeration {


    /**
     * TPEG Pti21_0 unknown.
     * 
     */
    @XmlEnumValue("unknown")
    UNKNOWN("unknown"),

    /**
     * TPEG Pti21_1 points problem.
     * 
     */
    @XmlEnumValue("pointsProblem")
    POINTS_PROBLEM("pointsProblem"),

    /**
     * TPEG Pti21_2 points failure.
     * 
     */
    @XmlEnumValue("pointsFailure")
    POINTS_FAILURE("pointsFailure"),

    /**
     * TPEG Pti21_3 signal problem.
     * 
     */
    @XmlEnumValue("signalProblem")
    SIGNAL_PROBLEM("signalProblem"),

    /**
     * Train warning system eg TPWSAlias to TPEG Pti21_3 signal problem.
     * 
     */
    @XmlEnumValue("trainWarningSystemProblem")
    TRAIN_WARNING_SYSTEM_PROBLEM("trainWarningSystemProblem"),

    /**
     * Track circuit alias to TPEG Pti21_3 signal problem.
     * 
     */
    @XmlEnumValue("trackCircuitProblem")
    TRACK_CIRCUIT_PROBLEM("trackCircuitProblem"),

    /**
     * TPEG Pti21_4 signal failure.
     * 
     */
    @XmlEnumValue("signalFailure")
    SIGNAL_FAILURE("signalFailure"),

    /**
     * TPEG Pti21_4 signal failure.
     * 
     */
    @XmlEnumValue("signalAndSwitchFailure")
    SIGNAL_AND_SWITCH_FAILURE("signalAndSwitchFailure"),

    /**
     * TPEG Pti21_5 derailment.
     * 
     */
    @XmlEnumValue("derailment")
    DERAILMENT("derailment"),

    /**
     * TPEG Pti21_6 engine failure.
     * 
     */
    @XmlEnumValue("engineFailure")
    ENGINE_FAILURE("engineFailure"),

    /**
     * traction failure alais to TPEG Pti21_6 engine failure.
     * 
     */
    @XmlEnumValue("tractionFailure")
    TRACTION_FAILURE("tractionFailure"),

    /**
     * TPEG Pti21_7 break down.
     * 
     */
    @XmlEnumValue("breakDown")
    BREAK_DOWN("breakDown"),

    /**
     * TPEG Pti21_8 technical problem.
     * 
     */
    @XmlEnumValue("technicalProblem")
    TECHNICAL_PROBLEM("technicalProblem"),

    /**
     * Broken rail - alias to TPEG Pti21_8 technical problem.
     * 
     */
    @XmlEnumValue("brokenRail")
    BROKEN_RAIL("brokenRail"),

    /**
     * poor rail conditions - alias to TPEG Pti21_8 technical problem.
     * 
     */
    @XmlEnumValue("poorRailConditions")
    POOR_RAIL_CONDITIONS("poorRailConditions"),

    /**
     * Wheel Impact Load detectedi by trackside equipment alias to TPEG Pti21_8 technical problem.
     * 
     */
    @XmlEnumValue("wheelImpactLoad")
    WHEEL_IMPACT_LOAD("wheelImpactLoad"),

    /**
     * late lack of operational stock - alias to TPEG Pti21_8 technical problem.
     * 
     */
    @XmlEnumValue("lackOfOperationalStock")
    LACK_OF_OPERATIONAL_STOCK("lackOfOperationalStock"),

    /**
     * defective fire alarm equipment - alias to TPEG Pti21_8 technical problem.
     * 
     */
    @XmlEnumValue("defectiveFireAlarmEquipment")
    DEFECTIVE_FIRE_ALARM_EQUIPMENT("defectiveFireAlarmEquipment"),

    /**
     * defective PEDs (platform edge doors) - alias to TPEG Pti21_8 technical problem.
     * 
     */
    @XmlEnumValue("defectivePlatformEdgeDoors")
    DEFECTIVE_PLATFORM_EDGE_DOORS("defectivePlatformEdgeDoors"),

    /**
     * defective CCTV - alias to TPEG Pti21_8 technical problem.
     * 
     */
    @XmlEnumValue("defectiveCctv")
    DEFECTIVE_CCTV("defectiveCctv"),

    /**
     * defective PA - alias to TPEG Pti21_8 technical problem.
     * 
     */
    @XmlEnumValue("defectivePublicAnnouncementSystem")
    DEFECTIVE_PUBLIC_ANNOUNCEMENT_SYSTEM("defectivePublicAnnouncementSystem"),

    /**
     * ticketing facility unavailable - alias to TPEG Pti21_8 technical problem.
     * 
     */
    @XmlEnumValue("ticketingSystemNotAvailable")
    TICKETING_SYSTEM_NOT_AVAILABLE("ticketingSystemNotAvailable"),

    /**
     * ticketing facility unavailable - alias to TPEG Pti21_8 technical problem.
     * 
     */
    @XmlEnumValue("leveCrossingFailure")
    LEVE_CROSSING_FAILURE("leveCrossingFailure"),

    /**
     * TPEG Pti21_9 repair work.
     * 
     */
    @XmlEnumValue("repairWork")
    REPAIR_WORK("repairWork"),

    /**
     * TPEG Pti21_10 construction work.
     * 
     */
    @XmlEnumValue("constructionWork")
    CONSTRUCTION_WORK("constructionWork"),

    /**
     * TPEG Pti21_11 maintenance work.
     * 
     */
    @XmlEnumValue("maintenanceWork")
    MAINTENANCE_WORK("maintenanceWork"),

    /**
     * emergency engineering work - alias to TPEG Pti21_11 maintenance work.
     * 
     */
    @XmlEnumValue("emergencyEngineeringWork")
    EMERGENCY_ENGINEERING_WORK("emergencyEngineeringWork"),

    /**
     * late finish to engineering work - alias to TPEG Pti21_11 maintenance work.
     * 
     */
    @XmlEnumValue("lateFinishToEngineeringWork")
    LATE_FINISH_TO_ENGINEERING_WORK("lateFinishToEngineeringWork"),

    /**
     * TPEG Pti21_12 power problem.
     * 
     */
    @XmlEnumValue("powerProblem")
    POWER_PROBLEM("powerProblem"),

    /**
     * TPEG Pti21_12 power problem.
     * 
     */
    @XmlEnumValue("oveheadWireFailure")
    OVEHEAD_WIRE_FAILURE("oveheadWireFailure"),

    /**
     * TPEG Pti21_13 fuel problem.
     * 
     */
    @XmlEnumValue("fuelProblem")
    FUEL_PROBLEM("fuelProblem"),

    /**
     * TPEG Pti21_14 swing bridge failure.
     * 
     */
    @XmlEnumValue("swingBridgeFailure")
    SWING_BRIDGE_FAILURE("swingBridgeFailure"),

    /**
     * TPEG Pti21_15 escalator failure.
     * 
     */
    @XmlEnumValue("escalatorFailure")
    ESCALATOR_FAILURE("escalatorFailure"),

    /**
     * TPEG Pti21_16 lift failure.
     * 
     */
    @XmlEnumValue("liftFailure")
    LIFT_FAILURE("liftFailure"),

    /**
     * TPEG Pti21_17 gangway problem.
     * 
     */
    @XmlEnumValue("gangwayProblem")
    GANGWAY_PROBLEM("gangwayProblem"),

    /**
     * TPEG Pti21_18 closed for maintenance.
     * 
     */
    @XmlEnumValue("closedForMaintenance")
    CLOSED_FOR_MAINTENANCE("closedForMaintenance"),

    /**
     * TPEG Pti21_19 fuel shortage.
     * 
     */
    @XmlEnumValue("fuelShortage")
    FUEL_SHORTAGE("fuelShortage"),

    /**
     * TPEG Pti21_20 de-icing work.
     * 
     */
    @XmlEnumValue("deicingWork")
    DEICING_WORK("deicingWork"),

    /**
     * TPEG Pti21_21 wheel problem.
     * 
     */
    @XmlEnumValue("wheelProblem")
    WHEEL_PROBLEM("wheelProblem"),

    /**
     * TPEG Pti21_21 wheel problem.
     * 
     */
    @XmlEnumValue("slipperyTrack")
    SLIPPERY_TRACK("slipperyTrack"),

    /**
     * TPEG Pti21_22 luggage carousel problem.
     * 
     */
    @XmlEnumValue("luggageCarouselProblem")
    LUGGAGE_CAROUSEL_PROBLEM("luggageCarouselProblem"),

    /**
     * TPEG Pti21_255 undefined equipment problem.
     * 
     */
    @XmlEnumValue("undefinedEquipmentProblem")
    UNDEFINED_EQUIPMENT_PROBLEM("undefinedEquipmentProblem");
    private final String value;

    EquipmentSubReasonEnumeration(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static EquipmentSubReasonEnumeration fromValue(String v) {
        for (EquipmentSubReasonEnumeration c: EquipmentSubReasonEnumeration.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
