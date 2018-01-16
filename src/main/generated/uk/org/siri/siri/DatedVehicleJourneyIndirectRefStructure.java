
package uk.org.siri.siri;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * Type for Origin and Destination stop of a VEHICLE JOURNEY.
 * 
 * <p>Classe Java pour DatedVehicleJourneyIndirectRefStructure complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="DatedVehicleJourneyIndirectRefStructure">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="OriginRef" type="{http://www.siri.org.uk/siri}StopPointRefStructure"/>
 *         &lt;element name="AimedDepartureTime" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="DestinationRef" type="{http://www.siri.org.uk/siri}StopPointRefStructure"/>
 *         &lt;element name="AimedArrivalTime" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DatedVehicleJourneyIndirectRefStructure", propOrder = {
    "originRef",
    "aimedDepartureTime",
    "destinationRef",
    "aimedArrivalTime"
})
public class DatedVehicleJourneyIndirectRefStructure
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "OriginRef", required = true)
    protected StopPointRefStructure originRef;
    @XmlElement(name = "AimedDepartureTime", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar aimedDepartureTime;
    @XmlElement(name = "DestinationRef", required = true)
    protected StopPointRefStructure destinationRef;
    @XmlElement(name = "AimedArrivalTime", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar aimedArrivalTime;

    /**
     * Obtient la valeur de la propriété originRef.
     * 
     * @return
     *     possible object is
     *     {@link StopPointRefStructure }
     *     
     */
    public StopPointRefStructure getOriginRef() {
        return originRef;
    }

    /**
     * Définit la valeur de la propriété originRef.
     * 
     * @param value
     *     allowed object is
     *     {@link StopPointRefStructure }
     *     
     */
    public void setOriginRef(StopPointRefStructure value) {
        this.originRef = value;
    }

    public boolean isSetOriginRef() {
        return (this.originRef!= null);
    }

    /**
     * Obtient la valeur de la propriété aimedDepartureTime.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getAimedDepartureTime() {
        return aimedDepartureTime;
    }

    /**
     * Définit la valeur de la propriété aimedDepartureTime.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setAimedDepartureTime(XMLGregorianCalendar value) {
        this.aimedDepartureTime = value;
    }

    public boolean isSetAimedDepartureTime() {
        return (this.aimedDepartureTime!= null);
    }

    /**
     * Obtient la valeur de la propriété destinationRef.
     * 
     * @return
     *     possible object is
     *     {@link StopPointRefStructure }
     *     
     */
    public StopPointRefStructure getDestinationRef() {
        return destinationRef;
    }

    /**
     * Définit la valeur de la propriété destinationRef.
     * 
     * @param value
     *     allowed object is
     *     {@link StopPointRefStructure }
     *     
     */
    public void setDestinationRef(StopPointRefStructure value) {
        this.destinationRef = value;
    }

    public boolean isSetDestinationRef() {
        return (this.destinationRef!= null);
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

}
