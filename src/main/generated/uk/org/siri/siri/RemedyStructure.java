
package uk.org.siri.siri;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Description of the remedy to the change of a facility status (mainly when it becomes partially or totally anavailable)
 * 
 * <p>Classe Java pour RemedyStructure complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="RemedyStructure">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="RemedyType" type="{http://www.siri.org.uk/siri}RemedyTypeEnumeration" minOccurs="0"/>
 *         &lt;element name="Description" type="{http://www.siri.org.uk/siri}NaturalLanguageStringStructure" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://www.siri.org.uk/siri}Extensions" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RemedyStructure", propOrder = {
    "remedyType",
    "description",
    "extensions"
})
public class RemedyStructure
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "RemedyType")
    protected RemedyTypeEnumeration remedyType;
    @XmlElement(name = "Description")
    protected List<NaturalLanguageStringStructure> description;
    @XmlElement(name = "Extensions")
    protected ExtensionsStructure extensions;

    /**
     * Obtient la valeur de la propriété remedyType.
     * 
     * @return
     *     possible object is
     *     {@link RemedyTypeEnumeration }
     *     
     */
    public RemedyTypeEnumeration getRemedyType() {
        return remedyType;
    }

    /**
     * Définit la valeur de la propriété remedyType.
     * 
     * @param value
     *     allowed object is
     *     {@link RemedyTypeEnumeration }
     *     
     */
    public void setRemedyType(RemedyTypeEnumeration value) {
        this.remedyType = value;
    }

    public boolean isSetRemedyType() {
        return (this.remedyType!= null);
    }

    /**
     * Gets the value of the description property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the description property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDescription().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link NaturalLanguageStringStructure }
     * 
     * 
     */
    public List<NaturalLanguageStringStructure> getDescription() {
        if (description == null) {
            description = new ArrayList<NaturalLanguageStringStructure>();
        }
        return this.description;
    }

    public boolean isSetDescription() {
        return ((this.description!= null)&&(!this.description.isEmpty()));
    }

    public void unsetDescription() {
        this.description = null;
    }

    /**
     * Obtient la valeur de la propriété extensions.
     * 
     * @return
     *     possible object is
     *     {@link ExtensionsStructure }
     *     
     */
    public ExtensionsStructure getExtensions() {
        return extensions;
    }

    /**
     * Définit la valeur de la propriété extensions.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtensionsStructure }
     *     
     */
    public void setExtensions(ExtensionsStructure value) {
        this.extensions = value;
    }

    public boolean isSetExtensions() {
        return (this.extensions!= null);
    }

}
