
package eu.datex2.schema._2_0rc1._2_0;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour VehicleHeadway complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="VehicleHeadway">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="distanceGap" type="{http://datex2.eu/schema/2_0RC1/2_0}MetresAsFloat" minOccurs="0"/>
 *         &lt;element name="distanceHeadway" type="{http://datex2.eu/schema/2_0RC1/2_0}MetresAsFloat" minOccurs="0"/>
 *         &lt;element name="vehicleHeadwayExtension" type="{http://datex2.eu/schema/2_0RC1/2_0}ExtensionType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VehicleHeadway", propOrder = {
    "distanceGap",
    "distanceHeadway",
    "vehicleHeadwayExtension"
})
public class VehicleHeadway
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    protected Float distanceGap;
    protected Float distanceHeadway;
    protected ExtensionType vehicleHeadwayExtension;

    /**
     * Obtient la valeur de la propriété distanceGap.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getDistanceGap() {
        return distanceGap;
    }

    /**
     * Définit la valeur de la propriété distanceGap.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setDistanceGap(Float value) {
        this.distanceGap = value;
    }

    public boolean isSetDistanceGap() {
        return (this.distanceGap!= null);
    }

    /**
     * Obtient la valeur de la propriété distanceHeadway.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getDistanceHeadway() {
        return distanceHeadway;
    }

    /**
     * Définit la valeur de la propriété distanceHeadway.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setDistanceHeadway(Float value) {
        this.distanceHeadway = value;
    }

    public boolean isSetDistanceHeadway() {
        return (this.distanceHeadway!= null);
    }

    /**
     * Obtient la valeur de la propriété vehicleHeadwayExtension.
     * 
     * @return
     *     possible object is
     *     {@link ExtensionType }
     *     
     */
    public ExtensionType getVehicleHeadwayExtension() {
        return vehicleHeadwayExtension;
    }

    /**
     * Définit la valeur de la propriété vehicleHeadwayExtension.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtensionType }
     *     
     */
    public void setVehicleHeadwayExtension(ExtensionType value) {
        this.vehicleHeadwayExtension = value;
    }

    public boolean isSetVehicleHeadwayExtension() {
        return (this.vehicleHeadwayExtension!= null);
    }

}
