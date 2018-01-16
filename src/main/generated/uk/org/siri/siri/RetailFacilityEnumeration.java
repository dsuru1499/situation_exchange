
package uk.org.siri.siri;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour RetailFacilityEnumeration.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * <p>
 * <pre>
 * &lt;simpleType name="RetailFacilityEnumeration">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN">
 *     &lt;enumeration value="unknown"/>
 *     &lt;enumeration value="food"/>
 *     &lt;enumeration value="newspaperTobacco"/>
 *     &lt;enumeration value="recreationTravel"/>
 *     &lt;enumeration value="hygieneHealthBeauty"/>
 *     &lt;enumeration value="fashionAccessories"/>
 *     &lt;enumeration value="bankFinanceInsurance"/>
 *     &lt;enumeration value="cashMachine"/>
 *     &lt;enumeration value="currencyExchange"/>
 *     &lt;enumeration value="tourismService"/>
 *     &lt;enumeration value="photoBooth"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "RetailFacilityEnumeration")
@XmlEnum
public enum RetailFacilityEnumeration {

    @XmlEnumValue("unknown")
    UNKNOWN("unknown"),
    @XmlEnumValue("food")
    FOOD("food"),
    @XmlEnumValue("newspaperTobacco")
    NEWSPAPER_TOBACCO("newspaperTobacco"),
    @XmlEnumValue("recreationTravel")
    RECREATION_TRAVEL("recreationTravel"),
    @XmlEnumValue("hygieneHealthBeauty")
    HYGIENE_HEALTH_BEAUTY("hygieneHealthBeauty"),
    @XmlEnumValue("fashionAccessories")
    FASHION_ACCESSORIES("fashionAccessories"),
    @XmlEnumValue("bankFinanceInsurance")
    BANK_FINANCE_INSURANCE("bankFinanceInsurance"),
    @XmlEnumValue("cashMachine")
    CASH_MACHINE("cashMachine"),
    @XmlEnumValue("currencyExchange")
    CURRENCY_EXCHANGE("currencyExchange"),
    @XmlEnumValue("tourismService")
    TOURISM_SERVICE("tourismService"),
    @XmlEnumValue("photoBooth")
    PHOTO_BOOTH("photoBooth");
    private final String value;

    RetailFacilityEnumeration(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static RetailFacilityEnumeration fromValue(String v) {
        for (RetailFacilityEnumeration c: RetailFacilityEnumeration.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
