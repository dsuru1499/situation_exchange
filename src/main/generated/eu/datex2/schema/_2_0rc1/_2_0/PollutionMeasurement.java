
package eu.datex2.schema._2_0rc1._2_0;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour PollutionMeasurement complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="PollutionMeasurement">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="pollutantConcentration" type="{http://datex2.eu/schema/2_0RC1/2_0}ConcentrationMicrogramsPerCubicMetre"/>
 *         &lt;element name="pollutantType" type="{http://datex2.eu/schema/2_0RC1/2_0}PollutantTypeEnum"/>
 *         &lt;element name="pollutionMeasurementExtension" type="{http://datex2.eu/schema/2_0RC1/2_0}ExtensionType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PollutionMeasurement", propOrder = {
    "pollutantConcentration",
    "pollutantType",
    "pollutionMeasurementExtension"
})
public class PollutionMeasurement
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    protected float pollutantConcentration;
    @XmlElement(required = true)
    protected PollutantTypeEnum pollutantType;
    protected ExtensionType pollutionMeasurementExtension;

    /**
     * Obtient la valeur de la propriété pollutantConcentration.
     * 
     */
    public float getPollutantConcentration() {
        return pollutantConcentration;
    }

    /**
     * Définit la valeur de la propriété pollutantConcentration.
     * 
     */
    public void setPollutantConcentration(float value) {
        this.pollutantConcentration = value;
    }

    public boolean isSetPollutantConcentration() {
        return true;
    }

    /**
     * Obtient la valeur de la propriété pollutantType.
     * 
     * @return
     *     possible object is
     *     {@link PollutantTypeEnum }
     *     
     */
    public PollutantTypeEnum getPollutantType() {
        return pollutantType;
    }

    /**
     * Définit la valeur de la propriété pollutantType.
     * 
     * @param value
     *     allowed object is
     *     {@link PollutantTypeEnum }
     *     
     */
    public void setPollutantType(PollutantTypeEnum value) {
        this.pollutantType = value;
    }

    public boolean isSetPollutantType() {
        return (this.pollutantType!= null);
    }

    /**
     * Obtient la valeur de la propriété pollutionMeasurementExtension.
     * 
     * @return
     *     possible object is
     *     {@link ExtensionType }
     *     
     */
    public ExtensionType getPollutionMeasurementExtension() {
        return pollutionMeasurementExtension;
    }

    /**
     * Définit la valeur de la propriété pollutionMeasurementExtension.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtensionType }
     *     
     */
    public void setPollutionMeasurementExtension(ExtensionType value) {
        this.pollutionMeasurementExtension = value;
    }

    public boolean isSetPollutionMeasurementExtension() {
        return (this.pollutionMeasurementExtension!= null);
    }

}
