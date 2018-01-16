
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
 * General Type for General SIRI Response.
 * 
 * <p>Classe Java pour ResponseStructure complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="ResponseStructure">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.siri.org.uk/siri}ResponseTimestamp"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ResponseStructure", propOrder = {
    "responseTimestamp"
})
@XmlSeeAlso({
    AbstractServiceDeliveryStructure.class,
    CheckStatusResponseStructure.class,
    AbstractDiscoveryDeliveryStructure.class,
    StatusResponseStructure.class,
    AbstractServiceCapabilitiesResponseStructure.class,
    ConsumerResponseEndpointStructure.class,
    ProducerResponseEndpointStructure.class,
    ResponseEndpointStructure.class,
    ProducerResponseStructure.class
})
public abstract class ResponseStructure
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "ResponseTimestamp", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar responseTimestamp;

    /**
     * Obtient la valeur de la propriété responseTimestamp.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getResponseTimestamp() {
        return responseTimestamp;
    }

    /**
     * Définit la valeur de la propriété responseTimestamp.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setResponseTimestamp(XMLGregorianCalendar value) {
        this.responseTimestamp = value;
    }

    public boolean isSetResponseTimestamp() {
        return (this.responseTimestamp!= null);
    }

}
