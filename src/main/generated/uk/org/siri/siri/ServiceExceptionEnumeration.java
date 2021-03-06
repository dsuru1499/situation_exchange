
package uk.org.siri.siri;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour ServiceExceptionEnumeration.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * <p>
 * <pre>
 * &lt;simpleType name="ServiceExceptionEnumeration">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN">
 *     &lt;enumeration value="beforeFirstJourney"/>
 *     &lt;enumeration value="afterLastJourney"/>
 *     &lt;enumeration value="noServiceToday"/>
 *     &lt;enumeration value="transportTemporarilySuspended"/>
 *     &lt;enumeration value="transportLongtermSuspended"/>
 *     &lt;enumeration value="transportSeverlyDisrupted"/>
 *     &lt;enumeration value="realtimeDataNotAvailable"/>
 *     &lt;enumeration value="realtimeDataAvailable"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ServiceExceptionEnumeration")
@XmlEnum
public enum ServiceExceptionEnumeration {


    /**
     * No transport services returned because currently before first journey of day.
     * 
     */
    @XmlEnumValue("beforeFirstJourney")
    BEFORE_FIRST_JOURNEY("beforeFirstJourney"),

    /**
     * No transport services returned because currently after first journey of day.
     * 
     */
    @XmlEnumValue("afterLastJourney")
    AFTER_LAST_JOURNEY("afterLastJourney"),

    /**
     * No transport services returned because no services today.
     * 
     */
    @XmlEnumValue("noServiceToday")
    NO_SERVICE_TODAY("noServiceToday"),

    /**
     * No transport services returned because services currently suspended.
     * 
     */
    @XmlEnumValue("transportTemporarilySuspended")
    TRANSPORT_TEMPORARILY_SUSPENDED("transportTemporarilySuspended"),

    /**
     * No transport services returned because prolonged suspension of services.
     * 
     */
    @XmlEnumValue("transportLongtermSuspended")
    TRANSPORT_LONGTERM_SUSPENDED("transportLongtermSuspended"),

    /**
     * Transport services returned subject to severe disruptions.
     * 
     */
    @XmlEnumValue("transportSeverlyDisrupted")
    TRANSPORT_SEVERLY_DISRUPTED("transportSeverlyDisrupted"),

    /**
     * No transport services returned because real-time services not available. 
     * 
     */
    @XmlEnumValue("realtimeDataNotAvailable")
    REALTIME_DATA_NOT_AVAILABLE("realtimeDataNotAvailable"),
    @XmlEnumValue("realtimeDataAvailable")
    REALTIME_DATA_AVAILABLE("realtimeDataAvailable");
    private final String value;

    ServiceExceptionEnumeration(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ServiceExceptionEnumeration fromValue(String v) {
        for (ServiceExceptionEnumeration c: ServiceExceptionEnumeration.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
