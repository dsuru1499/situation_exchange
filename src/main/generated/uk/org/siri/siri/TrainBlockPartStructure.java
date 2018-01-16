
package uk.org.siri.siri;

import java.io.Serializable;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * Type for BLOCK part elements of VEHICLE JOURNEY.
 * 
 * <p>Classe Java pour TrainBlockPartStructure complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="TrainBlockPartStructure">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="NumberOfBlockParts" type="{http://www.w3.org/2001/XMLSchema}positiveInteger"/>
 *         &lt;element name="TrainPartRef" type="{http://www.siri.org.uk/siri}TrainPartRefStructure"/>
 *         &lt;element name="PositionOfTrainBlockPart" type="{http://www.siri.org.uk/siri}NaturalLanguageStringStructure" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TrainBlockPartStructure", propOrder = {
    "numberOfBlockParts",
    "trainPartRef",
    "positionOfTrainBlockPart"
})
public class TrainBlockPartStructure
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "NumberOfBlockParts", required = true)
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger numberOfBlockParts;
    @XmlElement(name = "TrainPartRef", required = true)
    protected TrainPartRefStructure trainPartRef;
    @XmlElement(name = "PositionOfTrainBlockPart")
    protected List<NaturalLanguageStringStructure> positionOfTrainBlockPart;

    /**
     * Obtient la valeur de la propriété numberOfBlockParts.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getNumberOfBlockParts() {
        return numberOfBlockParts;
    }

    /**
     * Définit la valeur de la propriété numberOfBlockParts.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setNumberOfBlockParts(BigInteger value) {
        this.numberOfBlockParts = value;
    }

    public boolean isSetNumberOfBlockParts() {
        return (this.numberOfBlockParts!= null);
    }

    /**
     * Obtient la valeur de la propriété trainPartRef.
     * 
     * @return
     *     possible object is
     *     {@link TrainPartRefStructure }
     *     
     */
    public TrainPartRefStructure getTrainPartRef() {
        return trainPartRef;
    }

    /**
     * Définit la valeur de la propriété trainPartRef.
     * 
     * @param value
     *     allowed object is
     *     {@link TrainPartRefStructure }
     *     
     */
    public void setTrainPartRef(TrainPartRefStructure value) {
        this.trainPartRef = value;
    }

    public boolean isSetTrainPartRef() {
        return (this.trainPartRef!= null);
    }

    /**
     * Gets the value of the positionOfTrainBlockPart property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the positionOfTrainBlockPart property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPositionOfTrainBlockPart().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link NaturalLanguageStringStructure }
     * 
     * 
     */
    public List<NaturalLanguageStringStructure> getPositionOfTrainBlockPart() {
        if (positionOfTrainBlockPart == null) {
            positionOfTrainBlockPart = new ArrayList<NaturalLanguageStringStructure>();
        }
        return this.positionOfTrainBlockPart;
    }

    public boolean isSetPositionOfTrainBlockPart() {
        return ((this.positionOfTrainBlockPart!= null)&&(!this.positionOfTrainBlockPart.isEmpty()));
    }

    public void unsetPositionOfTrainBlockPart() {
        this.positionOfTrainBlockPart = null;
    }

}
