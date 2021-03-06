
package eu.datex2.schema._2_0rc1._2_0;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour CountryEnum.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * <p>
 * <pre>
 * &lt;simpleType name="CountryEnum">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="at"/>
 *     &lt;enumeration value="be"/>
 *     &lt;enumeration value="bg"/>
 *     &lt;enumeration value="ch"/>
 *     &lt;enumeration value="cs"/>
 *     &lt;enumeration value="cy"/>
 *     &lt;enumeration value="cz"/>
 *     &lt;enumeration value="de"/>
 *     &lt;enumeration value="dk"/>
 *     &lt;enumeration value="ee"/>
 *     &lt;enumeration value="es"/>
 *     &lt;enumeration value="fi"/>
 *     &lt;enumeration value="fo"/>
 *     &lt;enumeration value="fr"/>
 *     &lt;enumeration value="gb"/>
 *     &lt;enumeration value="gg"/>
 *     &lt;enumeration value="gi"/>
 *     &lt;enumeration value="gr"/>
 *     &lt;enumeration value="hr"/>
 *     &lt;enumeration value="hu"/>
 *     &lt;enumeration value="ie"/>
 *     &lt;enumeration value="im"/>
 *     &lt;enumeration value="is"/>
 *     &lt;enumeration value="it"/>
 *     &lt;enumeration value="je"/>
 *     &lt;enumeration value="li"/>
 *     &lt;enumeration value="lt"/>
 *     &lt;enumeration value="lu"/>
 *     &lt;enumeration value="lv"/>
 *     &lt;enumeration value="ma"/>
 *     &lt;enumeration value="mc"/>
 *     &lt;enumeration value="mk"/>
 *     &lt;enumeration value="mt"/>
 *     &lt;enumeration value="nl"/>
 *     &lt;enumeration value="no"/>
 *     &lt;enumeration value="pl"/>
 *     &lt;enumeration value="pt"/>
 *     &lt;enumeration value="ro"/>
 *     &lt;enumeration value="se"/>
 *     &lt;enumeration value="si"/>
 *     &lt;enumeration value="sk"/>
 *     &lt;enumeration value="sm"/>
 *     &lt;enumeration value="tr"/>
 *     &lt;enumeration value="va"/>
 *     &lt;enumeration value="other"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "CountryEnum")
@XmlEnum
public enum CountryEnum {

    @XmlEnumValue("at")
    AT("at"),
    @XmlEnumValue("be")
    BE("be"),
    @XmlEnumValue("bg")
    BG("bg"),
    @XmlEnumValue("ch")
    CH("ch"),
    @XmlEnumValue("cs")
    CS("cs"),
    @XmlEnumValue("cy")
    CY("cy"),
    @XmlEnumValue("cz")
    CZ("cz"),
    @XmlEnumValue("de")
    DE("de"),
    @XmlEnumValue("dk")
    DK("dk"),
    @XmlEnumValue("ee")
    EE("ee"),
    @XmlEnumValue("es")
    ES("es"),
    @XmlEnumValue("fi")
    FI("fi"),
    @XmlEnumValue("fo")
    FO("fo"),
    @XmlEnumValue("fr")
    FR("fr"),
    @XmlEnumValue("gb")
    GB("gb"),
    @XmlEnumValue("gg")
    GG("gg"),
    @XmlEnumValue("gi")
    GI("gi"),
    @XmlEnumValue("gr")
    GR("gr"),
    @XmlEnumValue("hr")
    HR("hr"),
    @XmlEnumValue("hu")
    HU("hu"),
    @XmlEnumValue("ie")
    IE("ie"),
    @XmlEnumValue("im")
    IM("im"),
    @XmlEnumValue("is")
    IS("is"),
    @XmlEnumValue("it")
    IT("it"),
    @XmlEnumValue("je")
    JE("je"),
    @XmlEnumValue("li")
    LI("li"),
    @XmlEnumValue("lt")
    LT("lt"),
    @XmlEnumValue("lu")
    LU("lu"),
    @XmlEnumValue("lv")
    LV("lv"),
    @XmlEnumValue("ma")
    MA("ma"),
    @XmlEnumValue("mc")
    MC("mc"),
    @XmlEnumValue("mk")
    MK("mk"),
    @XmlEnumValue("mt")
    MT("mt"),
    @XmlEnumValue("nl")
    NL("nl"),
    @XmlEnumValue("no")
    NO("no"),
    @XmlEnumValue("pl")
    PL("pl"),
    @XmlEnumValue("pt")
    PT("pt"),
    @XmlEnumValue("ro")
    RO("ro"),
    @XmlEnumValue("se")
    SE("se"),
    @XmlEnumValue("si")
    SI("si"),
    @XmlEnumValue("sk")
    SK("sk"),
    @XmlEnumValue("sm")
    SM("sm"),
    @XmlEnumValue("tr")
    TR("tr"),
    @XmlEnumValue("va")
    VA("va"),
    @XmlEnumValue("other")
    OTHER("other");
    private final String value;

    CountryEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static CountryEnum fromValue(String v) {
        for (CountryEnum c: CountryEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
