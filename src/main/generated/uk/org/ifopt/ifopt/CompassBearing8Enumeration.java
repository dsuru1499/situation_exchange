
package uk.org.ifopt.ifopt;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour CompassBearing8Enumeration.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * <p>
 * <pre>
 * &lt;simpleType name="CompassBearing8Enumeration">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="SW"/>
 *     &lt;enumeration value="SE"/>
 *     &lt;enumeration value="NW"/>
 *     &lt;enumeration value="NE"/>
 *     &lt;enumeration value="W"/>
 *     &lt;enumeration value="E"/>
 *     &lt;enumeration value="S"/>
 *     &lt;enumeration value="N"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "CompassBearing8Enumeration")
@XmlEnum
public enum CompassBearing8Enumeration {

    SW,
    SE,
    NW,
    NE,
    W,
    E,
    S,
    N;

    public String value() {
        return name();
    }

    public static CompassBearing8Enumeration fromValue(String v) {
        return valueOf(v);
    }

}
