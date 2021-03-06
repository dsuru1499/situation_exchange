
package uk.org.ifopt.ifopt;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour PathUpDownEnumeration.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * <p>
 * <pre>
 * &lt;simpleType name="PathUpDownEnumeration">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN">
 *     &lt;enumeration value="up"/>
 *     &lt;enumeration value="down"/>
 *     &lt;enumeration value="level"/>
 *     &lt;enumeration value="upAndDown"/>
 *     &lt;enumeration value="downAndUp"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "PathUpDownEnumeration")
@XmlEnum
public enum PathUpDownEnumeration {

    @XmlEnumValue("up")
    UP("up"),
    @XmlEnumValue("down")
    DOWN("down"),
    @XmlEnumValue("level")
    LEVEL("level"),
    @XmlEnumValue("upAndDown")
    UP_AND_DOWN("upAndDown"),
    @XmlEnumValue("downAndUp")
    DOWN_AND_UP("downAndUp");
    private final String value;

    PathUpDownEnumeration(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static PathUpDownEnumeration fromValue(String v) {
        for (PathUpDownEnumeration c: PathUpDownEnumeration.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
