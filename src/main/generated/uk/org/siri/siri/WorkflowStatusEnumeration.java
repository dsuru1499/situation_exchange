
package uk.org.siri.siri;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour WorkflowStatusEnumeration.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * <p>
 * <pre>
 * &lt;simpleType name="WorkflowStatusEnumeration">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN">
 *     &lt;enumeration value="draft"/>
 *     &lt;enumeration value="approvedDraft"/>
 *     &lt;enumeration value="open"/>
 *     &lt;enumeration value="published"/>
 *     &lt;enumeration value="closing"/>
 *     &lt;enumeration value="closed"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "WorkflowStatusEnumeration")
@XmlEnum
public enum WorkflowStatusEnumeration {

    @XmlEnumValue("draft")
    DRAFT("draft"),
    @XmlEnumValue("approvedDraft")
    APPROVED_DRAFT("approvedDraft"),
    @XmlEnumValue("open")
    OPEN("open"),
    @XmlEnumValue("published")
    PUBLISHED("published"),
    @XmlEnumValue("closing")
    CLOSING("closing"),
    @XmlEnumValue("closed")
    CLOSED("closed");
    private final String value;

    WorkflowStatusEnumeration(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static WorkflowStatusEnumeration fromValue(String v) {
        for (WorkflowStatusEnumeration c: WorkflowStatusEnumeration.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
