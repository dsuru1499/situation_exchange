
package eu.datex2.schema._2_0rc1._2_0;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour AnimalPresenceTypeEnum.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * <p>
 * <pre>
 * &lt;simpleType name="AnimalPresenceTypeEnum">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="animalsOnTheRoad"/>
 *     &lt;enumeration value="herdOfAnimalsOnTheRoad"/>
 *     &lt;enumeration value="largeAnimalsOnTheRoad"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "AnimalPresenceTypeEnum")
@XmlEnum
public enum AnimalPresenceTypeEnum {

    @XmlEnumValue("animalsOnTheRoad")
    ANIMALS_ON_THE_ROAD("animalsOnTheRoad"),
    @XmlEnumValue("herdOfAnimalsOnTheRoad")
    HERD_OF_ANIMALS_ON_THE_ROAD("herdOfAnimalsOnTheRoad"),
    @XmlEnumValue("largeAnimalsOnTheRoad")
    LARGE_ANIMALS_ON_THE_ROAD("largeAnimalsOnTheRoad");
    private final String value;

    AnimalPresenceTypeEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static AnimalPresenceTypeEnum fromValue(String v) {
        for (AnimalPresenceTypeEnum c: AnimalPresenceTypeEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
