
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
 * <p>Classe Java pour FacilityMonitoringCapabilitiesResponseStructure complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="FacilityMonitoringCapabilitiesResponseStructure">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.siri.org.uk/siri}AbstractServiceCapabilitiesResponseStructure">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.siri.org.uk/siri}FacilityMonitoringServiceCapabilities" minOccurs="0"/>
 *         &lt;element ref="{http://www.siri.org.uk/siri}FacilityMonitoringPermissions" minOccurs="0"/>
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
@XmlType(name = "FacilityMonitoringCapabilitiesResponseStructure", propOrder = {
    "facilityMonitoringServiceCapabilities",
    "facilityMonitoringPermissions",
    "extensions"
})
public class FacilityMonitoringCapabilitiesResponseStructure
    extends AbstractServiceCapabilitiesResponseStructure
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "FacilityMonitoringServiceCapabilities")
    protected FacilityMonitoringServiceCapabilitiesStructure facilityMonitoringServiceCapabilities;
    @XmlElement(name = "FacilityMonitoringPermissions")
    protected FacilityMonitoringPermissions facilityMonitoringPermissions;
    @XmlElement(name = "Extensions")
    protected ExtensionsStructure extensions;
    @XmlAttribute(name = "version")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String version;

    /**
     * Obtient la valeur de la propriété facilityMonitoringServiceCapabilities.
     * 
     * @return
     *     possible object is
     *     {@link FacilityMonitoringServiceCapabilitiesStructure }
     *     
     */
    public FacilityMonitoringServiceCapabilitiesStructure getFacilityMonitoringServiceCapabilities() {
        return facilityMonitoringServiceCapabilities;
    }

    /**
     * Définit la valeur de la propriété facilityMonitoringServiceCapabilities.
     * 
     * @param value
     *     allowed object is
     *     {@link FacilityMonitoringServiceCapabilitiesStructure }
     *     
     */
    public void setFacilityMonitoringServiceCapabilities(FacilityMonitoringServiceCapabilitiesStructure value) {
        this.facilityMonitoringServiceCapabilities = value;
    }

    public boolean isSetFacilityMonitoringServiceCapabilities() {
        return (this.facilityMonitoringServiceCapabilities!= null);
    }

    /**
     * Obtient la valeur de la propriété facilityMonitoringPermissions.
     * 
     * @return
     *     possible object is
     *     {@link FacilityMonitoringPermissions }
     *     
     */
    public FacilityMonitoringPermissions getFacilityMonitoringPermissions() {
        return facilityMonitoringPermissions;
    }

    /**
     * Définit la valeur de la propriété facilityMonitoringPermissions.
     * 
     * @param value
     *     allowed object is
     *     {@link FacilityMonitoringPermissions }
     *     
     */
    public void setFacilityMonitoringPermissions(FacilityMonitoringPermissions value) {
        this.facilityMonitoringPermissions = value;
    }

    public boolean isSetFacilityMonitoringPermissions() {
        return (this.facilityMonitoringPermissions!= null);
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
