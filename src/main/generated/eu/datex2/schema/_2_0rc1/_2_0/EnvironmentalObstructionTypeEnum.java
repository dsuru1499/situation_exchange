
package eu.datex2.schema._2_0rc1._2_0;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour EnvironmentalObstructionTypeEnum.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * <p>
 * <pre>
 * &lt;simpleType name="EnvironmentalObstructionTypeEnum">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="avalanches"/>
 *     &lt;enumeration value="earthquakeDamage"/>
 *     &lt;enumeration value="fallenTrees"/>
 *     &lt;enumeration value="fallingIce"/>
 *     &lt;enumeration value="fallingLightIceOrSnow"/>
 *     &lt;enumeration value="flashFloods"/>
 *     &lt;enumeration value="flooding"/>
 *     &lt;enumeration value="forestFire"/>
 *     &lt;enumeration value="grassFire"/>
 *     &lt;enumeration value="landslips"/>
 *     &lt;enumeration value="mudSlide"/>
 *     &lt;enumeration value="sewerOverflow"/>
 *     &lt;enumeration value="rockfalls"/>
 *     &lt;enumeration value="seriousFire"/>
 *     &lt;enumeration value="smokeOrFumes"/>
 *     &lt;enumeration value="stormDamage"/>
 *     &lt;enumeration value="subsidence"/>
 *     &lt;enumeration value="other"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "EnvironmentalObstructionTypeEnum")
@XmlEnum
public enum EnvironmentalObstructionTypeEnum {

    @XmlEnumValue("avalanches")
    AVALANCHES("avalanches"),
    @XmlEnumValue("earthquakeDamage")
    EARTHQUAKE_DAMAGE("earthquakeDamage"),
    @XmlEnumValue("fallenTrees")
    FALLEN_TREES("fallenTrees"),
    @XmlEnumValue("fallingIce")
    FALLING_ICE("fallingIce"),
    @XmlEnumValue("fallingLightIceOrSnow")
    FALLING_LIGHT_ICE_OR_SNOW("fallingLightIceOrSnow"),
    @XmlEnumValue("flashFloods")
    FLASH_FLOODS("flashFloods"),
    @XmlEnumValue("flooding")
    FLOODING("flooding"),
    @XmlEnumValue("forestFire")
    FOREST_FIRE("forestFire"),
    @XmlEnumValue("grassFire")
    GRASS_FIRE("grassFire"),
    @XmlEnumValue("landslips")
    LANDSLIPS("landslips"),
    @XmlEnumValue("mudSlide")
    MUD_SLIDE("mudSlide"),
    @XmlEnumValue("sewerOverflow")
    SEWER_OVERFLOW("sewerOverflow"),
    @XmlEnumValue("rockfalls")
    ROCKFALLS("rockfalls"),
    @XmlEnumValue("seriousFire")
    SERIOUS_FIRE("seriousFire"),
    @XmlEnumValue("smokeOrFumes")
    SMOKE_OR_FUMES("smokeOrFumes"),
    @XmlEnumValue("stormDamage")
    STORM_DAMAGE("stormDamage"),
    @XmlEnumValue("subsidence")
    SUBSIDENCE("subsidence"),
    @XmlEnumValue("other")
    OTHER("other");
    private final String value;

    EnvironmentalObstructionTypeEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static EnvironmentalObstructionTypeEnum fromValue(String v) {
        for (EnvironmentalObstructionTypeEnum c: EnvironmentalObstructionTypeEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
