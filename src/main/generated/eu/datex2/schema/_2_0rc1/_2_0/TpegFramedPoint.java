
package eu.datex2.schema._2_0rc1._2_0;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour TpegFramedPoint complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="TpegFramedPoint">
 *   &lt;complexContent>
 *     &lt;extension base="{http://datex2.eu/schema/2_0RC1/2_0}TpegPointLocation">
 *       &lt;sequence>
 *         &lt;element name="tpegFramedPointLocationType" type="{http://datex2.eu/schema/2_0RC1/2_0}TpegLoc01FramedPointLocationSubtypeEnum"/>
 *         &lt;element name="framedPoint" type="{http://datex2.eu/schema/2_0RC1/2_0}TpegNonJunctionPoint"/>
 *         &lt;element name="to" type="{http://datex2.eu/schema/2_0RC1/2_0}TpegPoint"/>
 *         &lt;element name="from" type="{http://datex2.eu/schema/2_0RC1/2_0}TpegPoint"/>
 *         &lt;element name="tpegFramedPointExtension" type="{http://datex2.eu/schema/2_0RC1/2_0}ExtensionType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TpegFramedPoint", propOrder = {
    "tpegFramedPointLocationType",
    "framedPoint",
    "to",
    "from",
    "tpegFramedPointExtension"
})
public class TpegFramedPoint
    extends TpegPointLocation
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(required = true)
    protected TpegLoc01FramedPointLocationSubtypeEnum tpegFramedPointLocationType;
    @XmlElement(required = true)
    protected TpegNonJunctionPoint framedPoint;
    @XmlElement(required = true)
    protected TpegPoint to;
    @XmlElement(required = true)
    protected TpegPoint from;
    protected ExtensionType tpegFramedPointExtension;

    /**
     * Obtient la valeur de la propriété tpegFramedPointLocationType.
     * 
     * @return
     *     possible object is
     *     {@link TpegLoc01FramedPointLocationSubtypeEnum }
     *     
     */
    public TpegLoc01FramedPointLocationSubtypeEnum getTpegFramedPointLocationType() {
        return tpegFramedPointLocationType;
    }

    /**
     * Définit la valeur de la propriété tpegFramedPointLocationType.
     * 
     * @param value
     *     allowed object is
     *     {@link TpegLoc01FramedPointLocationSubtypeEnum }
     *     
     */
    public void setTpegFramedPointLocationType(TpegLoc01FramedPointLocationSubtypeEnum value) {
        this.tpegFramedPointLocationType = value;
    }

    public boolean isSetTpegFramedPointLocationType() {
        return (this.tpegFramedPointLocationType!= null);
    }

    /**
     * Obtient la valeur de la propriété framedPoint.
     * 
     * @return
     *     possible object is
     *     {@link TpegNonJunctionPoint }
     *     
     */
    public TpegNonJunctionPoint getFramedPoint() {
        return framedPoint;
    }

    /**
     * Définit la valeur de la propriété framedPoint.
     * 
     * @param value
     *     allowed object is
     *     {@link TpegNonJunctionPoint }
     *     
     */
    public void setFramedPoint(TpegNonJunctionPoint value) {
        this.framedPoint = value;
    }

    public boolean isSetFramedPoint() {
        return (this.framedPoint!= null);
    }

    /**
     * Obtient la valeur de la propriété to.
     * 
     * @return
     *     possible object is
     *     {@link TpegPoint }
     *     
     */
    public TpegPoint getTo() {
        return to;
    }

    /**
     * Définit la valeur de la propriété to.
     * 
     * @param value
     *     allowed object is
     *     {@link TpegPoint }
     *     
     */
    public void setTo(TpegPoint value) {
        this.to = value;
    }

    public boolean isSetTo() {
        return (this.to!= null);
    }

    /**
     * Obtient la valeur de la propriété from.
     * 
     * @return
     *     possible object is
     *     {@link TpegPoint }
     *     
     */
    public TpegPoint getFrom() {
        return from;
    }

    /**
     * Définit la valeur de la propriété from.
     * 
     * @param value
     *     allowed object is
     *     {@link TpegPoint }
     *     
     */
    public void setFrom(TpegPoint value) {
        this.from = value;
    }

    public boolean isSetFrom() {
        return (this.from!= null);
    }

    /**
     * Obtient la valeur de la propriété tpegFramedPointExtension.
     * 
     * @return
     *     possible object is
     *     {@link ExtensionType }
     *     
     */
    public ExtensionType getTpegFramedPointExtension() {
        return tpegFramedPointExtension;
    }

    /**
     * Définit la valeur de la propriété tpegFramedPointExtension.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtensionType }
     *     
     */
    public void setTpegFramedPointExtension(ExtensionType value) {
        this.tpegFramedPointExtension = value;
    }

    public boolean isSetTpegFramedPointExtension() {
        return (this.tpegFramedPointExtension!= null);
    }

}
