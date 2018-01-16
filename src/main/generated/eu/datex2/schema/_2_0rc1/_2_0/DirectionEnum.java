
package eu.datex2.schema._2_0rc1._2_0;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour DirectionEnum.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * <p>
 * <pre>
 * &lt;simpleType name="DirectionEnum">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="anticlockwise"/>
 *     &lt;enumeration value="clockwise"/>
 *     &lt;enumeration value="northBound"/>
 *     &lt;enumeration value="northEastBound"/>
 *     &lt;enumeration value="eastBound"/>
 *     &lt;enumeration value="southEastBound"/>
 *     &lt;enumeration value="southBound"/>
 *     &lt;enumeration value="southWestBound"/>
 *     &lt;enumeration value="westBound"/>
 *     &lt;enumeration value="northWestBound"/>
 *     &lt;enumeration value="inboundTowardsTown"/>
 *     &lt;enumeration value="outboundFromTown"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "DirectionEnum")
@XmlEnum
public enum DirectionEnum {

    @XmlEnumValue("anticlockwise")
    ANTICLOCKWISE("anticlockwise"),
    @XmlEnumValue("clockwise")
    CLOCKWISE("clockwise"),
    @XmlEnumValue("northBound")
    NORTH_BOUND("northBound"),
    @XmlEnumValue("northEastBound")
    NORTH_EAST_BOUND("northEastBound"),
    @XmlEnumValue("eastBound")
    EAST_BOUND("eastBound"),
    @XmlEnumValue("southEastBound")
    SOUTH_EAST_BOUND("southEastBound"),
    @XmlEnumValue("southBound")
    SOUTH_BOUND("southBound"),
    @XmlEnumValue("southWestBound")
    SOUTH_WEST_BOUND("southWestBound"),
    @XmlEnumValue("westBound")
    WEST_BOUND("westBound"),
    @XmlEnumValue("northWestBound")
    NORTH_WEST_BOUND("northWestBound"),
    @XmlEnumValue("inboundTowardsTown")
    INBOUND_TOWARDS_TOWN("inboundTowardsTown"),
    @XmlEnumValue("outboundFromTown")
    OUTBOUND_FROM_TOWN("outboundFromTown");
    private final String value;

    DirectionEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static DirectionEnum fromValue(String v) {
        for (DirectionEnum c: DirectionEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
