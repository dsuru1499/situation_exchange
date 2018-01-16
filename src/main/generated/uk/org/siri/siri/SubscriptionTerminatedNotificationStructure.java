
package uk.org.siri.siri;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElements;
import javax.xml.bind.annotation.XmlType;


/**
 * Type for Notification to terminate a subscription or subscriptions.
 * 
 * <p>Classe Java pour SubscriptionTerminatedNotificationStructure complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="SubscriptionTerminatedNotificationStructure">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.siri.org.uk/siri}ProducerResponseStructure">
 *       &lt;sequence>
 *         &lt;group ref="{http://www.siri.org.uk/siri}SubscriptionIdentifierResourcePropertyGroup" maxOccurs="unbounded"/>
 *         &lt;element name="ErrrorCondition" type="{http://www.siri.org.uk/siri}ErrorConditionStructure" minOccurs="0"/>
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
@XmlType(name = "SubscriptionTerminatedNotificationStructure", propOrder = {
    "subscriptionIdentifierResourcePropertyGroup",
    "errrorCondition",
    "extensions"
})
public class SubscriptionTerminatedNotificationStructure
    extends ProducerResponseStructure
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElements({
        @XmlElement(name = "SubscriberRef", required = true, type = ParticipantRefStructure.class),
        @XmlElement(name = "SubscriptionFilterRef", required = true, type = SubscriptionFilterRefStructure.class),
        @XmlElement(name = "SubscriptionRef", required = true, type = SubscriptionQualifierStructure.class)
    })
    protected List<Serializable> subscriptionIdentifierResourcePropertyGroup;
    @XmlElement(name = "ErrrorCondition")
    protected ErrorConditionStructure errrorCondition;
    @XmlElement(name = "Extensions")
    protected ExtensionsStructure extensions;

    /**
     * Gets the value of the subscriptionIdentifierResourcePropertyGroup property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the subscriptionIdentifierResourcePropertyGroup property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSubscriptionIdentifierResourcePropertyGroup().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ParticipantRefStructure }
     * {@link SubscriptionFilterRefStructure }
     * {@link SubscriptionQualifierStructure }
     * 
     * 
     */
    public List<Serializable> getSubscriptionIdentifierResourcePropertyGroup() {
        if (subscriptionIdentifierResourcePropertyGroup == null) {
            subscriptionIdentifierResourcePropertyGroup = new ArrayList<Serializable>();
        }
        return this.subscriptionIdentifierResourcePropertyGroup;
    }

    public boolean isSetSubscriptionIdentifierResourcePropertyGroup() {
        return ((this.subscriptionIdentifierResourcePropertyGroup!= null)&&(!this.subscriptionIdentifierResourcePropertyGroup.isEmpty()));
    }

    public void unsetSubscriptionIdentifierResourcePropertyGroup() {
        this.subscriptionIdentifierResourcePropertyGroup = null;
    }

    /**
     * Obtient la valeur de la propriété errrorCondition.
     * 
     * @return
     *     possible object is
     *     {@link ErrorConditionStructure }
     *     
     */
    public ErrorConditionStructure getErrrorCondition() {
        return errrorCondition;
    }

    /**
     * Définit la valeur de la propriété errrorCondition.
     * 
     * @param value
     *     allowed object is
     *     {@link ErrorConditionStructure }
     *     
     */
    public void setErrrorCondition(ErrorConditionStructure value) {
        this.errrorCondition = value;
    }

    public boolean isSetErrrorCondition() {
        return (this.errrorCondition!= null);
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
