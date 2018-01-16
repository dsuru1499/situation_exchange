
package eu.datex2.schema._2_0rc1._2_0;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour LoadTypeEnum.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * <p>
 * <pre>
 * &lt;simpleType name="LoadTypeEnum">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="abnormalLoad"/>
 *     &lt;enumeration value="ammunition"/>
 *     &lt;enumeration value="chemicals"/>
 *     &lt;enumeration value="combustibleMaterials"/>
 *     &lt;enumeration value="corrosiveMaterials"/>
 *     &lt;enumeration value="debris"/>
 *     &lt;enumeration value="empty"/>
 *     &lt;enumeration value="explosiveMaterials"/>
 *     &lt;enumeration value="extraHighLoad"/>
 *     &lt;enumeration value="extraLongLoad"/>
 *     &lt;enumeration value="extraWideLoad"/>
 *     &lt;enumeration value="fuel"/>
 *     &lt;enumeration value="glass"/>
 *     &lt;enumeration value="goods"/>
 *     &lt;enumeration value="hazardousMaterials"/>
 *     &lt;enumeration value="liquid"/>
 *     &lt;enumeration value="livestock"/>
 *     &lt;enumeration value="materials"/>
 *     &lt;enumeration value="materialsDangerousForPeople"/>
 *     &lt;enumeration value="materialsDangerousForTheEnvironment"/>
 *     &lt;enumeration value="materialsDangerousForWater"/>
 *     &lt;enumeration value="oil"/>
 *     &lt;enumeration value="ordinary"/>
 *     &lt;enumeration value="perishableProducts"/>
 *     &lt;enumeration value="petrol"/>
 *     &lt;enumeration value="pharmaceuticalMaterials"/>
 *     &lt;enumeration value="radioactiveMaterials"/>
 *     &lt;enumeration value="refuse"/>
 *     &lt;enumeration value="toxicMaterials"/>
 *     &lt;enumeration value="vehicles"/>
 *     &lt;enumeration value="other"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "LoadTypeEnum")
@XmlEnum
public enum LoadTypeEnum {

    @XmlEnumValue("abnormalLoad")
    ABNORMAL_LOAD("abnormalLoad"),
    @XmlEnumValue("ammunition")
    AMMUNITION("ammunition"),
    @XmlEnumValue("chemicals")
    CHEMICALS("chemicals"),
    @XmlEnumValue("combustibleMaterials")
    COMBUSTIBLE_MATERIALS("combustibleMaterials"),
    @XmlEnumValue("corrosiveMaterials")
    CORROSIVE_MATERIALS("corrosiveMaterials"),
    @XmlEnumValue("debris")
    DEBRIS("debris"),
    @XmlEnumValue("empty")
    EMPTY("empty"),
    @XmlEnumValue("explosiveMaterials")
    EXPLOSIVE_MATERIALS("explosiveMaterials"),
    @XmlEnumValue("extraHighLoad")
    EXTRA_HIGH_LOAD("extraHighLoad"),
    @XmlEnumValue("extraLongLoad")
    EXTRA_LONG_LOAD("extraLongLoad"),
    @XmlEnumValue("extraWideLoad")
    EXTRA_WIDE_LOAD("extraWideLoad"),
    @XmlEnumValue("fuel")
    FUEL("fuel"),
    @XmlEnumValue("glass")
    GLASS("glass"),
    @XmlEnumValue("goods")
    GOODS("goods"),
    @XmlEnumValue("hazardousMaterials")
    HAZARDOUS_MATERIALS("hazardousMaterials"),
    @XmlEnumValue("liquid")
    LIQUID("liquid"),
    @XmlEnumValue("livestock")
    LIVESTOCK("livestock"),
    @XmlEnumValue("materials")
    MATERIALS("materials"),
    @XmlEnumValue("materialsDangerousForPeople")
    MATERIALS_DANGEROUS_FOR_PEOPLE("materialsDangerousForPeople"),
    @XmlEnumValue("materialsDangerousForTheEnvironment")
    MATERIALS_DANGEROUS_FOR_THE_ENVIRONMENT("materialsDangerousForTheEnvironment"),
    @XmlEnumValue("materialsDangerousForWater")
    MATERIALS_DANGEROUS_FOR_WATER("materialsDangerousForWater"),
    @XmlEnumValue("oil")
    OIL("oil"),
    @XmlEnumValue("ordinary")
    ORDINARY("ordinary"),
    @XmlEnumValue("perishableProducts")
    PERISHABLE_PRODUCTS("perishableProducts"),
    @XmlEnumValue("petrol")
    PETROL("petrol"),
    @XmlEnumValue("pharmaceuticalMaterials")
    PHARMACEUTICAL_MATERIALS("pharmaceuticalMaterials"),
    @XmlEnumValue("radioactiveMaterials")
    RADIOACTIVE_MATERIALS("radioactiveMaterials"),
    @XmlEnumValue("refuse")
    REFUSE("refuse"),
    @XmlEnumValue("toxicMaterials")
    TOXIC_MATERIALS("toxicMaterials"),
    @XmlEnumValue("vehicles")
    VEHICLES("vehicles"),
    @XmlEnumValue("other")
    OTHER("other");
    private final String value;

    LoadTypeEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static LoadTypeEnum fromValue(String v) {
        for (LoadTypeEnum c: LoadTypeEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
