
package uk.org.siri.siri;

import java.io.Serializable;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * Type for an SERVICE JOURNEY INTERCHANGE Activity.
 * 
 * <p>Classe Java pour AbstractDistributorItemStructure complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="AbstractDistributorItemStructure">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.siri.org.uk/siri}AbstractItemStructure">
 *       &lt;sequence>
 *         &lt;group ref="{http://www.siri.org.uk/siri}InterchangeDistributorIdentityGroup"/>
 *         &lt;element name="DistributorJourney" type="{http://www.siri.org.uk/siri}InterchangeJourneyStructure"/>
 *         &lt;element name="FeederVehicleJourneyRef" type="{http://www.siri.org.uk/siri}FramedVehicleJourneyRefStructure" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AbstractDistributorItemStructure", propOrder = {
    "interchangeRef",
    "connectionLinkRef",
    "stopPointRef",
    "distributorVisitNumber",
    "distributorOrder",
    "distributorJourney",
    "feederVehicleJourneyRef"
})
@XmlSeeAlso({
    WaitProlongedDepartureStructure.class,
    StoppingPositionChangedDepartureStructure.class,
    DistributorDepartureCancellationStructure.class
})
public class AbstractDistributorItemStructure
    extends AbstractItemStructure
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "InterchangeRef")
    protected InterchangeRefStructure interchangeRef;
    @XmlElement(name = "ConnectionLinkRef", required = true)
    protected ConnectionLinkRefStructure connectionLinkRef;
    @XmlElement(name = "StopPointRef")
    protected StopPointRefStructure stopPointRef;
    @XmlElement(name = "DistributorVisitNumber")
    protected BigInteger distributorVisitNumber;
    @XmlElement(name = "DistributorOrder")
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger distributorOrder;
    @XmlElement(name = "DistributorJourney", required = true)
    protected InterchangeJourneyStructure distributorJourney;
    @XmlElement(name = "FeederVehicleJourneyRef")
    protected List<FramedVehicleJourneyRefStructure> feederVehicleJourneyRef;

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
     * Obtient la valeur de la propriété connectionLinkRef.
     * 
     * @return
     *     possible object is
     *     {@link ConnectionLinkRefStructure }
     *     
     */
    public ConnectionLinkRefStructure getConnectionLinkRef() {
        return connectionLinkRef;
    }

    /**
     * Définit la valeur de la propriété connectionLinkRef.
     * 
     * @param value
     *     allowed object is
     *     {@link ConnectionLinkRefStructure }
     *     
     */
    public void setConnectionLinkRef(ConnectionLinkRefStructure value) {
        this.connectionLinkRef = value;
    }

    public boolean isSetConnectionLinkRef() {
        return (this.connectionLinkRef!= null);
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
     * Obtient la valeur de la propriété distributorVisitNumber.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getDistributorVisitNumber() {
        return distributorVisitNumber;
    }

    /**
     * Définit la valeur de la propriété distributorVisitNumber.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setDistributorVisitNumber(BigInteger value) {
        this.distributorVisitNumber = value;
    }

    public boolean isSetDistributorVisitNumber() {
        return (this.distributorVisitNumber!= null);
    }

    /**
     * Obtient la valeur de la propriété distributorOrder.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getDistributorOrder() {
        return distributorOrder;
    }

    /**
     * Définit la valeur de la propriété distributorOrder.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setDistributorOrder(BigInteger value) {
        this.distributorOrder = value;
    }

    public boolean isSetDistributorOrder() {
        return (this.distributorOrder!= null);
    }

    /**
     * Obtient la valeur de la propriété distributorJourney.
     * 
     * @return
     *     possible object is
     *     {@link InterchangeJourneyStructure }
     *     
     */
    public InterchangeJourneyStructure getDistributorJourney() {
        return distributorJourney;
    }

    /**
     * Définit la valeur de la propriété distributorJourney.
     * 
     * @param value
     *     allowed object is
     *     {@link InterchangeJourneyStructure }
     *     
     */
    public void setDistributorJourney(InterchangeJourneyStructure value) {
        this.distributorJourney = value;
    }

    public boolean isSetDistributorJourney() {
        return (this.distributorJourney!= null);
    }

    /**
     * Gets the value of the feederVehicleJourneyRef property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the feederVehicleJourneyRef property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFeederVehicleJourneyRef().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FramedVehicleJourneyRefStructure }
     * 
     * 
     */
    public List<FramedVehicleJourneyRefStructure> getFeederVehicleJourneyRef() {
        if (feederVehicleJourneyRef == null) {
            feederVehicleJourneyRef = new ArrayList<FramedVehicleJourneyRefStructure>();
        }
        return this.feederVehicleJourneyRef;
    }

    public boolean isSetFeederVehicleJourneyRef() {
        return ((this.feederVehicleJourneyRef!= null)&&(!this.feederVehicleJourneyRef.isEmpty()));
    }

    public void unsetFeederVehicleJourneyRef() {
        this.feederVehicleJourneyRef = null;
    }

}
