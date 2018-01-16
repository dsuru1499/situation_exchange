
package eu.datex2.schema._2_0rc1._2_0;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour TpegJunctionPointDescriptor complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="TpegJunctionPointDescriptor">
 *   &lt;complexContent>
 *     &lt;extension base="{http://datex2.eu/schema/2_0RC1/2_0}TpegPointDescriptor">
 *       &lt;sequence>
 *         &lt;element name="tpegJunctionPointDescriptorType" type="{http://datex2.eu/schema/2_0RC1/2_0}TpegLoc03JunctionPointDescriptorSubtypeEnum"/>
 *         &lt;element name="tpegJunctionPointDescriptorExtension" type="{http://datex2.eu/schema/2_0RC1/2_0}ExtensionType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TpegJunctionPointDescriptor", propOrder = {
    "tpegJunctionPointDescriptorType",
    "tpegJunctionPointDescriptorExtension"
})
public class TpegJunctionPointDescriptor
    extends TpegPointDescriptor
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(required = true)
    protected TpegLoc03JunctionPointDescriptorSubtypeEnum tpegJunctionPointDescriptorType;
    protected ExtensionType tpegJunctionPointDescriptorExtension;

    /**
     * Obtient la valeur de la propriété tpegJunctionPointDescriptorType.
     * 
     * @return
     *     possible object is
     *     {@link TpegLoc03JunctionPointDescriptorSubtypeEnum }
     *     
     */
    public TpegLoc03JunctionPointDescriptorSubtypeEnum getTpegJunctionPointDescriptorType() {
        return tpegJunctionPointDescriptorType;
    }

    /**
     * Définit la valeur de la propriété tpegJunctionPointDescriptorType.
     * 
     * @param value
     *     allowed object is
     *     {@link TpegLoc03JunctionPointDescriptorSubtypeEnum }
     *     
     */
    public void setTpegJunctionPointDescriptorType(TpegLoc03JunctionPointDescriptorSubtypeEnum value) {
        this.tpegJunctionPointDescriptorType = value;
    }

    public boolean isSetTpegJunctionPointDescriptorType() {
        return (this.tpegJunctionPointDescriptorType!= null);
    }

    /**
     * Obtient la valeur de la propriété tpegJunctionPointDescriptorExtension.
     * 
     * @return
     *     possible object is
     *     {@link ExtensionType }
     *     
     */
    public ExtensionType getTpegJunctionPointDescriptorExtension() {
        return tpegJunctionPointDescriptorExtension;
    }

    /**
     * Définit la valeur de la propriété tpegJunctionPointDescriptorExtension.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtensionType }
     *     
     */
    public void setTpegJunctionPointDescriptorExtension(ExtensionType value) {
        this.tpegJunctionPointDescriptorExtension = value;
    }

    public boolean isSetTpegJunctionPointDescriptorExtension() {
        return (this.tpegJunctionPointDescriptorExtension!= null);
    }

}
