
package eu.datex2.schema._2_0rc1._2_0;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour AlertCMethod4SecondaryPointLocation complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="AlertCMethod4SecondaryPointLocation">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="alertCLocation" type="{http://datex2.eu/schema/2_0RC1/2_0}AlertCLocation"/>
 *         &lt;element name="offsetDistance" type="{http://datex2.eu/schema/2_0RC1/2_0}OffsetDistance"/>
 *         &lt;element name="alertCMethod4SecondaryPointLocationExtension" type="{http://datex2.eu/schema/2_0RC1/2_0}ExtensionType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AlertCMethod4SecondaryPointLocation", propOrder = {
    "alertCLocation",
    "offsetDistance",
    "alertCMethod4SecondaryPointLocationExtension"
})
public class AlertCMethod4SecondaryPointLocation
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(required = true)
    protected AlertCLocation alertCLocation;
    @XmlElement(required = true)
    protected OffsetDistance offsetDistance;
    protected ExtensionType alertCMethod4SecondaryPointLocationExtension;

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
     * Obtient la valeur de la propriété alertCMethod4SecondaryPointLocationExtension.
     * 
     * @return
     *     possible object is
     *     {@link ExtensionType }
     *     
     */
    public ExtensionType getAlertCMethod4SecondaryPointLocationExtension() {
        return alertCMethod4SecondaryPointLocationExtension;
    }

    /**
     * Définit la valeur de la propriété alertCMethod4SecondaryPointLocationExtension.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtensionType }
     *     
     */
    public void setAlertCMethod4SecondaryPointLocationExtension(ExtensionType value) {
        this.alertCMethod4SecondaryPointLocationExtension = value;
    }

    public boolean isSetAlertCMethod4SecondaryPointLocationExtension() {
        return (this.alertCMethod4SecondaryPointLocationExtension!= null);
    }

}
