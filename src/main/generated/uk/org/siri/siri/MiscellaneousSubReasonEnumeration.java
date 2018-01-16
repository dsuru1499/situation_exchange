
package uk.org.siri.siri;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour MiscellaneousSubReasonEnumeration.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * <p>
 * <pre>
 * &lt;simpleType name="MiscellaneousSubReasonEnumeration">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN">
 *     &lt;enumeration value="unknown"/>
 *     &lt;enumeration value="previousDisturbances"/>
 *     &lt;enumeration value="incident"/>
 *     &lt;enumeration value="safetyViolation"/>
 *     &lt;enumeration value="nearMiss"/>
 *     &lt;enumeration value="signalPassedAtDanger"/>
 *     &lt;enumeration value="stationOverrun"/>
 *     &lt;enumeration value="trainDoor"/>
 *     &lt;enumeration value="bombExplosion"/>
 *     &lt;enumeration value="securityAlert"/>
 *     &lt;enumeration value="emergencyServicesCall"/>
 *     &lt;enumeration value="policeRequest"/>
 *     &lt;enumeration value="fireBrigadeSafetyChecks"/>
 *     &lt;enumeration value="unattendedBag"/>
 *     &lt;enumeration value="telephonedThreat"/>
 *     &lt;enumeration value="suspectVehicle"/>
 *     &lt;enumeration value="civilEmergency"/>
 *     &lt;enumeration value="airRaid"/>
 *     &lt;enumeration value="sabotage"/>
 *     &lt;enumeration value="bombALert"/>
 *     &lt;enumeration value="attack"/>
 *     &lt;enumeration value="evacuation"/>
 *     &lt;enumeration value="terroristIncident"/>
 *     &lt;enumeration value="gunfireOnRoadway"/>
 *     &lt;enumeration value="explosion"/>
 *     &lt;enumeration value="explosionHazard"/>
 *     &lt;enumeration value="securityIncident"/>
 *     &lt;enumeration value="fireBrigadeOrder"/>
 *     &lt;enumeration value="policeActivity"/>
 *     &lt;enumeration value="fire"/>
 *     &lt;enumeration value="linesideFire"/>
 *     &lt;enumeration value="vandalism"/>
 *     &lt;enumeration value="passengerAction"/>
 *     &lt;enumeration value="staffAssault"/>
 *     &lt;enumeration value="railwayCrime"/>
 *     &lt;enumeration value="theft"/>
 *     &lt;enumeration value="altercation"/>
 *     &lt;enumeration value="illVehicleOccupants"/>
 *     &lt;enumeration value="accident"/>
 *     &lt;enumeration value="fatality"/>
 *     &lt;enumeration value="personUnderTrain"/>
 *     &lt;enumeration value="personHitByTrain"/>
 *     &lt;enumeration value="personIllOnVehicle"/>
 *     &lt;enumeration value="emergencyServices"/>
 *     &lt;enumeration value="collision"/>
 *     &lt;enumeration value="overcrowded"/>
 *     &lt;enumeration value="insufficientDemand"/>
 *     &lt;enumeration value="lightingFailure"/>
 *     &lt;enumeration value="leaderBoardFailure"/>
 *     &lt;enumeration value="serviceIndicatorFailure"/>
 *     &lt;enumeration value="serviceFailure"/>
 *     &lt;enumeration value="operatorCeasedTrading"/>
 *     &lt;enumeration value="operatorSuspended"/>
 *     &lt;enumeration value="congestion"/>
 *     &lt;enumeration value="routeBlockage"/>
 *     &lt;enumeration value="personOnTheLine"/>
 *     &lt;enumeration value="vehicleOnTheLine"/>
 *     &lt;enumeration value="objectOnTheLine"/>
 *     &lt;enumeration value="fallenTreeOnTheLine"/>
 *     &lt;enumeration value="vegetation"/>
 *     &lt;enumeration value="trainStruckAnimal"/>
 *     &lt;enumeration value="trainStruckObject"/>
 *     &lt;enumeration value="levelCrossingIncident"/>
 *     &lt;enumeration value="animalOnTheLine"/>
 *     &lt;enumeration value="routeDiversion"/>
 *     &lt;enumeration value="roadClosed"/>
 *     &lt;enumeration value="roadworks"/>
 *     &lt;enumeration value="sewerageMaintenance"/>
 *     &lt;enumeration value="roadMaintenance"/>
 *     &lt;enumeration value="asphalting"/>
 *     &lt;enumeration value="paving"/>
 *     &lt;enumeration value="specialEvent"/>
 *     &lt;enumeration value="march"/>
 *     &lt;enumeration value="procession"/>
 *     &lt;enumeration value="demonstration"/>
 *     &lt;enumeration value="publicDisturbance"/>
 *     &lt;enumeration value="filterBlockade"/>
 *     &lt;enumeration value="sightseersObstructingAccess"/>
 *     &lt;enumeration value="holiday"/>
 *     &lt;enumeration value="bridgeStrike"/>
 *     &lt;enumeration value="viaductFailure"/>
 *     &lt;enumeration value="overheadObstruction"/>
 *     &lt;enumeration value="undefinedProblem"/>
 *     &lt;enumeration value="problemsAtBorderPost"/>
 *     &lt;enumeration value="problemsAtCustomsPost"/>
 *     &lt;enumeration value="problemsOnLocalRoad"/>
 *     &lt;enumeration value="speedRestrictions"/>
 *     &lt;enumeration value="logisticProblems"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "MiscellaneousSubReasonEnumeration")
