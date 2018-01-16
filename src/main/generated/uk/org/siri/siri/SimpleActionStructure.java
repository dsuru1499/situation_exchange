
package uk.org.siri.siri;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * Type for list of SITUATIONs.
 * 
 * <p>Classe Java pour SimpleActionStructure complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="SimpleActionStructure">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ActionStatus" type="{http://www.siri.org.uk/siri}ActionStatusEnumeration" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SimpleActionStructure", propOrder = {
    "actionStatus"
})
@XmlSeeAlso({
    ParameterisedActionStructure.class
})
public class SimpleActionStructure
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "ActionStatus", defaultValue = "open")
    protected ActionStatusEnumeration actionStatus;

    /**
     * Obtient la valeur de la propriété actionStatus.
     * 
     * @return
     *     possible object is
     *     {@link ActionStatusEnumeration }
     *     
     */
    public ActionStatusEnumeration getActionStatus() {
        return actionStatus;
    }

    /**
     * Définit la valeur de la propriété actionStatus.
     * 
     * @param value
     *     allowed object is
     *     {@link ActionStatusEnumeration }
     *     
     */
    public void setActionStatus(ActionStatusEnumeration value) {
        this.actionStatus = value;
    }

    public boolean isSetActionStatus() {
        return (this.actionStatus!= null);
    }

}
