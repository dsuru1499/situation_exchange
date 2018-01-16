
package eu.datex2.schema._2_0rc1._2_0;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour AlertCMethod2Linear complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="AlertCMethod2Linear">
 *   &lt;complexContent>
 *     &lt;extension base="{http://datex2.eu/schema/2_0RC1/2_0}AlertCLinear">
 *       &lt;sequence>
 *         &lt;element name="alertCDirection" type="{http://datex2.eu/schema/2_0RC1/2_0}AlertCDirection"/>
 *         &lt;element name="alertCMethod2PrimaryPointLocation" type="{http://datex2.eu/schema/2_0RC1/2_0}AlertCMethod2PrimaryPointLocation"/>
 *         &lt;element name="alertCMethod2SecondaryPointLocation" type="{http://datex2.eu/schema/2_0RC1/2_0}AlertCMethod2SecondaryPointLocation"/>
 *         &lt;element name="alertCMethod2LinearExtension" type="{http://datex2.eu/schema/2_0RC1/2_0}ExtensionType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AlertCMethod2Linear", propOrder = {
    "alertCDirection",
    "alertCMethod2PrimaryPointLocation",
    "alertCMethod2SecondaryPointLocation",
    "alertCMethod2LinearExtension"
})
public class AlertCMethod2Linear
    extends AlertCLinear
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(required = true)
    protected AlertCDirection alertCDirection;
    @XmlElement(required = true)
    protected AlertCMethod2PrimaryPointLocation alertCMethod2PrimaryPointLocation;
    @XmlElement(required = true)
    protected AlertCMethod2SecondaryPointLocation alertCMethod2SecondaryPointLocation;
    protected ExtensionType alertCMethod2LinearExtension;

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
     * Obtient la valeur de la propriété alertCMethod2PrimaryPointLocation.
     * 
     * @return
     *     possible object is
     *     {@link AlertCMethod2PrimaryPointLocation }
     *     
     */
    public AlertCMethod2PrimaryPointLocation getAlertCMethod2PrimaryPointLocation() {
        return alertCMethod2PrimaryPointLocation;
    }

    /**
     * Définit la valeur de la propriété alertCMethod2PrimaryPointLocation.
     * 
     * @param value
     *     allowed object is
     *     {@link AlertCMethod2PrimaryPointLocation }
     *     
     */
    public void setAlertCMethod2PrimaryPointLocation(AlertCMethod2PrimaryPointLocation value) {
        this.alertCMethod2PrimaryPointLocation = value;
    }

    public boolean isSetAlertCMethod2PrimaryPointLocation() {
        return (this.alertCMethod2PrimaryPointLocation!= null);
    }

    /**
     * Obtient la valeur de la propriété alertCMethod2SecondaryPointLocation.
     * 
     * @return
     *     possible object is
     *     {@link AlertCMethod2SecondaryPointLocation }
     *     
     */
    public AlertCMethod2SecondaryPointLocation getAlertCMethod2SecondaryPointLocation() {
        return alertCMethod2SecondaryPointLocation;
    }

    /**
     * Définit la valeur de la propriété alertCMethod2SecondaryPointLocation.
     * 
     * @param value
     *     allowed object is
     *     {@link AlertCMethod2SecondaryPointLocation }
     *     
     */
    public void setAlertCMethod2SecondaryPointLocation(AlertCMethod2SecondaryPointLocation value) {
        this.alertCMethod2SecondaryPointLocation = value;
    }

    public boolean isSetAlertCMethod2SecondaryPointLocation() {
        return (this.alertCMethod2SecondaryPointLocation!= null);
    }

    /**
     * Obtient la valeur de la propriété alertCMethod2LinearExtension.
     * 
     * @return
     *     possible object is
     *     {@link ExtensionType }
     *     
     */
    public ExtensionType getAlertCMethod2LinearExtension() {
        return alertCMethod2LinearExtension;
    }

    /**
     * Définit la valeur de la propriété alertCMethod2LinearExtension.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtensionType }
     *     
     */
    public void setAlertCMethod2LinearExtension(ExtensionType value) {
        this.alertCMethod2LinearExtension = value;
    }

    public boolean isSetAlertCMethod2LinearExtension() {
        return (this.alertCMethod2LinearExtension!= null);
    }

}
