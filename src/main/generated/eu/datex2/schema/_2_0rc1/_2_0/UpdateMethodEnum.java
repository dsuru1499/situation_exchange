
package eu.datex2.schema._2_0rc1._2_0;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour UpdateMethodEnum.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * <p>
 * <pre>
 * &lt;simpleType name="UpdateMethodEnum">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="allElementUpdate"/>
 *     &lt;enumeration value="singleElementUpdate"/>
 *     &lt;enumeration value="snapshot"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "UpdateMethodEnum")
@XmlEnum
public enum UpdateMethodEnum {

    @XmlEnumValue("allElementUpdate")
    ALL_ELEMENT_UPDATE("allElementUpdate"),
    @XmlEnumValue("singleElementUpdate")
    SINGLE_ELEMENT_UPDATE("singleElementUpdate"),
    @XmlEnumValue("snapshot")
    SNAPSHOT("snapshot");
    private final String value;

    UpdateMethodEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static UpdateMethodEnum fromValue(String v) {
        for (UpdateMethodEnum c: UpdateMethodEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
