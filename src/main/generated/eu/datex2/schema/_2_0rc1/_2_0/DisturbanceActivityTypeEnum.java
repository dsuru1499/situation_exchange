
package eu.datex2.schema._2_0rc1._2_0;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour DisturbanceActivityTypeEnum.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * <p>
 * <pre>
 * &lt;simpleType name="DisturbanceActivityTypeEnum">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="airRaid"/>
 *     &lt;enumeration value="altercationOfVehicleOccupants"/>
 *     &lt;enumeration value="assault"/>
 *     &lt;enumeration value="assetDestruction"/>
 *     &lt;enumeration value="attack"/>
 *     &lt;enumeration value="attackOnVehicle"/>
 *     &lt;enumeration value="blockadeOrBarrier"/>
 *     &lt;enumeration value="bombAlert"/>
 *     &lt;enumeration value="crowd"/>
 *     &lt;enumeration value="demonstration"/>
 *     &lt;enumeration value="evacuation"/>
 *     &lt;enumeration value="filterBlockade"/>
 *     &lt;enumeration value="goSlowOperation"/>
 *     &lt;enumeration value="gunfireOnRoadway"/>
 *     &lt;enumeration value="illVehicleOccupants"/>
 *     &lt;enumeration value="march"/>
 *     &lt;enumeration value="publicDisturbance"/>
 *     &lt;enumeration value="radioactiveLeakAlert"/>
 *     &lt;enumeration value="riot"/>
 *     &lt;enumeration value="sabotage"/>
 *     &lt;enumeration value="securityAlert"/>
 *     &lt;enumeration value="securityIncident"/>
 *     &lt;enumeration value="sightseersObstructingAccess"/>
 *     &lt;enumeration value="strike"/>
 *     &lt;enumeration value="terroristIncident"/>
 *     &lt;enumeration value="theft"/>
 *     &lt;enumeration value="toxicCloudAlert"/>
 *     &lt;enumeration value="unspecifiedAlert"/>
 *     &lt;enumeration value="other"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "DisturbanceActivityTypeEnum")
@XmlEnum
public enum DisturbanceActivityTypeEnum {

    @XmlEnumValue("airRaid")
    AIR_RAID("airRaid"),
    @XmlEnumValue("altercationOfVehicleOccupants")
    ALTERCATION_OF_VEHICLE_OCCUPANTS("altercationOfVehicleOccupants"),
    @XmlEnumValue("assault")
    ASSAULT("assault"),
    @XmlEnumValue("assetDestruction")
    ASSET_DESTRUCTION("assetDestruction"),
    @XmlEnumValue("attack")
    ATTACK("attack"),
    @XmlEnumValue("attackOnVehicle")
    ATTACK_ON_VEHICLE("attackOnVehicle"),
    @XmlEnumValue("blockadeOrBarrier")
    BLOCKADE_OR_BARRIER("blockadeOrBarrier"),
    @XmlEnumValue("bombAlert")
    BOMB_ALERT("bombAlert"),
    @XmlEnumValue("crowd")
    CROWD("crowd"),
    @XmlEnumValue("demonstration")
    DEMONSTRATION("demonstration"),
    @XmlEnumValue("evacuation")
    EVACUATION("evacuation"),
    @XmlEnumValue("filterBlockade")
    FILTER_BLOCKADE("filterBlockade"),
    @XmlEnumValue("goSlowOperation")
    GO_SLOW_OPERATION("goSlowOperation"),
    @XmlEnumValue("gunfireOnRoadway")
    GUNFIRE_ON_ROADWAY("gunfireOnRoadway"),
    @XmlEnumValue("illVehicleOccupants")
    ILL_VEHICLE_OCCUPANTS("illVehicleOccupants"),
    @XmlEnumValue("march")
    MARCH("march"),
    @XmlEnumValue("publicDisturbance")
    PUBLIC_DISTURBANCE("publicDisturbance"),
    @XmlEnumValue("radioactiveLeakAlert")
    RADIOACTIVE_LEAK_ALERT("radioactiveLeakAlert"),
    @XmlEnumValue("riot")
    RIOT("riot"),
    @XmlEnumValue("sabotage")
    SABOTAGE("sabotage"),
    @XmlEnumValue("securityAlert")
    SECURITY_ALERT("securityAlert"),
    @XmlEnumValue("securityIncident")
    SECURITY_INCIDENT("securityIncident"),
    @XmlEnumValue("sightseersObstructingAccess")
    SIGHTSEERS_OBSTRUCTING_ACCESS("sightseersObstructingAccess"),
    @XmlEnumValue("strike")
    STRIKE("strike"),
    @XmlEnumValue("terroristIncident")
    TERRORIST_INCIDENT("terroristIncident"),
    @XmlEnumValue("theft")
    THEFT("theft"),
    @XmlEnumValue("toxicCloudAlert")
    TOXIC_CLOUD_ALERT("toxicCloudAlert"),
    @XmlEnumValue("unspecifiedAlert")
    UNSPECIFIED_ALERT("unspecifiedAlert"),
    @XmlEnumValue("other")
    OTHER("other");
    private final String value;

    DisturbanceActivityTypeEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static DisturbanceActivityTypeEnum fromValue(String v) {
        for (DisturbanceActivityTypeEnum c: DisturbanceActivityTypeEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
