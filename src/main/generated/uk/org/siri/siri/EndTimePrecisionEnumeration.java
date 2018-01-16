
package uk.org.siri.siri;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour EndTimePrecisionEnumeration.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * <p>
 * <pre>
 * &lt;simpleType name="EndTimePrecisionEnumeration">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="day"/>
 *     &lt;enumeration value="hour"/>
 *     &lt;enumeration value="second"/>
 *     &lt;enumeration value="milliSecond"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "EndTimePrecisionEnumeration")
@XmlEnum
public enum EndTimePrecisionEnumeration {

    @XmlEnumValue("day")
    DAY("day"),
    @XmlEnumValue("hour")
    HOUR("hour"),
    @XmlEnumValue("second")
    SECOND("second"),
    @XmlEnumValue("milliSecond")
    MILLI_SECOND("milliSecond");
    private final String value;

    EndTimePrecisionEnumeration(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static EndTimePrecisionEnumeration fromValue(String v) {
        for (EndTimePrecisionEnumeration c: EndTimePrecisionEnumeration.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
