
package uk.org.siri.siri;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Type for Error: Subscription not found.
 * 
 * <p>Classe Java pour UnknownSubscriptionErrorStructure complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="UnknownSubscriptionErrorStructure">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.siri.org.uk/siri}ErrorCodeStructure">
 *       &lt;sequence>
 *         &lt;element name="SubscriptionCode" type="{http://www.siri.org.uk/siri}SubscriptionQualifierStructure" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UnknownSubscriptionErrorStructure", propOrder = {
    "subscriptionCode"
})
public class UnknownSubscriptionErrorStructure
    extends ErrorCodeStructure
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "SubscriptionCode")
    protected SubscriptionQualifierStructure subscriptionCode;

    /**
     * Obtient la valeur de la propriété subscriptionCode.
     * 
     * @return
     *     possible object is
     *     {@link SubscriptionQualifierStructure }
     *     
     */
    public SubscriptionQualifierStructure getSubscriptionCode() {
        return subscriptionCode;
    }

    /**
     * Définit la valeur de la propriété subscriptionCode.
     * 
     * @param value
     *     allowed object is
     *     {@link SubscriptionQualifierStructure }
     *     
     */
    public void setSubscriptionCode(SubscriptionQualifierStructure value) {
        this.subscriptionCode = value;
    }

    public boolean isSetSubscriptionCode() {
        return (this.subscriptionCode!= null);
    }

}
