
package eu.datex2.schema._2_0rc1._2_0;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour TrafficFlowCharacteristicsEnum.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * <p>
 * <pre>
 * &lt;simpleType name="TrafficFlowCharacteristicsEnum">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="erraticFlow"/>
 *     &lt;enumeration value="smoothFlow"/>
 *     &lt;enumeration value="stopAndGo"/>
 *     &lt;enumeration value="trafficBlocked"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "TrafficFlowCharacteristicsEnum")
@XmlEnum
public enum TrafficFlowCharacteristicsEnum {

    @XmlEnumValue("erraticFlow")
    ERRATIC_FLOW("erraticFlow"),
    @XmlEnumValue("smoothFlow")
    SMOOTH_FLOW("smoothFlow"),
    @XmlEnumValue("stopAndGo")
    STOP_AND_GO("stopAndGo"),
    @XmlEnumValue("trafficBlocked")
    TRAFFIC_BLOCKED("trafficBlocked");
    private final String value;

    TrafficFlowCharacteristicsEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TrafficFlowCharacteristicsEnum fromValue(String v) {
        for (TrafficFlowCharacteristicsEnum c: TrafficFlowCharacteristicsEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
