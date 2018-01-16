
package eu.datex2.schema._2_0rc1._2_0;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour LocationByReference complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="LocationByReference">
 *   &lt;complexContent>
 *     &lt;extension base="{http://datex2.eu/schema/2_0RC1/2_0}Location">
 *       &lt;sequence>
 *         &lt;element name="predefinedLocationReference" type="{http://datex2.eu/schema/2_0RC1/2_0}Reference"/>
 *         &lt;element name="locationByReferenceExtension" type="{http://datex2.eu/schema/2_0RC1/2_0}ExtensionType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LocationByReference", propOrder = {
    "predefinedLocationReference",
    "locationByReferenceExtension"
})
public class LocationByReference
    extends Location
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(required = true)
    protected String predefinedLocationReference;
    protected ExtensionType locationByReferenceExtension;

    /**
     * Obtient la valeur de la propriété predefinedLocationReference.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPredefinedLocationReference() {
        return predefinedLocationReference;
    }

    /**
     * Définit la valeur de la propriété predefinedLocationReference.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPredefinedLocationReference(String value) {
        this.predefinedLocationReference = value;
    }

    public boolean isSetPredefinedLocationReference() {
        return (this.predefinedLocationReference!= null);
    }

    /**
     * Obtient la valeur de la propriété locationByReferenceExtension.
     * 
     * @return
     *     possible object is
     *     {@link ExtensionType }
     *     
     */
    public ExtensionType getLocationByReferenceExtension() {
        return locationByReferenceExtension;
    }

    /**
     * Définit la valeur de la propriété locationByReferenceExtension.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtensionType }
     *     
     */
    public void setLocationByReferenceExtension(ExtensionType value) {
        this.locationByReferenceExtension = value;
    }

    public boolean isSetLocationByReferenceExtension() {
        return (this.locationByReferenceExtension!= null);
    }

}
