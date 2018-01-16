
package uk.org.siri.siri;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour BoardingActivityEnumeration.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * <p>
 * <pre>
 * &lt;simpleType name="BoardingActivityEnumeration">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN">
 *     &lt;enumeration value="boardingAndAlighting"/>
 *     &lt;enumeration value="noBoarding"/>
 *     &lt;enumeration value="noAlighting"/>
 *     &lt;enumeration value="passThru"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "BoardingActivityEnumeration")
@XmlEnum
public enum BoardingActivityEnumeration {

    @XmlEnumValue("boardingAndAlighting")
    BOARDING_AND_ALIGHTING("boardingAndAlighting"),
    @XmlEnumValue("noBoarding")
    NO_BOARDING("noBoarding"),
    @XmlEnumValue("noAlighting")
    NO_ALIGHTING("noAlighting"),
    @XmlEnumValue("passThru")
    PASS_THRU("passThru");
    private final String value;

    BoardingActivityEnumeration(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static BoardingActivityEnumeration fromValue(String v) {
        for (BoardingActivityEnumeration c: BoardingActivityEnumeration.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
