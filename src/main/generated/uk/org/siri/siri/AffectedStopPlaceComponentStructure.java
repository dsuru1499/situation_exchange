
package uk.org.siri.siri;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import uk.org.ifopt.ifopt.AccessibilityFeatureEnumeration;
import uk.org.ifopt.ifopt.LinkProjectionStructure;
import uk.org.ifopt.ifopt.PointProjectionStructure;
import uk.org.ifopt.ifopt.StopPlaceComponentRefStructure;
import uk.org.ifopt.ifopt.StopPlaceComponentTypeEnumeration;
import uk.org.ifopt.ifopt.ZoneProjectionStructure;


/**
 * Type for information about the quays affected by an SITUATION.
 * 
 * <p>Classe Java pour AffectedStopPlaceComponentStructure complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="AffectedStopPlaceComponentStructure">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.siri.org.uk/siri}AffectedStopPlaceElementStructure">
 *       &lt;sequence>
 *         &lt;element name="ComponentRef" type="{http://www.ifopt.org.uk/ifopt}StopPlaceComponentRefStructure"/>
 *         &lt;element name="ComponentName" type="{http://www.siri.org.uk/siri}NaturalLanguageStringStructure" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="ComponentType" type="{http://www.ifopt.org.uk/ifopt}StopPlaceComponentTypeEnumeration" minOccurs="0"/>
 *         &lt;group ref="{http://www.ifopt.org.uk/ifopt}PlaceProjectionGroup" minOccurs="0"/>
 *         &lt;element name="Offset" type="{http://www.siri.org.uk/siri}OffsetStructure" minOccurs="0"/>
 *         &lt;element name="AccessFeatureType" type="{http://www.ifopt.org.uk/ifopt}AccessibilityFeatureEnumeration" minOccurs="0"/>
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
@XmlType(name = "AffectedStopPlaceComponentStructure", propOrder = {
    "componentRef",
    "componentName",
    "componentType",
    "pointProjection",
    "linkProjection",
    "zoneProjection",
    "offset",
    "accessFeatureType",
    "affectedFacilities",
    "extensions"
})
public class AffectedStopPlaceComponentStructure
    extends AffectedStopPlaceElementStructure
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "ComponentRef", required = true)
    protected StopPlaceComponentRefStructure componentRef;
    @XmlElement(name = "ComponentName")
    protected List<NaturalLanguageStringStructure> componentName;
    @XmlElement(name = "ComponentType")
    protected StopPlaceComponentTypeEnumeration componentType;
    @XmlElement(name = "PointProjection", namespace = "http://www.ifopt.org.uk/ifopt")
    protected PointProjectionStructure pointProjection;
    @XmlElement(name = "LinkProjection", namespace = "http://www.ifopt.org.uk/ifopt")
    protected LinkProjectionStructure linkProjection;
    @XmlElement(name = "ZoneProjection", namespace = "http://www.ifopt.org.uk/ifopt")
    protected ZoneProjectionStructure zoneProjection;
    @XmlElement(name = "Offset")
    protected OffsetStructure offset;
    @XmlElement(name = "AccessFeatureType")
    protected AccessibilityFeatureEnumeration accessFeatureType;
    @XmlElement(name = "AffectedFacilities")
    protected AffectedStopPlaceComponentStructure.AffectedFacilities affectedFacilities;
    @XmlElement(name = "Extensions")
    protected ExtensionsStructure extensions;

    /**
     * Obtient la valeur de la propriété componentRef.
     * 
     * @return
     *     possible object is
     *     {@link StopPlaceComponentRefStructure }
     *     
     */
    public StopPlaceComponentRefStructure getComponentRef() {
        return componentRef;
    }

    /**
     * Définit la valeur de la propriété componentRef.
     * 
     * @param value
     *     allowed object is
     *     {@link StopPlaceComponentRefStructure }
     *     
     */
    public void setComponentRef(StopPlaceComponentRefStructure value) {
        this.componentRef = value;
    }

    public boolean isSetComponentRef() {
        return (this.componentRef!= null);
    }

    /**
     * Gets the value of the componentName property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the componentName property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getComponentName().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link NaturalLanguageStringStructure }
     * 
     * 
     */
    public List<NaturalLanguageStringStructure> getComponentName() {
        if (componentName == null) {
            componentName = new ArrayList<NaturalLanguageStringStructure>();
        }
        return this.componentName;
    }

    public boolean isSetComponentName() {
        return ((this.componentName!= null)&&(!this.componentName.isEmpty()));
    }

    public void unsetComponentName() {
        this.componentName = null;
    }

    /**
     * Obtient la valeur de la propriété componentType.
     * 
     * @return
     *     possible object is
     *     {@link StopPlaceComponentTypeEnumeration }
     *     
     */
    public StopPlaceComponentTypeEnumeration getComponentType() {
        return componentType;
    }

    /**
     * Définit la valeur de la propriété componentType.
     * 
     * @param value
     *     allowed object is
     *     {@link StopPlaceComponentTypeEnumeration }
     *     
     */
    public void setComponentType(StopPlaceComponentTypeEnumeration value) {
        this.componentType = value;
    }

    public boolean isSetComponentType() {
        return (this.componentType!= null);
    }

    /**
     * Obtient la valeur de la propriété pointProjection.
     * 
     * @return
     *     possible object is
     *     {@link PointProjectionStructure }
     *     
     */
    public PointProjectionStructure getPointProjection() {
        return pointProjection;
    }

    /**
     * Définit la valeur de la propriété pointProjection.
     * 
     * @param value
     *     allowed object is
     *     {@link PointProjectionStructure }
     *     
     */
    public void setPointProjection(PointProjectionStructure value) {
        this.pointProjection = value;
    }

    public boolean isSetPointProjection() {
        return (this.pointProjection!= null);
    }

    /**
     * Obtient la valeur de la propriété linkProjection.
     * 
     * @return
     *     possible object is
     *     {@link LinkProjectionStructure }
     *     
     */
    public LinkProjectionStructure getLinkProjection() {
        return linkProjection;
    }

    /**
     * Définit la valeur de la propriété linkProjection.
     * 
     * @param value
     *     allowed object is
     *     {@link LinkProjectionStructure }
     *     
     */
    public void setLinkProjection(LinkProjectionStructure value) {
        this.linkProjection = value;
    }

    public boolean isSetLinkProjection() {
        return (this.linkProjection!= null);
    }

    /**
     * Obtient la valeur de la propriété zoneProjection.
     * 
     * @return
     *     possible object is
     *     {@link ZoneProjectionStructure }
     *     
     */
    public ZoneProjectionStructure getZoneProjection() {
        return zoneProjection;
    }

    /**
     * Définit la valeur de la propriété zoneProjection.
     * 
     * @param value
     *     allowed object is
     *     {@link ZoneProjectionStructure }
     *     
     */
    public void setZoneProjection(ZoneProjectionStructure value) {
        this.zoneProjection = value;
    }

    public boolean isSetZoneProjection() {
        return (this.zoneProjection!= null);
    }

    /**
     * Obtient la valeur de la propriété offset.
     * 
     * @return
     *     possible object is
     *     {@link OffsetStructure }
     *     
     */
    public OffsetStructure getOffset() {
        return offset;
    }

    /**
     * Définit la valeur de la propriété offset.
     * 
     * @param value
     *     allowed object is
     *     {@link OffsetStructure }
     *     
     */
    public void setOffset(OffsetStructure value) {
        this.offset = value;
    }

    public boolean isSetOffset() {
        return (this.offset!= null);
    }

    /**
     * Obtient la valeur de la propriété accessFeatureType.
     * 
     * @return
     *     possible object is
     *     {@link AccessibilityFeatureEnumeration }
     *     
     */
    public AccessibilityFeatureEnumeration getAccessFeatureType() {
        return accessFeatureType;
    }

    /**
     * Définit la valeur de la propriété accessFeatureType.
     * 
     * @param value
     *     allowed object is
     *     {@link AccessibilityFeatureEnumeration }
     *     
     */
    public void setAccessFeatureType(AccessibilityFeatureEnumeration value) {
        this.accessFeatureType = value;
    }

    public boolean isSetAccessFeatureType() {
        return (this.accessFeatureType!= null);
    }

    /**
     * Obtient la valeur de la propriété affectedFacilities.
     * 
     * @return
     *     possible object is
     *     {@link AffectedStopPlaceComponentStructure.AffectedFacilities }
     *     
     */
    public AffectedStopPlaceComponentStructure.AffectedFacilities getAffectedFacilities() {
        return affectedFacilities;
    }

    /**
     * Définit la valeur de la propriété affectedFacilities.
     * 
     * @param value
     *     allowed object is
     *     {@link AffectedStopPlaceComponentStructure.AffectedFacilities }
     *     
     */
    public void setAffectedFacilities(AffectedStopPlaceComponentStructure.AffectedFacilities value) {
        this.affectedFacilities = value;
    }

    public boolean isSetAffectedFacilities() {
        return (this.affectedFacilities!= null);
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

}
