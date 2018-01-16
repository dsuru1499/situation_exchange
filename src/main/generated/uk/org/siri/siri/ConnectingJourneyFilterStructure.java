
package uk.org.siri.siri;

import java.io.Serializable;
import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * Type for filter for connecting journeys.
 * 
 * <p>Classe Java pour ConnectingJourneyFilterStructure complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="ConnectingJourneyFilterStructure">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="DatedVehicleJourneyRef" type="{http://www.siri.org.uk/siri}DatedVehicleJourneyCodeType"/>
 *         &lt;element ref="{http://www.siri.org.uk/siri}VisitNumber" minOccurs="0"/>
 *         &lt;element name="TimetabledArrivalTime" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ConnectingJourneyFilterStructure", propOrder = {
    "datedVehicleJourneyRef",
    "visitNumber",
    "timetabledArrivalTime"
})
public class ConnectingJourneyFilterStructure
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "DatedVehicleJourneyRef", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String datedVehicleJourneyRef;
    @XmlElement(name = "VisitNumber")
    protected BigInteger visitNumber;
    @XmlElement(name = "TimetabledArrivalTime", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar timetabledArrivalTime;

    /**
     * Obtient la valeur de la propriété datedVehicleJourneyRef.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDatedVehicleJourneyRef() {
        return datedVehicleJourneyRef;
    }

    /**
     * Définit la valeur de la propriété datedVehicleJourneyRef.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDatedVehicleJourneyRef(String value) {
        this.datedVehicleJourneyRef = value;
    }

    public boolean isSetDatedVehicleJourneyRef() {
        return (this.datedVehicleJourneyRef!= null);
    }

    /**
     * Obtient la valeur de la propriété visitNumber.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getVisitNumber() {
        return visitNumber;
    }

    /**
     * Définit la valeur de la propriété visitNumber.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setVisitNumber(BigInteger value) {
        this.visitNumber = value;
    }

    public boolean isSetVisitNumber() {
        return (this.visitNumber!= null);
    }

    /**
     * Obtient la valeur de la propriété timetabledArrivalTime.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getTimetabledArrivalTime() {
        return timetabledArrivalTime;
    }

    /**
     * Définit la valeur de la propriété timetabledArrivalTime.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setTimetabledArrivalTime(XMLGregorianCalendar value) {
        this.timetabledArrivalTime = value;
    }

    public boolean isSetTimetabledArrivalTime() {
        return (this.timetabledArrivalTime!= null);
    }

}
