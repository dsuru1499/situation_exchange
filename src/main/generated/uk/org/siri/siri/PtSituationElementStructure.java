
package uk.org.siri.siri;

import java.io.Serializable;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlTransient;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

import org.springframework.data.annotation.Id;

import eu.datex2.schema._2_0rc1._2_0.InformationStatusEnum;
import eu.datex2.schema._2_0rc1._2_0.ProbabilityOfOccurrenceEnum;
import eu.datex2.schema._2_0rc1._2_0.PublicEventTypeEnum;
import lombok.Getter;
import lombok.Setter;
import situation_exchange.repositories.Entity;


/**
 * Type for individual PT SITUATION.
 * 
 * <p>Classe Java pour PtSituationElementStructure complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="PtSituationElementStructure">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.siri.org.uk/siri}SituationElementStructure">
 *       &lt;sequence>
 *         &lt;group ref="{http://www.siri.org.uk/siri}PtSituationBodyGroup"/>
 *         &lt;element ref="{http://www.siri.org.uk/siri}Extensions" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PtSituationElementStructure", propOrder = {
    "verification",
    "progress",
    "qualityIndex",
    "reality",
    "likelihood",
    "publication",
    "validityPeriod",
    "repetitions",
    "publicationWindow",
    "unknownReason",
    "miscellaneousReason",
    "personnelReason",
    "equipmentReason",
    "environmentReason",
    "undefinedReason",
    "miscellaneousSubReason",
    "personnelSubReason",
    "equipmentSubReason",
    "environmentSubReason",
    "publicEventReason",
    "reasonName",
    "severity",
    "priority",
    "sensitivity",
    "audience",
    "scopeType",
    "reportType",
    "planned",
    "keywords",
    "secondaryReasons",
    "language",
    "summary",
    "description",
    "detail",
    "advice",
    "internal",
    "images",
    "infoLinks",
    "affects",
    "consequences",
    "publishingActions",
    "extensions"
})
public class PtSituationElementStructure
    extends SituationElementStructure
    implements Serializable, Entity
{

	@Getter @Setter
	@Id
	@XmlTransient
	private BigInteger id;
	
    private final static long serialVersionUID = 1L;
    @XmlElement(name = "Verification")
    protected VerificationStatusEnumeration verification;
    @XmlElement(name = "Progress", defaultValue = "open")
    protected WorkflowStatusEnumeration progress;
    @XmlElement(name = "QualityIndex")
    protected QualityEnumeration qualityIndex;
    @XmlElement(name = "Reality")
    protected InformationStatusEnum reality;
    @XmlElement(name = "Likelihood")
    protected ProbabilityOfOccurrenceEnum likelihood;
    @XmlElement(name = "Publication")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected List<String> publication;
    @XmlElement(name = "ValidityPeriod", required = true)
    protected List<HalfOpenTimestampOutputRangeStructure> validityPeriod;
    @XmlElement(name = "Repetitions")
    protected PtSituationElementStructure.Repetitions repetitions;
    @XmlElement(name = "PublicationWindow")
    protected HalfOpenTimestampOutputRangeStructure publicationWindow;
    @XmlElement(name = "UnknownReason")
    protected String unknownReason;
    @XmlElement(name = "MiscellaneousReason")
    protected MiscellaneousReasonEnumeration miscellaneousReason;
    @XmlElement(name = "PersonnelReason")
    protected PersonnelReasonEnumeration personnelReason;
    @XmlElement(name = "EquipmentReason")
    protected EquipmentReasonEnumeration equipmentReason;
    @XmlElement(name = "EnvironmentReason")
    protected EnvironmentReasonEnumeration environmentReason;
    @XmlElement(name = "UndefinedReason")
    protected String undefinedReason;
    @XmlElement(name = "MiscellaneousSubReason")
    protected MiscellaneousSubReasonEnumeration miscellaneousSubReason;
    @XmlElement(name = "PersonnelSubReason")
    protected PersonnelSubReasonEnumeration personnelSubReason;
    @XmlElement(name = "EquipmentSubReason")
    protected EquipmentSubReasonEnumeration equipmentSubReason;
    @XmlElement(name = "EnvironmentSubReason")
    protected EnvironmentSubReasonEnumeration environmentSubReason;
    @XmlElement(name = "PublicEventReason")
    protected PublicEventTypeEnum publicEventReason;
    @XmlElement(name = "ReasonName")
    protected List<NaturalLanguageStringStructure> reasonName;
    @XmlElement(name = "Severity", defaultValue = "normal")
    protected SeverityEnumeration severity;
    @XmlElement(name = "Priority")
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger priority;
    @XmlElement(name = "Sensitivity")
    protected SensitivityEnumeration sensitivity;
    @XmlElement(name = "Audience", defaultValue = "public")
    protected AudienceEnumeration audience;
    @XmlElement(name = "ScopeType")
    protected ScopeTypeEnumeration scopeType;
    @XmlElement(name = "ReportType", defaultValue = "unknown")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String reportType;
    @XmlElement(name = "Planned", defaultValue = "false")
    protected Boolean planned;
    @XmlElement(name = "Keywords")
    protected String keywords;
    @XmlElement(name = "SecondaryReasons")
    protected PtSituationElementStructure.SecondaryReasons secondaryReasons;
    @XmlElement(name = "Language", defaultValue = "en")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NMTOKEN")
    protected String language;
    @XmlElement(name = "Summary")
    protected List<DefaultedTextStructure> summary;
    @XmlElement(name = "Description")
    protected List<DefaultedTextStructure> description;
    @XmlElement(name = "Detail")
    protected List<DefaultedTextStructure> detail;
    @XmlElement(name = "Advice")
    protected List<DefaultedTextStructure> advice;
    @XmlElement(name = "Internal")
    protected DefaultedTextStructure internal;
    @XmlElement(name = "Images")
    protected PtSituationElementStructure.Images images;
    @XmlElement(name = "InfoLinks")
    protected PtSituationElementStructure.InfoLinks infoLinks;
    @XmlElement(name = "Affects")
    protected AffectsScopeStructure affects;
    @XmlElement(name = "Consequences")
    protected PtConsequencesStructure consequences;
    @XmlElement(name = "PublishingActions")
    protected ActionsStructure publishingActions;
    @XmlElement(name = "Extensions")
    protected ExtensionsStructure extensions;

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
     * Obtient la valeur de la propriété progress.
     * 
     * @return
     *     possible object is
     *     {@link WorkflowStatusEnumeration }
     *     
     */
    public WorkflowStatusEnumeration getProgress() {
        return progress;
    }

    /**
     * Définit la valeur de la propriété progress.
     * 
     * @param value
     *     allowed object is
     *     {@link WorkflowStatusEnumeration }
     *     
     */
    public void setProgress(WorkflowStatusEnumeration value) {
        this.progress = value;
    }

    public boolean isSetProgress() {
        return (this.progress!= null);
    }

    /**
     * Obtient la valeur de la propriété qualityIndex.
     * 
     * @return
     *     possible object is
     *     {@link QualityEnumeration }
     *     
     */
    public QualityEnumeration getQualityIndex() {
        return qualityIndex;
    }

    /**
     * Définit la valeur de la propriété qualityIndex.
     * 
     * @param value
     *     allowed object is
     *     {@link QualityEnumeration }
     *     
     */
    public void setQualityIndex(QualityEnumeration value) {
        this.qualityIndex = value;
    }

    public boolean isSetQualityIndex() {
        return (this.qualityIndex!= null);
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
     * Obtient la valeur de la propriété likelihood.
     * 
     * @return
     *     possible object is
     *     {@link ProbabilityOfOccurrenceEnum }
     *     
     */
    public ProbabilityOfOccurrenceEnum getLikelihood() {
        return likelihood;
    }

    /**
     * Définit la valeur de la propriété likelihood.
     * 
     * @param value
     *     allowed object is
     *     {@link ProbabilityOfOccurrenceEnum }
     *     
     */
    public void setLikelihood(ProbabilityOfOccurrenceEnum value) {
        this.likelihood = value;
    }

    public boolean isSetLikelihood() {
        return (this.likelihood!= null);
    }

    /**
     * Gets the value of the publication property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the publication property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPublication().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getPublication() {
        if (publication == null) {
            publication = new ArrayList<String>();
        }
        return this.publication;
    }

    public boolean isSetPublication() {
        return ((this.publication!= null)&&(!this.publication.isEmpty()));
    }

    public void unsetPublication() {
        this.publication = null;
    }

    /**
     * Gets the value of the validityPeriod property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the validityPeriod property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getValidityPeriod().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link HalfOpenTimestampOutputRangeStructure }
     * 
     * 
     */
    public List<HalfOpenTimestampOutputRangeStructure> getValidityPeriod() {
        if (validityPeriod == null) {
            validityPeriod = new ArrayList<HalfOpenTimestampOutputRangeStructure>();
        }
        return this.validityPeriod;
    }

    public boolean isSetValidityPeriod() {
        return ((this.validityPeriod!= null)&&(!this.validityPeriod.isEmpty()));
    }

    public void unsetValidityPeriod() {
        this.validityPeriod = null;
    }

    /**
     * Obtient la valeur de la propriété repetitions.
     * 
     * @return
     *     possible object is
     *     {@link PtSituationElementStructure.Repetitions }
     *     
     */
    public PtSituationElementStructure.Repetitions getRepetitions() {
        return repetitions;
    }

    /**
     * Définit la valeur de la propriété repetitions.
     * 
     * @param value
     *     allowed object is
     *     {@link PtSituationElementStructure.Repetitions }
     *     
     */
    public void setRepetitions(PtSituationElementStructure.Repetitions value) {
        this.repetitions = value;
    }

    public boolean isSetRepetitions() {
        return (this.repetitions!= null);
    }

    /**
     * Obtient la valeur de la propriété publicationWindow.
     * 
     * @return
     *     possible object is
     *     {@link HalfOpenTimestampOutputRangeStructure }
     *     
     */
    public HalfOpenTimestampOutputRangeStructure getPublicationWindow() {
        return publicationWindow;
    }

    /**
     * Définit la valeur de la propriété publicationWindow.
     * 
     * @param value
     *     allowed object is
     *     {@link HalfOpenTimestampOutputRangeStructure }
     *     
     */
    public void setPublicationWindow(HalfOpenTimestampOutputRangeStructure value) {
        this.publicationWindow = value;
    }

    public boolean isSetPublicationWindow() {
        return (this.publicationWindow!= null);
    }

    /**
     * Obtient la valeur de la propriété unknownReason.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUnknownReason() {
        return unknownReason;
    }

    /**
     * Définit la valeur de la propriété unknownReason.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUnknownReason(String value) {
        this.unknownReason = value;
    }

    public boolean isSetUnknownReason() {
        return (this.unknownReason!= null);
    }

    /**
     * Obtient la valeur de la propriété miscellaneousReason.
     * 
     * @return
     *     possible object is
     *     {@link MiscellaneousReasonEnumeration }
     *     
     */
    public MiscellaneousReasonEnumeration getMiscellaneousReason() {
        return miscellaneousReason;
    }

    /**
     * Définit la valeur de la propriété miscellaneousReason.
     * 
     * @param value
     *     allowed object is
     *     {@link MiscellaneousReasonEnumeration }
     *     
     */
    public void setMiscellaneousReason(MiscellaneousReasonEnumeration value) {
        this.miscellaneousReason = value;
    }

    public boolean isSetMiscellaneousReason() {
        return (this.miscellaneousReason!= null);
    }

    /**
     * Personnel reason.
     * 
     * @return
     *     possible object is
     *     {@link PersonnelReasonEnumeration }
     *     
     */
    public PersonnelReasonEnumeration getPersonnelReason() {
        return personnelReason;
    }

    /**
     * Définit la valeur de la propriété personnelReason.
     * 
     * @param value
     *     allowed object is
     *     {@link PersonnelReasonEnumeration }
     *     
     */
    public void setPersonnelReason(PersonnelReasonEnumeration value) {
        this.personnelReason = value;
    }

    public boolean isSetPersonnelReason() {
        return (this.personnelReason!= null);
    }

    /**
     * Obtient la valeur de la propriété equipmentReason.
     * 
     * @return
     *     possible object is
     *     {@link EquipmentReasonEnumeration }
     *     
     */
    public EquipmentReasonEnumeration getEquipmentReason() {
        return equipmentReason;
    }

    /**
     * Définit la valeur de la propriété equipmentReason.
     * 
     * @param value
     *     allowed object is
     *     {@link EquipmentReasonEnumeration }
     *     
     */
    public void setEquipmentReason(EquipmentReasonEnumeration value) {
        this.equipmentReason = value;
    }

    public boolean isSetEquipmentReason() {
        return (this.equipmentReason!= null);
    }

    /**
     * Environment reason.
     * 
     * @return
     *     possible object is
     *     {@link EnvironmentReasonEnumeration }
     *     
     */
    public EnvironmentReasonEnumeration getEnvironmentReason() {
        return environmentReason;
    }

    /**
     * Définit la valeur de la propriété environmentReason.
     * 
     * @param value
     *     allowed object is
     *     {@link EnvironmentReasonEnumeration }
     *     
     */
    public void setEnvironmentReason(EnvironmentReasonEnumeration value) {
        this.environmentReason = value;
    }

    public boolean isSetEnvironmentReason() {
        return (this.environmentReason!= null);
    }

    /**
     * Obtient la valeur de la propriété undefinedReason.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUndefinedReason() {
        return undefinedReason;
    }

    /**
     * Définit la valeur de la propriété undefinedReason.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUndefinedReason(String value) {
        this.undefinedReason = value;
    }

    public boolean isSetUndefinedReason() {
        return (this.undefinedReason!= null);
    }

    /**
     * Obtient la valeur de la propriété miscellaneousSubReason.
     * 
     * @return
     *     possible object is
     *     {@link MiscellaneousSubReasonEnumeration }
     *     
     */
    public MiscellaneousSubReasonEnumeration getMiscellaneousSubReason() {
        return miscellaneousSubReason;
    }

    /**
     * Définit la valeur de la propriété miscellaneousSubReason.
     * 
     * @param value
     *     allowed object is
     *     {@link MiscellaneousSubReasonEnumeration }
     *     
     */
    public void setMiscellaneousSubReason(MiscellaneousSubReasonEnumeration value) {
        this.miscellaneousSubReason = value;
    }

    public boolean isSetMiscellaneousSubReason() {
        return (this.miscellaneousSubReason!= null);
    }

    /**
     * Personnel reason.
     * 
     * @return
     *     possible object is
     *     {@link PersonnelSubReasonEnumeration }
     *     
     */
    public PersonnelSubReasonEnumeration getPersonnelSubReason() {
        return personnelSubReason;
    }

    /**
     * Définit la valeur de la propriété personnelSubReason.
     * 
     * @param value
     *     allowed object is
     *     {@link PersonnelSubReasonEnumeration }
     *     
     */
    public void setPersonnelSubReason(PersonnelSubReasonEnumeration value) {
        this.personnelSubReason = value;
    }

    public boolean isSetPersonnelSubReason() {
        return (this.personnelSubReason!= null);
    }

    /**
     * Obtient la valeur de la propriété equipmentSubReason.
     * 
     * @return
     *     possible object is
     *     {@link EquipmentSubReasonEnumeration }
     *     
     */
    public EquipmentSubReasonEnumeration getEquipmentSubReason() {
        return equipmentSubReason;
    }

    /**
     * Définit la valeur de la propriété equipmentSubReason.
     * 
     * @param value
     *     allowed object is
     *     {@link EquipmentSubReasonEnumeration }
     *     
     */
    public void setEquipmentSubReason(EquipmentSubReasonEnumeration value) {
        this.equipmentSubReason = value;
    }

    public boolean isSetEquipmentSubReason() {
        return (this.equipmentSubReason!= null);
    }

    /**
     * Environment reason.
     * 
     * @return
     *     possible object is
     *     {@link EnvironmentSubReasonEnumeration }
     *     
     */
    public EnvironmentSubReasonEnumeration getEnvironmentSubReason() {
        return environmentSubReason;
    }

    /**
     * Définit la valeur de la propriété environmentSubReason.
     * 
     * @param value
     *     allowed object is
     *     {@link EnvironmentSubReasonEnumeration }
     *     
     */
    public void setEnvironmentSubReason(EnvironmentSubReasonEnumeration value) {
        this.environmentSubReason = value;
    }

    public boolean isSetEnvironmentSubReason() {
        return (this.environmentSubReason!= null);
    }

    /**
     * Obtient la valeur de la propriété publicEventReason.
     * 
     * @return
     *     possible object is
     *     {@link PublicEventTypeEnum }
     *     
     */
    public PublicEventTypeEnum getPublicEventReason() {
        return publicEventReason;
    }

    /**
     * Définit la valeur de la propriété publicEventReason.
     * 
     * @param value
     *     allowed object is
     *     {@link PublicEventTypeEnum }
     *     
     */
    public void setPublicEventReason(PublicEventTypeEnum value) {
        this.publicEventReason = value;
    }

    public boolean isSetPublicEventReason() {
        return (this.publicEventReason!= null);
    }

    /**
     * Gets the value of the reasonName property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the reasonName property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getReasonName().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link NaturalLanguageStringStructure }
     * 
     * 
     */
    public List<NaturalLanguageStringStructure> getReasonName() {
        if (reasonName == null) {
            reasonName = new ArrayList<NaturalLanguageStringStructure>();
        }
        return this.reasonName;
    }

    public boolean isSetReasonName() {
        return ((this.reasonName!= null)&&(!this.reasonName.isEmpty()));
    }

    public void unsetReasonName() {
        this.reasonName = null;
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
     * Obtient la valeur de la propriété priority.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getPriority() {
        return priority;
    }

    /**
     * Définit la valeur de la propriété priority.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setPriority(BigInteger value) {
        this.priority = value;
    }

    public boolean isSetPriority() {
        return (this.priority!= null);
    }

    /**
     * Obtient la valeur de la propriété sensitivity.
     * 
     * @return
     *     possible object is
     *     {@link SensitivityEnumeration }
     *     
     */
    public SensitivityEnumeration getSensitivity() {
        return sensitivity;
    }

    /**
     * Définit la valeur de la propriété sensitivity.
     * 
     * @param value
     *     allowed object is
     *     {@link SensitivityEnumeration }
     *     
     */
    public void setSensitivity(SensitivityEnumeration value) {
        this.sensitivity = value;
    }

    public boolean isSetSensitivity() {
        return (this.sensitivity!= null);
    }

    /**
     * Obtient la valeur de la propriété audience.
     * 
     * @return
     *     possible object is
     *     {@link AudienceEnumeration }
     *     
     */
    public AudienceEnumeration getAudience() {
        return audience;
    }

    /**
     * Définit la valeur de la propriété audience.
     * 
     * @param value
     *     allowed object is
     *     {@link AudienceEnumeration }
     *     
     */
    public void setAudience(AudienceEnumeration value) {
        this.audience = value;
    }

    public boolean isSetAudience() {
        return (this.audience!= null);
    }

    /**
     * Obtient la valeur de la propriété scopeType.
     * 
     * @return
     *     possible object is
     *     {@link ScopeTypeEnumeration }
     *     
     */
    public ScopeTypeEnumeration getScopeType() {
        return scopeType;
    }

    /**
     * Définit la valeur de la propriété scopeType.
     * 
     * @param value
     *     allowed object is
     *     {@link ScopeTypeEnumeration }
     *     
     */
    public void setScopeType(ScopeTypeEnumeration value) {
        this.scopeType = value;
    }

    public boolean isSetScopeType() {
        return (this.scopeType!= null);
    }

    /**
     * Obtient la valeur de la propriété reportType.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReportType() {
        return reportType;
    }

    /**
     * Définit la valeur de la propriété reportType.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReportType(String value) {
        this.reportType = value;
    }

    public boolean isSetReportType() {
        return (this.reportType!= null);
    }

    /**
     * Obtient la valeur de la propriété planned.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPlanned() {
        return planned;
    }

    /**
     * Définit la valeur de la propriété planned.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPlanned(Boolean value) {
        this.planned = value;
    }

    public boolean isSetPlanned() {
        return (this.planned!= null);
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
     * Obtient la valeur de la propriété secondaryReasons.
     * 
     * @return
     *     possible object is
     *     {@link PtSituationElementStructure.SecondaryReasons }
     *     
     */
    public PtSituationElementStructure.SecondaryReasons getSecondaryReasons() {
        return secondaryReasons;
    }

    /**
     * Définit la valeur de la propriété secondaryReasons.
     * 
     * @param value
     *     allowed object is
     *     {@link PtSituationElementStructure.SecondaryReasons }
     *     
     */
    public void setSecondaryReasons(PtSituationElementStructure.SecondaryReasons value) {
        this.secondaryReasons = value;
    }

    public boolean isSetSecondaryReasons() {
        return (this.secondaryReasons!= null);
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
     * Gets the value of the summary property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the summary property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSummary().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DefaultedTextStructure }
     * 
     * 
     */
    public List<DefaultedTextStructure> getSummary() {
        if (summary == null) {
            summary = new ArrayList<DefaultedTextStructure>();
        }
        return this.summary;
    }

    public boolean isSetSummary() {
        return ((this.summary!= null)&&(!this.summary.isEmpty()));
    }

    public void unsetSummary() {
        this.summary = null;
    }

    /**
     * Gets the value of the description property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the description property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDescription().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DefaultedTextStructure }
     * 
     * 
     */
    public List<DefaultedTextStructure> getDescription() {
        if (description == null) {
            description = new ArrayList<DefaultedTextStructure>();
        }
        return this.description;
    }

    public boolean isSetDescription() {
        return ((this.description!= null)&&(!this.description.isEmpty()));
    }

    public void unsetDescription() {
        this.description = null;
    }

    /**
     * Gets the value of the detail property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the detail property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDetail().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DefaultedTextStructure }
     * 
     * 
     */
    public List<DefaultedTextStructure> getDetail() {
        if (detail == null) {
            detail = new ArrayList<DefaultedTextStructure>();
        }
        return this.detail;
    }

    public boolean isSetDetail() {
        return ((this.detail!= null)&&(!this.detail.isEmpty()));
    }

    public void unsetDetail() {
        this.detail = null;
    }

    /**
     * Gets the value of the advice property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the advice property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAdvice().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DefaultedTextStructure }
     * 
     * 
     */
    public List<DefaultedTextStructure> getAdvice() {
        if (advice == null) {
            advice = new ArrayList<DefaultedTextStructure>();
        }
        return this.advice;
    }

    public boolean isSetAdvice() {
        return ((this.advice!= null)&&(!this.advice.isEmpty()));
    }

    public void unsetAdvice() {
        this.advice = null;
    }

    /**
     * Obtient la valeur de la propriété internal.
     * 
     * @return
     *     possible object is
     *     {@link DefaultedTextStructure }
     *     
     */
    public DefaultedTextStructure getInternal() {
        return internal;
    }

    /**
     * Définit la valeur de la propriété internal.
     * 
     * @param value
     *     allowed object is
     *     {@link DefaultedTextStructure }
     *     
     */
    public void setInternal(DefaultedTextStructure value) {
        this.internal = value;
    }

    public boolean isSetInternal() {
        return (this.internal!= null);
    }

    /**
     * Obtient la valeur de la propriété images.
     * 
     * @return
     *     possible object is
     *     {@link PtSituationElementStructure.Images }
     *     
     */
    public PtSituationElementStructure.Images getImages() {
        return images;
    }

    /**
     * Définit la valeur de la propriété images.
     * 
     * @param value
     *     allowed object is
     *     {@link PtSituationElementStructure.Images }
     *     
     */
    public void setImages(PtSituationElementStructure.Images value) {
        this.images = value;
    }

    public boolean isSetImages() {
        return (this.images!= null);
    }

    /**
     * Obtient la valeur de la propriété infoLinks.
     * 
     * @return
     *     possible object is
     *     {@link PtSituationElementStructure.InfoLinks }
     *     
     */
    public PtSituationElementStructure.InfoLinks getInfoLinks() {
        return infoLinks;
    }

    /**
     * Définit la valeur de la propriété infoLinks.
     * 
     * @param value
     *     allowed object is
     *     {@link PtSituationElementStructure.InfoLinks }
     *     
     */
    public void setInfoLinks(PtSituationElementStructure.InfoLinks value) {
        this.infoLinks = value;
    }

    public boolean isSetInfoLinks() {
        return (this.infoLinks!= null);
    }

    /**
     * Obtient la valeur de la propriété affects.
     * 
     * @return
     *     possible object is
     *     {@link AffectsScopeStructure }
     *     
     */
    public AffectsScopeStructure getAffects() {
        return affects;
    }

    /**
     * Définit la valeur de la propriété affects.
     * 
     * @param value
     *     allowed object is
     *     {@link AffectsScopeStructure }
     *     
     */
    public void setAffects(AffectsScopeStructure value) {
        this.affects = value;
    }

    public boolean isSetAffects() {
        return (this.affects!= null);
    }

    /**
     * Obtient la valeur de la propriété consequences.
     * 
     * @return
     *     possible object is
     *     {@link PtConsequencesStructure }
     *     
     */
    public PtConsequencesStructure getConsequences() {
        return consequences;
    }

    /**
     * Définit la valeur de la propriété consequences.
     * 
     * @param value
     *     allowed object is
     *     {@link PtConsequencesStructure }
     *     
     */
    public void setConsequences(PtConsequencesStructure value) {
        this.consequences = value;
    }

    public boolean isSetConsequences() {
        return (this.consequences!= null);
    }

    /**
     * Obtient la valeur de la propriété publishingActions.
     * 
     * @return
     *     possible object is
     *     {@link ActionsStructure }
     *     
     */
    public ActionsStructure getPublishingActions() {
        return publishingActions;
    }

    /**
     * Définit la valeur de la propriété publishingActions.
     * 
     * @param value
     *     allowed object is
     *     {@link ActionsStructure }
     *     
     */
    public void setPublishingActions(ActionsStructure value) {
        this.publishingActions = value;
    }

    public boolean isSetPublishingActions() {
        return (this.publishingActions!= null);
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
     * <p>Classe Java pour anonymous complex type.
     * 
     * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="Image" maxOccurs="unbounded">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;extension base="{http://www.siri.org.uk/siri}ImageStructure">
     *               &lt;/extension>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
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
        "image"
    })
    public static class Images
        implements Serializable
    {

        private final static long serialVersionUID = 1L;
        @XmlElement(name = "Image", required = true)
        protected List<PtSituationElementStructure.Images.Image> image;

        /**
         * Gets the value of the image property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the image property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getImage().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link PtSituationElementStructure.Images.Image }
         * 
         * 
         */
        public List<PtSituationElementStructure.Images.Image> getImage() {
            if (image == null) {
                image = new ArrayList<PtSituationElementStructure.Images.Image>();
            }
            return this.image;
        }

        public boolean isSetImage() {
            return ((this.image!= null)&&(!this.image.isEmpty()));
        }

        public void unsetImage() {
            this.image = null;
        }


        /**
         * <p>Classe Java pour anonymous complex type.
         * 
         * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;extension base="{http://www.siri.org.uk/siri}ImageStructure">
         *     &lt;/extension>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class Image
            extends ImageStructure
            implements Serializable
        {

            private final static long serialVersionUID = 1L;

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
     *         &lt;element name="InfoLink" type="{http://www.siri.org.uk/siri}InfoLinkStructure" maxOccurs="unbounded"/>
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
        "infoLink"
    })
    public static class InfoLinks
        implements Serializable
    {

        private final static long serialVersionUID = 1L;
        @XmlElement(name = "InfoLink", required = true)
        protected List<InfoLinkStructure> infoLink;

        /**
         * Gets the value of the infoLink property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the infoLink property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getInfoLink().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link InfoLinkStructure }
         * 
         * 
         */
        public List<InfoLinkStructure> getInfoLink() {
            if (infoLink == null) {
                infoLink = new ArrayList<InfoLinkStructure>();
            }
            return this.infoLink;
        }

        public boolean isSetInfoLink() {
            return ((this.infoLink!= null)&&(!this.infoLink.isEmpty()));
        }

        public void unsetInfoLink() {
            this.infoLink = null;
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
     *         &lt;element ref="{http://www.siri.org.uk/siri}DayType" maxOccurs="unbounded"/>
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
        "dayType"
    })
    public static class Repetitions
        implements Serializable
    {

        private final static long serialVersionUID = 1L;
        @XmlElement(name = "DayType", required = true, defaultValue = "everyDay")
        protected List<DayTypeEnumeration> dayType;

        /**
         * Gets the value of the dayType property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the dayType property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getDayType().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link DayTypeEnumeration }
         * 
         * 
         */
        public List<DayTypeEnumeration> getDayType() {
            if (dayType == null) {
                dayType = new ArrayList<DayTypeEnumeration>();
            }
            return this.dayType;
        }

        public boolean isSetDayType() {
            return ((this.dayType!= null)&&(!this.dayType.isEmpty()));
        }

        public void unsetDayType() {
            this.dayType = null;
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
     *       &lt;sequence maxOccurs="unbounded">
     *         &lt;element name="Reason">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;group ref="{http://www.siri.org.uk/siri}ReasonGroup"/>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
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
        "reason"
    })
    public static class SecondaryReasons
        implements Serializable
    {

        private final static long serialVersionUID = 1L;
        @XmlElement(name = "Reason", required = true)
        protected List<PtSituationElementStructure.SecondaryReasons.Reason> reason;

        /**
         * Gets the value of the reason property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the reason property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getReason().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link PtSituationElementStructure.SecondaryReasons.Reason }
         * 
         * 
         */
        public List<PtSituationElementStructure.SecondaryReasons.Reason> getReason() {
            if (reason == null) {
                reason = new ArrayList<PtSituationElementStructure.SecondaryReasons.Reason>();
            }
            return this.reason;
        }

        public boolean isSetReason() {
            return ((this.reason!= null)&&(!this.reason.isEmpty()));
        }

        public void unsetReason() {
            this.reason = null;
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
         *         &lt;group ref="{http://www.siri.org.uk/siri}ReasonGroup"/>
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
            "unknownReason",
            "miscellaneousReason",
            "personnelReason",
            "equipmentReason",
            "environmentReason",
            "undefinedReason",
            "miscellaneousSubReason",
            "personnelSubReason",
            "equipmentSubReason",
            "environmentSubReason",
            "publicEventReason",
            "reasonName"
        })
        public static class Reason
            implements Serializable
        {

            private final static long serialVersionUID = 1L;
            @XmlElement(name = "UnknownReason")
            protected String unknownReason;
            @XmlElement(name = "MiscellaneousReason")
            protected MiscellaneousReasonEnumeration miscellaneousReason;
            @XmlElement(name = "PersonnelReason")
            protected PersonnelReasonEnumeration personnelReason;
            @XmlElement(name = "EquipmentReason")
            protected EquipmentReasonEnumeration equipmentReason;
            @XmlElement(name = "EnvironmentReason")
            protected EnvironmentReasonEnumeration environmentReason;
            @XmlElement(name = "UndefinedReason")
            protected String undefinedReason;
            @XmlElement(name = "MiscellaneousSubReason")
            protected MiscellaneousSubReasonEnumeration miscellaneousSubReason;
            @XmlElement(name = "PersonnelSubReason")
            protected PersonnelSubReasonEnumeration personnelSubReason;
            @XmlElement(name = "EquipmentSubReason")
            protected EquipmentSubReasonEnumeration equipmentSubReason;
            @XmlElement(name = "EnvironmentSubReason")
            protected EnvironmentSubReasonEnumeration environmentSubReason;
            @XmlElement(name = "PublicEventReason")
            protected PublicEventTypeEnum publicEventReason;
            @XmlElement(name = "ReasonName")
            protected List<NaturalLanguageStringStructure> reasonName;

            /**
             * Obtient la valeur de la propriété unknownReason.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getUnknownReason() {
                return unknownReason;
            }

            /**
             * Définit la valeur de la propriété unknownReason.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setUnknownReason(String value) {
                this.unknownReason = value;
            }

            public boolean isSetUnknownReason() {
                return (this.unknownReason!= null);
            }

            /**
             * Obtient la valeur de la propriété miscellaneousReason.
             * 
             * @return
             *     possible object is
             *     {@link MiscellaneousReasonEnumeration }
             *     
             */
            public MiscellaneousReasonEnumeration getMiscellaneousReason() {
                return miscellaneousReason;
            }

            /**
             * Définit la valeur de la propriété miscellaneousReason.
             * 
             * @param value
             *     allowed object is
             *     {@link MiscellaneousReasonEnumeration }
             *     
             */
            public void setMiscellaneousReason(MiscellaneousReasonEnumeration value) {
                this.miscellaneousReason = value;
            }

            public boolean isSetMiscellaneousReason() {
                return (this.miscellaneousReason!= null);
            }

            /**
             * Personnel reason.
             * 
             * @return
             *     possible object is
             *     {@link PersonnelReasonEnumeration }
             *     
             */
            public PersonnelReasonEnumeration getPersonnelReason() {
                return personnelReason;
            }

            /**
             * Définit la valeur de la propriété personnelReason.
             * 
             * @param value
             *     allowed object is
             *     {@link PersonnelReasonEnumeration }
             *     
             */
            public void setPersonnelReason(PersonnelReasonEnumeration value) {
                this.personnelReason = value;
            }

            public boolean isSetPersonnelReason() {
                return (this.personnelReason!= null);
            }

            /**
             * Obtient la valeur de la propriété equipmentReason.
             * 
             * @return
             *     possible object is
             *     {@link EquipmentReasonEnumeration }
             *     
             */
            public EquipmentReasonEnumeration getEquipmentReason() {
                return equipmentReason;
            }

            /**
             * Définit la valeur de la propriété equipmentReason.
             * 
             * @param value
             *     allowed object is
             *     {@link EquipmentReasonEnumeration }
             *     
             */
            public void setEquipmentReason(EquipmentReasonEnumeration value) {
                this.equipmentReason = value;
            }

            public boolean isSetEquipmentReason() {
                return (this.equipmentReason!= null);
            }

            /**
             * Environment reason.
             * 
             * @return
             *     possible object is
             *     {@link EnvironmentReasonEnumeration }
             *     
             */
            public EnvironmentReasonEnumeration getEnvironmentReason() {
                return environmentReason;
            }

            /**
             * Définit la valeur de la propriété environmentReason.
             * 
             * @param value
             *     allowed object is
             *     {@link EnvironmentReasonEnumeration }
             *     
             */
            public void setEnvironmentReason(EnvironmentReasonEnumeration value) {
                this.environmentReason = value;
            }

            public boolean isSetEnvironmentReason() {
                return (this.environmentReason!= null);
            }

            /**
             * Obtient la valeur de la propriété undefinedReason.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getUndefinedReason() {
                return undefinedReason;
            }

            /**
             * Définit la valeur de la propriété undefinedReason.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setUndefinedReason(String value) {
                this.undefinedReason = value;
            }

            public boolean isSetUndefinedReason() {
                return (this.undefinedReason!= null);
            }

            /**
             * Obtient la valeur de la propriété miscellaneousSubReason.
             * 
             * @return
             *     possible object is
             *     {@link MiscellaneousSubReasonEnumeration }
             *     
             */
            public MiscellaneousSubReasonEnumeration getMiscellaneousSubReason() {
                return miscellaneousSubReason;
            }

            /**
             * Définit la valeur de la propriété miscellaneousSubReason.
             * 
             * @param value
             *     allowed object is
             *     {@link MiscellaneousSubReasonEnumeration }
             *     
             */
            public void setMiscellaneousSubReason(MiscellaneousSubReasonEnumeration value) {
                this.miscellaneousSubReason = value;
            }

            public boolean isSetMiscellaneousSubReason() {
                return (this.miscellaneousSubReason!= null);
            }

            /**
             * Personnel reason.
             * 
             * @return
             *     possible object is
             *     {@link PersonnelSubReasonEnumeration }
             *     
             */
            public PersonnelSubReasonEnumeration getPersonnelSubReason() {
                return personnelSubReason;
            }

            /**
             * Définit la valeur de la propriété personnelSubReason.
             * 
             * @param value
             *     allowed object is
             *     {@link PersonnelSubReasonEnumeration }
             *     
             */
            public void setPersonnelSubReason(PersonnelSubReasonEnumeration value) {
                this.personnelSubReason = value;
            }

            public boolean isSetPersonnelSubReason() {
                return (this.personnelSubReason!= null);
            }

            /**
             * Obtient la valeur de la propriété equipmentSubReason.
             * 
             * @return
             *     possible object is
             *     {@link EquipmentSubReasonEnumeration }
             *     
             */
            public EquipmentSubReasonEnumeration getEquipmentSubReason() {
                return equipmentSubReason;
            }

            /**
             * Définit la valeur de la propriété equipmentSubReason.
             * 
             * @param value
             *     allowed object is
             *     {@link EquipmentSubReasonEnumeration }
             *     
             */
            public void setEquipmentSubReason(EquipmentSubReasonEnumeration value) {
                this.equipmentSubReason = value;
            }

            public boolean isSetEquipmentSubReason() {
                return (this.equipmentSubReason!= null);
            }

            /**
             * Environment reason.
             * 
             * @return
             *     possible object is
             *     {@link EnvironmentSubReasonEnumeration }
             *     
             */
            public EnvironmentSubReasonEnumeration getEnvironmentSubReason() {
                return environmentSubReason;
            }

            /**
             * Définit la valeur de la propriété environmentSubReason.
             * 
             * @param value
             *     allowed object is
             *     {@link EnvironmentSubReasonEnumeration }
             *     
             */
            public void setEnvironmentSubReason(EnvironmentSubReasonEnumeration value) {
                this.environmentSubReason = value;
            }

            public boolean isSetEnvironmentSubReason() {
                return (this.environmentSubReason!= null);
            }

            /**
             * Obtient la valeur de la propriété publicEventReason.
             * 
             * @return
             *     possible object is
             *     {@link PublicEventTypeEnum }
             *     
             */
            public PublicEventTypeEnum getPublicEventReason() {
                return publicEventReason;
            }

            /**
             * Définit la valeur de la propriété publicEventReason.
             * 
             * @param value
             *     allowed object is
             *     {@link PublicEventTypeEnum }
             *     
             */
            public void setPublicEventReason(PublicEventTypeEnum value) {
                this.publicEventReason = value;
            }

            public boolean isSetPublicEventReason() {
                return (this.publicEventReason!= null);
            }

            /**
             * Gets the value of the reasonName property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the reasonName property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getReasonName().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link NaturalLanguageStringStructure }
             * 
             * 
             */
            public List<NaturalLanguageStringStructure> getReasonName() {
                if (reasonName == null) {
                    reasonName = new ArrayList<NaturalLanguageStringStructure>();
                }
                return this.reasonName;
            }

            public boolean isSetReasonName() {
                return ((this.reasonName!= null)&&(!this.reasonName.isEmpty()));
            }

            public void unsetReasonName() {
                this.reasonName = null;
            }

        }

    }

}
