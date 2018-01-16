
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
 * Type for Delivery for ProductionTimetable Capability.
 * 
 * <p>Classe Java pour ProductionTimetableCapabilitiesResponseStructure complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="ProductionTimetableCapabilitiesResponseStructure">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.siri.org.uk/siri}AbstractServiceCapabilitiesResponseStructure">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.siri.org.uk/siri}ProductionTimetableServiceCapabilities" minOccurs="0"/>
 *         &lt;element ref="{http://www.siri.org.uk/siri}ProductionTimetablePermissions" minOccurs="0"/>
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
@XmlType(name = "ProductionTimetableCapabilitiesResponseStructure", propOrder = {
    "productionTimetableServiceCapabilities",
    "productionTimetablePermissions",
    "extensions"
})
public class ProductionTimetableCapabilitiesResponseStructure
    extends AbstractServiceCapabilitiesResponseStructure
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "ProductionTimetableServiceCapabilities")
    protected ProductionTimetableServiceCapabilitiesStructure productionTimetableServiceCapabilities;
    @XmlElement(name = "ProductionTimetablePermissions")
    protected ProductionTimetablePermissions productionTimetablePermissions;
    @XmlElement(name = "Extensions")
    protected ExtensionsStructure extensions;
    @XmlAttribute(name = "version")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String version;

    /**
     * Obtient la valeur de la propriété productionTimetableServiceCapabilities.
     * 
     * @return
     *     possible object is
     *     {@link ProductionTimetableServiceCapabilitiesStructure }
     *     
     */
    public ProductionTimetableServiceCapabilitiesStructure getProductionTimetableServiceCapabilities() {
        return productionTimetableServiceCapabilities;
    }

    /**
     * Définit la valeur de la propriété productionTimetableServiceCapabilities.
     * 
     * @param value
     *     allowed object is
     *     {@link ProductionTimetableServiceCapabilitiesStructure }
     *     
     */
    public void setProductionTimetableServiceCapabilities(ProductionTimetableServiceCapabilitiesStructure value) {
        this.productionTimetableServiceCapabilities = value;
    }

    public boolean isSetProductionTimetableServiceCapabilities() {
        return (this.productionTimetableServiceCapabilities!= null);
    }

    /**
     * Obtient la valeur de la propriété productionTimetablePermissions.
     * 
     * @return
     *     possible object is
     *     {@link ProductionTimetablePermissions }
     *     
     */
    public ProductionTimetablePermissions getProductionTimetablePermissions() {
        return productionTimetablePermissions;
    }

    /**
     * Définit la valeur de la propriété productionTimetablePermissions.
     * 
     * @param value
     *     allowed object is
     *     {@link ProductionTimetablePermissions }
     *     
     */
    public void setProductionTimetablePermissions(ProductionTimetablePermissions value) {
        this.productionTimetablePermissions = value;
    }

    public boolean isSetProductionTimetablePermissions() {
        return (this.productionTimetablePermissions!= null);
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
