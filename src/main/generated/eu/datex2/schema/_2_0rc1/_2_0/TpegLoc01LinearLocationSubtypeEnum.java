
package eu.datex2.schema._2_0rc1._2_0;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour TpegLoc01LinearLocationSubtypeEnum.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * <p>
 * <pre>
 * &lt;simpleType name="TpegLoc01LinearLocationSubtypeEnum">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="segment"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "TpegLoc01LinearLocationSubtypeEnum")
@XmlEnum
public enum TpegLoc01LinearLocationSubtypeEnum {

    @XmlEnumValue("segment")
    SEGMENT("segment");
    private final String value;

    TpegLoc01LinearLocationSubtypeEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TpegLoc01LinearLocationSubtypeEnum fromValue(String v) {
        for (TpegLoc01LinearLocationSubtypeEnum c: TpegLoc01LinearLocationSubtypeEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
