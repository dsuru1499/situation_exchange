
package eu.datex2.schema._2_0rc1._2_0;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Classe Java pour TimePeriodByHour complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="TimePeriodByHour">
 *   &lt;complexContent>
 *     &lt;extension base="{http://datex2.eu/schema/2_0RC1/2_0}TimePeriodOfDay">
 *       &lt;sequence>
 *         &lt;element name="startTimeOfPeriod" type="{http://datex2.eu/schema/2_0RC1/2_0}Time"/>
 *         &lt;element name="endTimeOfPeriod" type="{http://datex2.eu/schema/2_0RC1/2_0}Time"/>
 *         &lt;element name="timePeriodByHourExtension" type="{http://datex2.eu/schema/2_0RC1/2_0}ExtensionType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TimePeriodByHour", propOrder = {
    "startTimeOfPeriod",
    "endTimeOfPeriod",
    "timePeriodByHourExtension"
})
public class TimePeriodByHour
    extends TimePeriodOfDay
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(required = true)
    protected XMLGregorianCalendar startTimeOfPeriod;
    @XmlElement(required = true)
    protected XMLGregorianCalendar endTimeOfPeriod;
    protected ExtensionType timePeriodByHourExtension;

    /**
     * Obtient la valeur de la propriété startTimeOfPeriod.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getStartTimeOfPeriod() {
        return startTimeOfPeriod;
    }

    /**
     * Définit la valeur de la propriété startTimeOfPeriod.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setStartTimeOfPeriod(XMLGregorianCalendar value) {
        this.startTimeOfPeriod = value;
    }

    public boolean isSetStartTimeOfPeriod() {
        return (this.startTimeOfPeriod!= null);
    }

    /**
     * Obtient la valeur de la propriété endTimeOfPeriod.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getEndTimeOfPeriod() {
        return endTimeOfPeriod;
    }

    /**
     * Définit la valeur de la propriété endTimeOfPeriod.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setEndTimeOfPeriod(XMLGregorianCalendar value) {
        this.endTimeOfPeriod = value;
    }

    public boolean isSetEndTimeOfPeriod() {
        return (this.endTimeOfPeriod!= null);
    }

    /**
     * Obtient la valeur de la propriété timePeriodByHourExtension.
     * 
     * @return
     *     possible object is
     *     {@link ExtensionType }
     *     
     */
    public ExtensionType getTimePeriodByHourExtension() {
        return timePeriodByHourExtension;
    }

    /**
     * Définit la valeur de la propriété timePeriodByHourExtension.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtensionType }
     *     
     */
    public void setTimePeriodByHourExtension(ExtensionType value) {
        this.timePeriodByHourExtension = value;
    }

    public boolean isSetTimePeriodByHourExtension() {
        return (this.timePeriodByHourExtension!= null);
    }

}
