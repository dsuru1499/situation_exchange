
package eu.datex2.schema._2_0rc1._2_0;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour PoorEnvironmentTypeEnum.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * <p>
 * <pre>
 * &lt;simpleType name="PoorEnvironmentTypeEnum">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="badWeather"/>
 *     &lt;enumeration value="blizzard"/>
 *     &lt;enumeration value="blowingDust"/>
 *     &lt;enumeration value="blowingSnow"/>
 *     &lt;enumeration value="crosswinds"/>
 *     &lt;enumeration value="damagingHail"/>
 *     &lt;enumeration value="denseFog"/>
 *     &lt;enumeration value="eclipse"/>
 *     &lt;enumeration value="extremeCold"/>
 *     &lt;enumeration value="extremeHeat"/>
 *     &lt;enumeration value="fog"/>
 *     &lt;enumeration value="freezingFog"/>
 *     &lt;enumeration value="frost"/>
 *     &lt;enumeration value="gales"/>
 *     &lt;enumeration value="gustyWinds"/>
 *     &lt;enumeration value="hail"/>
 *     &lt;enumeration value="heavyFrost"/>
 *     &lt;enumeration value="heavyRain"/>
 *     &lt;enumeration value="heavySnowfall"/>
 *     &lt;enumeration value="hurricaneForceWinds"/>
 *     &lt;enumeration value="lowSunGlare"/>
 *     &lt;enumeration value="moderateFog"/>
 *     &lt;enumeration value="ozonePollution"/>
 *     &lt;enumeration value="pollution"/>
 *     &lt;enumeration value="patchyFog"/>
 *     &lt;enumeration value="precipitationInTheArea"/>
 *     &lt;enumeration value="rain"/>
 *     &lt;enumeration value="rainChangingToSnow"/>
 *     &lt;enumeration value="sandStorms"/>
 *     &lt;enumeration value="severeExhaustPollution"/>
 *     &lt;enumeration value="severeSmog"/>
 *     &lt;enumeration value="showers"/>
 *     &lt;enumeration value="sleet"/>
 *     &lt;enumeration value="smogAlert"/>
 *     &lt;enumeration value="smokeHazard"/>
 *     &lt;enumeration value="snowChangingToRain"/>
 *     &lt;enumeration value="snowfall"/>
 *     &lt;enumeration value="sprayHazard"/>
 *     &lt;enumeration value="stormForceWinds"/>
 *     &lt;enumeration value="strongGustsOfWind"/>
 *     &lt;enumeration value="strongWinds"/>
 *     &lt;enumeration value="swarmsOfInsects"/>
 *     &lt;enumeration value="temperatureFalling"/>
 *     &lt;enumeration value="thunderstorms"/>
 *     &lt;enumeration value="tornadoes"/>
 *     &lt;enumeration value="veryStrongGustsOfWind"/>
 *     &lt;enumeration value="visibilityReduced"/>
 *     &lt;enumeration value="whiteOut"/>
 *     &lt;enumeration value="winterStorm"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "PoorEnvironmentTypeEnum")
@XmlEnum
public enum PoorEnvironmentTypeEnum {

