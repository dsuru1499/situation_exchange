
package uk.org.siri.siri;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour TicketRestrictionEnumeration.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * <p>
 * <pre>
 * &lt;simpleType name="TicketRestrictionEnumeration">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN">
 *     &lt;enumeration value="pti25_0"/>
 *     &lt;enumeration value="unknown"/>
 *     &lt;enumeration value="pti25_1"/>
 *     &lt;enumeration value="allTicketClassesValid"/>
 *     &lt;enumeration value="pti25_2"/>
 *     &lt;enumeration value="fullFareOnly"/>
 *     &lt;enumeration value="pti25_3"/>
 *     &lt;enumeration value="certainTicketsOnly"/>
 *     &lt;enumeration value="pti25_4"/>
 *     &lt;enumeration value="ticketWithReservation"/>
 *     &lt;enumeration value="pti25_5"/>
 *     &lt;enumeration value="specialFare"/>
 *     &lt;enumeration value="pti25_6"/>
 *     &lt;enumeration value="onlyTicketsOfSpecifiedOperator"/>
 *     &lt;enumeration value="pti25_7"/>
 *     &lt;enumeration value="noRestrictions"/>
 *     &lt;enumeration value="pti25_8"/>
 *     &lt;enumeration value="noOffPeakTickets"/>
 *     &lt;enumeration value="pti25_9"/>
 *     &lt;enumeration value="noWeekendReturnTickets"/>
 *     &lt;enumeration value="pti25_10"/>
 *     &lt;enumeration value="noReducedFareTickets"/>
 *     &lt;enumeration value="pti25_255"/>
 *     &lt;enumeration value="unknownTicketRestriction"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "TicketRestrictionEnumeration")
@XmlEnum
public enum TicketRestrictionEnumeration {

    @XmlEnumValue("pti25_0")
    PTI_25_0("pti25_0"),
    @XmlEnumValue("unknown")
    UNKNOWN("unknown"),
    @XmlEnumValue("pti25_1")
    PTI_25_1("pti25_1"),
    @XmlEnumValue("allTicketClassesValid")
    ALL_TICKET_CLASSES_VALID("allTicketClassesValid"),
    @XmlEnumValue("pti25_2")
    PTI_25_2("pti25_2"),
    @XmlEnumValue("fullFareOnly")
    FULL_FARE_ONLY("fullFareOnly"),
    @XmlEnumValue("pti25_3")
    PTI_25_3("pti25_3"),
    @XmlEnumValue("certainTicketsOnly")
    CERTAIN_TICKETS_ONLY("certainTicketsOnly"),
    @XmlEnumValue("pti25_4")
    PTI_25_4("pti25_4"),
    @XmlEnumValue("ticketWithReservation")
    TICKET_WITH_RESERVATION("ticketWithReservation"),
    @XmlEnumValue("pti25_5")
    PTI_25_5("pti25_5"),
    @XmlEnumValue("specialFare")
    SPECIAL_FARE("specialFare"),
    @XmlEnumValue("pti25_6")
    PTI_25_6("pti25_6"),
    @XmlEnumValue("onlyTicketsOfSpecifiedOperator")
    ONLY_TICKETS_OF_SPECIFIED_OPERATOR("onlyTicketsOfSpecifiedOperator"),
    @XmlEnumValue("pti25_7")
    PTI_25_7("pti25_7"),
    @XmlEnumValue("noRestrictions")
    NO_RESTRICTIONS("noRestrictions"),
    @XmlEnumValue("pti25_8")
    PTI_25_8("pti25_8"),
    @XmlEnumValue("noOffPeakTickets")
    NO_OFF_PEAK_TICKETS("noOffPeakTickets"),
    @XmlEnumValue("pti25_9")
    PTI_25_9("pti25_9"),
    @XmlEnumValue("noWeekendReturnTickets")
    NO_WEEKEND_RETURN_TICKETS("noWeekendReturnTickets"),
    @XmlEnumValue("pti25_10")
    PTI_25_10("pti25_10"),
    @XmlEnumValue("noReducedFareTickets")
    NO_REDUCED_FARE_TICKETS("noReducedFareTickets"),
    @XmlEnumValue("pti25_255")
    PTI_25_255("pti25_255"),
    @XmlEnumValue("unknownTicketRestriction")
    UNKNOWN_TICKET_RESTRICTION("unknownTicketRestriction");
    private final String value;

    TicketRestrictionEnumeration(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TicketRestrictionEnumeration fromValue(String v) {
        for (TicketRestrictionEnumeration c: TicketRestrictionEnumeration.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}