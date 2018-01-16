
package eu.datex2.schema._2_0rc1._2_0;

import java.io.Serializable;
import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour TrafficConcentration complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="TrafficConcentration">
 *   &lt;complexContent>
 *     &lt;extension base="{http://datex2.eu/schema/2_0RC1/2_0}TrafficValue">
 *       &lt;sequence>
 *         &lt;element name="concentration" type="{http://datex2.eu/schema/2_0RC1/2_0}ConcentrationVehiclesPerKilometre" minOccurs="0"/>
 *         &lt;element name="occupancy" type="{http://datex2.eu/schema/2_0RC1/2_0}Percentage" minOccurs="0"/>
 *         &lt;element name="trafficConcentrationExtension" type="{http://datex2.eu/schema/2_0RC1/2_0}ExtensionType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TrafficConcentration", propOrder = {
    "concentration",
    "occupancy",
    "trafficConcentrationExtension"
})
public class TrafficConcentration
    extends TrafficValue
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    protected BigInteger concentration;
    protected Float occupancy;
    protected ExtensionType trafficConcentrationExtension;

    /**
     * Obtient la valeur de la propriété concentration.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getConcentration() {
        return concentration;
    }

    /**
     * Définit la valeur de la propriété concentration.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setConcentration(BigInteger value) {
        this.concentration = value;
    }

    public boolean isSetConcentration() {
        return (this.concentration!= null);
    }

    /**
     * Obtient la valeur de la propriété occupancy.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getOccupancy() {
        return occupancy;
    }

    /**
     * Définit la valeur de la propriété occupancy.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setOccupancy(Float value) {
        this.occupancy = value;
    }

    public boolean isSetOccupancy() {
        return (this.occupancy!= null);
    }

    /**
     * Obtient la valeur de la propriété trafficConcentrationExtension.
     * 
     * @return
     *     possible object is
     *     {@link ExtensionType }
     *     
     */
    public ExtensionType getTrafficConcentrationExtension() {
        return trafficConcentrationExtension;
    }

    /**
     * Définit la valeur de la propriété trafficConcentrationExtension.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtensionType }
     *     
     */
    public void setTrafficConcentrationExtension(ExtensionType value) {
        this.trafficConcentrationExtension = value;
    }

    public boolean isSetTrafficConcentrationExtension() {
        return (this.trafficConcentrationExtension!= null);
    }

}
