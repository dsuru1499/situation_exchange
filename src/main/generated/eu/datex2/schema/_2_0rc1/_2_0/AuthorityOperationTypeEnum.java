
package eu.datex2.schema._2_0rc1._2_0;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour AuthorityOperationTypeEnum.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * <p>
 * <pre>
 * &lt;simpleType name="AuthorityOperationTypeEnum">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="accidentInvestigationWork"/>
 *     &lt;enumeration value="bombSquadInAction"/>
 *     &lt;enumeration value="civilEmergency"/>
 *     &lt;enumeration value="customsOperation"/>
 *     &lt;enumeration value="juridicalReconstruction"/>
 *     &lt;enumeration value="policeCheckPoint"/>
 *     &lt;enumeration value="policeInvestigation"/>
 *     &lt;enumeration value="roadOperatorCheckPoint"/>
 *     &lt;enumeration value="survey"/>
 *     &lt;enumeration value="transportOfVip"/>
 *     &lt;enumeration value="undefinedAuthorityActivity"/>
 *     &lt;enumeration value="vehicleInspectionCheckPoint"/>
 *     &lt;enumeration value="vehicleWeighing"/>
 *     &lt;enumeration value="weighInMotion"/>
 *     &lt;enumeration value="other"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "AuthorityOperationTypeEnum")
@XmlEnum
public enum AuthorityOperationTypeEnum {

    @XmlEnumValue("accidentInvestigationWork")
    ACCIDENT_INVESTIGATION_WORK("accidentInvestigationWork"),
    @XmlEnumValue("bombSquadInAction")
    BOMB_SQUAD_IN_ACTION("bombSquadInAction"),
    @XmlEnumValue("civilEmergency")
    CIVIL_EMERGENCY("civilEmergency"),
    @XmlEnumValue("customsOperation")
    CUSTOMS_OPERATION("customsOperation"),
    @XmlEnumValue("juridicalReconstruction")
    JURIDICAL_RECONSTRUCTION("juridicalReconstruction"),
    @XmlEnumValue("policeCheckPoint")
    POLICE_CHECK_POINT("policeCheckPoint"),
    @XmlEnumValue("policeInvestigation")
    POLICE_INVESTIGATION("policeInvestigation"),
    @XmlEnumValue("roadOperatorCheckPoint")
    ROAD_OPERATOR_CHECK_POINT("roadOperatorCheckPoint"),
    @XmlEnumValue("survey")
    SURVEY("survey"),
    @XmlEnumValue("transportOfVip")
    TRANSPORT_OF_VIP("transportOfVip"),
    @XmlEnumValue("undefinedAuthorityActivity")
    UNDEFINED_AUTHORITY_ACTIVITY("undefinedAuthorityActivity"),
    @XmlEnumValue("vehicleInspectionCheckPoint")
    VEHICLE_INSPECTION_CHECK_POINT("vehicleInspectionCheckPoint"),
    @XmlEnumValue("vehicleWeighing")
    VEHICLE_WEIGHING("vehicleWeighing"),
    @XmlEnumValue("weighInMotion")
    WEIGH_IN_MOTION("weighInMotion"),
    @XmlEnumValue("other")
    OTHER("other");
    private final String value;

    AuthorityOperationTypeEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static AuthorityOperationTypeEnum fromValue(String v) {
        for (AuthorityOperationTypeEnum c: AuthorityOperationTypeEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
