
package eu.datex2.schema._2_0rc1._2_0;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour Linear complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="Linear">
 *   &lt;complexContent>
 *     &lt;extension base="{http://datex2.eu/schema/2_0RC1/2_0}NetworkLocation">
 *       &lt;sequence>
 *         &lt;element name="tpegLinearLocation" type="{http://datex2.eu/schema/2_0RC1/2_0}TpegLinearLocation" minOccurs="0"/>
 *         &lt;element name="alertCLinear" type="{http://datex2.eu/schema/2_0RC1/2_0}AlertCLinear" minOccurs="0"/>
 *         &lt;element name="roadsideReferencePointLinear" type="{http://datex2.eu/schema/2_0RC1/2_0}RoadsideReferencePointLinear" minOccurs="0"/>
 *         &lt;element name="linearExtension" type="{http://datex2.eu/schema/2_0RC1/2_0}ExtensionType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Linear", propOrder = {
    "tpegLinearLocation",
    "alertCLinear",
    "roadsideReferencePointLinear",
    "linearExtension"
})
public class Linear
    extends NetworkLocation
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    protected TpegLinearLocation tpegLinearLocation;
    protected AlertCLinear alertCLinear;
    protected RoadsideReferencePointLinear roadsideReferencePointLinear;
    protected ExtensionType linearExtension;

    /**
     * Obtient la valeur de la propriété tpegLinearLocation.
     * 
     * @return
     *     possible object is
     *     {@link TpegLinearLocation }
     *     
     */
    public TpegLinearLocation getTpegLinearLocation() {
        return tpegLinearLocation;
    }

    /**
     * Définit la valeur de la propriété tpegLinearLocation.
     * 
     * @param value
     *     allowed object is
     *     {@link TpegLinearLocation }
     *     
     */
    public void setTpegLinearLocation(TpegLinearLocation value) {
        this.tpegLinearLocation = value;
    }

    public boolean isSetTpegLinearLocation() {
        return (this.tpegLinearLocation!= null);
    }

    /**
     * Obtient la valeur de la propriété alertCLinear.
     * 
     * @return
     *     possible object is
     *     {@link AlertCLinear }
     *     
     */
    public AlertCLinear getAlertCLinear() {
        return alertCLinear;
    }

    /**
     * Définit la valeur de la propriété alertCLinear.
     * 
     * @param value
     *     allowed object is
     *     {@link AlertCLinear }
     *     
     */
    public void setAlertCLinear(AlertCLinear value) {
        this.alertCLinear = value;
    }

    public boolean isSetAlertCLinear() {
        return (this.alertCLinear!= null);
    }

    /**
     * Obtient la valeur de la propriété roadsideReferencePointLinear.
     * 
     * @return
     *     possible object is
     *     {@link RoadsideReferencePointLinear }
     *     
     */
    public RoadsideReferencePointLinear getRoadsideReferencePointLinear() {
        return roadsideReferencePointLinear;
    }

    /**
     * Définit la valeur de la propriété roadsideReferencePointLinear.
     * 
     * @param value
     *     allowed object is
     *     {@link RoadsideReferencePointLinear }
     *     
     */
    public void setRoadsideReferencePointLinear(RoadsideReferencePointLinear value) {
        this.roadsideReferencePointLinear = value;
    }

    public boolean isSetRoadsideReferencePointLinear() {
        return (this.roadsideReferencePointLinear!= null);
    }

    /**
     * Obtient la valeur de la propriété linearExtension.
     * 
     * @return
     *     possible object is
     *     {@link ExtensionType }
     *     
     */
    public ExtensionType getLinearExtension() {
        return linearExtension;
    }

    /**
     * Définit la valeur de la propriété linearExtension.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtensionType }
     *     
     */
    public void setLinearExtension(ExtensionType value) {
        this.linearExtension = value;
    }

    public boolean isSetLinearExtension() {
        return (this.linearExtension!= null);
    }

}
