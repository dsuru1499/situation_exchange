
package uk.org.siri.siri;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElements;
import javax.xml.bind.annotation.XmlType;
import uk.org.ifopt.ifopt.LinkProjectionStructure;


/**
 * Type for information about the routes affected by a SITUATION.
 * 
 * <p>Classe Java pour AffectedRouteStructure complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="AffectedRouteStructure">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="RouteRef" type="{http://www.siri.org.uk/siri}RouteRefStructure" minOccurs="0"/>
 *         &lt;element name="Direction" type="{http://www.siri.org.uk/siri}DirectionStructure" maxOccurs="unbounded" minOccurs="0"/>
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
 *         &lt;element name="StopPoints" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="AffectedOnly" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *                   &lt;sequence maxOccurs="unbounded">
 *                     &lt;element name="AffectedStopPoint" type="{http://www.siri.org.uk/siri}AffectedStopPointStructure"/>
 *                     &lt;element name="LinkProjectionToNextStopPoint" type="{http://www.ifopt.org.uk/ifopt}LinkProjectionStructure" minOccurs="0"/>
 *                   &lt;/sequence>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="RouteLinks" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="RouteLinkRef" type="{http://www.siri.org.uk/siri}RouteLinkRefStructure" maxOccurs="unbounded"/>
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
@XmlType(name = "AffectedRouteStructure", propOrder = {
    "routeRef",
    "direction",
    "sections",
    "stopPoints",
    "routeLinks",
    "extensions"
})
public class AffectedRouteStructure
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "RouteRef")
    protected RouteRefStructure routeRef;
    @XmlElement(name = "Direction")
    protected List<DirectionStructure> direction;
    @XmlElement(name = "Sections")
    protected AffectedRouteStructure.Sections sections;
    @XmlElement(name = "StopPoints")
    protected AffectedRouteStructure.StopPoints stopPoints;
    @XmlElement(name = "RouteLinks")
    protected AffectedRouteStructure.RouteLinks routeLinks;
    @XmlElement(name = "Extensions")
    protected ExtensionsStructure extensions;

    /**
     * Obtient la valeur de la propriété routeRef.
     * 
     * @return
     *     possible object is
     *     {@link RouteRefStructure }
     *     
     */
    public RouteRefStructure getRouteRef() {
        return routeRef;
    }

    /**
     * Définit la valeur de la propriété routeRef.
     * 
     * @param value
     *     allowed object is
     *     {@link RouteRefStructure }
     *     
     */
    public void setRouteRef(RouteRefStructure value) {
        this.routeRef = value;
    }

    public boolean isSetRouteRef() {
        return (this.routeRef!= null);
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
     * Obtient la valeur de la propriété sections.
     * 
     * @return
     *     possible object is
     *     {@link AffectedRouteStructure.Sections }
     *     
     */
    public AffectedRouteStructure.Sections getSections() {
        return sections;
    }

    /**
     * Définit la valeur de la propriété sections.
     * 
     * @param value
     *     allowed object is
     *     {@link AffectedRouteStructure.Sections }
     *     
     */
    public void setSections(AffectedRouteStructure.Sections value) {
        this.sections = value;
    }

    public boolean isSetSections() {
        return (this.sections!= null);
    }

    /**
     * Obtient la valeur de la propriété stopPoints.
     * 
     * @return
     *     possible object is
     *     {@link AffectedRouteStructure.StopPoints }
     *     
     */
    public AffectedRouteStructure.StopPoints getStopPoints() {
        return stopPoints;
    }

    /**
     * Définit la valeur de la propriété stopPoints.
     * 
     * @param value
     *     allowed object is
     *     {@link AffectedRouteStructure.StopPoints }
     *     
     */
    public void setStopPoints(AffectedRouteStructure.StopPoints value) {
        this.stopPoints = value;
    }

    public boolean isSetStopPoints() {
        return (this.stopPoints!= null);
    }

    /**
     * Obtient la valeur de la propriété routeLinks.
     * 
     * @return
     *     possible object is
     *     {@link AffectedRouteStructure.RouteLinks }
     *     
     */
    public AffectedRouteStructure.RouteLinks getRouteLinks() {
        return routeLinks;
    }

    /**
     * Définit la valeur de la propriété routeLinks.
     * 
     * @param value
     *     allowed object is
     *     {@link AffectedRouteStructure.RouteLinks }
     *     
     */
    public void setRouteLinks(AffectedRouteStructure.RouteLinks value) {
        this.routeLinks = value;
    }

    public boolean isSetRouteLinks() {
        return (this.routeLinks!= null);
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
     *         &lt;element name="RouteLinkRef" type="{http://www.siri.org.uk/siri}RouteLinkRefStructure" maxOccurs="unbounded"/>
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
        "routeLinkRef"
    })
    public static class RouteLinks
        implements Serializable
    {

        private final static long serialVersionUID = 1L;
        @XmlElement(name = "RouteLinkRef", required = true)
        protected List<RouteLinkRefStructure> routeLinkRef;

        /**
         * Gets the value of the routeLinkRef property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the routeLinkRef property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getRouteLinkRef().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link RouteLinkRefStructure }
         * 
         * 
         */
        public List<RouteLinkRefStructure> getRouteLinkRef() {
            if (routeLinkRef == null) {
                routeLinkRef = new ArrayList<RouteLinkRefStructure>();
            }
            return this.routeLinkRef;
        }

        public boolean isSetRouteLinkRef() {
            return ((this.routeLinkRef!= null)&&(!this.routeLinkRef.isEmpty()));
        }

        public void unsetRouteLinkRef() {
            this.routeLinkRef = null;
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
     *         &lt;element name="AffectedOnly" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
     *         &lt;sequence maxOccurs="unbounded">
     *           &lt;element name="AffectedStopPoint" type="{http://www.siri.org.uk/siri}AffectedStopPointStructure"/>
     *           &lt;element name="LinkProjectionToNextStopPoint" type="{http://www.ifopt.org.uk/ifopt}LinkProjectionStructure" minOccurs="0"/>
     *         &lt;/sequence>
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
        "affectedOnly",
        "affectedStopPointAndLinkProjectionToNextStopPoint"
    })
    public static class StopPoints
        implements Serializable
    {

        private final static long serialVersionUID = 1L;
        @XmlElement(name = "AffectedOnly", defaultValue = "false")
        protected Boolean affectedOnly;
        @XmlElements({
            @XmlElement(name = "AffectedStopPoint", required = true, type = AffectedStopPointStructure.class),
            @XmlElement(name = "LinkProjectionToNextStopPoint", required = true, type = LinkProjectionStructure.class)
        })
        protected List<Serializable> affectedStopPointAndLinkProjectionToNextStopPoint;

        /**
         * Obtient la valeur de la propriété affectedOnly.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isAffectedOnly() {
            return affectedOnly;
        }

        /**
         * Définit la valeur de la propriété affectedOnly.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setAffectedOnly(Boolean value) {
            this.affectedOnly = value;
        }

        public boolean isSetAffectedOnly() {
            return (this.affectedOnly!= null);
        }

        /**
         * Gets the value of the affectedStopPointAndLinkProjectionToNextStopPoint property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the affectedStopPointAndLinkProjectionToNextStopPoint property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getAffectedStopPointAndLinkProjectionToNextStopPoint().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link AffectedStopPointStructure }
         * {@link LinkProjectionStructure }
         * 
         * 
         */
        public List<Serializable> getAffectedStopPointAndLinkProjectionToNextStopPoint() {
            if (affectedStopPointAndLinkProjectionToNextStopPoint == null) {
                affectedStopPointAndLinkProjectionToNextStopPoint = new ArrayList<Serializable>();
            }
            return this.affectedStopPointAndLinkProjectionToNextStopPoint;
        }

        public boolean isSetAffectedStopPointAndLinkProjectionToNextStopPoint() {
            return ((this.affectedStopPointAndLinkProjectionToNextStopPoint!= null)&&(!this.affectedStopPointAndLinkProjectionToNextStopPoint.isEmpty()));
        }

        public void unsetAffectedStopPointAndLinkProjectionToNextStopPoint() {
            this.affectedStopPointAndLinkProjectionToNextStopPoint = null;
        }

    }

}
