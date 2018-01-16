
package eu.datex2.schema._2_0rc1._2_0;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour LocationDescriptorEnum.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * <p>
 * <pre>
 * &lt;simpleType name="LocationDescriptorEnum">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="aroundABendInRoad"/>
 *     &lt;enumeration value="atMotorwayInterchange"/>
 *     &lt;enumeration value="atRestArea"/>
 *     &lt;enumeration value="atServiceArea"/>
 *     &lt;enumeration value="atTollPlaza"/>
 *     &lt;enumeration value="atTunnelEntryOrExit"/>
 *     &lt;enumeration value="inbound"/>
 *     &lt;enumeration value="inGallery"/>
 *     &lt;enumeration value="inTheCentre"/>
 *     &lt;enumeration value="inTheOppositeDirection"/>
 *     &lt;enumeration value="inTunnel"/>
 *     &lt;enumeration value="onBorder"/>
 *     &lt;enumeration value="onBridge"/>
 *     &lt;enumeration value="onConnector"/>
 *     &lt;enumeration value="onElevatedSection"/>
 *     &lt;enumeration value="onFlyover"/>
 *     &lt;enumeration value="onIceRoad"/>
 *     &lt;enumeration value="onLevelCrossing"/>
 *     &lt;enumeration value="onLinkRoad"/>
 *     &lt;enumeration value="onPass"/>
 *     &lt;enumeration value="onRoundabout"/>
 *     &lt;enumeration value="onTheLeft"/>
 *     &lt;enumeration value="onTheRight"/>
 *     &lt;enumeration value="onTheRoadway"/>
 *     &lt;enumeration value="onUndergroundSection"/>
 *     &lt;enumeration value="onUnderpass"/>
 *     &lt;enumeration value="outbound"/>
 *     &lt;enumeration value="overCrestOfHill"/>
 *     &lt;enumeration value="withinJunction"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "LocationDescriptorEnum")
@XmlEnum
public enum LocationDescriptorEnum {

    @XmlEnumValue("aroundABendInRoad")
    AROUND_A_BEND_IN_ROAD("aroundABendInRoad"),
    @XmlEnumValue("atMotorwayInterchange")
    AT_MOTORWAY_INTERCHANGE("atMotorwayInterchange"),
    @XmlEnumValue("atRestArea")
    AT_REST_AREA("atRestArea"),
    @XmlEnumValue("atServiceArea")
    AT_SERVICE_AREA("atServiceArea"),
    @XmlEnumValue("atTollPlaza")
    AT_TOLL_PLAZA("atTollPlaza"),
    @XmlEnumValue("atTunnelEntryOrExit")
    AT_TUNNEL_ENTRY_OR_EXIT("atTunnelEntryOrExit"),
    @XmlEnumValue("inbound")
    INBOUND("inbound"),
    @XmlEnumValue("inGallery")
    IN_GALLERY("inGallery"),
    @XmlEnumValue("inTheCentre")
    IN_THE_CENTRE("inTheCentre"),
    @XmlEnumValue("inTheOppositeDirection")
    IN_THE_OPPOSITE_DIRECTION("inTheOppositeDirection"),
    @XmlEnumValue("inTunnel")
    IN_TUNNEL("inTunnel"),
    @XmlEnumValue("onBorder")
    ON_BORDER("onBorder"),
    @XmlEnumValue("onBridge")
    ON_BRIDGE("onBridge"),
    @XmlEnumValue("onConnector")
    ON_CONNECTOR("onConnector"),
    @XmlEnumValue("onElevatedSection")
    ON_ELEVATED_SECTION("onElevatedSection"),
    @XmlEnumValue("onFlyover")
    ON_FLYOVER("onFlyover"),
    @XmlEnumValue("onIceRoad")
    ON_ICE_ROAD("onIceRoad"),
    @XmlEnumValue("onLevelCrossing")
    ON_LEVEL_CROSSING("onLevelCrossing"),
    @XmlEnumValue("onLinkRoad")
    ON_LINK_ROAD("onLinkRoad"),
    @XmlEnumValue("onPass")
    ON_PASS("onPass"),
    @XmlEnumValue("onRoundabout")
    ON_ROUNDABOUT("onRoundabout"),
    @XmlEnumValue("onTheLeft")
    ON_THE_LEFT("onTheLeft"),
    @XmlEnumValue("onTheRight")
    ON_THE_RIGHT("onTheRight"),
    @XmlEnumValue("onTheRoadway")
    ON_THE_ROADWAY("onTheRoadway"),
    @XmlEnumValue("onUndergroundSection")
    ON_UNDERGROUND_SECTION("onUndergroundSection"),
    @XmlEnumValue("onUnderpass")
    ON_UNDERPASS("onUnderpass"),
    @XmlEnumValue("outbound")
    OUTBOUND("outbound"),
    @XmlEnumValue("overCrestOfHill")
    OVER_CREST_OF_HILL("overCrestOfHill"),
    @XmlEnumValue("withinJunction")
    WITHIN_JUNCTION("withinJunction");
    private final String value;

    LocationDescriptorEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static LocationDescriptorEnum fromValue(String v) {
        for (LocationDescriptorEnum c: LocationDescriptorEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
