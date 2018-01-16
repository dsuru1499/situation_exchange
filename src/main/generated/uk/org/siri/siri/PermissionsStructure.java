
package uk.org.siri.siri;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * Type for abstract permissions.
 * 
 * <p>Classe Java pour PermissionsStructure complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="PermissionsStructure">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="PermissionVersionRef" type="{http://www.siri.org.uk/siri}VersionRefStructure" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PermissionsStructure", propOrder = {
    "permissionVersionRef"
})
@XmlSeeAlso({
    uk.org.siri.siri.ConnectionTimetableCapabilitiesResponseStructure.ConnectionTimetablePermissions.class,
    GeneralMessagePermissions.class,
    EstimatedTimetablePermissions.class,
    SituationExchangePermissions.class,
    StopMonitoringPermissions.class,
    VehicleMonitoringPermissions.class,
    FacilityMonitoringPermissions.class,
    StopTimetablePermissions.class,
    ProductionTimetablePermissions.class
})
public class PermissionsStructure
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "PermissionVersionRef")
    protected VersionRefStructure permissionVersionRef;

    /**
     * Obtient la valeur de la propriété permissionVersionRef.
     * 
     * @return
     *     possible object is
     *     {@link VersionRefStructure }
     *     
     */
    public VersionRefStructure getPermissionVersionRef() {
        return permissionVersionRef;
    }

    /**
     * Définit la valeur de la propriété permissionVersionRef.
     * 
     * @param value
     *     allowed object is
     *     {@link VersionRefStructure }
     *     
     */
    public void setPermissionVersionRef(VersionRefStructure value) {
        this.permissionVersionRef = value;
    }

    public boolean isSetPermissionVersionRef() {
        return (this.permissionVersionRef!= null);
    }

}
