
package uk.org.siri.siri;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour TimetableTypeEnumeration.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * <p>
 * <pre>
 * &lt;simpleType name="TimetableTypeEnumeration">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN">
 *     &lt;enumeration value="pti33_0"/>
 *     &lt;enumeration value="unknown"/>
 *     &lt;enumeration value="pti33_1"/>
 *     &lt;enumeration value="winter"/>
 *     &lt;enumeration value="pti33_2"/>
 *     &lt;enumeration value="spring"/>
 *     &lt;enumeration value="pti33_3"/>
 *     &lt;enumeration value="summer"/>
 *     &lt;enumeration value="pti33_4"/>
 *     &lt;enumeration value="autumn"/>
 *     &lt;enumeration value="pti33_5"/>
 *     &lt;enumeration value="special"/>
 *     &lt;enumeration value="pti33_6"/>
 *     &lt;enumeration value="emergency"/>
 *     &lt;enumeration value="pti33_255"/>
 *     &lt;enumeration value="undefinedTimetableType"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "TimetableTypeEnumeration")
@XmlEnum
public enum TimetableTypeEnumeration {

    @XmlEnumValue("pti33_0")
    PTI_33_0("pti33_0"),
    @XmlEnumValue("unknown")
    UNKNOWN("unknown"),
    @XmlEnumValue("pti33_1")
    PTI_33_1("pti33_1"),
    @XmlEnumValue("winter")
    WINTER("winter"),
    @XmlEnumValue("pti33_2")
    PTI_33_2("pti33_2"),
    @XmlEnumValue("spring")
    SPRING("spring"),
    @XmlEnumValue("pti33_3")
    PTI_33_3("pti33_3"),
    @XmlEnumValue("summer")
    SUMMER("summer"),
    @XmlEnumValue("pti33_4")
    PTI_33_4("pti33_4"),
    @XmlEnumValue("autumn")
    AUTUMN("autumn"),
    @XmlEnumValue("pti33_5")
    PTI_33_5("pti33_5"),
    @XmlEnumValue("special")
    SPECIAL("special"),
    @XmlEnumValue("pti33_6")
    PTI_33_6("pti33_6"),
    @XmlEnumValue("emergency")
    EMERGENCY("emergency"),
    @XmlEnumValue("pti33_255")
    PTI_33_255("pti33_255"),
    @XmlEnumValue("undefinedTimetableType")
    UNDEFINED_TIMETABLE_TYPE("undefinedTimetableType");
    private final String value;

    TimetableTypeEnumeration(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TimetableTypeEnumeration fromValue(String v) {
        for (TimetableTypeEnumeration c: TimetableTypeEnumeration.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
