
package uk.org.siri.siri;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Type for assignment of a SCHEDULED STOP POINT to a specific QUAY or platform +SIRI v2.0.
 * 
 * <p>Classe Java pour PlannedStopAssignmentStructure complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="PlannedStopAssignmentStructure">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="AimedQuayRef" type="{http://www.siri.org.uk/siri}QuayRefStructure" minOccurs="0"/>
 *         &lt;element name="AimedQuayName" type="{http://www.siri.org.uk/siri}NaturalLanguageStringStructure" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PlannedStopAssignmentStructure", propOrder = {
    "aimedQuayRef",
    "aimedQuayName"
})
public class PlannedStopAssignmentStructure
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "AimedQuayRef")
    protected QuayRefStructure aimedQuayRef;
    @XmlElement(name = "AimedQuayName")
    protected List<NaturalLanguageStringStructure> aimedQuayName;

    /**
     * Obtient la valeur de la propriété aimedQuayRef.
     * 
     * @return
     *     possible object is
     *     {@link QuayRefStructure }
     *     
     */
    public QuayRefStructure getAimedQuayRef() {
        return aimedQuayRef;
    }

    /**
     * Définit la valeur de la propriété aimedQuayRef.
     * 
     * @param value
     *     allowed object is
     *     {@link QuayRefStructure }
     *     
     */
    public void setAimedQuayRef(QuayRefStructure value) {
        this.aimedQuayRef = value;
    }

    public boolean isSetAimedQuayRef() {
        return (this.aimedQuayRef!= null);
    }

    /**
     * Gets the value of the aimedQuayName property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the aimedQuayName property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAimedQuayName().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link NaturalLanguageStringStructure }
     * 
     * 
     */
    public List<NaturalLanguageStringStructure> getAimedQuayName() {
        if (aimedQuayName == null) {
            aimedQuayName = new ArrayList<NaturalLanguageStringStructure>();
        }
        return this.aimedQuayName;
    }

    public boolean isSetAimedQuayName() {
        return ((this.aimedQuayName!= null)&&(!this.aimedQuayName.isEmpty()));
    }

    public void unsetAimedQuayName() {
        this.aimedQuayName = null;
    }

}
