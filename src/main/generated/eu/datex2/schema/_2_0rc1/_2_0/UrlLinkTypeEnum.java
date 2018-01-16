
package eu.datex2.schema._2_0rc1._2_0;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour UrlLinkTypeEnum.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * <p>
 * <pre>
 * &lt;simpleType name="UrlLinkTypeEnum">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="documentPdf"/>
 *     &lt;enumeration value="html"/>
 *     &lt;enumeration value="image"/>
 *     &lt;enumeration value="rss"/>
 *     &lt;enumeration value="videoStream"/>
 *     &lt;enumeration value="voiceStream"/>
 *     &lt;enumeration value="other"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "UrlLinkTypeEnum")
@XmlEnum
public enum UrlLinkTypeEnum {

    @XmlEnumValue("documentPdf")
    DOCUMENT_PDF("documentPdf"),
    @XmlEnumValue("html")
    HTML("html"),
    @XmlEnumValue("image")
    IMAGE("image"),
    @XmlEnumValue("rss")
    RSS("rss"),
    @XmlEnumValue("videoStream")
    VIDEO_STREAM("videoStream"),
    @XmlEnumValue("voiceStream")
    VOICE_STREAM("voiceStream"),
    @XmlEnumValue("other")
    OTHER("other");
    private final String value;

    UrlLinkTypeEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static UrlLinkTypeEnum fromValue(String v) {
        for (UrlLinkTypeEnum c: UrlLinkTypeEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
