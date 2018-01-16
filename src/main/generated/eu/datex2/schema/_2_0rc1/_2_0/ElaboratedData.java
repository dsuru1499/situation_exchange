
package eu.datex2.schema._2_0rc1._2_0;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour ElaboratedData complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="ElaboratedData">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="forecast" type="{http://datex2.eu/schema/2_0RC1/2_0}Boolean" minOccurs="0"/>
 *         &lt;element name="source" type="{http://datex2.eu/schema/2_0RC1/2_0}Source" minOccurs="0"/>
 *         &lt;element name="validity" type="{http://datex2.eu/schema/2_0RC1/2_0}Validity" minOccurs="0"/>
 *         &lt;element name="basicDataValue" type="{http://datex2.eu/schema/2_0RC1/2_0}BasicDataValue"/>
 *         &lt;element name="elaboratedDataExtension" type="{http://datex2.eu/schema/2_0RC1/2_0}ExtensionType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ElaboratedData", propOrder = {
    "forecast",
    "source",
    "validity",
    "basicDataValue",
    "elaboratedDataExtension"
})
public class ElaboratedData
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    protected Boolean forecast;
    protected Source source;
    protected Validity validity;
    @XmlElement(required = true)
    protected BasicDataValue basicDataValue;
    protected ExtensionType elaboratedDataExtension;

    /**
     * Obtient la valeur de la propriété forecast.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isForecast() {
        return forecast;
    }

    /**
     * Définit la valeur de la propriété forecast.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setForecast(Boolean value) {
        this.forecast = value;
    }

    public boolean isSetForecast() {
        return (this.forecast!= null);
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
     * Obtient la valeur de la propriété basicDataValue.
     * 
     * @return
     *     possible object is
     *     {@link BasicDataValue }
     *     
     */
    public BasicDataValue getBasicDataValue() {
        return basicDataValue;
    }

    /**
     * Définit la valeur de la propriété basicDataValue.
     * 
     * @param value
     *     allowed object is
     *     {@link BasicDataValue }
     *     
     */
    public void setBasicDataValue(BasicDataValue value) {
        this.basicDataValue = value;
    }

    public boolean isSetBasicDataValue() {
        return (this.basicDataValue!= null);
    }

    /**
     * Obtient la valeur de la propriété elaboratedDataExtension.
     * 
     * @return
     *     possible object is
     *     {@link ExtensionType }
     *     
     */
    public ExtensionType getElaboratedDataExtension() {
        return elaboratedDataExtension;
    }

    /**
     * Définit la valeur de la propriété elaboratedDataExtension.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtensionType }
     *     
     */
    public void setElaboratedDataExtension(ExtensionType value) {
        this.elaboratedDataExtension = value;
    }

    public boolean isSetElaboratedDataExtension() {
        return (this.elaboratedDataExtension!= null);
    }

}
