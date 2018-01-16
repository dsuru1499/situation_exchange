
package eu.datex2.schema._2_0rc1._2_0;

import java.io.Serializable;
import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour NumberOfAxlesCharacteristic complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="NumberOfAxlesCharacteristic">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="comparisonOperator" type="{http://datex2.eu/schema/2_0RC1/2_0}ComparisonOperatorEnum"/>
 *         &lt;element name="numberOfAxles" type="{http://datex2.eu/schema/2_0RC1/2_0}NonNegativeInteger"/>
 *         &lt;element name="numberOfAxlesCharacteristicExtension" type="{http://datex2.eu/schema/2_0RC1/2_0}ExtensionType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NumberOfAxlesCharacteristic", propOrder = {
    "comparisonOperator",
    "numberOfAxles",
    "numberOfAxlesCharacteristicExtension"
})
public class NumberOfAxlesCharacteristic
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(required = true)
    protected ComparisonOperatorEnum comparisonOperator;
    @XmlElement(required = true)
    protected BigInteger numberOfAxles;
    protected ExtensionType numberOfAxlesCharacteristicExtension;

    /**
     * Obtient la valeur de la propriété comparisonOperator.
     * 
     * @return
     *     possible object is
     *     {@link ComparisonOperatorEnum }
     *     
     */
    public ComparisonOperatorEnum getComparisonOperator() {
        return comparisonOperator;
    }

    /**
     * Définit la valeur de la propriété comparisonOperator.
     * 
     * @param value
     *     allowed object is
     *     {@link ComparisonOperatorEnum }
     *     
     */
    public void setComparisonOperator(ComparisonOperatorEnum value) {
        this.comparisonOperator = value;
    }

    public boolean isSetComparisonOperator() {
        return (this.comparisonOperator!= null);
    }

    /**
     * Obtient la valeur de la propriété numberOfAxles.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getNumberOfAxles() {
        return numberOfAxles;
    }

    /**
     * Définit la valeur de la propriété numberOfAxles.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setNumberOfAxles(BigInteger value) {
        this.numberOfAxles = value;
    }

    public boolean isSetNumberOfAxles() {
        return (this.numberOfAxles!= null);
    }

    /**
     * Obtient la valeur de la propriété numberOfAxlesCharacteristicExtension.
     * 
     * @return
     *     possible object is
     *     {@link ExtensionType }
     *     
     */
    public ExtensionType getNumberOfAxlesCharacteristicExtension() {
        return numberOfAxlesCharacteristicExtension;
    }

    /**
     * Définit la valeur de la propriété numberOfAxlesCharacteristicExtension.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtensionType }
     *     
     */
    public void setNumberOfAxlesCharacteristicExtension(ExtensionType value) {
        this.numberOfAxlesCharacteristicExtension = value;
    }

    public boolean isSetNumberOfAxlesCharacteristicExtension() {
        return (this.numberOfAxlesCharacteristicExtension!= null);
    }

}
