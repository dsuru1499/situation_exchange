
package uk.org.ifopt.ifopt;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour PassageTypeEnumeration.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * <p>
 * <pre>
 * &lt;simpleType name="PassageTypeEnumeration">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="none"/>
 *     &lt;enumeration value="pathway"/>
 *     &lt;enumeration value="corridor"/>
 *     &lt;enumeration value="overpass"/>
 *     &lt;enumeration value="underpass"/>
 *     &lt;enumeration value="tunnel"/>
 *     &lt;enumeration value="other"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "PassageTypeEnumeration")
@XmlEnum
public enum PassageTypeEnumeration {

    @XmlEnumValue("none")
    NONE("none"),
    @XmlEnumValue("pathway")
    PATHWAY("pathway"),
    @XmlEnumValue("corridor")
    CORRIDOR("corridor"),
    @XmlEnumValue("overpass")
    OVERPASS("overpass"),
    @XmlEnumValue("underpass")
    UNDERPASS("underpass"),
    @XmlEnumValue("tunnel")
    TUNNEL("tunnel"),
    @XmlEnumValue("other")
    OTHER("other");
    private final String value;

    PassageTypeEnumeration(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static PassageTypeEnumeration fromValue(String v) {
        for (PassageTypeEnumeration c: PassageTypeEnumeration.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
