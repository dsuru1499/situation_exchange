
package eu.datex2.schema._2_0rc1._2_0;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour TpegLinearLocation complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="TpegLinearLocation">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="tpegDirection" type="{http://datex2.eu/schema/2_0RC1/2_0}TpegLoc02DirectionTypeEnum"/>
 *         &lt;element name="tpegLinearLocationType" type="{http://datex2.eu/schema/2_0RC1/2_0}TpegLoc01LinearLocationSubtypeEnum"/>
 *         &lt;element name="to" type="{http://datex2.eu/schema/2_0RC1/2_0}TpegPoint"/>
 *         &lt;element name="from" type="{http://datex2.eu/schema/2_0RC1/2_0}TpegPoint"/>
 *         &lt;element name="tpegLinearLocationExtension" type="{http://datex2.eu/schema/2_0RC1/2_0}ExtensionType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TpegLinearLocation", propOrder = {
    "tpegDirection",
    "tpegLinearLocationType",
    "to",
    "from",
    "tpegLinearLocationExtension"
})
public class TpegLinearLocation
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(required = true)
    protected TpegLoc02DirectionTypeEnum tpegDirection;
    @XmlElement(required = true)
    protected TpegLoc01LinearLocationSubtypeEnum tpegLinearLocationType;
    @XmlElement(required = true)
    protected TpegPoint to;
    @XmlElement(required = true)
    protected TpegPoint from;
    protected ExtensionType tpegLinearLocationExtension;

    /**
     * Obtient la valeur de la propriété tpegDirection.
     * 
     * @return
     *     possible object is
     *     {@link TpegLoc02DirectionTypeEnum }
     *     
     */
    public TpegLoc02DirectionTypeEnum getTpegDirection() {
        return tpegDirection;
    }

    /**
     * Définit la valeur de la propriété tpegDirection.
     * 
     * @param value
     *     allowed object is
     *     {@link TpegLoc02DirectionTypeEnum }
     *     
     */
    public void setTpegDirection(TpegLoc02DirectionTypeEnum value) {
        this.tpegDirection = value;
    }

    public boolean isSetTpegDirection() {
        return (this.tpegDirection!= null);
    }

    /**
     * Obtient la valeur de la propriété tpegLinearLocationType.
     * 
     * @return
     *     possible object is
     *     {@link TpegLoc01LinearLocationSubtypeEnum }
     *     
     */
    public TpegLoc01LinearLocationSubtypeEnum getTpegLinearLocationType() {
        return tpegLinearLocationType;
    }

    /**
     * Définit la valeur de la propriété tpegLinearLocationType.
     * 
     * @param value
     *     allowed object is
     *     {@link TpegLoc01LinearLocationSubtypeEnum }
     *     
     */
    public void setTpegLinearLocationType(TpegLoc01LinearLocationSubtypeEnum value) {
        this.tpegLinearLocationType = value;
    }

    public boolean isSetTpegLinearLocationType() {
        return (this.tpegLinearLocationType!= null);
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
     * Obtient la valeur de la propriété tpegLinearLocationExtension.
     * 
     * @return
     *     possible object is
     *     {@link ExtensionType }
     *     
     */
    public ExtensionType getTpegLinearLocationExtension() {
        return tpegLinearLocationExtension;
    }

    /**
     * Définit la valeur de la propriété tpegLinearLocationExtension.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtensionType }
     *     
     */
    public void setTpegLinearLocationExtension(ExtensionType value) {
        this.tpegLinearLocationExtension = value;
    }

    public boolean isSetTpegLinearLocationExtension() {
        return (this.tpegLinearLocationExtension!= null);
    }

}
