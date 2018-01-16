
package eu.datex2.schema._2_0rc1._2_0;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour MaintenanceWorks complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="MaintenanceWorks">
 *   &lt;complexContent>
 *     &lt;extension base="{http://datex2.eu/schema/2_0RC1/2_0}Roadworks">
 *       &lt;sequence>
 *         &lt;element name="roadMaintenanceType" type="{http://datex2.eu/schema/2_0RC1/2_0}RoadMaintenanceTypeEnum" maxOccurs="unbounded"/>
 *         &lt;element name="maintenanceWorksExtension" type="{http://datex2.eu/schema/2_0RC1/2_0}ExtensionType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MaintenanceWorks", propOrder = {
    "roadMaintenanceType",
    "maintenanceWorksExtension"
})
public class MaintenanceWorks
    extends Roadworks
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(required = true)
    protected List<RoadMaintenanceTypeEnum> roadMaintenanceType;
    protected ExtensionType maintenanceWorksExtension;

    /**
     * Gets the value of the roadMaintenanceType property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the roadMaintenanceType property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRoadMaintenanceType().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RoadMaintenanceTypeEnum }
     * 
     * 
     */
    public List<RoadMaintenanceTypeEnum> getRoadMaintenanceType() {
        if (roadMaintenanceType == null) {
            roadMaintenanceType = new ArrayList<RoadMaintenanceTypeEnum>();
        }
        return this.roadMaintenanceType;
    }

    public boolean isSetRoadMaintenanceType() {
        return ((this.roadMaintenanceType!= null)&&(!this.roadMaintenanceType.isEmpty()));
    }

    public void unsetRoadMaintenanceType() {
        this.roadMaintenanceType = null;
    }

    /**
     * Obtient la valeur de la propriété maintenanceWorksExtension.
     * 
     * @return
     *     possible object is
     *     {@link ExtensionType }
     *     
     */
    public ExtensionType getMaintenanceWorksExtension() {
        return maintenanceWorksExtension;
    }

    /**
     * Définit la valeur de la propriété maintenanceWorksExtension.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtensionType }
     *     
     */
    public void setMaintenanceWorksExtension(ExtensionType value) {
        this.maintenanceWorksExtension = value;
    }

    public boolean isSetMaintenanceWorksExtension() {
        return (this.maintenanceWorksExtension!= null);
    }

}
