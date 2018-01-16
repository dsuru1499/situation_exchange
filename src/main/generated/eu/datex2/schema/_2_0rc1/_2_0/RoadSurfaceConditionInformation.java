
package eu.datex2.schema._2_0rc1._2_0;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour RoadSurfaceConditionInformation complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="RoadSurfaceConditionInformation">
 *   &lt;complexContent>
 *     &lt;extension base="{http://datex2.eu/schema/2_0RC1/2_0}WeatherValue">
 *       &lt;sequence>
 *         &lt;element name="roadSurfaceConditionMeasurements" type="{http://datex2.eu/schema/2_0RC1/2_0}RoadSurfaceConditionMeasurements"/>
 *         &lt;element name="roadSurfaceConditionInformationExtension" type="{http://datex2.eu/schema/2_0RC1/2_0}ExtensionType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RoadSurfaceConditionInformation", propOrder = {
    "roadSurfaceConditionMeasurements",
    "roadSurfaceConditionInformationExtension"
})
public class RoadSurfaceConditionInformation
    extends WeatherValue
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(required = true)
    protected RoadSurfaceConditionMeasurements roadSurfaceConditionMeasurements;
    protected ExtensionType roadSurfaceConditionInformationExtension;

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
     * Obtient la valeur de la propriété roadSurfaceConditionInformationExtension.
     * 
     * @return
     *     possible object is
     *     {@link ExtensionType }
     *     
     */
    public ExtensionType getRoadSurfaceConditionInformationExtension() {
        return roadSurfaceConditionInformationExtension;
    }

    /**
     * Définit la valeur de la propriété roadSurfaceConditionInformationExtension.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtensionType }
     *     
     */
    public void setRoadSurfaceConditionInformationExtension(ExtensionType value) {
        this.roadSurfaceConditionInformationExtension = value;
    }

    public boolean isSetRoadSurfaceConditionInformationExtension() {
        return (this.roadSurfaceConditionInformationExtension!= null);
    }

}
