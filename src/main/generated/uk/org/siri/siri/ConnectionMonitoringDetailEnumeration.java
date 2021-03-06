
package uk.org.siri.siri;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour ConnectionMonitoringDetailEnumeration.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * <p>
 * <pre>
 * &lt;simpleType name="ConnectionMonitoringDetailEnumeration">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN">
 *     &lt;enumeration value="minimum"/>
 *     &lt;enumeration value="basic"/>
 *     &lt;enumeration value="normal"/>
 *     &lt;enumeration value="full"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ConnectionMonitoringDetailEnumeration")
@XmlEnum
public enum ConnectionMonitoringDetailEnumeration {


    /**
     * Return only the minimum amount of optional data for each Stop Visit to provide a display, A time at stop, LINE name and destination name.
     * 
     */
    @XmlEnumValue("minimum")
    MINIMUM("minimum"),

    /**
     * Return minimum and other available basic details for each Stop Visit. Do not include data on times at next stop or destination.
     * 
     */
    @XmlEnumValue("basic")
    BASIC("basic"),

    /**
     * Return all basic data, and also origin VIA points and destination.
     * 
     */
    @XmlEnumValue("normal")
    NORMAL("normal"),

    /**
     * Return all available data for each Stop Visit, including calls.
     * 
     */
    @XmlEnumValue("full")
    FULL("full");
    private final String value;

    ConnectionMonitoringDetailEnumeration(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ConnectionMonitoringDetailEnumeration fromValue(String v) {
        for (ConnectionMonitoringDetailEnumeration c: ConnectionMonitoringDetailEnumeration.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
