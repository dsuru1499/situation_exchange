
package eu.datex2.schema._2_0rc1._2_0;

import java.io.Serializable;
import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour AbnormalTraffic complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="AbnormalTraffic">
 *   &lt;complexContent>
 *     &lt;extension base="{http://datex2.eu/schema/2_0RC1/2_0}TrafficElement">
 *       &lt;sequence>
 *         &lt;element name="abnormalTrafficType" type="{http://datex2.eu/schema/2_0RC1/2_0}AbnormalTrafficTypeEnum" minOccurs="0"/>
 *         &lt;element name="numberOfVehiclesWaiting" type="{http://datex2.eu/schema/2_0RC1/2_0}NonNegativeInteger" minOccurs="0"/>
 *         &lt;element name="queueLength" type="{http://datex2.eu/schema/2_0RC1/2_0}MetresAsNonNegativeInteger" minOccurs="0"/>
 *         &lt;element name="relativeTrafficFlow" type="{http://datex2.eu/schema/2_0RC1/2_0}RelativeTrafficFlowEnum" minOccurs="0"/>
 *         &lt;element name="trafficFlowCharacteristics" type="{http://datex2.eu/schema/2_0RC1/2_0}TrafficFlowCharacteristicsEnum" minOccurs="0"/>
 *         &lt;element name="trafficTrendType" type="{http://datex2.eu/schema/2_0RC1/2_0}TrafficTrendTypeEnum" minOccurs="0"/>
 *         &lt;element name="abnormalTrafficExtension" type="{http://datex2.eu/schema/2_0RC1/2_0}ExtensionType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AbnormalTraffic", propOrder = {
    "abnormalTrafficType",
    "numberOfVehiclesWaiting",
    "queueLength",
    "relativeTrafficFlow",
    "trafficFlowCharacteristics",
    "trafficTrendType",
    "abnormalTrafficExtension"
})
public class AbnormalTraffic
    extends TrafficElement
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    protected AbnormalTrafficTypeEnum abnormalTrafficType;
    protected BigInteger numberOfVehiclesWaiting;
    protected BigInteger queueLength;
    protected RelativeTrafficFlowEnum relativeTrafficFlow;
    protected TrafficFlowCharacteristicsEnum trafficFlowCharacteristics;
    protected TrafficTrendTypeEnum trafficTrendType;
    protected ExtensionType abnormalTrafficExtension;

    /**
     * Obtient la valeur de la propriété abnormalTrafficType.
     * 
     * @return
     *     possible object is
     *     {@link AbnormalTrafficTypeEnum }
     *     
     */
    public AbnormalTrafficTypeEnum getAbnormalTrafficType() {
        return abnormalTrafficType;
    }

    /**
     * Définit la valeur de la propriété abnormalTrafficType.
     * 
     * @param value
     *     allowed object is
     *     {@link AbnormalTrafficTypeEnum }
     *     
     */
    public void setAbnormalTrafficType(AbnormalTrafficTypeEnum value) {
        this.abnormalTrafficType = value;
    }

    public boolean isSetAbnormalTrafficType() {
        return (this.abnormalTrafficType!= null);
    }

    /**
     * Obtient la valeur de la propriété numberOfVehiclesWaiting.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getNumberOfVehiclesWaiting() {
        return numberOfVehiclesWaiting;
    }

    /**
     * Définit la valeur de la propriété numberOfVehiclesWaiting.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setNumberOfVehiclesWaiting(BigInteger value) {
        this.numberOfVehiclesWaiting = value;
    }

    public boolean isSetNumberOfVehiclesWaiting() {
        return (this.numberOfVehiclesWaiting!= null);
    }

    /**
     * Obtient la valeur de la propriété queueLength.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getQueueLength() {
        return queueLength;
    }

    /**
     * Définit la valeur de la propriété queueLength.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setQueueLength(BigInteger value) {
        this.queueLength = value;
    }

    public boolean isSetQueueLength() {
        return (this.queueLength!= null);
    }

    /**
     * Obtient la valeur de la propriété relativeTrafficFlow.
     * 
     * @return
     *     possible object is
     *     {@link RelativeTrafficFlowEnum }
     *     
     */
    public RelativeTrafficFlowEnum getRelativeTrafficFlow() {
        return relativeTrafficFlow;
    }

    /**
     * Définit la valeur de la propriété relativeTrafficFlow.
     * 
     * @param value
     *     allowed object is
     *     {@link RelativeTrafficFlowEnum }
     *     
     */
    public void setRelativeTrafficFlow(RelativeTrafficFlowEnum value) {
        this.relativeTrafficFlow = value;
    }

    public boolean isSetRelativeTrafficFlow() {
        return (this.relativeTrafficFlow!= null);
    }

    /**
     * Obtient la valeur de la propriété trafficFlowCharacteristics.
     * 
     * @return
     *     possible object is
     *     {@link TrafficFlowCharacteristicsEnum }
     *     
     */
    public TrafficFlowCharacteristicsEnum getTrafficFlowCharacteristics() {
        return trafficFlowCharacteristics;
    }

    /**
     * Définit la valeur de la propriété trafficFlowCharacteristics.
     * 
     * @param value
     *     allowed object is
     *     {@link TrafficFlowCharacteristicsEnum }
     *     
     */
    public void setTrafficFlowCharacteristics(TrafficFlowCharacteristicsEnum value) {
        this.trafficFlowCharacteristics = value;
    }

    public boolean isSetTrafficFlowCharacteristics() {
        return (this.trafficFlowCharacteristics!= null);
    }

    /**
     * Obtient la valeur de la propriété trafficTrendType.
     * 
     * @return
     *     possible object is
     *     {@link TrafficTrendTypeEnum }
     *     
     */
    public TrafficTrendTypeEnum getTrafficTrendType() {
        return trafficTrendType;
    }

    /**
     * Définit la valeur de la propriété trafficTrendType.
     * 
     * @param value
     *     allowed object is
     *     {@link TrafficTrendTypeEnum }
     *     
     */
    public void setTrafficTrendType(TrafficTrendTypeEnum value) {
        this.trafficTrendType = value;
    }

    public boolean isSetTrafficTrendType() {
        return (this.trafficTrendType!= null);
    }

    /**
     * Obtient la valeur de la propriété abnormalTrafficExtension.
     * 
     * @return
     *     possible object is
     *     {@link ExtensionType }
     *     
     */
    public ExtensionType getAbnormalTrafficExtension() {
        return abnormalTrafficExtension;
    }

    /**
     * Définit la valeur de la propriété abnormalTrafficExtension.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtensionType }
     *     
     */
    public void setAbnormalTrafficExtension(ExtensionType value) {
        this.abnormalTrafficExtension = value;
    }

    public boolean isSetAbnormalTrafficExtension() {
        return (this.abnormalTrafficExtension!= null);
    }

}
