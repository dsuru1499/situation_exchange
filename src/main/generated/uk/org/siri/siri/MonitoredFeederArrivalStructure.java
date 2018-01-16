
package uk.org.siri.siri;

import java.io.Serializable;
import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * Type for Real time connection at a stop.
 * 
 * <p>Classe Java pour MonitoredFeederArrivalStructure complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="MonitoredFeederArrivalStructure">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.siri.org.uk/siri}AbstractFeederItemStructure">
 *       &lt;sequence>
 *         &lt;element name="ClearDownRef" type="{http://www.siri.org.uk/siri}ClearDownRefStructure" minOccurs="0"/>
 *         &lt;element name="FeederJourney" type="{http://www.siri.org.uk/siri}InterchangeJourneyStructure"/>
 *         &lt;element ref="{http://www.siri.org.uk/siri}VehicleAtStop" minOccurs="0"/>
 *         &lt;element name="NumberOfTransferPassengers" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" minOccurs="0"/>
 *         &lt;element ref="{http://www.siri.org.uk/siri}AimedArrivalTime" minOccurs="0"/>
 *         &lt;element name="ExpectedArrivalTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element ref="{http://www.siri.org.uk/siri}ArrivalPlatformName" minOccurs="0"/>
 *         &lt;element name="SuggestedWaitDecisionTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
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
@XmlType(name = "MonitoredFeederArrivalStructure", propOrder = {
    "clearDownRef",
    "feederJourney",
    "vehicleAtStop",
    "numberOfTransferPassengers",
    "aimedArrivalTime",
    "expectedArrivalTime",
    "arrivalPlatformName",
    "suggestedWaitDecisionTime",
    "extensions"
})
public class MonitoredFeederArrivalStructure
    extends AbstractFeederItemStructure
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "ClearDownRef")
    protected ClearDownRefStructure clearDownRef;
    @XmlElement(name = "FeederJourney", required = true)
    protected InterchangeJourneyStructure feederJourney;
    @XmlElement(name = "VehicleAtStop", defaultValue = "false")
    protected Boolean vehicleAtStop;
    @XmlElement(name = "NumberOfTransferPassengers")
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger numberOfTransferPassengers;
    @XmlElement(name = "AimedArrivalTime")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar aimedArrivalTime;
    @XmlElement(name = "ExpectedArrivalTime")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar expectedArrivalTime;
    @XmlElement(name = "ArrivalPlatformName")
    protected NaturalLanguageStringStructure arrivalPlatformName;
    @XmlElement(name = "SuggestedWaitDecisionTime")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar suggestedWaitDecisionTime;
    @XmlElement(name = "Extensions")
    protected ExtensionsStructure extensions;

    /**
     * Obtient la valeur de la propriété clearDownRef.
     * 
     * @return
     *     possible object is
     *     {@link ClearDownRefStructure }
     *     
     */
    public ClearDownRefStructure getClearDownRef() {
        return clearDownRef;
    }

    /**
     * Définit la valeur de la propriété clearDownRef.
     * 
     * @param value
     *     allowed object is
     *     {@link ClearDownRefStructure }
     *     
     */
    public void setClearDownRef(ClearDownRefStructure value) {
        this.clearDownRef = value;
    }

    public boolean isSetClearDownRef() {
        return (this.clearDownRef!= null);
    }

    /**
     * Obtient la valeur de la propriété feederJourney.
     * 
     * @return
     *     possible object is
     *     {@link InterchangeJourneyStructure }
     *     
     */
    public InterchangeJourneyStructure getFeederJourney() {
        return feederJourney;
    }

    /**
     * Définit la valeur de la propriété feederJourney.
     * 
     * @param value
     *     allowed object is
     *     {@link InterchangeJourneyStructure }
     *     
     */
    public void setFeederJourney(InterchangeJourneyStructure value) {
        this.feederJourney = value;
    }

    public boolean isSetFeederJourney() {
        return (this.feederJourney!= null);
    }

    /**
     * Obtient la valeur de la propriété vehicleAtStop.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isVehicleAtStop() {
        return vehicleAtStop;
    }

    /**
     * Définit la valeur de la propriété vehicleAtStop.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setVehicleAtStop(Boolean value) {
        this.vehicleAtStop = value;
    }

    public boolean isSetVehicleAtStop() {
        return (this.vehicleAtStop!= null);
    }

    /**
     * Obtient la valeur de la propriété numberOfTransferPassengers.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getNumberOfTransferPassengers() {
        return numberOfTransferPassengers;
    }

    /**
     * Définit la valeur de la propriété numberOfTransferPassengers.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setNumberOfTransferPassengers(BigInteger value) {
        this.numberOfTransferPassengers = value;
    }

    public boolean isSetNumberOfTransferPassengers() {
        return (this.numberOfTransferPassengers!= null);
    }

    /**
     * Obtient la valeur de la propriété aimedArrivalTime.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getAimedArrivalTime() {
        return aimedArrivalTime;
    }

    /**
     * Définit la valeur de la propriété aimedArrivalTime.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setAimedArrivalTime(XMLGregorianCalendar value) {
        this.aimedArrivalTime = value;
    }

    public boolean isSetAimedArrivalTime() {
        return (this.aimedArrivalTime!= null);
    }

    /**
     * Obtient la valeur de la propriété expectedArrivalTime.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getExpectedArrivalTime() {
        return expectedArrivalTime;
    }

    /**
     * Définit la valeur de la propriété expectedArrivalTime.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setExpectedArrivalTime(XMLGregorianCalendar value) {
        this.expectedArrivalTime = value;
    }

    public boolean isSetExpectedArrivalTime() {
        return (this.expectedArrivalTime!= null);
    }

    /**
     * Obtient la valeur de la propriété arrivalPlatformName.
     * 
     * @return
     *     possible object is
     *     {@link NaturalLanguageStringStructure }
     *     
     */
    public NaturalLanguageStringStructure getArrivalPlatformName() {
        return arrivalPlatformName;
    }

    /**
     * Définit la valeur de la propriété arrivalPlatformName.
     * 
     * @param value
     *     allowed object is
     *     {@link NaturalLanguageStringStructure }
     *     
     */
    public void setArrivalPlatformName(NaturalLanguageStringStructure value) {
        this.arrivalPlatformName = value;
    }

    public boolean isSetArrivalPlatformName() {
        return (this.arrivalPlatformName!= null);
    }

    /**
     * Obtient la valeur de la propriété suggestedWaitDecisionTime.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getSuggestedWaitDecisionTime() {
        return suggestedWaitDecisionTime;
    }

    /**
     * Définit la valeur de la propriété suggestedWaitDecisionTime.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setSuggestedWaitDecisionTime(XMLGregorianCalendar value) {
        this.suggestedWaitDecisionTime = value;
    }

    public boolean isSetSuggestedWaitDecisionTime() {
        return (this.suggestedWaitDecisionTime!= null);
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

}
