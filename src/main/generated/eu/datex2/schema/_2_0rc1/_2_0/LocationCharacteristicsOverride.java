
package eu.datex2.schema._2_0rc1._2_0;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour LocationCharacteristicsOverride complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="LocationCharacteristicsOverride">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="measurementLanesOverride" type="{http://datex2.eu/schema/2_0RC1/2_0}LaneEnum" minOccurs="0"/>
 *         &lt;element name="reversedFlow" type="{http://datex2.eu/schema/2_0RC1/2_0}Boolean" minOccurs="0"/>
 *         &lt;element name="locationCharacteristicsOverrideExtension" type="{http://datex2.eu/schema/2_0RC1/2_0}ExtensionType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LocationCharacteristicsOverride", propOrder = {
    "measurementLanesOverride",
    "reversedFlow",
    "locationCharacteristicsOverrideExtension"
})
public class LocationCharacteristicsOverride
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    protected LaneEnum measurementLanesOverride;
    protected Boolean reversedFlow;
    protected ExtensionType locationCharacteristicsOverrideExtension;

    /**
     * Obtient la valeur de la propriété measurementLanesOverride.
     * 
     * @return
     *     possible object is
     *     {@link LaneEnum }
     *     
     */
    public LaneEnum getMeasurementLanesOverride() {
        return measurementLanesOverride;
    }

    /**
     * Définit la valeur de la propriété measurementLanesOverride.
     * 
     * @param value
     *     allowed object is
     *     {@link LaneEnum }
     *     
     */
    public void setMeasurementLanesOverride(LaneEnum value) {
        this.measurementLanesOverride = value;
    }

    public boolean isSetMeasurementLanesOverride() {
        return (this.measurementLanesOverride!= null);
    }

    /**
     * Obtient la valeur de la propriété reversedFlow.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isReversedFlow() {
        return reversedFlow;
    }

    /**
     * Définit la valeur de la propriété reversedFlow.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setReversedFlow(Boolean value) {
        this.reversedFlow = value;
    }

    public boolean isSetReversedFlow() {
        return (this.reversedFlow!= null);
    }

    /**
     * Obtient la valeur de la propriété locationCharacteristicsOverrideExtension.
     * 
     * @return
     *     possible object is
     *     {@link ExtensionType }
     *     
     */
    public ExtensionType getLocationCharacteristicsOverrideExtension() {
        return locationCharacteristicsOverrideExtension;
    }

    /**
     * Définit la valeur de la propriété locationCharacteristicsOverrideExtension.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtensionType }
     *     
     */
    public void setLocationCharacteristicsOverrideExtension(ExtensionType value) {
        this.locationCharacteristicsOverrideExtension = value;
    }

    public boolean isSetLocationCharacteristicsOverrideExtension() {
        return (this.locationCharacteristicsOverrideExtension!= null);
    }

}
