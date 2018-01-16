
package uk.org.siri.siri;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Type for reference to a SITUATION.
 * 
 * <p>Classe Java pour SituationRefStructure complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="SituationRefStructure">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.siri.org.uk/siri}SituationSimpleRef" minOccurs="0"/>
 *         &lt;element ref="{http://www.siri.org.uk/siri}SituationFullRef" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SituationRefStructure", propOrder = {
    "situationSimpleRef",
    "situationFullRef"
})
public class SituationRefStructure
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "SituationSimpleRef")
    protected SituationSimpleRefStructure situationSimpleRef;
    @XmlElement(name = "SituationFullRef")
    protected SituationFullRefStructure situationFullRef;

    /**
     * Obtient la valeur de la propriété situationSimpleRef.
     * 
     * @return
     *     possible object is
     *     {@link SituationSimpleRefStructure }
     *     
     */
    public SituationSimpleRefStructure getSituationSimpleRef() {
        return situationSimpleRef;
    }

    /**
     * Définit la valeur de la propriété situationSimpleRef.
     * 
     * @param value
     *     allowed object is
     *     {@link SituationSimpleRefStructure }
     *     
     */
    public void setSituationSimpleRef(SituationSimpleRefStructure value) {
        this.situationSimpleRef = value;
    }

    public boolean isSetSituationSimpleRef() {
        return (this.situationSimpleRef!= null);
    }

    /**
     * Reference to a SITUATION. Elements of SITUATION identfier are expressed as atomic elements.
     * 
     * @return
     *     possible object is
     *     {@link SituationFullRefStructure }
     *     
     */
    public SituationFullRefStructure getSituationFullRef() {
        return situationFullRef;
    }

    /**
     * Définit la valeur de la propriété situationFullRef.
     * 
     * @param value
     *     allowed object is
     *     {@link SituationFullRefStructure }
     *     
     */
    public void setSituationFullRef(SituationFullRefStructure value) {
        this.situationFullRef = value;
    }

    public boolean isSetSituationFullRef() {
        return (this.situationFullRef!= null);
    }

}
