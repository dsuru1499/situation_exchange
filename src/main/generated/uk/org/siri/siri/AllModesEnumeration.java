
package uk.org.siri.siri;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour AllModesEnumeration.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * <p>
 * <pre>
 * &lt;simpleType name="AllModesEnumeration">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN">
 *     &lt;enumeration value="walk"/>
 *     &lt;enumeration value="car"/>
 *     &lt;enumeration value="taxi"/>
 *     &lt;enumeration value="cycle"/>
 *     &lt;enumeration value="drt"/>
 *     &lt;enumeration value="movingWalkway"/>
 *     &lt;enumeration value="through"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "AllModesEnumeration")
@XmlEnum
public enum AllModesEnumeration {

    @XmlEnumValue("walk")
    WALK("walk"),
    @XmlEnumValue("car")
    CAR("car"),
    @XmlEnumValue("taxi")
    TAXI("taxi"),
    @XmlEnumValue("cycle")
    CYCLE("cycle"),
    @XmlEnumValue("drt")
    DRT("drt"),
    @XmlEnumValue("movingWalkway")
    MOVING_WALKWAY("movingWalkway"),
    @XmlEnumValue("through")
    THROUGH("through");
    private final String value;

    AllModesEnumeration(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static AllModesEnumeration fromValue(String v) {
        for (AllModesEnumeration c: AllModesEnumeration.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
