
package eu.datex2.schema._2_0rc1._2_0;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour RoadOperatorServiceDisruption complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="RoadOperatorServiceDisruption">
 *   &lt;complexContent>
 *     &lt;extension base="{http://datex2.eu/schema/2_0RC1/2_0}NonRoadEventInformation">
 *       &lt;sequence>
 *         &lt;element name="roadOperatorServiceDisruptionType" type="{http://datex2.eu/schema/2_0RC1/2_0}RoadOperatorServiceDisruptionTypeEnum" maxOccurs="unbounded"/>
 *         &lt;element name="roadOperatorServiceDisruptionExtension" type="{http://datex2.eu/schema/2_0RC1/2_0}ExtensionType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RoadOperatorServiceDisruption", propOrder = {
    "roadOperatorServiceDisruptionType",
    "roadOperatorServiceDisruptionExtension"
})
public class RoadOperatorServiceDisruption
    extends NonRoadEventInformation
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(required = true)
    protected List<RoadOperatorServiceDisruptionTypeEnum> roadOperatorServiceDisruptionType;
    protected ExtensionType roadOperatorServiceDisruptionExtension;

    /**
     * Gets the value of the roadOperatorServiceDisruptionType property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the roadOperatorServiceDisruptionType property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRoadOperatorServiceDisruptionType().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RoadOperatorServiceDisruptionTypeEnum }
     * 
     * 
     */
    public List<RoadOperatorServiceDisruptionTypeEnum> getRoadOperatorServiceDisruptionType() {
        if (roadOperatorServiceDisruptionType == null) {
            roadOperatorServiceDisruptionType = new ArrayList<RoadOperatorServiceDisruptionTypeEnum>();
        }
        return this.roadOperatorServiceDisruptionType;
    }

    public boolean isSetRoadOperatorServiceDisruptionType() {
        return ((this.roadOperatorServiceDisruptionType!= null)&&(!this.roadOperatorServiceDisruptionType.isEmpty()));
    }

    public void unsetRoadOperatorServiceDisruptionType() {
        this.roadOperatorServiceDisruptionType = null;
    }

    /**
     * Obtient la valeur de la propriété roadOperatorServiceDisruptionExtension.
     * 
     * @return
     *     possible object is
     *     {@link ExtensionType }
     *     
     */
    public ExtensionType getRoadOperatorServiceDisruptionExtension() {
        return roadOperatorServiceDisruptionExtension;
    }

    /**
     * Définit la valeur de la propriété roadOperatorServiceDisruptionExtension.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtensionType }
     *     
     */
    public void setRoadOperatorServiceDisruptionExtension(ExtensionType value) {
        this.roadOperatorServiceDisruptionExtension = value;
    }

    public boolean isSetRoadOperatorServiceDisruptionExtension() {
        return (this.roadOperatorServiceDisruptionExtension!= null);
    }

}
