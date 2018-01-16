
package eu.datex2.schema._2_0rc1._2_0;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour Location complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="Location">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="externalReferencing" type="{http://datex2.eu/schema/2_0RC1/2_0}ExternalReferencing" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="locationForDisplay" type="{http://datex2.eu/schema/2_0RC1/2_0}PointCoordinates" minOccurs="0"/>
 *         &lt;element name="locationExtension" type="{http://datex2.eu/schema/2_0RC1/2_0}ExtensionType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Location", propOrder = {
    "externalReferencing",
    "locationForDisplay",
    "locationExtension"
})
@XmlSeeAlso({
    Area.class,
    eu.datex2.schema._2_0rc1._2_0.Itinerary.LocationContainedInItinerary.class,
    LocationByReference.class,
    NetworkLocation.class
})
public abstract class Location
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    protected List<ExternalReferencing> externalReferencing;
    protected PointCoordinates locationForDisplay;
    protected ExtensionType locationExtension;

    /**
     * Gets the value of the externalReferencing property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the externalReferencing property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getExternalReferencing().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ExternalReferencing }
     * 
     * 
     */
    public List<ExternalReferencing> getExternalReferencing() {
        if (externalReferencing == null) {
            externalReferencing = new ArrayList<ExternalReferencing>();
        }
        return this.externalReferencing;
    }

    public boolean isSetExternalReferencing() {
        return ((this.externalReferencing!= null)&&(!this.externalReferencing.isEmpty()));
    }

    public void unsetExternalReferencing() {
        this.externalReferencing = null;
    }

    /**
     * Obtient la valeur de la propriété locationForDisplay.
     * 
     * @return
     *     possible object is
     *     {@link PointCoordinates }
     *     
     */
    public PointCoordinates getLocationForDisplay() {
        return locationForDisplay;
    }

    /**
     * Définit la valeur de la propriété locationForDisplay.
     * 
     * @param value
     *     allowed object is
     *     {@link PointCoordinates }
     *     
     */
    public void setLocationForDisplay(PointCoordinates value) {
        this.locationForDisplay = value;
    }

    public boolean isSetLocationForDisplay() {
        return (this.locationForDisplay!= null);
    }

    /**
     * Obtient la valeur de la propriété locationExtension.
     * 
     * @return
     *     possible object is
     *     {@link ExtensionType }
     *     
     */
    public ExtensionType getLocationExtension() {
        return locationExtension;
    }

    /**
     * Définit la valeur de la propriété locationExtension.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtensionType }
     *     
     */
    public void setLocationExtension(ExtensionType value) {
        this.locationExtension = value;
    }

    public boolean isSetLocationExtension() {
        return (this.locationExtension!= null);
    }

}