@XmlEnum
public enum MiscellaneousSubReasonEnumeration {


    /**
     * TPEG Pti_19_0 unknown
     * 
     */
    @XmlEnumValue("unknown")
    UNKNOWN("unknown"),

    /**
     *  19:0_1 Previous disturbances - alias to TPEG Pti_19_0 unknown
     * 
     */
    @XmlEnumValue("previousDisturbances")
    PREVIOUS_DISTURBANCES("previousDisturbances"),

    /**
     * TPEG Pti_19_1 incident.
     * 
     */
    @XmlEnumValue("incident")
    INCIDENT("incident"),

    /**
     *  19:1_1 Near Miss - alias to TPEG Pti_19_1 incident.
     * 
     */
    @XmlEnumValue("safetyViolation")
    SAFETY_VIOLATION("safetyViolation"),

    /**
     *  19:1_2 Near Miss - alias to TPEG Pti_19_1 incident.
     * 
     */
    @XmlEnumValue("nearMiss")
    NEAR_MISS("nearMiss"),

    /**
     *  19:1_3 Signal passed at danger - alias to TPEG Pti_19_1 incident.
     * 
     */
    @XmlEnumValue("signalPassedAtDanger")
    SIGNAL_PASSED_AT_DANGER("signalPassedAtDanger"),

    /**
     *  19:1_4 Station overrun - alias to TPEG Pti_19_1 incident.
     * 
     */
    @XmlEnumValue("stationOverrun")
    STATION_OVERRUN("stationOverrun"),

    /**
     *  19:1_5  trainDoor- alias to TPEG Pti_19_1 incident.
     * 
     */
    @XmlEnumValue("trainDoor")
    TRAIN_DOOR("trainDoor"),

    /**
     * TPEG Pti_19_2 bomb explosion.
     * 
     */
    @XmlEnumValue("bombExplosion")
    BOMB_EXPLOSION("bombExplosion"),

    /**
     * TPEG Pti_19_3 security alert.
     * 
     */
    @XmlEnumValue("securityAlert")
    SECURITY_ALERT("securityAlert"),

    /**
     *  19:1_6 Unspecified emergency service visit. Alias to pti19
     * 
     */
    @XmlEnumValue("emergencyServicesCall")
    EMERGENCY_SERVICES_CALL("emergencyServicesCall"),

    /**
     *  19:3_1 Request of the police Alias to TPEG Pti_19_3 security alert.
     * 
     */
    @XmlEnumValue("policeRequest")
    POLICE_REQUEST("policeRequest"),

