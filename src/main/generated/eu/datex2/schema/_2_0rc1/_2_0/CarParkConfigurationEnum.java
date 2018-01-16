
package eu.datex2.schema._2_0rc1._2_0;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour CarParkConfigurationEnum.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * <p>
 * <pre>
 * &lt;simpleType name="CarParkConfigurationEnum">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="multiStorey"/>
 *     &lt;enumeration value="parkAndRide"/>
 *     &lt;enumeration value="singleLevel"/>
 *     &lt;enumeration value="underground"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "CarParkConfigurationEnum")
@XmlEnum
public enum CarParkConfigurationEnum {

    @XmlEnumValue("multiStorey")
    MULTI_STOREY("multiStorey"),
    @XmlEnumValue("parkAndRide")
    PARK_AND_RIDE("parkAndRide"),
    @XmlEnumValue("singleLevel")
    SINGLE_LEVEL("singleLevel"),
    @XmlEnumValue("underground")
    UNDERGROUND("underground");
    private final String value;

    CarParkConfigurationEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static CarParkConfigurationEnum fromValue(String v) {
        for (CarParkConfigurationEnum c: CarParkConfigurationEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