    @XmlEnumValue("badWeather")
    BAD_WEATHER("badWeather"),
    @XmlEnumValue("blizzard")
    BLIZZARD("blizzard"),
    @XmlEnumValue("blowingDust")
    BLOWING_DUST("blowingDust"),
    @XmlEnumValue("blowingSnow")
    BLOWING_SNOW("blowingSnow"),
    @XmlEnumValue("crosswinds")
    CROSSWINDS("crosswinds"),
    @XmlEnumValue("damagingHail")
    DAMAGING_HAIL("damagingHail"),
    @XmlEnumValue("denseFog")
    DENSE_FOG("denseFog"),
    @XmlEnumValue("eclipse")
    ECLIPSE("eclipse"),
    @XmlEnumValue("extremeCold")
    EXTREME_COLD("extremeCold"),
    @XmlEnumValue("extremeHeat")
    EXTREME_HEAT("extremeHeat"),
    @XmlEnumValue("fog")
    FOG("fog"),
    @XmlEnumValue("freezingFog")
    FREEZING_FOG("freezingFog"),
    @XmlEnumValue("frost")
    FROST("frost"),
    @XmlEnumValue("gales")
    GALES("gales"),
    @XmlEnumValue("gustyWinds")
    GUSTY_WINDS("gustyWinds"),
    @XmlEnumValue("hail")
    HAIL("hail"),
    @XmlEnumValue("heavyFrost")
    HEAVY_FROST("heavyFrost"),
    @XmlEnumValue("heavyRain")
    HEAVY_RAIN("heavyRain"),
    @XmlEnumValue("heavySnowfall")
    HEAVY_SNOWFALL("heavySnowfall"),
    @XmlEnumValue("hurricaneForceWinds")
    HURRICANE_FORCE_WINDS("hurricaneForceWinds"),
    @XmlEnumValue("lowSunGlare")
    LOW_SUN_GLARE("lowSunGlare"),
    @XmlEnumValue("moderateFog")
    MODERATE_FOG("moderateFog"),
    @XmlEnumValue("ozonePollution")
    OZONE_POLLUTION("ozonePollution"),
    @XmlEnumValue("pollution")
    POLLUTION("pollution"),
    @XmlEnumValue("patchyFog")
    PATCHY_FOG("patchyFog"),
    @XmlEnumValue("precipitationInTheArea")
    PRECIPITATION_IN_THE_AREA("precipitationInTheArea"),
    @XmlEnumValue("rain")
    RAIN("rain"),
    @XmlEnumValue("rainChangingToSnow")
    RAIN_CHANGING_TO_SNOW("rainChangingToSnow"),
    @XmlEnumValue("sandStorms")
    SAND_STORMS("sandStorms"),
    @XmlEnumValue("severeExhaustPollution")
    SEVERE_EXHAUST_POLLUTION("severeExhaustPollution"),
    @XmlEnumValue("severeSmog")
    SEVERE_SMOG("severeSmog"),
    @XmlEnumValue("showers")
    SHOWERS("showers"),
    @XmlEnumValue("sleet")
    SLEET("sleet"),
    @XmlEnumValue("smogAlert")
    SMOG_ALERT("smogAlert"),
    @XmlEnumValue("smokeHazard")
    SMOKE_HAZARD("smokeHazard"),
    @XmlEnumValue("snowChangingToRain")
    SNOW_CHANGING_TO_RAIN("snowChangingToRain"),
    @XmlEnumValue("snowfall")
    SNOWFALL("snowfall"),
    @XmlEnumValue("sprayHazard")
    SPRAY_HAZARD("sprayHazard"),
    @XmlEnumValue("stormForceWinds")
    STORM_FORCE_WINDS("stormForceWinds"),
    @XmlEnumValue("strongGustsOfWind")
    STRONG_GUSTS_OF_WIND("strongGustsOfWind"),
    @XmlEnumValue("strongWinds")
    STRONG_WINDS("strongWinds"),
    @XmlEnumValue("swarmsOfInsects")
    SWARMS_OF_INSECTS("swarmsOfInsects"),
    @XmlEnumValue("temperatureFalling")
    TEMPERATURE_FALLING("temperatureFalling"),
    @XmlEnumValue("thunderstorms")
    THUNDERSTORMS("thunderstorms"),
    @XmlEnumValue("tornadoes")
    TORNADOES("tornadoes"),
    @XmlEnumValue("veryStrongGustsOfWind")
    VERY_STRONG_GUSTS_OF_WIND("veryStrongGustsOfWind"),
    @XmlEnumValue("visibilityReduced")
    VISIBILITY_REDUCED("visibilityReduced"),
    @XmlEnumValue("whiteOut")
    WHITE_OUT("whiteOut"),
    @XmlEnumValue("winterStorm")
    WINTER_STORM("winterStorm");
    private final String value;

    PoorEnvironmentTypeEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static PoorEnvironmentTypeEnum fromValue(String v) {
        for (PoorEnvironmentTypeEnum c: PoorEnvironmentTypeEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