    /**
     *  19:3_2 Fire brigade safety checksAlias to TPEG Pti_19_3 security alert.
     * 
     */
    @XmlEnumValue("fireBrigadeSafetyChecks")
    FIRE_BRIGADE_SAFETY_CHECKS("fireBrigadeSafetyChecks"),

    /**
     *  19:3_3 An unattended bag TPEG Pti_19_3 security alert.
     * 
     */
    @XmlEnumValue("unattendedBag")
    UNATTENDED_BAG("unattendedBag"),

    /**
     *  19:3_4 Telephoned threat TPEG Pti_19_3 security alert.
     * 
     */
    @XmlEnumValue("telephonedThreat")
    TELEPHONED_THREAT("telephonedThreat"),

    /**
     *  19:3_5 telephoned threat TPEG Pti_19_3 security alert.
     * 
     */
    @XmlEnumValue("suspectVehicle")
    SUSPECT_VEHICLE("suspectVehicle"),

    /**
     *  19:3_6 Civil Emergency Pti_19_3 security alert
     * 
     */
    @XmlEnumValue("civilEmergency")
    CIVIL_EMERGENCY("civilEmergency"),

    /**
     *  19:3_7 Air Raid Pti_19_3 security alert
     * 
     */
    @XmlEnumValue("airRaid")
    AIR_RAID("airRaid"),

    /**
     *  19:3_8 Sabotage Pti_19_3 security alert
     * 
     */
    @XmlEnumValue("sabotage")
    SABOTAGE("sabotage"),

    /**
     *  19:3_9 Bomb alert Pti_19_3 security alert
     * 
     */
    @XmlEnumValue("bombALert")
    BOMB_A_LERT("bombALert"),

    /**
     *  19:3_10 Attack Pti_19_3 security alert
     * 
     */
    @XmlEnumValue("attack")
    ATTACK("attack"),

    /**
     *  19:3_11 EvacuationPti_19_3 security alert
     * 
     */
    @XmlEnumValue("evacuation")
    EVACUATION("evacuation"),

    /**
     *  19:3_12 terrorist Incident Pti_19_3 security alert
     * 
     */
    @XmlEnumValue("terroristIncident")
    TERRORIST_INCIDENT("terroristIncident"),
    @XmlEnumValue("gunfireOnRoadway")
    GUNFIRE_ON_ROADWAY("gunfireOnRoadway"),

    /**
     *  19:3_14 Explosion Pti_19_3 security alert
     * 
     */
    @XmlEnumValue("explosion")
    EXPLOSION("explosion"),

    /**
     *  19:3_15 explosion Hazard Pti_19_3 security alert
     * 
     */
    @XmlEnumValue("explosionHazard")
    EXPLOSION_HAZARD("explosionHazard"),

    /**
     *  19:3_16 security Incident Pti_19_3 security alert
     * 
     */
    @XmlEnumValue("securityIncident")
    SECURITY_INCIDENT("securityIncident"),

    /**
     *  19:3_17 terrorist Incident Pti_19_3 security alert
     * 
     */
    @XmlEnumValue("fireBrigadeOrder")
    FIRE_BRIGADE_ORDER("fireBrigadeOrder"),

    /**
     *  19:3_18 terrorist Incident Pti_19_3 security alert
     * 
     */
    @XmlEnumValue("policeActivity")
    POLICE_ACTIVITY("policeActivity"),

    /**
     * TPEG Pti_19_4 fire
     * 
     */
    @XmlEnumValue("fire")
    FIRE("fire"),

    /**
     * linesideFire alias to TPEG Pti_19_4 fire.
     * 
     */
    @XmlEnumValue("linesideFire")
    LINESIDE_FIRE("linesideFire"),

    /**
     * TPEG Pti_19_5 vandalism
     * 
     */
    @XmlEnumValue("vandalism")
    VANDALISM("vandalism"),

