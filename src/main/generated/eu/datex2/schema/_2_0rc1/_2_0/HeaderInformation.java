
package eu.datex2.schema._2_0rc1._2_0;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour HeaderInformation complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="HeaderInformation">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="areaOfInterest" type="{http://datex2.eu/schema/2_0RC1/2_0}AreaOfInterestEnum" minOccurs="0"/>
 *         &lt;element name="confidentiality" type="{http://datex2.eu/schema/2_0RC1/2_0}ConfidentialityValueEnum"/>
 *         &lt;element name="informationStatus" type="{http://datex2.eu/schema/2_0RC1/2_0}InformationStatusEnum"/>
 *         &lt;element name="urgency" type="{http://datex2.eu/schema/2_0RC1/2_0}UrgencyEnum" minOccurs="0"/>
 *         &lt;element name="headerInformationExtension" type="{http://datex2.eu/schema/2_0RC1/2_0}ExtensionType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HeaderInformation", propOrder = {
    "areaOfInterest",
    "confidentiality",
    "informationStatus",
    "urgency",
    "headerInformationExtension"
})
public class HeaderInformation
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    protected AreaOfInterestEnum areaOfInterest;
    @XmlElement(required = true)
    protected ConfidentialityValueEnum confidentiality;
    @XmlElement(required = true)
    protected InformationStatusEnum informationStatus;
    protected UrgencyEnum urgency;
    protected ExtensionType headerInformationExtension;

    /**
     * Obtient la valeur de la propriété areaOfInterest.
     * 
     * @return
     *     possible object is
     *     {@link AreaOfInterestEnum }
     *     
     */
    public AreaOfInterestEnum getAreaOfInterest() {
        return areaOfInterest;
    }

    /**
     * Définit la valeur de la propriété areaOfInterest.
     * 
     * @param value
     *     allowed object is
     *     {@link AreaOfInterestEnum }
     *     
     */
    public void setAreaOfInterest(AreaOfInterestEnum value) {
        this.areaOfInterest = value;
    }

    public boolean isSetAreaOfInterest() {
        return (this.areaOfInterest!= null);
    }

    /**
     * Obtient la valeur de la propriété confidentiality.
     * 
     * @return
     *     possible object is
     *     {@link ConfidentialityValueEnum }
     *     
     */
    public ConfidentialityValueEnum getConfidentiality() {
        return confidentiality;
    }

    /**
     * Définit la valeur de la propriété confidentiality.
     * 
     * @param value
     *     allowed object is
     *     {@link ConfidentialityValueEnum }
     *     
     */
    public void setConfidentiality(ConfidentialityValueEnum value) {
        this.confidentiality = value;
    }

    public boolean isSetConfidentiality() {
        return (this.confidentiality!= null);
    }

    /**
     * Obtient la valeur de la propriété informationStatus.
     * 
     * @return
     *     possible object is
     *     {@link InformationStatusEnum }
     *     
     */
    public InformationStatusEnum getInformationStatus() {
        return informationStatus;
    }

    /**
     * Définit la valeur de la propriété informationStatus.
     * 
     * @param value
     *     allowed object is
     *     {@link InformationStatusEnum }
     *     
     */
    public void setInformationStatus(InformationStatusEnum value) {
        this.informationStatus = value;
    }

    public boolean isSetInformationStatus() {
        return (this.informationStatus!= null);
    }

    /**
     * Obtient la valeur de la propriété urgency.
     * 
     * @return
     *     possible object is
     *     {@link UrgencyEnum }
     *     
     */
    public UrgencyEnum getUrgency() {
        return urgency;
    }

    /**
     * Définit la valeur de la propriété urgency.
     * 
     * @param value
     *     allowed object is
     *     {@link UrgencyEnum }
     *     
     */
    public void setUrgency(UrgencyEnum value) {
        this.urgency = value;
    }

    public boolean isSetUrgency() {
        return (this.urgency!= null);
    }

    /**
     * Obtient la valeur de la propriété headerInformationExtension.
     * 
     * @return
     *     possible object is
     *     {@link ExtensionType }
     *     
     */
    public ExtensionType getHeaderInformationExtension() {
        return headerInformationExtension;
    }

    /**
     * Définit la valeur de la propriété headerInformationExtension.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtensionType }
     *     
     */
    public void setHeaderInformationExtension(ExtensionType value) {
        this.headerInformationExtension = value;
    }

    public boolean isSetHeaderInformationExtension() {
        return (this.headerInformationExtension!= null);
    }

}
