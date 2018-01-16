
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
 *         &lt;element name="StopTimetablePermission" type="{http://www.siri.org.uk/siri}StopTimetableServicePermissionStructure" maxOccurs="unbounded" minOccurs="0"/>
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
    "stopTimetablePermission"
})
@XmlRootElement(name = "StopTimetablePermissions")
public class StopTimetablePermissions
    extends PermissionsStructure
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "StopTimetablePermission")
    protected List<StopTimetableServicePermissionStructure> stopTimetablePermission;

    /**
     * Gets the value of the stopTimetablePermission property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the stopTimetablePermission property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getStopTimetablePermission().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link StopTimetableServicePermissionStructure }
     * 
     * 
     */
    public List<StopTimetableServicePermissionStructure> getStopTimetablePermission() {
        if (stopTimetablePermission == null) {
            stopTimetablePermission = new ArrayList<StopTimetableServicePermissionStructure>();
        }
        return this.stopTimetablePermission;
    }

    public boolean isSetStopTimetablePermission() {
        return ((this.stopTimetablePermission!= null)&&(!this.stopTimetablePermission.isEmpty()));
    }

    public void unsetStopTimetablePermission() {
        this.stopTimetablePermission = null;
    }

}
