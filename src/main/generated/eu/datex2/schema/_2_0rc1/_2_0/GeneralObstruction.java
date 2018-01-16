
package eu.datex2.schema._2_0rc1._2_0;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour GeneralObstruction complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="GeneralObstruction">
 *   &lt;complexContent>
 *     &lt;extension base="{http://datex2.eu/schema/2_0RC1/2_0}Obstruction">
 *       &lt;sequence>
 *         &lt;element name="obstructionType" type="{http://datex2.eu/schema/2_0RC1/2_0}ObstructionTypeEnum" maxOccurs="unbounded"/>
 *         &lt;element name="groupOfPeopleInvolved" type="{http://datex2.eu/schema/2_0RC1/2_0}GroupOfPeopleInvolved" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="generalObstructionExtension" type="{http://datex2.eu/schema/2_0RC1/2_0}ExtensionType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GeneralObstruction", propOrder = {
    "obstructionType",
    "groupOfPeopleInvolved",
    "generalObstructionExtension"
})
public class GeneralObstruction
    extends Obstruction
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(required = true)
    protected List<ObstructionTypeEnum> obstructionType;
    protected List<GroupOfPeopleInvolved> groupOfPeopleInvolved;
    protected ExtensionType generalObstructionExtension;

    /**
     * Gets the value of the obstructionType property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the obstructionType property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getObstructionType().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ObstructionTypeEnum }
     * 
     * 
     */
    public List<ObstructionTypeEnum> getObstructionType() {
        if (obstructionType == null) {
            obstructionType = new ArrayList<ObstructionTypeEnum>();
        }
        return this.obstructionType;
    }

    public boolean isSetObstructionType() {
        return ((this.obstructionType!= null)&&(!this.obstructionType.isEmpty()));
    }

    public void unsetObstructionType() {
        this.obstructionType = null;
    }

    /**
     * Gets the value of the groupOfPeopleInvolved property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the groupOfPeopleInvolved property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getGroupOfPeopleInvolved().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link GroupOfPeopleInvolved }
     * 
     * 
     */
    public List<GroupOfPeopleInvolved> getGroupOfPeopleInvolved() {
        if (groupOfPeopleInvolved == null) {
            groupOfPeopleInvolved = new ArrayList<GroupOfPeopleInvolved>();
        }
        return this.groupOfPeopleInvolved;
    }

    public boolean isSetGroupOfPeopleInvolved() {
        return ((this.groupOfPeopleInvolved!= null)&&(!this.groupOfPeopleInvolved.isEmpty()));
    }

    public void unsetGroupOfPeopleInvolved() {
        this.groupOfPeopleInvolved = null;
    }

    /**
     * Obtient la valeur de la propriété generalObstructionExtension.
     * 
     * @return
     *     possible object is
     *     {@link ExtensionType }
     *     
     */
    public ExtensionType getGeneralObstructionExtension() {
        return generalObstructionExtension;
    }

    /**
     * Définit la valeur de la propriété generalObstructionExtension.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtensionType }
     *     
     */
    public void setGeneralObstructionExtension(ExtensionType value) {
        this.generalObstructionExtension = value;
    }

    public boolean isSetGeneralObstructionExtension() {
        return (this.generalObstructionExtension!= null);
    }

}
