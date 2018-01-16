
package uk.org.siri.siri;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Abstract type for capability access control.
 * 
 * <p>Classe Java pour ConnectionCapabilityAccessControlStructure complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="ConnectionCapabilityAccessControlStructure">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.siri.org.uk/siri}CapabilityAccessControlStructure">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.siri.org.uk/siri}CheckOperatorRef" minOccurs="0"/>
 *         &lt;element ref="{http://www.siri.org.uk/siri}CheckLineRef" minOccurs="0"/>
 *         &lt;element ref="{http://www.siri.org.uk/siri}CheckConnectionLinkRef" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ConnectionCapabilityAccessControlStructure", propOrder = {
    "checkOperatorRef",
    "checkLineRef",
    "checkConnectionLinkRef"
})
public class ConnectionCapabilityAccessControlStructure
    extends CapabilityAccessControlStructure
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "CheckOperatorRef", defaultValue = "true")
    protected Boolean checkOperatorRef;
    @XmlElement(name = "CheckLineRef", defaultValue = "true")
    protected Boolean checkLineRef;
    @XmlElement(name = "CheckConnectionLinkRef", defaultValue = "true")
    protected Boolean checkConnectionLinkRef;

    /**
     * Obtient la valeur de la propriété checkOperatorRef.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCheckOperatorRef() {
        return checkOperatorRef;
    }

    /**
     * Définit la valeur de la propriété checkOperatorRef.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCheckOperatorRef(Boolean value) {
        this.checkOperatorRef = value;
    }

    public boolean isSetCheckOperatorRef() {
        return (this.checkOperatorRef!= null);
    }

    /**
     * Obtient la valeur de la propriété checkLineRef.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCheckLineRef() {
        return checkLineRef;
    }

    /**
     * Définit la valeur de la propriété checkLineRef.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCheckLineRef(Boolean value) {
        this.checkLineRef = value;
    }

    public boolean isSetCheckLineRef() {
        return (this.checkLineRef!= null);
    }

    /**
     * If access control is supported, whether access control by CONNECTION LINK is supported. Default is 'true'.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCheckConnectionLinkRef() {
        return checkConnectionLinkRef;
    }

    /**
     * Définit la valeur de la propriété checkConnectionLinkRef.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCheckConnectionLinkRef(Boolean value) {
        this.checkConnectionLinkRef = value;
    }

    public boolean isSetCheckConnectionLinkRef() {
        return (this.checkConnectionLinkRef!= null);
    }

}
