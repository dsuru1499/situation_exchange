
package uk.org.siri.siri;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour VehicleMonitoringDetailEnumeration.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * <p>
 * <pre>
 * &lt;simpleType name="VehicleMonitoringDetailEnumeration">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN">
 *     &lt;enumeration value="minimum"/>
 *     &lt;enumeration value="basic"/>
 *     &lt;enumeration value="normal"/>
 *     &lt;enumeration value="calls"/>
 *     &lt;enumeration value="full"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "VehicleMonitoringDetailEnumeration")
@XmlEnum
public enum VehicleMonitoringDetailEnumeration {


    /**
     * Return only the minimum amount of optional data for each stop event to provide a display, A time, line name and destination name.
     * 
     */
    @XmlEnumValue("minimum")
    MINIMUM("minimum"),

    /**
     * Return minimum and other available basic details for each stop event. Do not include data on time at next stop or destination.
     * 
     */
    @XmlEnumValue("basic")
    BASIC("basic"),

    /**
     * Return all basic data, and also arrival times at DESTINATION.
     * 
     */
    @XmlEnumValue("normal")
    NORMAL("normal"),

    /**
     * Return all available data for each stop event, including previous and onward  CALLs with  passing times for JOURNEY PATTERN.
     * 
     */
    @XmlEnumValue("calls")
    CALLS("calls"),

    /**
     * Return all available data for each   including calls.
     * 
     */
    @XmlEnumValue("full")
    FULL("full");
    private final String value;

    VehicleMonitoringDetailEnumeration(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static VehicleMonitoringDetailEnumeration fromValue(String v) {
        for (VehicleMonitoringDetailEnumeration c: VehicleMonitoringDetailEnumeration.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
