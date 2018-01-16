
package eu.datex2.schema._2_0rc1._2_0;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour SourceTypeEnum.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * <p>
 * <pre>
 * &lt;simpleType name="SourceTypeEnum">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="automobileClubPatrol"/>
 *     &lt;enumeration value="cameraObservation"/>
 *     &lt;enumeration value="freightVehicleOperator"/>
 *     &lt;enumeration value="inductionLoopMonitoringStation"/>
 *     &lt;enumeration value="infraredMonitoringStation"/>
 *     &lt;enumeration value="microwaveMonitoringStation"/>
 *     &lt;enumeration value="mobileTelephoneCaller"/>
 *     &lt;enumeration value="nonPoliceEmergencyServicePatrol"/>
 *     &lt;enumeration value="otherInformation"/>
 *     &lt;enumeration value="otherOfficialVehicle"/>
 *     &lt;enumeration value="policePatrol"/>
 *     &lt;enumeration value="privateBreakdownService"/>
 *     &lt;enumeration value="publicAndPrivateUtilities"/>
 *     &lt;enumeration value="registeredMotoristObserver"/>
 *     &lt;enumeration value="roadAuthorities"/>
 *     &lt;enumeration value="roadOperatorPatrol"/>
 *     &lt;enumeration value="roadsideTelephoneCaller"/>
 *     &lt;enumeration value="spotterAircraft"/>
 *     &lt;enumeration value="trafficMonitoringStation"/>
 *     &lt;enumeration value="transitOperator"/>
 *     &lt;enumeration value="vehicleProbeMeasurement"/>
 *     &lt;enumeration value="videoProcessingMonitoringStation"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "SourceTypeEnum")
@XmlEnum
public enum SourceTypeEnum {

    @XmlEnumValue("automobileClubPatrol")
    AUTOMOBILE_CLUB_PATROL("automobileClubPatrol"),
    @XmlEnumValue("cameraObservation")
    CAMERA_OBSERVATION("cameraObservation"),
    @XmlEnumValue("freightVehicleOperator")
    FREIGHT_VEHICLE_OPERATOR("freightVehicleOperator"),
    @XmlEnumValue("inductionLoopMonitoringStation")
    INDUCTION_LOOP_MONITORING_STATION("inductionLoopMonitoringStation"),
    @XmlEnumValue("infraredMonitoringStation")
    INFRARED_MONITORING_STATION("infraredMonitoringStation"),
    @XmlEnumValue("microwaveMonitoringStation")
    MICROWAVE_MONITORING_STATION("microwaveMonitoringStation"),
    @XmlEnumValue("mobileTelephoneCaller")
    MOBILE_TELEPHONE_CALLER("mobileTelephoneCaller"),
    @XmlEnumValue("nonPoliceEmergencyServicePatrol")
    NON_POLICE_EMERGENCY_SERVICE_PATROL("nonPoliceEmergencyServicePatrol"),
    @XmlEnumValue("otherInformation")
    OTHER_INFORMATION("otherInformation"),
    @XmlEnumValue("otherOfficialVehicle")
    OTHER_OFFICIAL_VEHICLE("otherOfficialVehicle"),
    @XmlEnumValue("policePatrol")
    POLICE_PATROL("policePatrol"),
    @XmlEnumValue("privateBreakdownService")
    PRIVATE_BREAKDOWN_SERVICE("privateBreakdownService"),
    @XmlEnumValue("publicAndPrivateUtilities")
    PUBLIC_AND_PRIVATE_UTILITIES("publicAndPrivateUtilities"),
    @XmlEnumValue("registeredMotoristObserver")
    REGISTERED_MOTORIST_OBSERVER("registeredMotoristObserver"),
    @XmlEnumValue("roadAuthorities")
    ROAD_AUTHORITIES("roadAuthorities"),
    @XmlEnumValue("roadOperatorPatrol")
    ROAD_OPERATOR_PATROL("roadOperatorPatrol"),
    @XmlEnumValue("roadsideTelephoneCaller")
    ROADSIDE_TELEPHONE_CALLER("roadsideTelephoneCaller"),
    @XmlEnumValue("spotterAircraft")
    SPOTTER_AIRCRAFT("spotterAircraft"),
    @XmlEnumValue("trafficMonitoringStation")
    TRAFFIC_MONITORING_STATION("trafficMonitoringStation"),
    @XmlEnumValue("transitOperator")
    TRANSIT_OPERATOR("transitOperator"),
    @XmlEnumValue("vehicleProbeMeasurement")
    VEHICLE_PROBE_MEASUREMENT("vehicleProbeMeasurement"),
    @XmlEnumValue("videoProcessingMonitoringStation")
    VIDEO_PROCESSING_MONITORING_STATION("videoProcessingMonitoringStation");
    private final String value;

    SourceTypeEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static SourceTypeEnum fromValue(String v) {
        for (SourceTypeEnum c: SourceTypeEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
