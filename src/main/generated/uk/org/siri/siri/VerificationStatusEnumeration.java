
package uk.org.siri.siri;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour VerificationStatusEnumeration.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * <p>
 * <pre>
 * &lt;simpleType name="VerificationStatusEnumeration">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN">
 *     &lt;enumeration value="pti32_0"/>
 *     &lt;enumeration value="unknown"/>
 *     &lt;enumeration value="pti32_1"/>
 *     &lt;enumeration value="unverified"/>
 *     &lt;enumeration value="pti32_255"/>
 *     &lt;enumeration value="verified"/>
 *     &lt;enumeration value="verifiedAsDuplicate"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "VerificationStatusEnumeration")
@XmlEnum
public enum VerificationStatusEnumeration {

    @XmlEnumValue("pti32_0")
    PTI_32_0("pti32_0"),
    @XmlEnumValue("unknown")
    UNKNOWN("unknown"),
    @XmlEnumValue("pti32_1")
    PTI_32_1("pti32_1"),
    @XmlEnumValue("unverified")
    UNVERIFIED("unverified"),
    @XmlEnumValue("pti32_255")
    PTI_32_255("pti32_255"),
    @XmlEnumValue("verified")
    VERIFIED("verified"),
    @XmlEnumValue("verifiedAsDuplicate")
    VERIFIED_AS_DUPLICATE("verifiedAsDuplicate");
    private final String value;

    VerificationStatusEnumeration(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static VerificationStatusEnumeration fromValue(String v) {
        for (VerificationStatusEnumeration c: VerificationStatusEnumeration.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
