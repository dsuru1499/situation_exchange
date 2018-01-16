
package eu.datex2.schema._2_0rc1._2_0;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour WinterEquipmentManagementTypeEnum.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * <p>
 * <pre>
 * &lt;simpleType name="WinterEquipmentManagementTypeEnum">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="doNoUseStudTyres"/>
 *     &lt;enumeration value="useSnowChains"/>
 *     &lt;enumeration value="useSnowChainsOrTyres"/>
 *     &lt;enumeration value="useSnowTyres"/>
 *     &lt;enumeration value="winterEquipmentOnBoardRequired"/>
 *     &lt;enumeration value="other"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "WinterEquipmentManagementTypeEnum")
@XmlEnum
public enum WinterEquipmentManagementTypeEnum {

    @XmlEnumValue("doNoUseStudTyres")
    DO_NO_USE_STUD_TYRES("doNoUseStudTyres"),
    @XmlEnumValue("useSnowChains")
    USE_SNOW_CHAINS("useSnowChains"),
    @XmlEnumValue("useSnowChainsOrTyres")
    USE_SNOW_CHAINS_OR_TYRES("useSnowChainsOrTyres"),
    @XmlEnumValue("useSnowTyres")
    USE_SNOW_TYRES("useSnowTyres"),
    @XmlEnumValue("winterEquipmentOnBoardRequired")
    WINTER_EQUIPMENT_ON_BOARD_REQUIRED("winterEquipmentOnBoardRequired"),
    @XmlEnumValue("other")
    OTHER("other");
    private final String value;

    WinterEquipmentManagementTypeEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static WinterEquipmentManagementTypeEnum fromValue(String v) {
        for (WinterEquipmentManagementTypeEnum c: WinterEquipmentManagementTypeEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
