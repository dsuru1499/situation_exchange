
package uk.org.siri.siri;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * Type for information about the LINEs affected by a SITUATION.
 * 
 * <p>Classe Java pour OffsetStructure complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="OffsetStructure">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="DistanceFromStart" type="{http://www.w3.org/2001/XMLSchema}unsignedInt" minOccurs="0"/>
 *         &lt;element name="DistanceFromEnd" type="{http://www.w3.org/2001/XMLSchema}unsignedInt" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OffsetStructure", propOrder = {
    "distanceFromStart",
    "distanceFromEnd"
})
public class OffsetStructure
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "DistanceFromStart")
    @XmlSchemaType(name = "unsignedInt")
    protected Long distanceFromStart;
    @XmlElement(name = "DistanceFromEnd")
    @XmlSchemaType(name = "unsignedInt")
    protected Long distanceFromEnd;

    /**
     * Obtient la valeur de la propriété distanceFromStart.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getDistanceFromStart() {
        return distanceFromStart;
    }

    /**
     * Définit la valeur de la propriété distanceFromStart.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setDistanceFromStart(Long value) {
        this.distanceFromStart = value;
    }

    public boolean isSetDistanceFromStart() {
        return (this.distanceFromStart!= null);
    }

    /**
     * Obtient la valeur de la propriété distanceFromEnd.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getDistanceFromEnd() {
        return distanceFromEnd;
    }

    /**
     * Définit la valeur de la propriété distanceFromEnd.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setDistanceFromEnd(Long value) {
        this.distanceFromEnd = value;
    }

    public boolean isSetDistanceFromEnd() {
        return (this.distanceFromEnd!= null);
    }

}
