
package eu.datex2.schema._2_0rc1._2_0;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour PoorEnvironmentConditions complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="PoorEnvironmentConditions">
 *   &lt;complexContent>
 *     &lt;extension base="{http://datex2.eu/schema/2_0RC1/2_0}Conditions">
 *       &lt;sequence>
 *         &lt;element name="poorEnvironmentType" type="{http://datex2.eu/schema/2_0RC1/2_0}PoorEnvironmentTypeEnum" maxOccurs="unbounded"/>
 *         &lt;element name="precipitationDetail" type="{http://datex2.eu/schema/2_0RC1/2_0}PrecipitationDetail" minOccurs="0"/>
 *         &lt;element name="visibility" type="{http://datex2.eu/schema/2_0RC1/2_0}Visibility" minOccurs="0"/>
 *         &lt;element name="pollutionMeasurement" type="{http://datex2.eu/schema/2_0RC1/2_0}PollutionMeasurement" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="temperature" type="{http://datex2.eu/schema/2_0RC1/2_0}Temperature" minOccurs="0"/>
 *         &lt;element name="wind" type="{http://datex2.eu/schema/2_0RC1/2_0}Wind" minOccurs="0"/>
 *         &lt;element name="humidity" type="{http://datex2.eu/schema/2_0RC1/2_0}Humidity" minOccurs="0"/>
 *         &lt;element name="poorEnvironmentConditionsExtension" type="{http://datex2.eu/schema/2_0RC1/2_0}ExtensionType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PoorEnvironmentConditions", propOrder = {
    "poorEnvironmentType",
    "precipitationDetail",
    "visibility",
    "pollutionMeasurement",
    "temperature",
    "wind",
    "humidity",
    "poorEnvironmentConditionsExtension"
})
public class PoorEnvironmentConditions
    extends Conditions
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(required = true)
    protected List<PoorEnvironmentTypeEnum> poorEnvironmentType;
    protected PrecipitationDetail precipitationDetail;
    protected Visibility visibility;
    protected List<PollutionMeasurement> pollutionMeasurement;
    protected Temperature temperature;
    protected Wind wind;
    protected Humidity humidity;
    protected ExtensionType poorEnvironmentConditionsExtension;

    /**
     * Gets the value of the poorEnvironmentType property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the poorEnvironmentType property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPoorEnvironmentType().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PoorEnvironmentTypeEnum }
     * 
     * 
     */
    public List<PoorEnvironmentTypeEnum> getPoorEnvironmentType() {
        if (poorEnvironmentType == null) {
            poorEnvironmentType = new ArrayList<PoorEnvironmentTypeEnum>();
        }
        return this.poorEnvironmentType;
    }

    public boolean isSetPoorEnvironmentType() {
        return ((this.poorEnvironmentType!= null)&&(!this.poorEnvironmentType.isEmpty()));
    }

    public void unsetPoorEnvironmentType() {
        this.poorEnvironmentType = null;
    }

    /**
     * Obtient la valeur de la propriété precipitationDetail.
     * 
     * @return
     *     possible object is
     *     {@link PrecipitationDetail }
     *     
     */
    public PrecipitationDetail getPrecipitationDetail() {
        return precipitationDetail;
    }

    /**
     * Définit la valeur de la propriété precipitationDetail.
     * 
     * @param value
     *     allowed object is
     *     {@link PrecipitationDetail }
     *     
     */
    public void setPrecipitationDetail(PrecipitationDetail value) {
        this.precipitationDetail = value;
    }

    public boolean isSetPrecipitationDetail() {
        return (this.precipitationDetail!= null);
    }

    /**
     * Obtient la valeur de la propriété visibility.
     * 
     * @return
     *     possible object is
     *     {@link Visibility }
     *     
     */
    public Visibility getVisibility() {
        return visibility;
    }

    /**
     * Définit la valeur de la propriété visibility.
     * 
     * @param value
     *     allowed object is
     *     {@link Visibility }
     *     
     */
    public void setVisibility(Visibility value) {
        this.visibility = value;
    }

    public boolean isSetVisibility() {
        return (this.visibility!= null);
    }

    /**
     * Gets the value of the pollutionMeasurement property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the pollutionMeasurement property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPollutionMeasurement().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PollutionMeasurement }
     * 
     * 
     */
    public List<PollutionMeasurement> getPollutionMeasurement() {
        if (pollutionMeasurement == null) {
            pollutionMeasurement = new ArrayList<PollutionMeasurement>();
        }
        return this.pollutionMeasurement;
    }

    public boolean isSetPollutionMeasurement() {
        return ((this.pollutionMeasurement!= null)&&(!this.pollutionMeasurement.isEmpty()));
    }

    public void unsetPollutionMeasurement() {
        this.pollutionMeasurement = null;
    }

    /**
     * Obtient la valeur de la propriété temperature.
     * 
     * @return
     *     possible object is
     *     {@link Temperature }
     *     
     */
    public Temperature getTemperature() {
        return temperature;
    }

    /**
     * Définit la valeur de la propriété temperature.
     * 
     * @param value
     *     allowed object is
     *     {@link Temperature }
     *     
     */
    public void setTemperature(Temperature value) {
        this.temperature = value;
    }

    public boolean isSetTemperature() {
        return (this.temperature!= null);
    }

    /**
     * Obtient la valeur de la propriété wind.
     * 
     * @return
     *     possible object is
     *     {@link Wind }
     *     
     */
    public Wind getWind() {
        return wind;
    }

    /**
     * Définit la valeur de la propriété wind.
     * 
     * @param value
     *     allowed object is
     *     {@link Wind }
     *     
     */
    public void setWind(Wind value) {
        this.wind = value;
    }

    public boolean isSetWind() {
        return (this.wind!= null);
    }

    /**
     * Obtient la valeur de la propriété humidity.
     * 
     * @return
     *     possible object is
     *     {@link Humidity }
     *     
     */
    public Humidity getHumidity() {
        return humidity;
    }

    /**
     * Définit la valeur de la propriété humidity.
     * 
     * @param value
     *     allowed object is
     *     {@link Humidity }
     *     
     */
    public void setHumidity(Humidity value) {
        this.humidity = value;
    }

    public boolean isSetHumidity() {
        return (this.humidity!= null);
    }

    /**
     * Obtient la valeur de la propriété poorEnvironmentConditionsExtension.
     * 
     * @return
     *     possible object is
     *     {@link ExtensionType }
     *     
     */
    public ExtensionType getPoorEnvironmentConditionsExtension() {
        return poorEnvironmentConditionsExtension;
    }

    /**
     * Définit la valeur de la propriété poorEnvironmentConditionsExtension.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtensionType }
     *     
     */
    public void setPoorEnvironmentConditionsExtension(ExtensionType value) {
        this.poorEnvironmentConditionsExtension = value;
    }

    public boolean isSetPoorEnvironmentConditionsExtension() {
        return (this.poorEnvironmentConditionsExtension!= null);
    }

}
