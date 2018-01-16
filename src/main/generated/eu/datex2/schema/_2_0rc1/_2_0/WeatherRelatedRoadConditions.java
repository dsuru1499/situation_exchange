
package eu.datex2.schema._2_0rc1._2_0;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour WeatherRelatedRoadConditions complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="WeatherRelatedRoadConditions">
 *   &lt;complexContent>
 *     &lt;extension base="{http://datex2.eu/schema/2_0RC1/2_0}RoadConditions">
 *       &lt;sequence>
 *         &lt;element name="weatherRelatedRoadConditionType" type="{http://datex2.eu/schema/2_0RC1/2_0}WeatherRelatedRoadConditionTypeEnum" maxOccurs="unbounded"/>
 *         &lt;element name="roadSurfaceConditionMeasurements" type="{http://datex2.eu/schema/2_0RC1/2_0}RoadSurfaceConditionMeasurements" minOccurs="0"/>
 *         &lt;element name="weatherRelatedRoadConditionsExtension" type="{http://datex2.eu/schema/2_0RC1/2_0}ExtensionType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "WeatherRelatedRoadConditions", propOrder = {
    "weatherRelatedRoadConditionType",
    "roadSurfaceConditionMeasurements",
    "weatherRelatedRoadConditionsExtension"
})
public class WeatherRelatedRoadConditions
    extends RoadConditions
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(required = true)
    protected List<WeatherRelatedRoadConditionTypeEnum> weatherRelatedRoadConditionType;
    protected RoadSurfaceConditionMeasurements roadSurfaceConditionMeasurements;
    protected ExtensionType weatherRelatedRoadConditionsExtension;

    /**
     * Gets the value of the weatherRelatedRoadConditionType property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the weatherRelatedRoadConditionType property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getWeatherRelatedRoadConditionType().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link WeatherRelatedRoadConditionTypeEnum }
     * 
     * 
     */
    public List<WeatherRelatedRoadConditionTypeEnum> getWeatherRelatedRoadConditionType() {
        if (weatherRelatedRoadConditionType == null) {
            weatherRelatedRoadConditionType = new ArrayList<WeatherRelatedRoadConditionTypeEnum>();
        }
        return this.weatherRelatedRoadConditionType;
    }

    public boolean isSetWeatherRelatedRoadConditionType() {
        return ((this.weatherRelatedRoadConditionType!= null)&&(!this.weatherRelatedRoadConditionType.isEmpty()));
    }

    public void unsetWeatherRelatedRoadConditionType() {
        this.weatherRelatedRoadConditionType = null;
    }

    /**
     * Obtient la valeur de la propriété roadSurfaceConditionMeasurements.
     * 
     * @return
     *     possible object is
     *     {@link RoadSurfaceConditionMeasurements }
     *     
     */
    public RoadSurfaceConditionMeasurements getRoadSurfaceConditionMeasurements() {
        return roadSurfaceConditionMeasurements;
    }

    /**
     * Définit la valeur de la propriété roadSurfaceConditionMeasurements.
     * 
     * @param value
     *     allowed object is
     *     {@link RoadSurfaceConditionMeasurements }
     *     
     */
    public void setRoadSurfaceConditionMeasurements(RoadSurfaceConditionMeasurements value) {
        this.roadSurfaceConditionMeasurements = value;
    }

    public boolean isSetRoadSurfaceConditionMeasurements() {
        return (this.roadSurfaceConditionMeasurements!= null);
    }

    /**
     * Obtient la valeur de la propriété weatherRelatedRoadConditionsExtension.
     * 
     * @return
     *     possible object is
     *     {@link ExtensionType }
     *     
     */
    public ExtensionType getWeatherRelatedRoadConditionsExtension() {
        return weatherRelatedRoadConditionsExtension;
    }

    /**
     * Définit la valeur de la propriété weatherRelatedRoadConditionsExtension.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtensionType }
     *     
     */
    public void setWeatherRelatedRoadConditionsExtension(ExtensionType value) {
        this.weatherRelatedRoadConditionsExtension = value;
    }

    public boolean isSetWeatherRelatedRoadConditionsExtension() {
        return (this.weatherRelatedRoadConditionsExtension!= null);
    }

}