    /**
     *  19:5_1 passengerActionAlias to pti19_5 vandalism
     * 
     */
    @XmlEnumValue("passengerAction")
    PASSENGER_ACTION("passengerAction"),

    /**
     *  19:5_2 Assault on staft.Alias to pti19_5 vandalism
     * 
     */
    @XmlEnumValue("staffAssault")
    STAFF_ASSAULT("staffAssault"),

    /**
     *  19:5_3 Railway Crime Alias to pti19_5 vandalism
     * 
     */
    @XmlEnumValue("railwayCrime")
    RAILWAY_CRIME("railwayCrime"),

    /**
     *  19:5_4 theft to pti19_5 vandalism
     * 
     */
    @XmlEnumValue("theft")
    THEFT("theft"),

    /**
     *  19:1_7Railway Crime Alias to pti19_1 incident
     * 
     */
    @XmlEnumValue("altercation")
    ALTERCATION("altercation"),

    /**
     *  19:1_8 Railway Crime Alias to pti19_1 incident
     * 
     */
    @XmlEnumValue("illVehicleOccupants")
    ILL_VEHICLE_OCCUPANTS("illVehicleOccupants"),

    /**
     * PEG Pti_19_6 accident
     * 
     */
    @XmlEnumValue("accident")
    ACCIDENT("accident"),

    /**
     *  19:6_1 fatality alias to TPEG Pti_19_6 accident.
     * 
     */
    @XmlEnumValue("fatality")
    FATALITY("fatality"),

    /**
     *  19:6_2 a person under a train - alias to TPEG Pti_19_6 accident.
     * 
     */
    @XmlEnumValue("personUnderTrain")
    PERSON_UNDER_TRAIN("personUnderTrain"),

    /**
     *  19:6_3 a person hit by a train - alias to TPEG Pti_19_6 accident.
     * 
     */
    @XmlEnumValue("personHitByTrain")
    PERSON_HIT_BY_TRAIN("personHitByTrain"),

    /**
     *  19:6_4 person ill On Vehicle -Alias to pti19_6 accident.
     * 
     */
    @XmlEnumValue("personIllOnVehicle")
    PERSON_ILL_ON_VEHICLE("personIllOnVehicle"),

    /**
     *  19:6_5 emergencyServices - alias to TPEG Pti_19_6 accident.
     * 
     */
    @XmlEnumValue("emergencyServices")
    EMERGENCY_SERVICES("emergencyServices"),

    /**
     *  19:6_6 Collision - Alias to pti19_6 accident.
     * 
     */
    @XmlEnumValue("collision")
    COLLISION("collision"),

    /**
     * TPEG Pti_19_07 overcrowded
     * 
     */
    @XmlEnumValue("overcrowded")
    OVERCROWDED("overcrowded"),

    /**
     * TPEG Pti_19_08 insufficientDemand
     * 
     */
    @XmlEnumValue("insufficientDemand")
    INSUFFICIENT_DEMAND("insufficientDemand"),

    /**
     * TPEG Pti_19_09 lightingFailure
     * 
     */
    @XmlEnumValue("lightingFailure")
    LIGHTING_FAILURE("lightingFailure"),

    /**
     * TPEG Pti_19_10 leaderBoardFailure
     * 
     */
    @XmlEnumValue("leaderBoardFailure")
    LEADER_BOARD_FAILURE("leaderBoardFailure"),

    /**
     * TPEG Pti_19_11 serviceIndicatorFailure
     * 
     */
    @XmlEnumValue("serviceIndicatorFailure")
    SERVICE_INDICATOR_FAILURE("serviceIndicatorFailure"),

    /**
     * TPEG Pti_19_12 serviceFailure
     * 
     */
    @XmlEnumValue("serviceFailure")
    SERVICE_FAILURE("serviceFailure"),

    /**
     * TPEG Pti_19_13 operatorCeasedTrading
     * 
     */
    @XmlEnumValue("operatorCeasedTrading")
    OPERATOR_CEASED_TRADING("operatorCeasedTrading"),

