
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
 * Type for Delivery for Situation Exchange Service.
 * 
 * <p>Classe Java pour SituationExchangeCapabilitiesResponseStructure complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="SituationExchangeCapabilitiesResponseStructure">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.siri.org.uk/siri}AbstractServiceCapabilitiesResponseStructure">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.siri.org.uk/siri}SituationExchangeServiceCapabilities" minOccurs="0"/>
 *         &lt;element ref="{http://www.siri.org.uk/siri}SituationExchangePermissions" minOccurs="0"/>
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
@XmlType(name = "SituationExchangeCapabilitiesResponseStructure", propOrder = {
    "situationExchangeServiceCapabilities",
    "situationExchangePermissions",
    "extensions"
})
public class SituationExchangeCapabilitiesResponseStructure
    extends AbstractServiceCapabilitiesResponseStructure
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "SituationExchangeServiceCapabilities")
    protected SituationExchangeServiceCapabilitiesStructure situationExchangeServiceCapabilities;
    @XmlElement(name = "SituationExchangePermissions")
    protected SituationExchangePermissions situationExchangePermissions;
    @XmlElement(name = "Extensions")
    protected ExtensionsStructure extensions;
    @XmlAttribute(name = "version")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String version;

    /**
     * Obtient la valeur de la propriété situationExchangeServiceCapabilities.
     * 
     * @return
     *     possible object is
     *     {@link SituationExchangeServiceCapabilitiesStructure }
     *     
     */
    public SituationExchangeServiceCapabilitiesStructure getSituationExchangeServiceCapabilities() {
        return situationExchangeServiceCapabilities;
    }

    /**
     * Définit la valeur de la propriété situationExchangeServiceCapabilities.
     * 
     * @param value
     *     allowed object is
     *     {@link SituationExchangeServiceCapabilitiesStructure }
     *     
     */
    public void setSituationExchangeServiceCapabilities(SituationExchangeServiceCapabilitiesStructure value) {
        this.situationExchangeServiceCapabilities = value;
    }

    public boolean isSetSituationExchangeServiceCapabilities() {
        return (this.situationExchangeServiceCapabilities!= null);
    }

    /**
     * Obtient la valeur de la propriété situationExchangePermissions.
     * 
     * @return
     *     possible object is
     *     {@link SituationExchangePermissions }
     *     
     */
    public SituationExchangePermissions getSituationExchangePermissions() {
        return situationExchangePermissions;
    }

    /**
     * Définit la valeur de la propriété situationExchangePermissions.
     * 
     * @param value
     *     allowed object is
     *     {@link SituationExchangePermissions }
     *     
     */
    public void setSituationExchangePermissions(SituationExchangePermissions value) {
        this.situationExchangePermissions = value;
    }

    public boolean isSetSituationExchangePermissions() {
        return (this.situationExchangePermissions!= null);
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
