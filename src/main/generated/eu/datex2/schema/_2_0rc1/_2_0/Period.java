
package eu.datex2.schema._2_0rc1._2_0;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Classe Java pour Period complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="Period">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="startOfPeriod" type="{http://datex2.eu/schema/2_0RC1/2_0}DateTime" minOccurs="0"/>
 *         &lt;element name="endOfPeriod" type="{http://datex2.eu/schema/2_0RC1/2_0}DateTime" minOccurs="0"/>
 *         &lt;element name="periodName" type="{http://datex2.eu/schema/2_0RC1/2_0}MultilingualString" minOccurs="0"/>
 *         &lt;element name="recurringTimePeriodOfDay" type="{http://datex2.eu/schema/2_0RC1/2_0}TimePeriodOfDay" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="recurringDayWeekMonthPeriod" type="{http://datex2.eu/schema/2_0RC1/2_0}DayWeekMonth" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="periodExtension" type="{http://datex2.eu/schema/2_0RC1/2_0}ExtensionType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Period", propOrder = {
    "startOfPeriod",
    "endOfPeriod",
    "periodName",
    "recurringTimePeriodOfDay",
    "recurringDayWeekMonthPeriod",
    "periodExtension"
})
public class Period
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    protected XMLGregorianCalendar startOfPeriod;
    protected XMLGregorianCalendar endOfPeriod;
    protected MultilingualString periodName;
    protected List<TimePeriodOfDay> recurringTimePeriodOfDay;
    protected List<DayWeekMonth> recurringDayWeekMonthPeriod;
    protected ExtensionType periodExtension;

    /**
     * Obtient la valeur de la propriété startOfPeriod.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getStartOfPeriod() {
        return startOfPeriod;
    }

    /**
     * Définit la valeur de la propriété startOfPeriod.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setStartOfPeriod(XMLGregorianCalendar value) {
        this.startOfPeriod = value;
    }

    public boolean isSetStartOfPeriod() {
        return (this.startOfPeriod!= null);
    }

    /**
     * Obtient la valeur de la propriété endOfPeriod.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getEndOfPeriod() {
        return endOfPeriod;
    }

    /**
     * Définit la valeur de la propriété endOfPeriod.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setEndOfPeriod(XMLGregorianCalendar value) {
        this.endOfPeriod = value;
    }

    public boolean isSetEndOfPeriod() {
        return (this.endOfPeriod!= null);
    }

    /**
     * Obtient la valeur de la propriété periodName.
     * 
     * @return
     *     possible object is
     *     {@link MultilingualString }
     *     
     */
    public MultilingualString getPeriodName() {
        return periodName;
    }

    /**
     * Définit la valeur de la propriété periodName.
     * 
     * @param value
     *     allowed object is
     *     {@link MultilingualString }
     *     
     */
    public void setPeriodName(MultilingualString value) {
        this.periodName = value;
    }

    public boolean isSetPeriodName() {
        return (this.periodName!= null);
    }

    /**
     * Gets the value of the recurringTimePeriodOfDay property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the recurringTimePeriodOfDay property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRecurringTimePeriodOfDay().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TimePeriodOfDay }
     * 
     * 
     */
    public List<TimePeriodOfDay> getRecurringTimePeriodOfDay() {
        if (recurringTimePeriodOfDay == null) {
            recurringTimePeriodOfDay = new ArrayList<TimePeriodOfDay>();
        }
        return this.recurringTimePeriodOfDay;
    }

    public boolean isSetRecurringTimePeriodOfDay() {
        return ((this.recurringTimePeriodOfDay!= null)&&(!this.recurringTimePeriodOfDay.isEmpty()));
    }

    public void unsetRecurringTimePeriodOfDay() {
        this.recurringTimePeriodOfDay = null;
    }

    /**
     * Gets the value of the recurringDayWeekMonthPeriod property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the recurringDayWeekMonthPeriod property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRecurringDayWeekMonthPeriod().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DayWeekMonth }
     * 
     * 
     */
    public List<DayWeekMonth> getRecurringDayWeekMonthPeriod() {
        if (recurringDayWeekMonthPeriod == null) {
            recurringDayWeekMonthPeriod = new ArrayList<DayWeekMonth>();
        }
        return this.recurringDayWeekMonthPeriod;
    }

    public boolean isSetRecurringDayWeekMonthPeriod() {
        return ((this.recurringDayWeekMonthPeriod!= null)&&(!this.recurringDayWeekMonthPeriod.isEmpty()));
    }

    public void unsetRecurringDayWeekMonthPeriod() {
        this.recurringDayWeekMonthPeriod = null;
    }

    /**
     * Obtient la valeur de la propriété periodExtension.
     * 
     * @return
     *     possible object is
     *     {@link ExtensionType }
     *     
     */
    public ExtensionType getPeriodExtension() {
        return periodExtension;
    }

    /**
     * Définit la valeur de la propriété periodExtension.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtensionType }
     *     
     */
    public void setPeriodExtension(ExtensionType value) {
        this.periodExtension = value;
    }

    public boolean isSetPeriodExtension() {
        return (this.periodExtension!= null);
    }

}
