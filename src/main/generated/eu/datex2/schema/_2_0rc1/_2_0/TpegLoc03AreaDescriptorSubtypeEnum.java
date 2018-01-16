
package eu.datex2.schema._2_0rc1._2_0;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour TpegLoc03AreaDescriptorSubtypeEnum.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * <p>
 * <pre>
 * &lt;simpleType name="TpegLoc03AreaDescriptorSubtypeEnum">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="administrativeAreaName"/>
 *     &lt;enumeration value="administrativeReferenceName"/>
 *     &lt;enumeration value="areaName"/>
 *     &lt;enumeration value="countyName"/>
 *     &lt;enumeration value="lakeName"/>
 *     &lt;enumeration value="nationName"/>
 *     &lt;enumeration value="policeForceControlAreaName"/>
 *     &lt;enumeration value="regionName"/>
 *     &lt;enumeration value="seaName"/>
 *     &lt;enumeration value="townName"/>
 *     &lt;enumeration value="other"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "TpegLoc03AreaDescriptorSubtypeEnum")
@XmlEnum
public enum TpegLoc03AreaDescriptorSubtypeEnum {

    @XmlEnumValue("administrativeAreaName")
    ADMINISTRATIVE_AREA_NAME("administrativeAreaName"),
    @XmlEnumValue("administrativeReferenceName")
    ADMINISTRATIVE_REFERENCE_NAME("administrativeReferenceName"),
    @XmlEnumValue("areaName")
    AREA_NAME("areaName"),
    @XmlEnumValue("countyName")
    COUNTY_NAME("countyName"),
    @XmlEnumValue("lakeName")
    LAKE_NAME("lakeName"),
    @XmlEnumValue("nationName")
    NATION_NAME("nationName"),
    @XmlEnumValue("policeForceControlAreaName")
    POLICE_FORCE_CONTROL_AREA_NAME("policeForceControlAreaName"),
    @XmlEnumValue("regionName")
    REGION_NAME("regionName"),
    @XmlEnumValue("seaName")
    SEA_NAME("seaName"),
    @XmlEnumValue("townName")
    TOWN_NAME("townName"),
    @XmlEnumValue("other")
    OTHER("other");
    private final String value;

    TpegLoc03AreaDescriptorSubtypeEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TpegLoc03AreaDescriptorSubtypeEnum fromValue(String v) {
        for (TpegLoc03AreaDescriptorSubtypeEnum c: TpegLoc03AreaDescriptorSubtypeEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
