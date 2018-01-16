
package eu.datex2.schema._2_0rc1._2_0;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour TpegDescriptor complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="TpegDescriptor">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="descriptor" type="{http://datex2.eu/schema/2_0RC1/2_0}MultilingualString"/>
 *         &lt;element name="tpegDescriptorExtension" type="{http://datex2.eu/schema/2_0RC1/2_0}ExtensionType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TpegDescriptor", propOrder = {
    "descriptor",
    "tpegDescriptorExtension"
})
@XmlSeeAlso({
    TpegAreaDescriptor.class,
    TpegPointDescriptor.class
})
public abstract class TpegDescriptor
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(required = true)
    protected MultilingualString descriptor;
    protected ExtensionType tpegDescriptorExtension;

    /**
     * Obtient la valeur de la propriété descriptor.
     * 
     * @return
     *     possible object is
     *     {@link MultilingualString }
     *     
     */
    public MultilingualString getDescriptor() {
        return descriptor;
    }

    /**
     * Définit la valeur de la propriété descriptor.
     * 
     * @param value
     *     allowed object is
     *     {@link MultilingualString }
     *     
     */
    public void setDescriptor(MultilingualString value) {
        this.descriptor = value;
    }

    public boolean isSetDescriptor() {
        return (this.descriptor!= null);
    }

    /**
     * Obtient la valeur de la propriété tpegDescriptorExtension.
     * 
     * @return
     *     possible object is
     *     {@link ExtensionType }
     *     
     */
    public ExtensionType getTpegDescriptorExtension() {
        return tpegDescriptorExtension;
    }

    /**
     * Définit la valeur de la propriété tpegDescriptorExtension.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtensionType }
     *     
     */
    public void setTpegDescriptorExtension(ExtensionType value) {
        this.tpegDescriptorExtension = value;
    }

    public boolean isSetTpegDescriptorExtension() {
        return (this.tpegDescriptorExtension!= null);
    }

}
