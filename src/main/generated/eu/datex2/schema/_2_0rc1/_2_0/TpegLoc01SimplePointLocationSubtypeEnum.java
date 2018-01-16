
package eu.datex2.schema._2_0rc1._2_0;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour TpegLoc01SimplePointLocationSubtypeEnum.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * <p>
 * <pre>
 * &lt;simpleType name="TpegLoc01SimplePointLocationSubtypeEnum">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="intersection"/>
 *     &lt;enumeration value="nonLinkedPoint"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "TpegLoc01SimplePointLocationSubtypeEnum")
@XmlEnum
public enum TpegLoc01SimplePointLocationSubtypeEnum {

    @XmlEnumValue("intersection")
    INTERSECTION("intersection"),
    @XmlEnumValue("nonLinkedPoint")
    NON_LINKED_POINT("nonLinkedPoint");
    private final String value;

    TpegLoc01SimplePointLocationSubtypeEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TpegLoc01SimplePointLocationSubtypeEnum fromValue(String v) {
        for (TpegLoc01SimplePointLocationSubtypeEnum c: TpegLoc01SimplePointLocationSubtypeEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
