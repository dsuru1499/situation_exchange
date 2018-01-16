
package uk.org.ifopt.ifopt;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour DeltaModificationEnumeration.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * <p>
 * <pre>
 * &lt;simpleType name="DeltaModificationEnumeration">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN">
 *     &lt;enumeration value="new"/>
 *     &lt;enumeration value="delete"/>
 *     &lt;enumeration value="revise"/>
 *     &lt;enumeration value="delta"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "DeltaModificationEnumeration")
@XmlEnum
public enum DeltaModificationEnumeration {


    /**
     * This is a definition of a new entity.
     * 
     */
    @XmlEnumValue("new")
    NEW("new"),

    /**
     * This is a deletion of an existing entity.
     * 
     */
    @XmlEnumValue("delete")
    DELETE("delete"),

    /**
     * This is a revision to an existing entity. All values are replaced.
     * 
     */
    @XmlEnumValue("revise")
    REVISE("revise"),

    /**
     * This is a change to an existing enity. Only those values expliciitly supplied will be changed.
     * 
     */
    @XmlEnumValue("delta")
    DELTA("delta");
    private final String value;

    DeltaModificationEnumeration(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static DeltaModificationEnumeration fromValue(String v) {
        for (DeltaModificationEnumeration c: DeltaModificationEnumeration.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
