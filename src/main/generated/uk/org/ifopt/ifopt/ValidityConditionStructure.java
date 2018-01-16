
package uk.org.ifopt.ifopt;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * Type for a validity condition.
 * 
 * <p>Classe Java pour ValidityConditionStructure complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="ValidityConditionStructure">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="FromDateTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="ToDateTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="DayType" type="{http://www.w3.org/2001/XMLSchema}NMTOKEN" minOccurs="0"/>
 *         &lt;element name="Timebands" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="Timeband" type="{http://www.ifopt.org.uk/ifopt}TimebandStructure"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ValidityConditionStructure", propOrder = {
    "fromDateTime",
    "toDateTime",
    "dayType",
    "timebands"
})
public class ValidityConditionStructure
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "FromDateTime")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar fromDateTime;
    @XmlElement(name = "ToDateTime")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar toDateTime;
    @XmlElement(name = "DayType")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NMTOKEN")
    protected String dayType;
    @XmlElement(name = "Timebands")
    protected List<ValidityConditionStructure.Timebands> timebands;

    /**
     * Obtient la valeur de la propriété fromDateTime.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getFromDateTime() {
        return fromDateTime;
    }

    /**
     * Définit la valeur de la propriété fromDateTime.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setFromDateTime(XMLGregorianCalendar value) {
        this.fromDateTime = value;
    }

    public boolean isSetFromDateTime() {
        return (this.fromDateTime!= null);
    }

    /**
     * Obtient la valeur de la propriété toDateTime.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getToDateTime() {
        return toDateTime;
    }

    /**
     * Définit la valeur de la propriété toDateTime.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setToDateTime(XMLGregorianCalendar value) {
        this.toDateTime = value;
    }

    public boolean isSetToDateTime() {
        return (this.toDateTime!= null);
    }

    /**
     * Obtient la valeur de la propriété dayType.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDayType() {
        return dayType;
    }

    /**
     * Définit la valeur de la propriété dayType.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDayType(String value) {
        this.dayType = value;
    }

    public boolean isSetDayType() {
        return (this.dayType!= null);
    }

    /**
     * Gets the value of the timebands property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the timebands property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTimebands().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ValidityConditionStructure.Timebands }
     * 
     * 
     */
    public List<ValidityConditionStructure.Timebands> getTimebands() {
        if (timebands == null) {
            timebands = new ArrayList<ValidityConditionStructure.Timebands>();
        }
        return this.timebands;
    }

    public boolean isSetTimebands() {
        return ((this.timebands!= null)&&(!this.timebands.isEmpty()));
    }

    public void unsetTimebands() {
        this.timebands = null;
    }


    /**
     * <p>Classe Java pour anonymous complex type.
     * 
     * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="Timeband" type="{http://www.ifopt.org.uk/ifopt}TimebandStructure"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "timeband"
    })
    public static class Timebands
        implements Serializable
    {

        private final static long serialVersionUID = 1L;
        @XmlElement(name = "Timeband", required = true)
        protected TimebandStructure timeband;

        /**
         * Obtient la valeur de la propriété timeband.
         * 
         * @return
         *     possible object is
         *     {@link TimebandStructure }
         *     
         */
        public TimebandStructure getTimeband() {
            return timeband;
        }

        /**
         * Définit la valeur de la propriété timeband.
         * 
         * @param value
         *     allowed object is
         *     {@link TimebandStructure }
         *     
         */
        public void setTimeband(TimebandStructure value) {
            this.timeband = value;
        }

        public boolean isSetTimeband() {
            return (this.timeband!= null);
        }

    }

}
