
package uk.org.siri.siri;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * Delivery for General Message.
 * 
 * <p>Classe Java pour GeneralMessageDeliveryStructure complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="GeneralMessageDeliveryStructure">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.siri.org.uk/siri}AbstractServiceDeliveryStructure">
 *       &lt;sequence>
 *         &lt;group ref="{http://www.siri.org.uk/siri}GeneralMessagePayloadGroup"/>
 *         &lt;element ref="{http://www.siri.org.uk/siri}Extensions" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="version" type="{http://www.siri.org.uk/siri}VersionString" default="2.0" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GeneralMessageDeliveryStructure", propOrder = {
    "generalMessage",
    "generalMessageCancellation",
    "extensions"
})
public class GeneralMessageDeliveryStructure
    extends AbstractServiceDeliveryStructure
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "GeneralMessage")
    protected List<InfoMessageStructure> generalMessage;
    @XmlElement(name = "GeneralMessageCancellation")
    protected List<InfoMessageCancellationStructure> generalMessageCancellation;
    @XmlElement(name = "Extensions")
    protected ExtensionsStructure extensions;
    @XmlAttribute(name = "version")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String version;

    /**
     * Gets the value of the generalMessage property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the generalMessage property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getGeneralMessage().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link InfoMessageStructure }
     * 
     * 
     */
    public List<InfoMessageStructure> getGeneralMessage() {
        if (generalMessage == null) {
            generalMessage = new ArrayList<InfoMessageStructure>();
        }
        return this.generalMessage;
    }

    public boolean isSetGeneralMessage() {
        return ((this.generalMessage!= null)&&(!this.generalMessage.isEmpty()));
    }

    public void unsetGeneralMessage() {
        this.generalMessage = null;
    }

    /**
     * Gets the value of the generalMessageCancellation property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the generalMessageCancellation property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getGeneralMessageCancellation().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link InfoMessageCancellationStructure }
     * 
     * 
     */
    public List<InfoMessageCancellationStructure> getGeneralMessageCancellation() {
        if (generalMessageCancellation == null) {
            generalMessageCancellation = new ArrayList<InfoMessageCancellationStructure>();
        }
        return this.generalMessageCancellation;
    }

    public boolean isSetGeneralMessageCancellation() {
        return ((this.generalMessageCancellation!= null)&&(!this.generalMessageCancellation.isEmpty()));
    }

    public void unsetGeneralMessageCancellation() {
        this.generalMessageCancellation = null;
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

    /**
     * Obtient la valeur de la propriété version.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVersion() {
        if (version == null) {
            return "2.0";
        } else {
            return version;
        }
    }

    /**
     * Définit la valeur de la propriété version.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVersion(String value) {
        this.version = value;
    }

    public boolean isSetVersion() {
        return (this.version!= null);
    }

}
