
package uk.org.siri.siri;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * Type for Delivery for Connection TimetableService.
 * 
 * <p>Classe Java pour ConnectionTimetableCapabilitiesResponseStructure complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="ConnectionTimetableCapabilitiesResponseStructure">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.siri.org.uk/siri}AbstractServiceCapabilitiesResponseStructure">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.siri.org.uk/siri}ConnectionTimetableServiceCapabilities" minOccurs="0"/>
 *         &lt;element name="ConnectionTimetablePermissions" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;extension base="{http://www.siri.org.uk/siri}PermissionsStructure">
 *                 &lt;sequence>
 *                   &lt;element name="ConnectionTimetablePermission" type="{http://www.siri.org.uk/siri}ConnectionServicePermissionStructure" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/extension>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
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
@XmlType(name = "ConnectionTimetableCapabilitiesResponseStructure", propOrder = {
    "connectionTimetableServiceCapabilities",
    "connectionTimetablePermissions",
    "extensions"
})
public class ConnectionTimetableCapabilitiesResponseStructure
    extends AbstractServiceCapabilitiesResponseStructure
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "ConnectionTimetableServiceCapabilities")
    protected ConnectionTimetableServiceCapabilitiesStructure connectionTimetableServiceCapabilities;
    @XmlElement(name = "ConnectionTimetablePermissions")
    protected ConnectionTimetableCapabilitiesResponseStructure.ConnectionTimetablePermissions connectionTimetablePermissions;
    @XmlElement(name = "Extensions")
    protected ExtensionsStructure extensions;
    @XmlAttribute(name = "version")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String version;

    /**
     * Obtient la valeur de la propriété connectionTimetableServiceCapabilities.
     * 
     * @return
     *     possible object is
     *     {@link ConnectionTimetableServiceCapabilitiesStructure }
     *     
     */
    public ConnectionTimetableServiceCapabilitiesStructure getConnectionTimetableServiceCapabilities() {
        return connectionTimetableServiceCapabilities;
    }

    /**
     * Définit la valeur de la propriété connectionTimetableServiceCapabilities.
     * 
     * @param value
     *     allowed object is
     *     {@link ConnectionTimetableServiceCapabilitiesStructure }
     *     
     */
    public void setConnectionTimetableServiceCapabilities(ConnectionTimetableServiceCapabilitiesStructure value) {
        this.connectionTimetableServiceCapabilities = value;
    }

    public boolean isSetConnectionTimetableServiceCapabilities() {
        return (this.connectionTimetableServiceCapabilities!= null);
    }

    /**
     * Obtient la valeur de la propriété connectionTimetablePermissions.
     * 
     * @return
     *     possible object is
     *     {@link ConnectionTimetableCapabilitiesResponseStructure.ConnectionTimetablePermissions }
     *     
     */
    public ConnectionTimetableCapabilitiesResponseStructure.ConnectionTimetablePermissions getConnectionTimetablePermissions() {
        return connectionTimetablePermissions;
    }

    /**
     * Définit la valeur de la propriété connectionTimetablePermissions.
     * 
     * @param value
     *     allowed object is
     *     {@link ConnectionTimetableCapabilitiesResponseStructure.ConnectionTimetablePermissions }
     *     
     */
    public void setConnectionTimetablePermissions(ConnectionTimetableCapabilitiesResponseStructure.ConnectionTimetablePermissions value) {
        this.connectionTimetablePermissions = value;
    }

    public boolean isSetConnectionTimetablePermissions() {
        return (this.connectionTimetablePermissions!= null);
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
     *         &lt;element name="ConnectionTimetablePermission" type="{http://www.siri.org.uk/siri}ConnectionServicePermissionStructure" maxOccurs="unbounded" minOccurs="0"/>
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
        "connectionTimetablePermission"
    })
    public static class ConnectionTimetablePermissions
        extends PermissionsStructure
        implements Serializable
    {

        private final static long serialVersionUID = 1L;
        @XmlElement(name = "ConnectionTimetablePermission")
        protected List<ConnectionServicePermissionStructure> connectionTimetablePermission;

        /**
         * Gets the value of the connectionTimetablePermission property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the connectionTimetablePermission property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getConnectionTimetablePermission().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link ConnectionServicePermissionStructure }
         * 
         * 
         */
        public List<ConnectionServicePermissionStructure> getConnectionTimetablePermission() {
            if (connectionTimetablePermission == null) {
                connectionTimetablePermission = new ArrayList<ConnectionServicePermissionStructure>();
            }
            return this.connectionTimetablePermission;
        }

        public boolean isSetConnectionTimetablePermission() {
            return ((this.connectionTimetablePermission!= null)&&(!this.connectionTimetablePermission.isEmpty()));
        }

        public void unsetConnectionTimetablePermission() {
            this.connectionTimetablePermission = null;
        }

    }

}
