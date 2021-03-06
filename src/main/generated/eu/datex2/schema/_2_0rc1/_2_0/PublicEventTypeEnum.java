
package eu.datex2.schema._2_0rc1._2_0;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour PublicEventTypeEnum.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * <p>
 * <pre>
 * &lt;simpleType name="PublicEventTypeEnum">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="agriculturalShow"/>
 *     &lt;enumeration value="airShow"/>
 *     &lt;enumeration value="athleticsMeeting"/>
 *     &lt;enumeration value="commercialEvent"/>
 *     &lt;enumeration value="culturalEvent"/>
 *     &lt;enumeration value="ballGame"/>
 *     &lt;enumeration value="baseballGame"/>
 *     &lt;enumeration value="basketballGame"/>
 *     &lt;enumeration value="bicycleRace"/>
 *     &lt;enumeration value="boatRace"/>
 *     &lt;enumeration value="boatShow"/>
 *     &lt;enumeration value="boxingTournament"/>
 *     &lt;enumeration value="bullFight"/>
 *     &lt;enumeration value="ceremonialEvent"/>
 *     &lt;enumeration value="concert"/>
 *     &lt;enumeration value="cricketMatch"/>
 *     &lt;enumeration value="exhibition"/>
 *     &lt;enumeration value="fair"/>
 *     &lt;enumeration value="festival"/>
 *     &lt;enumeration value="filmTVMaking"/>
 *     &lt;enumeration value="footballMatch"/>
 *     &lt;enumeration value="funfair"/>
 *     &lt;enumeration value="gardeningOrFlowerShow"/>
 *     &lt;enumeration value="golfTournament"/>
 *     &lt;enumeration value="hockeyGame"/>
 *     &lt;enumeration value="horseRaceMeeting"/>
 *     &lt;enumeration value="internationalSportsMeeting"/>
 *     &lt;enumeration value="majorEvent"/>
 *     &lt;enumeration value="marathon"/>
 *     &lt;enumeration value="market"/>
 *     &lt;enumeration value="match"/>
 *     &lt;enumeration value="motorShow"/>
 *     &lt;enumeration value="motorSportRaceMeeting"/>
 *     &lt;enumeration value="parade"/>
 *     &lt;enumeration value="procession"/>
 *     &lt;enumeration value="raceMeeting"/>
 *     &lt;enumeration value="rugbyMatch"/>
 *     &lt;enumeration value="severalMajorEvents"/>
 *     &lt;enumeration value="show"/>
 *     &lt;enumeration value="showJumping"/>
 *     &lt;enumeration value="sportsMeeting"/>
 *     &lt;enumeration value="stateOccasion"/>
 *     &lt;enumeration value="tennisTournament"/>
 *     &lt;enumeration value="tournament"/>
 *     &lt;enumeration value="tradeFair"/>
 *     &lt;enumeration value="waterSportsMeeting"/>
 *     &lt;enumeration value="winterSportsMeeting"/>
 *     &lt;enumeration value="other"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "PublicEventTypeEnum")
@XmlEnum
public enum PublicEventTypeEnum {

