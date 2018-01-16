
package eu.datex2.schema._2_0rc1._2_0;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour TrafficHeadway complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="TrafficHeadway">
 *   &lt;complexContent>
 *     &lt;extension base="{http://datex2.eu/schema/2_0RC1/2_0}TrafficValue">
 *       &lt;sequence>
 *         &lt;element name="averageDistanceHeadway" type="{http://datex2.eu/schema/2_0RC1/2_0}MetresAsFloat" minOccurs="0"/>
 *         &lt;element name="averageTimeHeadway" type="{http://datex2.eu/schema/2_0RC1/2_0}Seconds" minOccurs="0"/>
 *         &lt;element name="trafficHeadwayExtension" type="{http://datex2.eu/schema/2_0RC1/2_0}ExtensionType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TrafficHeadway", propOrder = {
    "averageDistanceHeadway",
    "averageTimeHeadway",
    "trafficHeadwayExtension"
})
public class TrafficHeadway
    extends TrafficValue
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    protected Float averageDistanceHeadway;
    protected Float averageTimeHeadway;
    protected ExtensionType trafficHeadwayExtension;

    /**
     * Obtient la valeur de la propriété averageDistanceHeadway.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getAverageDistanceHeadway() {
        return averageDistanceHeadway;
    }

    /**
     * Définit la valeur de la propriété averageDistanceHeadway.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setAverageDistanceHeadway(Float value) {
        this.averageDistanceHeadway = value;
    }

    public boolean isSetAverageDistanceHeadway() {
        return (this.averageDistanceHeadway!= null);
    }

    /**
     * Obtient la valeur de la propriété averageTimeHeadway.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getAverageTimeHeadway() {
        return averageTimeHeadway;
    }

    /**
     * Définit la valeur de la propriété averageTimeHeadway.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setAverageTimeHeadway(Float value) {
        this.averageTimeHeadway = value;
    }

    public boolean isSetAverageTimeHeadway() {
        return (this.averageTimeHeadway!= null);
    }

    /**
     * Obtient la valeur de la propriété trafficHeadwayExtension.
     * 
     * @return
     *     possible object is
     *     {@link ExtensionType }
     *     
     */
    public ExtensionType getTrafficHeadwayExtension() {
        return trafficHeadwayExtension;
    }

    /**
     * Définit la valeur de la propriété trafficHeadwayExtension.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtensionType }
     *     
     */
    public void setTrafficHeadwayExtension(ExtensionType value) {
        this.trafficHeadwayExtension = value;
    }

    public boolean isSetTrafficHeadwayExtension() {
        return (this.trafficHeadwayExtension!= null);
    }

}
