
package eu.datex2.schema._2_0rc1._2_0;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour AbnormalTrafficTypeEnum.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * <p>
 * <pre>
 * &lt;simpleType name="AbnormalTrafficTypeEnum">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="stationaryTraffic"/>
 *     &lt;enumeration value="queuingTraffic"/>
 *     &lt;enumeration value="slowTraffic"/>
 *     &lt;enumeration value="heavyTraffic"/>
 *     &lt;enumeration value="unspecifiedAbnormalTraffic"/>
 *     &lt;enumeration value="other"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "AbnormalTrafficTypeEnum")
@XmlEnum
public enum AbnormalTrafficTypeEnum {

    @XmlEnumValue("stationaryTraffic")
    STATIONARY_TRAFFIC("stationaryTraffic"),
    @XmlEnumValue("queuingTraffic")
    QUEUING_TRAFFIC("queuingTraffic"),
    @XmlEnumValue("slowTraffic")
    SLOW_TRAFFIC("slowTraffic"),
    @XmlEnumValue("heavyTraffic")
    HEAVY_TRAFFIC("heavyTraffic"),
    @XmlEnumValue("unspecifiedAbnormalTraffic")
    UNSPECIFIED_ABNORMAL_TRAFFIC("unspecifiedAbnormalTraffic"),
    @XmlEnumValue("other")
    OTHER("other");
    private final String value;

    AbnormalTrafficTypeEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static AbnormalTrafficTypeEnum fromValue(String v) {
        for (AbnormalTrafficTypeEnum c: AbnormalTrafficTypeEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
