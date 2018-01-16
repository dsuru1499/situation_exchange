
package eu.datex2.schema._2_0rc1._2_0;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour ExternalReferencing complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="ExternalReferencing">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="externalLocationCode" type="{http://datex2.eu/schema/2_0RC1/2_0}String"/>
 *         &lt;element name="externalReferencingSystem" type="{http://datex2.eu/schema/2_0RC1/2_0}String"/>
 *         &lt;element name="externalReferencingExtension" type="{http://datex2.eu/schema/2_0RC1/2_0}ExtensionType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ExternalReferencing", propOrder = {
    "externalLocationCode",
    "externalReferencingSystem",
    "externalReferencingExtension"
})
public class ExternalReferencing
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(required = true)
    protected String externalLocationCode;
    @XmlElement(required = true)
    protected String externalReferencingSystem;
    protected ExtensionType externalReferencingExtension;

    /**
     * Obtient la valeur de la propriété externalLocationCode.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExternalLocationCode() {
        return externalLocationCode;
    }

    /**
     * Définit la valeur de la propriété externalLocationCode.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExternalLocationCode(String value) {
        this.externalLocationCode = value;
    }

    public boolean isSetExternalLocationCode() {
        return (this.externalLocationCode!= null);
    }

    /**
     * Obtient la valeur de la propriété externalReferencingSystem.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExternalReferencingSystem() {
        return externalReferencingSystem;
    }

    /**
     * Définit la valeur de la propriété externalReferencingSystem.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExternalReferencingSystem(String value) {
        this.externalReferencingSystem = value;
    }

    public boolean isSetExternalReferencingSystem() {
        return (this.externalReferencingSystem!= null);
    }

    /**
     * Obtient la valeur de la propriété externalReferencingExtension.
     * 
     * @return
     *     possible object is
     *     {@link ExtensionType }
     *     
     */
    public ExtensionType getExternalReferencingExtension() {
        return externalReferencingExtension;
    }

    /**
     * Définit la valeur de la propriété externalReferencingExtension.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtensionType }
     *     
     */
    public void setExternalReferencingExtension(ExtensionType value) {
        this.externalReferencingExtension = value;
    }

    public boolean isSetExternalReferencingExtension() {
        return (this.externalReferencingExtension!= null);
    }

}
