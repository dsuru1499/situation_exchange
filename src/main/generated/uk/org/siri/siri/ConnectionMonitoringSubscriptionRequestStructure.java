
package uk.org.siri.siri;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.Duration;


/**
 * Subscription Request for Connection Monitoring.
 * 
 * <p>Classe Java pour ConnectionMonitoringSubscriptionRequestStructure complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="ConnectionMonitoringSubscriptionRequestStructure">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.siri.org.uk/siri}AbstractSubscriptionStructure">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.siri.org.uk/siri}ConnectionMonitoringRequest"/>
 *         &lt;group ref="{http://www.siri.org.uk/siri}ConnectionMonitoringSubscriptionPolicyGroup"/>
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
@XmlType(name = "ConnectionMonitoringSubscriptionRequestStructure", propOrder = {
    "connectionMonitoringRequest",
    "changeBeforeUpdates",
    "extensions"
})
public class ConnectionMonitoringSubscriptionRequestStructure
    extends AbstractSubscriptionStructure
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "ConnectionMonitoringRequest", required = true)
    protected ConnectionMonitoringRequestStructure connectionMonitoringRequest;
    @XmlElement(name = "ChangeBeforeUpdates")
    protected Duration changeBeforeUpdates;
    @XmlElement(name = "Extensions")
    protected ExtensionsStructure extensions;

    /**
     * Obtient la valeur de la propriété connectionMonitoringRequest.
     * 
     * @return
     *     possible object is
     *     {@link ConnectionMonitoringRequestStructure }
     *     
     */
    public ConnectionMonitoringRequestStructure getConnectionMonitoringRequest() {
        return connectionMonitoringRequest;
    }

    /**
     * Définit la valeur de la propriété connectionMonitoringRequest.
     * 
     * @param value
     *     allowed object is
     *     {@link ConnectionMonitoringRequestStructure }
     *     
     */
    public void setConnectionMonitoringRequest(ConnectionMonitoringRequestStructure value) {
        this.connectionMonitoringRequest = value;
    }

    public boolean isSetConnectionMonitoringRequest() {
        return (this.connectionMonitoringRequest!= null);
    }

    /**
     * Obtient la valeur de la propriété changeBeforeUpdates.
     * 
     * @return
     *     possible object is
     *     {@link Duration }
     *     
     */
    public Duration getChangeBeforeUpdates() {
        return changeBeforeUpdates;
    }

    /**
     * Définit la valeur de la propriété changeBeforeUpdates.
     * 
     * @param value
     *     allowed object is
     *     {@link Duration }
     *     
     */
    public void setChangeBeforeUpdates(Duration value) {
        this.changeBeforeUpdates = value;
    }

    public boolean isSetChangeBeforeUpdates() {
        return (this.changeBeforeUpdates!= null);
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
