
package eu.datex2.schema._2_0rc1._2_0;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Classe Java pour OverallPeriod complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="OverallPeriod">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="overallStartTime" type="{http://datex2.eu/schema/2_0RC1/2_0}DateTime"/>
 *         &lt;element name="overallEndTime" type="{http://datex2.eu/schema/2_0RC1/2_0}DateTime" minOccurs="0"/>
 *         &lt;element name="validPeriod" type="{http://datex2.eu/schema/2_0RC1/2_0}Period" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="exceptionPeriod" type="{http://datex2.eu/schema/2_0RC1/2_0}Period" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="overallPeriodExtension" type="{http://datex2.eu/schema/2_0RC1/2_0}ExtensionType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OverallPeriod", propOrder = {
    "overallStartTime",
    "overallEndTime",
    "validPeriod",
    "exceptionPeriod",
    "overallPeriodExtension"
})
public class OverallPeriod
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(required = true)
    protected XMLGregorianCalendar overallStartTime;
    protected XMLGregorianCalendar overallEndTime;
    protected List<Period> validPeriod;
    protected List<Period> exceptionPeriod;
    protected ExtensionType overallPeriodExtension;

    /**
     * Obtient la valeur de la propriété overallStartTime.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOverallStartTime() {
        return overallStartTime;
    }

    /**
     * Définit la valeur de la propriété overallStartTime.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOverallStartTime(XMLGregorianCalendar value) {
        this.overallStartTime = value;
    }

    public boolean isSetOverallStartTime() {
        return (this.overallStartTime!= null);
    }

    /**
     * Obtient la valeur de la propriété overallEndTime.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOverallEndTime() {
        return overallEndTime;
    }

    /**
     * Définit la valeur de la propriété overallEndTime.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOverallEndTime(XMLGregorianCalendar value) {
        this.overallEndTime = value;
    }

    public boolean isSetOverallEndTime() {
        return (this.overallEndTime!= null);
    }

    /**
     * Gets the value of the validPeriod property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the validPeriod property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getValidPeriod().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Period }
     * 
     * 
     */
    public List<Period> getValidPeriod() {
        if (validPeriod == null) {
            validPeriod = new ArrayList<Period>();
        }
        return this.validPeriod;
    }

    public boolean isSetValidPeriod() {
        return ((this.validPeriod!= null)&&(!this.validPeriod.isEmpty()));
    }

    public void unsetValidPeriod() {
        this.validPeriod = null;
    }

    /**
     * Gets the value of the exceptionPeriod property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the exceptionPeriod property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getExceptionPeriod().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Period }
     * 
     * 
     */
    public List<Period> getExceptionPeriod() {
        if (exceptionPeriod == null) {
            exceptionPeriod = new ArrayList<Period>();
        }
        return this.exceptionPeriod;
    }

    public boolean isSetExceptionPeriod() {
        return ((this.exceptionPeriod!= null)&&(!this.exceptionPeriod.isEmpty()));
    }

    public void unsetExceptionPeriod() {
        this.exceptionPeriod = null;
    }

    /**
     * Obtient la valeur de la propriété overallPeriodExtension.
     * 
     * @return
     *     possible object is
     *     {@link ExtensionType }
     *     
     */
    public ExtensionType getOverallPeriodExtension() {
        return overallPeriodExtension;
    }

    /**
     * Définit la valeur de la propriété overallPeriodExtension.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtensionType }
     *     
     */
    public void setOverallPeriodExtension(ExtensionType value) {
        this.overallPeriodExtension = value;
    }

    public boolean isSetOverallPeriodExtension() {
        return (this.overallPeriodExtension!= null);
    }

}
