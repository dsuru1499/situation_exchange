
package uk.org.siri.siri;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * Type for an Activity.
 * 
 * <p>Classe Java pour AbstractItemStructure complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="AbstractItemStructure">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="RecordedAtTime" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AbstractItemStructure", propOrder = {
    "recordedAtTime"
})
@XmlSeeAlso({
    DatedTimetableVersionFrameStructure.class,
    ServiceExceptionStructure.class,
    AbstractRequiredReferencingItemStructure.class,
    AbstractIdentifiedItemStructure.class,
    AbstractRequiredIdentifiedItemStructure.class,
    EstimatedVersionFrameStructure.class,
    AbstractDistributorItemStructure.class,
    AbstractReferencingItemStructure.class
})
public abstract class AbstractItemStructure
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "RecordedAtTime", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar recordedAtTime;

    /**
     * Obtient la valeur de la propriété recordedAtTime.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getRecordedAtTime() {
        return recordedAtTime;
    }

    /**
     * Définit la valeur de la propriété recordedAtTime.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setRecordedAtTime(XMLGregorianCalendar value) {
        this.recordedAtTime = value;
    }

    public boolean isSetRecordedAtTime() {
        return (this.recordedAtTime!= null);
    }

}
