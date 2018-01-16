
package uk.org.siri.siri;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import javax.xml.datatype.Duration;


/**
 * Type for Request Connection Monitoring Service.
 * 
 * <p>Classe Java pour ConnectionMonitoringRequestStructure complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="ConnectionMonitoringRequestStructure">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.siri.org.uk/siri}AbstractFunctionalServiceRequestStructure">
 *       &lt;sequence>
 *         &lt;group ref="{http://www.siri.org.uk/siri}ConnectionMonitoringTopicGroup"/>
 *         &lt;group ref="{http://www.siri.org.uk/siri}ConnectionMonitoringRequestPolicyGroup"/>
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
@XmlType(name = "ConnectionMonitoringRequestStructure", propOrder = {
    "previewInterval",
    "connectionLinkRef",
    "connectingTimeFilter",
    "connectingJourneyFilter",
    "language",
    "includeTranslations",
    "connectionMonitoringDetailLevel",
    "extensions"
})
public class ConnectionMonitoringRequestStructure
    extends AbstractFunctionalServiceRequestStructure
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "PreviewInterval")
    protected Duration previewInterval;
    @XmlElement(name = "ConnectionLinkRef", required = true)
    protected ConnectionLinkRefStructure connectionLinkRef;
    @XmlElement(name = "ConnectingTimeFilter")
    protected ConnectingTimeFilterStructure connectingTimeFilter;
    @XmlElement(name = "ConnectingJourneyFilter")
    protected List<ConnectingJourneyFilterStructure> connectingJourneyFilter;
    @XmlElement(name = "Language", defaultValue = "en")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "language")
    protected String language;
    @XmlElement(name = "IncludeTranslations")
    protected Boolean includeTranslations;
    @XmlElement(name = "ConnectionMonitoringDetailLevel", defaultValue = "normal")
    protected ConnectionMonitoringDetailEnumeration connectionMonitoringDetailLevel;
    @XmlElement(name = "Extensions")
    protected ExtensionsStructure extensions;
    @XmlAttribute(name = "version")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String version;

    /**
     * Obtient la valeur de la propriété previewInterval.
     * 
     * @return
     *     possible object is
     *     {@link Duration }
     *     
     */
    public Duration getPreviewInterval() {
        return previewInterval;
    }

    /**
     * Définit la valeur de la propriété previewInterval.
     * 
     * @param value
     *     allowed object is
     *     {@link Duration }
     *     
     */
    public void setPreviewInterval(Duration value) {
        this.previewInterval = value;
    }

    public boolean isSetPreviewInterval() {
        return (this.previewInterval!= null);
    }

    /**
     * Obtient la valeur de la propriété connectionLinkRef.
     * 
     * @return
     *     possible object is
     *     {@link ConnectionLinkRefStructure }
     *     
     */
    public ConnectionLinkRefStructure getConnectionLinkRef() {
        return connectionLinkRef;
    }

    /**
     * Définit la valeur de la propriété connectionLinkRef.
     * 
     * @param value
     *     allowed object is
     *     {@link ConnectionLinkRefStructure }
     *     
     */
    public void setConnectionLinkRef(ConnectionLinkRefStructure value) {
        this.connectionLinkRef = value;
    }

    public boolean isSetConnectionLinkRef() {
        return (this.connectionLinkRef!= null);
    }

    /**
     * Obtient la valeur de la propriété connectingTimeFilter.
     * 
     * @return
     *     possible object is
     *     {@link ConnectingTimeFilterStructure }
     *     
     */
    public ConnectingTimeFilterStructure getConnectingTimeFilter() {
        return connectingTimeFilter;
    }

    /**
     * Définit la valeur de la propriété connectingTimeFilter.
     * 
     * @param value
     *     allowed object is
     *     {@link ConnectingTimeFilterStructure }
     *     
     */
    public void setConnectingTimeFilter(ConnectingTimeFilterStructure value) {
        this.connectingTimeFilter = value;
    }

    public boolean isSetConnectingTimeFilter() {
        return (this.connectingTimeFilter!= null);
    }

    /**
     * Gets the value of the connectingJourneyFilter property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the connectingJourneyFilter property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getConnectingJourneyFilter().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ConnectingJourneyFilterStructure }
     * 
     * 
     */
    public List<ConnectingJourneyFilterStructure> getConnectingJourneyFilter() {
        if (connectingJourneyFilter == null) {
            connectingJourneyFilter = new ArrayList<ConnectingJourneyFilterStructure>();
        }
        return this.connectingJourneyFilter;
    }

    public boolean isSetConnectingJourneyFilter() {
        return ((this.connectingJourneyFilter!= null)&&(!this.connectingJourneyFilter.isEmpty()));
    }

    public void unsetConnectingJourneyFilter() {
        this.connectingJourneyFilter = null;
    }

    /**
     * Obtient la valeur de la propriété language.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLanguage() {
        return language;
    }

    /**
     * Définit la valeur de la propriété language.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLanguage(String value) {
        this.language = value;
    }

    public boolean isSetLanguage() {
        return (this.language!= null);
    }

    /**
     * Obtient la valeur de la propriété includeTranslations.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIncludeTranslations() {
        return includeTranslations;
    }

    /**
     * Définit la valeur de la propriété includeTranslations.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIncludeTranslations(Boolean value) {
        this.includeTranslations = value;
    }

    public boolean isSetIncludeTranslations() {
        return (this.includeTranslations!= null);
    }

    /**
     * Obtient la valeur de la propriété connectionMonitoringDetailLevel.
     * 
     * @return
     *     possible object is
     *     {@link ConnectionMonitoringDetailEnumeration }
     *     
     */
    public ConnectionMonitoringDetailEnumeration getConnectionMonitoringDetailLevel() {
        return connectionMonitoringDetailLevel;
    }

    /**
     * Définit la valeur de la propriété connectionMonitoringDetailLevel.
     * 
     * @param value
     *     allowed object is
     *     {@link ConnectionMonitoringDetailEnumeration }
     *     
     */
    public void setConnectionMonitoringDetailLevel(ConnectionMonitoringDetailEnumeration value) {
        this.connectionMonitoringDetailLevel = value;
    }

    public boolean isSetConnectionMonitoringDetailLevel() {
        return (this.connectionMonitoringDetailLevel!= null);
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
