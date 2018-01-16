
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
 * Type for Delivery for Estimated Timetable Capability.
 * 
 * <p>Classe Java pour EstimatedTimetableCapabilitiesResponseStructure complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="EstimatedTimetableCapabilitiesResponseStructure">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.siri.org.uk/siri}AbstractServiceCapabilitiesResponseStructure">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.siri.org.uk/siri}EstimatedTimetableServiceCapabilities" minOccurs="0"/>
 *         &lt;element ref="{http://www.siri.org.uk/siri}EstimatedTimetablePermissions" minOccurs="0"/>
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
@XmlType(name = "EstimatedTimetableCapabilitiesResponseStructure", propOrder = {
    "estimatedTimetableServiceCapabilities",
    "estimatedTimetablePermissions",
    "extensions"
})
public class EstimatedTimetableCapabilitiesResponseStructure
    extends AbstractServiceCapabilitiesResponseStructure
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "EstimatedTimetableServiceCapabilities")
    protected EstimatedTimetableServiceCapabilitiesStructure estimatedTimetableServiceCapabilities;
    @XmlElement(name = "EstimatedTimetablePermissions")
    protected EstimatedTimetablePermissions estimatedTimetablePermissions;
    @XmlElement(name = "Extensions")
    protected ExtensionsStructure extensions;
    @XmlAttribute(name = "version")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String version;

    /**
     * Obtient la valeur de la propriété estimatedTimetableServiceCapabilities.
     * 
     * @return
     *     possible object is
     *     {@link EstimatedTimetableServiceCapabilitiesStructure }
     *     
     */
    public EstimatedTimetableServiceCapabilitiesStructure getEstimatedTimetableServiceCapabilities() {
        return estimatedTimetableServiceCapabilities;
    }

    /**
     * Définit la valeur de la propriété estimatedTimetableServiceCapabilities.
     * 
     * @param value
     *     allowed object is
     *     {@link EstimatedTimetableServiceCapabilitiesStructure }
     *     
     */
    public void setEstimatedTimetableServiceCapabilities(EstimatedTimetableServiceCapabilitiesStructure value) {
        this.estimatedTimetableServiceCapabilities = value;
    }

    public boolean isSetEstimatedTimetableServiceCapabilities() {
        return (this.estimatedTimetableServiceCapabilities!= null);
    }

    /**
     * Obtient la valeur de la propriété estimatedTimetablePermissions.
     * 
     * @return
     *     possible object is
     *     {@link EstimatedTimetablePermissions }
     *     
     */
    public EstimatedTimetablePermissions getEstimatedTimetablePermissions() {
        return estimatedTimetablePermissions;
    }

    /**
     * Définit la valeur de la propriété estimatedTimetablePermissions.
     * 
     * @param value
     *     allowed object is
     *     {@link EstimatedTimetablePermissions }
     *     
     */
    public void setEstimatedTimetablePermissions(EstimatedTimetablePermissions value) {
        this.estimatedTimetablePermissions = value;
    }

    public boolean isSetEstimatedTimetablePermissions() {
        return (this.estimatedTimetablePermissions!= null);
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
