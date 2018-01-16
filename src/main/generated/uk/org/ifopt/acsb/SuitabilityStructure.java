
package uk.org.ifopt.acsb;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Type for of a specific SUITABILITY.
 * 
 * <p>Classe Java pour SuitabilityStructure complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="SuitabilityStructure">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Suitable" type="{http://www.ifopt.org.uk/acsb}SuitabilityEnumeration"/>
 *         &lt;element name="UserNeed" type="{http://www.ifopt.org.uk/acsb}UserNeedStructure"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SuitabilityStructure", propOrder = {
    "suitable",
    "userNeed"
})
public class SuitabilityStructure
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "Suitable", required = true)
    protected SuitabilityEnumeration suitable;
    @XmlElement(name = "UserNeed", required = true)
    protected UserNeedStructure userNeed;

    /**
     * Obtient la valeur de la propriété suitable.
     * 
     * @return
     *     possible object is
     *     {@link SuitabilityEnumeration }
     *     
     */
    public SuitabilityEnumeration getSuitable() {
        return suitable;
    }

    /**
     * Définit la valeur de la propriété suitable.
     * 
     * @param value
     *     allowed object is
     *     {@link SuitabilityEnumeration }
     *     
     */
    public void setSuitable(SuitabilityEnumeration value) {
        this.suitable = value;
    }

    public boolean isSetSuitable() {
        return (this.suitable!= null);
    }

    /**
     * Obtient la valeur de la propriété userNeed.
     * 
     * @return
     *     possible object is
     *     {@link UserNeedStructure }
     *     
     */
    public UserNeedStructure getUserNeed() {
        return userNeed;
    }

    /**
     * Définit la valeur de la propriété userNeed.
     * 
     * @param value
     *     allowed object is
     *     {@link UserNeedStructure }
     *     
     */
    public void setUserNeed(UserNeedStructure value) {
        this.userNeed = value;
    }

    public boolean isSetUserNeed() {
        return (this.userNeed!= null);
    }

}
