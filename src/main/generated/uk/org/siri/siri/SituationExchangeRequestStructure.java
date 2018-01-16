
package uk.org.siri.siri;

import java.io.Serializable;
import java.math.BigInteger;
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
import javax.xml.datatype.XMLGregorianCalendar;
import eu.datex2.schema._2_0rc1._2_0.InformationStatusEnum;
import uk.org.ifopt.acsb.PassengerAccessibilityNeedsStructure;
import uk.org.ifopt.ifopt.AccessModesEnumeration;
import uk.org.ifopt.ifopt.CountryRefStructure;
import uk.org.ifopt.ifopt.StopPlaceRefStructure;
import uk.org.ifopt.ifopt.StopPlaceSpaceRefStructure;


/**
 * Type for Functional Service Request for Situation Exchange Service.
 * 
 * <p>Classe Java pour SituationExchangeRequestStructure complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="SituationExchangeRequestStructure">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.siri.org.uk/siri}AbstractFunctionalServiceRequestStructure">
 *       &lt;sequence>
 *         &lt;group ref="{http://www.siri.org.uk/siri}SituationExchangeTopicGroup"/>
 *         &lt;group ref="{http://www.siri.org.uk/siri}SituationExchangeRequestPolicyGroup"/>
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
@XmlType(name = "SituationExchangeRequestStructure", propOrder = {
    "previewInterval",
    "startTime",
    "validityPeriod",
    "includeOnlyIfInPublicationWindow",
    "vehicleMode",
    "airSubmode",
    "busSubmode",
    "coachSubmode",
    "metroSubmode",
    "railSubmode",
    "tramSubmode",
    "waterSubmode",
    "accessMode",
    "severity",
    "scope",
    "predictability",
    "keywords",
    "verification",
    "progress",
    "reality",
    "operatorRef",
    "operationalUnitRef",
    "networkRef",
    "lineRef",
    "lines",
    "stopPointRef",
    "connectionLinkRef",
    "facilityRef",
    "stopPlaceRef",
    "stopPlaceComponentRef",
    "framedVehicleJourneyRef",
    "vehicleJourneyRef",
    "interchangeRef",
    "vehicleRef",
    "countryRef",
    "placeRef",
    "location",
    "situationRoadFilter",
    "accessibilityNeedFilter",
    "language",
    "includeTranslations",
    "maximumNumberOfSituationElements",
    "extensions"
})
public class SituationExchangeRequestStructure
    extends AbstractFunctionalServiceRequestStructure
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "PreviewInterval")
    protected Duration previewInterval;
    @XmlElement(name = "StartTime")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar startTime;
    @XmlElement(name = "ValidityPeriod")
    protected HalfOpenTimestampInputRangeStructure validityPeriod;
    @XmlElement(name = "IncludeOnlyIfInPublicationWindow", defaultValue = "false")
    protected Boolean includeOnlyIfInPublicationWindow;
    @XmlElement(name = "VehicleMode", defaultValue = "unknown")
    protected VehicleModesOfTransportEnumeration vehicleMode;
    @XmlElement(name = "AirSubmode", defaultValue = "unknown")
    protected AirSubmodesOfTransportEnumeration airSubmode;
    @XmlElement(name = "BusSubmode", defaultValue = "unknown")
    protected BusSubmodesOfTransportEnumeration busSubmode;
    @XmlElement(name = "CoachSubmode", defaultValue = "unknown")
    protected CoachSubmodesOfTransportEnumeration coachSubmode;
    @XmlElement(name = "MetroSubmode", defaultValue = "unknown")
    protected MetroSubmodesOfTransportEnumeration metroSubmode;
    @XmlElement(name = "RailSubmode", defaultValue = "unknown")
    protected RailSubmodesOfTransportEnumeration railSubmode;
    @XmlElement(name = "TramSubmode", defaultValue = "unknown")
    protected TramSubmodesOfTransportEnumeration tramSubmode;
    @XmlElement(name = "WaterSubmode", defaultValue = "unknown")
    protected WaterSubmodesOfTransportEnumeration waterSubmode;
    @XmlElement(name = "AccessMode")
    protected AccessModesEnumeration accessMode;
    @XmlElement(name = "Severity")
    protected SeverityEnumeration severity;
    @XmlElement(name = "Scope")
    protected List<ScopeTypeEnumeration> scope;
    @XmlElement(name = "Predictability")
    protected PredictabilityEnumeration predictability;
    @XmlElement(name = "Keywords")
    protected String keywords;
    @XmlElement(name = "Verification")
    protected VerificationStatusEnumeration verification;
    @XmlElement(name = "Progress", defaultValue = "open")
    protected List<WorkflowStatusEnumeration> progress;
    @XmlElement(name = "Reality")
    protected InformationStatusEnum reality;
    @XmlElement(name = "OperatorRef")
    protected OperatorRefStructure operatorRef;
    @XmlElement(name = "OperationalUnitRef")
    protected List<OperationalUnitRefStructure> operationalUnitRef;
    @XmlElement(name = "NetworkRef")
    protected OperatorRefStructure networkRef;
    @XmlElement(name = "LineRef")
    protected List<LineRefStructure> lineRef;
    @XmlElement(name = "Lines")
    protected SituationExchangeRequestStructure.Lines lines;
    @XmlElement(name = "StopPointRef")
    protected List<StopPointRefStructure> stopPointRef;
    @XmlElement(name = "ConnectionLinkRef")
    protected List<ConnectionLinkRefStructure> connectionLinkRef;
    @XmlElement(name = "FacilityRef")
    protected List<FacilityRefStructure> facilityRef;
    @XmlElement(name = "StopPlaceRef")
    protected StopPlaceRefStructure stopPlaceRef;
    @XmlElement(name = "StopPlaceComponentRef")
    protected StopPlaceSpaceRefStructure stopPlaceComponentRef;
    @XmlElement(name = "FramedVehicleJourneyRef")
    protected FramedVehicleJourneyRefStructure framedVehicleJourneyRef;
    @XmlElement(name = "VehicleJourneyRef")
    protected VehicleJourneyRefStructure vehicleJourneyRef;
    @XmlElement(name = "InterchangeRef")
    protected InterchangeRefStructure interchangeRef;
    @XmlElement(name = "VehicleRef")
    protected VehicleRefStructure vehicleRef;
    @XmlElement(name = "CountryRef")
    protected CountryRefStructure countryRef;
    @XmlElement(name = "PlaceRef")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NMTOKEN")
    protected String placeRef;
    @XmlElement(name = "Location")
    protected List<LocationStructure> location;
    @XmlElement(name = "SituationRoadFilter")
    protected SituationExchangeRequestStructure.SituationRoadFilter situationRoadFilter;
    @XmlElement(name = "AccessibilityNeedFilter")
    protected List<PassengerAccessibilityNeedsStructure> accessibilityNeedFilter;
    @XmlElement(name = "Language", defaultValue = "en")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "language")
    protected String language;
    @XmlElement(name = "IncludeTranslations")
    protected Boolean includeTranslations;
    @XmlElement(name = "MaximumNumberOfSituationElements")
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger maximumNumberOfSituationElements;
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
     * Obtient la valeur de la propriété validityPeriod.
     * 
     * @return
     *     possible object is
     *     {@link HalfOpenTimestampInputRangeStructure }
     *     
     */
    public HalfOpenTimestampInputRangeStructure getValidityPeriod() {
        return validityPeriod;
    }

    /**
     * Définit la valeur de la propriété validityPeriod.
     * 
     * @param value
     *     allowed object is
     *     {@link HalfOpenTimestampInputRangeStructure }
     *     
     */
    public void setValidityPeriod(HalfOpenTimestampInputRangeStructure value) {
        this.validityPeriod = value;
    }

    public boolean isSetValidityPeriod() {
        return (this.validityPeriod!= null);
    }

    /**
     * Obtient la valeur de la propriété includeOnlyIfInPublicationWindow.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIncludeOnlyIfInPublicationWindow() {
        return includeOnlyIfInPublicationWindow;
    }

    /**
     * Définit la valeur de la propriété includeOnlyIfInPublicationWindow.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIncludeOnlyIfInPublicationWindow(Boolean value) {
        this.includeOnlyIfInPublicationWindow = value;
    }

    public boolean isSetIncludeOnlyIfInPublicationWindow() {
        return (this.includeOnlyIfInPublicationWindow!= null);
    }

    /**
     * Obtient la valeur de la propriété vehicleMode.
     * 
     * @return
     *     possible object is
     *     {@link VehicleModesOfTransportEnumeration }
     *     
     */
    public VehicleModesOfTransportEnumeration getVehicleMode() {
        return vehicleMode;
    }

    /**
     * Définit la valeur de la propriété vehicleMode.
     * 
     * @param value
     *     allowed object is
     *     {@link VehicleModesOfTransportEnumeration }
     *     
     */
    public void setVehicleMode(VehicleModesOfTransportEnumeration value) {
        this.vehicleMode = value;
    }

    public boolean isSetVehicleMode() {
        return (this.vehicleMode!= null);
    }

    /**
     * Obtient la valeur de la propriété airSubmode.
     * 
     * @return
     *     possible object is
     *     {@link AirSubmodesOfTransportEnumeration }
     *     
     */
    public AirSubmodesOfTransportEnumeration getAirSubmode() {
        return airSubmode;
    }

    /**
     * Définit la valeur de la propriété airSubmode.
     * 
     * @param value
     *     allowed object is
     *     {@link AirSubmodesOfTransportEnumeration }
     *     
     */
    public void setAirSubmode(AirSubmodesOfTransportEnumeration value) {
        this.airSubmode = value;
    }

    public boolean isSetAirSubmode() {
        return (this.airSubmode!= null);
    }

    /**
     * Obtient la valeur de la propriété busSubmode.
     * 
     * @return
     *     possible object is
     *     {@link BusSubmodesOfTransportEnumeration }
     *     
     */
    public BusSubmodesOfTransportEnumeration getBusSubmode() {
        return busSubmode;
    }

    /**
     * Définit la valeur de la propriété busSubmode.
     * 
     * @param value
     *     allowed object is
     *     {@link BusSubmodesOfTransportEnumeration }
     *     
     */
    public void setBusSubmode(BusSubmodesOfTransportEnumeration value) {
        this.busSubmode = value;
    }

    public boolean isSetBusSubmode() {
        return (this.busSubmode!= null);
    }

    /**
     * Obtient la valeur de la propriété coachSubmode.
     * 
     * @return
     *     possible object is
     *     {@link CoachSubmodesOfTransportEnumeration }
     *     
     */
    public CoachSubmodesOfTransportEnumeration getCoachSubmode() {
        return coachSubmode;
    }

    /**
     * Définit la valeur de la propriété coachSubmode.
     * 
     * @param value
     *     allowed object is
     *     {@link CoachSubmodesOfTransportEnumeration }
     *     
     */
    public void setCoachSubmode(CoachSubmodesOfTransportEnumeration value) {
        this.coachSubmode = value;
    }

    public boolean isSetCoachSubmode() {
        return (this.coachSubmode!= null);
    }

    /**
     * Obtient la valeur de la propriété metroSubmode.
     * 
     * @return
     *     possible object is
     *     {@link MetroSubmodesOfTransportEnumeration }
     *     
     */
    public MetroSubmodesOfTransportEnumeration getMetroSubmode() {
        return metroSubmode;
    }

    /**
     * Définit la valeur de la propriété metroSubmode.
     * 
     * @param value
     *     allowed object is
     *     {@link MetroSubmodesOfTransportEnumeration }
     *     
     */
    public void setMetroSubmode(MetroSubmodesOfTransportEnumeration value) {
        this.metroSubmode = value;
    }

    public boolean isSetMetroSubmode() {
        return (this.metroSubmode!= null);
    }

    /**
     * Obtient la valeur de la propriété railSubmode.
     * 
     * @return
     *     possible object is
     *     {@link RailSubmodesOfTransportEnumeration }
     *     
     */
    public RailSubmodesOfTransportEnumeration getRailSubmode() {
        return railSubmode;
    }

    /**
     * Définit la valeur de la propriété railSubmode.
     * 
     * @param value
     *     allowed object is
     *     {@link RailSubmodesOfTransportEnumeration }
     *     
     */
    public void setRailSubmode(RailSubmodesOfTransportEnumeration value) {
        this.railSubmode = value;
    }

    public boolean isSetRailSubmode() {
        return (this.railSubmode!= null);
    }

    /**
     * Obtient la valeur de la propriété tramSubmode.
     * 
     * @return
     *     possible object is
     *     {@link TramSubmodesOfTransportEnumeration }
     *     
     */
    public TramSubmodesOfTransportEnumeration getTramSubmode() {
        return tramSubmode;
    }

    /**
     * Définit la valeur de la propriété tramSubmode.
     * 
     * @param value
     *     allowed object is
     *     {@link TramSubmodesOfTransportEnumeration }
     *     
     */
    public void setTramSubmode(TramSubmodesOfTransportEnumeration value) {
        this.tramSubmode = value;
    }

    public boolean isSetTramSubmode() {
        return (this.tramSubmode!= null);
    }

    /**
     * Obtient la valeur de la propriété waterSubmode.
     * 
     * @return
     *     possible object is
     *     {@link WaterSubmodesOfTransportEnumeration }
     *     
     */
    public WaterSubmodesOfTransportEnumeration getWaterSubmode() {
        return waterSubmode;
    }

    /**
     * Définit la valeur de la propriété waterSubmode.
     * 
     * @param value
     *     allowed object is
     *     {@link WaterSubmodesOfTransportEnumeration }
     *     
     */
    public void setWaterSubmode(WaterSubmodesOfTransportEnumeration value) {
        this.waterSubmode = value;
    }

    public boolean isSetWaterSubmode() {
        return (this.waterSubmode!= null);
    }

    /**
     * Obtient la valeur de la propriété accessMode.
     * 
     * @return
     *     possible object is
     *     {@link AccessModesEnumeration }
     *     
     */
    public AccessModesEnumeration getAccessMode() {
        return accessMode;
    }

    /**
     * Définit la valeur de la propriété accessMode.
     * 
     * @param value
     *     allowed object is
     *     {@link AccessModesEnumeration }
     *     
     */
    public void setAccessMode(AccessModesEnumeration value) {
        this.accessMode = value;
    }

    public boolean isSetAccessMode() {
        return (this.accessMode!= null);
    }

    /**
     * Obtient la valeur de la propriété severity.
     * 
     * @return
     *     possible object is
     *     {@link SeverityEnumeration }
     *     
     */
    public SeverityEnumeration getSeverity() {
        return severity;
    }

    /**
     * Définit la valeur de la propriété severity.
     * 
     * @param value
     *     allowed object is
     *     {@link SeverityEnumeration }
     *     
     */
    public void setSeverity(SeverityEnumeration value) {
        this.severity = value;
    }

    public boolean isSetSeverity() {
        return (this.severity!= null);
    }

    /**
     * Gets the value of the scope property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the scope property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getScope().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ScopeTypeEnumeration }
     * 
     * 
     */
    public List<ScopeTypeEnumeration> getScope() {
        if (scope == null) {
            scope = new ArrayList<ScopeTypeEnumeration>();
        }
        return this.scope;
    }

    public boolean isSetScope() {
        return ((this.scope!= null)&&(!this.scope.isEmpty()));
    }

    public void unsetScope() {
        this.scope = null;
    }

    /**
     * Obtient la valeur de la propriété predictability.
     * 
     * @return
     *     possible object is
     *     {@link PredictabilityEnumeration }
     *     
     */
    public PredictabilityEnumeration getPredictability() {
        return predictability;
    }

    /**
     * Définit la valeur de la propriété predictability.
     * 
     * @param value
     *     allowed object is
     *     {@link PredictabilityEnumeration }
     *     
     */
    public void setPredictability(PredictabilityEnumeration value) {
        this.predictability = value;
    }

    public boolean isSetPredictability() {
        return (this.predictability!= null);
    }

    /**
     * Obtient la valeur de la propriété keywords.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKeywords() {
        return keywords;
    }

    /**
     * Définit la valeur de la propriété keywords.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKeywords(String value) {
        this.keywords = value;
    }

    public boolean isSetKeywords() {
        return (this.keywords!= null);
    }

    /**
     * Obtient la valeur de la propriété verification.
     * 
     * @return
     *     possible object is
     *     {@link VerificationStatusEnumeration }
     *     
     */
    public VerificationStatusEnumeration getVerification() {
        return verification;
    }

    /**
     * Définit la valeur de la propriété verification.
     * 
     * @param value
     *     allowed object is
     *     {@link VerificationStatusEnumeration }
     *     
     */
    public void setVerification(VerificationStatusEnumeration value) {
        this.verification = value;
    }

    public boolean isSetVerification() {
        return (this.verification!= null);
    }

    /**
     * Gets the value of the progress property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the progress property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getProgress().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link WorkflowStatusEnumeration }
     * 
     * 
     */
    public List<WorkflowStatusEnumeration> getProgress() {
        if (progress == null) {
            progress = new ArrayList<WorkflowStatusEnumeration>();
        }
        return this.progress;
    }

    public boolean isSetProgress() {
        return ((this.progress!= null)&&(!this.progress.isEmpty()));
    }

    public void unsetProgress() {
        this.progress = null;
    }

    /**
     * Obtient la valeur de la propriété reality.
     * 
     * @return
     *     possible object is
     *     {@link InformationStatusEnum }
     *     
     */
    public InformationStatusEnum getReality() {
        return reality;
    }

    /**
     * Définit la valeur de la propriété reality.
     * 
     * @param value
     *     allowed object is
     *     {@link InformationStatusEnum }
     *     
     */
    public void setReality(InformationStatusEnum value) {
        this.reality = value;
    }

    public boolean isSetReality() {
        return (this.reality!= null);
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
     * Gets the value of the operationalUnitRef property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the operationalUnitRef property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOperationalUnitRef().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OperationalUnitRefStructure }
     * 
     * 
     */
    public List<OperationalUnitRefStructure> getOperationalUnitRef() {
        if (operationalUnitRef == null) {
            operationalUnitRef = new ArrayList<OperationalUnitRefStructure>();
        }
        return this.operationalUnitRef;
    }

    public boolean isSetOperationalUnitRef() {
        return ((this.operationalUnitRef!= null)&&(!this.operationalUnitRef.isEmpty()));
    }

    public void unsetOperationalUnitRef() {
        this.operationalUnitRef = null;
    }

    /**
     * Obtient la valeur de la propriété networkRef.
     * 
     * @return
     *     possible object is
     *     {@link OperatorRefStructure }
     *     
     */
    public OperatorRefStructure getNetworkRef() {
        return networkRef;
    }

    /**
     * Définit la valeur de la propriété networkRef.
     * 
     * @param value
     *     allowed object is
     *     {@link OperatorRefStructure }
     *     
     */
    public void setNetworkRef(OperatorRefStructure value) {
        this.networkRef = value;
    }

    public boolean isSetNetworkRef() {
        return (this.networkRef!= null);
    }

    /**
     * Filter the results to include only  the given line.  Gets the value of the lineRef property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the lineRef property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLineRef().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LineRefStructure }
     * 
     * 
     */
    public List<LineRefStructure> getLineRef() {
        if (lineRef == null) {
            lineRef = new ArrayList<LineRefStructure>();
        }
        return this.lineRef;
    }

    public boolean isSetLineRef() {
        return ((this.lineRef!= null)&&(!this.lineRef.isEmpty()));
    }

    public void unsetLineRef() {
        this.lineRef = null;
    }

    /**
     * Obtient la valeur de la propriété lines.
     * 
     * @return
     *     possible object is
     *     {@link SituationExchangeRequestStructure.Lines }
     *     
     */
    public SituationExchangeRequestStructure.Lines getLines() {
        return lines;
    }

    /**
     * Définit la valeur de la propriété lines.
     * 
     * @param value
     *     allowed object is
     *     {@link SituationExchangeRequestStructure.Lines }
     *     
     */
    public void setLines(SituationExchangeRequestStructure.Lines value) {
        this.lines = value;
    }

    public boolean isSetLines() {
        return (this.lines!= null);
    }

    /**
     * Gets the value of the stopPointRef property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the stopPointRef property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getStopPointRef().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link StopPointRefStructure }
     * 
     * 
     */
    public List<StopPointRefStructure> getStopPointRef() {
        if (stopPointRef == null) {
            stopPointRef = new ArrayList<StopPointRefStructure>();
        }
        return this.stopPointRef;
    }

    public boolean isSetStopPointRef() {
        return ((this.stopPointRef!= null)&&(!this.stopPointRef.isEmpty()));
    }

    public void unsetStopPointRef() {
        this.stopPointRef = null;
    }

    /**
     * Gets the value of the connectionLinkRef property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the connectionLinkRef property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getConnectionLinkRef().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ConnectionLinkRefStructure }
     * 
     * 
     */
    public List<ConnectionLinkRefStructure> getConnectionLinkRef() {
        if (connectionLinkRef == null) {
            connectionLinkRef = new ArrayList<ConnectionLinkRefStructure>();
        }
        return this.connectionLinkRef;
    }

    public boolean isSetConnectionLinkRef() {
        return ((this.connectionLinkRef!= null)&&(!this.connectionLinkRef.isEmpty()));
    }

    public void unsetConnectionLinkRef() {
        this.connectionLinkRef = null;
    }

    /**
     * Gets the value of the facilityRef property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the facilityRef property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFacilityRef().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FacilityRefStructure }
     * 
     * 
     */
    public List<FacilityRefStructure> getFacilityRef() {
        if (facilityRef == null) {
            facilityRef = new ArrayList<FacilityRefStructure>();
        }
        return this.facilityRef;
    }

    public boolean isSetFacilityRef() {
        return ((this.facilityRef!= null)&&(!this.facilityRef.isEmpty()));
    }

    public void unsetFacilityRef() {
        this.facilityRef = null;
    }

    /**
     * Obtient la valeur de la propriété stopPlaceRef.
     * 
     * @return
     *     possible object is
     *     {@link StopPlaceRefStructure }
     *     
     */
    public StopPlaceRefStructure getStopPlaceRef() {
        return stopPlaceRef;
    }

    /**
     * Définit la valeur de la propriété stopPlaceRef.
     * 
     * @param value
     *     allowed object is
     *     {@link StopPlaceRefStructure }
     *     
     */
    public void setStopPlaceRef(StopPlaceRefStructure value) {
        this.stopPlaceRef = value;
    }

    public boolean isSetStopPlaceRef() {
        return (this.stopPlaceRef!= null);
    }

    /**
     * Obtient la valeur de la propriété stopPlaceComponentRef.
     * 
     * @return
     *     possible object is
     *     {@link StopPlaceSpaceRefStructure }
     *     
     */
    public StopPlaceSpaceRefStructure getStopPlaceComponentRef() {
        return stopPlaceComponentRef;
    }

    /**
     * Définit la valeur de la propriété stopPlaceComponentRef.
     * 
     * @param value
     *     allowed object is
     *     {@link StopPlaceSpaceRefStructure }
     *     
     */
    public void setStopPlaceComponentRef(StopPlaceSpaceRefStructure value) {
        this.stopPlaceComponentRef = value;
    }

    public boolean isSetStopPlaceComponentRef() {
        return (this.stopPlaceComponentRef!= null);
    }

    /**
     * Obtient la valeur de la propriété framedVehicleJourneyRef.
     * 
     * @return
     *     possible object is
     *     {@link FramedVehicleJourneyRefStructure }
     *     
     */
    public FramedVehicleJourneyRefStructure getFramedVehicleJourneyRef() {
        return framedVehicleJourneyRef;
    }

    /**
     * Définit la valeur de la propriété framedVehicleJourneyRef.
     * 
     * @param value
     *     allowed object is
     *     {@link FramedVehicleJourneyRefStructure }
     *     
     */
    public void setFramedVehicleJourneyRef(FramedVehicleJourneyRefStructure value) {
        this.framedVehicleJourneyRef = value;
    }

    public boolean isSetFramedVehicleJourneyRef() {
        return (this.framedVehicleJourneyRef!= null);
    }

    /**
     * Obtient la valeur de la propriété vehicleJourneyRef.
     * 
     * @return
     *     possible object is
     *     {@link VehicleJourneyRefStructure }
     *     
     */
    public VehicleJourneyRefStructure getVehicleJourneyRef() {
        return vehicleJourneyRef;
    }

    /**
     * Définit la valeur de la propriété vehicleJourneyRef.
     * 
     * @param value
     *     allowed object is
     *     {@link VehicleJourneyRefStructure }
     *     
     */
    public void setVehicleJourneyRef(VehicleJourneyRefStructure value) {
        this.vehicleJourneyRef = value;
    }

    public boolean isSetVehicleJourneyRef() {
        return (this.vehicleJourneyRef!= null);
    }

    /**
     * Obtient la valeur de la propriété interchangeRef.
     * 
     * @return
     *     possible object is
     *     {@link InterchangeRefStructure }
     *     
     */
    public InterchangeRefStructure getInterchangeRef() {
        return interchangeRef;
    }

    /**
     * Définit la valeur de la propriété interchangeRef.
     * 
     * @param value
     *     allowed object is
     *     {@link InterchangeRefStructure }
     *     
     */
    public void setInterchangeRef(InterchangeRefStructure value) {
        this.interchangeRef = value;
    }

    public boolean isSetInterchangeRef() {
        return (this.interchangeRef!= null);
    }

    /**
     * Obtient la valeur de la propriété vehicleRef.
     * 
     * @return
     *     possible object is
     *     {@link VehicleRefStructure }
     *     
     */
    public VehicleRefStructure getVehicleRef() {
        return vehicleRef;
    }

    /**
     * Définit la valeur de la propriété vehicleRef.
     * 
     * @param value
     *     allowed object is
     *     {@link VehicleRefStructure }
     *     
     */
    public void setVehicleRef(VehicleRefStructure value) {
        this.vehicleRef = value;
    }

    public boolean isSetVehicleRef() {
        return (this.vehicleRef!= null);
    }

    /**
     * Obtient la valeur de la propriété countryRef.
     * 
     * @return
     *     possible object is
     *     {@link CountryRefStructure }
     *     
     */
    public CountryRefStructure getCountryRef() {
        return countryRef;
    }

    /**
     * Définit la valeur de la propriété countryRef.
     * 
     * @param value
     *     allowed object is
     *     {@link CountryRefStructure }
     *     
     */
    public void setCountryRef(CountryRefStructure value) {
        this.countryRef = value;
    }

    public boolean isSetCountryRef() {
        return (this.countryRef!= null);
    }

    /**
     * Obtient la valeur de la propriété placeRef.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPlaceRef() {
        return placeRef;
    }

    /**
     * Définit la valeur de la propriété placeRef.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPlaceRef(String value) {
        this.placeRef = value;
    }

    public boolean isSetPlaceRef() {
        return (this.placeRef!= null);
    }

    /**
     * Gets the value of the location property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the location property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLocation().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LocationStructure }
     * 
     * 
     */
    public List<LocationStructure> getLocation() {
        if (location == null) {
            location = new ArrayList<LocationStructure>();
        }
        return this.location;
    }

    public boolean isSetLocation() {
        return ((this.location!= null)&&(!this.location.isEmpty()));
    }

    public void unsetLocation() {
        this.location = null;
    }

    /**
     * Obtient la valeur de la propriété situationRoadFilter.
     * 
     * @return
     *     possible object is
     *     {@link SituationExchangeRequestStructure.SituationRoadFilter }
     *     
     */
    public SituationExchangeRequestStructure.SituationRoadFilter getSituationRoadFilter() {
        return situationRoadFilter;
    }

    /**
     * Définit la valeur de la propriété situationRoadFilter.
     * 
     * @param value
     *     allowed object is
     *     {@link SituationExchangeRequestStructure.SituationRoadFilter }
     *     
     */
    public void setSituationRoadFilter(SituationExchangeRequestStructure.SituationRoadFilter value) {
        this.situationRoadFilter = value;
    }

    public boolean isSetSituationRoadFilter() {
        return (this.situationRoadFilter!= null);
    }

    /**
     * Gets the value of the accessibilityNeedFilter property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the accessibilityNeedFilter property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAccessibilityNeedFilter().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PassengerAccessibilityNeedsStructure }
     * 
     * 
     */
    public List<PassengerAccessibilityNeedsStructure> getAccessibilityNeedFilter() {
        if (accessibilityNeedFilter == null) {
            accessibilityNeedFilter = new ArrayList<PassengerAccessibilityNeedsStructure>();
        }
        return this.accessibilityNeedFilter;
    }

    public boolean isSetAccessibilityNeedFilter() {
        return ((this.accessibilityNeedFilter!= null)&&(!this.accessibilityNeedFilter.isEmpty()));
    }

    public void unsetAccessibilityNeedFilter() {
        this.accessibilityNeedFilter = null;
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
     * Obtient la valeur de la propriété maximumNumberOfSituationElements.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getMaximumNumberOfSituationElements() {
        return maximumNumberOfSituationElements;
    }

    /**
     * Définit la valeur de la propriété maximumNumberOfSituationElements.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setMaximumNumberOfSituationElements(BigInteger value) {
        this.maximumNumberOfSituationElements = value;
    }

    public boolean isSetMaximumNumberOfSituationElements() {
        return (this.maximumNumberOfSituationElements!= null);
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
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="LineDirection" type="{http://www.siri.org.uk/siri}LineDirectionStructure" maxOccurs="unbounded"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "lineDirection"
    })
    public static class Lines
        implements Serializable
    {

        private final static long serialVersionUID = 1L;
        @XmlElement(name = "LineDirection", required = true)
        protected List<LineDirectionStructure> lineDirection;

        /**
         * Gets the value of the lineDirection property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the lineDirection property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getLineDirection().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link LineDirectionStructure }
         * 
         * 
         */
        public List<LineDirectionStructure> getLineDirection() {
            if (lineDirection == null) {
                lineDirection = new ArrayList<LineDirectionStructure>();
            }
            return this.lineDirection;
        }

        public boolean isSetLineDirection() {
            return ((this.lineDirection!= null)&&(!this.lineDirection.isEmpty()));
        }

        public void unsetLineDirection() {
            this.lineDirection = null;
        }

    }


    /**
     * <p>Classe Java pour anonymous complex type.
     * 
     * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="RoadFilter" type="{http://www.siri.org.uk/siri}RoadFilterStructure" maxOccurs="unbounded"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "roadFilter"
    })
    public static class SituationRoadFilter
        implements Serializable
    {

        private final static long serialVersionUID = 1L;
        @XmlElement(name = "RoadFilter", required = true)
        protected List<RoadFilterStructure> roadFilter;

        /**
         * Gets the value of the roadFilter property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the roadFilter property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getRoadFilter().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link RoadFilterStructure }
         * 
         * 
         */
        public List<RoadFilterStructure> getRoadFilter() {
            if (roadFilter == null) {
                roadFilter = new ArrayList<RoadFilterStructure>();
            }
            return this.roadFilter;
        }

        public boolean isSetRoadFilter() {
            return ((this.roadFilter!= null)&&(!this.roadFilter.isEmpty()));
        }

        public void unsetRoadFilter() {
            this.roadFilter = null;
        }

    }

}
