
package uk.org.siri.siri;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour anonymous complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.siri.org.uk/siri}PermissionsStructure">
 *       &lt;sequence>
 *         &lt;element name="VehicleMonitoringPermission" type="{http://www.siri.org.uk/siri}VehicleMonitoringServicePermissionStructure" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "vehicleMonitoringPermission"
})
@XmlRootElement(name = "VehicleMonitoringPermissions")
public class VehicleMonitoringPermissions
    extends PermissionsStructure
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "VehicleMonitoringPermission")
    protected List<VehicleMonitoringServicePermissionStructure> vehicleMonitoringPermission;

    /**
     * Gets the value of the vehicleMonitoringPermission property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the vehicleMonitoringPermission property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getVehicleMonitoringPermission().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link VehicleMonitoringServicePermissionStructure }
     * 
     * 
     */
    public List<VehicleMonitoringServicePermissionStructure> getVehicleMonitoringPermission() {
        if (vehicleMonitoringPermission == null) {
            vehicleMonitoringPermission = new ArrayList<VehicleMonitoringServicePermissionStructure>();
        }
        return this.vehicleMonitoringPermission;
    }

    public boolean isSetVehicleMonitoringPermission() {
        return ((this.vehicleMonitoringPermission!= null)&&(!this.vehicleMonitoringPermission.isEmpty()));
    }

    public void unsetVehicleMonitoringPermission() {
        this.vehicleMonitoringPermission = null;
    }

}
