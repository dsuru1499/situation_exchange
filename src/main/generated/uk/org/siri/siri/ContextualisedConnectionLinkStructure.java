
package uk.org.siri.siri;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import javax.xml.datatype.Duration;


/**
 * Connection between two stops within a connection area. Used within the context of one or other end.
 * 
 * <p>Classe Java pour ContextualisedConnectionLinkStructure complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="ContextualisedConnectionLinkStructure">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ConnectionLinkCode" type="{http://www.siri.org.uk/siri}ConnectionLinkCodeType" minOccurs="0"/>
 *         &lt;element ref="{http://www.siri.org.uk/siri}StopPointRef" minOccurs="0"/>
 *         &lt;element ref="{http://www.siri.org.uk/siri}StopPointName" minOccurs="0"/>
 *         &lt;group ref="{http://www.siri.org.uk/siri}ConnectionDurationGroup"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ContextualisedConnectionLinkStructure", propOrder = {
    "connectionLinkCode",
    "stopPointRef",
    "stopPointName",
    "defaultDuration",
    "frequentTravellerDuration",
    "occasionalTravellerDuration",
    "impairedAccessDuration"
})
public class ContextualisedConnectionLinkStructure
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "ConnectionLinkCode")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String connectionLinkCode;
    @XmlElement(name = "StopPointRef")
    protected StopPointRefStructure stopPointRef;
    @XmlElement(name = "StopPointName")
    protected NaturalLanguageStringStructure stopPointName;
    @XmlElement(name = "DefaultDuration")
    protected Duration defaultDuration;
    @XmlElement(name = "FrequentTravellerDuration")
    protected Duration frequentTravellerDuration;
    @XmlElement(name = "OccasionalTravellerDuration")
    protected Duration occasionalTravellerDuration;
    @XmlElement(name = "ImpairedAccessDuration")
    protected Duration impairedAccessDuration;

    /**
     * Obtient la valeur de la propriété connectionLinkCode.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getConnectionLinkCode() {
        return connectionLinkCode;
    }

    /**
     * Définit la valeur de la propriété connectionLinkCode.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setConnectionLinkCode(String value) {
        this.connectionLinkCode = value;
    }

    public boolean isSetConnectionLinkCode() {
        return (this.connectionLinkCode!= null);
    }

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
     * Obtient la valeur de la propriété stopPointName.
     * 
     * @return
     *     possible object is
     *     {@link NaturalLanguageStringStructure }
     *     
     */
    public NaturalLanguageStringStructure getStopPointName() {
        return stopPointName;
    }

    /**
     * Définit la valeur de la propriété stopPointName.
     * 
     * @param value
     *     allowed object is
     *     {@link NaturalLanguageStringStructure }
     *     
     */
    public void setStopPointName(NaturalLanguageStringStructure value) {
        this.stopPointName = value;
    }

    public boolean isSetStopPointName() {
        return (this.stopPointName!= null);
    }

    /**
     * Obtient la valeur de la propriété defaultDuration.
     * 
     * @return
     *     possible object is
     *     {@link Duration }
     *     
     */
    public Duration getDefaultDuration() {
        return defaultDuration;
    }

    /**
     * Définit la valeur de la propriété defaultDuration.
     * 
     * @param value
     *     allowed object is
     *     {@link Duration }
     *     
     */
    public void setDefaultDuration(Duration value) {
        this.defaultDuration = value;
    }

    public boolean isSetDefaultDuration() {
        return (this.defaultDuration!= null);
    }

    /**
     * Obtient la valeur de la propriété frequentTravellerDuration.
     * 
     * @return
     *     possible object is
     *     {@link Duration }
     *     
     */
    public Duration getFrequentTravellerDuration() {
        return frequentTravellerDuration;
    }

    /**
     * Définit la valeur de la propriété frequentTravellerDuration.
     * 
     * @param value
     *     allowed object is
     *     {@link Duration }
     *     
     */
    public void setFrequentTravellerDuration(Duration value) {
        this.frequentTravellerDuration = value;
    }

    public boolean isSetFrequentTravellerDuration() {
        return (this.frequentTravellerDuration!= null);
    }

    /**
     * Obtient la valeur de la propriété occasionalTravellerDuration.
     * 
     * @return
     *     possible object is
     *     {@link Duration }
     *     
     */
    public Duration getOccasionalTravellerDuration() {
        return occasionalTravellerDuration;
    }

    /**
     * Définit la valeur de la propriété occasionalTravellerDuration.
     * 
     * @param value
     *     allowed object is
     *     {@link Duration }
     *     
     */
    public void setOccasionalTravellerDuration(Duration value) {
        this.occasionalTravellerDuration = value;
    }

    public boolean isSetOccasionalTravellerDuration() {
        return (this.occasionalTravellerDuration!= null);
    }

    /**
     * Obtient la valeur de la propriété impairedAccessDuration.
     * 
     * @return
     *     possible object is
     *     {@link Duration }
     *     
     */
    public Duration getImpairedAccessDuration() {
        return impairedAccessDuration;
    }

    /**
     * Définit la valeur de la propriété impairedAccessDuration.
     * 
     * @param value
     *     allowed object is
     *     {@link Duration }
     *     
     */
    public void setImpairedAccessDuration(Duration value) {
        this.impairedAccessDuration = value;
    }

    public boolean isSetImpairedAccessDuration() {
        return (this.impairedAccessDuration!= null);
    }

}
