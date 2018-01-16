
package eu.datex2.schema._2_0rc1._2_0;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour TpegAreaDescriptor complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="TpegAreaDescriptor">
 *   &lt;complexContent>
 *     &lt;extension base="{http://datex2.eu/schema/2_0RC1/2_0}TpegDescriptor">
 *       &lt;sequence>
 *         &lt;element name="tpegAreaDescriptorType" type="{http://datex2.eu/schema/2_0RC1/2_0}TpegLoc03AreaDescriptorSubtypeEnum"/>
 *         &lt;element name="tpegAreaDescriptorExtension" type="{http://datex2.eu/schema/2_0RC1/2_0}ExtensionType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TpegAreaDescriptor", propOrder = {
    "tpegAreaDescriptorType",
    "tpegAreaDescriptorExtension"
})
public class TpegAreaDescriptor
    extends TpegDescriptor
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(required = true)
    protected TpegLoc03AreaDescriptorSubtypeEnum tpegAreaDescriptorType;
    protected ExtensionType tpegAreaDescriptorExtension;

    /**
     * Obtient la valeur de la propriété tpegAreaDescriptorType.
     * 
     * @return
     *     possible object is
     *     {@link TpegLoc03AreaDescriptorSubtypeEnum }
     *     
     */
    public TpegLoc03AreaDescriptorSubtypeEnum getTpegAreaDescriptorType() {
        return tpegAreaDescriptorType;
    }

    /**
     * Définit la valeur de la propriété tpegAreaDescriptorType.
     * 
     * @param value
     *     allowed object is
     *     {@link TpegLoc03AreaDescriptorSubtypeEnum }
     *     
     */
    public void setTpegAreaDescriptorType(TpegLoc03AreaDescriptorSubtypeEnum value) {
        this.tpegAreaDescriptorType = value;
    }

    public boolean isSetTpegAreaDescriptorType() {
        return (this.tpegAreaDescriptorType!= null);
    }

    /**
     * Obtient la valeur de la propriété tpegAreaDescriptorExtension.
     * 
     * @return
     *     possible object is
     *     {@link ExtensionType }
     *     
     */
    public ExtensionType getTpegAreaDescriptorExtension() {
        return tpegAreaDescriptorExtension;
    }

    /**
     * Définit la valeur de la propriété tpegAreaDescriptorExtension.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtensionType }
     *     
     */
    public void setTpegAreaDescriptorExtension(ExtensionType value) {
        this.tpegAreaDescriptorExtension = value;
    }

    public boolean isSetTpegAreaDescriptorExtension() {
        return (this.tpegAreaDescriptorExtension!= null);
    }

}
