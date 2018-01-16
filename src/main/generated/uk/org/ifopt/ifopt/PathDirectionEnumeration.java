
package uk.org.ifopt.ifopt;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour PathDirectionEnumeration.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * <p>
 * <pre>
 * &lt;simpleType name="PathDirectionEnumeration">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN">
 *     &lt;enumeration value="oneWay"/>
 *     &lt;enumeration value="twoWay"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "PathDirectionEnumeration")
@XmlEnum
public enum PathDirectionEnumeration {

    @XmlEnumValue("oneWay")
    ONE_WAY("oneWay"),
    @XmlEnumValue("twoWay")
    TWO_WAY("twoWay");
    private final String value;

    PathDirectionEnumeration(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static PathDirectionEnumeration fromValue(String v) {
        for (PathDirectionEnumeration c: PathDirectionEnumeration.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
