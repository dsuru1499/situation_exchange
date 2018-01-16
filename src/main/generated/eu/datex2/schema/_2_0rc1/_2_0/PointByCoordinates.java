
package eu.datex2.schema._2_0rc1._2_0;

import java.io.Serializable;
import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour PointByCoordinates complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="PointByCoordinates">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="bearing" type="{http://datex2.eu/schema/2_0RC1/2_0}NonNegativeInteger" minOccurs="0"/>
 *         &lt;element name="pointCoordinates" type="{http://datex2.eu/schema/2_0RC1/2_0}PointCoordinates"/>
 *         &lt;element name="pointByCoordinatesExtension" type="{http://datex2.eu/schema/2_0RC1/2_0}ExtensionType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PointByCoordinates", propOrder = {
    "bearing",
    "pointCoordinates",
    "pointByCoordinatesExtension"
})
public class PointByCoordinates
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    protected BigInteger bearing;
    @XmlElement(required = true)
    protected PointCoordinates pointCoordinates;
    protected ExtensionType pointByCoordinatesExtension;

    /**
     * Obtient la valeur de la propriété bearing.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getBearing() {
        return bearing;
    }

    /**
     * Définit la valeur de la propriété bearing.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setBearing(BigInteger value) {
        this.bearing = value;
    }

    public boolean isSetBearing() {
        return (this.bearing!= null);
    }

    /**
     * Obtient la valeur de la propriété pointCoordinates.
     * 
     * @return
     *     possible object is
     *     {@link PointCoordinates }
     *     
     */
    public PointCoordinates getPointCoordinates() {
        return pointCoordinates;
    }

    /**
     * Définit la valeur de la propriété pointCoordinates.
     * 
     * @param value
     *     allowed object is
     *     {@link PointCoordinates }
     *     
     */
    public void setPointCoordinates(PointCoordinates value) {
        this.pointCoordinates = value;
    }

    public boolean isSetPointCoordinates() {
        return (this.pointCoordinates!= null);
    }

    /**
     * Obtient la valeur de la propriété pointByCoordinatesExtension.
     * 
     * @return
     *     possible object is
     *     {@link ExtensionType }
     *     
     */
    public ExtensionType getPointByCoordinatesExtension() {
        return pointByCoordinatesExtension;
    }

    /**
     * Définit la valeur de la propriété pointByCoordinatesExtension.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtensionType }
     *     
     */
    public void setPointByCoordinatesExtension(ExtensionType value) {
        this.pointByCoordinatesExtension = value;
    }

    public boolean isSetPointByCoordinatesExtension() {
        return (this.pointByCoordinatesExtension!= null);
    }

}
