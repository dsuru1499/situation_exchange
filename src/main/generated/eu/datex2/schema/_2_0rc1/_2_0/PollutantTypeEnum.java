
package eu.datex2.schema._2_0rc1._2_0;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour PollutantTypeEnum.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * <p>
 * <pre>
 * &lt;simpleType name="PollutantTypeEnum">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="benzeneTolueneXylene"/>
 *     &lt;enumeration value="carbonMonoxide"/>
 *     &lt;enumeration value="lead"/>
 *     &lt;enumeration value="methane"/>
 *     &lt;enumeration value="nitricOxide"/>
 *     &lt;enumeration value="nitrogenDioxide"/>
 *     &lt;enumeration value="nitrogenMonoxide"/>
 *     &lt;enumeration value="nitrogenOxides"/>
 *     &lt;enumeration value="nonMethaneHydrocarbons"/>
 *     &lt;enumeration value="ozone"/>
 *     &lt;enumeration value="particulates10"/>
 *     &lt;enumeration value="polycyclicAromaticHydrocarbons"/>
 *     &lt;enumeration value="primaryParticulate"/>
 *     &lt;enumeration value="sulphurDioxide"/>
 *     &lt;enumeration value="totalHydrocarbons"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "PollutantTypeEnum")
@XmlEnum
public enum PollutantTypeEnum {

    @XmlEnumValue("benzeneTolueneXylene")
    BENZENE_TOLUENE_XYLENE("benzeneTolueneXylene"),
    @XmlEnumValue("carbonMonoxide")
    CARBON_MONOXIDE("carbonMonoxide"),
    @XmlEnumValue("lead")
    LEAD("lead"),
    @XmlEnumValue("methane")
    METHANE("methane"),
    @XmlEnumValue("nitricOxide")
    NITRIC_OXIDE("nitricOxide"),
    @XmlEnumValue("nitrogenDioxide")
    NITROGEN_DIOXIDE("nitrogenDioxide"),
    @XmlEnumValue("nitrogenMonoxide")
    NITROGEN_MONOXIDE("nitrogenMonoxide"),
    @XmlEnumValue("nitrogenOxides")
    NITROGEN_OXIDES("nitrogenOxides"),
    @XmlEnumValue("nonMethaneHydrocarbons")
    NON_METHANE_HYDROCARBONS("nonMethaneHydrocarbons"),
    @XmlEnumValue("ozone")
    OZONE("ozone"),
    @XmlEnumValue("particulates10")
    PARTICULATES_10("particulates10"),
    @XmlEnumValue("polycyclicAromaticHydrocarbons")
    POLYCYCLIC_AROMATIC_HYDROCARBONS("polycyclicAromaticHydrocarbons"),
    @XmlEnumValue("primaryParticulate")
    PRIMARY_PARTICULATE("primaryParticulate"),
    @XmlEnumValue("sulphurDioxide")
    SULPHUR_DIOXIDE("sulphurDioxide"),
    @XmlEnumValue("totalHydrocarbons")
    TOTAL_HYDROCARBONS("totalHydrocarbons");
    private final String value;

    PollutantTypeEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static PollutantTypeEnum fromValue(String v) {
        for (PollutantTypeEnum c: PollutantTypeEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
