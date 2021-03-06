
package eu.datex2.schema._2_0rc1._2_0;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour TravelTimeTrendTypeEnum.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * <p>
 * <pre>
 * &lt;simpleType name="TravelTimeTrendTypeEnum">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="decreasing"/>
 *     &lt;enumeration value="increasing"/>
 *     &lt;enumeration value="stable"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "TravelTimeTrendTypeEnum")
@XmlEnum
public enum TravelTimeTrendTypeEnum {

    @XmlEnumValue("decreasing")
    DECREASING("decreasing"),
    @XmlEnumValue("increasing")
    INCREASING("increasing"),
    @XmlEnumValue("stable")
    STABLE("stable");
    private final String value;

    TravelTimeTrendTypeEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TravelTimeTrendTypeEnum fromValue(String v) {
        for (TravelTimeTrendTypeEnum c: TravelTimeTrendTypeEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
