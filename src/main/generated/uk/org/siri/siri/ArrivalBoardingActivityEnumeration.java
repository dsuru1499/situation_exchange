
package uk.org.siri.siri;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour ArrivalBoardingActivityEnumeration.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * <p>
 * <pre>
 * &lt;simpleType name="ArrivalBoardingActivityEnumeration">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN">
 *     &lt;enumeration value="alighting"/>
 *     &lt;enumeration value="noAlighting"/>
 *     &lt;enumeration value="passThru"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ArrivalBoardingActivityEnumeration")
@XmlEnum
public enum ArrivalBoardingActivityEnumeration {

    @XmlEnumValue("alighting")
    ALIGHTING("alighting"),
    @XmlEnumValue("noAlighting")
    NO_ALIGHTING("noAlighting"),
    @XmlEnumValue("passThru")
    PASS_THRU("passThru");
    private final String value;

    ArrivalBoardingActivityEnumeration(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ArrivalBoardingActivityEnumeration fromValue(String v) {
        for (ArrivalBoardingActivityEnumeration c: ArrivalBoardingActivityEnumeration.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}