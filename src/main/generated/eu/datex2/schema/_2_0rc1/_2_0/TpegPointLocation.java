
package eu.datex2.schema._2_0rc1._2_0;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour TpegPointLocation complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="TpegPointLocation">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="tpegDirection" type="{http://datex2.eu/schema/2_0RC1/2_0}TpegLoc02DirectionTypeEnum"/>
 *         &lt;element name="tpegPointLocationExtension" type="{http://datex2.eu/schema/2_0RC1/2_0}ExtensionType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TpegPointLocation", propOrder = {
    "tpegDirection",
    "tpegPointLocationExtension"
})
@XmlSeeAlso({
    TpegSimplePoint.class,
    TpegFramedPoint.class
})
public abstract class TpegPointLocation
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(required = true)
    protected TpegLoc02DirectionTypeEnum tpegDirection;
    protected ExtensionType tpegPointLocationExtension;

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
     * Obtient la valeur de la propriété tpegPointLocationExtension.
     * 
     * @return
     *     possible object is
     *     {@link ExtensionType }
     *     
     */
    public ExtensionType getTpegPointLocationExtension() {
        return tpegPointLocationExtension;
    }

    /**
     * Définit la valeur de la propriété tpegPointLocationExtension.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtensionType }
     *     
     */
    public void setTpegPointLocationExtension(ExtensionType value) {
        this.tpegPointLocationExtension = value;
    }

    public boolean isSetTpegPointLocationExtension() {
        return (this.tpegPointLocationExtension!= null);
    }

}
