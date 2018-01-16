
package uk.org.siri.siri;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * Type for Delivery for Vehicle Monitoring Service.
 * 
 * <p>Classe Java pour VehicleMonitoringCapabilitiesResponseStructure complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="VehicleMonitoringCapabilitiesResponseStructure">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.siri.org.uk/siri}AbstractServiceCapabilitiesResponseStructure">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.siri.org.uk/siri}VehicleMonitoringServiceCapabilities" minOccurs="0"/>
 *         &lt;element ref="{http://www.siri.org.uk/siri}VehicleMonitoringPermissions" minOccurs="0"/>
 *         &lt;element ref="{http://www.siri.org.uk/siri}Extensions" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="version" type="{http://www.siri.org.uk/siri}VersionString" default="2.0" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VehicleMonitoringCapabilitiesResponseStructure", propOrder = {
    "vehicleMonitoringServiceCapabilities",
    "vehicleMonitoringPermissions",
    "extensions"
})
public class VehicleMonitoringCapabilitiesResponseStructure
    extends AbstractServiceCapabilitiesResponseStructure
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "VehicleMonitoringServiceCapabilities")
    protected VehicleMonitoringServiceCapabilitiesStructure vehicleMonitoringServiceCapabilities;
    @XmlElement(name = "VehicleMonitoringPermissions")
    protected VehicleMonitoringPermissions vehicleMonitoringPermissions;
    @XmlElement(name = "Extensions")
    protected ExtensionsStructure extensions;
    @XmlAttribute(name = "version")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String version;

    /**
     * Obtient la valeur de la propriété vehicleMonitoringServiceCapabilities.
     * 
     * @return
     *     possible object is
     *     {@link VehicleMonitoringServiceCapabilitiesStructure }
     *     
     */
    public VehicleMonitoringServiceCapabilitiesStructure getVehicleMonitoringServiceCapabilities() {
        return vehicleMonitoringServiceCapabilities;
    }

    /**
     * Définit la valeur de la propriété vehicleMonitoringServiceCapabilities.
     * 
     * @param value
     *     allowed object is
     *     {@link VehicleMonitoringServiceCapabilitiesStructure }
     *     
     */
    public void setVehicleMonitoringServiceCapabilities(VehicleMonitoringServiceCapabilitiesStructure value) {
        this.vehicleMonitoringServiceCapabilities = value;
    }

    public boolean isSetVehicleMonitoringServiceCapabilities() {
        return (this.vehicleMonitoringServiceCapabilities!= null);
    }

    /**
     * Obtient la valeur de la propriété vehicleMonitoringPermissions.
     * 
     * @return
     *     possible object is
     *     {@link VehicleMonitoringPermissions }
     *     
     */
    public VehicleMonitoringPermissions getVehicleMonitoringPermissions() {
        return vehicleMonitoringPermissions;
    }

    /**
     * Définit la valeur de la propriété vehicleMonitoringPermissions.
     * 
     * @param value
     *     allowed object is
     *     {@link VehicleMonitoringPermissions }
     *     
     */
    public void setVehicleMonitoringPermissions(VehicleMonitoringPermissions value) {
        this.vehicleMonitoringPermissions = value;
    }

    public boolean isSetVehicleMonitoringPermissions() {
        return (this.vehicleMonitoringPermissions!= null);
    }

    /**
     * Obtient la valeur de la propriété extensions.
     * 
     * @return
     *     possible object is
     *     {@link ExtensionsStructure }
     *     
     */
    public ExtensionsStructure getExtensions() {
        return extensions;
    }

    /**
     * Définit la valeur de la propriété extensions.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtensionsStructure }
     *     
     */
    public void setExtensions(ExtensionsStructure value) {
        this.extensions = value;
    }

    public boolean isSetExtensions() {
        return (this.extensions!= null);
    }

    /**
     * Obtient la valeur de la propriété version.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVersion() {
        if (version == null) {
            return "2.0";
        } else {
            return version;
        }
    }

    /**
     * Définit la valeur de la propriété version.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVersion(String value) {
        this.version = value;
    }

    public boolean isSetVersion() {
        return (this.version!= null);
    }

}
