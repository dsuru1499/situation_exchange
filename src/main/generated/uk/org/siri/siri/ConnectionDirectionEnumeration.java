
package uk.org.siri.siri;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour ConnectionDirectionEnumeration.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * <p>
 * <pre>
 * &lt;simpleType name="ConnectionDirectionEnumeration">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN">
 *     &lt;enumeration value="to"/>
 *     &lt;enumeration value="from"/>
 *     &lt;enumeration value="both"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ConnectionDirectionEnumeration")
@XmlEnum
public enum ConnectionDirectionEnumeration {

    @XmlEnumValue("to")
    TO("to"),
    @XmlEnumValue("from")
    FROM("from"),
    @XmlEnumValue("both")
    BOTH("both");
    private final String value;

    ConnectionDirectionEnumeration(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ConnectionDirectionEnumeration fromValue(String v) {
        for (ConnectionDirectionEnumeration c: ConnectionDirectionEnumeration.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
