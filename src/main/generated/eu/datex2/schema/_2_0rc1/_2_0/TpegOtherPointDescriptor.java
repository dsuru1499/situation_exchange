
package eu.datex2.schema._2_0rc1._2_0;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour TpegOtherPointDescriptor complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="TpegOtherPointDescriptor">
 *   &lt;complexContent>
 *     &lt;extension base="{http://datex2.eu/schema/2_0RC1/2_0}TpegPointDescriptor">
 *       &lt;sequence>
 *         &lt;element name="tpegOtherPointDescriptorType" type="{http://datex2.eu/schema/2_0RC1/2_0}TpegLoc03OtherPointDescriptorSubtypeEnum"/>
 *         &lt;element name="tpegOtherPointDescriptorExtension" type="{http://datex2.eu/schema/2_0RC1/2_0}ExtensionType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TpegOtherPointDescriptor", propOrder = {
    "tpegOtherPointDescriptorType",
    "tpegOtherPointDescriptorExtension"
})
public class TpegOtherPointDescriptor
    extends TpegPointDescriptor
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(required = true)
    protected TpegLoc03OtherPointDescriptorSubtypeEnum tpegOtherPointDescriptorType;
    protected ExtensionType tpegOtherPointDescriptorExtension;

    /**
     * Obtient la valeur de la propriété tpegOtherPointDescriptorType.
     * 
     * @return
     *     possible object is
     *     {@link TpegLoc03OtherPointDescriptorSubtypeEnum }
     *     
     */
    public TpegLoc03OtherPointDescriptorSubtypeEnum getTpegOtherPointDescriptorType() {
        return tpegOtherPointDescriptorType;
    }

    /**
     * Définit la valeur de la propriété tpegOtherPointDescriptorType.
     * 
     * @param value
     *     allowed object is
     *     {@link TpegLoc03OtherPointDescriptorSubtypeEnum }
     *     
     */
    public void setTpegOtherPointDescriptorType(TpegLoc03OtherPointDescriptorSubtypeEnum value) {
        this.tpegOtherPointDescriptorType = value;
    }

    public boolean isSetTpegOtherPointDescriptorType() {
        return (this.tpegOtherPointDescriptorType!= null);
    }

    /**
     * Obtient la valeur de la propriété tpegOtherPointDescriptorExtension.
     * 
     * @return
     *     possible object is
     *     {@link ExtensionType }
     *     
     */
    public ExtensionType getTpegOtherPointDescriptorExtension() {
        return tpegOtherPointDescriptorExtension;
    }

    /**
     * Définit la valeur de la propriété tpegOtherPointDescriptorExtension.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtensionType }
     *     
     */
    public void setTpegOtherPointDescriptorExtension(ExtensionType value) {
        this.tpegOtherPointDescriptorExtension = value;
    }

    public boolean isSetTpegOtherPointDescriptorExtension() {
        return (this.tpegOtherPointDescriptorExtension!= null);
    }

}
