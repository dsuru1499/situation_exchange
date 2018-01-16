
package uk.org.siri.siri;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Type for DESTINATION and place name.
 * 
 * <p>Classe Java pour AnnotatedDestinationStructure complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="AnnotatedDestinationStructure">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="DestinationRef" type="{http://www.siri.org.uk/siri}DestinationRefStructure"/>
 *         &lt;element name="PlaceName" type="{http://www.siri.org.uk/siri}NaturalLanguageStringStructure" maxOccurs="unbounded"/>
 *         &lt;element name="DirectionRef" type="{http://www.siri.org.uk/siri}DirectionRefStructure" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AnnotatedDestinationStructure", propOrder = {
    "destinationRef",
    "placeName",
    "directionRef"
})
public class AnnotatedDestinationStructure
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "DestinationRef", required = true)
    protected DestinationRefStructure destinationRef;
    @XmlElement(name = "PlaceName", required = true)
    protected List<NaturalLanguageStringStructure> placeName;
    @XmlElement(name = "DirectionRef")
    protected DirectionRefStructure directionRef;

    /**
     * Obtient la valeur de la propriété destinationRef.
     * 
     * @return
     *     possible object is
     *     {@link DestinationRefStructure }
     *     
     */
    public DestinationRefStructure getDestinationRef() {
        return destinationRef;
    }

    /**
     * Définit la valeur de la propriété destinationRef.
     * 
     * @param value
     *     allowed object is
     *     {@link DestinationRefStructure }
     *     
     */
    public void setDestinationRef(DestinationRefStructure value) {
        this.destinationRef = value;
    }

    public boolean isSetDestinationRef() {
        return (this.destinationRef!= null);
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
     * {@link NaturalLanguageStringStructure }
     * 
     * 
     */
    public List<NaturalLanguageStringStructure> getPlaceName() {
        if (placeName == null) {
            placeName = new ArrayList<NaturalLanguageStringStructure>();
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
     * Obtient la valeur de la propriété directionRef.
     * 
     * @return
     *     possible object is
     *     {@link DirectionRefStructure }
     *     
     */
    public DirectionRefStructure getDirectionRef() {
        return directionRef;
    }

    /**
     * Définit la valeur de la propriété directionRef.
     * 
     * @param value
     *     allowed object is
     *     {@link DirectionRefStructure }
     *     
     */
    public void setDirectionRef(DirectionRefStructure value) {
        this.directionRef = value;
    }

    public boolean isSetDirectionRef() {
        return (this.directionRef!= null);
    }

}
