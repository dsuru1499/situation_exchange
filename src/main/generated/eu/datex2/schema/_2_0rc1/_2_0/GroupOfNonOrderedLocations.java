
package eu.datex2.schema._2_0rc1._2_0;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour GroupOfNonOrderedLocations complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="GroupOfNonOrderedLocations">
 *   &lt;complexContent>
 *     &lt;extension base="{http://datex2.eu/schema/2_0RC1/2_0}GroupOfLocations">
 *       &lt;sequence>
 *         &lt;element name="locationContainedInGroup" type="{http://datex2.eu/schema/2_0RC1/2_0}Location" maxOccurs="unbounded"/>
 *         &lt;element name="groupOfNonOrderedLocationsExtension" type="{http://datex2.eu/schema/2_0RC1/2_0}ExtensionType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GroupOfNonOrderedLocations", propOrder = {
    "locationContainedInGroup",
    "groupOfNonOrderedLocationsExtension"
})
public class GroupOfNonOrderedLocations
    extends GroupOfLocations
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(required = true)
    protected List<Location> locationContainedInGroup;
    protected ExtensionType groupOfNonOrderedLocationsExtension;

    /**
     * Gets the value of the locationContainedInGroup property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the locationContainedInGroup property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLocationContainedInGroup().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Location }
     * 
     * 
     */
    public List<Location> getLocationContainedInGroup() {
        if (locationContainedInGroup == null) {
            locationContainedInGroup = new ArrayList<Location>();
        }
        return this.locationContainedInGroup;
    }

    public boolean isSetLocationContainedInGroup() {
        return ((this.locationContainedInGroup!= null)&&(!this.locationContainedInGroup.isEmpty()));
    }

    public void unsetLocationContainedInGroup() {
        this.locationContainedInGroup = null;
    }

    /**
     * Obtient la valeur de la propriété groupOfNonOrderedLocationsExtension.
     * 
     * @return
     *     possible object is
     *     {@link ExtensionType }
     *     
     */
    public ExtensionType getGroupOfNonOrderedLocationsExtension() {
        return groupOfNonOrderedLocationsExtension;
    }

    /**
     * Définit la valeur de la propriété groupOfNonOrderedLocationsExtension.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtensionType }
     *     
     */
    public void setGroupOfNonOrderedLocationsExtension(ExtensionType value) {
        this.groupOfNonOrderedLocationsExtension = value;
    }

    public boolean isSetGroupOfNonOrderedLocationsExtension() {
        return (this.groupOfNonOrderedLocationsExtension!= null);
    }

}
