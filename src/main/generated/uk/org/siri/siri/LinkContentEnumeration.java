
package uk.org.siri.siri;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour LinkContentEnumeration.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * <p>
 * <pre>
 * &lt;simpleType name="LinkContentEnumeration">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN">
 *     &lt;enumeration value="timetable"/>
 *     &lt;enumeration value="relatedSite"/>
 *     &lt;enumeration value="details"/>
 *     &lt;enumeration value="advice"/>
 *     &lt;enumeration value="other"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "LinkContentEnumeration")
@XmlEnum
public enum LinkContentEnumeration {

    @XmlEnumValue("timetable")
    TIMETABLE("timetable"),
    @XmlEnumValue("relatedSite")
    RELATED_SITE("relatedSite"),
    @XmlEnumValue("details")
    DETAILS("details"),
    @XmlEnumValue("advice")
    ADVICE("advice"),
    @XmlEnumValue("other")
    OTHER("other");
    private final String value;

    LinkContentEnumeration(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static LinkContentEnumeration fromValue(String v) {
        for (LinkContentEnumeration c: LinkContentEnumeration.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
