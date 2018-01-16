
package eu.datex2.schema._2_0rc1._2_0;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour InternationalIdentifier complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="InternationalIdentifier">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="country" type="{http://datex2.eu/schema/2_0RC1/2_0}CountryEnum"/>
 *         &lt;element name="nationalIdentifier" type="{http://datex2.eu/schema/2_0RC1/2_0}String"/>
 *         &lt;element name="internationalIdentifierExtension" type="{http://datex2.eu/schema/2_0RC1/2_0}ExtensionType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InternationalIdentifier", propOrder = {
    "country",
    "nationalIdentifier",
    "internationalIdentifierExtension"
})
public class InternationalIdentifier
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(required = true)
    protected CountryEnum country;
    @XmlElement(required = true)
    protected String nationalIdentifier;
    protected ExtensionType internationalIdentifierExtension;

    /**
     * Obtient la valeur de la propriété country.
     * 
     * @return
     *     possible object is
     *     {@link CountryEnum }
     *     
     */
    public CountryEnum getCountry() {
        return country;
    }

    /**
     * Définit la valeur de la propriété country.
     * 
     * @param value
     *     allowed object is
     *     {@link CountryEnum }
     *     
     */
    public void setCountry(CountryEnum value) {
        this.country = value;
    }

    public boolean isSetCountry() {
        return (this.country!= null);
    }

    /**
     * Obtient la valeur de la propriété nationalIdentifier.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNationalIdentifier() {
        return nationalIdentifier;
    }

    /**
     * Définit la valeur de la propriété nationalIdentifier.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNationalIdentifier(String value) {
        this.nationalIdentifier = value;
    }

    public boolean isSetNationalIdentifier() {
        return (this.nationalIdentifier!= null);
    }

    /**
     * Obtient la valeur de la propriété internationalIdentifierExtension.
     * 
     * @return
     *     possible object is
     *     {@link ExtensionType }
     *     
     */
    public ExtensionType getInternationalIdentifierExtension() {
        return internationalIdentifierExtension;
    }

    /**
     * Définit la valeur de la propriété internationalIdentifierExtension.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtensionType }
     *     
     */
    public void setInternationalIdentifierExtension(ExtensionType value) {
        this.internationalIdentifierExtension = value;
    }

    public boolean isSetInternationalIdentifierExtension() {
        return (this.internationalIdentifierExtension!= null);
    }

}
