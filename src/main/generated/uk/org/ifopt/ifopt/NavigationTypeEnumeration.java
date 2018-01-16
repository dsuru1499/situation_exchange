
package uk.org.ifopt.ifopt;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour NavigationTypeEnumeration.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * <p>
 * <pre>
 * &lt;simpleType name="NavigationTypeEnumeration">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN">
 *     &lt;enumeration value="hallToQuay"/>
 *     &lt;enumeration value="hallToStreet"/>
 *     &lt;enumeration value="quayToHall"/>
 *     &lt;enumeration value="quayToQuay"/>
 *     &lt;enumeration value="quayToStreet"/>
 *     &lt;enumeration value="streetToHall"/>
 *     &lt;enumeration value="streetToQuay"/>
 *     &lt;enumeration value="other"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "NavigationTypeEnumeration")
@XmlEnum
public enum NavigationTypeEnumeration {

    @XmlEnumValue("hallToQuay")
    HALL_TO_QUAY("hallToQuay"),
    @XmlEnumValue("hallToStreet")
    HALL_TO_STREET("hallToStreet"),
    @XmlEnumValue("quayToHall")
    QUAY_TO_HALL("quayToHall"),
    @XmlEnumValue("quayToQuay")
    QUAY_TO_QUAY("quayToQuay"),
    @XmlEnumValue("quayToStreet")
    QUAY_TO_STREET("quayToStreet"),
    @XmlEnumValue("streetToHall")
    STREET_TO_HALL("streetToHall"),
    @XmlEnumValue("streetToQuay")
    STREET_TO_QUAY("streetToQuay"),
    @XmlEnumValue("other")
    OTHER("other");
    private final String value;

    NavigationTypeEnumeration(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static NavigationTypeEnumeration fromValue(String v) {
        for (NavigationTypeEnumeration c: NavigationTypeEnumeration.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
