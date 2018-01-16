
package eu.datex2.schema._2_0rc1._2_0;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour RoadsideServiceDisruption complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="RoadsideServiceDisruption">
 *   &lt;complexContent>
 *     &lt;extension base="{http://datex2.eu/schema/2_0RC1/2_0}NonRoadEventInformation">
 *       &lt;sequence>
 *         &lt;element name="roadsideServiceDisruptionType" type="{http://datex2.eu/schema/2_0RC1/2_0}RoadsideServiceDisruptionTypeEnum" maxOccurs="unbounded"/>
 *         &lt;element name="roadsideServiceDisruptionExtension" type="{http://datex2.eu/schema/2_0RC1/2_0}ExtensionType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RoadsideServiceDisruption", propOrder = {
    "roadsideServiceDisruptionType",
    "roadsideServiceDisruptionExtension"
})
public class RoadsideServiceDisruption
    extends NonRoadEventInformation
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(required = true)
    protected List<RoadsideServiceDisruptionTypeEnum> roadsideServiceDisruptionType;
    protected ExtensionType roadsideServiceDisruptionExtension;

    /**
     * Gets the value of the roadsideServiceDisruptionType property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the roadsideServiceDisruptionType property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRoadsideServiceDisruptionType().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RoadsideServiceDisruptionTypeEnum }
     * 
     * 
     */
    public List<RoadsideServiceDisruptionTypeEnum> getRoadsideServiceDisruptionType() {
        if (roadsideServiceDisruptionType == null) {
            roadsideServiceDisruptionType = new ArrayList<RoadsideServiceDisruptionTypeEnum>();
        }
        return this.roadsideServiceDisruptionType;
    }

    public boolean isSetRoadsideServiceDisruptionType() {
        return ((this.roadsideServiceDisruptionType!= null)&&(!this.roadsideServiceDisruptionType.isEmpty()));
    }

    public void unsetRoadsideServiceDisruptionType() {
        this.roadsideServiceDisruptionType = null;
    }

    /**
     * Obtient la valeur de la propriété roadsideServiceDisruptionExtension.
     * 
     * @return
     *     possible object is
     *     {@link ExtensionType }
     *     
     */
    public ExtensionType getRoadsideServiceDisruptionExtension() {
        return roadsideServiceDisruptionExtension;
    }

    /**
     * Définit la valeur de la propriété roadsideServiceDisruptionExtension.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtensionType }
     *     
     */
    public void setRoadsideServiceDisruptionExtension(ExtensionType value) {
        this.roadsideServiceDisruptionExtension = value;
    }

    public boolean isSetRoadsideServiceDisruptionExtension() {
        return (this.roadsideServiceDisruptionExtension!= null);
    }

}