    /**
     * TPEG Pti_19_14 operatorSuspended
     * 
     */
    @XmlEnumValue("operatorSuspended")
    OPERATOR_SUSPENDED("operatorSuspended"),

    /**
     * TPEG Pti_19_15 congestion
     * 
     */
    @XmlEnumValue("congestion")
    CONGESTION("congestion"),

    /**
     * TPEG Pti_19_16 routeBlockage
     * 
     */
    @XmlEnumValue("routeBlockage")
    ROUTE_BLOCKAGE("routeBlockage"),

    /**
     * TPEG Pti_19_17 personOnTheLine
     * 
     */
    @XmlEnumValue("personOnTheLine")
    PERSON_ON_THE_LINE("personOnTheLine"),

    /**
     * TPEG Pti_19_18 vehicleOnTheLine
     * 
     */
    @XmlEnumValue("vehicleOnTheLine")
    VEHICLE_ON_THE_LINE("vehicleOnTheLine"),

    /**
     * TPEG Pti_19_19 objectOnTheLine
     * 
     */
    @XmlEnumValue("objectOnTheLine")
    OBJECT_ON_THE_LINE("objectOnTheLine"),

    /**
     *  19:19_1 fallen tree on line- alias to TPEG Pti_19_19 object on the line.
     * 
     */
    @XmlEnumValue("fallenTreeOnTheLine")
    FALLEN_TREE_ON_THE_LINE("fallenTreeOnTheLine"),

    /**
     *  19:19_2 Vegetation - alias to TPEG Pti_19_19 object on the line.
     * 
     */
    @XmlEnumValue("vegetation")
    VEGETATION("vegetation"),

    /**
     *  19:19_3 Train struck animal alias to TPEG Pti_19_19 object on the line.
     * 
     */
    @XmlEnumValue("trainStruckAnimal")
    TRAIN_STRUCK_ANIMAL("trainStruckAnimal"),

    /**
     *  19:19_4 Train struck object alias to TPEG Pti_19_19 object on the line.
     * 
     */
    @XmlEnumValue("trainStruckObject")
    TRAIN_STRUCK_OBJECT("trainStruckObject"),

    /**
     *  19:18_1 Level Crossing Incident - alias to TPEG Pti_19_18 VEHICLE on the line.
     * 
     */
    @XmlEnumValue("levelCrossingIncident")
    LEVEL_CROSSING_INCIDENT("levelCrossingIncident"),

    /**
     * TPEG Pti_19_20 animal on the line.
     * 
     */
    @XmlEnumValue("animalOnTheLine")
    ANIMAL_ON_THE_LINE("animalOnTheLine"),

    /**
     * TPEG Pti_19_21 route diversion.
     * 
     */
    @XmlEnumValue("routeDiversion")
    ROUTE_DIVERSION("routeDiversion"),

    /**
     * TPEG Pti_19_22 road closed.
     * 
     */
    @XmlEnumValue("roadClosed")
    ROAD_CLOSED("roadClosed"),

    /**
     * TPEG Pti_19_23 roadworks.
     * 
     */
    @XmlEnumValue("roadworks")
    ROADWORKS("roadworks"),

    /**
     *  19:23_1 sewerageMaintenance - alias to TPEG Pti_19_23 roadworks..
     * 
     */
    @XmlEnumValue("sewerageMaintenance")
    SEWERAGE_MAINTENANCE("sewerageMaintenance"),

    /**
     *  19:23_2 roadMaintenance - alias to TPEG Pti_19_23 roadworks..
     * 
     */
    @XmlEnumValue("roadMaintenance")
    ROAD_MAINTENANCE("roadMaintenance"),

    /**
     *  19:23_3 asphalting - alias to TPEG Pti_19_23 roadworks..
     * 
     */
    @XmlEnumValue("asphalting")
    ASPHALTING("asphalting"),

    /**
     *  19:23_4 paving - alias to TPEG Pti_19_23 roadworks..
     * 
     */
    @XmlEnumValue("paving")
    PAVING("paving"),

