
package eu.datex2.schema._2_0rc1._2_0;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour TpegPointDescriptor complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="TpegPointDescriptor">
 *   &lt;complexContent>
 *     &lt;extension base="{http://datex2.eu/schema/2_0RC1/2_0}TpegDescriptor">
 *       &lt;sequence>
 *         &lt;element name="tpegPointDescriptorExtension" type="{http://datex2.eu/schema/2_0RC1/2_0}ExtensionType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TpegPointDescriptor", propOrder = {
    "tpegPointDescriptorExtension"
})
@XmlSeeAlso({
    TpegJunctionPointDescriptor.class,
    TpegOtherPointDescriptor.class,
    TpegIlcPointDescriptor.class
})
public abstract class TpegPointDescriptor
    extends TpegDescriptor
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    protected ExtensionType tpegPointDescriptorExtension;

    /**
     * Obtient la valeur de la propriété tpegPointDescriptorExtension.
     * 
     * @return
     *     possible object is
     *     {@link ExtensionType }
     *     
     */
    public ExtensionType getTpegPointDescriptorExtension() {
        return tpegPointDescriptorExtension;
    }

    /**
     * Définit la valeur de la propriété tpegPointDescriptorExtension.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtensionType }
     *     
     */
    public void setTpegPointDescriptorExtension(ExtensionType value) {
        this.tpegPointDescriptorExtension = value;
    }

    public boolean isSetTpegPointDescriptorExtension() {
        return (this.tpegPointDescriptorExtension!= null);
    }

}
