
package uk.org.siri.siri;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElements;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * View of a SCHEDULED STOP POINT description.
 * 
 * <p>Classe Java pour AnnotatedStopPointStructure complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="AnnotatedStopPointStructure">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="StopPointRef" type="{http://www.siri.org.uk/siri}StopPointRefStructure"/>
 *         &lt;element ref="{http://www.siri.org.uk/siri}TimingPoint" minOccurs="0"/>
 *         &lt;element name="Monitored" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="StopName" type="{http://www.siri.org.uk/siri}NaturalLanguageStringStructure" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="StopAreaRef" type="{http://www.siri.org.uk/siri}StopAreaRefStructure" minOccurs="0"/>
 *         &lt;element name="Features" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;choice maxOccurs="unbounded">
 *                   &lt;element name="ServiceFeature" type="{http://www.siri.org.uk/siri}ServiceFeatureStructure"/>
 *                   &lt;element ref="{http://www.siri.org.uk/siri}ServiceFeatureRef"/>
 *                 &lt;/choice>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="Lines" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;choice maxOccurs="unbounded">
 *                   &lt;element name="LineRef" type="{http://www.siri.org.uk/siri}LineRefStructure"/>
 *                   &lt;element name="LineDirection" type="{http://www.siri.org.uk/siri}LineDirectionStructure"/>
 *                 &lt;/choice>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="Location" type="{http://www.siri.org.uk/siri}LocationStructure" minOccurs="0"/>
 *         &lt;element name="Url" type="{http://www.w3.org/2001/XMLSchema}anyURI" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AnnotatedStopPointStructure", propOrder = {
    "stopPointRef",
    "timingPoint",
    "monitored",
    "stopName",
    "stopAreaRef",
    "features",
    "lines",
    "location",
    "url"
})
@XmlSeeAlso({
    StopPointInPatternStructure.class
})
public class AnnotatedStopPointStructure
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "StopPointRef", required = true)
    protected StopPointRefStructure stopPointRef;
    @XmlElement(name = "TimingPoint", defaultValue = "true")
    protected Boolean timingPoint;
    @XmlElement(name = "Monitored", defaultValue = "true")
    protected Boolean monitored;
    @XmlElement(name = "StopName")
    protected List<NaturalLanguageStringStructure> stopName;
    @XmlElement(name = "StopAreaRef")
    protected StopAreaRefStructure stopAreaRef;
    @XmlElement(name = "Features")
    protected AnnotatedStopPointStructure.Features features;
    @XmlElement(name = "Lines")
    protected AnnotatedStopPointStructure.Lines lines;
    @XmlElement(name = "Location")
    protected LocationStructure location;
    @XmlElement(name = "Url")
    @XmlSchemaType(name = "anyURI")
    protected String url;

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
     * Obtient la valeur de la propriété timingPoint.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isTimingPoint() {
        return timingPoint;
    }

    /**
     * Définit la valeur de la propriété timingPoint.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setTimingPoint(Boolean value) {
        this.timingPoint = value;
    }

    public boolean isSetTimingPoint() {
        return (this.timingPoint!= null);
    }

    /**
     * Obtient la valeur de la propriété monitored.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMonitored() {
        return monitored;
    }

    /**
     * Définit la valeur de la propriété monitored.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMonitored(Boolean value) {
        this.monitored = value;
    }

    public boolean isSetMonitored() {
        return (this.monitored!= null);
    }

    /**
     * Gets the value of the stopName property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the stopName property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getStopName().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link NaturalLanguageStringStructure }
     * 
     * 
     */
    public List<NaturalLanguageStringStructure> getStopName() {
        if (stopName == null) {
            stopName = new ArrayList<NaturalLanguageStringStructure>();
        }
        return this.stopName;
    }

    public boolean isSetStopName() {
        return ((this.stopName!= null)&&(!this.stopName.isEmpty()));
    }

    public void unsetStopName() {
        this.stopName = null;
    }

    /**
     * Obtient la valeur de la propriété stopAreaRef.
     * 
     * @return
     *     possible object is
     *     {@link StopAreaRefStructure }
     *     
     */
    public StopAreaRefStructure getStopAreaRef() {
        return stopAreaRef;
    }

    /**
     * Définit la valeur de la propriété stopAreaRef.
     * 
     * @param value
     *     allowed object is
     *     {@link StopAreaRefStructure }
     *     
     */
    public void setStopAreaRef(StopAreaRefStructure value) {
        this.stopAreaRef = value;
    }

    public boolean isSetStopAreaRef() {
        return (this.stopAreaRef!= null);
    }

    /**
     * Obtient la valeur de la propriété features.
     * 
     * @return
     *     possible object is
     *     {@link AnnotatedStopPointStructure.Features }
     *     
     */
    public AnnotatedStopPointStructure.Features getFeatures() {
        return features;
    }

    /**
     * Définit la valeur de la propriété features.
     * 
     * @param value
     *     allowed object is
     *     {@link AnnotatedStopPointStructure.Features }
     *     
     */
    public void setFeatures(AnnotatedStopPointStructure.Features value) {
        this.features = value;
    }

    public boolean isSetFeatures() {
        return (this.features!= null);
    }

    /**
     * Obtient la valeur de la propriété lines.
     * 
     * @return
     *     possible object is
     *     {@link AnnotatedStopPointStructure.Lines }
     *     
     */
    public AnnotatedStopPointStructure.Lines getLines() {
        return lines;
    }

    /**
     * Définit la valeur de la propriété lines.
     * 
     * @param value
     *     allowed object is
     *     {@link AnnotatedStopPointStructure.Lines }
     *     
     */
    public void setLines(AnnotatedStopPointStructure.Lines value) {
        this.lines = value;
    }

    public boolean isSetLines() {
        return (this.lines!= null);
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
     * Obtient la valeur de la propriété url.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUrl() {
        return url;
    }

    /**
     * Définit la valeur de la propriété url.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUrl(String value) {
        this.url = value;
    }

    public boolean isSetUrl() {
        return (this.url!= null);
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
     *       &lt;choice maxOccurs="unbounded">
     *         &lt;element name="ServiceFeature" type="{http://www.siri.org.uk/siri}ServiceFeatureStructure"/>
     *         &lt;element ref="{http://www.siri.org.uk/siri}ServiceFeatureRef"/>
     *       &lt;/choice>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "serviceFeatureOrServiceFeatureRef"
    })
    public static class Features
        implements Serializable
    {

        private final static long serialVersionUID = 1L;
        @XmlElements({
            @XmlElement(name = "ServiceFeature", type = ServiceFeatureStructure.class),
            @XmlElement(name = "ServiceFeatureRef", type = ServiceFeatureRefStructure.class)
        })
        protected List<Serializable> serviceFeatureOrServiceFeatureRef;

        /**
         * Gets the value of the serviceFeatureOrServiceFeatureRef property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the serviceFeatureOrServiceFeatureRef property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getServiceFeatureOrServiceFeatureRef().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link ServiceFeatureStructure }
         * {@link ServiceFeatureRefStructure }
         * 
         * 
         */
        public List<Serializable> getServiceFeatureOrServiceFeatureRef() {
            if (serviceFeatureOrServiceFeatureRef == null) {
                serviceFeatureOrServiceFeatureRef = new ArrayList<Serializable>();
            }
            return this.serviceFeatureOrServiceFeatureRef;
        }

        public boolean isSetServiceFeatureOrServiceFeatureRef() {
            return ((this.serviceFeatureOrServiceFeatureRef!= null)&&(!this.serviceFeatureOrServiceFeatureRef.isEmpty()));
        }

        public void unsetServiceFeatureOrServiceFeatureRef() {
            this.serviceFeatureOrServiceFeatureRef = null;
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
     *       &lt;choice maxOccurs="unbounded">
     *         &lt;element name="LineRef" type="{http://www.siri.org.uk/siri}LineRefStructure"/>
     *         &lt;element name="LineDirection" type="{http://www.siri.org.uk/siri}LineDirectionStructure"/>
     *       &lt;/choice>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "lineRefOrLineDirection"
    })
    public static class Lines
        implements Serializable
    {

        private final static long serialVersionUID = 1L;
        @XmlElements({
            @XmlElement(name = "LineRef", type = LineRefStructure.class),
            @XmlElement(name = "LineDirection", type = LineDirectionStructure.class)
        })
        protected List<Serializable> lineRefOrLineDirection;

        /**
         * Gets the value of the lineRefOrLineDirection property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the lineRefOrLineDirection property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getLineRefOrLineDirection().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link LineRefStructure }
         * {@link LineDirectionStructure }
         * 
         * 
         */
        public List<Serializable> getLineRefOrLineDirection() {
            if (lineRefOrLineDirection == null) {
                lineRefOrLineDirection = new ArrayList<Serializable>();
            }
            return this.lineRefOrLineDirection;
        }

        public boolean isSetLineRefOrLineDirection() {
            return ((this.lineRefOrLineDirection!= null)&&(!this.lineRefOrLineDirection.isEmpty()));
        }

        public void unsetLineRefOrLineDirection() {
            this.lineRefOrLineDirection = null;
        }

    }

}
