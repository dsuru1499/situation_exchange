
package eu.datex2.schema._2_0rc1._2_0;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour RelativeTrafficFlowEnum.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * <p>
 * <pre>
 * &lt;simpleType name="RelativeTrafficFlowEnum">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="trafficVeryMuchHeavierThanNormal"/>
 *     &lt;enumeration value="trafficHeavierThanNormal"/>
 *     &lt;enumeration value="trafficFlowNormal"/>
 *     &lt;enumeration value="trafficLighterThanNormal"/>
 *     &lt;enumeration value="trafficVeryMuchLighterThanNormal"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "RelativeTrafficFlowEnum")
@XmlEnum
public enum RelativeTrafficFlowEnum {

    @XmlEnumValue("trafficVeryMuchHeavierThanNormal")
    TRAFFIC_VERY_MUCH_HEAVIER_THAN_NORMAL("trafficVeryMuchHeavierThanNormal"),
    @XmlEnumValue("trafficHeavierThanNormal")
    TRAFFIC_HEAVIER_THAN_NORMAL("trafficHeavierThanNormal"),
    @XmlEnumValue("trafficFlowNormal")
    TRAFFIC_FLOW_NORMAL("trafficFlowNormal"),
    @XmlEnumValue("trafficLighterThanNormal")
    TRAFFIC_LIGHTER_THAN_NORMAL("trafficLighterThanNormal"),
    @XmlEnumValue("trafficVeryMuchLighterThanNormal")
    TRAFFIC_VERY_MUCH_LIGHTER_THAN_NORMAL("trafficVeryMuchLighterThanNormal");
    private final String value;

    RelativeTrafficFlowEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static RelativeTrafficFlowEnum fromValue(String v) {
        for (RelativeTrafficFlowEnum c: RelativeTrafficFlowEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
