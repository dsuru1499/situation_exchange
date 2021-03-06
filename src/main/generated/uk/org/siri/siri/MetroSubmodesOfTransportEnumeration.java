
package uk.org.siri.siri;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour MetroSubmodesOfTransportEnumeration.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * <p>
 * <pre>
 * &lt;simpleType name="MetroSubmodesOfTransportEnumeration">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN">
 *     &lt;enumeration value="pti4_0"/>
 *     &lt;enumeration value="unknown"/>
 *     &lt;enumeration value="pti4_1"/>
 *     &lt;enumeration value="metro"/>
 *     &lt;enumeration value="pti4_2"/>
 *     &lt;enumeration value="tube"/>
 *     &lt;enumeration value="pti4_3"/>
 *     &lt;enumeration value="urbanRailway"/>
 *     &lt;enumeration value="pti4_4"/>
 *     &lt;enumeration value="allRailServices"/>
 *     &lt;enumeration value="pti4_255"/>
 *     &lt;enumeration value="undefined"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "MetroSubmodesOfTransportEnumeration")
@XmlEnum
public enum MetroSubmodesOfTransportEnumeration {

    @XmlEnumValue("pti4_0")
    PTI_4_0("pti4_0"),
    @XmlEnumValue("unknown")
    UNKNOWN("unknown"),
    @XmlEnumValue("pti4_1")
    PTI_4_1("pti4_1"),
    @XmlEnumValue("metro")
    METRO("metro"),
    @XmlEnumValue("pti4_2")
    PTI_4_2("pti4_2"),
    @XmlEnumValue("tube")
    TUBE("tube"),
    @XmlEnumValue("pti4_3")
    PTI_4_3("pti4_3"),
    @XmlEnumValue("urbanRailway")
    URBAN_RAILWAY("urbanRailway"),
    @XmlEnumValue("pti4_4")
    PTI_4_4("pti4_4"),
    @XmlEnumValue("allRailServices")
    ALL_RAIL_SERVICES("allRailServices"),
    @XmlEnumValue("pti4_255")
    PTI_4_255("pti4_255"),
    @XmlEnumValue("undefined")
    UNDEFINED("undefined");
    private final String value;

    MetroSubmodesOfTransportEnumeration(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static MetroSubmodesOfTransportEnumeration fromValue(String v) {
        for (MetroSubmodesOfTransportEnumeration c: MetroSubmodesOfTransportEnumeration.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
