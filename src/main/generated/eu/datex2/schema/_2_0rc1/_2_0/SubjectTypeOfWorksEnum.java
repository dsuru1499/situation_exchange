
package eu.datex2.schema._2_0rc1._2_0;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour SubjectTypeOfWorksEnum.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * <p>
 * <pre>
 * &lt;simpleType name="SubjectTypeOfWorksEnum">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="bridge"/>
 *     &lt;enumeration value="buriedCables"/>
 *     &lt;enumeration value="buriedServices"/>
 *     &lt;enumeration value="crashBarrier"/>
 *     &lt;enumeration value="gallery"/>
 *     &lt;enumeration value="gantry"/>
 *     &lt;enumeration value="gasMainWork"/>
 *     &lt;enumeration value="interchange"/>
 *     &lt;enumeration value="junction"/>
 *     &lt;enumeration value="levelCrossing"/>
 *     &lt;enumeration value="lightingSystem"/>
 *     &lt;enumeration value="measurementEquipment"/>
 *     &lt;enumeration value="noiseProtection"/>
 *     &lt;enumeration value="road"/>
 *     &lt;enumeration value="roadsideDrains"/>
 *     &lt;enumeration value="roadsideEmbankment"/>
 *     &lt;enumeration value="roadsideEquipment"/>
 *     &lt;enumeration value="roadSigns"/>
 *     &lt;enumeration value="roundabout"/>
 *     &lt;enumeration value="tollGate"/>
 *     &lt;enumeration value="tunnel"/>
 *     &lt;enumeration value="waterMain"/>
 *     &lt;enumeration value="other"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "SubjectTypeOfWorksEnum")
@XmlEnum
public enum SubjectTypeOfWorksEnum {

    @XmlEnumValue("bridge")
    BRIDGE("bridge"),
    @XmlEnumValue("buriedCables")
    BURIED_CABLES("buriedCables"),
    @XmlEnumValue("buriedServices")
    BURIED_SERVICES("buriedServices"),
    @XmlEnumValue("crashBarrier")
    CRASH_BARRIER("crashBarrier"),
    @XmlEnumValue("gallery")
    GALLERY("gallery"),
    @XmlEnumValue("gantry")
    GANTRY("gantry"),
    @XmlEnumValue("gasMainWork")
    GAS_MAIN_WORK("gasMainWork"),
    @XmlEnumValue("interchange")
    INTERCHANGE("interchange"),
    @XmlEnumValue("junction")
    JUNCTION("junction"),
    @XmlEnumValue("levelCrossing")
    LEVEL_CROSSING("levelCrossing"),
    @XmlEnumValue("lightingSystem")
    LIGHTING_SYSTEM("lightingSystem"),
    @XmlEnumValue("measurementEquipment")
    MEASUREMENT_EQUIPMENT("measurementEquipment"),
    @XmlEnumValue("noiseProtection")
    NOISE_PROTECTION("noiseProtection"),
    @XmlEnumValue("road")
    ROAD("road"),
    @XmlEnumValue("roadsideDrains")
    ROADSIDE_DRAINS("roadsideDrains"),
    @XmlEnumValue("roadsideEmbankment")
    ROADSIDE_EMBANKMENT("roadsideEmbankment"),
    @XmlEnumValue("roadsideEquipment")
    ROADSIDE_EQUIPMENT("roadsideEquipment"),
    @XmlEnumValue("roadSigns")
    ROAD_SIGNS("roadSigns"),
    @XmlEnumValue("roundabout")
    ROUNDABOUT("roundabout"),
    @XmlEnumValue("tollGate")
    TOLL_GATE("tollGate"),
    @XmlEnumValue("tunnel")
    TUNNEL("tunnel"),
    @XmlEnumValue("waterMain")
    WATER_MAIN("waterMain"),
    @XmlEnumValue("other")
    OTHER("other");
    private final String value;

    SubjectTypeOfWorksEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static SubjectTypeOfWorksEnum fromValue(String v) {
        for (SubjectTypeOfWorksEnum c: SubjectTypeOfWorksEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
