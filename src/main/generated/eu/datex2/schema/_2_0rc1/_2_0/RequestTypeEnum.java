
package eu.datex2.schema._2_0rc1._2_0;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour RequestTypeEnum.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * <p>
 * <pre>
 * &lt;simpleType name="RequestTypeEnum">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="catalogue"/>
 *     &lt;enumeration value="filter"/>
 *     &lt;enumeration value="requestData"/>
 *     &lt;enumeration value="requestHistoricalData"/>
 *     &lt;enumeration value="subscription"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "RequestTypeEnum")
@XmlEnum
public enum RequestTypeEnum {

    @XmlEnumValue("catalogue")
    CATALOGUE("catalogue"),
    @XmlEnumValue("filter")
    FILTER("filter"),
    @XmlEnumValue("requestData")
    REQUEST_DATA("requestData"),
    @XmlEnumValue("requestHistoricalData")
    REQUEST_HISTORICAL_DATA("requestHistoricalData"),
    @XmlEnumValue("subscription")
    SUBSCRIPTION("subscription");
    private final String value;

    RequestTypeEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static RequestTypeEnum fromValue(String v) {
        for (RequestTypeEnum c: RequestTypeEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
