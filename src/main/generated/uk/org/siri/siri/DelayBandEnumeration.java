
package uk.org.siri.siri;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour DelayBandEnumeration.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * <p>
 * <pre>
 * &lt;simpleType name="DelayBandEnumeration">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}normalizedString">
 *     &lt;enumeration value="delayTwoMinutes"/>
 *     &lt;enumeration value="upToThreeMinutes"/>
 *     &lt;enumeration value="upToFourMinutes"/>
 *     &lt;enumeration value="upToFiveMinutes"/>
 *     &lt;enumeration value="upToEightMinutes"/>
 *     &lt;enumeration value="negligible"/>
 *     &lt;enumeration value="upToTenMinutes"/>
 *     &lt;enumeration value="betweenTenMinutesAndThirtyMinutes"/>
 *     &lt;enumeration value="betweenThirtyMinutesAndOneHour"/>
 *     &lt;enumeration value="betweenOneHourAndThreeHours"/>
 *     &lt;enumeration value="betweenThreeHoursAndSixHours"/>
 *     &lt;enumeration value="longerThanSixHours"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "DelayBandEnumeration")
@XmlEnum
public enum DelayBandEnumeration {

    @XmlEnumValue("delayTwoMinutes")
    DELAY_TWO_MINUTES("delayTwoMinutes"),
    @XmlEnumValue("upToThreeMinutes")
    UP_TO_THREE_MINUTES("upToThreeMinutes"),
    @XmlEnumValue("upToFourMinutes")
    UP_TO_FOUR_MINUTES("upToFourMinutes"),
    @XmlEnumValue("upToFiveMinutes")
    UP_TO_FIVE_MINUTES("upToFiveMinutes"),
    @XmlEnumValue("upToEightMinutes")
    UP_TO_EIGHT_MINUTES("upToEightMinutes"),
    @XmlEnumValue("negligible")
    NEGLIGIBLE("negligible"),
    @XmlEnumValue("upToTenMinutes")
    UP_TO_TEN_MINUTES("upToTenMinutes"),
    @XmlEnumValue("betweenTenMinutesAndThirtyMinutes")
    BETWEEN_TEN_MINUTES_AND_THIRTY_MINUTES("betweenTenMinutesAndThirtyMinutes"),
    @XmlEnumValue("betweenThirtyMinutesAndOneHour")
    BETWEEN_THIRTY_MINUTES_AND_ONE_HOUR("betweenThirtyMinutesAndOneHour"),
    @XmlEnumValue("betweenOneHourAndThreeHours")
    BETWEEN_ONE_HOUR_AND_THREE_HOURS("betweenOneHourAndThreeHours"),
    @XmlEnumValue("betweenThreeHoursAndSixHours")
    BETWEEN_THREE_HOURS_AND_SIX_HOURS("betweenThreeHoursAndSixHours"),
    @XmlEnumValue("longerThanSixHours")
    LONGER_THAN_SIX_HOURS("longerThanSixHours");
    private final String value;

    DelayBandEnumeration(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static DelayBandEnumeration fromValue(String v) {
        for (DelayBandEnumeration c: DelayBandEnumeration.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
