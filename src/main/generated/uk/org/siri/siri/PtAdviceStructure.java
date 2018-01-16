
package uk.org.siri.siri;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Type for advice.
 * 
 * <p>Classe Java pour PtAdviceStructure complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="PtAdviceStructure">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="AdviceRef" type="{http://www.siri.org.uk/siri}AdviceRefStructure" minOccurs="0"/>
 *         &lt;element name="Details" type="{http://www.siri.org.uk/siri}NaturalLanguageStringStructure" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PtAdviceStructure", propOrder = {
    "adviceRef",
    "details"
})
public class PtAdviceStructure
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "AdviceRef")
    protected AdviceRefStructure adviceRef;
    @XmlElement(name = "Details")
    protected List<NaturalLanguageStringStructure> details;

    /**
     * Obtient la valeur de la propriété adviceRef.
     * 
     * @return
     *     possible object is
     *     {@link AdviceRefStructure }
     *     
     */
    public AdviceRefStructure getAdviceRef() {
        return adviceRef;
    }

    /**
     * Définit la valeur de la propriété adviceRef.
     * 
     * @param value
     *     allowed object is
     *     {@link AdviceRefStructure }
     *     
     */
    public void setAdviceRef(AdviceRefStructure value) {
        this.adviceRef = value;
    }

    public boolean isSetAdviceRef() {
        return (this.adviceRef!= null);
    }

    /**
     * Gets the value of the details property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the details property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDetails().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link NaturalLanguageStringStructure }
     * 
     * 
     */
    public List<NaturalLanguageStringStructure> getDetails() {
        if (details == null) {
            details = new ArrayList<NaturalLanguageStringStructure>();
        }
        return this.details;
    }

    public boolean isSetDetails() {
        return ((this.details!= null)&&(!this.details.isEmpty()));
    }

    public void unsetDetails() {
        this.details = null;
    }

}
