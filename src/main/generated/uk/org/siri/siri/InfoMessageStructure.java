
package uk.org.siri.siri;

import java.io.Serializable;
import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * Type for an Info Message. @formatRef.
 * 
 * <p>Classe Java pour InfoMessageStructure complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="InfoMessageStructure">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.siri.org.uk/siri}AbstractIdentifiedItemStructure">
 *       &lt;sequence>
 *         &lt;group ref="{http://www.siri.org.uk/siri}InfoMessageGroup"/>
 *         &lt;element name="ValidUntilTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element ref="{http://www.siri.org.uk/siri}SituationRef" minOccurs="0"/>
 *         &lt;element name="Content" type="{http://www.w3.org/2001/XMLSchema}anyType"/>
 *         &lt;element ref="{http://www.siri.org.uk/siri}Extensions" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="formatRef" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InfoMessageStructure", propOrder = {
    "infoMessageIdentifier",
    "infoMessageVersion",
    "infoChannelRef",
    "validUntilTime",
    "situationRef",
    "content",
    "extensions"
})
public class InfoMessageStructure
    extends AbstractIdentifiedItemStructure
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "InfoMessageIdentifier", required = true)
    protected InfoMessageRefStructure infoMessageIdentifier;
    @XmlElement(name = "InfoMessageVersion")
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger infoMessageVersion;
    @XmlElement(name = "InfoChannelRef")
    protected InfoChannelRefStructure infoChannelRef;
    @XmlElement(name = "ValidUntilTime")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar validUntilTime;
    @XmlElement(name = "SituationRef")
    protected SituationRefStructure situationRef;
    @XmlElement(name = "Content", required = true)
    protected Object content;
    @XmlElement(name = "Extensions")
    protected ExtensionsStructure extensions;
    @XmlAttribute(name = "formatRef")
    protected String formatRef;

    /**
     * Obtient la valeur de la propriété infoMessageIdentifier.
     * 
     * @return
     *     possible object is
     *     {@link InfoMessageRefStructure }
     *     
     */
    public InfoMessageRefStructure getInfoMessageIdentifier() {
        return infoMessageIdentifier;
    }

    /**
     * Définit la valeur de la propriété infoMessageIdentifier.
     * 
     * @param value
     *     allowed object is
     *     {@link InfoMessageRefStructure }
     *     
     */
    public void setInfoMessageIdentifier(InfoMessageRefStructure value) {
        this.infoMessageIdentifier = value;
    }

    public boolean isSetInfoMessageIdentifier() {
        return (this.infoMessageIdentifier!= null);
    }

    /**
     * Obtient la valeur de la propriété infoMessageVersion.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getInfoMessageVersion() {
        return infoMessageVersion;
    }

    /**
     * Définit la valeur de la propriété infoMessageVersion.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setInfoMessageVersion(BigInteger value) {
        this.infoMessageVersion = value;
    }

    public boolean isSetInfoMessageVersion() {
        return (this.infoMessageVersion!= null);
    }

    /**
     * Obtient la valeur de la propriété infoChannelRef.
     * 
     * @return
     *     possible object is
     *     {@link InfoChannelRefStructure }
     *     
     */
    public InfoChannelRefStructure getInfoChannelRef() {
        return infoChannelRef;
    }

    /**
     * Définit la valeur de la propriété infoChannelRef.
     * 
     * @param value
     *     allowed object is
     *     {@link InfoChannelRefStructure }
     *     
     */
    public void setInfoChannelRef(InfoChannelRefStructure value) {
        this.infoChannelRef = value;
    }

    public boolean isSetInfoChannelRef() {
        return (this.infoChannelRef!= null);
    }

    /**
     * Obtient la valeur de la propriété validUntilTime.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getValidUntilTime() {
        return validUntilTime;
    }

    /**
     * Définit la valeur de la propriété validUntilTime.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setValidUntilTime(XMLGregorianCalendar value) {
        this.validUntilTime = value;
    }

    public boolean isSetValidUntilTime() {
        return (this.validUntilTime!= null);
    }

    /**
     * Obtient la valeur de la propriété situationRef.
     * 
     * @return
     *     possible object is
     *     {@link SituationRefStructure }
     *     
     */
    public SituationRefStructure getSituationRef() {
        return situationRef;
    }

    /**
     * Définit la valeur de la propriété situationRef.
     * 
     * @param value
     *     allowed object is
     *     {@link SituationRefStructure }
     *     
     */
    public void setSituationRef(SituationRefStructure value) {
        this.situationRef = value;
    }

    public boolean isSetSituationRef() {
        return (this.situationRef!= null);
    }

    /**
     * Obtient la valeur de la propriété content.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getContent() {
        return content;
    }

    /**
     * Définit la valeur de la propriété content.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setContent(Object value) {
        this.content = value;
    }

    public boolean isSetContent() {
        return (this.content!= null);
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
     * Obtient la valeur de la propriété formatRef.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFormatRef() {
        return formatRef;
    }

    /**
     * Définit la valeur de la propriété formatRef.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFormatRef(String value) {
        this.formatRef = value;
    }

    public boolean isSetFormatRef() {
        return (this.formatRef!= null);
    }

}
