
package eu.datex2.schema._2_0rc1._2_0;

import java.io.Serializable;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour RoadOrCarriagewayOrLaneManagement complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="RoadOrCarriagewayOrLaneManagement">
 *   &lt;complexContent>
 *     &lt;extension base="{http://datex2.eu/schema/2_0RC1/2_0}NetworkManagement">
 *       &lt;sequence>
 *         &lt;element name="roadOrCarriagewayOrLaneManagementType" type="{http://datex2.eu/schema/2_0RC1/2_0}RoadOrCarriagewayOrLaneManagementTypeEnum"/>
 *         &lt;element name="minimumCarOccupancy" type="{http://datex2.eu/schema/2_0RC1/2_0}NonNegativeInteger" minOccurs="0"/>
 *         &lt;element name="specifiedCarriageway" type="{http://datex2.eu/schema/2_0RC1/2_0}CarriagewayEnum" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="specifiedLane" type="{http://datex2.eu/schema/2_0RC1/2_0}LaneEnum" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="roadOrCarriagewayOrLaneManagementExtension" type="{http://datex2.eu/schema/2_0RC1/2_0}ExtensionType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RoadOrCarriagewayOrLaneManagement", propOrder = {
    "roadOrCarriagewayOrLaneManagementType",
    "minimumCarOccupancy",
    "specifiedCarriageway",
    "specifiedLane",
    "roadOrCarriagewayOrLaneManagementExtension"
})
public class RoadOrCarriagewayOrLaneManagement
    extends NetworkManagement
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(required = true)
    protected RoadOrCarriagewayOrLaneManagementTypeEnum roadOrCarriagewayOrLaneManagementType;
    protected BigInteger minimumCarOccupancy;
    protected List<CarriagewayEnum> specifiedCarriageway;
    protected List<LaneEnum> specifiedLane;
    protected ExtensionType roadOrCarriagewayOrLaneManagementExtension;

    /**
     * Obtient la valeur de la propriété roadOrCarriagewayOrLaneManagementType.
     * 
     * @return
     *     possible object is
     *     {@link RoadOrCarriagewayOrLaneManagementTypeEnum }
     *     
     */
    public RoadOrCarriagewayOrLaneManagementTypeEnum getRoadOrCarriagewayOrLaneManagementType() {
        return roadOrCarriagewayOrLaneManagementType;
    }

    /**
     * Définit la valeur de la propriété roadOrCarriagewayOrLaneManagementType.
     * 
     * @param value
     *     allowed object is
     *     {@link RoadOrCarriagewayOrLaneManagementTypeEnum }
     *     
     */
    public void setRoadOrCarriagewayOrLaneManagementType(RoadOrCarriagewayOrLaneManagementTypeEnum value) {
        this.roadOrCarriagewayOrLaneManagementType = value;
    }

    public boolean isSetRoadOrCarriagewayOrLaneManagementType() {
        return (this.roadOrCarriagewayOrLaneManagementType!= null);
    }

    /**
     * Obtient la valeur de la propriété minimumCarOccupancy.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getMinimumCarOccupancy() {
        return minimumCarOccupancy;
    }

    /**
     * Définit la valeur de la propriété minimumCarOccupancy.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setMinimumCarOccupancy(BigInteger value) {
        this.minimumCarOccupancy = value;
    }

    public boolean isSetMinimumCarOccupancy() {
        return (this.minimumCarOccupancy!= null);
    }

    /**
     * Gets the value of the specifiedCarriageway property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the specifiedCarriageway property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSpecifiedCarriageway().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CarriagewayEnum }
     * 
     * 
     */
    public List<CarriagewayEnum> getSpecifiedCarriageway() {
        if (specifiedCarriageway == null) {
            specifiedCarriageway = new ArrayList<CarriagewayEnum>();
        }
        return this.specifiedCarriageway;
    }

    public boolean isSetSpecifiedCarriageway() {
        return ((this.specifiedCarriageway!= null)&&(!this.specifiedCarriageway.isEmpty()));
    }

    public void unsetSpecifiedCarriageway() {
        this.specifiedCarriageway = null;
    }

    /**
     * Gets the value of the specifiedLane property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the specifiedLane property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSpecifiedLane().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LaneEnum }
     * 
     * 
     */
    public List<LaneEnum> getSpecifiedLane() {
        if (specifiedLane == null) {
            specifiedLane = new ArrayList<LaneEnum>();
        }
        return this.specifiedLane;
    }

    public boolean isSetSpecifiedLane() {
        return ((this.specifiedLane!= null)&&(!this.specifiedLane.isEmpty()));
    }

    public void unsetSpecifiedLane() {
        this.specifiedLane = null;
    }

    /**
     * Obtient la valeur de la propriété roadOrCarriagewayOrLaneManagementExtension.
     * 
     * @return
     *     possible object is
     *     {@link ExtensionType }
     *     
     */
    public ExtensionType getRoadOrCarriagewayOrLaneManagementExtension() {
        return roadOrCarriagewayOrLaneManagementExtension;
    }

    /**
     * Définit la valeur de la propriété roadOrCarriagewayOrLaneManagementExtension.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtensionType }
     *     
     */
    public void setRoadOrCarriagewayOrLaneManagementExtension(ExtensionType value) {
        this.roadOrCarriagewayOrLaneManagementExtension = value;
    }

    public boolean isSetRoadOrCarriagewayOrLaneManagementExtension() {
        return (this.roadOrCarriagewayOrLaneManagementExtension!= null);
    }

}
