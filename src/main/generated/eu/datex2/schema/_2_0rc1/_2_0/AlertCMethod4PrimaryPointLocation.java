
package eu.datex2.schema._2_0rc1._2_0;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour AlertCMethod4PrimaryPointLocation complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="AlertCMethod4PrimaryPointLocation">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="alertCLocation" type="{http://datex2.eu/schema/2_0RC1/2_0}AlertCLocation"/>
 *         &lt;element name="offsetDistance" type="{http://datex2.eu/schema/2_0RC1/2_0}OffsetDistance"/>
 *         &lt;element name="alertCMethod4PrimaryPointLocationExtension" type="{http://datex2.eu/schema/2_0RC1/2_0}ExtensionType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AlertCMethod4PrimaryPointLocation", propOrder = {
    "alertCLocation",
    "offsetDistance",
    "alertCMethod4PrimaryPointLocationExtension"
})
public class AlertCMethod4PrimaryPointLocation
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(required = true)
    protected AlertCLocation alertCLocation;
    @XmlElement(required = true)
    protected OffsetDistance offsetDistance;
    protected ExtensionType alertCMethod4PrimaryPointLocationExtension;

    /**
     * Obtient la valeur de la propriété alertCLocation.
     * 
     * @return
     *     possible object is
     *     {@link AlertCLocation }
     *     
     */
    public AlertCLocation getAlertCLocation() {
        return alertCLocation;
    }

    /**
     * Définit la valeur de la propriété alertCLocation.
     * 
     * @param value
     *     allowed object is
     *     {@link AlertCLocation }
     *     
     */
    public void setAlertCLocation(AlertCLocation value) {
        this.alertCLocation = value;
    }

    public boolean isSetAlertCLocation() {
        return (this.alertCLocation!= null);
    }

    /**
     * Obtient la valeur de la propriété offsetDistance.
     * 
     * @return
     *     possible object is
     *     {@link OffsetDistance }
     *     
     */
    public OffsetDistance getOffsetDistance() {
        return offsetDistance;
    }

    /**
     * Définit la valeur de la propriété offsetDistance.
     * 
     * @param value
     *     allowed object is
     *     {@link OffsetDistance }
     *     
     */
    public void setOffsetDistance(OffsetDistance value) {
        this.offsetDistance = value;
    }

    public boolean isSetOffsetDistance() {
        return (this.offsetDistance!= null);
    }

    /**
     * Obtient la valeur de la propriété alertCMethod4PrimaryPointLocationExtension.
     * 
     * @return
     *     possible object is
     *     {@link ExtensionType }
     *     
     */
    public ExtensionType getAlertCMethod4PrimaryPointLocationExtension() {
        return alertCMethod4PrimaryPointLocationExtension;
    }

    /**
     * Définit la valeur de la propriété alertCMethod4PrimaryPointLocationExtension.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtensionType }
     *     
     */
    public void setAlertCMethod4PrimaryPointLocationExtension(ExtensionType value) {
        this.alertCMethod4PrimaryPointLocationExtension = value;
    }

    public boolean isSetAlertCMethod4PrimaryPointLocationExtension() {
        return (this.alertCMethod4PrimaryPointLocationExtension!= null);
    }

}
