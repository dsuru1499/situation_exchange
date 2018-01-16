
package eu.datex2.schema._2_0rc1._2_0;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour ChangedFlagEnum.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * <p>
 * <pre>
 * &lt;simpleType name="ChangedFlagEnum">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="catalogue"/>
 *     &lt;enumeration value="filter"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ChangedFlagEnum")
@XmlEnum
public enum ChangedFlagEnum {

    @XmlEnumValue("catalogue")
    CATALOGUE("catalogue"),
    @XmlEnumValue("filter")
    FILTER("filter");
    private final String value;

    ChangedFlagEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ChangedFlagEnum fromValue(String v) {
        for (ChangedFlagEnum c: ChangedFlagEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
