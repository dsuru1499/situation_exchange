
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
 * Type for Delivery for Stop Timetable Service.
 * 
 * <p>Classe Java pour StopTimetableCapabilitiesResponseStructure complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="StopTimetableCapabilitiesResponseStructure">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.siri.org.uk/siri}AbstractServiceCapabilitiesResponseStructure">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.siri.org.uk/siri}StopTimetableServiceCapabilities" minOccurs="0"/>
 *         &lt;element ref="{http://www.siri.org.uk/siri}StopTimetablePermissions" minOccurs="0"/>
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
@XmlType(name = "StopTimetableCapabilitiesResponseStructure", propOrder = {
    "stopTimetableServiceCapabilities",
    "stopTimetablePermissions",
    "extensions"
})
public class StopTimetableCapabilitiesResponseStructure
    extends AbstractServiceCapabilitiesResponseStructure
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "StopTimetableServiceCapabilities")
    protected StopTimetableServiceCapabilitiesStructure stopTimetableServiceCapabilities;
    @XmlElement(name = "StopTimetablePermissions")
    protected StopTimetablePermissions stopTimetablePermissions;
    @XmlElement(name = "Extensions")
    protected ExtensionsStructure extensions;
    @XmlAttribute(name = "version")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String version;

    /**
     * Obtient la valeur de la propriété stopTimetableServiceCapabilities.
     * 
     * @return
     *     possible object is
     *     {@link StopTimetableServiceCapabilitiesStructure }
     *     
     */
    public StopTimetableServiceCapabilitiesStructure getStopTimetableServiceCapabilities() {
        return stopTimetableServiceCapabilities;
    }

    /**
     * Définit la valeur de la propriété stopTimetableServiceCapabilities.
     * 
     * @param value
     *     allowed object is
     *     {@link StopTimetableServiceCapabilitiesStructure }
     *     
     */
    public void setStopTimetableServiceCapabilities(StopTimetableServiceCapabilitiesStructure value) {
        this.stopTimetableServiceCapabilities = value;
    }

    public boolean isSetStopTimetableServiceCapabilities() {
        return (this.stopTimetableServiceCapabilities!= null);
    }

    /**
     * Obtient la valeur de la propriété stopTimetablePermissions.
     * 
     * @return
     *     possible object is
     *     {@link StopTimetablePermissions }
     *     
     */
    public StopTimetablePermissions getStopTimetablePermissions() {
        return stopTimetablePermissions;
    }

    /**
     * Définit la valeur de la propriété stopTimetablePermissions.
     * 
     * @param value
     *     allowed object is
     *     {@link StopTimetablePermissions }
     *     
     */
    public void setStopTimetablePermissions(StopTimetablePermissions value) {
        this.stopTimetablePermissions = value;
    }

    public boolean isSetStopTimetablePermissions() {
        return (this.stopTimetablePermissions!= null);
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
