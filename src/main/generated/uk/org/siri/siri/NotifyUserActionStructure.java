
package uk.org.siri.siri;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Type for Notify user by other means.
 * 
 * <p>Classe Java pour NotifyUserActionStructure complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="NotifyUserActionStructure">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.siri.org.uk/siri}PushedActionStructure">
 *       &lt;sequence>
 *         &lt;element name="WorkgroupRef" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="UserName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="UserRef" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NotifyUserActionStructure", propOrder = {
    "workgroupRef",
    "userName",
    "userRef"
})
public class NotifyUserActionStructure
    extends PushedActionStructure
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "WorkgroupRef", defaultValue = "true")
    protected String workgroupRef;
    @XmlElement(name = "UserName")
    protected String userName;
    @XmlElement(name = "UserRef", defaultValue = "true")
    protected String userRef;

    /**
     * Obtient la valeur de la propriété workgroupRef.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWorkgroupRef() {
        return workgroupRef;
    }

    /**
     * Définit la valeur de la propriété workgroupRef.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWorkgroupRef(String value) {
        this.workgroupRef = value;
    }

    public boolean isSetWorkgroupRef() {
        return (this.workgroupRef!= null);
    }

    /**
     * Obtient la valeur de la propriété userName.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUserName() {
        return userName;
    }

    /**
     * Définit la valeur de la propriété userName.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUserName(String value) {
        this.userName = value;
    }

    public boolean isSetUserName() {
        return (this.userName!= null);
    }

    /**
     * Obtient la valeur de la propriété userRef.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUserRef() {
        return userRef;
    }

    /**
     * Définit la valeur de la propriété userRef.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUserRef(String value) {
        this.userRef = value;
    }

    public boolean isSetUserRef() {
        return (this.userRef!= null);
    }

}
