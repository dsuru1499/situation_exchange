
package uk.org.siri.siri;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import eu.datex2.schema._2_0rc1._2_0.DirectionEnum;


/**
 * Type for Parameters to filter Situation Exchange Service requests, based on the SITUATION Road, Logically ANDed with other values.
 * 
 * <p>Classe Java pour RoadFilterStructure complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="RoadFilterStructure">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="roadNumber" type="{http://datex2.eu/schema/2_0RC1/2_0}String" minOccurs="0"/>
 *         &lt;element name="directionBound" type="{http://datex2.eu/schema/2_0RC1/2_0}DirectionEnum" minOccurs="0"/>
 *         &lt;element name="referencePointIdentifier" type="{http://datex2.eu/schema/2_0RC1/2_0}String" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RoadFilterStructure", propOrder = {
    "roadNumber",
    "directionBound",
    "referencePointIdentifier"
})
public class RoadFilterStructure
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    protected String roadNumber;
    protected DirectionEnum directionBound;
    protected String referencePointIdentifier;

    /**
     * Obtient la valeur de la propriété roadNumber.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRoadNumber() {
        return roadNumber;
    }

    /**
     * Définit la valeur de la propriété roadNumber.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRoadNumber(String value) {
        this.roadNumber = value;
    }

    public boolean isSetRoadNumber() {
        return (this.roadNumber!= null);
    }

    /**
     * Obtient la valeur de la propriété directionBound.
     * 
     * @return
     *     possible object is
     *     {@link DirectionEnum }
     *     
     */
    public DirectionEnum getDirectionBound() {
        return directionBound;
    }

    /**
     * Définit la valeur de la propriété directionBound.
     * 
     * @param value
     *     allowed object is
     *     {@link DirectionEnum }
     *     
     */
    public void setDirectionBound(DirectionEnum value) {
        this.directionBound = value;
    }

    public boolean isSetDirectionBound() {
        return (this.directionBound!= null);
    }

    /**
     * Obtient la valeur de la propriété referencePointIdentifier.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReferencePointIdentifier() {
        return referencePointIdentifier;
    }

    /**
     * Définit la valeur de la propriété referencePointIdentifier.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReferencePointIdentifier(String value) {
        this.referencePointIdentifier = value;
    }

    public boolean isSetReferencePointIdentifier() {
        return (this.referencePointIdentifier!= null);
    }

}
