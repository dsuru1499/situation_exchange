
package uk.org.siri.siri;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour LuggageFacilityEnumeration.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * <p>
 * <pre>
 * &lt;simpleType name="LuggageFacilityEnumeration">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN">
 *     &lt;enumeration value="unknown"/>
 *     &lt;enumeration value="pti23_17"/>
 *     &lt;enumeration value="bikeCarriage"/>
 *     &lt;enumeration value="baggageStorage"/>
 *     &lt;enumeration value="leftLuggage"/>
 *     &lt;enumeration value="porterage"/>
 *     &lt;enumeration value="baggageTrolleys"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "LuggageFacilityEnumeration")
@XmlEnum
public enum LuggageFacilityEnumeration {

    @XmlEnumValue("unknown")
    UNKNOWN("unknown"),
    @XmlEnumValue("pti23_17")
    PTI_23_17("pti23_17"),
    @XmlEnumValue("bikeCarriage")
    BIKE_CARRIAGE("bikeCarriage"),
    @XmlEnumValue("baggageStorage")
    BAGGAGE_STORAGE("baggageStorage"),
    @XmlEnumValue("leftLuggage")
    LEFT_LUGGAGE("leftLuggage"),
    @XmlEnumValue("porterage")
    PORTERAGE("porterage"),
    @XmlEnumValue("baggageTrolleys")
    BAGGAGE_TROLLEYS("baggageTrolleys");
    private final String value;

    LuggageFacilityEnumeration(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static LuggageFacilityEnumeration fromValue(String v) {
        for (LuggageFacilityEnumeration c: LuggageFacilityEnumeration.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
