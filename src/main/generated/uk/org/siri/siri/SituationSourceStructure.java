
package uk.org.siri.siri;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import javax.xml.datatype.XMLGregorianCalendar;
import eu.datex2.schema._2_0rc1._2_0.SourceTypeEnum;


/**
 * Type for a source, i.e. provider of information.
 * 
 * <p>Classe Java pour SituationSourceStructure complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="SituationSourceStructure">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Country" type="{http://www.w3.org/2001/XMLSchema}NMTOKEN" minOccurs="0"/>
 *         &lt;element name="SourceType" type="{http://www.siri.org.uk/siri}SituationSourceTypeEnumeration"/>
 *         &lt;group ref="{http://www.siri.org.uk/siri}SituationSourceDetailsGroup"/>
 *         &lt;element name="SourceMethod" type="{http://datex2.eu/schema/2_0RC1/2_0}SourceTypeEnum" minOccurs="0"/>
 *         &lt;element name="AgentReference" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Name" type="{http://www.siri.org.uk/siri}NaturalLanguageStringStructure" minOccurs="0"/>
 *         &lt;element name="SourceRole" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TimeOfCommunication" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="ExternalCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SourceFile" type="{http://www.w3.org/2001/XMLSchema}anyURI" minOccurs="0"/>
 *         &lt;element ref="{http://www.siri.org.uk/siri}Extensions" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SituationSourceStructure", propOrder = {
    "country",
    "sourceType",
    "email",
    "phone",
    "fax",
    "web",
    "other",
    "sourceMethod",
    "agentReference",
    "name",
    "sourceRole",
    "timeOfCommunication",
    "externalCode",
    "sourceFile",
    "extensions"
})
public class SituationSourceStructure
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "Country")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NMTOKEN")
    protected String country;
    @XmlElement(name = "SourceType", required = true)
    protected SituationSourceTypeEnumeration sourceType;
    @XmlElement(name = "Email")
    protected String email;
    @XmlElement(name = "Phone")
    protected String phone;
    @XmlElement(name = "Fax")
    protected String fax;
    @XmlElement(name = "Web")
    @XmlSchemaType(name = "anyURI")
    protected String web;
    @XmlElement(name = "Other")
    protected String other;
    @XmlElement(name = "SourceMethod")
    protected SourceTypeEnum sourceMethod;
    @XmlElement(name = "AgentReference")
    protected String agentReference;
    @XmlElement(name = "Name")
    protected NaturalLanguageStringStructure name;
    @XmlElement(name = "SourceRole")
    protected String sourceRole;
    @XmlElement(name = "TimeOfCommunication")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar timeOfCommunication;
    @XmlElement(name = "ExternalCode")
    protected String externalCode;
    @XmlElement(name = "SourceFile")
    @XmlSchemaType(name = "anyURI")
    protected String sourceFile;
    @XmlElement(name = "Extensions")
    protected ExtensionsStructure extensions;

    /**
     * Obtient la valeur de la propriété country.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCountry() {
        return country;
    }

    /**
     * Définit la valeur de la propriété country.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCountry(String value) {
        this.country = value;
    }

    public boolean isSetCountry() {
        return (this.country!= null);
    }

    /**
     * Obtient la valeur de la propriété sourceType.
     * 
     * @return
     *     possible object is
     *     {@link SituationSourceTypeEnumeration }
     *     
     */
    public SituationSourceTypeEnumeration getSourceType() {
        return sourceType;
    }

    /**
     * Définit la valeur de la propriété sourceType.
     * 
     * @param value
     *     allowed object is
     *     {@link SituationSourceTypeEnumeration }
     *     
     */
    public void setSourceType(SituationSourceTypeEnumeration value) {
        this.sourceType = value;
    }

    public boolean isSetSourceType() {
        return (this.sourceType!= null);
    }

    /**
     * Obtient la valeur de la propriété email.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmail() {
        return email;
    }

    /**
     * Définit la valeur de la propriété email.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmail(String value) {
        this.email = value;
    }

    public boolean isSetEmail() {
        return (this.email!= null);
    }

    /**
     * Obtient la valeur de la propriété phone.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPhone() {
        return phone;
    }

    /**
     * Définit la valeur de la propriété phone.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPhone(String value) {
        this.phone = value;
    }

    public boolean isSetPhone() {
        return (this.phone!= null);
    }

    /**
     * Obtient la valeur de la propriété fax.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFax() {
        return fax;
    }

    /**
     * Définit la valeur de la propriété fax.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFax(String value) {
        this.fax = value;
    }

    public boolean isSetFax() {
        return (this.fax!= null);
    }

    /**
     * Obtient la valeur de la propriété web.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWeb() {
        return web;
    }

    /**
     * Définit la valeur de la propriété web.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWeb(String value) {
        this.web = value;
    }

    public boolean isSetWeb() {
        return (this.web!= null);
    }

    /**
     * Obtient la valeur de la propriété other.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOther() {
        return other;
    }

    /**
     * Définit la valeur de la propriété other.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOther(String value) {
        this.other = value;
    }

    public boolean isSetOther() {
        return (this.other!= null);
    }

    /**
     * Obtient la valeur de la propriété sourceMethod.
     * 
     * @return
     *     possible object is
     *     {@link SourceTypeEnum }
     *     
     */
    public SourceTypeEnum getSourceMethod() {
        return sourceMethod;
    }

    /**
     * Définit la valeur de la propriété sourceMethod.
     * 
     * @param value
     *     allowed object is
     *     {@link SourceTypeEnum }
     *     
     */
    public void setSourceMethod(SourceTypeEnum value) {
        this.sourceMethod = value;
    }

    public boolean isSetSourceMethod() {
        return (this.sourceMethod!= null);
    }

    /**
     * Obtient la valeur de la propriété agentReference.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAgentReference() {
        return agentReference;
    }

    /**
     * Définit la valeur de la propriété agentReference.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAgentReference(String value) {
        this.agentReference = value;
    }

    public boolean isSetAgentReference() {
        return (this.agentReference!= null);
    }

    /**
     * Obtient la valeur de la propriété name.
     * 
     * @return
     *     possible object is
     *     {@link NaturalLanguageStringStructure }
     *     
     */
    public NaturalLanguageStringStructure getName() {
        return name;
    }

    /**
     * Définit la valeur de la propriété name.
     * 
     * @param value
     *     allowed object is
     *     {@link NaturalLanguageStringStructure }
     *     
     */
    public void setName(NaturalLanguageStringStructure value) {
        this.name = value;
    }

    public boolean isSetName() {
        return (this.name!= null);
    }

    /**
     * Obtient la valeur de la propriété sourceRole.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSourceRole() {
        return sourceRole;
    }

    /**
     * Définit la valeur de la propriété sourceRole.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSourceRole(String value) {
        this.sourceRole = value;
    }

    public boolean isSetSourceRole() {
        return (this.sourceRole!= null);
    }

    /**
     * Obtient la valeur de la propriété timeOfCommunication.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getTimeOfCommunication() {
        return timeOfCommunication;
    }

    /**
     * Définit la valeur de la propriété timeOfCommunication.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setTimeOfCommunication(XMLGregorianCalendar value) {
        this.timeOfCommunication = value;
    }

    public boolean isSetTimeOfCommunication() {
        return (this.timeOfCommunication!= null);
    }

    /**
     * Obtient la valeur de la propriété externalCode.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExternalCode() {
        return externalCode;
    }

    /**
     * Définit la valeur de la propriété externalCode.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExternalCode(String value) {
        this.externalCode = value;
    }

    public boolean isSetExternalCode() {
        return (this.externalCode!= null);
    }

    /**
     * Obtient la valeur de la propriété sourceFile.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSourceFile() {
        return sourceFile;
    }

    /**
     * Définit la valeur de la propriété sourceFile.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSourceFile(String value) {
        this.sourceFile = value;
    }

    public boolean isSetSourceFile() {
        return (this.sourceFile!= null);
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

}
