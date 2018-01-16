
package uk.org.siri.siri;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Summary information about a LINE type.
 * 
 * <p>Classe Java pour AnnotatedLineStructure complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="AnnotatedLineStructure">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="LineRef" type="{http://www.siri.org.uk/siri}LineRefStructure"/>
 *         &lt;element name="LineName" type="{http://www.siri.org.uk/siri}NaturalLanguageStringStructure" maxOccurs="unbounded"/>
 *         &lt;element name="Monitored" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="Destinations" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element ref="{http://www.siri.org.uk/siri}Destination" maxOccurs="unbounded"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="Directions" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="Direction" type="{http://www.siri.org.uk/siri}RouteDirectionStructure" maxOccurs="unbounded"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element ref="{http://www.siri.org.uk/siri}Extensions" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AnnotatedLineStructure", propOrder = {
    "lineRef",
    "lineName",
    "monitored",
    "destinations",
    "directions",
    "extensions"
})
public class AnnotatedLineStructure
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "LineRef", required = true)
    protected LineRefStructure lineRef;
    @XmlElement(name = "LineName", required = true)
    protected List<NaturalLanguageStringStructure> lineName;
    @XmlElement(name = "Monitored", defaultValue = "true")
    protected boolean monitored;
    @XmlElement(name = "Destinations")
    protected AnnotatedLineStructure.Destinations destinations;
    @XmlElement(name = "Directions")
    protected AnnotatedLineStructure.Directions directions;
    @XmlElement(name = "Extensions")
    protected ExtensionsStructure extensions;

    /**
     * Obtient la valeur de la propriété lineRef.
     * 
     * @return
     *     possible object is
     *     {@link LineRefStructure }
     *     
     */
    public LineRefStructure getLineRef() {
        return lineRef;
    }

    /**
     * Définit la valeur de la propriété lineRef.
     * 
     * @param value
     *     allowed object is
     *     {@link LineRefStructure }
     *     
     */
    public void setLineRef(LineRefStructure value) {
        this.lineRef = value;
    }

    public boolean isSetLineRef() {
        return (this.lineRef!= null);
    }

    /**
     * Gets the value of the lineName property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the lineName property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLineName().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link NaturalLanguageStringStructure }
     * 
     * 
     */
    public List<NaturalLanguageStringStructure> getLineName() {
        if (lineName == null) {
            lineName = new ArrayList<NaturalLanguageStringStructure>();
        }
        return this.lineName;
    }

    public boolean isSetLineName() {
        return ((this.lineName!= null)&&(!this.lineName.isEmpty()));
    }

    public void unsetLineName() {
        this.lineName = null;
    }

    /**
     * Obtient la valeur de la propriété monitored.
     * 
     */
    public boolean isMonitored() {
        return monitored;
    }

    /**
     * Définit la valeur de la propriété monitored.
     * 
     */
    public void setMonitored(boolean value) {
        this.monitored = value;
    }

    public boolean isSetMonitored() {
        return true;
    }

    /**
     * Obtient la valeur de la propriété destinations.
     * 
     * @return
     *     possible object is
     *     {@link AnnotatedLineStructure.Destinations }
     *     
     */
    public AnnotatedLineStructure.Destinations getDestinations() {
        return destinations;
    }

    /**
     * Définit la valeur de la propriété destinations.
     * 
     * @param value
     *     allowed object is
     *     {@link AnnotatedLineStructure.Destinations }
     *     
     */
    public void setDestinations(AnnotatedLineStructure.Destinations value) {
        this.destinations = value;
    }

    public boolean isSetDestinations() {
        return (this.destinations!= null);
    }

    /**
     * Obtient la valeur de la propriété directions.
     * 
     * @return
     *     possible object is
     *     {@link AnnotatedLineStructure.Directions }
     *     
     */
    public AnnotatedLineStructure.Directions getDirections() {
        return directions;
    }

    /**
     * Définit la valeur de la propriété directions.
     * 
     * @param value
     *     allowed object is
     *     {@link AnnotatedLineStructure.Directions }
     *     
     */
    public void setDirections(AnnotatedLineStructure.Directions value) {
        this.directions = value;
    }

    public boolean isSetDirections() {
        return (this.directions!= null);
    }

    /**
     * Obtient la valeur de la propriété extensions.
     * 
     * @return
     *     possible object is
     *     {@link ExtensionsStructure }
     *     
     */
    public ExtensionsStructure getExtensions() {
        return extensions;
    }

    /**
     * Définit la valeur de la propriété extensions.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtensionsStructure }
     *     
     */
    public void setExtensions(ExtensionsStructure value) {
        this.extensions = value;
    }

    public boolean isSetExtensions() {
        return (this.extensions!= null);
    }


    /**
     * <p>Classe Java pour anonymous complex type.
     * 
     * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element ref="{http://www.siri.org.uk/siri}Destination" maxOccurs="unbounded"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "destination"
    })
    public static class Destinations
        implements Serializable
    {

        private final static long serialVersionUID = 1L;
        @XmlElement(name = "Destination", required = true)
        protected List<AnnotatedDestinationStructure> destination;

        /**
         * Gets the value of the destination property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the destination property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getDestination().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link AnnotatedDestinationStructure }
         * 
         * 
         */
        public List<AnnotatedDestinationStructure> getDestination() {
            if (destination == null) {
                destination = new ArrayList<AnnotatedDestinationStructure>();
            }
            return this.destination;
        }

        public boolean isSetDestination() {
            return ((this.destination!= null)&&(!this.destination.isEmpty()));
        }

        public void unsetDestination() {
            this.destination = null;
        }

    }


    /**
     * <p>Classe Java pour anonymous complex type.
     * 
     * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="Direction" type="{http://www.siri.org.uk/siri}RouteDirectionStructure" maxOccurs="unbounded"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "direction"
    })
    public static class Directions
        implements Serializable
    {

        private final static long serialVersionUID = 1L;
        @XmlElement(name = "Direction", required = true)
        protected List<RouteDirectionStructure> direction;

        /**
         * Gets the value of the direction property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the direction property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getDirection().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link RouteDirectionStructure }
         * 
         * 
         */
        public List<RouteDirectionStructure> getDirection() {
            if (direction == null) {
                direction = new ArrayList<RouteDirectionStructure>();
            }
            return this.direction;
        }

        public boolean isSetDirection() {
            return ((this.direction!= null)&&(!this.direction.isEmpty()));
        }

        public void unsetDirection() {
            this.direction = null;
        }

    }

}
