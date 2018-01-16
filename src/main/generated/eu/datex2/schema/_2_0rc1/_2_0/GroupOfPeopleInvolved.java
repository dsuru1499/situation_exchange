
package eu.datex2.schema._2_0rc1._2_0;

import java.io.Serializable;
import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour GroupOfPeopleInvolved complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="GroupOfPeopleInvolved">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="numberOfPeople" type="{http://datex2.eu/schema/2_0RC1/2_0}NonNegativeInteger" minOccurs="0"/>
 *         &lt;element name="injuryStatus" type="{http://datex2.eu/schema/2_0RC1/2_0}InjuryStatusTypeEnum" minOccurs="0"/>
 *         &lt;element name="involvementRole" type="{http://datex2.eu/schema/2_0RC1/2_0}InvolvementRolesEnum" minOccurs="0"/>
 *         &lt;element name="categoryOfPeopleInvolved" type="{http://datex2.eu/schema/2_0RC1/2_0}PersonCategoryEnum" minOccurs="0"/>
 *         &lt;element name="groupOfPeopleInvolvedExtension" type="{http://datex2.eu/schema/2_0RC1/2_0}ExtensionType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GroupOfPeopleInvolved", propOrder = {
    "numberOfPeople",
    "injuryStatus",
    "involvementRole",
    "categoryOfPeopleInvolved",
    "groupOfPeopleInvolvedExtension"
})
public class GroupOfPeopleInvolved
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    protected BigInteger numberOfPeople;
    protected InjuryStatusTypeEnum injuryStatus;
    protected InvolvementRolesEnum involvementRole;
    protected PersonCategoryEnum categoryOfPeopleInvolved;
    protected ExtensionType groupOfPeopleInvolvedExtension;

    /**
     * Obtient la valeur de la propriété numberOfPeople.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getNumberOfPeople() {
        return numberOfPeople;
    }

    /**
     * Définit la valeur de la propriété numberOfPeople.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setNumberOfPeople(BigInteger value) {
        this.numberOfPeople = value;
    }

    public boolean isSetNumberOfPeople() {
        return (this.numberOfPeople!= null);
    }

    /**
     * Obtient la valeur de la propriété injuryStatus.
     * 
     * @return
     *     possible object is
     *     {@link InjuryStatusTypeEnum }
     *     
     */
    public InjuryStatusTypeEnum getInjuryStatus() {
        return injuryStatus;
    }

    /**
     * Définit la valeur de la propriété injuryStatus.
     * 
     * @param value
     *     allowed object is
     *     {@link InjuryStatusTypeEnum }
     *     
     */
    public void setInjuryStatus(InjuryStatusTypeEnum value) {
        this.injuryStatus = value;
    }

    public boolean isSetInjuryStatus() {
        return (this.injuryStatus!= null);
    }

    /**
     * Obtient la valeur de la propriété involvementRole.
     * 
     * @return
     *     possible object is
     *     {@link InvolvementRolesEnum }
     *     
     */
    public InvolvementRolesEnum getInvolvementRole() {
        return involvementRole;
    }

    /**
     * Définit la valeur de la propriété involvementRole.
     * 
     * @param value
     *     allowed object is
     *     {@link InvolvementRolesEnum }
     *     
     */
    public void setInvolvementRole(InvolvementRolesEnum value) {
        this.involvementRole = value;
    }

    public boolean isSetInvolvementRole() {
        return (this.involvementRole!= null);
    }

    /**
     * Obtient la valeur de la propriété categoryOfPeopleInvolved.
     * 
     * @return
     *     possible object is
     *     {@link PersonCategoryEnum }
     *     
     */
    public PersonCategoryEnum getCategoryOfPeopleInvolved() {
        return categoryOfPeopleInvolved;
    }

    /**
     * Définit la valeur de la propriété categoryOfPeopleInvolved.
     * 
     * @param value
     *     allowed object is
     *     {@link PersonCategoryEnum }
     *     
     */
    public void setCategoryOfPeopleInvolved(PersonCategoryEnum value) {
        this.categoryOfPeopleInvolved = value;
    }

    public boolean isSetCategoryOfPeopleInvolved() {
        return (this.categoryOfPeopleInvolved!= null);
    }

    /**
     * Obtient la valeur de la propriété groupOfPeopleInvolvedExtension.
     * 
     * @return
     *     possible object is
     *     {@link ExtensionType }
     *     
     */
    public ExtensionType getGroupOfPeopleInvolvedExtension() {
        return groupOfPeopleInvolvedExtension;
    }

    /**
     * Définit la valeur de la propriété groupOfPeopleInvolvedExtension.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtensionType }
     *     
     */
    public void setGroupOfPeopleInvolvedExtension(ExtensionType value) {
        this.groupOfPeopleInvolvedExtension = value;
    }

    public boolean isSetGroupOfPeopleInvolvedExtension() {
        return (this.groupOfPeopleInvolvedExtension!= null);
    }

}
