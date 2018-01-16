
package eu.datex2.schema._2_0rc1._2_0;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour DatexPictogramEnum.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * <p>
 * <pre>
 * &lt;simpleType name="DatexPictogramEnum">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="advisorySpeed"/>
 *     &lt;enumeration value="blankVoid"/>
 *     &lt;enumeration value="chainsOrSnowTyresRecommended"/>
 *     &lt;enumeration value="crossWind"/>
 *     &lt;enumeration value="drivingOfVehiclesLessThanXMetresApartProhibited"/>
 *     &lt;enumeration value="endOfAdvisorySpeed"/>
 *     &lt;enumeration value="endOfProhibitionOfOvertaking"/>
 *     &lt;enumeration value="endOfProhibitionOfOvertakingForGoodsVehicles"/>
 *     &lt;enumeration value="endOfSpeedLimit"/>
 *     &lt;enumeration value="exitClosed"/>
 *     &lt;enumeration value="fog"/>
 *     &lt;enumeration value="keepASafeDistance"/>
 *     &lt;enumeration value="maximumSpeedLimit"/>
 *     &lt;enumeration value="noEntry"/>
 *     &lt;enumeration value="noEntryForGoodsVehicles"/>
 *     &lt;enumeration value="noEntryForVehiclesExceedingXTonnesLadenMass"/>
 *     &lt;enumeration value="noEntryForVehiclesHavingAMassExceedingXTonnesOnOneAxle"/>
 *     &lt;enumeration value="noEntryForVehiclesHavingAnOverallHeightExceedingXMetres"/>
 *     &lt;enumeration value="noEntryForVehiclesHavingAnOverallLengthExceedingXMetres"/>
 *     &lt;enumeration value="noEntryForVehiclesCarryingDangerousGoods"/>
 *     &lt;enumeration value="otherDanger"/>
 *     &lt;enumeration value="overtakingByGoodsVehiclesProhibited"/>
 *     &lt;enumeration value="overtakingProhibited"/>
 *     &lt;enumeration value="roadClosedAhead"/>
 *     &lt;enumeration value="roadworks"/>
 *     &lt;enumeration value="slipperyRoad"/>
 *     &lt;enumeration value="snow"/>
 *     &lt;enumeration value="snowTyresCompulsory"/>
 *     &lt;enumeration value="trafficCongestion"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "DatexPictogramEnum")
@XmlEnum
public enum DatexPictogramEnum {

    @XmlEnumValue("advisorySpeed")
    ADVISORY_SPEED("advisorySpeed"),
    @XmlEnumValue("blankVoid")
    BLANK_VOID("blankVoid"),
    @XmlEnumValue("chainsOrSnowTyresRecommended")
    CHAINS_OR_SNOW_TYRES_RECOMMENDED("chainsOrSnowTyresRecommended"),
    @XmlEnumValue("crossWind")
    CROSS_WIND("crossWind"),
    @XmlEnumValue("drivingOfVehiclesLessThanXMetresApartProhibited")
    DRIVING_OF_VEHICLES_LESS_THAN_X_METRES_APART_PROHIBITED("drivingOfVehiclesLessThanXMetresApartProhibited"),
    @XmlEnumValue("endOfAdvisorySpeed")
    END_OF_ADVISORY_SPEED("endOfAdvisorySpeed"),
    @XmlEnumValue("endOfProhibitionOfOvertaking")
    END_OF_PROHIBITION_OF_OVERTAKING("endOfProhibitionOfOvertaking"),
    @XmlEnumValue("endOfProhibitionOfOvertakingForGoodsVehicles")
    END_OF_PROHIBITION_OF_OVERTAKING_FOR_GOODS_VEHICLES("endOfProhibitionOfOvertakingForGoodsVehicles"),
    @XmlEnumValue("endOfSpeedLimit")
    END_OF_SPEED_LIMIT("endOfSpeedLimit"),
    @XmlEnumValue("exitClosed")
    EXIT_CLOSED("exitClosed"),
    @XmlEnumValue("fog")
    FOG("fog"),
    @XmlEnumValue("keepASafeDistance")
    KEEP_A_SAFE_DISTANCE("keepASafeDistance"),
    @XmlEnumValue("maximumSpeedLimit")
    MAXIMUM_SPEED_LIMIT("maximumSpeedLimit"),
    @XmlEnumValue("noEntry")
    NO_ENTRY("noEntry"),
    @XmlEnumValue("noEntryForGoodsVehicles")
    NO_ENTRY_FOR_GOODS_VEHICLES("noEntryForGoodsVehicles"),
    @XmlEnumValue("noEntryForVehiclesExceedingXTonnesLadenMass")
    NO_ENTRY_FOR_VEHICLES_EXCEEDING_X_TONNES_LADEN_MASS("noEntryForVehiclesExceedingXTonnesLadenMass"),
    @XmlEnumValue("noEntryForVehiclesHavingAMassExceedingXTonnesOnOneAxle")
    NO_ENTRY_FOR_VEHICLES_HAVING_A_MASS_EXCEEDING_X_TONNES_ON_ONE_AXLE("noEntryForVehiclesHavingAMassExceedingXTonnesOnOneAxle"),
    @XmlEnumValue("noEntryForVehiclesHavingAnOverallHeightExceedingXMetres")
    NO_ENTRY_FOR_VEHICLES_HAVING_AN_OVERALL_HEIGHT_EXCEEDING_X_METRES("noEntryForVehiclesHavingAnOverallHeightExceedingXMetres"),
    @XmlEnumValue("noEntryForVehiclesHavingAnOverallLengthExceedingXMetres")
    NO_ENTRY_FOR_VEHICLES_HAVING_AN_OVERALL_LENGTH_EXCEEDING_X_METRES("noEntryForVehiclesHavingAnOverallLengthExceedingXMetres"),
    @XmlEnumValue("noEntryForVehiclesCarryingDangerousGoods")
    NO_ENTRY_FOR_VEHICLES_CARRYING_DANGEROUS_GOODS("noEntryForVehiclesCarryingDangerousGoods"),
    @XmlEnumValue("otherDanger")
    OTHER_DANGER("otherDanger"),
    @XmlEnumValue("overtakingByGoodsVehiclesProhibited")
    OVERTAKING_BY_GOODS_VEHICLES_PROHIBITED("overtakingByGoodsVehiclesProhibited"),
    @XmlEnumValue("overtakingProhibited")
    OVERTAKING_PROHIBITED("overtakingProhibited"),
    @XmlEnumValue("roadClosedAhead")
    ROAD_CLOSED_AHEAD("roadClosedAhead"),
    @XmlEnumValue("roadworks")
    ROADWORKS("roadworks"),
    @XmlEnumValue("slipperyRoad")
    SLIPPERY_ROAD("slipperyRoad"),
    @XmlEnumValue("snow")
    SNOW("snow"),
    @XmlEnumValue("snowTyresCompulsory")
    SNOW_TYRES_COMPULSORY("snowTyresCompulsory"),
    @XmlEnumValue("trafficCongestion")
    TRAFFIC_CONGESTION("trafficCongestion");
    private final String value;

    DatexPictogramEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static DatexPictogramEnum fromValue(String v) {
        for (DatexPictogramEnum c: DatexPictogramEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
