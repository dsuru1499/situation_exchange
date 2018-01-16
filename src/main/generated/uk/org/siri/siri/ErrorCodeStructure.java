
package uk.org.siri.siri;

import java.io.Serializable;
import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * Type for Error Code.
 * 
 * <p>Classe Java pour ErrorCodeStructure complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="ErrorCodeStructure">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ErrorText" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="number" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ErrorCodeStructure", propOrder = {
    "errorText"
})
@XmlSeeAlso({
    AllowedResourceUsageExceededErrorStructure.class,
    UnknownEndpointErrorStructure.class,
    CapabilityNotSupportedErrorStructure.class,
    UnknownExtensionsErrorStructure.class,
    UnknownParticipantErrorStructure.class,
    OtherErrorStructure.class,
    BeyondDataHorizonErrorStructure.class,
    EndpointNotAvailableAccessStructure.class,
    AccessNotAllowedErrorStructure.class,
    InvalidDataReferencesErrorStructure.class,
    EndpointDeniedAccessStructure.class,
    UnapprovedKeyAccessStructure.class,
    ServiceNotAvailableErrorStructure.class,
    UnknownSubscriptionErrorStructure.class,
    NoInfoForTopicErrorStructure.class,
    UnknownSubscriberErrorStructure.class,
    ParametersIgnoredErrorStructure.class
})
public class ErrorCodeStructure
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "ErrorText")
    protected String errorText;
    @XmlAttribute(name = "number")
    protected BigInteger number;

    /**
     * Obtient la valeur de la propriété errorText.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getErrorText() {
        return errorText;
    }

    /**
     * Définit la valeur de la propriété errorText.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setErrorText(String value) {
        this.errorText = value;
    }

    public boolean isSetErrorText() {
        return (this.errorText!= null);
    }

    /**
     * Obtient la valeur de la propriété number.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getNumber() {
        return number;
    }

    /**
     * Définit la valeur de la propriété number.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setNumber(BigInteger value) {
        this.number = value;
    }

    public boolean isSetNumber() {
        return (this.number!= null);
    }

}
