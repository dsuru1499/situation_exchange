
package eu.datex2.schema._2_0rc1._2_0;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour ReferencePointDirectionEnum.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * <p>
 * <pre>
 * &lt;simpleType name="ReferencePointDirectionEnum">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="both"/>
 *     &lt;enumeration value="negative"/>
 *     &lt;enumeration value="positive"/>
 *     &lt;enumeration value="unknown"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ReferencePointDirectionEnum")
@XmlEnum
public enum ReferencePointDirectionEnum {

    @XmlEnumValue("both")
    BOTH("both"),
    @XmlEnumValue("negative")
    NEGATIVE("negative"),
    @XmlEnumValue("positive")
    POSITIVE("positive"),
    @XmlEnumValue("unknown")
    UNKNOWN("unknown");
    private final String value;

    ReferencePointDirectionEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ReferencePointDirectionEnum fromValue(String v) {
        for (ReferencePointDirectionEnum c: ReferencePointDirectionEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
