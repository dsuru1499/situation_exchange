
package eu.datex2.schema._2_0rc1._2_0;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour WinterDrivingManagement complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="WinterDrivingManagement">
 *   &lt;complexContent>
 *     &lt;extension base="{http://datex2.eu/schema/2_0RC1/2_0}NetworkManagement">
 *       &lt;sequence>
 *         &lt;element name="winterEquipmentManagementType" type="{http://datex2.eu/schema/2_0RC1/2_0}WinterEquipmentManagementTypeEnum"/>
 *         &lt;element name="winterDrivingManagementExtension" type="{http://datex2.eu/schema/2_0RC1/2_0}ExtensionType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "WinterDrivingManagement", propOrder = {
    "winterEquipmentManagementType",
    "winterDrivingManagementExtension"
})
public class WinterDrivingManagement
    extends NetworkManagement
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(required = true)
    protected WinterEquipmentManagementTypeEnum winterEquipmentManagementType;
    protected ExtensionType winterDrivingManagementExtension;

    /**
     * Obtient la valeur de la propriété winterEquipmentManagementType.
     * 
     * @return
     *     possible object is
     *     {@link WinterEquipmentManagementTypeEnum }
     *     
     */
    public WinterEquipmentManagementTypeEnum getWinterEquipmentManagementType() {
        return winterEquipmentManagementType;
    }

    /**
     * Définit la valeur de la propriété winterEquipmentManagementType.
     * 
     * @param value
     *     allowed object is
     *     {@link WinterEquipmentManagementTypeEnum }
     *     
     */
    public void setWinterEquipmentManagementType(WinterEquipmentManagementTypeEnum value) {
        this.winterEquipmentManagementType = value;
    }

    public boolean isSetWinterEquipmentManagementType() {
        return (this.winterEquipmentManagementType!= null);
    }

    /**
     * Obtient la valeur de la propriété winterDrivingManagementExtension.
     * 
     * @return
     *     possible object is
     *     {@link ExtensionType }
     *     
     */
    public ExtensionType getWinterDrivingManagementExtension() {
        return winterDrivingManagementExtension;
    }

    /**
     * Définit la valeur de la propriété winterDrivingManagementExtension.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtensionType }
     *     
     */
    public void setWinterDrivingManagementExtension(ExtensionType value) {
        this.winterDrivingManagementExtension = value;
    }

    public boolean isSetWinterDrivingManagementExtension() {
        return (this.winterDrivingManagementExtension!= null);
    }

}
