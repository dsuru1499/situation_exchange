
package eu.datex2.schema._2_0rc1._2_0;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour TrafficStatusValue complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="TrafficStatusValue">
 *   &lt;complexContent>
 *     &lt;extension base="{http://datex2.eu/schema/2_0RC1/2_0}BasicDataValue">
 *       &lt;sequence>
 *         &lt;element name="trafficStatus" type="{http://datex2.eu/schema/2_0RC1/2_0}TrafficStatusEnum" minOccurs="0"/>
 *         &lt;element name="trafficTrendType" type="{http://datex2.eu/schema/2_0RC1/2_0}TrafficTrendTypeEnum" minOccurs="0"/>
 *         &lt;element name="trafficStatusValueExtension" type="{http://datex2.eu/schema/2_0RC1/2_0}ExtensionType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TrafficStatusValue", propOrder = {
    "trafficStatus",
    "trafficTrendType",
    "trafficStatusValueExtension"
})
public class TrafficStatusValue
    extends BasicDataValue
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    protected TrafficStatusEnum trafficStatus;
    protected TrafficTrendTypeEnum trafficTrendType;
    protected ExtensionType trafficStatusValueExtension;

    /**
     * Obtient la valeur de la propriété trafficStatus.
     * 
     * @return
     *     possible object is
     *     {@link TrafficStatusEnum }
     *     
     */
    public TrafficStatusEnum getTrafficStatus() {
        return trafficStatus;
    }

    /**
     * Définit la valeur de la propriété trafficStatus.
     * 
     * @param value
     *     allowed object is
     *     {@link TrafficStatusEnum }
     *     
     */
    public void setTrafficStatus(TrafficStatusEnum value) {
        this.trafficStatus = value;
    }

    public boolean isSetTrafficStatus() {
        return (this.trafficStatus!= null);
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
     * Obtient la valeur de la propriété trafficStatusValueExtension.
     * 
     * @return
     *     possible object is
     *     {@link ExtensionType }
     *     
     */
    public ExtensionType getTrafficStatusValueExtension() {
        return trafficStatusValueExtension;
    }

    /**
     * Définit la valeur de la propriété trafficStatusValueExtension.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtensionType }
     *     
     */
    public void setTrafficStatusValueExtension(ExtensionType value) {
        this.trafficStatusValueExtension = value;
    }

    public boolean isSetTrafficStatusValueExtension() {
        return (this.trafficStatusValueExtension!= null);
    }

}
