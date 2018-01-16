
package eu.datex2.schema._2_0rc1._2_0;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour VmsTypeEnum.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * <p>
 * <pre>
 * &lt;simpleType name="VmsTypeEnum">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="colourGraphic"/>
 *     &lt;enumeration value="continuousSign"/>
 *     &lt;enumeration value="monochromeGraphic"/>
 *     &lt;enumeration value="other"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "VmsTypeEnum")
@XmlEnum
public enum VmsTypeEnum {

    @XmlEnumValue("colourGraphic")
    COLOUR_GRAPHIC("colourGraphic"),
    @XmlEnumValue("continuousSign")
    CONTINUOUS_SIGN("continuousSign"),
    @XmlEnumValue("monochromeGraphic")
    MONOCHROME_GRAPHIC("monochromeGraphic"),
    @XmlEnumValue("other")
    OTHER("other");
    private final String value;

    VmsTypeEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static VmsTypeEnum fromValue(String v) {
        for (VmsTypeEnum c: VmsTypeEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
