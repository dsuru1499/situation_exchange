
package eu.datex2.schema._2_0rc1._2_0;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour AlertCArea complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="AlertCArea">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="alertCLocationCountryCode" type="{http://datex2.eu/schema/2_0RC1/2_0}String"/>
 *         &lt;element name="alertCLocationTableNumber" type="{http://datex2.eu/schema/2_0RC1/2_0}String"/>
 *         &lt;element name="alertCLocationTableVersion" type="{http://datex2.eu/schema/2_0RC1/2_0}String"/>
 *         &lt;element name="areaLocation" type="{http://datex2.eu/schema/2_0RC1/2_0}AlertCLocation"/>
 *         &lt;element name="alertCAreaExtension" type="{http://datex2.eu/schema/2_0RC1/2_0}ExtensionType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AlertCArea", propOrder = {
    "alertCLocationCountryCode",
    "alertCLocationTableNumber",
    "alertCLocationTableVersion",
    "areaLocation",
    "alertCAreaExtension"
})
public class AlertCArea
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(required = true)
    protected String alertCLocationCountryCode;
    @XmlElement(required = true)
    protected String alertCLocationTableNumber;
    @XmlElement(required = true)
    protected String alertCLocationTableVersion;
    @XmlElement(required = true)
    protected AlertCLocation areaLocation;
    protected ExtensionType alertCAreaExtension;

    /**
     * Obtient la valeur de la propriété alertCLocationCountryCode.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAlertCLocationCountryCode() {
        return alertCLocationCountryCode;
    }

    /**
     * Définit la valeur de la propriété alertCLocationCountryCode.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAlertCLocationCountryCode(String value) {
        this.alertCLocationCountryCode = value;
    }

    public boolean isSetAlertCLocationCountryCode() {
        return (this.alertCLocationCountryCode!= null);
    }

    /**
     * Obtient la valeur de la propriété alertCLocationTableNumber.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAlertCLocationTableNumber() {
        return alertCLocationTableNumber;
    }

    /**
     * Définit la valeur de la propriété alertCLocationTableNumber.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAlertCLocationTableNumber(String value) {
        this.alertCLocationTableNumber = value;
    }

    public boolean isSetAlertCLocationTableNumber() {
        return (this.alertCLocationTableNumber!= null);
    }

    /**
     * Obtient la valeur de la propriété alertCLocationTableVersion.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAlertCLocationTableVersion() {
        return alertCLocationTableVersion;
    }

    /**
     * Définit la valeur de la propriété alertCLocationTableVersion.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAlertCLocationTableVersion(String value) {
        this.alertCLocationTableVersion = value;
    }

    public boolean isSetAlertCLocationTableVersion() {
        return (this.alertCLocationTableVersion!= null);
    }

    /**
     * Obtient la valeur de la propriété areaLocation.
     * 
     * @return
     *     possible object is
     *     {@link AlertCLocation }
     *     
     */
    public AlertCLocation getAreaLocation() {
        return areaLocation;
    }

    /**
     * Définit la valeur de la propriété areaLocation.
     * 
     * @param value
     *     allowed object is
     *     {@link AlertCLocation }
     *     
     */
    public void setAreaLocation(AlertCLocation value) {
        this.areaLocation = value;
    }

    public boolean isSetAreaLocation() {
        return (this.areaLocation!= null);
    }

    /**
     * Obtient la valeur de la propriété alertCAreaExtension.
     * 
     * @return
     *     possible object is
     *     {@link ExtensionType }
     *     
     */
    public ExtensionType getAlertCAreaExtension() {
        return alertCAreaExtension;
    }

    /**
     * Définit la valeur de la propriété alertCAreaExtension.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtensionType }
     *     
     */
    public void setAlertCAreaExtension(ExtensionType value) {
        this.alertCAreaExtension = value;
    }

    public boolean isSetAlertCAreaExtension() {
        return (this.alertCAreaExtension!= null);
    }

}
