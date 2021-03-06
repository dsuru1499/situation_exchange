
package eu.datex2.schema._2_0rc1._2_0;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour TpegLoc02DirectionTypeEnum.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * <p>
 * <pre>
 * &lt;simpleType name="TpegLoc02DirectionTypeEnum">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="allDirections"/>
 *     &lt;enumeration value="anticlockwise"/>
 *     &lt;enumeration value="bothWays"/>
 *     &lt;enumeration value="clockwise"/>
 *     &lt;enumeration value="eastBound"/>
 *     &lt;enumeration value="innerRing"/>
 *     &lt;enumeration value="northBound"/>
 *     &lt;enumeration value="northEastBound"/>
 *     &lt;enumeration value="northWestBound"/>
 *     &lt;enumeration value="opposite"/>
 *     &lt;enumeration value="outerRing"/>
 *     &lt;enumeration value="southBound"/>
 *     &lt;enumeration value="southEastBound"/>
 *     &lt;enumeration value="southWestBound"/>
 *     &lt;enumeration value="westBound"/>
 *     &lt;enumeration value="unknown"/>
 *     &lt;enumeration value="other"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "TpegLoc02DirectionTypeEnum")
@XmlEnum
public enum TpegLoc02DirectionTypeEnum {

    @XmlEnumValue("allDirections")
    ALL_DIRECTIONS("allDirections"),
    @XmlEnumValue("anticlockwise")
    ANTICLOCKWISE("anticlockwise"),
    @XmlEnumValue("bothWays")
    BOTH_WAYS("bothWays"),
    @XmlEnumValue("clockwise")
    CLOCKWISE("clockwise"),
    @XmlEnumValue("eastBound")
    EAST_BOUND("eastBound"),
    @XmlEnumValue("innerRing")
    INNER_RING("innerRing"),
    @XmlEnumValue("northBound")
    NORTH_BOUND("northBound"),
    @XmlEnumValue("northEastBound")
    NORTH_EAST_BOUND("northEastBound"),
    @XmlEnumValue("northWestBound")
    NORTH_WEST_BOUND("northWestBound"),
    @XmlEnumValue("opposite")
    OPPOSITE("opposite"),
    @XmlEnumValue("outerRing")
    OUTER_RING("outerRing"),
    @XmlEnumValue("southBound")
    SOUTH_BOUND("southBound"),
    @XmlEnumValue("southEastBound")
    SOUTH_EAST_BOUND("southEastBound"),
    @XmlEnumValue("southWestBound")
    SOUTH_WEST_BOUND("southWestBound"),
    @XmlEnumValue("westBound")
    WEST_BOUND("westBound"),
    @XmlEnumValue("unknown")
    UNKNOWN("unknown"),
    @XmlEnumValue("other")
    OTHER("other");
    private final String value;

    TpegLoc02DirectionTypeEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TpegLoc02DirectionTypeEnum fromValue(String v) {
        for (TpegLoc02DirectionTypeEnum c: TpegLoc02DirectionTypeEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
