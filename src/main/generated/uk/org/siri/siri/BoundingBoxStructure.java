
package uk.org.siri.siri;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Defines a bounding box using two corner points. GML terminology.  +SIRI v2.0
 * 
 * <p>Classe Java pour BoundingBoxStructure complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="BoundingBoxStructure">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="UpperLeft" type="{http://www.siri.org.uk/siri}LocationStructure"/>
 *         &lt;element name="LowerRight" type="{http://www.siri.org.uk/siri}LocationStructure"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BoundingBoxStructure", propOrder = {
    "upperLeft",
    "lowerRight"
})
public class BoundingBoxStructure
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "UpperLeft", required = true)
    protected LocationStructure upperLeft;
    @XmlElement(name = "LowerRight", required = true)
    protected LocationStructure lowerRight;

    /**
     * Obtient la valeur de la propriété upperLeft.
     * 
     * @return
     *     possible object is
     *     {@link LocationStructure }
     *     
     */
    public LocationStructure getUpperLeft() {
        return upperLeft;
    }

    /**
     * Définit la valeur de la propriété upperLeft.
     * 
     * @param value
     *     allowed object is
     *     {@link LocationStructure }
     *     
     */
    public void setUpperLeft(LocationStructure value) {
        this.upperLeft = value;
    }

    public boolean isSetUpperLeft() {
        return (this.upperLeft!= null);
    }

    /**
     * Obtient la valeur de la propriété lowerRight.
     * 
     * @return
     *     possible object is
     *     {@link LocationStructure }
     *     
     */
    public LocationStructure getLowerRight() {
        return lowerRight;
    }

    /**
     * Définit la valeur de la propriété lowerRight.
     * 
     * @param value
     *     allowed object is
     *     {@link LocationStructure }
     *     
     */
    public void setLowerRight(LocationStructure value) {
        this.lowerRight = value;
    }

    public boolean isSetLowerRight() {
        return (this.lowerRight!= null);
    }

}
