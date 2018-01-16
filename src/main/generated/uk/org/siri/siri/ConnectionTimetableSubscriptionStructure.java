
package uk.org.siri.siri;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Type for Subscription Request for Connection Protection.
 * 
 * <p>Classe Java pour ConnectionTimetableSubscriptionStructure complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="ConnectionTimetableSubscriptionStructure">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.siri.org.uk/siri}AbstractSubscriptionStructure">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.siri.org.uk/siri}ConnectionTimetableRequest"/>
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
@XmlType(name = "ConnectionTimetableSubscriptionStructure", propOrder = {
    "connectionTimetableRequest",
    "extensions"
})
public class ConnectionTimetableSubscriptionStructure
    extends AbstractSubscriptionStructure
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "ConnectionTimetableRequest", required = true)
    protected ConnectionTimetableRequestStructure connectionTimetableRequest;
    @XmlElement(name = "Extensions")
    protected ExtensionsStructure extensions;

    /**
     * Obtient la valeur de la propriété connectionTimetableRequest.
     * 
     * @return
     *     possible object is
     *     {@link ConnectionTimetableRequestStructure }
     *     
     */
    public ConnectionTimetableRequestStructure getConnectionTimetableRequest() {
        return connectionTimetableRequest;
    }

    /**
     * Définit la valeur de la propriété connectionTimetableRequest.
     * 
     * @param value
     *     allowed object is
     *     {@link ConnectionTimetableRequestStructure }
     *     
     */
    public void setConnectionTimetableRequest(ConnectionTimetableRequestStructure value) {
        this.connectionTimetableRequest = value;
    }

    public boolean isSetConnectionTimetableRequest() {
        return (this.connectionTimetableRequest!= null);
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
