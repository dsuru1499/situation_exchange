
package uk.org.siri.siri;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.Duration;
import eu.datex2.schema._2_0rc1._2_0.DelaysTypeEnum;


/**
 * Type for easement info.
 * 
 * <p>Classe Java pour DelaysStructure complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="DelaysStructure">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="DelayBand" type="{http://www.siri.org.uk/siri}DelayBandEnumeration" minOccurs="0"/>
 *         &lt;element name="DelayType" type="{http://datex2.eu/schema/2_0RC1/2_0}DelaysTypeEnum" minOccurs="0"/>
 *         &lt;element name="Delay" type="{http://www.siri.org.uk/siri}PositiveDurationType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DelaysStructure", propOrder = {
    "delayBand",
    "delayType",
    "delay"
})
public class DelaysStructure
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "DelayBand")
    protected DelayBandEnumeration delayBand;
    @XmlElement(name = "DelayType")
    protected DelaysTypeEnum delayType;
    @XmlElement(name = "Delay")
    protected Duration delay;

    /**
     * Obtient la valeur de la propriété delayBand.
     * 
     * @return
     *     possible object is
     *     {@link DelayBandEnumeration }
     *     
     */
    public DelayBandEnumeration getDelayBand() {
        return delayBand;
    }

    /**
     * Définit la valeur de la propriété delayBand.
     * 
     * @param value
     *     allowed object is
     *     {@link DelayBandEnumeration }
     *     
     */
    public void setDelayBand(DelayBandEnumeration value) {
        this.delayBand = value;
    }

    public boolean isSetDelayBand() {
        return (this.delayBand!= null);
    }

    /**
     * Obtient la valeur de la propriété delayType.
     * 
     * @return
     *     possible object is
     *     {@link DelaysTypeEnum }
     *     
     */
    public DelaysTypeEnum getDelayType() {
        return delayType;
    }

    /**
     * Définit la valeur de la propriété delayType.
     * 
     * @param value
     *     allowed object is
     *     {@link DelaysTypeEnum }
     *     
     */
    public void setDelayType(DelaysTypeEnum value) {
        this.delayType = value;
    }

    public boolean isSetDelayType() {
        return (this.delayType!= null);
    }

    /**
     * Obtient la valeur de la propriété delay.
     * 
     * @return
     *     possible object is
     *     {@link Duration }
     *     
     */
    public Duration getDelay() {
        return delay;
    }

    /**
     * Définit la valeur de la propriété delay.
     * 
     * @param value
     *     allowed object is
     *     {@link Duration }
     *     
     */
    public void setDelay(Duration value) {
        this.delay = value;
    }

    public boolean isSetDelay() {
        return (this.delay!= null);
    }

}
