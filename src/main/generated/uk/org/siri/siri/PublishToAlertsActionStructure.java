
package uk.org.siri.siri;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Type for Action Publish SITUATION To Alert Service.
 * 
 * <p>Classe Java pour PublishToAlertsActionStructure complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="PublishToAlertsActionStructure">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.siri.org.uk/siri}PushedActionStructure">
 *       &lt;sequence>
 *         &lt;element name="ByEmail" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="ByMobile" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PublishToAlertsActionStructure", propOrder = {
    "byEmail",
    "byMobile"
})
public class PublishToAlertsActionStructure
    extends PushedActionStructure
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "ByEmail", defaultValue = "true")
    protected Boolean byEmail;
    @XmlElement(name = "ByMobile", defaultValue = "true")
    protected Boolean byMobile;

    /**
     * Obtient la valeur de la propriété byEmail.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isByEmail() {
        return byEmail;
    }

    /**
     * Définit la valeur de la propriété byEmail.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setByEmail(Boolean value) {
        this.byEmail = value;
    }

    public boolean isSetByEmail() {
        return (this.byEmail!= null);
    }

    /**
     * Obtient la valeur de la propriété byMobile.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isByMobile() {
        return byMobile;
    }

    /**
     * Définit la valeur de la propriété byMobile.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setByMobile(Boolean value) {
        this.byMobile = value;
    }

    public boolean isSetByMobile() {
        return (this.byMobile!= null);
    }

}
