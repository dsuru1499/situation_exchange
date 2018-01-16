
package uk.org.siri.siri;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * Type for Service Not Available error.
 * 
 * <p>Classe Java pour ServiceNotAvailableErrorStructure complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="ServiceNotAvailableErrorStructure">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.siri.org.uk/siri}ErrorCodeStructure">
 *       &lt;sequence>
 *         &lt;element name="ExpectedRestartTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ServiceNotAvailableErrorStructure", propOrder = {
    "expectedRestartTime"
})
public class ServiceNotAvailableErrorStructure
    extends ErrorCodeStructure
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "ExpectedRestartTime")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar expectedRestartTime;

    /**
     * Obtient la valeur de la propriété expectedRestartTime.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getExpectedRestartTime() {
        return expectedRestartTime;
    }

    /**
     * Définit la valeur de la propriété expectedRestartTime.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setExpectedRestartTime(XMLGregorianCalendar value) {
        this.expectedRestartTime = value;
    }

    public boolean isSetExpectedRestartTime() {
        return (this.expectedRestartTime!= null);
    }

}
