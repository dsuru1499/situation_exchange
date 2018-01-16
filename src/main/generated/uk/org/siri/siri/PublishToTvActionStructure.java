
package uk.org.siri.siri;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Type for Notify SITUATION to Tv.
 * 
 * <p>Classe Java pour PublishToTvActionStructure complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="PublishToTvActionStructure">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.siri.org.uk/siri}ParameterisedActionStructure">
 *       &lt;sequence>
 *         &lt;element name="Ceefax" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="Teletext" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PublishToTvActionStructure", propOrder = {
    "ceefax",
    "teletext"
})
public class PublishToTvActionStructure
    extends ParameterisedActionStructure
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "Ceefax", defaultValue = "true")
    protected Boolean ceefax;
    @XmlElement(name = "Teletext", defaultValue = "true")
    protected Boolean teletext;

    /**
     * Obtient la valeur de la propriété ceefax.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCeefax() {
        return ceefax;
    }

    /**
     * Définit la valeur de la propriété ceefax.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCeefax(Boolean value) {
        this.ceefax = value;
    }

    public boolean isSetCeefax() {
        return (this.ceefax!= null);
    }

    /**
     * Obtient la valeur de la propriété teletext.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isTeletext() {
        return teletext;
    }

    /**
     * Définit la valeur de la propriété teletext.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setTeletext(Boolean value) {
        this.teletext = value;
    }

    public boolean isSetTeletext() {
        return (this.teletext!= null);
    }

}
