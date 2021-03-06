
package eu.datex2.schema._2_0rc1._2_0;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour DayWeekMonth complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="DayWeekMonth">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="applicableDay" type="{http://datex2.eu/schema/2_0RC1/2_0}DayEnum" maxOccurs="7" minOccurs="0"/>
 *         &lt;element name="applicableWeek" type="{http://datex2.eu/schema/2_0RC1/2_0}WeekOfMonthEnum" maxOccurs="5" minOccurs="0"/>
 *         &lt;element name="applicableMonth" type="{http://datex2.eu/schema/2_0RC1/2_0}MonthOfYearEnum" maxOccurs="12" minOccurs="0"/>
 *         &lt;element name="dayWeekMonthExtension" type="{http://datex2.eu/schema/2_0RC1/2_0}ExtensionType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DayWeekMonth", propOrder = {
    "applicableDay",
    "applicableWeek",
    "applicableMonth",
    "dayWeekMonthExtension"
})
public class DayWeekMonth
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    protected List<DayEnum> applicableDay;
    protected List<WeekOfMonthEnum> applicableWeek;
    protected List<MonthOfYearEnum> applicableMonth;
    protected ExtensionType dayWeekMonthExtension;

    /**
     * Gets the value of the applicableDay property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the applicableDay property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getApplicableDay().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DayEnum }
     * 
     * 
     */
    public List<DayEnum> getApplicableDay() {
        if (applicableDay == null) {
            applicableDay = new ArrayList<DayEnum>();
        }
        return this.applicableDay;
    }

    public boolean isSetApplicableDay() {
        return ((this.applicableDay!= null)&&(!this.applicableDay.isEmpty()));
    }

    public void unsetApplicableDay() {
        this.applicableDay = null;
    }

    /**
     * Gets the value of the applicableWeek property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the applicableWeek property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getApplicableWeek().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link WeekOfMonthEnum }
     * 
     * 
     */
    public List<WeekOfMonthEnum> getApplicableWeek() {
        if (applicableWeek == null) {
            applicableWeek = new ArrayList<WeekOfMonthEnum>();
        }
        return this.applicableWeek;
    }

    public boolean isSetApplicableWeek() {
        return ((this.applicableWeek!= null)&&(!this.applicableWeek.isEmpty()));
    }

    public void unsetApplicableWeek() {
        this.applicableWeek = null;
    }

    /**
     * Gets the value of the applicableMonth property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the applicableMonth property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getApplicableMonth().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MonthOfYearEnum }
     * 
     * 
     */
    public List<MonthOfYearEnum> getApplicableMonth() {
        if (applicableMonth == null) {
            applicableMonth = new ArrayList<MonthOfYearEnum>();
        }
        return this.applicableMonth;
    }

    public boolean isSetApplicableMonth() {
        return ((this.applicableMonth!= null)&&(!this.applicableMonth.isEmpty()));
    }

    public void unsetApplicableMonth() {
        this.applicableMonth = null;
    }

    /**
     * Obtient la valeur de la propriété dayWeekMonthExtension.
     * 
     * @return
     *     possible object is
     *     {@link ExtensionType }
     *     
     */
    public ExtensionType getDayWeekMonthExtension() {
        return dayWeekMonthExtension;
    }

    /**
     * Définit la valeur de la propriété dayWeekMonthExtension.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtensionType }
     *     
     */
    public void setDayWeekMonthExtension(ExtensionType value) {
        this.dayWeekMonthExtension = value;
    }

    public boolean isSetDayWeekMonthExtension() {
        return (this.dayWeekMonthExtension!= null);
    }

}
