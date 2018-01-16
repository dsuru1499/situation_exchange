
package uk.org.ifopt.ifopt;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import uk.org.siri.siri.NaturalLanguageStringStructure;


/**
 * Type for abstract EQUIPMENT.
 * 
 * <p>Classe Java pour AbstractEquipmentStructure complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="AbstractEquipmentStructure">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.ifopt.org.uk/ifopt}DataManagedObjectStructure">
 *       &lt;sequence>
 *         &lt;group ref="{http://www.ifopt.org.uk/ifopt}AbstractEquipmentGroup"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AbstractEquipmentStructure", propOrder = {
    "equipmentId",
    "equipmentName",
    "typeOfEquipment"
})
@XmlSeeAlso({
    InstalledEquipmentStructure.class
})
public abstract class AbstractEquipmentStructure
    extends DataManagedObjectStructure
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "EquipmentId", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String equipmentId;
    @XmlElement(name = "EquipmentName")
    protected NaturalLanguageStringStructure equipmentName;
    @XmlElement(name = "TypeOfEquipment")
    protected EquipmentTypeRefStructure typeOfEquipment;

    /**
     * Obtient la valeur de la propriété equipmentId.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEquipmentId() {
        return equipmentId;
    }

    /**
     * Définit la valeur de la propriété equipmentId.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEquipmentId(String value) {
        this.equipmentId = value;
    }

    public boolean isSetEquipmentId() {
        return (this.equipmentId!= null);
    }

    /**
     * Obtient la valeur de la propriété equipmentName.
     * 
     * @return
     *     possible object is
     *     {@link NaturalLanguageStringStructure }
     *     
     */
    public NaturalLanguageStringStructure getEquipmentName() {
        return equipmentName;
    }

    /**
     * Définit la valeur de la propriété equipmentName.
     * 
     * @param value
     *     allowed object is
     *     {@link NaturalLanguageStringStructure }
     *     
     */
    public void setEquipmentName(NaturalLanguageStringStructure value) {
        this.equipmentName = value;
    }

    public boolean isSetEquipmentName() {
        return (this.equipmentName!= null);
    }

    /**
     * Obtient la valeur de la propriété typeOfEquipment.
     * 
     * @return
     *     possible object is
     *     {@link EquipmentTypeRefStructure }
     *     
     */
    public EquipmentTypeRefStructure getTypeOfEquipment() {
        return typeOfEquipment;
    }

    /**
     * Définit la valeur de la propriété typeOfEquipment.
     * 
     * @param value
     *     allowed object is
     *     {@link EquipmentTypeRefStructure }
     *     
     */
    public void setTypeOfEquipment(EquipmentTypeRefStructure value) {
        this.typeOfEquipment = value;
    }

    public boolean isSetTypeOfEquipment() {
        return (this.typeOfEquipment!= null);
    }

}
