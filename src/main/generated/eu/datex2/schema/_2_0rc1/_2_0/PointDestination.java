
package eu.datex2.schema._2_0rc1._2_0;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour PointDestination complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="PointDestination">
 *   &lt;complexContent>
 *     &lt;extension base="{http://datex2.eu/schema/2_0RC1/2_0}Destination">
 *       &lt;sequence>
 *         &lt;element name="point" type="{http://datex2.eu/schema/2_0RC1/2_0}Point"/>
 *         &lt;element name="pointDestinationExtension" type="{http://datex2.eu/schema/2_0RC1/2_0}ExtensionType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PointDestination", propOrder = {
    "point",
    "pointDestinationExtension"
})
public class PointDestination
    extends Destination
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(required = true)
    protected Point point;
    protected ExtensionType pointDestinationExtension;

    /**
     * Obtient la valeur de la propriété point.
     * 
     * @return
     *     possible object is
     *     {@link Point }
     *     
     */
    public Point getPoint() {
        return point;
    }

    /**
     * Définit la valeur de la propriété point.
     * 
     * @param value
     *     allowed object is
     *     {@link Point }
     *     
     */
    public void setPoint(Point value) {
        this.point = value;
    }

    public boolean isSetPoint() {
        return (this.point!= null);
    }

    /**
     * Obtient la valeur de la propriété pointDestinationExtension.
     * 
     * @return
     *     possible object is
     *     {@link ExtensionType }
     *     
     */
    public ExtensionType getPointDestinationExtension() {
        return pointDestinationExtension;
    }

    /**
     * Définit la valeur de la propriété pointDestinationExtension.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtensionType }
     *     
     */
    public void setPointDestinationExtension(ExtensionType value) {
        this.pointDestinationExtension = value;
    }

    public boolean isSetPointDestinationExtension() {
        return (this.pointDestinationExtension!= null);
    }

}
