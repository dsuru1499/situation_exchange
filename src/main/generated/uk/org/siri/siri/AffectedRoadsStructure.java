
package uk.org.siri.siri;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import eu.datex2.schema._2_0rc1._2_0.GroupOfLocations;


/**
 * Type for Location model for scope of SITUATION or effect.
 * 
 * <p>Classe Java pour AffectedRoadsStructure complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="AffectedRoadsStructure">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Datex2Locations" type="{http://datex2.eu/schema/2_0RC1/2_0}GroupOfLocations" minOccurs="0"/>
 *         &lt;element name="AffectedRoad" type="{http://www.siri.org.uk/siri}AffectedRoadStructure" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AffectedRoadsStructure", propOrder = {
    "datex2Locations",
    "affectedRoad"
})
public class AffectedRoadsStructure
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "Datex2Locations")
    protected GroupOfLocations datex2Locations;
    @XmlElement(name = "AffectedRoad")
    protected List<AffectedRoadStructure> affectedRoad;

    /**
     * Obtient la valeur de la propriété datex2Locations.
     * 
     * @return
     *     possible object is
     *     {@link GroupOfLocations }
     *     
     */
    public GroupOfLocations getDatex2Locations() {
        return datex2Locations;
    }

    /**
     * Définit la valeur de la propriété datex2Locations.
     * 
     * @param value
     *     allowed object is
     *     {@link GroupOfLocations }
     *     
     */
    public void setDatex2Locations(GroupOfLocations value) {
        this.datex2Locations = value;
    }

    public boolean isSetDatex2Locations() {
        return (this.datex2Locations!= null);
    }

    /**
     * Gets the value of the affectedRoad property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the affectedRoad property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAffectedRoad().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AffectedRoadStructure }
     * 
     * 
     */
    public List<AffectedRoadStructure> getAffectedRoad() {
        if (affectedRoad == null) {
            affectedRoad = new ArrayList<AffectedRoadStructure>();
        }
        return this.affectedRoad;
    }

    public boolean isSetAffectedRoad() {
        return ((this.affectedRoad!= null)&&(!this.affectedRoad.isEmpty()));
    }

    public void unsetAffectedRoad() {
        this.affectedRoad = null;
    }

}
