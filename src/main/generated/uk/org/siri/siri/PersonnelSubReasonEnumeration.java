
package uk.org.siri.siri;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour PersonnelSubReasonEnumeration.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * <p>
 * <pre>
 * &lt;simpleType name="PersonnelSubReasonEnumeration">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN">
 *     &lt;enumeration value="staffSickness"/>
 *     &lt;enumeration value="unknown"/>
 *     &lt;enumeration value="staffInjury"/>
 *     &lt;enumeration value="contractorStaffInjury"/>
 *     &lt;enumeration value="staffAbsence"/>
 *     &lt;enumeration value="staffInWrongPlace"/>
 *     &lt;enumeration value="staffShortage"/>
 *     &lt;enumeration value="industrialAction"/>
 *     &lt;enumeration value="unofficialIndustrialAction"/>
 *     &lt;enumeration value="workToRule"/>
 *     &lt;enumeration value="undefinedPersonnelProblem"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "PersonnelSubReasonEnumeration")
@XmlEnum
public enum PersonnelSubReasonEnumeration {

    @XmlEnumValue("staffSickness")
    STAFF_SICKNESS("staffSickness"),

    /**
     * TPEG Pti20_0 unknown.
     * 
     */
    @XmlEnumValue("unknown")
    UNKNOWN("unknown"),
    @XmlEnumValue("staffInjury")
    STAFF_INJURY("staffInjury"),

    /**
     * contractor staff injury alias to TPEG Pti20_1 staff sickness.
     * 
     */
    @XmlEnumValue("contractorStaffInjury")
    CONTRACTOR_STAFF_INJURY("contractorStaffInjury"),

    /**
     * TPEG Pti20_2 staff absence.
     * 
     */
    @XmlEnumValue("staffAbsence")
    STAFF_ABSENCE("staffAbsence"),

    /**
     * TPEG Pti20_3 staff in wrong place.
     * 
     */
    @XmlEnumValue("staffInWrongPlace")
    STAFF_IN_WRONG_PLACE("staffInWrongPlace"),

    /**
     * TPEG Pti20_4 staff shortage.
     * 
     */
    @XmlEnumValue("staffShortage")
    STAFF_SHORTAGE("staffShortage"),

    /**
     * TPEG Pti20_5 industrial action.
     * 
     */
    @XmlEnumValue("industrialAction")
    INDUSTRIAL_ACTION("industrialAction"),
    @XmlEnumValue("unofficialIndustrialAction")
    UNOFFICIAL_INDUSTRIAL_ACTION("unofficialIndustrialAction"),

    /**
     * TPEG Pti20_6 work to rule.
     * 
     */
    @XmlEnumValue("workToRule")
    WORK_TO_RULE("workToRule"),

    /**
     * TPEG Pti20_255 undefined personnel problem.
     * 
     */
    @XmlEnumValue("undefinedPersonnelProblem")
    UNDEFINED_PERSONNEL_PROBLEM("undefinedPersonnelProblem");
    private final String value;

    PersonnelSubReasonEnumeration(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static PersonnelSubReasonEnumeration fromValue(String v) {
        for (PersonnelSubReasonEnumeration c: PersonnelSubReasonEnumeration.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
