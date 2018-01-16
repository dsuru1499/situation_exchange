
package eu.datex2.schema._2_0rc1._2_0;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour DisturbanceActivity complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="DisturbanceActivity">
 *   &lt;complexContent>
 *     &lt;extension base="{http://datex2.eu/schema/2_0RC1/2_0}Activity">
 *       &lt;sequence>
 *         &lt;element name="disturbanceActivityType" type="{http://datex2.eu/schema/2_0RC1/2_0}DisturbanceActivityTypeEnum"/>
 *         &lt;element name="disturbanceActivityExtension" type="{http://datex2.eu/schema/2_0RC1/2_0}ExtensionType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DisturbanceActivity", propOrder = {
    "disturbanceActivityType",
    "disturbanceActivityExtension"
})
public class DisturbanceActivity
    extends Activity
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(required = true)
    protected DisturbanceActivityTypeEnum disturbanceActivityType;
    protected ExtensionType disturbanceActivityExtension;

    /**
     * Obtient la valeur de la propriété disturbanceActivityType.
     * 
     * @return
     *     possible object is
     *     {@link DisturbanceActivityTypeEnum }
     *     
     */
    public DisturbanceActivityTypeEnum getDisturbanceActivityType() {
        return disturbanceActivityType;
    }

    /**
     * Définit la valeur de la propriété disturbanceActivityType.
     * 
     * @param value
     *     allowed object is
     *     {@link DisturbanceActivityTypeEnum }
     *     
     */
    public void setDisturbanceActivityType(DisturbanceActivityTypeEnum value) {
        this.disturbanceActivityType = value;
    }

    public boolean isSetDisturbanceActivityType() {
        return (this.disturbanceActivityType!= null);
    }

    /**
     * Obtient la valeur de la propriété disturbanceActivityExtension.
     * 
     * @return
     *     possible object is
     *     {@link ExtensionType }
     *     
     */
    public ExtensionType getDisturbanceActivityExtension() {
        return disturbanceActivityExtension;
    }

    /**
     * Définit la valeur de la propriété disturbanceActivityExtension.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtensionType }
     *     
     */
    public void setDisturbanceActivityExtension(ExtensionType value) {
        this.disturbanceActivityExtension = value;
    }

    public boolean isSetDisturbanceActivityExtension() {
        return (this.disturbanceActivityExtension!= null);
    }

}
