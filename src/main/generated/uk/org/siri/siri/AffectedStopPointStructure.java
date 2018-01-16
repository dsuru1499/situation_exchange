
package uk.org.siri.siri;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import uk.org.ifopt.acsb.AccessibilityAssessmentStructure;


/**
 * Type for an SCHEDUELD STOP POINT affected by a SITUATION.
 * 
 * <p>Classe Java pour AffectedStopPointStructure complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="AffectedStopPointStructure">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.siri.org.uk/siri}StopPointRef" minOccurs="0"/>
 *         &lt;element name="PrivateRef" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="StopPointName" type="{http://www.siri.org.uk/siri}NaturalLanguageStringStructure" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="StopPointType" type="{http://www.siri.org.uk/siri}StopPointTypeEnumeration" minOccurs="0"/>
 *         &lt;element name="Location" type="{http://www.siri.org.uk/siri}LocationStructure" minOccurs="0"/>
 *         &lt;element name="AffectedModes" type="{http://www.siri.org.uk/siri}AffectedModesStructure" minOccurs="0"/>
 *         &lt;element name="PlaceRef" type="{http://www.siri.org.uk/siri}ZoneRefStructure" minOccurs="0"/>
 *         &lt;element name="PlaceName" type="{http://www.siri.org.uk/siri}NaturalLanguageStringStructure" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="AccessibilityAssessment" type="{http://www.ifopt.org.uk/acsb}AccessibilityAssessmentStructure" minOccurs="0"/>
 *         &lt;element name="StopCondition" type="{http://www.siri.org.uk/siri}RoutePointTypeEnumeration" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="ConnectionLinks" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="AffectedConnectionLink" type="{http://www.siri.org.uk/siri}AffectedConnectionLinkStructure" maxOccurs="unbounded"/>
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
@XmlType(name = "AffectedStopPointStructure", propOrder = {
    "stopPointRef",
    "privateRef",
    "stopPointName",
    "stopPointType",
    "location",
    "affectedModes",
    "placeRef",
    "placeName",
    "accessibilityAssessment",
    "stopCondition",
    "connectionLinks",
    "extensions"
})
@XmlSeeAlso({
    AffectedCallStructure.class
})
public class AffectedStopPointStructure implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "StopPointRef")
    protected StopPointRefStructure stopPointRef;
    @XmlElement(name = "PrivateRef")
    protected String privateRef;
    @XmlElement(name = "StopPointName")
    protected List<NaturalLanguageStringStructure> stopPointName;
    @XmlElement(name = "StopPointType")
    protected StopPointTypeEnumeration stopPointType;
    @XmlElement(name = "Location")
    protected LocationStructure location;
    @XmlElement(name = "AffectedModes")
    protected AffectedModesStructure affectedModes;
    @XmlElement(name = "PlaceRef")
    protected ZoneRefStructure placeRef;
    @XmlElement(name = "PlaceName")
    protected List<NaturalLanguageStringStructure> placeName;
    @XmlElement(name = "AccessibilityAssessment")
    protected AccessibilityAssessmentStructure accessibilityAssessment;
    @XmlElement(name = "StopCondition")
    protected List<RoutePointTypeEnumeration> stopCondition;
    @XmlElement(name = "ConnectionLinks")
    protected AffectedStopPointStructure.ConnectionLinks connectionLinks;
    @XmlElement(name = "Extensions")
    protected ExtensionsStructure extensions;

    /**
     * Obtient la valeur de la propriété stopPointRef.
     * 
     * @return
     *     possible object is
     *     {@link StopPointRefStructure }
     *     
     */
    public StopPointRefStructure getStopPointRef() {
        return stopPointRef;
    }

    /**
     * Définit la valeur de la propriété stopPointRef.
     * 
     * @param value
     *     allowed object is
     *     {@link StopPointRefStructure }
     *     
     */
    public void setStopPointRef(StopPointRefStructure value) {
        this.stopPointRef = value;
    }

    public boolean isSetStopPointRef() {
        return (this.stopPointRef!= null);
    }

    /**
     * Obtient la valeur de la propriété privateRef.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrivateRef() {
        return privateRef;
    }

    /**
     * Définit la valeur de la propriété privateRef.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrivateRef(String value) {
        this.privateRef = value;
    }

    public boolean isSetPrivateRef() {
        return (this.privateRef!= null);
    }

    /**
     * Gets the value of the stopPointName property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the stopPointName property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getStopPointName().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link NaturalLanguageStringStructure }
     * 
     * 
     */
    public List<NaturalLanguageStringStructure> getStopPointName() {
        if (stopPointName == null) {
            stopPointName = new ArrayList<NaturalLanguageStringStructure>();
        }
        return this.stopPointName;
    }

    public boolean isSetStopPointName() {
        return ((this.stopPointName!= null)&&(!this.stopPointName.isEmpty()));
    }

    public void unsetStopPointName() {
        this.stopPointName = null;
    }

    /**
     * Obtient la valeur de la propriété stopPointType.
     * 
     * @return
     *     possible object is
     *     {@link StopPointTypeEnumeration }
     *     
     */
    public StopPointTypeEnumeration getStopPointType() {
        return stopPointType;
    }

    /**
     * Définit la valeur de la propriété stopPointType.
     * 
     * @param value
     *     allowed object is
     *     {@link StopPointTypeEnumeration }
     *     
     */
    public void setStopPointType(StopPointTypeEnumeration value) {
        this.stopPointType = value;
    }

    public boolean isSetStopPointType() {
        return (this.stopPointType!= null);
    }

    /**
     * Obtient la valeur de la propriété location.
     * 
     * @return
     *     possible object is
     *     {@link LocationStructure }
     *     
     */
    public LocationStructure getLocation() {
        return location;
    }

    /**
     * Définit la valeur de la propriété location.
     * 
     * @param value
     *     allowed object is
     *     {@link LocationStructure }
     *     
     */
    public void setLocation(LocationStructure value) {
        this.location = value;
    }

    public boolean isSetLocation() {
        return (this.location!= null);
    }

    /**
     * Obtient la valeur de la propriété affectedModes.
     * 
     * @return
     *     possible object is
     *     {@link AffectedModesStructure }
     *     
     */
    public AffectedModesStructure getAffectedModes() {
        return affectedModes;
    }

    /**
     * Définit la valeur de la propriété affectedModes.
     * 
     * @param value
     *     allowed object is
     *     {@link AffectedModesStructure }
     *     
     */
    public void setAffectedModes(AffectedModesStructure value) {
        this.affectedModes = value;
    }

    public boolean isSetAffectedModes() {
        return (this.affectedModes!= null);
    }

    /**
     * Obtient la valeur de la propriété placeRef.
     * 
     * @return
     *     possible object is
     *     {@link ZoneRefStructure }
     *     
     */
    public ZoneRefStructure getPlaceRef() {
        return placeRef;
    }

    /**
     * Définit la valeur de la propriété placeRef.
     * 
     * @param value
     *     allowed object is
     *     {@link ZoneRefStructure }
     *     
     */
    public void setPlaceRef(ZoneRefStructure value) {
        this.placeRef = value;
    }

    public boolean isSetPlaceRef() {
        return (this.placeRef!= null);
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
     * Obtient la valeur de la propriété accessibilityAssessment.
     * 
     * @return
     *     possible object is
     *     {@link AccessibilityAssessmentStructure }
     *     
     */
    public AccessibilityAssessmentStructure getAccessibilityAssessment() {
        return accessibilityAssessment;
    }

    /**
     * Définit la valeur de la propriété accessibilityAssessment.
     * 
     * @param value
     *     allowed object is
     *     {@link AccessibilityAssessmentStructure }
     *     
     */
    public void setAccessibilityAssessment(AccessibilityAssessmentStructure value) {
        this.accessibilityAssessment = value;
    }

    public boolean isSetAccessibilityAssessment() {
        return (this.accessibilityAssessment!= null);
    }

    /**
     * Gets the value of the stopCondition property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the stopCondition property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getStopCondition().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RoutePointTypeEnumeration }
     * 
     * 
     */
    public List<RoutePointTypeEnumeration> getStopCondition() {
        if (stopCondition == null) {
            stopCondition = new ArrayList<RoutePointTypeEnumeration>();
        }
        return this.stopCondition;
    }

    public boolean isSetStopCondition() {
        return ((this.stopCondition!= null)&&(!this.stopCondition.isEmpty()));
    }

    public void unsetStopCondition() {
        this.stopCondition = null;
    }

    /**
     * Obtient la valeur de la propriété connectionLinks.
     * 
     * @return
     *     possible object is
     *     {@link AffectedStopPointStructure.ConnectionLinks }
     *     
     */
    public AffectedStopPointStructure.ConnectionLinks getConnectionLinks() {
        return connectionLinks;
    }

    /**
     * Définit la valeur de la propriété connectionLinks.
     * 
     * @param value
     *     allowed object is
     *     {@link AffectedStopPointStructure.ConnectionLinks }
     *     
     */
    public void setConnectionLinks(AffectedStopPointStructure.ConnectionLinks value) {
        this.connectionLinks = value;
    }

    public boolean isSetConnectionLinks() {
        return (this.connectionLinks!= null);
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
     *         &lt;element name="AffectedConnectionLink" type="{http://www.siri.org.uk/siri}AffectedConnectionLinkStructure" maxOccurs="unbounded"/>
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
        "affectedConnectionLink"
    })
    public static class ConnectionLinks
        implements Serializable
    {

        private final static long serialVersionUID = 1L;
        @XmlElement(name = "AffectedConnectionLink", required = true)
        protected List<AffectedConnectionLinkStructure> affectedConnectionLink;

        /**
         * Gets the value of the affectedConnectionLink property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the affectedConnectionLink property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getAffectedConnectionLink().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link AffectedConnectionLinkStructure }
         * 
         * 
         */
        public List<AffectedConnectionLinkStructure> getAffectedConnectionLink() {
            if (affectedConnectionLink == null) {
                affectedConnectionLink = new ArrayList<AffectedConnectionLinkStructure>();
            }
            return this.affectedConnectionLink;
        }

        public boolean isSetAffectedConnectionLink() {
            return ((this.affectedConnectionLink!= null)&&(!this.affectedConnectionLink.isEmpty()));
        }

        public void unsetAffectedConnectionLink() {
            this.affectedConnectionLink = null;
        }

    }

}
