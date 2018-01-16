
package eu.datex2.schema._2_0rc1._2_0;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour VehicleStatusEnum.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * <p>
 * <pre>
 * &lt;simpleType name="VehicleStatusEnum">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="abandoned"/>
 *     &lt;enumeration value="brokenDown"/>
 *     &lt;enumeration value="burntOut"/>
 *     &lt;enumeration value="damaged"/>
 *     &lt;enumeration value="damagedAndImmobilized"/>
 *     &lt;enumeration value="onFire"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "VehicleStatusEnum")
@XmlEnum
public enum VehicleStatusEnum {

    @XmlEnumValue("abandoned")
    ABANDONED("abandoned"),
    @XmlEnumValue("brokenDown")
    BROKEN_DOWN("brokenDown"),
    @XmlEnumValue("burntOut")
    BURNT_OUT("burntOut"),
    @XmlEnumValue("damaged")
    DAMAGED("damaged"),
    @XmlEnumValue("damagedAndImmobilized")
    DAMAGED_AND_IMMOBILIZED("damagedAndImmobilized"),
    @XmlEnumValue("onFire")
    ON_FIRE("onFire");
    private final String value;

    VehicleStatusEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static VehicleStatusEnum fromValue(String v) {
        for (VehicleStatusEnum c: VehicleStatusEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
