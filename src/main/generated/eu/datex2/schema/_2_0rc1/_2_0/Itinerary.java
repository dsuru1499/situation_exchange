
package eu.datex2.schema._2_0rc1._2_0;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour Itinerary complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="Itinerary">
 *   &lt;complexContent>
 *     &lt;extension base="{http://datex2.eu/schema/2_0RC1/2_0}GroupOfLocations">
 *       &lt;sequence>
 *         &lt;element name="locationContainedInItinerary" maxOccurs="unbounded">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;extension base="{http://datex2.eu/schema/2_0RC1/2_0}Location">
 *                 &lt;attribute name="index" use="required" type="{http://www.w3.org/2001/XMLSchema}int" />
 *               &lt;/extension>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="routeDestination" type="{http://datex2.eu/schema/2_0RC1/2_0}Destination" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="itineraryExtension" type="{http://datex2.eu/schema/2_0RC1/2_0}ExtensionType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Itinerary", propOrder = {
    "locationContainedInItinerary",
    "routeDestination",
    "itineraryExtension"
})
public class Itinerary
    extends GroupOfLocations
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(required = true)
    protected List<Itinerary.LocationContainedInItinerary> locationContainedInItinerary;
    protected List<Destination> routeDestination;
    protected ExtensionType itineraryExtension;

    /**
     * Gets the value of the locationContainedInItinerary property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the locationContainedInItinerary property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLocationContainedInItinerary().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Itinerary.LocationContainedInItinerary }
     * 
     * 
     */
    public List<Itinerary.LocationContainedInItinerary> getLocationContainedInItinerary() {
        if (locationContainedInItinerary == null) {
            locationContainedInItinerary = new ArrayList<Itinerary.LocationContainedInItinerary>();
        }
        return this.locationContainedInItinerary;
    }

    public boolean isSetLocationContainedInItinerary() {
        return ((this.locationContainedInItinerary!= null)&&(!this.locationContainedInItinerary.isEmpty()));
    }

    public void unsetLocationContainedInItinerary() {
        this.locationContainedInItinerary = null;
    }

    /**
     * Gets the value of the routeDestination property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the routeDestination property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRouteDestination().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Destination }
     * 
     * 
     */
    public List<Destination> getRouteDestination() {
        if (routeDestination == null) {
            routeDestination = new ArrayList<Destination>();
        }
        return this.routeDestination;
    }

    public boolean isSetRouteDestination() {
        return ((this.routeDestination!= null)&&(!this.routeDestination.isEmpty()));
    }

    public void unsetRouteDestination() {
        this.routeDestination = null;
    }

    /**
     * Obtient la valeur de la propriété itineraryExtension.
     * 
     * @return
     *     possible object is
     *     {@link ExtensionType }
     *     
     */
    public ExtensionType getItineraryExtension() {
        return itineraryExtension;
    }

    /**
     * Définit la valeur de la propriété itineraryExtension.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtensionType }
     *     
     */
    public void setItineraryExtension(ExtensionType value) {
        this.itineraryExtension = value;
    }

    public boolean isSetItineraryExtension() {
        return (this.itineraryExtension!= null);
    }


    /**
     * <p>Classe Java pour anonymous complex type.
     * 
     * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;extension base="{http://datex2.eu/schema/2_0RC1/2_0}Location">
     *       &lt;attribute name="index" use="required" type="{http://www.w3.org/2001/XMLSchema}int" />
     *     &lt;/extension>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class LocationContainedInItinerary
        extends Location
        implements Serializable
    {

        private final static long serialVersionUID = 1L;
        @XmlAttribute(name = "index", required = true)
        protected int index;

        /**
         * Obtient la valeur de la propriété index.
         * 
         */
        public int getIndex() {
            return index;
        }

        /**
         * Définit la valeur de la propriété index.
         * 
         */
        public void setIndex(int value) {
            this.index = value;
        }

        public boolean isSetIndex() {
            return true;
        }

    }

}
