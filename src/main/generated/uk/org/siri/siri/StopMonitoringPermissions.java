
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
 *         &lt;element name="StopMonitoringPermission" type="{http://www.siri.org.uk/siri}StopMonitoringServicePermissionStructure" maxOccurs="unbounded" minOccurs="0"/>
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
    "stopMonitoringPermission"
})
@XmlRootElement(name = "StopMonitoringPermissions")
public class StopMonitoringPermissions
    extends PermissionsStructure
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "StopMonitoringPermission")
    protected List<StopMonitoringServicePermissionStructure> stopMonitoringPermission;

    /**
     * Gets the value of the stopMonitoringPermission property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the stopMonitoringPermission property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getStopMonitoringPermission().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link StopMonitoringServicePermissionStructure }
     * 
     * 
     */
    public List<StopMonitoringServicePermissionStructure> getStopMonitoringPermission() {
        if (stopMonitoringPermission == null) {
            stopMonitoringPermission = new ArrayList<StopMonitoringServicePermissionStructure>();
        }
        return this.stopMonitoringPermission;
    }

    public boolean isSetStopMonitoringPermission() {
        return ((this.stopMonitoringPermission!= null)&&(!this.stopMonitoringPermission.isEmpty()));
    }

    public void unsetStopMonitoringPermission() {
        this.stopMonitoringPermission = null;
    }

}
