
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
 * Type for Delivery for General MessageService.
 * 
 * <p>Classe Java pour GeneralMessageCapabilitiesResponseStructure complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="GeneralMessageCapabilitiesResponseStructure">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.siri.org.uk/siri}AbstractServiceCapabilitiesResponseStructure">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.siri.org.uk/siri}GeneralMessageServiceCapabilities" minOccurs="0"/>
 *         &lt;element ref="{http://www.siri.org.uk/siri}GeneralMessagePermissions" minOccurs="0"/>
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
@XmlType(name = "GeneralMessageCapabilitiesResponseStructure", propOrder = {
    "generalMessageServiceCapabilities",
    "generalMessagePermissions",
    "extensions"
})
public class GeneralMessageCapabilitiesResponseStructure
    extends AbstractServiceCapabilitiesResponseStructure
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "GeneralMessageServiceCapabilities")
    protected GeneralMessageServiceCapabilitiesStructure generalMessageServiceCapabilities;
    @XmlElement(name = "GeneralMessagePermissions")
    protected GeneralMessagePermissions generalMessagePermissions;
    @XmlElement(name = "Extensions")
    protected ExtensionsStructure extensions;
    @XmlAttribute(name = "version")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String version;

    /**
     * Obtient la valeur de la propriété generalMessageServiceCapabilities.
     * 
     * @return
     *     possible object is
     *     {@link GeneralMessageServiceCapabilitiesStructure }
     *     
     */
    public GeneralMessageServiceCapabilitiesStructure getGeneralMessageServiceCapabilities() {
        return generalMessageServiceCapabilities;
    }

    /**
     * Définit la valeur de la propriété generalMessageServiceCapabilities.
     * 
     * @param value
     *     allowed object is
     *     {@link GeneralMessageServiceCapabilitiesStructure }
     *     
     */
    public void setGeneralMessageServiceCapabilities(GeneralMessageServiceCapabilitiesStructure value) {
        this.generalMessageServiceCapabilities = value;
    }

    public boolean isSetGeneralMessageServiceCapabilities() {
        return (this.generalMessageServiceCapabilities!= null);
    }

    /**
     * Obtient la valeur de la propriété generalMessagePermissions.
     * 
     * @return
     *     possible object is
     *     {@link GeneralMessagePermissions }
     *     
     */
    public GeneralMessagePermissions getGeneralMessagePermissions() {
        return generalMessagePermissions;
    }

    /**
     * Définit la valeur de la propriété generalMessagePermissions.
     * 
     * @param value
     *     allowed object is
     *     {@link GeneralMessagePermissions }
     *     
     */
    public void setGeneralMessagePermissions(GeneralMessagePermissions value) {
        this.generalMessagePermissions = value;
    }

    public boolean isSetGeneralMessagePermissions() {
        return (this.generalMessagePermissions!= null);
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
