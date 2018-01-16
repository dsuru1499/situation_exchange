
package uk.org.siri.siri;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Type for MonitoringPoint Permission.
 * 
 * <p>Classe Java pour VehicleMonitorPermissionStructure complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="VehicleMonitorPermissionStructure">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.siri.org.uk/siri}AbstractTopicPermissionStructure">
 *       &lt;sequence>
 *         &lt;element name="VehicleMonitoringRef" type="{http://www.siri.org.uk/siri}VehicleMonitoringRefStructure"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VehicleMonitorPermissionStructure", propOrder = {
    "vehicleMonitoringRef"
})
public class VehicleMonitorPermissionStructure
    extends AbstractTopicPermissionStructure
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "VehicleMonitoringRef", required = true)
    protected VehicleMonitoringRefStructure vehicleMonitoringRef;

    /**
     * Obtient la valeur de la propriété vehicleMonitoringRef.
     * 
     * @return
     *     possible object is
     *     {@link VehicleMonitoringRefStructure }
     *     
     */
    public VehicleMonitoringRefStructure getVehicleMonitoringRef() {
        return vehicleMonitoringRef;
    }

    /**
     * Définit la valeur de la propriété vehicleMonitoringRef.
     * 
     * @param value
     *     allowed object is
     *     {@link VehicleMonitoringRefStructure }
     *     
     */
    public void setVehicleMonitoringRef(VehicleMonitoringRefStructure value) {
        this.vehicleMonitoringRef = value;
    }

    public boolean isSetVehicleMonitoringRef() {
        return (this.vehicleMonitoringRef!= null);
    }

}
