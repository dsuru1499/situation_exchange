
package uk.org.siri.siri;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Type for information about the LINEs affected by a SITUATION.
 * 
 * <p>Classe Java pour AffectedLineStructure complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="AffectedLineStructure">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="AffectedOperator" type="{http://www.siri.org.uk/siri}AffectedOperatorStructure" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;group ref="{http://www.siri.org.uk/siri}LineGroup"/>
 *         &lt;element name="Destinations" type="{http://www.siri.org.uk/siri}AffectedStopPointStructure" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Direction" type="{http://www.siri.org.uk/siri}DirectionStructure" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Routes" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="AffectedRoute" type="{http://www.siri.org.uk/siri}AffectedRouteStructure" maxOccurs="unbounded"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="Sections" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="AffectedSection" type="{http://www.siri.org.uk/siri}AffectedSectionStructure" maxOccurs="unbounded"/>
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
@XmlType(name = "AffectedLineStructure", propOrder = {
    "affectedOperator",
    "lineRef",
    "publishedLineName",
    "destinations",
    "direction",
    "routes",
    "sections",
    "extensions"
})
public class AffectedLineStructure
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "AffectedOperator")
    protected List<AffectedOperatorStructure> affectedOperator;
    @XmlElement(name = "LineRef", required = true)
    protected LineRefStructure lineRef;
    @XmlElement(name = "PublishedLineName")
    protected NaturalLanguageStringStructure publishedLineName;
    @XmlElement(name = "Destinations")
    protected List<AffectedStopPointStructure> destinations;
    @XmlElement(name = "Direction")
    protected List<DirectionStructure> direction;
    @XmlElement(name = "Routes")
    protected AffectedLineStructure.Routes routes;
    @XmlElement(name = "Sections")
    protected AffectedLineStructure.Sections sections;
    @XmlElement(name = "Extensions")
    protected ExtensionsStructure extensions;

    /**
     * Gets the value of the affectedOperator property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the affectedOperator property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAffectedOperator().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AffectedOperatorStructure }
     * 
     * 
     */
    public List<AffectedOperatorStructure> getAffectedOperator() {
        if (affectedOperator == null) {
            affectedOperator = new ArrayList<AffectedOperatorStructure>();
        }
        return this.affectedOperator;
    }

    public boolean isSetAffectedOperator() {
        return ((this.affectedOperator!= null)&&(!this.affectedOperator.isEmpty()));
    }

    public void unsetAffectedOperator() {
        this.affectedOperator = null;
    }

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
     * Obtient la valeur de la propriété publishedLineName.
     * 
     * @return
     *     possible object is
     *     {@link NaturalLanguageStringStructure }
     *     
     */
    public NaturalLanguageStringStructure getPublishedLineName() {
        return publishedLineName;
    }

    /**
     * Définit la valeur de la propriété publishedLineName.
     * 
     * @param value
     *     allowed object is
     *     {@link NaturalLanguageStringStructure }
     *     
     */
    public void setPublishedLineName(NaturalLanguageStringStructure value) {
        this.publishedLineName = value;
    }

    public boolean isSetPublishedLineName() {
        return (this.publishedLineName!= null);
    }

    /**
     * Gets the value of the destinations property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the destinations property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDestinations().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AffectedStopPointStructure }
     * 
     * 
     */
    public List<AffectedStopPointStructure> getDestinations() {
        if (destinations == null) {
            destinations = new ArrayList<AffectedStopPointStructure>();
        }
        return this.destinations;
    }

    public boolean isSetDestinations() {
        return ((this.destinations!= null)&&(!this.destinations.isEmpty()));
    }

    public void unsetDestinations() {
        this.destinations = null;
    }

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
     * {@link DirectionStructure }
     * 
     * 
     */
    public List<DirectionStructure> getDirection() {
        if (direction == null) {
            direction = new ArrayList<DirectionStructure>();
        }
        return this.direction;
    }

    public boolean isSetDirection() {
        return ((this.direction!= null)&&(!this.direction.isEmpty()));
    }

    public void unsetDirection() {
        this.direction = null;
    }

    /**
     * Obtient la valeur de la propriété routes.
     * 
     * @return
     *     possible object is
     *     {@link AffectedLineStructure.Routes }
     *     
     */
    public AffectedLineStructure.Routes getRoutes() {
        return routes;
    }

    /**
     * Définit la valeur de la propriété routes.
     * 
     * @param value
     *     allowed object is
     *     {@link AffectedLineStructure.Routes }
     *     
     */
    public void setRoutes(AffectedLineStructure.Routes value) {
        this.routes = value;
    }

    public boolean isSetRoutes() {
        return (this.routes!= null);
    }

    /**
     * Obtient la valeur de la propriété sections.
     * 
     * @return
     *     possible object is
     *     {@link AffectedLineStructure.Sections }
     *     
     */
    public AffectedLineStructure.Sections getSections() {
        return sections;
    }

    /**
     * Définit la valeur de la propriété sections.
     * 
     * @param value
     *     allowed object is
     *     {@link AffectedLineStructure.Sections }
     *     
     */
    public void setSections(AffectedLineStructure.Sections value) {
        this.sections = value;
    }

    public boolean isSetSections() {
        return (this.sections!= null);
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
     *         &lt;element name="AffectedRoute" type="{http://www.siri.org.uk/siri}AffectedRouteStructure" maxOccurs="unbounded"/>
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
        "affectedRoute"
    })
    public static class Routes
        implements Serializable
    {

        private final static long serialVersionUID = 1L;
        @XmlElement(name = "AffectedRoute", required = true)
        protected List<AffectedRouteStructure> affectedRoute;

        /**
         * Gets the value of the affectedRoute property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the affectedRoute property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getAffectedRoute().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link AffectedRouteStructure }
         * 
         * 
         */
        public List<AffectedRouteStructure> getAffectedRoute() {
            if (affectedRoute == null) {
                affectedRoute = new ArrayList<AffectedRouteStructure>();
            }
            return this.affectedRoute;
        }

        public boolean isSetAffectedRoute() {
            return ((this.affectedRoute!= null)&&(!this.affectedRoute.isEmpty()));
        }

        public void unsetAffectedRoute() {
            this.affectedRoute = null;
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
     *         &lt;element name="AffectedSection" type="{http://www.siri.org.uk/siri}AffectedSectionStructure" maxOccurs="unbounded"/>
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
        "affectedSection"
    })
    public static class Sections
        implements Serializable
    {

        private final static long serialVersionUID = 1L;
        @XmlElement(name = "AffectedSection", required = true)
        protected List<AffectedSectionStructure> affectedSection;

        /**
         * Gets the value of the affectedSection property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the affectedSection property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getAffectedSection().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link AffectedSectionStructure }
         * 
         * 
         */
        public List<AffectedSectionStructure> getAffectedSection() {
            if (affectedSection == null) {
                affectedSection = new ArrayList<AffectedSectionStructure>();
            }
            return this.affectedSection;
        }

        public boolean isSetAffectedSection() {
            return ((this.affectedSection!= null)&&(!this.affectedSection.isEmpty()));
        }

        public void unsetAffectedSection() {
            this.affectedSection = null;
        }

    }

}
