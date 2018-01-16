
package uk.org.siri.siri;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Type for Revocation of a previous message.
 * 
 * <p>Classe Java pour InfoMessageCancellationStructure complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="InfoMessageCancellationStructure">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.siri.org.uk/siri}AbstractReferencingItemStructure">
 *       &lt;sequence>
 *         &lt;element name="InfoMessageIdentifier" type="{http://www.siri.org.uk/siri}InfoMessageRefStructure"/>
 *         &lt;element name="InfoChannelRef" type="{http://www.siri.org.uk/siri}InfoChannelRefStructure" minOccurs="0"/>
 *         &lt;element ref="{http://www.siri.org.uk/siri}Extensions" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InfoMessageCancellationStructure", propOrder = {
    "infoMessageIdentifier",
    "infoChannelRef",
    "extensions"
})
public class InfoMessageCancellationStructure
    extends AbstractReferencingItemStructure
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "InfoMessageIdentifier", required = true)
    protected InfoMessageRefStructure infoMessageIdentifier;
    @XmlElement(name = "InfoChannelRef")
    protected InfoChannelRefStructure infoChannelRef;
    @XmlElement(name = "Extensions")
    protected ExtensionsStructure extensions;

    /**
     * Obtient la valeur de la propriété infoMessageIdentifier.
     * 
     * @return
     *     possible object is
     *     {@link InfoMessageRefStructure }
     *     
     */
    public InfoMessageRefStructure getInfoMessageIdentifier() {
        return infoMessageIdentifier;
    }

    /**
     * Définit la valeur de la propriété infoMessageIdentifier.
     * 
     * @param value
     *     allowed object is
     *     {@link InfoMessageRefStructure }
     *     
     */
    public void setInfoMessageIdentifier(InfoMessageRefStructure value) {
        this.infoMessageIdentifier = value;
    }

    public boolean isSetInfoMessageIdentifier() {
        return (this.infoMessageIdentifier!= null);
    }

    /**
     * Obtient la valeur de la propriété infoChannelRef.
     * 
     * @return
     *     possible object is
     *     {@link InfoChannelRefStructure }
     *     
     */
    public InfoChannelRefStructure getInfoChannelRef() {
        return infoChannelRef;
    }

    /**
     * Définit la valeur de la propriété infoChannelRef.
     * 
     * @param value
     *     allowed object is
     *     {@link InfoChannelRefStructure }
     *     
     */
    public void setInfoChannelRef(InfoChannelRefStructure value) {
        this.infoChannelRef = value;
    }

    public boolean isSetInfoChannelRef() {
        return (this.infoChannelRef!= null);
    }

    /**
     * Obtient la valeur de la propriété extensions.
     * 
     * @return
     *     possible object is
     *     {@link ExtensionsStructure }
     *     
     */
    public ExtensionsStructure getExtensions() {
        return extensions;
    }

    /**
     * Définit la valeur de la propriété extensions.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtensionsStructure }
     *     
     */
    public void setExtensions(ExtensionsStructure value) {
        this.extensions = value;
    }

    public boolean isSetExtensions() {
        return (this.extensions!= null);
    }

}
