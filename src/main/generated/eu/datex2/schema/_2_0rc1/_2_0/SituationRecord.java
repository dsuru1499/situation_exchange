
package eu.datex2.schema._2_0rc1._2_0;

import java.io.Serializable;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlID;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Classe Java pour SituationRecord complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="SituationRecord">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="situationRecordCreationReference" type="{http://datex2.eu/schema/2_0RC1/2_0}String" minOccurs="0"/>
 *         &lt;element name="situationRecordCreationTime" type="{http://datex2.eu/schema/2_0RC1/2_0}DateTime"/>
 *         &lt;element name="situationRecordObservationTime" type="{http://datex2.eu/schema/2_0RC1/2_0}DateTime" minOccurs="0"/>
 *         &lt;element name="situationRecordVersion" type="{http://datex2.eu/schema/2_0RC1/2_0}NonNegativeInteger"/>
 *         &lt;element name="situationRecordVersionTime" type="{http://datex2.eu/schema/2_0RC1/2_0}DateTime"/>
 *         &lt;element name="situationRecordFirstSupplierVersionTime" type="{http://datex2.eu/schema/2_0RC1/2_0}DateTime" minOccurs="0"/>
 *         &lt;element name="confidentialityOverride" type="{http://datex2.eu/schema/2_0RC1/2_0}ConfidentialityValueEnum" minOccurs="0"/>
 *         &lt;element name="probabilityOfOccurrence" type="{http://datex2.eu/schema/2_0RC1/2_0}ProbabilityOfOccurrenceEnum"/>
 *         &lt;element name="source" type="{http://datex2.eu/schema/2_0RC1/2_0}Source" minOccurs="0"/>
 *         &lt;element name="validity" type="{http://datex2.eu/schema/2_0RC1/2_0}Validity"/>
 *         &lt;element name="impact" type="{http://datex2.eu/schema/2_0RC1/2_0}Impact" minOccurs="0"/>
 *         &lt;element name="cause" type="{http://datex2.eu/schema/2_0RC1/2_0}Cause" minOccurs="0"/>
 *         &lt;element name="generalPublicComment" type="{http://datex2.eu/schema/2_0RC1/2_0}Comment" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="nonGeneralPublicComment" type="{http://datex2.eu/schema/2_0RC1/2_0}Comment" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="urlLink" type="{http://datex2.eu/schema/2_0RC1/2_0}UrlLink" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="groupOfLocations" type="{http://datex2.eu/schema/2_0RC1/2_0}GroupOfLocations"/>
 *         &lt;element name="management" type="{http://datex2.eu/schema/2_0RC1/2_0}Management" minOccurs="0"/>
 *         &lt;element name="situationRecordExtension" type="{http://datex2.eu/schema/2_0RC1/2_0}ExtensionType" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="id" use="required" type="{http://www.w3.org/2001/XMLSchema}ID" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SituationRecord", propOrder = {
    "situationRecordCreationReference",
    "situationRecordCreationTime",
    "situationRecordObservationTime",
    "situationRecordVersion",
    "situationRecordVersionTime",
    "situationRecordFirstSupplierVersionTime",
    "confidentialityOverride",
    "probabilityOfOccurrence",
    "source",
    "validity",
    "impact",
    "cause",
    "generalPublicComment",
    "nonGeneralPublicComment",
    "urlLink",
    "groupOfLocations",
    "management",
    "situationRecordExtension"
})
@XmlSeeAlso({
    GenericSituationRecord.class,
    NonRoadEventInformation.class,
    OperatorAction.class,
    TrafficElement.class
})
public abstract class SituationRecord
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    protected String situationRecordCreationReference;
    @XmlElement(required = true)
    protected XMLGregorianCalendar situationRecordCreationTime;
    protected XMLGregorianCalendar situationRecordObservationTime;
    @XmlElement(required = true)
    protected BigInteger situationRecordVersion;
    @XmlElement(required = true)
    protected XMLGregorianCalendar situationRecordVersionTime;
    protected XMLGregorianCalendar situationRecordFirstSupplierVersionTime;
    protected ConfidentialityValueEnum confidentialityOverride;
    @XmlElement(required = true)
    protected ProbabilityOfOccurrenceEnum probabilityOfOccurrence;
    protected Source source;
    @XmlElement(required = true)
    protected Validity validity;
    protected Impact impact;
    protected Cause cause;
    protected List<Comment> generalPublicComment;
    protected List<Comment> nonGeneralPublicComment;
    protected List<UrlLink> urlLink;
    @XmlElement(required = true)
    protected GroupOfLocations groupOfLocations;
    protected Management management;
    protected ExtensionType situationRecordExtension;
    @XmlAttribute(name = "id", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlID
    @XmlSchemaType(name = "ID")
    protected String id;

    /**
     * Obtient la valeur de la propriété situationRecordCreationReference.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSituationRecordCreationReference() {
        return situationRecordCreationReference;
    }

    /**
     * Définit la valeur de la propriété situationRecordCreationReference.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSituationRecordCreationReference(String value) {
        this.situationRecordCreationReference = value;
    }

    public boolean isSetSituationRecordCreationReference() {
        return (this.situationRecordCreationReference!= null);
    }

    /**
     * Obtient la valeur de la propriété situationRecordCreationTime.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getSituationRecordCreationTime() {
        return situationRecordCreationTime;
    }

    /**
     * Définit la valeur de la propriété situationRecordCreationTime.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setSituationRecordCreationTime(XMLGregorianCalendar value) {
        this.situationRecordCreationTime = value;
    }

    public boolean isSetSituationRecordCreationTime() {
        return (this.situationRecordCreationTime!= null);
    }

    /**
     * Obtient la valeur de la propriété situationRecordObservationTime.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getSituationRecordObservationTime() {
        return situationRecordObservationTime;
    }

    /**
     * Définit la valeur de la propriété situationRecordObservationTime.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setSituationRecordObservationTime(XMLGregorianCalendar value) {
        this.situationRecordObservationTime = value;
    }

    public boolean isSetSituationRecordObservationTime() {
        return (this.situationRecordObservationTime!= null);
    }

    /**
     * Obtient la valeur de la propriété situationRecordVersion.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getSituationRecordVersion() {
        return situationRecordVersion;
    }

    /**
     * Définit la valeur de la propriété situationRecordVersion.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setSituationRecordVersion(BigInteger value) {
        this.situationRecordVersion = value;
    }

    public boolean isSetSituationRecordVersion() {
        return (this.situationRecordVersion!= null);
    }

    /**
     * Obtient la valeur de la propriété situationRecordVersionTime.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getSituationRecordVersionTime() {
        return situationRecordVersionTime;
    }

    /**
     * Définit la valeur de la propriété situationRecordVersionTime.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setSituationRecordVersionTime(XMLGregorianCalendar value) {
        this.situationRecordVersionTime = value;
    }

    public boolean isSetSituationRecordVersionTime() {
        return (this.situationRecordVersionTime!= null);
    }

    /**
     * Obtient la valeur de la propriété situationRecordFirstSupplierVersionTime.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getSituationRecordFirstSupplierVersionTime() {
        return situationRecordFirstSupplierVersionTime;
    }

    /**
     * Définit la valeur de la propriété situationRecordFirstSupplierVersionTime.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setSituationRecordFirstSupplierVersionTime(XMLGregorianCalendar value) {
        this.situationRecordFirstSupplierVersionTime = value;
    }

    public boolean isSetSituationRecordFirstSupplierVersionTime() {
        return (this.situationRecordFirstSupplierVersionTime!= null);
    }

    /**
     * Obtient la valeur de la propriété confidentialityOverride.
     * 
     * @return
     *     possible object is
     *     {@link ConfidentialityValueEnum }
     *     
     */
    public ConfidentialityValueEnum getConfidentialityOverride() {
        return confidentialityOverride;
    }

    /**
     * Définit la valeur de la propriété confidentialityOverride.
     * 
     * @param value
     *     allowed object is
     *     {@link ConfidentialityValueEnum }
     *     
     */
    public void setConfidentialityOverride(ConfidentialityValueEnum value) {
        this.confidentialityOverride = value;
    }

    public boolean isSetConfidentialityOverride() {
        return (this.confidentialityOverride!= null);
    }

    /**
     * Obtient la valeur de la propriété probabilityOfOccurrence.
     * 
     * @return
     *     possible object is
     *     {@link ProbabilityOfOccurrenceEnum }
     *     
     */
    public ProbabilityOfOccurrenceEnum getProbabilityOfOccurrence() {
        return probabilityOfOccurrence;
    }

    /**
     * Définit la valeur de la propriété probabilityOfOccurrence.
     * 
     * @param value
     *     allowed object is
     *     {@link ProbabilityOfOccurrenceEnum }
     *     
     */
    public void setProbabilityOfOccurrence(ProbabilityOfOccurrenceEnum value) {
        this.probabilityOfOccurrence = value;
    }

    public boolean isSetProbabilityOfOccurrence() {
        return (this.probabilityOfOccurrence!= null);
    }

    /**
     * Obtient la valeur de la propriété source.
     * 
     * @return
     *     possible object is
     *     {@link Source }
     *     
     */
    public Source getSource() {
        return source;
    }

    /**
     * Définit la valeur de la propriété source.
     * 
     * @param value
     *     allowed object is
     *     {@link Source }
     *     
     */
    public void setSource(Source value) {
        this.source = value;
    }

    public boolean isSetSource() {
        return (this.source!= null);
    }

    /**
     * Obtient la valeur de la propriété validity.
     * 
     * @return
     *     possible object is
     *     {@link Validity }
     *     
     */
    public Validity getValidity() {
        return validity;
    }

    /**
     * Définit la valeur de la propriété validity.
     * 
     * @param value
     *     allowed object is
     *     {@link Validity }
     *     
     */
    public void setValidity(Validity value) {
        this.validity = value;
    }

    public boolean isSetValidity() {
        return (this.validity!= null);
    }

    /**
     * Obtient la valeur de la propriété impact.
     * 
     * @return
     *     possible object is
     *     {@link Impact }
     *     
     */
    public Impact getImpact() {
        return impact;
    }

    /**
     * Définit la valeur de la propriété impact.
     * 
     * @param value
     *     allowed object is
     *     {@link Impact }
     *     
     */
    public void setImpact(Impact value) {
        this.impact = value;
    }

    public boolean isSetImpact() {
        return (this.impact!= null);
    }

    /**
     * Obtient la valeur de la propriété cause.
     * 
     * @return
     *     possible object is
     *     {@link Cause }
     *     
     */
    public Cause getCause() {
        return cause;
    }

    /**
     * Définit la valeur de la propriété cause.
     * 
     * @param value
     *     allowed object is
     *     {@link Cause }
     *     
     */
    public void setCause(Cause value) {
        this.cause = value;
    }

    public boolean isSetCause() {
        return (this.cause!= null);
    }

    /**
     * Gets the value of the generalPublicComment property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the generalPublicComment property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getGeneralPublicComment().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Comment }
     * 
     * 
     */
    public List<Comment> getGeneralPublicComment() {
        if (generalPublicComment == null) {
            generalPublicComment = new ArrayList<Comment>();
        }
        return this.generalPublicComment;
    }

    public boolean isSetGeneralPublicComment() {
        return ((this.generalPublicComment!= null)&&(!this.generalPublicComment.isEmpty()));
    }

    public void unsetGeneralPublicComment() {
        this.generalPublicComment = null;
    }

    /**
     * Gets the value of the nonGeneralPublicComment property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the nonGeneralPublicComment property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getNonGeneralPublicComment().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Comment }
     * 
     * 
     */
    public List<Comment> getNonGeneralPublicComment() {
        if (nonGeneralPublicComment == null) {
            nonGeneralPublicComment = new ArrayList<Comment>();
        }
        return this.nonGeneralPublicComment;
    }

    public boolean isSetNonGeneralPublicComment() {
        return ((this.nonGeneralPublicComment!= null)&&(!this.nonGeneralPublicComment.isEmpty()));
    }

    public void unsetNonGeneralPublicComment() {
        this.nonGeneralPublicComment = null;
    }

    /**
     * Gets the value of the urlLink property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the urlLink property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getUrlLink().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link UrlLink }
     * 
     * 
     */
    public List<UrlLink> getUrlLink() {
        if (urlLink == null) {
            urlLink = new ArrayList<UrlLink>();
        }
        return this.urlLink;
    }

    public boolean isSetUrlLink() {
        return ((this.urlLink!= null)&&(!this.urlLink.isEmpty()));
    }

    public void unsetUrlLink() {
        this.urlLink = null;
    }

    /**
     * Obtient la valeur de la propriété groupOfLocations.
     * 
     * @return
     *     possible object is
     *     {@link GroupOfLocations }
     *     
     */
    public GroupOfLocations getGroupOfLocations() {
        return groupOfLocations;
    }

    /**
     * Définit la valeur de la propriété groupOfLocations.
     * 
     * @param value
     *     allowed object is
     *     {@link GroupOfLocations }
     *     
     */
    public void setGroupOfLocations(GroupOfLocations value) {
        this.groupOfLocations = value;
    }

    public boolean isSetGroupOfLocations() {
        return (this.groupOfLocations!= null);
    }

    /**
     * Obtient la valeur de la propriété management.
     * 
     * @return
     *     possible object is
     *     {@link Management }
     *     
     */
    public Management getManagement() {
        return management;
    }

    /**
     * Définit la valeur de la propriété management.
     * 
     * @param value
     *     allowed object is
     *     {@link Management }
     *     
     */
    public void setManagement(Management value) {
        this.management = value;
    }

    public boolean isSetManagement() {
        return (this.management!= null);
    }

    /**
     * Obtient la valeur de la propriété situationRecordExtension.
     * 
     * @return
     *     possible object is
     *     {@link ExtensionType }
     *     
     */
    public ExtensionType getSituationRecordExtension() {
        return situationRecordExtension;
    }

    /**
     * Définit la valeur de la propriété situationRecordExtension.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtensionType }
     *     
     */
    public void setSituationRecordExtension(ExtensionType value) {
        this.situationRecordExtension = value;
    }

    public boolean isSetSituationRecordExtension() {
        return (this.situationRecordExtension!= null);
    }

    /**
     * Obtient la valeur de la propriété id.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getId() {
        return id;
    }

    /**
     * Définit la valeur de la propriété id.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setId(String value) {
        this.id = value;
    }

    public boolean isSetId() {
        return (this.id!= null);
    }

}
