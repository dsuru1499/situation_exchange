
package eu.datex2.schema._2_0rc1._2_0;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour Delays complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="Delays">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="delayBand" type="{http://datex2.eu/schema/2_0RC1/2_0}DelayBandEnum" minOccurs="0"/>
 *         &lt;element name="delaysType" type="{http://datex2.eu/schema/2_0RC1/2_0}DelaysTypeEnum" minOccurs="0"/>
 *         &lt;element name="delayTimeValue" type="{http://datex2.eu/schema/2_0RC1/2_0}Seconds" minOccurs="0"/>
 *         &lt;element name="delaysExtension" type="{http://datex2.eu/schema/2_0RC1/2_0}ExtensionType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Delays", propOrder = {
    "delayBand",
    "delaysType",
    "delayTimeValue",
    "delaysExtension"
})
public class Delays
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    protected DelayBandEnum delayBand;
    protected DelaysTypeEnum delaysType;
    protected Float delayTimeValue;
    protected ExtensionType delaysExtension;

    /**
     * Obtient la valeur de la propriété delayBand.
     * 
     * @return
     *     possible object is
     *     {@link DelayBandEnum }
     *     
     */
    public DelayBandEnum getDelayBand() {
        return delayBand;
    }

    /**
     * Définit la valeur de la propriété delayBand.
     * 
     * @param value
     *     allowed object is
     *     {@link DelayBandEnum }
     *     
     */
    public void setDelayBand(DelayBandEnum value) {
        this.delayBand = value;
    }

    public boolean isSetDelayBand() {
        return (this.delayBand!= null);
    }

    /**
     * Obtient la valeur de la propriété delaysType.
     * 
     * @return
     *     possible object is
     *     {@link DelaysTypeEnum }
     *     
     */
    public DelaysTypeEnum getDelaysType() {
        return delaysType;
    }

    /**
     * Définit la valeur de la propriété delaysType.
     * 
     * @param value
     *     allowed object is
     *     {@link DelaysTypeEnum }
     *     
     */
    public void setDelaysType(DelaysTypeEnum value) {
        this.delaysType = value;
    }

    public boolean isSetDelaysType() {
        return (this.delaysType!= null);
    }

    /**
     * Obtient la valeur de la propriété delayTimeValue.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getDelayTimeValue() {
        return delayTimeValue;
    }

    /**
     * Définit la valeur de la propriété delayTimeValue.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setDelayTimeValue(Float value) {
        this.delayTimeValue = value;
    }

    public boolean isSetDelayTimeValue() {
        return (this.delayTimeValue!= null);
    }

    /**
     * Obtient la valeur de la propriété delaysExtension.
     * 
     * @return
     *     possible object is
     *     {@link ExtensionType }
     *     
     */
    public ExtensionType getDelaysExtension() {
        return delaysExtension;
    }

    /**
     * Définit la valeur de la propriété delaysExtension.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtensionType }
     *     
     */
    public void setDelaysExtension(ExtensionType value) {
        this.delaysExtension = value;
    }

    public boolean isSetDelaysExtension() {
        return (this.delaysExtension!= null);
    }

}
