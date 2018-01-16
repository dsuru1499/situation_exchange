
package uk.org.siri.siri;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * Names of VIA points, used to help identify the LINE, for example, Luton to Luton via Sutton. Currently 3 in VDV. Should only be included if the detail level was requested.
 * 
 * <p>Classe Java pour PlaceNameStructure complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="PlaceNameStructure">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="PlaceRef" type="{http://www.siri.org.uk/siri}JourneyPlaceRefStructure" minOccurs="0"/>
 *         &lt;element name="PlaceName" type="{http://www.siri.org.uk/siri}NaturalLanguagePlaceNameStructure" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="PlaceShortName" type="{http://www.siri.org.uk/siri}NaturalLanguagePlaceNameStructure" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PlaceNameStructure", propOrder = {
    "placeRef",
    "placeName",
    "placeShortName"
})
@XmlSeeAlso({
    ViaNameStructure.class
})
public class PlaceNameStructure
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "PlaceRef")
    protected JourneyPlaceRefStructure placeRef;
    @XmlElement(name = "PlaceName")
    protected List<NaturalLanguagePlaceNameStructure> placeName;
    @XmlElement(name = "PlaceShortName")
    protected List<NaturalLanguagePlaceNameStructure> placeShortName;

    /**
     * Obtient la valeur de la propriété placeRef.
     * 
     * @return
     *     possible object is
     *     {@link JourneyPlaceRefStructure }
     *     
     */
    public JourneyPlaceRefStructure getPlaceRef() {
        return placeRef;
    }

    /**
     * Définit la valeur de la propriété placeRef.
     * 
     * @param value
     *     allowed object is
     *     {@link JourneyPlaceRefStructure }
     *     
     */
    public void setPlaceRef(JourneyPlaceRefStructure value) {
        this.placeRef = value;
    }

    public boolean isSetPlaceRef() {
        return (this.placeRef!= null);
    }

    /**
     * Gets the value of the placeName property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the placeName property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPlaceName().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link NaturalLanguagePlaceNameStructure }
     * 
     * 
     */
    public List<NaturalLanguagePlaceNameStructure> getPlaceName() {
        if (placeName == null) {
            placeName = new ArrayList<NaturalLanguagePlaceNameStructure>();
        }
        return this.placeName;
    }

    public boolean isSetPlaceName() {
        return ((this.placeName!= null)&&(!this.placeName.isEmpty()));
    }

    public void unsetPlaceName() {
        this.placeName = null;
    }

    /**
     * Gets the value of the placeShortName property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the placeShortName property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPlaceShortName().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link NaturalLanguagePlaceNameStructure }
     * 
     * 
     */
    public List<NaturalLanguagePlaceNameStructure> getPlaceShortName() {
        if (placeShortName == null) {
            placeShortName = new ArrayList<NaturalLanguagePlaceNameStructure>();
        }
        return this.placeShortName;
    }

    public boolean isSetPlaceShortName() {
        return ((this.placeShortName!= null)&&(!this.placeShortName.isEmpty()));
    }

    public void unsetPlaceShortName() {
        this.placeShortName = null;
    }

}
