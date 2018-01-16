
package uk.org.siri.siri;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour ConnectionLinksDetailEnumeration.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * <p>
 * <pre>
 * &lt;simpleType name="ConnectionLinksDetailEnumeration">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN">
 *     &lt;enumeration value="minimum"/>
 *     &lt;enumeration value="normal"/>
 *     &lt;enumeration value="full"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ConnectionLinksDetailEnumeration")
@XmlEnum
public enum ConnectionLinksDetailEnumeration {


    /**
     * Return only the name and identifier of the connection link.
     * 
     */
    @XmlEnumValue("minimum")
    MINIMUM("minimum"),

    /**
     * Return name, identifier of the connection link and connected stops's identifiers.
     * 
     */
    @XmlEnumValue("normal")
    NORMAL("normal"),

    /**
     * Return all available data for each connection link.
     * 
     */
    @XmlEnumValue("full")
    FULL("full");
    private final String value;

    ConnectionLinksDetailEnumeration(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ConnectionLinksDetailEnumeration fromValue(String v) {
        for (ConnectionLinksDetailEnumeration c: ConnectionLinksDetailEnumeration.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
