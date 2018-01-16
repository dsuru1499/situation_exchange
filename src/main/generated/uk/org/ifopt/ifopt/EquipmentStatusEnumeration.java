
package uk.org.ifopt.ifopt;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour EquipmentStatusEnumeration.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * <p>
 * <pre>
 * &lt;simpleType name="EquipmentStatusEnumeration">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN">
 *     &lt;enumeration value="unknown"/>
 *     &lt;enumeration value="available"/>
 *     &lt;enumeration value="notAvailable"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "EquipmentStatusEnumeration")
@XmlEnum
public enum EquipmentStatusEnumeration {

    @XmlEnumValue("unknown")
    UNKNOWN("unknown"),
    @XmlEnumValue("available")
    AVAILABLE("available"),
    @XmlEnumValue("notAvailable")
    NOT_AVAILABLE("notAvailable");
    private final String value;

    EquipmentStatusEnumeration(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static EquipmentStatusEnumeration fromValue(String v) {
        for (EquipmentStatusEnumeration c: EquipmentStatusEnumeration.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
