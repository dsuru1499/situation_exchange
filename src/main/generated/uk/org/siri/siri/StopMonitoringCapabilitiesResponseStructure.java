
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
 * Type for Delivery for Stop Monitoring Service.
 * 
 * <p>Classe Java pour StopMonitoringCapabilitiesResponseStructure complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="StopMonitoringCapabilitiesResponseStructure">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.siri.org.uk/siri}AbstractServiceCapabilitiesResponseStructure">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.siri.org.uk/siri}StopMonitoringServiceCapabilities" minOccurs="0"/>
 *         &lt;element ref="{http://www.siri.org.uk/siri}StopMonitoringPermissions" minOccurs="0"/>
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
@XmlType(name = "StopMonitoringCapabilitiesResponseStructure", propOrder = {
    "stopMonitoringServiceCapabilities",
    "stopMonitoringPermissions",
    "extensions"
})
public class StopMonitoringCapabilitiesResponseStructure
    extends AbstractServiceCapabilitiesResponseStructure
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "StopMonitoringServiceCapabilities")
    protected StopMonitoringServiceCapabilitiesStructure stopMonitoringServiceCapabilities;
    @XmlElement(name = "StopMonitoringPermissions")
    protected StopMonitoringPermissions stopMonitoringPermissions;
    @XmlElement(name = "Extensions")
    protected ExtensionsStructure extensions;
    @XmlAttribute(name = "version")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String version;

    /**
     * Obtient la valeur de la propriété stopMonitoringServiceCapabilities.
     * 
     * @return
     *     possible object is
     *     {@link StopMonitoringServiceCapabilitiesStructure }
     *     
     */
    public StopMonitoringServiceCapabilitiesStructure getStopMonitoringServiceCapabilities() {
        return stopMonitoringServiceCapabilities;
    }

    /**
     * Définit la valeur de la propriété stopMonitoringServiceCapabilities.
     * 
     * @param value
     *     allowed object is
     *     {@link StopMonitoringServiceCapabilitiesStructure }
     *     
     */
    public void setStopMonitoringServiceCapabilities(StopMonitoringServiceCapabilitiesStructure value) {
        this.stopMonitoringServiceCapabilities = value;
    }

    public boolean isSetStopMonitoringServiceCapabilities() {
        return (this.stopMonitoringServiceCapabilities!= null);
    }

    /**
     * Obtient la valeur de la propriété stopMonitoringPermissions.
     * 
     * @return
     *     possible object is
     *     {@link StopMonitoringPermissions }
     *     
     */
    public StopMonitoringPermissions getStopMonitoringPermissions() {
        return stopMonitoringPermissions;
    }

    /**
     * Définit la valeur de la propriété stopMonitoringPermissions.
     * 
     * @param value
     *     allowed object is
     *     {@link StopMonitoringPermissions }
     *     
     */
    public void setStopMonitoringPermissions(StopMonitoringPermissions value) {
        this.stopMonitoringPermissions = value;
    }

    public boolean isSetStopMonitoringPermissions() {
        return (this.stopMonitoringPermissions!= null);
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
