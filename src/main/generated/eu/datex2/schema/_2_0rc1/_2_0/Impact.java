
package eu.datex2.schema._2_0rc1._2_0;

import java.io.Serializable;
import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour Impact complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="Impact">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="capacityRemaining" type="{http://datex2.eu/schema/2_0RC1/2_0}Percentage" minOccurs="0"/>
 *         &lt;element name="numberOfLanesRestricted" type="{http://datex2.eu/schema/2_0RC1/2_0}NonNegativeInteger" minOccurs="0"/>
 *         &lt;element name="numberOfOperationalLanes" type="{http://datex2.eu/schema/2_0RC1/2_0}NonNegativeInteger" minOccurs="0"/>
 *         &lt;element name="originalNumberOfLanes" type="{http://datex2.eu/schema/2_0RC1/2_0}NonNegativeInteger" minOccurs="0"/>
 *         &lt;element name="residualRoadWidth" type="{http://datex2.eu/schema/2_0RC1/2_0}MetresAsFloat" minOccurs="0"/>
 *         &lt;element name="trafficConstrictionType" type="{http://datex2.eu/schema/2_0RC1/2_0}TrafficConstrictionTypeEnum" minOccurs="0"/>
 *         &lt;element name="delays" type="{http://datex2.eu/schema/2_0RC1/2_0}Delays" minOccurs="0"/>
 *         &lt;element name="impactExtension" type="{http://datex2.eu/schema/2_0RC1/2_0}ExtensionType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Impact", propOrder = {
    "capacityRemaining",
    "numberOfLanesRestricted",
    "numberOfOperationalLanes",
    "originalNumberOfLanes",
    "residualRoadWidth",
    "trafficConstrictionType",
    "delays",
    "impactExtension"
})
public class Impact
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    protected Float capacityRemaining;
    protected BigInteger numberOfLanesRestricted;
    protected BigInteger numberOfOperationalLanes;
    protected BigInteger originalNumberOfLanes;
    protected Float residualRoadWidth;
    protected TrafficConstrictionTypeEnum trafficConstrictionType;
    protected Delays delays;
    protected ExtensionType impactExtension;

    /**
     * Obtient la valeur de la propriété capacityRemaining.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getCapacityRemaining() {
        return capacityRemaining;
    }

    /**
     * Définit la valeur de la propriété capacityRemaining.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setCapacityRemaining(Float value) {
        this.capacityRemaining = value;
    }

    public boolean isSetCapacityRemaining() {
        return (this.capacityRemaining!= null);
    }

    /**
     * Obtient la valeur de la propriété numberOfLanesRestricted.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getNumberOfLanesRestricted() {
        return numberOfLanesRestricted;
    }

    /**
     * Définit la valeur de la propriété numberOfLanesRestricted.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setNumberOfLanesRestricted(BigInteger value) {
        this.numberOfLanesRestricted = value;
    }

    public boolean isSetNumberOfLanesRestricted() {
        return (this.numberOfLanesRestricted!= null);
    }

    /**
     * Obtient la valeur de la propriété numberOfOperationalLanes.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getNumberOfOperationalLanes() {
        return numberOfOperationalLanes;
    }

    /**
     * Définit la valeur de la propriété numberOfOperationalLanes.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setNumberOfOperationalLanes(BigInteger value) {
        this.numberOfOperationalLanes = value;
    }

    public boolean isSetNumberOfOperationalLanes() {
        return (this.numberOfOperationalLanes!= null);
    }

    /**
     * Obtient la valeur de la propriété originalNumberOfLanes.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getOriginalNumberOfLanes() {
        return originalNumberOfLanes;
    }

    /**
     * Définit la valeur de la propriété originalNumberOfLanes.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setOriginalNumberOfLanes(BigInteger value) {
        this.originalNumberOfLanes = value;
    }

    public boolean isSetOriginalNumberOfLanes() {
        return (this.originalNumberOfLanes!= null);
    }

    /**
     * Obtient la valeur de la propriété residualRoadWidth.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getResidualRoadWidth() {
        return residualRoadWidth;
    }

    /**
     * Définit la valeur de la propriété residualRoadWidth.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setResidualRoadWidth(Float value) {
        this.residualRoadWidth = value;
    }

    public boolean isSetResidualRoadWidth() {
        return (this.residualRoadWidth!= null);
    }

    /**
     * Obtient la valeur de la propriété trafficConstrictionType.
     * 
     * @return
     *     possible object is
     *     {@link TrafficConstrictionTypeEnum }
     *     
     */
    public TrafficConstrictionTypeEnum getTrafficConstrictionType() {
        return trafficConstrictionType;
    }

    /**
     * Définit la valeur de la propriété trafficConstrictionType.
     * 
     * @param value
     *     allowed object is
     *     {@link TrafficConstrictionTypeEnum }
     *     
     */
    public void setTrafficConstrictionType(TrafficConstrictionTypeEnum value) {
        this.trafficConstrictionType = value;
    }

    public boolean isSetTrafficConstrictionType() {
        return (this.trafficConstrictionType!= null);
    }

    /**
     * Obtient la valeur de la propriété delays.
     * 
     * @return
     *     possible object is
     *     {@link Delays }
     *     
     */
    public Delays getDelays() {
        return delays;
    }

    /**
     * Définit la valeur de la propriété delays.
     * 
     * @param value
     *     allowed object is
     *     {@link Delays }
     *     
     */
    public void setDelays(Delays value) {
        this.delays = value;
    }

    public boolean isSetDelays() {
        return (this.delays!= null);
    }

    /**
     * Obtient la valeur de la propriété impactExtension.
     * 
     * @return
     *     possible object is
     *     {@link ExtensionType }
     *     
     */
    public ExtensionType getImpactExtension() {
        return impactExtension;
    }

    /**
     * Définit la valeur de la propriété impactExtension.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtensionType }
     *     
     */
    public void setImpactExtension(ExtensionType value) {
        this.impactExtension = value;
    }

    public boolean isSetImpactExtension() {
        return (this.impactExtension!= null);
    }

}
