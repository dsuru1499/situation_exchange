
package uk.org.siri.siri;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * Type for Estimated SERVICE JOURNEY INTERCHANGE.
 * 
 * <p>Classe Java pour EstimatedServiceJourneyInterchangeStructure complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="EstimatedServiceJourneyInterchangeStructure">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;choice>
 *           &lt;element ref="{http://www.siri.org.uk/siri}InterchangeRef"/>
 *           &lt;sequence>
 *             &lt;element name="FeederJourneyRef" type="{http://www.siri.org.uk/siri}ConnectingJourneyRefStructure"/>
 *             &lt;element name="DistributorJourneyRef" type="{http://www.siri.org.uk/siri}ConnectingJourneyRefStructure"/>
 *           &lt;/sequence>
 *         &lt;/choice>
 *         &lt;choice>
 *           &lt;element name="WillNotWait" type="{http://www.siri.org.uk/siri}EmptyType"/>
 *           &lt;element name="WillWait" type="{http://www.siri.org.uk/siri}WillWaitStructure"/>
 *         &lt;/choice>
 *         &lt;element name="ExpectedDepartureTimeOfDistributor" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="ConnectionMonitoring" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EstimatedServiceJourneyInterchangeStructure", propOrder = {
    "interchangeRef",
    "feederJourneyRef",
    "distributorJourneyRef",
    "willNotWait",
    "willWait",
    "expectedDepartureTimeOfDistributor",
    "connectionMonitoring"
})
public class EstimatedServiceJourneyInterchangeStructure
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "InterchangeRef")
    protected InterchangeRefStructure interchangeRef;
    @XmlElement(name = "FeederJourneyRef")
    protected ConnectingJourneyRefStructure feederJourneyRef;
    @XmlElement(name = "DistributorJourneyRef")
    protected ConnectingJourneyRefStructure distributorJourneyRef;
    @XmlElement(name = "WillNotWait")
    protected String willNotWait;
    @XmlElement(name = "WillWait")
    protected WillWaitStructure willWait;
    @XmlElement(name = "ExpectedDepartureTimeOfDistributor")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar expectedDepartureTimeOfDistributor;
    @XmlElement(name = "ConnectionMonitoring")
    protected Boolean connectionMonitoring;

    /**
     * Obtient la valeur de la propriété interchangeRef.
     * 
     * @return
     *     possible object is
     *     {@link InterchangeRefStructure }
     *     
     */
    public InterchangeRefStructure getInterchangeRef() {
        return interchangeRef;
    }

    /**
     * Définit la valeur de la propriété interchangeRef.
     * 
     * @param value
     *     allowed object is
     *     {@link InterchangeRefStructure }
     *     
     */
    public void setInterchangeRef(InterchangeRefStructure value) {
        this.interchangeRef = value;
    }

    public boolean isSetInterchangeRef() {
        return (this.interchangeRef!= null);
    }

    /**
     * Obtient la valeur de la propriété feederJourneyRef.
     * 
     * @return
     *     possible object is
     *     {@link ConnectingJourneyRefStructure }
     *     
     */
    public ConnectingJourneyRefStructure getFeederJourneyRef() {
        return feederJourneyRef;
    }

    /**
     * Définit la valeur de la propriété feederJourneyRef.
     * 
     * @param value
     *     allowed object is
     *     {@link ConnectingJourneyRefStructure }
     *     
     */
    public void setFeederJourneyRef(ConnectingJourneyRefStructure value) {
        this.feederJourneyRef = value;
    }

    public boolean isSetFeederJourneyRef() {
        return (this.feederJourneyRef!= null);
    }

    /**
     * Obtient la valeur de la propriété distributorJourneyRef.
     * 
     * @return
     *     possible object is
     *     {@link ConnectingJourneyRefStructure }
     *     
     */
    public ConnectingJourneyRefStructure getDistributorJourneyRef() {
        return distributorJourneyRef;
    }

    /**
     * Définit la valeur de la propriété distributorJourneyRef.
     * 
     * @param value
     *     allowed object is
     *     {@link ConnectingJourneyRefStructure }
     *     
     */
    public void setDistributorJourneyRef(ConnectingJourneyRefStructure value) {
        this.distributorJourneyRef = value;
    }

    public boolean isSetDistributorJourneyRef() {
        return (this.distributorJourneyRef!= null);
    }

    /**
     * Obtient la valeur de la propriété willNotWait.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWillNotWait() {
        return willNotWait;
    }

    /**
     * Définit la valeur de la propriété willNotWait.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWillNotWait(String value) {
        this.willNotWait = value;
    }

    public boolean isSetWillNotWait() {
        return (this.willNotWait!= null);
    }

    /**
     * Obtient la valeur de la propriété willWait.
     * 
     * @return
     *     possible object is
     *     {@link WillWaitStructure }
     *     
     */
    public WillWaitStructure getWillWait() {
        return willWait;
    }

    /**
     * Définit la valeur de la propriété willWait.
     * 
     * @param value
     *     allowed object is
     *     {@link WillWaitStructure }
     *     
     */
    public void setWillWait(WillWaitStructure value) {
        this.willWait = value;
    }

    public boolean isSetWillWait() {
        return (this.willWait!= null);
    }

    /**
     * Obtient la valeur de la propriété expectedDepartureTimeOfDistributor.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getExpectedDepartureTimeOfDistributor() {
        return expectedDepartureTimeOfDistributor;
    }

    /**
     * Définit la valeur de la propriété expectedDepartureTimeOfDistributor.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setExpectedDepartureTimeOfDistributor(XMLGregorianCalendar value) {
        this.expectedDepartureTimeOfDistributor = value;
    }

    public boolean isSetExpectedDepartureTimeOfDistributor() {
        return (this.expectedDepartureTimeOfDistributor!= null);
    }

    /**
     * Obtient la valeur de la propriété connectionMonitoring.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isConnectionMonitoring() {
        return connectionMonitoring;
    }

    /**
     * Définit la valeur de la propriété connectionMonitoring.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setConnectionMonitoring(Boolean value) {
        this.connectionMonitoring = value;
    }

    public boolean isSetConnectionMonitoring() {
        return (this.connectionMonitoring!= null);
    }

}
