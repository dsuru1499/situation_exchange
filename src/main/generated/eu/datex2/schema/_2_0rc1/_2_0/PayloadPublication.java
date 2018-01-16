
package eu.datex2.schema._2_0rc1._2_0;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Classe Java pour PayloadPublication complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="PayloadPublication">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="feedDescription" type="{http://datex2.eu/schema/2_0RC1/2_0}MultilingualString" minOccurs="0"/>
 *         &lt;element name="feedType" type="{http://datex2.eu/schema/2_0RC1/2_0}String" minOccurs="0"/>
 *         &lt;element name="publicationTime" type="{http://datex2.eu/schema/2_0RC1/2_0}DateTime"/>
 *         &lt;element name="publicationCreator" type="{http://datex2.eu/schema/2_0RC1/2_0}InternationalIdentifier"/>
 *         &lt;element name="payloadPublicationExtension" type="{http://datex2.eu/schema/2_0RC1/2_0}ExtensionType" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="lang" use="required" type="{http://datex2.eu/schema/2_0RC1/2_0}Language" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PayloadPublication", propOrder = {
    "feedDescription",
    "feedType",
    "publicationTime",
    "publicationCreator",
    "payloadPublicationExtension"
})
@XmlSeeAlso({
    MeasurementSiteTablePublication.class,
    GenericPublication.class,
    MeasuredDataPublication.class,
    ElaboratedDataPublication.class,
    TrafficViewPublication.class,
    SituationPublication.class,
    PredefinedLocationsPublication.class
})
public abstract class PayloadPublication
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    protected MultilingualString feedDescription;
    protected String feedType;
    @XmlElement(required = true)
    protected XMLGregorianCalendar publicationTime;
    @XmlElement(required = true)
    protected InternationalIdentifier publicationCreator;
    protected ExtensionType payloadPublicationExtension;
    @XmlAttribute(name = "lang", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String lang;

    /**
     * Obtient la valeur de la propriété feedDescription.
     * 
     * @return
     *     possible object is
     *     {@link MultilingualString }
     *     
     */
    public MultilingualString getFeedDescription() {
        return feedDescription;
    }

    /**
     * Définit la valeur de la propriété feedDescription.
     * 
     * @param value
     *     allowed object is
     *     {@link MultilingualString }
     *     
     */
    public void setFeedDescription(MultilingualString value) {
        this.feedDescription = value;
    }

    public boolean isSetFeedDescription() {
        return (this.feedDescription!= null);
    }

    /**
     * Obtient la valeur de la propriété feedType.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFeedType() {
        return feedType;
    }

    /**
     * Définit la valeur de la propriété feedType.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFeedType(String value) {
        this.feedType = value;
    }

    public boolean isSetFeedType() {
        return (this.feedType!= null);
    }

    /**
     * Obtient la valeur de la propriété publicationTime.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getPublicationTime() {
        return publicationTime;
    }

    /**
     * Définit la valeur de la propriété publicationTime.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setPublicationTime(XMLGregorianCalendar value) {
        this.publicationTime = value;
    }

    public boolean isSetPublicationTime() {
        return (this.publicationTime!= null);
    }

    /**
     * Obtient la valeur de la propriété publicationCreator.
     * 
     * @return
     *     possible object is
     *     {@link InternationalIdentifier }
     *     
     */
    public InternationalIdentifier getPublicationCreator() {
        return publicationCreator;
    }

    /**
     * Définit la valeur de la propriété publicationCreator.
     * 
     * @param value
     *     allowed object is
     *     {@link InternationalIdentifier }
     *     
     */
    public void setPublicationCreator(InternationalIdentifier value) {
        this.publicationCreator = value;
    }

    public boolean isSetPublicationCreator() {
        return (this.publicationCreator!= null);
    }

    /**
     * Obtient la valeur de la propriété payloadPublicationExtension.
     * 
     * @return
     *     possible object is
     *     {@link ExtensionType }
     *     
     */
    public ExtensionType getPayloadPublicationExtension() {
        return payloadPublicationExtension;
    }

    /**
     * Définit la valeur de la propriété payloadPublicationExtension.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtensionType }
     *     
     */
    public void setPayloadPublicationExtension(ExtensionType value) {
        this.payloadPublicationExtension = value;
    }

    public boolean isSetPayloadPublicationExtension() {
        return (this.payloadPublicationExtension!= null);
    }

    /**
     * Obtient la valeur de la propriété lang.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLang() {
        return lang;
    }

    /**
     * Définit la valeur de la propriété lang.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLang(String value) {
        this.lang = value;
    }

    public boolean isSetLang() {
        return (this.lang!= null);
    }

}
