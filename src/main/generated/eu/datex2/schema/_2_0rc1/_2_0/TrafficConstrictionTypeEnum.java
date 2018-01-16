
package eu.datex2.schema._2_0rc1._2_0;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour TrafficConstrictionTypeEnum.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * <p>
 * <pre>
 * &lt;simpleType name="TrafficConstrictionTypeEnum">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="carriagewayBlocked"/>
 *     &lt;enumeration value="carriagewayPartiallyObstructed"/>
 *     &lt;enumeration value="lanesBlocked"/>
 *     &lt;enumeration value="lanesPartiallyObstructed"/>
 *     &lt;enumeration value="roadBlocked"/>
 *     &lt;enumeration value="roadPartiallyObstructed"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "TrafficConstrictionTypeEnum")
@XmlEnum
public enum TrafficConstrictionTypeEnum {

    @XmlEnumValue("carriagewayBlocked")
    CARRIAGEWAY_BLOCKED("carriagewayBlocked"),
    @XmlEnumValue("carriagewayPartiallyObstructed")
    CARRIAGEWAY_PARTIALLY_OBSTRUCTED("carriagewayPartiallyObstructed"),
    @XmlEnumValue("lanesBlocked")
    LANES_BLOCKED("lanesBlocked"),
    @XmlEnumValue("lanesPartiallyObstructed")
    LANES_PARTIALLY_OBSTRUCTED("lanesPartiallyObstructed"),
    @XmlEnumValue("roadBlocked")
    ROAD_BLOCKED("roadBlocked"),
    @XmlEnumValue("roadPartiallyObstructed")
    ROAD_PARTIALLY_OBSTRUCTED("roadPartiallyObstructed");
    private final String value;

    TrafficConstrictionTypeEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TrafficConstrictionTypeEnum fromValue(String v) {
        for (TrafficConstrictionTypeEnum c: TrafficConstrictionTypeEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
