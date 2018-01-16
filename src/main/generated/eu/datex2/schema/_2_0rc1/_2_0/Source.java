
package eu.datex2.schema._2_0rc1._2_0;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour Source complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="Source">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="sourceCountry" type="{http://datex2.eu/schema/2_0RC1/2_0}CountryEnum" minOccurs="0"/>
 *         &lt;element name="sourceIdentification" type="{http://datex2.eu/schema/2_0RC1/2_0}String" minOccurs="0"/>
 *         &lt;element name="sourceName" type="{http://datex2.eu/schema/2_0RC1/2_0}MultilingualString" minOccurs="0"/>
 *         &lt;element name="sourceType" type="{http://datex2.eu/schema/2_0RC1/2_0}SourceTypeEnum" minOccurs="0"/>
 *         &lt;element name="reliable" type="{http://datex2.eu/schema/2_0RC1/2_0}Boolean" minOccurs="0"/>
 *         &lt;element name="sourceExtension" type="{http://datex2.eu/schema/2_0RC1/2_0}ExtensionType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Source", propOrder = {
    "sourceCountry",
    "sourceIdentification",
    "sourceName",
    "sourceType",
    "reliable",
    "sourceExtension"
})
public class Source
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    protected CountryEnum sourceCountry;
    protected String sourceIdentification;
    protected MultilingualString sourceName;
    protected SourceTypeEnum sourceType;
    protected Boolean reliable;
    protected ExtensionType sourceExtension;

    /**
     * Obtient la valeur de la propriété sourceCountry.
     * 
     * @return
     *     possible object is
     *     {@link CountryEnum }
     *     
     */
    public CountryEnum getSourceCountry() {
        return sourceCountry;
    }

    /**
     * Définit la valeur de la propriété sourceCountry.
     * 
     * @param value
     *     allowed object is
     *     {@link CountryEnum }
     *     
     */
    public void setSourceCountry(CountryEnum value) {
        this.sourceCountry = value;
    }

    public boolean isSetSourceCountry() {
        return (this.sourceCountry!= null);
    }

    /**
     * Obtient la valeur de la propriété sourceIdentification.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSourceIdentification() {
        return sourceIdentification;
    }

    /**
     * Définit la valeur de la propriété sourceIdentification.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSourceIdentification(String value) {
        this.sourceIdentification = value;
    }

    public boolean isSetSourceIdentification() {
        return (this.sourceIdentification!= null);
    }

    /**
     * Obtient la valeur de la propriété sourceName.
     * 
     * @return
     *     possible object is
     *     {@link MultilingualString }
     *     
     */
    public MultilingualString getSourceName() {
        return sourceName;
    }

    /**
     * Définit la valeur de la propriété sourceName.
     * 
     * @param value
     *     allowed object is
     *     {@link MultilingualString }
     *     
     */
    public void setSourceName(MultilingualString value) {
        this.sourceName = value;
    }

    public boolean isSetSourceName() {
        return (this.sourceName!= null);
    }

    /**
     * Obtient la valeur de la propriété sourceType.
     * 
     * @return
     *     possible object is
     *     {@link SourceTypeEnum }
     *     
     */
    public SourceTypeEnum getSourceType() {
        return sourceType;
    }

    /**
     * Définit la valeur de la propriété sourceType.
     * 
     * @param value
     *     allowed object is
     *     {@link SourceTypeEnum }
     *     
     */
    public void setSourceType(SourceTypeEnum value) {
        this.sourceType = value;
    }

    public boolean isSetSourceType() {
        return (this.sourceType!= null);
    }

    /**
     * Obtient la valeur de la propriété reliable.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isReliable() {
        return reliable;
    }

    /**
     * Définit la valeur de la propriété reliable.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setReliable(Boolean value) {
        this.reliable = value;
    }

    public boolean isSetReliable() {
        return (this.reliable!= null);
    }

    /**
     * Obtient la valeur de la propriété sourceExtension.
     * 
     * @return
     *     possible object is
     *     {@link ExtensionType }
     *     
     */
    public ExtensionType getSourceExtension() {
        return sourceExtension;
    }

    /**
     * Définit la valeur de la propriété sourceExtension.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtensionType }
     *     
     */
    public void setSourceExtension(ExtensionType value) {
        this.sourceExtension = value;
    }

    public boolean isSetSourceExtension() {
        return (this.sourceExtension!= null);
    }

}
