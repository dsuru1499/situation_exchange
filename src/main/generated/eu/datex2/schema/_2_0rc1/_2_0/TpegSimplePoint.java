
package eu.datex2.schema._2_0rc1._2_0;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour TpegSimplePoint complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="TpegSimplePoint">
 *   &lt;complexContent>
 *     &lt;extension base="{http://datex2.eu/schema/2_0RC1/2_0}TpegPointLocation">
 *       &lt;sequence>
 *         &lt;element name="tpegSimplePointLocationType" type="{http://datex2.eu/schema/2_0RC1/2_0}TpegLoc01SimplePointLocationSubtypeEnum"/>
 *         &lt;element name="point" type="{http://datex2.eu/schema/2_0RC1/2_0}TpegPoint"/>
 *         &lt;element name="tpegSimplePointExtension" type="{http://datex2.eu/schema/2_0RC1/2_0}ExtensionType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TpegSimplePoint", propOrder = {
    "tpegSimplePointLocationType",
    "point",
    "tpegSimplePointExtension"
})
public class TpegSimplePoint
    extends TpegPointLocation
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(required = true)
    protected TpegLoc01SimplePointLocationSubtypeEnum tpegSimplePointLocationType;
    @XmlElement(required = true)
    protected TpegPoint point;
    protected ExtensionType tpegSimplePointExtension;

    /**
     * Obtient la valeur de la propriété tpegSimplePointLocationType.
     * 
     * @return
     *     possible object is
     *     {@link TpegLoc01SimplePointLocationSubtypeEnum }
     *     
     */
    public TpegLoc01SimplePointLocationSubtypeEnum getTpegSimplePointLocationType() {
        return tpegSimplePointLocationType;
    }

    /**
     * Définit la valeur de la propriété tpegSimplePointLocationType.
     * 
     * @param value
     *     allowed object is
     *     {@link TpegLoc01SimplePointLocationSubtypeEnum }
     *     
     */
    public void setTpegSimplePointLocationType(TpegLoc01SimplePointLocationSubtypeEnum value) {
        this.tpegSimplePointLocationType = value;
    }

    public boolean isSetTpegSimplePointLocationType() {
        return (this.tpegSimplePointLocationType!= null);
    }

    /**
     * Obtient la valeur de la propriété point.
     * 
     * @return
     *     possible object is
     *     {@link TpegPoint }
     *     
     */
    public TpegPoint getPoint() {
        return point;
    }

    /**
     * Définit la valeur de la propriété point.
     * 
     * @param value
     *     allowed object is
     *     {@link TpegPoint }
     *     
     */
    public void setPoint(TpegPoint value) {
        this.point = value;
    }

    public boolean isSetPoint() {
        return (this.point!= null);
    }

    /**
     * Obtient la valeur de la propriété tpegSimplePointExtension.
     * 
     * @return
     *     possible object is
     *     {@link ExtensionType }
     *     
     */
    public ExtensionType getTpegSimplePointExtension() {
        return tpegSimplePointExtension;
    }

    /**
     * Définit la valeur de la propriété tpegSimplePointExtension.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtensionType }
     *     
     */
    public void setTpegSimplePointExtension(ExtensionType value) {
        this.tpegSimplePointExtension = value;
    }

    public boolean isSetTpegSimplePointExtension() {
        return (this.tpegSimplePointExtension!= null);
    }

}
