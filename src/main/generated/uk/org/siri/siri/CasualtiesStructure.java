
package uk.org.siri.siri;

import java.io.Serializable;
import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * Type for Information on casualties.
 * 
 * <p>Classe Java pour CasualtiesStructure complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="CasualtiesStructure">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="NumberOfDeaths" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" minOccurs="0"/>
 *         &lt;element name="NumberOfInjured" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CasualtiesStructure", propOrder = {
    "numberOfDeaths",
    "numberOfInjured"
})
public class CasualtiesStructure
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "NumberOfDeaths")
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger numberOfDeaths;
    @XmlElement(name = "NumberOfInjured")
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger numberOfInjured;

    /**
     * Obtient la valeur de la propriété numberOfDeaths.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getNumberOfDeaths() {
        return numberOfDeaths;
    }

    /**
     * Définit la valeur de la propriété numberOfDeaths.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setNumberOfDeaths(BigInteger value) {
        this.numberOfDeaths = value;
    }

    public boolean isSetNumberOfDeaths() {
        return (this.numberOfDeaths!= null);
    }

    /**
     * Obtient la valeur de la propriété numberOfInjured.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getNumberOfInjured() {
        return numberOfInjured;
    }

    /**
     * Définit la valeur de la propriété numberOfInjured.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setNumberOfInjured(BigInteger value) {
        this.numberOfInjured = value;
    }

    public boolean isSetNumberOfInjured() {
        return (this.numberOfInjured!= null);
    }

}