    /**
     * TPEG Pti_19_24 special event.
     * 
     */
    @XmlEnumValue("specialEvent")
    SPECIAL_EVENT("specialEvent"),

    /**
     *  19:24_1 march - alias to TPEG Pti_19_24 specialEvent
     * 
     */
    @XmlEnumValue("march")
    MARCH("march"),

    /**
     *  19:24_2 procession - alias to TPEG Pti_19_24 specialEvent
     * 
     */
    @XmlEnumValue("procession")
    PROCESSION("procession"),

    /**
     *  19:24_3 demonstration - alias to TPEG Pti_19_24 specialEvent
     * 
     */
    @XmlEnumValue("demonstration")
    DEMONSTRATION("demonstration"),

    /**
     *  19:24_4 publicDisturbance - alias to TPEG Pti_19_24 specialEvent
     * 
     */
    @XmlEnumValue("publicDisturbance")
    PUBLIC_DISTURBANCE("publicDisturbance"),

    /**
     *  19:24_5 filterBlockade - alias to TPEG Pti_19_24 specialEvent
     * 
     */
    @XmlEnumValue("filterBlockade")
    FILTER_BLOCKADE("filterBlockade"),

    /**
     *  19:24_6 sightseersObstructingAccess - alias to TPEG Pti_19_24 specialEvent
     * 
     */
    @XmlEnumValue("sightseersObstructingAccess")
    SIGHTSEERS_OBSTRUCTING_ACCESS("sightseersObstructingAccess"),

    /**
     *  19:24_7 sightseersObstructingAccess - alias to TPEG Pti_19_24 specialEvent
     * 
     */
    @XmlEnumValue("holiday")
    HOLIDAY("holiday"),

    /**
     * TPEG Pti_19_25 bridge strike.
     * 
     */
    @XmlEnumValue("bridgeStrike")
    BRIDGE_STRIKE("bridgeStrike"),

    /**
     *  19:25_1 viaductFailure - alias to TPEG Pti_19_24 bridgeStrike
     * 
     */
    @XmlEnumValue("viaductFailure")
    VIADUCT_FAILURE("viaductFailure"),

    /**
     * TPEG Pti_19_26 overhead obstruction.
     * 
     */
    @XmlEnumValue("overheadObstruction")
    OVERHEAD_OBSTRUCTION("overheadObstruction"),

    /**
     * TPEG Pti_19_255 undefined problem.
     * 
     */
    @XmlEnumValue("undefinedProblem")
    UNDEFINED_PROBLEM("undefinedProblem"),

    /**
     *  19:15_1 problemsAtBorderPost - alias to TPEG Pti_19_15 congestion.
     * 
     */
    @XmlEnumValue("problemsAtBorderPost")
    PROBLEMS_AT_BORDER_POST("problemsAtBorderPost"),

    /**
     *  19:15_2 problemsAtCustomsPost alias to TPEG Pti_19_15 congestion.
     * 
     */
    @XmlEnumValue("problemsAtCustomsPost")
    PROBLEMS_AT_CUSTOMS_POST("problemsAtCustomsPost"),

    /**
     *  19:15_3 problemsOnLocalRoad alias to TPEG Pti_19_15 congestion.
     * 
     */
    @XmlEnumValue("problemsOnLocalRoad")
    PROBLEMS_ON_LOCAL_ROAD("problemsOnLocalRoad"),

    /**
     *  19:255_1 speedRestrictions alias to TPEG Pti_19_15 unknown
     * 
     */
    @XmlEnumValue("speedRestrictions")
    SPEED_RESTRICTIONS("speedRestrictions"),

    /**
     *  19:255_2 logisticProblems alias to TPEG Pti_19_15 unknown
     * 
     */
    @XmlEnumValue("logisticProblems")
    LOGISTIC_PROBLEMS("logisticProblems");
    private final String value;

    MiscellaneousSubReasonEnumeration(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static MiscellaneousSubReasonEnumeration fromValue(String v) {
        for (MiscellaneousSubReasonEnumeration c: MiscellaneousSubReasonEnumeration.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
