
package eu.datex2.schema._2_0rc1._2_0;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour AlertCDirection complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="AlertCDirection">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="alertCDirectionCoded" type="{http://datex2.eu/schema/2_0RC1/2_0}AlertCDirectionEnum"/>
 *         &lt;element name="alertCDirectionNamed" type="{http://datex2.eu/schema/2_0RC1/2_0}MultilingualString" minOccurs="0"/>
 *         &lt;element name="alertCDirectionSense" type="{http://datex2.eu/schema/2_0RC1/2_0}Boolean" minOccurs="0"/>
 *         &lt;element name="alertCDirectionExtension" type="{http://datex2.eu/schema/2_0RC1/2_0}ExtensionType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AlertCDirection", propOrder = {
    "alertCDirectionCoded",
    "alertCDirectionNamed",
    "alertCDirectionSense",
    "alertCDirectionExtension"
})
public class AlertCDirection
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(required = true)
    protected AlertCDirectionEnum alertCDirectionCoded;
    protected MultilingualString alertCDirectionNamed;
    protected Boolean alertCDirectionSense;
    protected ExtensionType alertCDirectionExtension;

    /**
     * Obtient la valeur de la propriété alertCDirectionCoded.
     * 
     * @return
     *     possible object is
     *     {@link AlertCDirectionEnum }
     *     
     */
    public AlertCDirectionEnum getAlertCDirectionCoded() {
        return alertCDirectionCoded;
    }

    /**
     * Définit la valeur de la propriété alertCDirectionCoded.
     * 
     * @param value
     *     allowed object is
     *     {@link AlertCDirectionEnum }
     *     
     */
    public void setAlertCDirectionCoded(AlertCDirectionEnum value) {
        this.alertCDirectionCoded = value;
    }

    public boolean isSetAlertCDirectionCoded() {
        return (this.alertCDirectionCoded!= null);
    }

    /**
     * Obtient la valeur de la propriété alertCDirectionNamed.
     * 
     * @return
     *     possible object is
     *     {@link MultilingualString }
     *     
     */
    public MultilingualString getAlertCDirectionNamed() {
        return alertCDirectionNamed;
    }

    /**
     * Définit la valeur de la propriété alertCDirectionNamed.
     * 
     * @param value
     *     allowed object is
     *     {@link MultilingualString }
     *     
     */
    public void setAlertCDirectionNamed(MultilingualString value) {
        this.alertCDirectionNamed = value;
    }

    public boolean isSetAlertCDirectionNamed() {
        return (this.alertCDirectionNamed!= null);
    }

    /**
     * Obtient la valeur de la propriété alertCDirectionSense.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAlertCDirectionSense() {
        return alertCDirectionSense;
    }

    /**
     * Définit la valeur de la propriété alertCDirectionSense.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAlertCDirectionSense(Boolean value) {
        this.alertCDirectionSense = value;
    }

    public boolean isSetAlertCDirectionSense() {
        return (this.alertCDirectionSense!= null);
    }

    /**
     * Obtient la valeur de la propriété alertCDirectionExtension.
     * 
     * @return
     *     possible object is
     *     {@link ExtensionType }
     *     
     */
    public ExtensionType getAlertCDirectionExtension() {
        return alertCDirectionExtension;
    }

    /**
     * Définit la valeur de la propriété alertCDirectionExtension.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtensionType }
     *     
     */
    public void setAlertCDirectionExtension(ExtensionType value) {
        this.alertCDirectionExtension = value;
    }

    public boolean isSetAlertCDirectionExtension() {
        return (this.alertCDirectionExtension!= null);
    }

}
