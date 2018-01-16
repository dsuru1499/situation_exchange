
package eu.datex2.schema._2_0rc1._2_0;

import java.io.Serializable;
import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour TrafficFlow complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="TrafficFlow">
 *   &lt;complexContent>
 *     &lt;extension base="{http://datex2.eu/schema/2_0RC1/2_0}TrafficValue">
 *       &lt;sequence>
 *         &lt;element name="axleFlow" type="{http://datex2.eu/schema/2_0RC1/2_0}AxlesPerHour" minOccurs="0"/>
 *         &lt;element name="pcuFlow" type="{http://datex2.eu/schema/2_0RC1/2_0}PassengerCarUnitsPerHour" minOccurs="0"/>
 *         &lt;element name="percentageLongVehicles" type="{http://datex2.eu/schema/2_0RC1/2_0}Percentage" minOccurs="0"/>
 *         &lt;element name="vehicleFlow" type="{http://datex2.eu/schema/2_0RC1/2_0}VehiclesPerHour" minOccurs="0"/>
 *         &lt;element name="trafficFlowExtension" type="{http://datex2.eu/schema/2_0RC1/2_0}ExtensionType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TrafficFlow", propOrder = {
    "axleFlow",
    "pcuFlow",
    "percentageLongVehicles",
    "vehicleFlow",
    "trafficFlowExtension"
})
public class TrafficFlow
    extends TrafficValue
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    protected BigInteger axleFlow;
    protected BigInteger pcuFlow;
    protected Float percentageLongVehicles;
    protected BigInteger vehicleFlow;
    protected ExtensionType trafficFlowExtension;

    /**
     * Obtient la valeur de la propriété axleFlow.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getAxleFlow() {
        return axleFlow;
    }

    /**
     * Définit la valeur de la propriété axleFlow.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setAxleFlow(BigInteger value) {
        this.axleFlow = value;
    }

    public boolean isSetAxleFlow() {
        return (this.axleFlow!= null);
    }

    /**
     * Obtient la valeur de la propriété pcuFlow.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getPcuFlow() {
        return pcuFlow;
    }

    /**
     * Définit la valeur de la propriété pcuFlow.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setPcuFlow(BigInteger value) {
        this.pcuFlow = value;
    }

    public boolean isSetPcuFlow() {
        return (this.pcuFlow!= null);
    }

    /**
     * Obtient la valeur de la propriété percentageLongVehicles.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getPercentageLongVehicles() {
        return percentageLongVehicles;
    }

    /**
     * Définit la valeur de la propriété percentageLongVehicles.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setPercentageLongVehicles(Float value) {
        this.percentageLongVehicles = value;
    }

    public boolean isSetPercentageLongVehicles() {
        return (this.percentageLongVehicles!= null);
    }

    /**
     * Obtient la valeur de la propriété vehicleFlow.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getVehicleFlow() {
        return vehicleFlow;
    }

    /**
     * Définit la valeur de la propriété vehicleFlow.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setVehicleFlow(BigInteger value) {
        this.vehicleFlow = value;
    }

    public boolean isSetVehicleFlow() {
        return (this.vehicleFlow!= null);
    }

    /**
     * Obtient la valeur de la propriété trafficFlowExtension.
     * 
     * @return
     *     possible object is
     *     {@link ExtensionType }
     *     
     */
    public ExtensionType getTrafficFlowExtension() {
        return trafficFlowExtension;
    }

    /**
     * Définit la valeur de la propriété trafficFlowExtension.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtensionType }
     *     
     */
    public void setTrafficFlowExtension(ExtensionType value) {
        this.trafficFlowExtension = value;
    }

    public boolean isSetTrafficFlowExtension() {
        return (this.trafficFlowExtension!= null);
    }

}
