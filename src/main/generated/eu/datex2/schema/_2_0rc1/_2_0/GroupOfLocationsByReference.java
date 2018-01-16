
package eu.datex2.schema._2_0rc1._2_0;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour GroupOfLocationsByReference complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="GroupOfLocationsByReference">
 *   &lt;complexContent>
 *     &lt;extension base="{http://datex2.eu/schema/2_0RC1/2_0}GroupOfLocations">
 *       &lt;sequence>
 *         &lt;element name="predefinedLocationSetReference" type="{http://datex2.eu/schema/2_0RC1/2_0}Reference"/>
 *         &lt;element name="groupOfLocationsByReferenceExtension" type="{http://datex2.eu/schema/2_0RC1/2_0}ExtensionType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GroupOfLocationsByReference", propOrder = {
    "predefinedLocationSetReference",
    "groupOfLocationsByReferenceExtension"
})
public class GroupOfLocationsByReference
    extends GroupOfLocations
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(required = true)
    protected String predefinedLocationSetReference;
    protected ExtensionType groupOfLocationsByReferenceExtension;

    /**
     * Obtient la valeur de la propriété predefinedLocationSetReference.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPredefinedLocationSetReference() {
        return predefinedLocationSetReference;
    }

    /**
     * Définit la valeur de la propriété predefinedLocationSetReference.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPredefinedLocationSetReference(String value) {
        this.predefinedLocationSetReference = value;
    }

    public boolean isSetPredefinedLocationSetReference() {
        return (this.predefinedLocationSetReference!= null);
    }

    /**
     * Obtient la valeur de la propriété groupOfLocationsByReferenceExtension.
     * 
     * @return
     *     possible object is
     *     {@link ExtensionType }
     *     
     */
    public ExtensionType getGroupOfLocationsByReferenceExtension() {
        return groupOfLocationsByReferenceExtension;
    }

    /**
     * Définit la valeur de la propriété groupOfLocationsByReferenceExtension.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtensionType }
     *     
     */
    public void setGroupOfLocationsByReferenceExtension(ExtensionType value) {
        this.groupOfLocationsByReferenceExtension = value;
    }

    public boolean isSetGroupOfLocationsByReferenceExtension() {
        return (this.groupOfLocationsByReferenceExtension!= null);
    }

}
