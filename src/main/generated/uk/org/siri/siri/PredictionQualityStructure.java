
package uk.org.siri.siri;

import java.io.Serializable;
import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * Type for Prediction Quality quantifcation.
 * 
 * <p>Classe Java pour PredictionQualityStructure complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="PredictionQualityStructure">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="PredictionLevel" type="{http://www.siri.org.uk/siri}QualityIndexEnumeration"/>
 *         &lt;sequence minOccurs="0">
 *           &lt;element name="Percentile" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *           &lt;element name="LowerTimeLimit" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *           &lt;element name="HigherTimeLimit" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;/sequence>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PredictionQualityStructure", propOrder = {
    "predictionLevel",
    "percentile",
    "lowerTimeLimit",
    "higherTimeLimit"
})
public class PredictionQualityStructure
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "PredictionLevel", required = true)
    protected QualityIndexEnumeration predictionLevel;
    @XmlElement(name = "Percentile", defaultValue = "0.9")
    protected BigDecimal percentile;
    @XmlElement(name = "LowerTimeLimit")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar lowerTimeLimit;
    @XmlElement(name = "HigherTimeLimit")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar higherTimeLimit;

    /**
     * Obtient la valeur de la propriété predictionLevel.
     * 
     * @return
     *     possible object is
     *     {@link QualityIndexEnumeration }
     *     
     */
    public QualityIndexEnumeration getPredictionLevel() {
        return predictionLevel;
    }

    /**
     * Définit la valeur de la propriété predictionLevel.
     * 
     * @param value
     *     allowed object is
     *     {@link QualityIndexEnumeration }
     *     
     */
    public void setPredictionLevel(QualityIndexEnumeration value) {
        this.predictionLevel = value;
    }

    public boolean isSetPredictionLevel() {
        return (this.predictionLevel!= null);
    }

    /**
     * Obtient la valeur de la propriété percentile.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPercentile() {
        return percentile;
    }

    /**
     * Définit la valeur de la propriété percentile.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPercentile(BigDecimal value) {
        this.percentile = value;
    }

    public boolean isSetPercentile() {
        return (this.percentile!= null);
    }

    /**
     * Obtient la valeur de la propriété lowerTimeLimit.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getLowerTimeLimit() {
        return lowerTimeLimit;
    }

    /**
     * Définit la valeur de la propriété lowerTimeLimit.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setLowerTimeLimit(XMLGregorianCalendar value) {
        this.lowerTimeLimit = value;
    }

    public boolean isSetLowerTimeLimit() {
        return (this.lowerTimeLimit!= null);
    }

    /**
     * Obtient la valeur de la propriété higherTimeLimit.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getHigherTimeLimit() {
        return higherTimeLimit;
    }

    /**
     * Définit la valeur de la propriété higherTimeLimit.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setHigherTimeLimit(XMLGregorianCalendar value) {
        this.higherTimeLimit = value;
    }

    public boolean isSetHigherTimeLimit() {
        return (this.higherTimeLimit!= null);
    }

}
