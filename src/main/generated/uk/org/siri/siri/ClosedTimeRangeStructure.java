
package uk.org.siri.siri;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * Type for a range of times. Both start and end time are required.
 * 
 * <p>Classe Java pour ClosedTimeRangeStructure complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="ClosedTimeRangeStructure">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="StartTime" type="{http://www.w3.org/2001/XMLSchema}time"/>
 *         &lt;element name="EndTime" type="{http://www.w3.org/2001/XMLSchema}time"/>
 *         &lt;element name="EndTimePrecision" type="{http://www.siri.org.uk/siri}EndTimePrecisionEnumeration" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ClosedTimeRangeStructure", propOrder = {
    "startTime",
    "endTime",
    "endTimePrecision"
})
public class ClosedTimeRangeStructure
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "StartTime", required = true)
    @XmlSchemaType(name = "time")
    protected XMLGregorianCalendar startTime;
    @XmlElement(name = "EndTime", required = true)
    @XmlSchemaType(name = "time")
    protected XMLGregorianCalendar endTime;
    @XmlElement(name = "EndTimePrecision", defaultValue = "second")
    protected EndTimePrecisionEnumeration endTimePrecision;

    /**
     * Obtient la valeur de la propriété startTime.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getStartTime() {
        return startTime;
    }

    /**
     * Définit la valeur de la propriété startTime.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setStartTime(XMLGregorianCalendar value) {
        this.startTime = value;
    }

    public boolean isSetStartTime() {
        return (this.startTime!= null);
    }

    /**
     * Obtient la valeur de la propriété endTime.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getEndTime() {
        return endTime;
    }

    /**
     * Définit la valeur de la propriété endTime.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setEndTime(XMLGregorianCalendar value) {
        this.endTime = value;
    }

    public boolean isSetEndTime() {
        return (this.endTime!= null);
    }

    /**
     * Obtient la valeur de la propriété endTimePrecision.
     * 
     * @return
     *     possible object is
     *     {@link EndTimePrecisionEnumeration }
     *     
     */
    public EndTimePrecisionEnumeration getEndTimePrecision() {
        return endTimePrecision;
    }

    /**
     * Définit la valeur de la propriété endTimePrecision.
     * 
     * @param value
     *     allowed object is
     *     {@link EndTimePrecisionEnumeration }
     *     
     */
    public void setEndTimePrecision(EndTimePrecisionEnumeration value) {
        this.endTimePrecision = value;
    }

    public boolean isSetEndTimePrecision() {
        return (this.endTimePrecision!= null);
    }

}
