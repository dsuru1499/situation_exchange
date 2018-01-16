
package uk.org.siri.siri;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Type for shared context.
 * 
 * <p>Classe Java pour NetworkContextStructure complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="NetworkContextStructure">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Operator" type="{http://www.siri.org.uk/siri}AffectedOperatorStructure" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Network" type="{http://www.siri.org.uk/siri}NetworkStructure" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NetworkContextStructure", propOrder = {
    "operator",
    "network"
})
public class NetworkContextStructure
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "Operator")
    protected List<AffectedOperatorStructure> operator;
    @XmlElement(name = "Network")
    protected NetworkStructure network;

    /**
     * Gets the value of the operator property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the operator property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOperator().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AffectedOperatorStructure }
     * 
     * 
     */
    public List<AffectedOperatorStructure> getOperator() {
        if (operator == null) {
            operator = new ArrayList<AffectedOperatorStructure>();
        }
        return this.operator;
    }

    public boolean isSetOperator() {
        return ((this.operator!= null)&&(!this.operator.isEmpty()));
    }

    public void unsetOperator() {
        this.operator = null;
    }

    /**
     * Obtient la valeur de la propriété network.
     * 
     * @return
     *     possible object is
     *     {@link NetworkStructure }
     *     
     */
    public NetworkStructure getNetwork() {
        return network;
    }

    /**
     * Définit la valeur de la propriété network.
     * 
     * @param value
     *     allowed object is
     *     {@link NetworkStructure }
     *     
     */
    public void setNetwork(NetworkStructure value) {
        this.network = value;
    }

    public boolean isSetNetwork() {
        return (this.network!= null);
    }

}
