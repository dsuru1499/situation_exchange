
package eu.datex2.schema._2_0rc1._2_0;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour NonWeatherRelatedRoadConditions complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="NonWeatherRelatedRoadConditions">
 *   &lt;complexContent>
 *     &lt;extension base="{http://datex2.eu/schema/2_0RC1/2_0}RoadConditions">
 *       &lt;sequence>
 *         &lt;element name="nonWeatherRelatedRoadConditionType" type="{http://datex2.eu/schema/2_0RC1/2_0}NonWeatherRelatedRoadConditionTypeEnum" maxOccurs="unbounded"/>
 *         &lt;element name="nonWeatherRelatedRoadConditionsExtension" type="{http://datex2.eu/schema/2_0RC1/2_0}ExtensionType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NonWeatherRelatedRoadConditions", propOrder = {
    "nonWeatherRelatedRoadConditionType",
    "nonWeatherRelatedRoadConditionsExtension"
})
public class NonWeatherRelatedRoadConditions
    extends RoadConditions
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(required = true)
    protected List<NonWeatherRelatedRoadConditionTypeEnum> nonWeatherRelatedRoadConditionType;
    protected ExtensionType nonWeatherRelatedRoadConditionsExtension;

    /**
     * Gets the value of the nonWeatherRelatedRoadConditionType property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the nonWeatherRelatedRoadConditionType property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getNonWeatherRelatedRoadConditionType().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link NonWeatherRelatedRoadConditionTypeEnum }
     * 
     * 
     */
    public List<NonWeatherRelatedRoadConditionTypeEnum> getNonWeatherRelatedRoadConditionType() {
        if (nonWeatherRelatedRoadConditionType == null) {
            nonWeatherRelatedRoadConditionType = new ArrayList<NonWeatherRelatedRoadConditionTypeEnum>();
        }
        return this.nonWeatherRelatedRoadConditionType;
    }

    public boolean isSetNonWeatherRelatedRoadConditionType() {
        return ((this.nonWeatherRelatedRoadConditionType!= null)&&(!this.nonWeatherRelatedRoadConditionType.isEmpty()));
    }

    public void unsetNonWeatherRelatedRoadConditionType() {
        this.nonWeatherRelatedRoadConditionType = null;
    }

    /**
     * Obtient la valeur de la propriété nonWeatherRelatedRoadConditionsExtension.
     * 
     * @return
     *     possible object is
     *     {@link ExtensionType }
     *     
     */
    public ExtensionType getNonWeatherRelatedRoadConditionsExtension() {
        return nonWeatherRelatedRoadConditionsExtension;
    }

    /**
     * Définit la valeur de la propriété nonWeatherRelatedRoadConditionsExtension.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtensionType }
     *     
     */
    public void setNonWeatherRelatedRoadConditionsExtension(ExtensionType value) {
        this.nonWeatherRelatedRoadConditionsExtension = value;
    }

    public boolean isSetNonWeatherRelatedRoadConditionsExtension() {
        return (this.nonWeatherRelatedRoadConditionsExtension!= null);
    }

}
