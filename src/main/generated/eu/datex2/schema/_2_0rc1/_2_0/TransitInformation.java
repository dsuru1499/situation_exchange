
package eu.datex2.schema._2_0rc1._2_0;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Classe Java pour TransitInformation complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="TransitInformation">
 *   &lt;complexContent>
 *     &lt;extension base="{http://datex2.eu/schema/2_0RC1/2_0}NonRoadEventInformation">
 *       &lt;sequence>
 *         &lt;element name="journeyDestination" type="{http://datex2.eu/schema/2_0RC1/2_0}MultilingualString" minOccurs="0"/>
 *         &lt;element name="journeyOrigin" type="{http://datex2.eu/schema/2_0RC1/2_0}MultilingualString" minOccurs="0"/>
 *         &lt;element name="journeyReference" type="{http://datex2.eu/schema/2_0RC1/2_0}String" minOccurs="0"/>
 *         &lt;element name="transitServiceInformation" type="{http://datex2.eu/schema/2_0RC1/2_0}TransitServiceInformationEnum"/>
 *         &lt;element name="transitServiceType" type="{http://datex2.eu/schema/2_0RC1/2_0}TransitServiceTypeEnum"/>
 *         &lt;element name="scheduledDepartureTime" type="{http://datex2.eu/schema/2_0RC1/2_0}DateTime" minOccurs="0"/>
 *         &lt;element name="transitInformationExtension" type="{http://datex2.eu/schema/2_0RC1/2_0}ExtensionType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TransitInformation", propOrder = {
    "journeyDestination",
    "journeyOrigin",
    "journeyReference",
    "transitServiceInformation",
    "transitServiceType",
    "scheduledDepartureTime",
    "transitInformationExtension"
})
public class TransitInformation
    extends NonRoadEventInformation
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    protected MultilingualString journeyDestination;
    protected MultilingualString journeyOrigin;
    protected String journeyReference;
    @XmlElement(required = true)
    protected TransitServiceInformationEnum transitServiceInformation;
    @XmlElement(required = true)
    protected TransitServiceTypeEnum transitServiceType;
    protected XMLGregorianCalendar scheduledDepartureTime;
    protected ExtensionType transitInformationExtension;

    /**
     * Obtient la valeur de la propriété journeyDestination.
     * 
     * @return
     *     possible object is
     *     {@link MultilingualString }
     *     
     */
    public MultilingualString getJourneyDestination() {
        return journeyDestination;
    }

    /**
     * Définit la valeur de la propriété journeyDestination.
     * 
     * @param value
     *     allowed object is
     *     {@link MultilingualString }
     *     
     */
    public void setJourneyDestination(MultilingualString value) {
        this.journeyDestination = value;
    }

    public boolean isSetJourneyDestination() {
        return (this.journeyDestination!= null);
    }

    /**
     * Obtient la valeur de la propriété journeyOrigin.
     * 
     * @return
     *     possible object is
     *     {@link MultilingualString }
     *     
     */
    public MultilingualString getJourneyOrigin() {
        return journeyOrigin;
    }

    /**
     * Définit la valeur de la propriété journeyOrigin.
     * 
     * @param value
     *     allowed object is
     *     {@link MultilingualString }
     *     
     */
    public void setJourneyOrigin(MultilingualString value) {
        this.journeyOrigin = value;
    }

    public boolean isSetJourneyOrigin() {
        return (this.journeyOrigin!= null);
    }

    /**
     * Obtient la valeur de la propriété journeyReference.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getJourneyReference() {
        return journeyReference;
    }

    /**
     * Définit la valeur de la propriété journeyReference.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setJourneyReference(String value) {
        this.journeyReference = value;
    }

    public boolean isSetJourneyReference() {
        return (this.journeyReference!= null);
    }

    /**
     * Obtient la valeur de la propriété transitServiceInformation.
     * 
     * @return
     *     possible object is
     *     {@link TransitServiceInformationEnum }
     *     
     */
    public TransitServiceInformationEnum getTransitServiceInformation() {
        return transitServiceInformation;
    }

    /**
     * Définit la valeur de la propriété transitServiceInformation.
     * 
     * @param value
     *     allowed object is
     *     {@link TransitServiceInformationEnum }
     *     
     */
    public void setTransitServiceInformation(TransitServiceInformationEnum value) {
        this.transitServiceInformation = value;
    }

    public boolean isSetTransitServiceInformation() {
        return (this.transitServiceInformation!= null);
    }

    /**
     * Obtient la valeur de la propriété transitServiceType.
     * 
     * @return
     *     possible object is
     *     {@link TransitServiceTypeEnum }
     *     
     */
    public TransitServiceTypeEnum getTransitServiceType() {
        return transitServiceType;
    }

    /**
     * Définit la valeur de la propriété transitServiceType.
     * 
     * @param value
     *     allowed object is
     *     {@link TransitServiceTypeEnum }
     *     
     */
    public void setTransitServiceType(TransitServiceTypeEnum value) {
        this.transitServiceType = value;
    }

    public boolean isSetTransitServiceType() {
        return (this.transitServiceType!= null);
    }

    /**
     * Obtient la valeur de la propriété scheduledDepartureTime.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getScheduledDepartureTime() {
        return scheduledDepartureTime;
    }

    /**
     * Définit la valeur de la propriété scheduledDepartureTime.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setScheduledDepartureTime(XMLGregorianCalendar value) {
        this.scheduledDepartureTime = value;
    }

    public boolean isSetScheduledDepartureTime() {
        return (this.scheduledDepartureTime!= null);
    }

    /**
     * Obtient la valeur de la propriété transitInformationExtension.
     * 
     * @return
     *     possible object is
     *     {@link ExtensionType }
     *     
     */
    public ExtensionType getTransitInformationExtension() {
        return transitInformationExtension;
    }

    /**
     * Définit la valeur de la propriété transitInformationExtension.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtensionType }
     *     
     */
    public void setTransitInformationExtension(ExtensionType value) {
        this.transitInformationExtension = value;
    }

    public boolean isSetTransitInformationExtension() {
        return (this.transitInformationExtension!= null);
    }

}
