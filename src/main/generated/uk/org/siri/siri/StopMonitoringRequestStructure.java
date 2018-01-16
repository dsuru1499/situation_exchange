
package uk.org.siri.siri;

import java.io.Serializable;
import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import javax.xml.datatype.Duration;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * Type for Functional Service Request for Stop Monitoring Service.
 * 
 * <p>Classe Java pour StopMonitoringRequestStructure complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="StopMonitoringRequestStructure">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.siri.org.uk/siri}AbstractFunctionalServiceRequestStructure">
 *       &lt;sequence>
 *         &lt;group ref="{http://www.siri.org.uk/siri}StopMonitoringTopicGroup"/>
 *         &lt;group ref="{http://www.siri.org.uk/siri}StopMonitoringRequestPolicyGroup"/>
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
@XmlType(name = "StopMonitoringRequestStructure", propOrder = {
    "previewInterval",
    "startTime",
    "monitoringRef",
    "operatorRef",
    "lineRef",
    "directionRef",
    "destinationRef",
    "stopVisitTypes",
    "language",
    "includeTranslations",
    "maximumStopVisits",
    "minimumStopVisitsPerLine",
    "minimumStopVisitsPerLineVia",
    "maximumTextLength",
    "stopMonitoringDetailLevel",
    "includeSituations",
    "maximumNumberOfCalls",
    "extensions"
})
public class StopMonitoringRequestStructure
    extends AbstractFunctionalServiceRequestStructure
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "PreviewInterval")
    protected Duration previewInterval;
    @XmlElement(name = "StartTime")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar startTime;
    @XmlElement(name = "MonitoringRef", required = true)
    protected MonitoringRefStructure monitoringRef;
    @XmlElement(name = "OperatorRef")
    protected OperatorRefStructure operatorRef;
    @XmlElement(name = "LineRef")
    protected LineRefStructure lineRef;
    @XmlElement(name = "DirectionRef")
    protected DirectionRefStructure directionRef;
    @XmlElement(name = "DestinationRef")
    protected DestinationRefStructure destinationRef;
    @XmlElement(name = "StopVisitTypes", defaultValue = "all")
    protected StopVisitTypeEnumeration stopVisitTypes;
    @XmlElement(name = "Language", defaultValue = "false")
    protected Boolean language;
    @XmlElement(name = "IncludeTranslations")
    protected Boolean includeTranslations;
    @XmlElement(name = "MaximumStopVisits")
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger maximumStopVisits;
    @XmlElement(name = "MinimumStopVisitsPerLine")
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger minimumStopVisitsPerLine;
    @XmlElement(name = "MinimumStopVisitsPerLineVia")
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger minimumStopVisitsPerLineVia;
    @XmlElement(name = "MaximumTextLength", defaultValue = "30")
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger maximumTextLength;
    @XmlElement(name = "StopMonitoringDetailLevel", defaultValue = "normal")
    protected StopMonitoringDetailEnumeration stopMonitoringDetailLevel;
    @XmlElement(name = "IncludeSituations")
    protected Boolean includeSituations;
    @XmlElement(name = "MaximumNumberOfCalls")
    protected uk.org.siri.siri.StopMonitoringFilterStructure.MaximumNumberOfCalls maximumNumberOfCalls;
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
     * Obtient la valeur de la propriété startTime.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getStartTime() {
        return startTime;
    }

    /**
     * Définit la valeur de la propriété startTime.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setStartTime(XMLGregorianCalendar value) {
        this.startTime = value;
    }

    public boolean isSetStartTime() {
        return (this.startTime!= null);
    }

    /**
     * Obtient la valeur de la propriété monitoringRef.
     * 
     * @return
     *     possible object is
     *     {@link MonitoringRefStructure }
     *     
     */
    public MonitoringRefStructure getMonitoringRef() {
        return monitoringRef;
    }

    /**
     * Définit la valeur de la propriété monitoringRef.
     * 
     * @param value
     *     allowed object is
     *     {@link MonitoringRefStructure }
     *     
     */
    public void setMonitoringRef(MonitoringRefStructure value) {
        this.monitoringRef = value;
    }

    public boolean isSetMonitoringRef() {
        return (this.monitoringRef!= null);
    }

    /**
     * Obtient la valeur de la propriété operatorRef.
     * 
     * @return
     *     possible object is
     *     {@link OperatorRefStructure }
     *     
     */
    public OperatorRefStructure getOperatorRef() {
        return operatorRef;
    }

    /**
     * Définit la valeur de la propriété operatorRef.
     * 
     * @param value
     *     allowed object is
     *     {@link OperatorRefStructure }
     *     
     */
    public void setOperatorRef(OperatorRefStructure value) {
        this.operatorRef = value;
    }

    public boolean isSetOperatorRef() {
        return (this.operatorRef!= null);
    }

    /**
     * Obtient la valeur de la propriété lineRef.
     * 
     * @return
     *     possible object is
     *     {@link LineRefStructure }
     *     
     */
    public LineRefStructure getLineRef() {
        return lineRef;
    }

    /**
     * Définit la valeur de la propriété lineRef.
     * 
     * @param value
     *     allowed object is
     *     {@link LineRefStructure }
     *     
     */
    public void setLineRef(LineRefStructure value) {
        this.lineRef = value;
    }

    public boolean isSetLineRef() {
        return (this.lineRef!= null);
    }

    /**
     * Obtient la valeur de la propriété directionRef.
     * 
     * @return
     *     possible object is
     *     {@link DirectionRefStructure }
     *     
     */
    public DirectionRefStructure getDirectionRef() {
        return directionRef;
    }

    /**
     * Définit la valeur de la propriété directionRef.
     * 
     * @param value
     *     allowed object is
     *     {@link DirectionRefStructure }
     *     
     */
    public void setDirectionRef(DirectionRefStructure value) {
        this.directionRef = value;
    }

    public boolean isSetDirectionRef() {
        return (this.directionRef!= null);
    }

    /**
     * Obtient la valeur de la propriété destinationRef.
     * 
     * @return
     *     possible object is
     *     {@link DestinationRefStructure }
     *     
     */
    public DestinationRefStructure getDestinationRef() {
        return destinationRef;
    }

    /**
     * Définit la valeur de la propriété destinationRef.
     * 
     * @param value
     *     allowed object is
     *     {@link DestinationRefStructure }
     *     
     */
    public void setDestinationRef(DestinationRefStructure value) {
        this.destinationRef = value;
    }

    public boolean isSetDestinationRef() {
        return (this.destinationRef!= null);
    }

    /**
     * Obtient la valeur de la propriété stopVisitTypes.
     * 
     * @return
     *     possible object is
     *     {@link StopVisitTypeEnumeration }
     *     
     */
    public StopVisitTypeEnumeration getStopVisitTypes() {
        return stopVisitTypes;
    }

    /**
     * Définit la valeur de la propriété stopVisitTypes.
     * 
     * @param value
     *     allowed object is
     *     {@link StopVisitTypeEnumeration }
     *     
     */
    public void setStopVisitTypes(StopVisitTypeEnumeration value) {
        this.stopVisitTypes = value;
    }

    public boolean isSetStopVisitTypes() {
        return (this.stopVisitTypes!= null);
    }

    /**
     * Obtient la valeur de la propriété language.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isLanguage() {
        return language;
    }

    /**
     * Définit la valeur de la propriété language.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setLanguage(Boolean value) {
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
     * Obtient la valeur de la propriété maximumStopVisits.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getMaximumStopVisits() {
        return maximumStopVisits;
    }

    /**
     * Définit la valeur de la propriété maximumStopVisits.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setMaximumStopVisits(BigInteger value) {
        this.maximumStopVisits = value;
    }

    public boolean isSetMaximumStopVisits() {
        return (this.maximumStopVisits!= null);
    }

    /**
     * Obtient la valeur de la propriété minimumStopVisitsPerLine.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getMinimumStopVisitsPerLine() {
        return minimumStopVisitsPerLine;
    }

    /**
     * Définit la valeur de la propriété minimumStopVisitsPerLine.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setMinimumStopVisitsPerLine(BigInteger value) {
        this.minimumStopVisitsPerLine = value;
    }

    public boolean isSetMinimumStopVisitsPerLine() {
        return (this.minimumStopVisitsPerLine!= null);
    }

    /**
     * Obtient la valeur de la propriété minimumStopVisitsPerLineVia.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getMinimumStopVisitsPerLineVia() {
        return minimumStopVisitsPerLineVia;
    }

    /**
     * Définit la valeur de la propriété minimumStopVisitsPerLineVia.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setMinimumStopVisitsPerLineVia(BigInteger value) {
        this.minimumStopVisitsPerLineVia = value;
    }

    public boolean isSetMinimumStopVisitsPerLineVia() {
        return (this.minimumStopVisitsPerLineVia!= null);
    }

    /**
     * Obtient la valeur de la propriété maximumTextLength.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getMaximumTextLength() {
        return maximumTextLength;
    }

    /**
     * Définit la valeur de la propriété maximumTextLength.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setMaximumTextLength(BigInteger value) {
        this.maximumTextLength = value;
    }

    public boolean isSetMaximumTextLength() {
        return (this.maximumTextLength!= null);
    }

    /**
     * Obtient la valeur de la propriété stopMonitoringDetailLevel.
     * 
     * @return
     *     possible object is
     *     {@link StopMonitoringDetailEnumeration }
     *     
     */
    public StopMonitoringDetailEnumeration getStopMonitoringDetailLevel() {
        return stopMonitoringDetailLevel;
    }

    /**
     * Définit la valeur de la propriété stopMonitoringDetailLevel.
     * 
     * @param value
     *     allowed object is
     *     {@link StopMonitoringDetailEnumeration }
     *     
     */
    public void setStopMonitoringDetailLevel(StopMonitoringDetailEnumeration value) {
        this.stopMonitoringDetailLevel = value;
    }

    public boolean isSetStopMonitoringDetailLevel() {
        return (this.stopMonitoringDetailLevel!= null);
    }

    /**
     * Obtient la valeur de la propriété includeSituations.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIncludeSituations() {
        return includeSituations;
    }

    /**
     * Définit la valeur de la propriété includeSituations.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIncludeSituations(Boolean value) {
        this.includeSituations = value;
    }

    public boolean isSetIncludeSituations() {
        return (this.includeSituations!= null);
    }

    /**
     * Obtient la valeur de la propriété maximumNumberOfCalls.
     * 
     * @return
     *     possible object is
     *     {@link uk.org.siri.siri.StopMonitoringFilterStructure.MaximumNumberOfCalls }
     *     
     */
    public uk.org.siri.siri.StopMonitoringFilterStructure.MaximumNumberOfCalls getMaximumNumberOfCalls() {
        return maximumNumberOfCalls;
    }

    /**
     * Définit la valeur de la propriété maximumNumberOfCalls.
     * 
     * @param value
     *     allowed object is
     *     {@link uk.org.siri.siri.StopMonitoringFilterStructure.MaximumNumberOfCalls }
     *     
     */
    public void setMaximumNumberOfCalls(uk.org.siri.siri.StopMonitoringFilterStructure.MaximumNumberOfCalls value) {
        this.maximumNumberOfCalls = value;
    }

    public boolean isSetMaximumNumberOfCalls() {
        return (this.maximumNumberOfCalls!= null);
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
