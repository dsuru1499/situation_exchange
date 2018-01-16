
package eu.datex2.schema._2_0rc1._2_0;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour WeatherRelatedRoadConditionTypeEnum.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * <p>
 * <pre>
 * &lt;simpleType name="WeatherRelatedRoadConditionTypeEnum">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="blackIce"/>
 *     &lt;enumeration value="deepSnow"/>
 *     &lt;enumeration value="dry"/>
 *     &lt;enumeration value="freezingOfWetRoads"/>
 *     &lt;enumeration value="freezingPavements"/>
 *     &lt;enumeration value="freezingRain"/>
 *     &lt;enumeration value="freshSnow"/>
 *     &lt;enumeration value="ice"/>
 *     &lt;enumeration value="iceBuildUp"/>
 *     &lt;enumeration value="iceWithWheelBarTracks"/>
 *     &lt;enumeration value="icyPatches"/>
 *     &lt;enumeration value="looseSnow"/>
 *     &lt;enumeration value="normalWinterConditionsForPedestrians"/>
 *     &lt;enumeration value="packedSnow"/>
 *     &lt;enumeration value="roadSurfaceMelting"/>
 *     &lt;enumeration value="slipperyRoad"/>
 *     &lt;enumeration value="slushOnRoad"/>
 *     &lt;enumeration value="slushStrings"/>
 *     &lt;enumeration value="snowDrifts"/>
 *     &lt;enumeration value="snowOnPavement"/>
 *     &lt;enumeration value="snowOnTheRoad"/>
 *     &lt;enumeration value="surfaceWater"/>
 *     &lt;enumeration value="wet"/>
 *     &lt;enumeration value="wetAndIcyRoad"/>
 *     &lt;enumeration value="wetIcyPavement"/>
 *     &lt;enumeration value="other"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "WeatherRelatedRoadConditionTypeEnum")
@XmlEnum
public enum WeatherRelatedRoadConditionTypeEnum {

    @XmlEnumValue("blackIce")
    BLACK_ICE("blackIce"),
    @XmlEnumValue("deepSnow")
    DEEP_SNOW("deepSnow"),
    @XmlEnumValue("dry")
    DRY("dry"),
    @XmlEnumValue("freezingOfWetRoads")
    FREEZING_OF_WET_ROADS("freezingOfWetRoads"),
    @XmlEnumValue("freezingPavements")
    FREEZING_PAVEMENTS("freezingPavements"),
    @XmlEnumValue("freezingRain")
    FREEZING_RAIN("freezingRain"),
    @XmlEnumValue("freshSnow")
    FRESH_SNOW("freshSnow"),
    @XmlEnumValue("ice")
    ICE("ice"),
    @XmlEnumValue("iceBuildUp")
    ICE_BUILD_UP("iceBuildUp"),
    @XmlEnumValue("iceWithWheelBarTracks")
    ICE_WITH_WHEEL_BAR_TRACKS("iceWithWheelBarTracks"),
    @XmlEnumValue("icyPatches")
    ICY_PATCHES("icyPatches"),
    @XmlEnumValue("looseSnow")
    LOOSE_SNOW("looseSnow"),
    @XmlEnumValue("normalWinterConditionsForPedestrians")
    NORMAL_WINTER_CONDITIONS_FOR_PEDESTRIANS("normalWinterConditionsForPedestrians"),
    @XmlEnumValue("packedSnow")
    PACKED_SNOW("packedSnow"),
    @XmlEnumValue("roadSurfaceMelting")
    ROAD_SURFACE_MELTING("roadSurfaceMelting"),
    @XmlEnumValue("slipperyRoad")
    SLIPPERY_ROAD("slipperyRoad"),
    @XmlEnumValue("slushOnRoad")
    SLUSH_ON_ROAD("slushOnRoad"),
    @XmlEnumValue("slushStrings")
    SLUSH_STRINGS("slushStrings"),
    @XmlEnumValue("snowDrifts")
    SNOW_DRIFTS("snowDrifts"),
    @XmlEnumValue("snowOnPavement")
    SNOW_ON_PAVEMENT("snowOnPavement"),
    @XmlEnumValue("snowOnTheRoad")
    SNOW_ON_THE_ROAD("snowOnTheRoad"),
    @XmlEnumValue("surfaceWater")
    SURFACE_WATER("surfaceWater"),
    @XmlEnumValue("wet")
    WET("wet"),
    @XmlEnumValue("wetAndIcyRoad")
    WET_AND_ICY_ROAD("wetAndIcyRoad"),
    @XmlEnumValue("wetIcyPavement")
    WET_ICY_PAVEMENT("wetIcyPavement"),
    @XmlEnumValue("other")
    OTHER("other");
    private final String value;

    WeatherRelatedRoadConditionTypeEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static WeatherRelatedRoadConditionTypeEnum fromValue(String v) {
        for (WeatherRelatedRoadConditionTypeEnum c: WeatherRelatedRoadConditionTypeEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
