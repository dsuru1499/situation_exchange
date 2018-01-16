
package eu.datex2.schema._2_0rc1._2_0;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour AlertCMethod4Point complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="AlertCMethod4Point">
 *   &lt;complexContent>
 *     &lt;extension base="{http://datex2.eu/schema/2_0RC1/2_0}AlertCPoint">
 *       &lt;sequence>
 *         &lt;element name="alertCDirection" type="{http://datex2.eu/schema/2_0RC1/2_0}AlertCDirection"/>
 *         &lt;element name="alertCMethod4PrimaryPointLocation" type="{http://datex2.eu/schema/2_0RC1/2_0}AlertCMethod4PrimaryPointLocation"/>
 *         &lt;element name="alertCMethod4PointExtension" type="{http://datex2.eu/schema/2_0RC1/2_0}ExtensionType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AlertCMethod4Point", propOrder = {
    "alertCDirection",
    "alertCMethod4PrimaryPointLocation",
    "alertCMethod4PointExtension"
})
public class AlertCMethod4Point
    extends AlertCPoint
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(required = true)
    protected AlertCDirection alertCDirection;
    @XmlElement(required = true)
    protected AlertCMethod4PrimaryPointLocation alertCMethod4PrimaryPointLocation;
    protected ExtensionType alertCMethod4PointExtension;

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
     * Obtient la valeur de la propriété alertCMethod4PointExtension.
     * 
     * @return
     *     possible object is
     *     {@link ExtensionType }
     *     
     */
    public ExtensionType getAlertCMethod4PointExtension() {
        return alertCMethod4PointExtension;
    }

    /**
     * Définit la valeur de la propriété alertCMethod4PointExtension.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtensionType }
     *     
     */
    public void setAlertCMethod4PointExtension(ExtensionType value) {
        this.alertCMethod4PointExtension = value;
    }

    public boolean isSetAlertCMethod4PointExtension() {
        return (this.alertCMethod4PointExtension!= null);
    }

}
