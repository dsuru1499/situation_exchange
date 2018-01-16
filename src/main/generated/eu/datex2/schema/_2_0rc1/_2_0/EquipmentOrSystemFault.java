
package eu.datex2.schema._2_0rc1._2_0;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour EquipmentOrSystemFault complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="EquipmentOrSystemFault">
 *   &lt;complexContent>
 *     &lt;extension base="{http://datex2.eu/schema/2_0RC1/2_0}TrafficElement">
 *       &lt;sequence>
 *         &lt;element name="equipmentOrSystemFaultType" type="{http://datex2.eu/schema/2_0RC1/2_0}EquipmentOrSystemFaultTypeEnum"/>
 *         &lt;element name="faultyEquipmentOrSystemType" type="{http://datex2.eu/schema/2_0RC1/2_0}EquipmentOrSystemTypeEnum"/>
 *         &lt;element name="equipmentOrSystemFaultExtension" type="{http://datex2.eu/schema/2_0RC1/2_0}ExtensionType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EquipmentOrSystemFault", propOrder = {
    "equipmentOrSystemFaultType",
    "faultyEquipmentOrSystemType",
    "equipmentOrSystemFaultExtension"
})
public class EquipmentOrSystemFault
    extends TrafficElement
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(required = true)
    protected EquipmentOrSystemFaultTypeEnum equipmentOrSystemFaultType;
    @XmlElement(required = true)
    protected EquipmentOrSystemTypeEnum faultyEquipmentOrSystemType;
    protected ExtensionType equipmentOrSystemFaultExtension;

    /**
     * Obtient la valeur de la propriété equipmentOrSystemFaultType.
     * 
     * @return
     *     possible object is
     *     {@link EquipmentOrSystemFaultTypeEnum }
     *     
     */
    public EquipmentOrSystemFaultTypeEnum getEquipmentOrSystemFaultType() {
        return equipmentOrSystemFaultType;
    }

    /**
     * Définit la valeur de la propriété equipmentOrSystemFaultType.
     * 
     * @param value
     *     allowed object is
     *     {@link EquipmentOrSystemFaultTypeEnum }
     *     
     */
    public void setEquipmentOrSystemFaultType(EquipmentOrSystemFaultTypeEnum value) {
        this.equipmentOrSystemFaultType = value;
    }

    public boolean isSetEquipmentOrSystemFaultType() {
        return (this.equipmentOrSystemFaultType!= null);
    }

    /**
     * Obtient la valeur de la propriété faultyEquipmentOrSystemType.
     * 
     * @return
     *     possible object is
     *     {@link EquipmentOrSystemTypeEnum }
     *     
     */
    public EquipmentOrSystemTypeEnum getFaultyEquipmentOrSystemType() {
        return faultyEquipmentOrSystemType;
    }

    /**
     * Définit la valeur de la propriété faultyEquipmentOrSystemType.
     * 
     * @param value
     *     allowed object is
     *     {@link EquipmentOrSystemTypeEnum }
     *     
     */
    public void setFaultyEquipmentOrSystemType(EquipmentOrSystemTypeEnum value) {
        this.faultyEquipmentOrSystemType = value;
    }

    public boolean isSetFaultyEquipmentOrSystemType() {
        return (this.faultyEquipmentOrSystemType!= null);
    }

    /**
     * Obtient la valeur de la propriété equipmentOrSystemFaultExtension.
     * 
     * @return
     *     possible object is
     *     {@link ExtensionType }
     *     
     */
    public ExtensionType getEquipmentOrSystemFaultExtension() {
        return equipmentOrSystemFaultExtension;
    }

    /**
     * Définit la valeur de la propriété equipmentOrSystemFaultExtension.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtensionType }
     *     
     */
    public void setEquipmentOrSystemFaultExtension(ExtensionType value) {
        this.equipmentOrSystemFaultExtension = value;
    }

    public boolean isSetEquipmentOrSystemFaultExtension() {
        return (this.equipmentOrSystemFaultExtension!= null);
    }

}
