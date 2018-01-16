
package eu.datex2.schema._2_0rc1._2_0;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Classe Java pour VehicleDetectionTime complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="VehicleDetectionTime">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="arrivalTime" type="{http://datex2.eu/schema/2_0RC1/2_0}DateTime" minOccurs="0"/>
 *         &lt;element name="exitTime" type="{http://datex2.eu/schema/2_0RC1/2_0}DateTime" minOccurs="0"/>
 *         &lt;element name="passageTime" type="{http://datex2.eu/schema/2_0RC1/2_0}DateTime" minOccurs="0"/>
 *         &lt;element name="presenceTime" type="{http://datex2.eu/schema/2_0RC1/2_0}DateTime" minOccurs="0"/>
 *         &lt;element name="timeGap" type="{http://datex2.eu/schema/2_0RC1/2_0}Seconds" minOccurs="0"/>
 *         &lt;element name="timeHeadway" type="{http://datex2.eu/schema/2_0RC1/2_0}Seconds" minOccurs="0"/>
 *         &lt;element name="vehicleDetectionTimeExtension" type="{http://datex2.eu/schema/2_0RC1/2_0}ExtensionType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VehicleDetectionTime", propOrder = {
    "arrivalTime",
    "exitTime",
    "passageTime",
    "presenceTime",
    "timeGap",
    "timeHeadway",
    "vehicleDetectionTimeExtension"
})
public class VehicleDetectionTime
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    protected XMLGregorianCalendar arrivalTime;
    protected XMLGregorianCalendar exitTime;
    protected XMLGregorianCalendar passageTime;
    protected XMLGregorianCalendar presenceTime;
    protected Float timeGap;
    protected Float timeHeadway;
    protected ExtensionType vehicleDetectionTimeExtension;

    /**
     * Obtient la valeur de la propriété arrivalTime.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getArrivalTime() {
        return arrivalTime;
    }

    /**
     * Définit la valeur de la propriété arrivalTime.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setArrivalTime(XMLGregorianCalendar value) {
        this.arrivalTime = value;
    }

    public boolean isSetArrivalTime() {
        return (this.arrivalTime!= null);
    }

    /**
     * Obtient la valeur de la propriété exitTime.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getExitTime() {
        return exitTime;
    }

    /**
     * Définit la valeur de la propriété exitTime.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setExitTime(XMLGregorianCalendar value) {
        this.exitTime = value;
    }

    public boolean isSetExitTime() {
        return (this.exitTime!= null);
    }

    /**
     * Obtient la valeur de la propriété passageTime.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getPassageTime() {
        return passageTime;
    }

    /**
     * Définit la valeur de la propriété passageTime.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setPassageTime(XMLGregorianCalendar value) {
        this.passageTime = value;
    }

    public boolean isSetPassageTime() {
        return (this.passageTime!= null);
    }

    /**
     * Obtient la valeur de la propriété presenceTime.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getPresenceTime() {
        return presenceTime;
    }

    /**
     * Définit la valeur de la propriété presenceTime.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setPresenceTime(XMLGregorianCalendar value) {
        this.presenceTime = value;
    }

    public boolean isSetPresenceTime() {
        return (this.presenceTime!= null);
    }

    /**
     * Obtient la valeur de la propriété timeGap.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getTimeGap() {
        return timeGap;
    }

    /**
     * Définit la valeur de la propriété timeGap.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setTimeGap(Float value) {
        this.timeGap = value;
    }

    public boolean isSetTimeGap() {
        return (this.timeGap!= null);
    }

    /**
     * Obtient la valeur de la propriété timeHeadway.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getTimeHeadway() {
        return timeHeadway;
    }

    /**
     * Définit la valeur de la propriété timeHeadway.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setTimeHeadway(Float value) {
        this.timeHeadway = value;
    }

    public boolean isSetTimeHeadway() {
        return (this.timeHeadway!= null);
    }

    /**
     * Obtient la valeur de la propriété vehicleDetectionTimeExtension.
     * 
     * @return
     *     possible object is
     *     {@link ExtensionType }
     *     
     */
    public ExtensionType getVehicleDetectionTimeExtension() {
        return vehicleDetectionTimeExtension;
    }

    /**
     * Définit la valeur de la propriété vehicleDetectionTimeExtension.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtensionType }
     *     
     */
    public void setVehicleDetectionTimeExtension(ExtensionType value) {
        this.vehicleDetectionTimeExtension = value;
    }

    public boolean isSetVehicleDetectionTimeExtension() {
        return (this.vehicleDetectionTimeExtension!= null);
    }

}
