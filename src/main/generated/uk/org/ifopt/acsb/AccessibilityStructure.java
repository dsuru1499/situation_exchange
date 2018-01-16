
package uk.org.ifopt.acsb;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;


/**
 * Type for accessibility.
 * 
 * <p>Classe Java pour AccessibilityStructure complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="AccessibilityStructure">
 *   &lt;simpleContent>
 *     &lt;extension base="&lt;http://www.ifopt.org.uk/acsb>AccessibilityEnumeration">
 *     &lt;/extension>
 *   &lt;/simpleContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AccessibilityStructure", propOrder = {
    "value"
})
public class AccessibilityStructure
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlValue
    protected AccessibilityEnumeration value;

    /**
     * Enumeration of values for an accessibility value.
     * 
     * @return
     *     possible object is
     *     {@link AccessibilityEnumeration }
     *     
     */
    public AccessibilityEnumeration getValue() {
        return value;
    }

    /**
     * Définit la valeur de la propriété value.
     * 
     * @param value
     *     allowed object is
     *     {@link AccessibilityEnumeration }
     *     
     */
    public void setValue(AccessibilityEnumeration value) {
        this.value = value;
    }

    public boolean isSetValue() {
        return (this.value!= null);
    }

}
