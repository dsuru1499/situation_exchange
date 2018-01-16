
package uk.org.siri.siri;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour ScopeTypeEnumeration.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * <p>
 * <pre>
 * &lt;simpleType name="ScopeTypeEnumeration">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN">
 *     &lt;enumeration value="general"/>
 *     &lt;enumeration value="operator"/>
 *     &lt;enumeration value="network"/>
 *     &lt;enumeration value="route"/>
 *     &lt;enumeration value="line"/>
 *     &lt;enumeration value="place"/>
 *     &lt;enumeration value="stopPlace"/>
 *     &lt;enumeration value="stopPlaceComponent"/>
 *     &lt;enumeration value="stopPoint"/>
 *     &lt;enumeration value="vehicleJourney"/>
 *     &lt;enumeration value="datedVehicleJourney"/>
 *     &lt;enumeration value="connectionLink"/>
 *     &lt;enumeration value="interchange"/>
 *     &lt;enumeration value="allPT"/>
 *     &lt;enumeration value="road"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ScopeTypeEnumeration")
@XmlEnum
public enum ScopeTypeEnumeration {

    @XmlEnumValue("general")
    GENERAL("general"),
    @XmlEnumValue("operator")
    OPERATOR("operator"),
    @XmlEnumValue("network")
    NETWORK("network"),
    @XmlEnumValue("route")
    ROUTE("route"),
    @XmlEnumValue("line")
    LINE("line"),
    @XmlEnumValue("place")
    PLACE("place"),
    @XmlEnumValue("stopPlace")
    STOP_PLACE("stopPlace"),
    @XmlEnumValue("stopPlaceComponent")
    STOP_PLACE_COMPONENT("stopPlaceComponent"),
    @XmlEnumValue("stopPoint")
    STOP_POINT("stopPoint"),
    @XmlEnumValue("vehicleJourney")
    VEHICLE_JOURNEY("vehicleJourney"),
    @XmlEnumValue("datedVehicleJourney")
    DATED_VEHICLE_JOURNEY("datedVehicleJourney"),
    @XmlEnumValue("connectionLink")
    CONNECTION_LINK("connectionLink"),
    @XmlEnumValue("interchange")
    INTERCHANGE("interchange"),
    @XmlEnumValue("allPT")
    ALL_PT("allPT"),
    @XmlEnumValue("road")
    ROAD("road");
    private final String value;

    ScopeTypeEnumeration(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ScopeTypeEnumeration fromValue(String v) {
        for (ScopeTypeEnumeration c: ScopeTypeEnumeration.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
