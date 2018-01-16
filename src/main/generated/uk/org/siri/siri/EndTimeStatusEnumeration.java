
package uk.org.siri.siri;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour EndTimeStatusEnumeration.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * <p>
 * <pre>
 * &lt;simpleType name="EndTimeStatusEnumeration">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="undefined"/>
 *     &lt;enumeration value="longTerm"/>
 *     &lt;enumeration value="shortTerm"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "EndTimeStatusEnumeration")
@XmlEnum
public enum EndTimeStatusEnumeration {

    @XmlEnumValue("undefined")
    UNDEFINED("undefined"),
    @XmlEnumValue("longTerm")
    LONG_TERM("longTerm"),
    @XmlEnumValue("shortTerm")
    SHORT_TERM("shortTerm");
    private final String value;

    EndTimeStatusEnumeration(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static EndTimeStatusEnumeration fromValue(String v) {
        for (EndTimeStatusEnumeration c: EndTimeStatusEnumeration.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
