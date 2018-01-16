
package eu.datex2.schema._2_0rc1._2_0;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour TpegPoint complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="TpegPoint">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="tpegPointExtension" type="{http://datex2.eu/schema/2_0RC1/2_0}ExtensionType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TpegPoint", propOrder = {
    "tpegPointExtension"
})
@XmlSeeAlso({
    TpegJunction.class,
    TpegNonJunctionPoint.class
})
public abstract class TpegPoint
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    protected ExtensionType tpegPointExtension;

    /**
     * Obtient la valeur de la propriété tpegPointExtension.
     * 
     * @return
     *     possible object is
     *     {@link ExtensionType }
     *     
     */
    public ExtensionType getTpegPointExtension() {
        return tpegPointExtension;
    }

    /**
     * Définit la valeur de la propriété tpegPointExtension.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtensionType }
     *     
     */
    public void setTpegPointExtension(ExtensionType value) {
        this.tpegPointExtension = value;
    }

    public boolean isSetTpegPointExtension() {
        return (this.tpegPointExtension!= null);
    }

}
