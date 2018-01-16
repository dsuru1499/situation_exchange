
package eu.datex2.schema._2_0rc1._2_0;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour AccidentCauseEnum.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * <p>
 * <pre>
 * &lt;simpleType name="AccidentCauseEnum">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="avoidanceOfObstacles"/>
 *     &lt;enumeration value="driverDistraction"/>
 *     &lt;enumeration value="driverDrugAbuse"/>
 *     &lt;enumeration value="driverIllness"/>
 *     &lt;enumeration value="exceedingSpeedsLimits"/>
 *     &lt;enumeration value="excessAlcohol"/>
 *     &lt;enumeration value="excessiveDriverTiredness"/>
 *     &lt;enumeration value="impermissibleManoeuvre"/>
 *     &lt;enumeration value="limitedVisibility"/>
 *     &lt;enumeration value="notKeepingASafeDistance"/>
 *     &lt;enumeration value="onTheWrongSideOfTheRoad"/>
 *     &lt;enumeration value="pedestrianInRoad"/>
 *     &lt;enumeration value="poorLaneAdherence"/>
 *     &lt;enumeration value="poorMergeEntryOrExitJudgement"/>
 *     &lt;enumeration value="poorRoadSurfaceCondition"/>
 *     &lt;enumeration value="poorSurfaceAdherence"/>
 *     &lt;enumeration value="undisclosed"/>
 *     &lt;enumeration value="unknown"/>
 *     &lt;enumeration value="vehicleFailure"/>
 *     &lt;enumeration value="other"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "AccidentCauseEnum")
@XmlEnum
public enum AccidentCauseEnum {

    @XmlEnumValue("avoidanceOfObstacles")
    AVOIDANCE_OF_OBSTACLES("avoidanceOfObstacles"),
    @XmlEnumValue("driverDistraction")
    DRIVER_DISTRACTION("driverDistraction"),
    @XmlEnumValue("driverDrugAbuse")
    DRIVER_DRUG_ABUSE("driverDrugAbuse"),
    @XmlEnumValue("driverIllness")
    DRIVER_ILLNESS("driverIllness"),
    @XmlEnumValue("exceedingSpeedsLimits")
    EXCEEDING_SPEEDS_LIMITS("exceedingSpeedsLimits"),
    @XmlEnumValue("excessAlcohol")
    EXCESS_ALCOHOL("excessAlcohol"),
    @XmlEnumValue("excessiveDriverTiredness")
    EXCESSIVE_DRIVER_TIREDNESS("excessiveDriverTiredness"),
    @XmlEnumValue("impermissibleManoeuvre")
    IMPERMISSIBLE_MANOEUVRE("impermissibleManoeuvre"),
    @XmlEnumValue("limitedVisibility")
    LIMITED_VISIBILITY("limitedVisibility"),
    @XmlEnumValue("notKeepingASafeDistance")
    NOT_KEEPING_A_SAFE_DISTANCE("notKeepingASafeDistance"),
    @XmlEnumValue("onTheWrongSideOfTheRoad")
    ON_THE_WRONG_SIDE_OF_THE_ROAD("onTheWrongSideOfTheRoad"),
    @XmlEnumValue("pedestrianInRoad")
    PEDESTRIAN_IN_ROAD("pedestrianInRoad"),
    @XmlEnumValue("poorLaneAdherence")
    POOR_LANE_ADHERENCE("poorLaneAdherence"),
    @XmlEnumValue("poorMergeEntryOrExitJudgement")
    POOR_MERGE_ENTRY_OR_EXIT_JUDGEMENT("poorMergeEntryOrExitJudgement"),
    @XmlEnumValue("poorRoadSurfaceCondition")
    POOR_ROAD_SURFACE_CONDITION("poorRoadSurfaceCondition"),
    @XmlEnumValue("poorSurfaceAdherence")
    POOR_SURFACE_ADHERENCE("poorSurfaceAdherence"),
    @XmlEnumValue("undisclosed")
    UNDISCLOSED("undisclosed"),
    @XmlEnumValue("unknown")
    UNKNOWN("unknown"),
    @XmlEnumValue("vehicleFailure")
    VEHICLE_FAILURE("vehicleFailure"),
    @XmlEnumValue("other")
    OTHER("other");
    private final String value;

    AccidentCauseEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static AccidentCauseEnum fromValue(String v) {
        for (AccidentCauseEnum c: AccidentCauseEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
