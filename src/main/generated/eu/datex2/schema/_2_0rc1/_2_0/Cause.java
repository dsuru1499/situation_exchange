
package eu.datex2.schema._2_0rc1._2_0;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour Cause complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="Cause">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="causeExtension" type="{http://datex2.eu/schema/2_0RC1/2_0}ExtensionType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Cause", propOrder = {
    "causeExtension"
})
@XmlSeeAlso({
    NonManagedCause.class,
    ManagedCause.class
})
public abstract class Cause
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    protected ExtensionType causeExtension;

    /**
     * Obtient la valeur de la propriété causeExtension.
     * 
     * @return
     *     possible object is
     *     {@link ExtensionType }
     *     
     */
    public ExtensionType getCauseExtension() {
        return causeExtension;
    }

    /**
     * Définit la valeur de la propriété causeExtension.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtensionType }
     *     
     */
    public void setCauseExtension(ExtensionType value) {
        this.causeExtension = value;
    }

    public boolean isSetCauseExtension() {
        return (this.causeExtension!= null);
    }

}
