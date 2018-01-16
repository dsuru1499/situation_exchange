
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
 * Type for Delivery for Connection Monitoring Capability.
 * 
 * <p>Classe Java pour ConnectionMonitoringCapabilitiesResponseStructure complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="ConnectionMonitoringCapabilitiesResponseStructure">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.siri.org.uk/siri}AbstractServiceCapabilitiesResponseStructure">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.siri.org.uk/siri}ConnectionMonitoringServiceCapabilities" minOccurs="0"/>
 *         &lt;element ref="{http://www.siri.org.uk/siri}ConnectionMonitoringPermissions" minOccurs="0"/>
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
@XmlType(name = "ConnectionMonitoringCapabilitiesResponseStructure", propOrder = {
    "connectionMonitoringServiceCapabilities",
    "connectionMonitoringPermissions",
    "extensions"
})
public class ConnectionMonitoringCapabilitiesResponseStructure
    extends AbstractServiceCapabilitiesResponseStructure
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "ConnectionMonitoringServiceCapabilities")
    protected ConnectionMonitoringServiceCapabilitiesStructure connectionMonitoringServiceCapabilities;
    @XmlElement(name = "ConnectionMonitoringPermissions")
    protected ConnectionMonitoringPermissions connectionMonitoringPermissions;
    @XmlElement(name = "Extensions")
    protected ExtensionsStructure extensions;
    @XmlAttribute(name = "version")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String version;

    /**
     * Obtient la valeur de la propriété connectionMonitoringServiceCapabilities.
     * 
     * @return
     *     possible object is
     *     {@link ConnectionMonitoringServiceCapabilitiesStructure }
     *     
     */
    public ConnectionMonitoringServiceCapabilitiesStructure getConnectionMonitoringServiceCapabilities() {
        return connectionMonitoringServiceCapabilities;
    }

    /**
     * Définit la valeur de la propriété connectionMonitoringServiceCapabilities.
     * 
     * @param value
     *     allowed object is
     *     {@link ConnectionMonitoringServiceCapabilitiesStructure }
     *     
     */
    public void setConnectionMonitoringServiceCapabilities(ConnectionMonitoringServiceCapabilitiesStructure value) {
        this.connectionMonitoringServiceCapabilities = value;
    }

    public boolean isSetConnectionMonitoringServiceCapabilities() {
        return (this.connectionMonitoringServiceCapabilities!= null);
    }

    /**
     * Obtient la valeur de la propriété connectionMonitoringPermissions.
     * 
     * @return
     *     possible object is
     *     {@link ConnectionMonitoringPermissions }
     *     
     */
    public ConnectionMonitoringPermissions getConnectionMonitoringPermissions() {
        return connectionMonitoringPermissions;
    }

    /**
     * Définit la valeur de la propriété connectionMonitoringPermissions.
     * 
     * @param value
     *     allowed object is
     *     {@link ConnectionMonitoringPermissions }
     *     
     */
    public void setConnectionMonitoringPermissions(ConnectionMonitoringPermissions value) {
        this.connectionMonitoringPermissions = value;
    }

    public boolean isSetConnectionMonitoringPermissions() {
        return (this.connectionMonitoringPermissions!= null);
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
