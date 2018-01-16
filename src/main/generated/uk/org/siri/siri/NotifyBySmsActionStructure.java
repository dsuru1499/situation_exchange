
package uk.org.siri.siri;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Type for Notify user by SMS.
 * 
 * <p>Classe Java pour NotifyBySmsActionStructure complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="NotifyBySmsActionStructure">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.siri.org.uk/siri}PushedActionStructure">
 *       &lt;sequence>
 *         &lt;element name="Phone" type="{http://www.siri.org.uk/siri}PhoneType" minOccurs="0"/>
 *         &lt;element name="Premium" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NotifyBySmsActionStructure", propOrder = {
    "phone",
    "premium"
})
public class NotifyBySmsActionStructure
    extends PushedActionStructure
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "Phone", defaultValue = "true")
    protected String phone;
    @XmlElement(name = "Premium", defaultValue = "false")
    protected Boolean premium;

    /**
     * Obtient la valeur de la propriété phone.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPhone() {
        return phone;
    }

    /**
     * Définit la valeur de la propriété phone.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPhone(String value) {
        this.phone = value;
    }

    public boolean isSetPhone() {
        return (this.phone!= null);
    }

    /**
     * Obtient la valeur de la propriété premium.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPremium() {
        return premium;
    }

    /**
     * Définit la valeur de la propriété premium.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPremium(Boolean value) {
        this.premium = value;
    }

    public boolean isSetPremium() {
        return (this.premium!= null);
    }

}
