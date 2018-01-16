
package uk.org.siri.siri;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import uk.org.ifopt.ifopt.NavigationPathRefStructure;
import uk.org.ifopt.ifopt.StopPlaceRefStructure;
import uk.org.ifopt.ifopt.StopPlaceTypeEnumeration;


/**
 * Type for information about the Stop Places affected by an SITUATION.
 * 
 * <p>Classe Java pour AffectedStopPlaceStructure complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="AffectedStopPlaceStructure">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.siri.org.uk/siri}AffectedStopPlaceElementStructure">
 *       &lt;sequence>
 *         &lt;element name="StopPlaceRef" type="{http://www.ifopt.org.uk/ifopt}StopPlaceRefStructure"/>
 *         &lt;element name="PlaceName" type="{http://www.siri.org.uk/siri}NaturalLanguageStringStructure" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="StopPlaceType" type="{http://www.ifopt.org.uk/ifopt}StopPlaceTypeEnumeration" minOccurs="0"/>
 *         &lt;element name="AffectedFacilities" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="AffectedFacility" type="{http://www.siri.org.uk/siri}AffectedFacilityStructure" maxOccurs="unbounded"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="AffectedComponents" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="AffectedComponent" type="{http://www.siri.org.uk/siri}AffectedStopPlaceComponentStructure" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="AffectedNavigationPaths" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="NavigationPathRef" type="{http://www.ifopt.org.uk/ifopt}NavigationPathRefStructure" maxOccurs="unbounded"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element ref="{http://www.siri.org.uk/siri}Extensions" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AffectedStopPlaceStructure", propOrder = {
    "stopPlaceRef",
    "placeName",
    "stopPlaceType",
    "affectedFacilities",
    "affectedComponents",
    "affectedNavigationPaths",
    "extensions"
})
public class AffectedStopPlaceStructure
    extends AffectedStopPlaceElementStructure
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "StopPlaceRef", required = true)
    protected StopPlaceRefStructure stopPlaceRef;
    @XmlElement(name = "PlaceName")
    protected List<NaturalLanguageStringStructure> placeName;
    @XmlElement(name = "StopPlaceType")
    protected StopPlaceTypeEnumeration stopPlaceType;
    @XmlElement(name = "AffectedFacilities")
    protected AffectedStopPlaceStructure.AffectedFacilities affectedFacilities;
    @XmlElement(name = "AffectedComponents")
    protected AffectedStopPlaceStructure.AffectedComponents affectedComponents;
    @XmlElement(name = "AffectedNavigationPaths")
    protected AffectedStopPlaceStructure.AffectedNavigationPaths affectedNavigationPaths;
    @XmlElement(name = "Extensions")
    protected ExtensionsStructure extensions;

    /**
     * Obtient la valeur de la propriété stopPlaceRef.
     * 
     * @return
     *     possible object is
     *     {@link StopPlaceRefStructure }
     *     
     */
    public StopPlaceRefStructure getStopPlaceRef() {
        return stopPlaceRef;
    }

    /**
     * Définit la valeur de la propriété stopPlaceRef.
     * 
     * @param value
     *     allowed object is
     *     {@link StopPlaceRefStructure }
     *     
     */
    public void setStopPlaceRef(StopPlaceRefStructure value) {
        this.stopPlaceRef = value;
    }

    public boolean isSetStopPlaceRef() {
        return (this.stopPlaceRef!= null);
    }

    /**
     * Gets the value of the placeName property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the placeName property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPlaceName().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link NaturalLanguageStringStructure }
     * 
     * 
     */
    public List<NaturalLanguageStringStructure> getPlaceName() {
        if (placeName == null) {
            placeName = new ArrayList<NaturalLanguageStringStructure>();
        }
        return this.placeName;
    }

    public boolean isSetPlaceName() {
        return ((this.placeName!= null)&&(!this.placeName.isEmpty()));
    }

    public void unsetPlaceName() {
        this.placeName = null;
    }

    /**
     * Obtient la valeur de la propriété stopPlaceType.
     * 
     * @return
     *     possible object is
     *     {@link StopPlaceTypeEnumeration }
     *     
     */
    public StopPlaceTypeEnumeration getStopPlaceType() {
        return stopPlaceType;
    }

    /**
     * Définit la valeur de la propriété stopPlaceType.
     * 
     * @param value
     *     allowed object is
     *     {@link StopPlaceTypeEnumeration }
     *     
     */
    public void setStopPlaceType(StopPlaceTypeEnumeration value) {
        this.stopPlaceType = value;
    }

    public boolean isSetStopPlaceType() {
        return (this.stopPlaceType!= null);
    }

    /**
     * Obtient la valeur de la propriété affectedFacilities.
     * 
     * @return
     *     possible object is
     *     {@link AffectedStopPlaceStructure.AffectedFacilities }
     *     
     */
    public AffectedStopPlaceStructure.AffectedFacilities getAffectedFacilities() {
        return affectedFacilities;
    }

    /**
     * Définit la valeur de la propriété affectedFacilities.
     * 
     * @param value
     *     allowed object is
     *     {@link AffectedStopPlaceStructure.AffectedFacilities }
     *     
     */
    public void setAffectedFacilities(AffectedStopPlaceStructure.AffectedFacilities value) {
        this.affectedFacilities = value;
    }

    public boolean isSetAffectedFacilities() {
        return (this.affectedFacilities!= null);
    }

    /**
     * Obtient la valeur de la propriété affectedComponents.
     * 
     * @return
     *     possible object is
     *     {@link AffectedStopPlaceStructure.AffectedComponents }
     *     
     */
    public AffectedStopPlaceStructure.AffectedComponents getAffectedComponents() {
        return affectedComponents;
    }

    /**
     * Définit la valeur de la propriété affectedComponents.
     * 
     * @param value
     *     allowed object is
     *     {@link AffectedStopPlaceStructure.AffectedComponents }
     *     
     */
    public void setAffectedComponents(AffectedStopPlaceStructure.AffectedComponents value) {
        this.affectedComponents = value;
    }

    public boolean isSetAffectedComponents() {
        return (this.affectedComponents!= null);
    }

    /**
     * Obtient la valeur de la propriété affectedNavigationPaths.
     * 
     * @return
     *     possible object is
     *     {@link AffectedStopPlaceStructure.AffectedNavigationPaths }
     *     
     */
    public AffectedStopPlaceStructure.AffectedNavigationPaths getAffectedNavigationPaths() {
        return affectedNavigationPaths;
    }

    /**
     * Définit la valeur de la propriété affectedNavigationPaths.
     * 
     * @param value
     *     allowed object is
     *     {@link AffectedStopPlaceStructure.AffectedNavigationPaths }
     *     
     */
    public void setAffectedNavigationPaths(AffectedStopPlaceStructure.AffectedNavigationPaths value) {
        this.affectedNavigationPaths = value;
    }

    public boolean isSetAffectedNavigationPaths() {
        return (this.affectedNavigationPaths!= null);
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
     *         &lt;element name="AffectedComponent" type="{http://www.siri.org.uk/siri}AffectedStopPlaceComponentStructure" maxOccurs="unbounded" minOccurs="0"/>
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
        "affectedComponent"
    })
    public static class AffectedComponents
        implements Serializable
    {

        private final static long serialVersionUID = 1L;
        @XmlElement(name = "AffectedComponent")
        protected List<AffectedStopPlaceComponentStructure> affectedComponent;

        /**
         * Gets the value of the affectedComponent property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the affectedComponent property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getAffectedComponent().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link AffectedStopPlaceComponentStructure }
         * 
         * 
         */
        public List<AffectedStopPlaceComponentStructure> getAffectedComponent() {
            if (affectedComponent == null) {
                affectedComponent = new ArrayList<AffectedStopPlaceComponentStructure>();
            }
            return this.affectedComponent;
        }

        public boolean isSetAffectedComponent() {
            return ((this.affectedComponent!= null)&&(!this.affectedComponent.isEmpty()));
        }

        public void unsetAffectedComponent() {
            this.affectedComponent = null;
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
     *         &lt;element name="AffectedFacility" type="{http://www.siri.org.uk/siri}AffectedFacilityStructure" maxOccurs="unbounded"/>
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
        "affectedFacility"
    })
    public static class AffectedFacilities
        implements Serializable
    {

        private final static long serialVersionUID = 1L;
        @XmlElement(name = "AffectedFacility", required = true)
        protected List<AffectedFacilityStructure> affectedFacility;

        /**
         * Gets the value of the affectedFacility property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the affectedFacility property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getAffectedFacility().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link AffectedFacilityStructure }
         * 
         * 
         */
        public List<AffectedFacilityStructure> getAffectedFacility() {
            if (affectedFacility == null) {
                affectedFacility = new ArrayList<AffectedFacilityStructure>();
            }
            return this.affectedFacility;
        }

        public boolean isSetAffectedFacility() {
            return ((this.affectedFacility!= null)&&(!this.affectedFacility.isEmpty()));
        }

        public void unsetAffectedFacility() {
            this.affectedFacility = null;
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
     *         &lt;element name="NavigationPathRef" type="{http://www.ifopt.org.uk/ifopt}NavigationPathRefStructure" maxOccurs="unbounded"/>
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
        "navigationPathRef"
    })
    public static class AffectedNavigationPaths
        implements Serializable
    {

        private final static long serialVersionUID = 1L;
        @XmlElement(name = "NavigationPathRef", required = true)
        protected List<NavigationPathRefStructure> navigationPathRef;

        /**
         * Gets the value of the navigationPathRef property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the navigationPathRef property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getNavigationPathRef().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link NavigationPathRefStructure }
         * 
         * 
         */
        public List<NavigationPathRefStructure> getNavigationPathRef() {
            if (navigationPathRef == null) {
                navigationPathRef = new ArrayList<NavigationPathRefStructure>();
            }
            return this.navigationPathRef;
        }

        public boolean isSetNavigationPathRef() {
            return ((this.navigationPathRef!= null)&&(!this.navigationPathRef.isEmpty()));
        }

        public void unsetNavigationPathRef() {
            this.navigationPathRef = null;
        }

    }

}
