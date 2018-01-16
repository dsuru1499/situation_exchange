
package eu.datex2.schema._2_0rc1._2_0;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour DirectionCompassEnum.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * <p>
 * <pre>
 * &lt;simpleType name="DirectionCompassEnum">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="east"/>
 *     &lt;enumeration value="eastNorthEast"/>
 *     &lt;enumeration value="eastSouthEast"/>
 *     &lt;enumeration value="north"/>
 *     &lt;enumeration value="northEast"/>
 *     &lt;enumeration value="northNorthEast"/>
 *     &lt;enumeration value="northNorthWest"/>
 *     &lt;enumeration value="northWest"/>
 *     &lt;enumeration value="south"/>
 *     &lt;enumeration value="southEast"/>
 *     &lt;enumeration value="southSouthEast"/>
 *     &lt;enumeration value="southSouthWest"/>
 *     &lt;enumeration value="southWest"/>
 *     &lt;enumeration value="west"/>
 *     &lt;enumeration value="westNorthWest"/>
 *     &lt;enumeration value="westSouthWest"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "DirectionCompassEnum")
@XmlEnum
public enum DirectionCompassEnum {

    @XmlEnumValue("east")
    EAST("east"),
    @XmlEnumValue("eastNorthEast")
    EAST_NORTH_EAST("eastNorthEast"),
    @XmlEnumValue("eastSouthEast")
    EAST_SOUTH_EAST("eastSouthEast"),
    @XmlEnumValue("north")
    NORTH("north"),
    @XmlEnumValue("northEast")
    NORTH_EAST("northEast"),
    @XmlEnumValue("northNorthEast")
    NORTH_NORTH_EAST("northNorthEast"),
    @XmlEnumValue("northNorthWest")
    NORTH_NORTH_WEST("northNorthWest"),
    @XmlEnumValue("northWest")
    NORTH_WEST("northWest"),
    @XmlEnumValue("south")
    SOUTH("south"),
    @XmlEnumValue("southEast")
    SOUTH_EAST("southEast"),
    @XmlEnumValue("southSouthEast")
    SOUTH_SOUTH_EAST("southSouthEast"),
    @XmlEnumValue("southSouthWest")
    SOUTH_SOUTH_WEST("southSouthWest"),
    @XmlEnumValue("southWest")
    SOUTH_WEST("southWest"),
    @XmlEnumValue("west")
    WEST("west"),
    @XmlEnumValue("westNorthWest")
    WEST_NORTH_WEST("westNorthWest"),
    @XmlEnumValue("westSouthWest")
    WEST_SOUTH_WEST("westSouthWest");
    private final String value;

    DirectionCompassEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static DirectionCompassEnum fromValue(String v) {
        for (DirectionCompassEnum c: DirectionCompassEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
