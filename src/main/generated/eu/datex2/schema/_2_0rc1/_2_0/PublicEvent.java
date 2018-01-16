
package eu.datex2.schema._2_0rc1._2_0;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour PublicEvent complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="PublicEvent">
 *   &lt;complexContent>
 *     &lt;extension base="{http://datex2.eu/schema/2_0RC1/2_0}Activity">
 *       &lt;sequence>
 *         &lt;element name="publicEventType" type="{http://datex2.eu/schema/2_0RC1/2_0}PublicEventTypeEnum"/>
 *         &lt;element name="publicEventExtension" type="{http://datex2.eu/schema/2_0RC1/2_0}ExtensionType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PublicEvent", propOrder = {
    "publicEventType",
    "publicEventExtension"
})
public class PublicEvent
    extends Activity
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(required = true)
    protected PublicEventTypeEnum publicEventType;
    protected ExtensionType publicEventExtension;

    /**
     * Obtient la valeur de la propriété publicEventType.
     * 
     * @return
     *     possible object is
     *     {@link PublicEventTypeEnum }
     *     
     */
    public PublicEventTypeEnum getPublicEventType() {
        return publicEventType;
    }

    /**
     * Définit la valeur de la propriété publicEventType.
     * 
     * @param value
     *     allowed object is
     *     {@link PublicEventTypeEnum }
     *     
     */
    public void setPublicEventType(PublicEventTypeEnum value) {
        this.publicEventType = value;
    }

    public boolean isSetPublicEventType() {
        return (this.publicEventType!= null);
    }

    /**
     * Obtient la valeur de la propriété publicEventExtension.
     * 
     * @return
     *     possible object is
     *     {@link ExtensionType }
     *     
     */
    public ExtensionType getPublicEventExtension() {
        return publicEventExtension;
    }

    /**
     * Définit la valeur de la propriété publicEventExtension.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtensionType }
     *     
     */
    public void setPublicEventExtension(ExtensionType value) {
        this.publicEventExtension = value;
    }

    public boolean isSetPublicEventExtension() {
        return (this.publicEventExtension!= null);
    }

}
