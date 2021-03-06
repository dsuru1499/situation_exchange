
package eu.datex2.schema._2_0rc1._2_0;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour AreaOfInterestEnum.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * <p>
 * <pre>
 * &lt;simpleType name="AreaOfInterestEnum">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="continentWide"/>
 *     &lt;enumeration value="national"/>
 *     &lt;enumeration value="neighbouringCountries"/>
 *     &lt;enumeration value="notSpecified"/>
 *     &lt;enumeration value="regional"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "AreaOfInterestEnum")
@XmlEnum
public enum AreaOfInterestEnum {

    @XmlEnumValue("continentWide")
    CONTINENT_WIDE("continentWide"),
    @XmlEnumValue("national")
    NATIONAL("national"),
    @XmlEnumValue("neighbouringCountries")
    NEIGHBOURING_COUNTRIES("neighbouringCountries"),
    @XmlEnumValue("notSpecified")
    NOT_SPECIFIED("notSpecified"),
    @XmlEnumValue("regional")
    REGIONAL("regional");
    private final String value;

    AreaOfInterestEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static AreaOfInterestEnum fromValue(String v) {
        for (AreaOfInterestEnum c: AreaOfInterestEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
