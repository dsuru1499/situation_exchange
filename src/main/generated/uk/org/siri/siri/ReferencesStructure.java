
package uk.org.siri.siri;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Type for references.
 * 
 * <p>Classe Java pour ReferencesStructure complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="ReferencesStructure">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="RelatedToRef" type="{http://www.siri.org.uk/siri}RelatedSituationStructure" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ReferencesStructure", propOrder = {
    "relatedToRef"
})
public class ReferencesStructure
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "RelatedToRef", required = true)
    protected List<RelatedSituationStructure> relatedToRef;

    /**
     * Gets the value of the relatedToRef property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the relatedToRef property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRelatedToRef().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RelatedSituationStructure }
     * 
     * 
     */
    public List<RelatedSituationStructure> getRelatedToRef() {
        if (relatedToRef == null) {
            relatedToRef = new ArrayList<RelatedSituationStructure>();
        }
        return this.relatedToRef;
    }

    public boolean isSetRelatedToRef() {
        return ((this.relatedToRef!= null)&&(!this.relatedToRef.isEmpty()));
    }

    public void unsetRelatedToRef() {
        this.relatedToRef = null;
    }

}
