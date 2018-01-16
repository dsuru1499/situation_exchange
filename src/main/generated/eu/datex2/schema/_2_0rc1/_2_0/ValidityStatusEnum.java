
package eu.datex2.schema._2_0rc1._2_0;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour ValidityStatusEnum.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * <p>
 * <pre>
 * &lt;simpleType name="ValidityStatusEnum">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="active"/>
 *     &lt;enumeration value="suspended"/>
 *     &lt;enumeration value="definedByValidityTimeSpec"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ValidityStatusEnum")
@XmlEnum
public enum ValidityStatusEnum {

    @XmlEnumValue("active")
    ACTIVE("active"),
    @XmlEnumValue("suspended")
    SUSPENDED("suspended"),
    @XmlEnumValue("definedByValidityTimeSpec")
    DEFINED_BY_VALIDITY_TIME_SPEC("definedByValidityTimeSpec");
    private final String value;

    ValidityStatusEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ValidityStatusEnum fromValue(String v) {
        for (ValidityStatusEnum c: ValidityStatusEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
