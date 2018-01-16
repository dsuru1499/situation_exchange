
package uk.org.siri.siri;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import uk.org.siri.wsdl.WsSubscriptionRequestInfoStructure;


/**
 * Type for COmmon Subscription Request.
 * 
 * <p>Classe Java pour AbstractSubscriptionRequestStructure complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="AbstractSubscriptionRequestStructure">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.siri.org.uk/siri}RequestStructure">
 *       &lt;sequence>
 *         &lt;group ref="{http://www.siri.org.uk/siri}SubscriberEndpointGroup"/>
 *         &lt;element name="SubscriptionContext" type="{http://www.siri.org.uk/siri}SubscriptionContextStructure" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AbstractSubscriptionRequestStructure", propOrder = {
    "consumerAddress",
    "subscriptionFilterIdentifier",
    "subscriptionContext"
})
@XmlSeeAlso({
    WsSubscriptionRequestInfoStructure.class,
    SubscriptionRequestStructure.class
})
public abstract class AbstractSubscriptionRequestStructure
    extends RequestStructure
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "ConsumerAddress")
    protected String consumerAddress;
    @XmlElement(name = "SubscriptionFilterIdentifier")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NMTOKEN")
    protected String subscriptionFilterIdentifier;
    @XmlElement(name = "SubscriptionContext")
    protected SubscriptionContextStructure subscriptionContext;

    /**
     * Obtient la valeur de la propriété consumerAddress.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getConsumerAddress() {
        return consumerAddress;
    }

    /**
     * Définit la valeur de la propriété consumerAddress.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setConsumerAddress(String value) {
        this.consumerAddress = value;
    }

    public boolean isSetConsumerAddress() {
        return (this.consumerAddress!= null);
    }

    /**
     * Obtient la valeur de la propriété subscriptionFilterIdentifier.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSubscriptionFilterIdentifier() {
        return subscriptionFilterIdentifier;
    }

    /**
     * Définit la valeur de la propriété subscriptionFilterIdentifier.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSubscriptionFilterIdentifier(String value) {
        this.subscriptionFilterIdentifier = value;
    }

    public boolean isSetSubscriptionFilterIdentifier() {
        return (this.subscriptionFilterIdentifier!= null);
    }

    /**
     * Obtient la valeur de la propriété subscriptionContext.
     * 
     * @return
     *     possible object is
     *     {@link SubscriptionContextStructure }
     *     
     */
    public SubscriptionContextStructure getSubscriptionContext() {
        return subscriptionContext;
    }

    /**
     * Définit la valeur de la propriété subscriptionContext.
     * 
     * @param value
     *     allowed object is
     *     {@link SubscriptionContextStructure }
     *     
     */
    public void setSubscriptionContext(SubscriptionContextStructure value) {
        this.subscriptionContext = value;
    }

    public boolean isSetSubscriptionContext() {
        return (this.subscriptionContext!= null);
    }

}
