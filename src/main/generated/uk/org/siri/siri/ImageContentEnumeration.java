
package uk.org.siri.siri;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour ImageContentEnumeration.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * <p>
 * <pre>
 * &lt;simpleType name="ImageContentEnumeration">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN">
 *     &lt;enumeration value="map"/>
 *     &lt;enumeration value="graphic"/>
 *     &lt;enumeration value="logo"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ImageContentEnumeration")
@XmlEnum
public enum ImageContentEnumeration {

    @XmlEnumValue("map")
    MAP("map"),
    @XmlEnumValue("graphic")
    GRAPHIC("graphic"),
    @XmlEnumValue("logo")
    LOGO("logo");
    private final String value;

    ImageContentEnumeration(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ImageContentEnumeration fromValue(String v) {
        for (ImageContentEnumeration c: ImageContentEnumeration.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}