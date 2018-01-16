
package uk.org.siri.siri;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour VehicleStatusEnumeration.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * <p>
 * <pre>
 * &lt;simpleType name="VehicleStatusEnumeration">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN">
 *     &lt;enumeration value="expected"/>
 *     &lt;enumeration value="notExpected"/>
 *     &lt;enumeration value="cancelled"/>
 *     &lt;enumeration value="assigned"/>
 *     &lt;enumeration value="signedOn"/>
 *     &lt;enumeration value="atOrigin"/>
 *     &lt;enumeration value="inProgress"/>
 *     &lt;enumeration value="aborted"/>
 *     &lt;enumeration value="offRoute"/>
 *     &lt;enumeration value="completed"/>
 *     &lt;enumeration value="assumedCompleted"/>
 *     &lt;enumeration value="notRun"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "VehicleStatusEnumeration")
@XmlEnum
public enum VehicleStatusEnumeration {


    /**
     * Service is expected to be performed.
     * 
     */
    @XmlEnumValue("expected")
    EXPECTED("expected"),

    /**
     * Service is not expected to be run. For instance a flexible service that has not yet been preordered.
     * 
     */
    @XmlEnumValue("notExpected")
    NOT_EXPECTED("notExpected"),
    @XmlEnumValue("cancelled")
    CANCELLED("cancelled"),
    @XmlEnumValue("assigned")
    ASSIGNED("assigned"),
    @XmlEnumValue("signedOn")
    SIGNED_ON("signedOn"),
    @XmlEnumValue("atOrigin")
    AT_ORIGIN("atOrigin"),

    /**
     * Service has departed from first stop.
     * 
     */
    @XmlEnumValue("inProgress")
    IN_PROGRESS("inProgress"),
    @XmlEnumValue("aborted")
    ABORTED("aborted"),
    @XmlEnumValue("offRoute")
    OFF_ROUTE("offRoute"),

    /**
     * It has been detected that the Service was completed.
     * 
     */
    @XmlEnumValue("completed")
    COMPLETED("completed"),

    /**
     * It is assumed that the Service has completed.
     * 
     */
    @XmlEnumValue("assumedCompleted")
    ASSUMED_COMPLETED("assumedCompleted"),
    @XmlEnumValue("notRun")
    NOT_RUN("notRun");
    private final String value;

    VehicleStatusEnumeration(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static VehicleStatusEnumeration fromValue(String v) {
        for (VehicleStatusEnumeration c: VehicleStatusEnumeration.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
