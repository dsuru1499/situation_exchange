
package uk.org.siri.siri;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour DaysOfWeekEnumerationx.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * <p>
 * <pre>
 * &lt;simpleType name="DaysOfWeekEnumerationx">
 *   &lt;restriction base="{http://www.siri.org.uk/siri}DayTypeEnumeration">
 *     &lt;enumeration value="unknown"/>
 *     &lt;enumeration value="monday"/>
 *     &lt;enumeration value="tuesday"/>
 *     &lt;enumeration value="wednesday"/>
 *     &lt;enumeration value="thursday"/>
 *     &lt;enumeration value="friday"/>
 *     &lt;enumeration value="saturday"/>
 *     &lt;enumeration value="sunday"/>
 *     &lt;enumeration value="mondayToFriday"/>
 *     &lt;enumeration value="mondayToSaturday"/>
 *     &lt;enumeration value="weekdays"/>
 *     &lt;enumeration value="weekends"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "DaysOfWeekEnumerationx")
@XmlEnum(DayTypeEnumeration.class)
public enum DaysOfWeekEnumerationx {

    @XmlEnumValue("unknown")
    UNKNOWN(DayTypeEnumeration.UNKNOWN),
    @XmlEnumValue("monday")
    MONDAY(DayTypeEnumeration.MONDAY),
    @XmlEnumValue("tuesday")
    TUESDAY(DayTypeEnumeration.TUESDAY),
    @XmlEnumValue("wednesday")
    WEDNESDAY(DayTypeEnumeration.WEDNESDAY),
    @XmlEnumValue("thursday")
    THURSDAY(DayTypeEnumeration.THURSDAY),
    @XmlEnumValue("friday")
    FRIDAY(DayTypeEnumeration.FRIDAY),
    @XmlEnumValue("saturday")
    SATURDAY(DayTypeEnumeration.SATURDAY),
    @XmlEnumValue("sunday")
    SUNDAY(DayTypeEnumeration.SUNDAY),
    @XmlEnumValue("mondayToFriday")
    MONDAY_TO_FRIDAY(DayTypeEnumeration.MONDAY_TO_FRIDAY),
    @XmlEnumValue("mondayToSaturday")
    MONDAY_TO_SATURDAY(DayTypeEnumeration.MONDAY_TO_SATURDAY),
    @XmlEnumValue("weekdays")
    WEEKDAYS(DayTypeEnumeration.WEEKDAYS),
    @XmlEnumValue("weekends")
    WEEKENDS(DayTypeEnumeration.WEEKENDS);
    private final DayTypeEnumeration value;

    DaysOfWeekEnumerationx(DayTypeEnumeration v) {
        value = v;
    }

    public DayTypeEnumeration value() {
        return value;
    }

    public static DaysOfWeekEnumerationx fromValue(DayTypeEnumeration v) {
        for (DaysOfWeekEnumerationx c: DaysOfWeekEnumerationx.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v.toString());
    }

}
