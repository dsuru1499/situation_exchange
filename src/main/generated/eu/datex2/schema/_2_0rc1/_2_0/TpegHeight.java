
package eu.datex2.schema._2_0rc1._2_0;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour TpegHeight complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="TpegHeight">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="height" type="{http://datex2.eu/schema/2_0RC1/2_0}MetresAsFloat" minOccurs="0"/>
 *         &lt;element name="heightType" type="{http://datex2.eu/schema/2_0RC1/2_0}TpegLoc04HeightTypeEnum"/>
 *         &lt;element name="tpegHeightExtension" type="{http://datex2.eu/schema/2_0RC1/2_0}ExtensionType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TpegHeight", propOrder = {
    "height",
    "heightType",
    "tpegHeightExtension"
})
public class TpegHeight
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    protected Float height;
    @XmlElement(required = true)
    protected TpegLoc04HeightTypeEnum heightType;
    protected ExtensionType tpegHeightExtension;

    /**
     * Obtient la valeur de la propriété height.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getHeight() {
        return height;
    }

    /**
     * Définit la valeur de la propriété height.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setHeight(Float value) {
        this.height = value;
    }

    public boolean isSetHeight() {
        return (this.height!= null);
    }

    /**
     * Obtient la valeur de la propriété heightType.
     * 
     * @return
     *     possible object is
     *     {@link TpegLoc04HeightTypeEnum }
     *     
     */
    public TpegLoc04HeightTypeEnum getHeightType() {
        return heightType;
    }

    /**
     * Définit la valeur de la propriété heightType.
     * 
     * @param value
     *     allowed object is
     *     {@link TpegLoc04HeightTypeEnum }
     *     
     */
    public void setHeightType(TpegLoc04HeightTypeEnum value) {
        this.heightType = value;
    }

    public boolean isSetHeightType() {
        return (this.heightType!= null);
    }

    /**
     * Obtient la valeur de la propriété tpegHeightExtension.
     * 
     * @return
     *     possible object is
     *     {@link ExtensionType }
     *     
     */
    public ExtensionType getTpegHeightExtension() {
        return tpegHeightExtension;
    }

    /**
     * Définit la valeur de la propriété tpegHeightExtension.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtensionType }
     *     
     */
    public void setTpegHeightExtension(ExtensionType value) {
        this.tpegHeightExtension = value;
    }

    public boolean isSetTpegHeightExtension() {
        return (this.tpegHeightExtension!= null);
    }

}
