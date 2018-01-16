
package uk.org.siri.siri;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Type for Error: Unknown Endpoint +SIRI v2.0
 * 
 * <p>Classe Java pour UnknownEndpointErrorStructure complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="UnknownEndpointErrorStructure">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.siri.org.uk/siri}ErrorCodeStructure">
 *       &lt;sequence>
 *         &lt;element name="Endpoint" type="{http://www.siri.org.uk/siri}EndpointAddress" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UnknownEndpointErrorStructure", propOrder = {
    "endpoint"
})
public class UnknownEndpointErrorStructure
    extends ErrorCodeStructure
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "Endpoint")
    protected String endpoint;

    /**
     * Obtient la valeur de la propriété endpoint.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEndpoint() {
        return endpoint;
    }

    /**
     * Définit la valeur de la propriété endpoint.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEndpoint(String value) {
        this.endpoint = value;
    }

    public boolean isSetEndpoint() {
        return (this.endpoint!= null);
    }

}