    @XmlEnumValue("agriculturalShow")
    AGRICULTURAL_SHOW("agriculturalShow"),
    @XmlEnumValue("airShow")
    AIR_SHOW("airShow"),
    @XmlEnumValue("athleticsMeeting")
    ATHLETICS_MEETING("athleticsMeeting"),
    @XmlEnumValue("commercialEvent")
    COMMERCIAL_EVENT("commercialEvent"),
    @XmlEnumValue("culturalEvent")
    CULTURAL_EVENT("culturalEvent"),
    @XmlEnumValue("ballGame")
    BALL_GAME("ballGame"),
    @XmlEnumValue("baseballGame")
    BASEBALL_GAME("baseballGame"),
    @XmlEnumValue("basketballGame")
    BASKETBALL_GAME("basketballGame"),
    @XmlEnumValue("bicycleRace")
    BICYCLE_RACE("bicycleRace"),
    @XmlEnumValue("boatRace")
    BOAT_RACE("boatRace"),
    @XmlEnumValue("boatShow")
    BOAT_SHOW("boatShow"),
    @XmlEnumValue("boxingTournament")
    BOXING_TOURNAMENT("boxingTournament"),
    @XmlEnumValue("bullFight")
    BULL_FIGHT("bullFight"),
    @XmlEnumValue("ceremonialEvent")
    CEREMONIAL_EVENT("ceremonialEvent"),
    @XmlEnumValue("concert")
    CONCERT("concert"),
    @XmlEnumValue("cricketMatch")
    CRICKET_MATCH("cricketMatch"),
    @XmlEnumValue("exhibition")
    EXHIBITION("exhibition"),
    @XmlEnumValue("fair")
    FAIR("fair"),
    @XmlEnumValue("festival")
    FESTIVAL("festival"),
    @XmlEnumValue("filmTVMaking")
    FILM_TV_MAKING("filmTVMaking"),
    @XmlEnumValue("footballMatch")
    FOOTBALL_MATCH("footballMatch"),
    @XmlEnumValue("funfair")
    FUNFAIR("funfair"),
    @XmlEnumValue("gardeningOrFlowerShow")
    GARDENING_OR_FLOWER_SHOW("gardeningOrFlowerShow"),
    @XmlEnumValue("golfTournament")
    GOLF_TOURNAMENT("golfTournament"),
    @XmlEnumValue("hockeyGame")
    HOCKEY_GAME("hockeyGame"),
    @XmlEnumValue("horseRaceMeeting")
    HORSE_RACE_MEETING("horseRaceMeeting"),
    @XmlEnumValue("internationalSportsMeeting")
    INTERNATIONAL_SPORTS_MEETING("internationalSportsMeeting"),
    @XmlEnumValue("majorEvent")
    MAJOR_EVENT("majorEvent"),
    @XmlEnumValue("marathon")
    MARATHON("marathon"),
    @XmlEnumValue("market")
    MARKET("market"),
    @XmlEnumValue("match")
    MATCH("match"),
    @XmlEnumValue("motorShow")
    MOTOR_SHOW("motorShow"),
    @XmlEnumValue("motorSportRaceMeeting")
    MOTOR_SPORT_RACE_MEETING("motorSportRaceMeeting"),
    @XmlEnumValue("parade")
    PARADE("parade"),
    @XmlEnumValue("procession")
    PROCESSION("procession"),
    @XmlEnumValue("raceMeeting")
    RACE_MEETING("raceMeeting"),
    @XmlEnumValue("rugbyMatch")
    RUGBY_MATCH("rugbyMatch"),
    @XmlEnumValue("severalMajorEvents")
    SEVERAL_MAJOR_EVENTS("severalMajorEvents"),
    @XmlEnumValue("show")
    SHOW("show"),
    @XmlEnumValue("showJumping")
    SHOW_JUMPING("showJumping"),
    @XmlEnumValue("sportsMeeting")
    SPORTS_MEETING("sportsMeeting"),
    @XmlEnumValue("stateOccasion")
    STATE_OCCASION("stateOccasion"),
    @XmlEnumValue("tennisTournament")
    TENNIS_TOURNAMENT("tennisTournament"),
    @XmlEnumValue("tournament")
    TOURNAMENT("tournament"),
    @XmlEnumValue("tradeFair")
    TRADE_FAIR("tradeFair"),
    @XmlEnumValue("waterSportsMeeting")
    WATER_SPORTS_MEETING("waterSportsMeeting"),
    @XmlEnumValue("winterSportsMeeting")
    WINTER_SPORTS_MEETING("winterSportsMeeting"),
    @XmlEnumValue("other")
    OTHER("other");
    private final String value;

    PublicEventTypeEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static PublicEventTypeEnum fromValue(String v) {
        for (PublicEventTypeEnum c: PublicEventTypeEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
