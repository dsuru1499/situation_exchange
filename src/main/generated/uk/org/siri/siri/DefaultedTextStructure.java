
package uk.org.siri.siri;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * Type for a text that may be overridden.
 * 
 * <p>Classe Java pour DefaultedTextStructure complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="DefaultedTextStructure">
 *   &lt;simpleContent>
 *     &lt;extension base="&lt;http://www.siri.org.uk/siri>NaturalLanguageStringStructure">
 *       &lt;attribute name="overridden" type="{http://www.w3.org/2001/XMLSchema}boolean" default="true" />
 *     &lt;/extension>
 *   &lt;/simpleContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DefaultedTextStructure")
public class DefaultedTextStructure
    extends NaturalLanguageStringStructure
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlAttribute(name = "overridden")
    protected Boolean overridden;

    /**
     * Obtient la valeur de la propriété overridden.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isOverridden() {
        if (overridden == null) {
            return true;
        } else {
            return overridden;
        }
    }

    /**
     * Définit la valeur de la propriété overridden.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setOverridden(boolean value) {
        this.overridden = value;
    }

    public boolean isSetOverridden() {
        return (this.overridden!= null);
    }

    public void unsetOverridden() {
        this.overridden = null;
    }

}
