
package uk.org.siri.siri;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Type for Change to a Distributor stop position.
 * 
 * <p>Classe Java pour StoppingPositionChangedDepartureStructure complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="StoppingPositionChangedDepartureStructure">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.siri.org.uk/siri}AbstractDistributorItemStructure">
 *       &lt;sequence>
 *         &lt;element name="ChangeNote" type="{http://www.siri.org.uk/siri}NaturalLanguagePlaceNameStructure" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="NewLocation" type="{http://www.siri.org.uk/siri}LocationStructure" minOccurs="0"/>
 *         &lt;element ref="{http://www.siri.org.uk/siri}Extensions" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "StoppingPositionChangedDepartureStructure", propOrder = {
    "changeNote",
    "newLocation",
    "extensions"
})
public class StoppingPositionChangedDepartureStructure
    extends AbstractDistributorItemStructure
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "ChangeNote")
    protected List<NaturalLanguagePlaceNameStructure> changeNote;
    @XmlElement(name = "NewLocation")
    protected LocationStructure newLocation;
    @XmlElement(name = "Extensions")
    protected ExtensionsStructure extensions;

    /**
     * Gets the value of the changeNote property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the changeNote property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getChangeNote().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link NaturalLanguagePlaceNameStructure }
     * 
     * 
     */
    public List<NaturalLanguagePlaceNameStructure> getChangeNote() {
        if (changeNote == null) {
            changeNote = new ArrayList<NaturalLanguagePlaceNameStructure>();
        }
        return this.changeNote;
    }

    public boolean isSetChangeNote() {
        return ((this.changeNote!= null)&&(!this.changeNote.isEmpty()));
    }

    public void unsetChangeNote() {
        this.changeNote = null;
    }

    /**
     * Obtient la valeur de la propriété newLocation.
     * 
     * @return
     *     possible object is
     *     {@link LocationStructure }
     *     
     */
    public LocationStructure getNewLocation() {
        return newLocation;
    }

    /**
     * Définit la valeur de la propriété newLocation.
     * 
     * @param value
     *     allowed object is
     *     {@link LocationStructure }
     *     
     */
    public void setNewLocation(LocationStructure value) {
        this.newLocation = value;
    }

    public boolean isSetNewLocation() {
        return (this.newLocation!= null);
    }

    /**
     * Obtient la valeur de la propriété extensions.
     * 
     * @return
     *     possible object is
     *     {@link ExtensionsStructure }
     *     
     */
    public ExtensionsStructure getExtensions() {
        return extensions;
    }

    /**
     * Définit la valeur de la propriété extensions.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtensionsStructure }
     *     
     */
    public void setExtensions(ExtensionsStructure value) {
        this.extensions = value;
    }

    public boolean isSetExtensions() {
        return (this.extensions!= null);
    }

}
