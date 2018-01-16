
package uk.org.siri.siri;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.NormalizedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * Type for easement info.
 * 
 * <p>Classe Java pour EasementsStructure complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="EasementsStructure">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="TicketRestrictions" type="{http://www.siri.org.uk/siri}TicketRestrictionEnumeration" minOccurs="0"/>
 *         &lt;element name="Easement" type="{http://www.siri.org.uk/siri}NaturalLanguageStringStructure" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="EasementRef" type="{http://www.w3.org/2001/XMLSchema}normalizedString" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EasementsStructure", propOrder = {
    "ticketRestrictions",
    "easement",
    "easementRef"
})
public class EasementsStructure
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "TicketRestrictions")
    protected TicketRestrictionEnumeration ticketRestrictions;
    @XmlElement(name = "Easement")
    protected List<NaturalLanguageStringStructure> easement;
    @XmlElement(name = "EasementRef")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String easementRef;

    /**
     * Obtient la valeur de la propriété ticketRestrictions.
     * 
     * @return
     *     possible object is
     *     {@link TicketRestrictionEnumeration }
     *     
     */
    public TicketRestrictionEnumeration getTicketRestrictions() {
        return ticketRestrictions;
    }

    /**
     * Définit la valeur de la propriété ticketRestrictions.
     * 
     * @param value
     *     allowed object is
     *     {@link TicketRestrictionEnumeration }
     *     
     */
    public void setTicketRestrictions(TicketRestrictionEnumeration value) {
        this.ticketRestrictions = value;
    }

    public boolean isSetTicketRestrictions() {
        return (this.ticketRestrictions!= null);
    }

    /**
     * Gets the value of the easement property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the easement property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEasement().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link NaturalLanguageStringStructure }
     * 
     * 
     */
    public List<NaturalLanguageStringStructure> getEasement() {
        if (easement == null) {
            easement = new ArrayList<NaturalLanguageStringStructure>();
        }
        return this.easement;
    }

    public boolean isSetEasement() {
        return ((this.easement!= null)&&(!this.easement.isEmpty()));
    }

    public void unsetEasement() {
        this.easement = null;
    }

    /**
     * Obtient la valeur de la propriété easementRef.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEasementRef() {
        return easementRef;
    }

    /**
     * Définit la valeur de la propriété easementRef.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEasementRef(String value) {
        this.easementRef = value;
    }

    public boolean isSetEasementRef() {
        return (this.easementRef!= null);
    }

}
