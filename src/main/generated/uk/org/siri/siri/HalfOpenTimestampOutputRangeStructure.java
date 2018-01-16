
package uk.org.siri.siri;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * Type for a range of date times. Start time must be specified, end time is optional.
 * 
 * <p>Classe Java pour HalfOpenTimestampOutputRangeStructure complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="HalfOpenTimestampOutputRangeStructure">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="StartTime" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="EndTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="EndTimeStatus" type="{http://www.siri.org.uk/siri}EndTimeStatusEnumeration" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HalfOpenTimestampOutputRangeStructure", propOrder = {
    "startTime",
    "endTime",
    "endTimeStatus"
})
public class HalfOpenTimestampOutputRangeStructure
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "StartTime", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar startTime;
    @XmlElement(name = "EndTime")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar endTime;
    @XmlElement(name = "EndTimeStatus", defaultValue = "undefined")
    protected EndTimeStatusEnumeration endTimeStatus;

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
     * Obtient la valeur de la propriété endTimeStatus.
     * 
     * @return
     *     possible object is
     *     {@link EndTimeStatusEnumeration }
     *     
     */
    public EndTimeStatusEnumeration getEndTimeStatus() {
        return endTimeStatus;
    }

    /**
     * Définit la valeur de la propriété endTimeStatus.
     * 
     * @param value
     *     allowed object is
     *     {@link EndTimeStatusEnumeration }
     *     
     */
    public void setEndTimeStatus(EndTimeStatusEnumeration value) {
        this.endTimeStatus = value;
    }

    public boolean isSetEndTimeStatus() {
        return (this.endTimeStatus!= null);
    }

}
