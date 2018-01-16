
package eu.datex2.schema._2_0rc1._2_0;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour Area complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="Area">
 *   &lt;complexContent>
 *     &lt;extension base="{http://datex2.eu/schema/2_0RC1/2_0}Location">
 *       &lt;sequence>
 *         &lt;element name="alertCArea" type="{http://datex2.eu/schema/2_0RC1/2_0}AlertCArea" minOccurs="0"/>
 *         &lt;element name="tpegAreaLocation" type="{http://datex2.eu/schema/2_0RC1/2_0}TpegAreaLocation" minOccurs="0"/>
 *         &lt;element name="areaExtension" type="{http://datex2.eu/schema/2_0RC1/2_0}ExtensionType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Area", propOrder = {
    "alertCArea",
    "tpegAreaLocation",
    "areaExtension"
})
public class Area
    extends Location
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    protected AlertCArea alertCArea;
    protected TpegAreaLocation tpegAreaLocation;
    protected ExtensionType areaExtension;

    /**
     * Obtient la valeur de la propriété alertCArea.
     * 
     * @return
     *     possible object is
     *     {@link AlertCArea }
     *     
     */
    public AlertCArea getAlertCArea() {
        return alertCArea;
    }

    /**
     * Définit la valeur de la propriété alertCArea.
     * 
     * @param value
     *     allowed object is
     *     {@link AlertCArea }
     *     
     */
    public void setAlertCArea(AlertCArea value) {
        this.alertCArea = value;
    }

    public boolean isSetAlertCArea() {
        return (this.alertCArea!= null);
    }

    /**
     * Obtient la valeur de la propriété tpegAreaLocation.
     * 
     * @return
     *     possible object is
     *     {@link TpegAreaLocation }
     *     
     */
    public TpegAreaLocation getTpegAreaLocation() {
        return tpegAreaLocation;
    }

    /**
     * Définit la valeur de la propriété tpegAreaLocation.
     * 
     * @param value
     *     allowed object is
     *     {@link TpegAreaLocation }
     *     
     */
    public void setTpegAreaLocation(TpegAreaLocation value) {
        this.tpegAreaLocation = value;
    }

    public boolean isSetTpegAreaLocation() {
        return (this.tpegAreaLocation!= null);
    }

    /**
     * Obtient la valeur de la propriété areaExtension.
     * 
     * @return
     *     possible object is
     *     {@link ExtensionType }
     *     
     */
    public ExtensionType getAreaExtension() {
        return areaExtension;
    }

    /**
     * Définit la valeur de la propriété areaExtension.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtensionType }
     *     
     */
    public void setAreaExtension(ExtensionType value) {
        this.areaExtension = value;
    }

    public boolean isSetAreaExtension() {
        return (this.areaExtension!= null);
    }

}
