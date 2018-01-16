
package eu.datex2.schema._2_0rc1._2_0;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour TpegAreaLocation complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="TpegAreaLocation">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="tpegAreaLocationType" type="{http://datex2.eu/schema/2_0RC1/2_0}TpegLoc01AreaLocationSubtypeEnum"/>
 *         &lt;element name="tpegHeight" type="{http://datex2.eu/schema/2_0RC1/2_0}TpegHeight" minOccurs="0"/>
 *         &lt;element name="tpegAreaLocationExtension" type="{http://datex2.eu/schema/2_0RC1/2_0}ExtensionType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TpegAreaLocation", propOrder = {
    "tpegAreaLocationType",
    "tpegHeight",
    "tpegAreaLocationExtension"
})
@XmlSeeAlso({
    TpegNamedOnlyArea.class,
    TpegGeometricArea.class
})
public abstract class TpegAreaLocation
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(required = true)
    protected TpegLoc01AreaLocationSubtypeEnum tpegAreaLocationType;
    protected TpegHeight tpegHeight;
    protected ExtensionType tpegAreaLocationExtension;

    /**
     * Obtient la valeur de la propriété tpegAreaLocationType.
     * 
     * @return
     *     possible object is
     *     {@link TpegLoc01AreaLocationSubtypeEnum }
     *     
     */
    public TpegLoc01AreaLocationSubtypeEnum getTpegAreaLocationType() {
        return tpegAreaLocationType;
    }

    /**
     * Définit la valeur de la propriété tpegAreaLocationType.
     * 
     * @param value
     *     allowed object is
     *     {@link TpegLoc01AreaLocationSubtypeEnum }
     *     
     */
    public void setTpegAreaLocationType(TpegLoc01AreaLocationSubtypeEnum value) {
        this.tpegAreaLocationType = value;
    }

    public boolean isSetTpegAreaLocationType() {
        return (this.tpegAreaLocationType!= null);
    }

    /**
     * Obtient la valeur de la propriété tpegHeight.
     * 
     * @return
     *     possible object is
     *     {@link TpegHeight }
     *     
     */
    public TpegHeight getTpegHeight() {
        return tpegHeight;
    }

    /**
     * Définit la valeur de la propriété tpegHeight.
     * 
     * @param value
     *     allowed object is
     *     {@link TpegHeight }
     *     
     */
    public void setTpegHeight(TpegHeight value) {
        this.tpegHeight = value;
    }

    public boolean isSetTpegHeight() {
        return (this.tpegHeight!= null);
    }

    /**
     * Obtient la valeur de la propriété tpegAreaLocationExtension.
     * 
     * @return
     *     possible object is
     *     {@link ExtensionType }
     *     
     */
    public ExtensionType getTpegAreaLocationExtension() {
        return tpegAreaLocationExtension;
    }

    /**
     * Définit la valeur de la propriété tpegAreaLocationExtension.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtensionType }
     *     
     */
    public void setTpegAreaLocationExtension(ExtensionType value) {
        this.tpegAreaLocationExtension = value;
    }

    public boolean isSetTpegAreaLocationExtension() {
        return (this.tpegAreaLocationExtension!= null);
    }

}
