
package eu.datex2.schema._2_0rc1._2_0;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour AreaDestination complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="AreaDestination">
 *   &lt;complexContent>
 *     &lt;extension base="{http://datex2.eu/schema/2_0RC1/2_0}Destination">
 *       &lt;sequence>
 *         &lt;element name="area" type="{http://datex2.eu/schema/2_0RC1/2_0}Area"/>
 *         &lt;element name="areaDestinationExtension" type="{http://datex2.eu/schema/2_0RC1/2_0}ExtensionType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AreaDestination", propOrder = {
    "area",
    "areaDestinationExtension"
})
public class AreaDestination
    extends Destination
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(required = true)
    protected Area area;
    protected ExtensionType areaDestinationExtension;

    /**
     * Obtient la valeur de la propriété area.
     * 
     * @return
     *     possible object is
     *     {@link Area }
     *     
     */
    public Area getArea() {
        return area;
    }

    /**
     * Définit la valeur de la propriété area.
     * 
     * @param value
     *     allowed object is
     *     {@link Area }
     *     
     */
    public void setArea(Area value) {
        this.area = value;
    }

    public boolean isSetArea() {
        return (this.area!= null);
    }

    /**
     * Obtient la valeur de la propriété areaDestinationExtension.
     * 
     * @return
     *     possible object is
     *     {@link ExtensionType }
     *     
     */
    public ExtensionType getAreaDestinationExtension() {
        return areaDestinationExtension;
    }

    /**
     * Définit la valeur de la propriété areaDestinationExtension.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtensionType }
     *     
     */
    public void setAreaDestinationExtension(ExtensionType value) {
        this.areaDestinationExtension = value;
    }

    public boolean isSetAreaDestinationExtension() {
        return (this.areaDestinationExtension!= null);
    }

}
