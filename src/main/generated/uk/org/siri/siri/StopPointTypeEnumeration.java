
package uk.org.siri.siri;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour StopPointTypeEnumeration.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * <p>
 * <pre>
 * &lt;simpleType name="StopPointTypeEnumeration">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN">
 *     &lt;enumeration value="pti17_0"/>
 *     &lt;enumeration value="unknown"/>
 *     &lt;enumeration value="pti17_1"/>
 *     &lt;enumeration value="platformNumber"/>
 *     &lt;enumeration value="pti17_2"/>
 *     &lt;enumeration value="terminalGate"/>
 *     &lt;enumeration value="pti17_3"/>
 *     &lt;enumeration value="ferryBerth"/>
 *     &lt;enumeration value="pti17_4"/>
 *     &lt;enumeration value="harbourPier"/>
 *     &lt;enumeration value="pti17_5"/>
 *     &lt;enumeration value="landingStage"/>
 *     &lt;enumeration value="pti17_6"/>
 *     &lt;enumeration value="busStop"/>
 *     &lt;enumeration value="pti17_255"/>
 *     &lt;enumeration value="undefinedBookingInformation"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "StopPointTypeEnumeration")
@XmlEnum
public enum StopPointTypeEnumeration {

    @XmlEnumValue("pti17_0")
    PTI_17_0("pti17_0"),
    @XmlEnumValue("unknown")
    UNKNOWN("unknown"),
    @XmlEnumValue("pti17_1")
    PTI_17_1("pti17_1"),
    @XmlEnumValue("platformNumber")
    PLATFORM_NUMBER("platformNumber"),
    @XmlEnumValue("pti17_2")
    PTI_17_2("pti17_2"),
    @XmlEnumValue("terminalGate")
    TERMINAL_GATE("terminalGate"),
    @XmlEnumValue("pti17_3")
    PTI_17_3("pti17_3"),
    @XmlEnumValue("ferryBerth")
    FERRY_BERTH("ferryBerth"),
    @XmlEnumValue("pti17_4")
    PTI_17_4("pti17_4"),
    @XmlEnumValue("harbourPier")
    HARBOUR_PIER("harbourPier"),
    @XmlEnumValue("pti17_5")
    PTI_17_5("pti17_5"),
    @XmlEnumValue("landingStage")
    LANDING_STAGE("landingStage"),
    @XmlEnumValue("pti17_6")
    PTI_17_6("pti17_6"),
    @XmlEnumValue("busStop")
    BUS_STOP("busStop"),
    @XmlEnumValue("pti17_255")
    PTI_17_255("pti17_255"),
    @XmlEnumValue("undefinedBookingInformation")
    UNDEFINED_BOOKING_INFORMATION("undefinedBookingInformation");
    private final String value;

    StopPointTypeEnumeration(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static StopPointTypeEnumeration fromValue(String v) {
        for (StopPointTypeEnumeration c: StopPointTypeEnumeration.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
