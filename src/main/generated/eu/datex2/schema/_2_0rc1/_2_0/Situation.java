
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
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Classe Java pour Situation complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="Situation">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="overallSeverity" type="{http://datex2.eu/schema/2_0RC1/2_0}OverallSeverityEnum" minOccurs="0"/>
 *         &lt;element name="relatedSituation" type="{http://datex2.eu/schema/2_0RC1/2_0}Reference" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="situationVersion" type="{http://datex2.eu/schema/2_0RC1/2_0}NonNegativeInteger" minOccurs="0"/>
 *         &lt;element name="situationVersionTime" type="{http://datex2.eu/schema/2_0RC1/2_0}DateTime" minOccurs="0"/>
 *         &lt;element name="headerInformation" type="{http://datex2.eu/schema/2_0RC1/2_0}HeaderInformation"/>
 *         &lt;element name="situationRecord" type="{http://datex2.eu/schema/2_0RC1/2_0}SituationRecord" maxOccurs="unbounded"/>
 *         &lt;element name="situationExtension" type="{http://datex2.eu/schema/2_0RC1/2_0}ExtensionType" minOccurs="0"/>
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
@XmlType(name = "Situation", propOrder = {
    "overallSeverity",
    "relatedSituation",
    "situationVersion",
    "situationVersionTime",
    "headerInformation",
    "situationRecord",
    "situationExtension"
})
public class Situation
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    protected OverallSeverityEnum overallSeverity;
    protected List<String> relatedSituation;
    protected BigInteger situationVersion;
    protected XMLGregorianCalendar situationVersionTime;
    @XmlElement(required = true)
    protected HeaderInformation headerInformation;
    @XmlElement(required = true)
    protected List<SituationRecord> situationRecord;
    protected ExtensionType situationExtension;
    @XmlAttribute(name = "id", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlID
    @XmlSchemaType(name = "ID")
    protected String id;

    /**
     * Obtient la valeur de la propriété overallSeverity.
     * 
     * @return
     *     possible object is
     *     {@link OverallSeverityEnum }
     *     
     */
    public OverallSeverityEnum getOverallSeverity() {
        return overallSeverity;
    }

    /**
     * Définit la valeur de la propriété overallSeverity.
     * 
     * @param value
     *     allowed object is
     *     {@link OverallSeverityEnum }
     *     
     */
    public void setOverallSeverity(OverallSeverityEnum value) {
        this.overallSeverity = value;
    }

    public boolean isSetOverallSeverity() {
        return (this.overallSeverity!= null);
    }

    /**
     * Gets the value of the relatedSituation property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the relatedSituation property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRelatedSituation().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getRelatedSituation() {
        if (relatedSituation == null) {
            relatedSituation = new ArrayList<String>();
        }
        return this.relatedSituation;
    }

    public boolean isSetRelatedSituation() {
        return ((this.relatedSituation!= null)&&(!this.relatedSituation.isEmpty()));
    }

    public void unsetRelatedSituation() {
        this.relatedSituation = null;
    }

    /**
     * Obtient la valeur de la propriété situationVersion.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getSituationVersion() {
        return situationVersion;
    }

    /**
     * Définit la valeur de la propriété situationVersion.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setSituationVersion(BigInteger value) {
        this.situationVersion = value;
    }

    public boolean isSetSituationVersion() {
        return (this.situationVersion!= null);
    }

    /**
     * Obtient la valeur de la propriété situationVersionTime.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getSituationVersionTime() {
        return situationVersionTime;
    }

    /**
     * Définit la valeur de la propriété situationVersionTime.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setSituationVersionTime(XMLGregorianCalendar value) {
        this.situationVersionTime = value;
    }

    public boolean isSetSituationVersionTime() {
        return (this.situationVersionTime!= null);
    }

    /**
     * Obtient la valeur de la propriété headerInformation.
     * 
     * @return
     *     possible object is
     *     {@link HeaderInformation }
     *     
     */
    public HeaderInformation getHeaderInformation() {
        return headerInformation;
    }

    /**
     * Définit la valeur de la propriété headerInformation.
     * 
     * @param value
     *     allowed object is
     *     {@link HeaderInformation }
     *     
     */
    public void setHeaderInformation(HeaderInformation value) {
        this.headerInformation = value;
    }

    public boolean isSetHeaderInformation() {
        return (this.headerInformation!= null);
    }

    /**
     * Gets the value of the situationRecord property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the situationRecord property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSituationRecord().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SituationRecord }
     * 
     * 
     */
    public List<SituationRecord> getSituationRecord() {
        if (situationRecord == null) {
            situationRecord = new ArrayList<SituationRecord>();
        }
        return this.situationRecord;
    }

    public boolean isSetSituationRecord() {
        return ((this.situationRecord!= null)&&(!this.situationRecord.isEmpty()));
    }

    public void unsetSituationRecord() {
        this.situationRecord = null;
    }

    /**
     * Obtient la valeur de la propriété situationExtension.
     * 
     * @return
     *     possible object is
     *     {@link ExtensionType }
     *     
     */
    public ExtensionType getSituationExtension() {
        return situationExtension;
    }

    /**
     * Définit la valeur de la propriété situationExtension.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtensionType }
     *     
     */
    public void setSituationExtension(ExtensionType value) {
        this.situationExtension = value;
    }

    public boolean isSetSituationExtension() {
        return (this.situationExtension!= null);
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
