
package uk.org.siri.siri;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * Type for Will Wait details
 * 
 * <p>Classe Java pour WillWaitStructure complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="WillWaitStructure">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="WaitUntilTime" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="DriverHasAcknowledgeWIllWait" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "WillWaitStructure", propOrder = {
    "waitUntilTime",
    "driverHasAcknowledgeWIllWait"
})
public class WillWaitStructure
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "WaitUntilTime", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar waitUntilTime;
    @XmlElement(name = "DriverHasAcknowledgeWIllWait")
    protected Boolean driverHasAcknowledgeWIllWait;

    /**
     * Obtient la valeur de la propriété waitUntilTime.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getWaitUntilTime() {
        return waitUntilTime;
    }

    /**
     * Définit la valeur de la propriété waitUntilTime.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setWaitUntilTime(XMLGregorianCalendar value) {
        this.waitUntilTime = value;
    }

    public boolean isSetWaitUntilTime() {
        return (this.waitUntilTime!= null);
    }

    /**
     * Obtient la valeur de la propriété driverHasAcknowledgeWIllWait.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isDriverHasAcknowledgeWIllWait() {
        return driverHasAcknowledgeWIllWait;
    }

    /**
     * Définit la valeur de la propriété driverHasAcknowledgeWIllWait.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDriverHasAcknowledgeWIllWait(Boolean value) {
        this.driverHasAcknowledgeWIllWait = value;
    }

    public boolean isSetDriverHasAcknowledgeWIllWait() {
        return (this.driverHasAcknowledgeWIllWait!= null);
    }

}
