
package eu.datex2.schema._2_0rc1._2_0;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour TpegIlcPointDescriptor complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="TpegIlcPointDescriptor">
 *   &lt;complexContent>
 *     &lt;extension base="{http://datex2.eu/schema/2_0RC1/2_0}TpegPointDescriptor">
 *       &lt;sequence>
 *         &lt;element name="tpegIlcPointDescriptorType" type="{http://datex2.eu/schema/2_0RC1/2_0}TpegLoc03IlcPointDescriptorSubtypeEnum"/>
 *         &lt;element name="tpegIlcPointDescriptorExtension" type="{http://datex2.eu/schema/2_0RC1/2_0}ExtensionType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TpegIlcPointDescriptor", propOrder = {
    "tpegIlcPointDescriptorType",
    "tpegIlcPointDescriptorExtension"
})
public class TpegIlcPointDescriptor
    extends TpegPointDescriptor
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(required = true)
    protected TpegLoc03IlcPointDescriptorSubtypeEnum tpegIlcPointDescriptorType;
    protected ExtensionType tpegIlcPointDescriptorExtension;

    /**
     * Obtient la valeur de la propriété tpegIlcPointDescriptorType.
     * 
     * @return
     *     possible object is
     *     {@link TpegLoc03IlcPointDescriptorSubtypeEnum }
     *     
     */
    public TpegLoc03IlcPointDescriptorSubtypeEnum getTpegIlcPointDescriptorType() {
        return tpegIlcPointDescriptorType;
    }

    /**
     * Définit la valeur de la propriété tpegIlcPointDescriptorType.
     * 
     * @param value
     *     allowed object is
     *     {@link TpegLoc03IlcPointDescriptorSubtypeEnum }
     *     
     */
    public void setTpegIlcPointDescriptorType(TpegLoc03IlcPointDescriptorSubtypeEnum value) {
        this.tpegIlcPointDescriptorType = value;
    }

    public boolean isSetTpegIlcPointDescriptorType() {
        return (this.tpegIlcPointDescriptorType!= null);
    }

    /**
     * Obtient la valeur de la propriété tpegIlcPointDescriptorExtension.
     * 
     * @return
     *     possible object is
     *     {@link ExtensionType }
     *     
     */
    public ExtensionType getTpegIlcPointDescriptorExtension() {
        return tpegIlcPointDescriptorExtension;
    }

    /**
     * Définit la valeur de la propriété tpegIlcPointDescriptorExtension.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtensionType }
     *     
     */
    public void setTpegIlcPointDescriptorExtension(ExtensionType value) {
        this.tpegIlcPointDescriptorExtension = value;
    }

    public boolean isSetTpegIlcPointDescriptorExtension() {
        return (this.tpegIlcPointDescriptorExtension!= null);
    }

}
