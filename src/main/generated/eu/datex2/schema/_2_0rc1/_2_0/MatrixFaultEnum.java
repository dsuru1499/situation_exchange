
package eu.datex2.schema._2_0rc1._2_0;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour MatrixFaultEnum.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * <p>
 * <pre>
 * &lt;simpleType name="MatrixFaultEnum">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="communicationsFailure"/>
 *     &lt;enumeration value="incorrectAspectDisplayed"/>
 *     &lt;enumeration value="outOfService"/>
 *     &lt;enumeration value="powerFailure"/>
 *     &lt;enumeration value="unableToClearDown"/>
 *     &lt;enumeration value="unknown"/>
 *     &lt;enumeration value="other"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "MatrixFaultEnum")
@XmlEnum
public enum MatrixFaultEnum {

    @XmlEnumValue("communicationsFailure")
    COMMUNICATIONS_FAILURE("communicationsFailure"),
    @XmlEnumValue("incorrectAspectDisplayed")
    INCORRECT_ASPECT_DISPLAYED("incorrectAspectDisplayed"),
    @XmlEnumValue("outOfService")
    OUT_OF_SERVICE("outOfService"),
    @XmlEnumValue("powerFailure")
    POWER_FAILURE("powerFailure"),
    @XmlEnumValue("unableToClearDown")
    UNABLE_TO_CLEAR_DOWN("unableToClearDown"),
    @XmlEnumValue("unknown")
    UNKNOWN("unknown"),
    @XmlEnumValue("other")
    OTHER("other");
    private final String value;

    MatrixFaultEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static MatrixFaultEnum fromValue(String v) {
        for (MatrixFaultEnum c: MatrixFaultEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
