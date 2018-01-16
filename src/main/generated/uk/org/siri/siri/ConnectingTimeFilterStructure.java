
package uk.org.siri.siri;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * Type for time filter for connecting journeys.
 * 
 * <p>Classe Java pour ConnectingTimeFilterStructure complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="ConnectingTimeFilterStructure">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="LineRef" type="{http://www.siri.org.uk/siri}LineRefStructure"/>
 *         &lt;element name="DirectionRef" type="{http://www.siri.org.uk/siri}DirectionRefStructure"/>
 *         &lt;element name="EarliestArrivalTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="LatestArrivalTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ConnectingTimeFilterStructure", propOrder = {
    "lineRef",
    "directionRef",
    "earliestArrivalTime",
    "latestArrivalTime"
})
public class ConnectingTimeFilterStructure
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "LineRef", required = true)
    protected LineRefStructure lineRef;
    @XmlElement(name = "DirectionRef", required = true)
    protected DirectionRefStructure directionRef;
    @XmlElement(name = "EarliestArrivalTime")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar earliestArrivalTime;
    @XmlElement(name = "LatestArrivalTime")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar latestArrivalTime;

    /**
     * Obtient la valeur de la propriété lineRef.
     * 
     * @return
     *     possible object is
     *     {@link LineRefStructure }
     *     
     */
    public LineRefStructure getLineRef() {
        return lineRef;
    }

    /**
     * Définit la valeur de la propriété lineRef.
     * 
     * @param value
     *     allowed object is
     *     {@link LineRefStructure }
     *     
     */
    public void setLineRef(LineRefStructure value) {
        this.lineRef = value;
    }

    public boolean isSetLineRef() {
        return (this.lineRef!= null);
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

    /**
     * Obtient la valeur de la propriété earliestArrivalTime.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getEarliestArrivalTime() {
        return earliestArrivalTime;
    }

    /**
     * Définit la valeur de la propriété earliestArrivalTime.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setEarliestArrivalTime(XMLGregorianCalendar value) {
        this.earliestArrivalTime = value;
    }

    public boolean isSetEarliestArrivalTime() {
        return (this.earliestArrivalTime!= null);
    }

    /**
     * Obtient la valeur de la propriété latestArrivalTime.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getLatestArrivalTime() {
        return latestArrivalTime;
    }

    /**
     * Définit la valeur de la propriété latestArrivalTime.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setLatestArrivalTime(XMLGregorianCalendar value) {
        this.latestArrivalTime = value;
    }

    public boolean isSetLatestArrivalTime() {
        return (this.latestArrivalTime!= null);
    }

}
