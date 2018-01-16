
package eu.datex2.schema._2_0rc1._2_0;

import java.io.Serializable;
import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour AlertCLocation complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="AlertCLocation">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="alertCLocationName" type="{http://datex2.eu/schema/2_0RC1/2_0}MultilingualString" minOccurs="0"/>
 *         &lt;element name="specificLocation" type="{http://datex2.eu/schema/2_0RC1/2_0}AlertCLocationCode"/>
 *         &lt;element name="alertCLocationExtension" type="{http://datex2.eu/schema/2_0RC1/2_0}ExtensionType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AlertCLocation", propOrder = {
    "alertCLocationName",
    "specificLocation",
    "alertCLocationExtension"
})
public class AlertCLocation
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    protected MultilingualString alertCLocationName;
    @XmlElement(required = true)
    protected BigInteger specificLocation;
    protected ExtensionType alertCLocationExtension;

    /**
     * Obtient la valeur de la propriété alertCLocationName.
     * 
     * @return
     *     possible object is
     *     {@link MultilingualString }
     *     
     */
    public MultilingualString getAlertCLocationName() {
        return alertCLocationName;
    }

    /**
     * Définit la valeur de la propriété alertCLocationName.
     * 
     * @param value
     *     allowed object is
     *     {@link MultilingualString }
     *     
     */
    public void setAlertCLocationName(MultilingualString value) {
        this.alertCLocationName = value;
    }

    public boolean isSetAlertCLocationName() {
        return (this.alertCLocationName!= null);
    }

    /**
     * Obtient la valeur de la propriété specificLocation.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getSpecificLocation() {
        return specificLocation;
    }

    /**
     * Définit la valeur de la propriété specificLocation.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setSpecificLocation(BigInteger value) {
        this.specificLocation = value;
    }

    public boolean isSetSpecificLocation() {
        return (this.specificLocation!= null);
    }

    /**
     * Obtient la valeur de la propriété alertCLocationExtension.
     * 
     * @return
     *     possible object is
     *     {@link ExtensionType }
     *     
     */
    public ExtensionType getAlertCLocationExtension() {
        return alertCLocationExtension;
    }

    /**
     * Définit la valeur de la propriété alertCLocationExtension.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtensionType }
     *     
     */
    public void setAlertCLocationExtension(ExtensionType value) {
        this.alertCLocationExtension = value;
    }

    public boolean isSetAlertCLocationExtension() {
        return (this.alertCLocationExtension!= null);
    }

}
