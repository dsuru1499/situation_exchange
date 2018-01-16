
package eu.datex2.schema._2_0rc1._2_0;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour AlertCMethod4Linear complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="AlertCMethod4Linear">
 *   &lt;complexContent>
 *     &lt;extension base="{http://datex2.eu/schema/2_0RC1/2_0}AlertCLinear">
 *       &lt;sequence>
 *         &lt;element name="alertCDirection" type="{http://datex2.eu/schema/2_0RC1/2_0}AlertCDirection"/>
 *         &lt;element name="alertCMethod4PrimaryPointLocation" type="{http://datex2.eu/schema/2_0RC1/2_0}AlertCMethod4PrimaryPointLocation"/>
 *         &lt;element name="alertCMethod4SecondaryPointLocation" type="{http://datex2.eu/schema/2_0RC1/2_0}AlertCMethod4SecondaryPointLocation"/>
 *         &lt;element name="alertCMethod4LinearExtension" type="{http://datex2.eu/schema/2_0RC1/2_0}ExtensionType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AlertCMethod4Linear", propOrder = {
    "alertCDirection",
    "alertCMethod4PrimaryPointLocation",
    "alertCMethod4SecondaryPointLocation",
    "alertCMethod4LinearExtension"
})
public class AlertCMethod4Linear
    extends AlertCLinear
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(required = true)
    protected AlertCDirection alertCDirection;
    @XmlElement(required = true)
    protected AlertCMethod4PrimaryPointLocation alertCMethod4PrimaryPointLocation;
    @XmlElement(required = true)
    protected AlertCMethod4SecondaryPointLocation alertCMethod4SecondaryPointLocation;
    protected ExtensionType alertCMethod4LinearExtension;

    /**
     * Obtient la valeur de la propriété alertCDirection.
     * 
     * @return
     *     possible object is
     *     {@link AlertCDirection }
     *     
     */
    public AlertCDirection getAlertCDirection() {
        return alertCDirection;
    }

    /**
     * Définit la valeur de la propriété alertCDirection.
     * 
     * @param value
     *     allowed object is
     *     {@link AlertCDirection }
     *     
     */
    public void setAlertCDirection(AlertCDirection value) {
        this.alertCDirection = value;
    }

    public boolean isSetAlertCDirection() {
        return (this.alertCDirection!= null);
    }

    /**
     * Obtient la valeur de la propriété alertCMethod4PrimaryPointLocation.
     * 
     * @return
     *     possible object is
     *     {@link AlertCMethod4PrimaryPointLocation }
     *     
     */
    public AlertCMethod4PrimaryPointLocation getAlertCMethod4PrimaryPointLocation() {
        return alertCMethod4PrimaryPointLocation;
    }

    /**
     * Définit la valeur de la propriété alertCMethod4PrimaryPointLocation.
     * 
     * @param value
     *     allowed object is
     *     {@link AlertCMethod4PrimaryPointLocation }
     *     
     */
    public void setAlertCMethod4PrimaryPointLocation(AlertCMethod4PrimaryPointLocation value) {
        this.alertCMethod4PrimaryPointLocation = value;
    }

    public boolean isSetAlertCMethod4PrimaryPointLocation() {
        return (this.alertCMethod4PrimaryPointLocation!= null);
    }

    /**
     * Obtient la valeur de la propriété alertCMethod4SecondaryPointLocation.
     * 
     * @return
     *     possible object is
     *     {@link AlertCMethod4SecondaryPointLocation }
     *     
     */
    public AlertCMethod4SecondaryPointLocation getAlertCMethod4SecondaryPointLocation() {
        return alertCMethod4SecondaryPointLocation;
    }

    /**
     * Définit la valeur de la propriété alertCMethod4SecondaryPointLocation.
     * 
     * @param value
     *     allowed object is
     *     {@link AlertCMethod4SecondaryPointLocation }
     *     
     */
    public void setAlertCMethod4SecondaryPointLocation(AlertCMethod4SecondaryPointLocation value) {
        this.alertCMethod4SecondaryPointLocation = value;
    }

    public boolean isSetAlertCMethod4SecondaryPointLocation() {
        return (this.alertCMethod4SecondaryPointLocation!= null);
    }

    /**
     * Obtient la valeur de la propriété alertCMethod4LinearExtension.
     * 
     * @return
     *     possible object is
     *     {@link ExtensionType }
     *     
     */
    public ExtensionType getAlertCMethod4LinearExtension() {
        return alertCMethod4LinearExtension;
    }

    /**
     * Définit la valeur de la propriété alertCMethod4LinearExtension.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtensionType }
     *     
     */
    public void setAlertCMethod4LinearExtension(ExtensionType value) {
        this.alertCMethod4LinearExtension = value;
    }

    public boolean isSetAlertCMethod4LinearExtension() {
        return (this.alertCMethod4LinearExtension!= null);
    }

}
