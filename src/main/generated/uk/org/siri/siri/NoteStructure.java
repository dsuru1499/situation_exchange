
package uk.org.siri.siri;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * DataType for a NOTICe.
 * 
 * <p>Classe Java pour NoteStructure complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="NoteStructure">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.siri.org.uk/siri}SituationRef" minOccurs="0"/>
 *         &lt;element ref="{http://www.siri.org.uk/siri}SituationSimpleRef" minOccurs="0"/>
 *         &lt;element ref="{http://www.siri.org.uk/siri}SituationFullRef" minOccurs="0"/>
 *         &lt;element name="Note" type="{http://www.siri.org.uk/siri}NaturalLanguageStringStructure" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NoteStructure", propOrder = {
    "situationRef",
    "situationSimpleRef",
    "situationFullRef",
    "note"
})
public class NoteStructure
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "SituationRef")
    protected SituationRefStructure situationRef;
    @XmlElement(name = "SituationSimpleRef")
    protected SituationSimpleRefStructure situationSimpleRef;
    @XmlElement(name = "SituationFullRef")
    protected SituationFullRefStructure situationFullRef;
    @XmlElement(name = "Note")
    protected NaturalLanguageStringStructure note;

    /**
     * Obtient la valeur de la propriété situationRef.
     * 
     * @return
     *     possible object is
     *     {@link SituationRefStructure }
     *     
     */
    public SituationRefStructure getSituationRef() {
        return situationRef;
    }

    /**
     * Définit la valeur de la propriété situationRef.
     * 
     * @param value
     *     allowed object is
     *     {@link SituationRefStructure }
     *     
     */
    public void setSituationRef(SituationRefStructure value) {
        this.situationRef = value;
    }

    public boolean isSetSituationRef() {
        return (this.situationRef!= null);
    }

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
     * Obtient la valeur de la propriété situationFullRef.
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

    /**
     * Obtient la valeur de la propriété note.
     * 
     * @return
     *     possible object is
     *     {@link NaturalLanguageStringStructure }
     *     
     */
    public NaturalLanguageStringStructure getNote() {
        return note;
    }

    /**
     * Définit la valeur de la propriété note.
     * 
     * @param value
     *     allowed object is
     *     {@link NaturalLanguageStringStructure }
     *     
     */
    public void setNote(NaturalLanguageStringStructure value) {
        this.note = value;
    }

    public boolean isSetNote() {
        return (this.note!= null);
    }

}
