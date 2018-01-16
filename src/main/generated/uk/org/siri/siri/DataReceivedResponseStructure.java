
package uk.org.siri.siri;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Type for Data received Acknowledgement Response.
 * 
 * <p>Classe Java pour DataReceivedResponseStructure complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="DataReceivedResponseStructure">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.siri.org.uk/siri}ConsumerResponseEndpointStructure">
 *       &lt;sequence>
 *         &lt;group ref="{http://www.siri.org.uk/siri}DataReceivedPayloadGroup"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DataReceivedResponseStructure", propOrder = {
    "status",
    "errorCondition"
})
public class DataReceivedResponseStructure
    extends ConsumerResponseEndpointStructure
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "Status", defaultValue = "true")
    protected boolean status;
    @XmlElement(name = "ErrorCondition")
    protected DataReceivedResponseStructure.ErrorCondition errorCondition;

    /**
     * Obtient la valeur de la propriété status.
     * 
     */
    public boolean isStatus() {
        return status;
    }

    /**
     * Définit la valeur de la propriété status.
     * 
     */
    public void setStatus(boolean value) {
        this.status = value;
    }

    public boolean isSetStatus() {
        return true;
    }

    /**
     * Obtient la valeur de la propriété errorCondition.
     * 
     * @return
     *     possible object is
     *     {@link DataReceivedResponseStructure.ErrorCondition }
     *     
     */
    public DataReceivedResponseStructure.ErrorCondition getErrorCondition() {
        return errorCondition;
    }

    /**
     * Définit la valeur de la propriété errorCondition.
     * 
     * @param value
     *     allowed object is
     *     {@link DataReceivedResponseStructure.ErrorCondition }
     *     
     */
    public void setErrorCondition(DataReceivedResponseStructure.ErrorCondition value) {
        this.errorCondition = value;
    }

    public boolean isSetErrorCondition() {
        return (this.errorCondition!= null);
    }


    /**
     * <p>Classe Java pour anonymous complex type.
     * 
     * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;choice>
     *           &lt;element ref="{http://www.siri.org.uk/siri}UnknownSubscriptionError"/>
     *           &lt;element ref="{http://www.siri.org.uk/siri}OtherError"/>
     *         &lt;/choice>
     *         &lt;sequence>
     *           &lt;element name="Description" type="{http://www.siri.org.uk/siri}ErrorDescriptionStructure" minOccurs="0"/>
     *         &lt;/sequence>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "unknownSubscriptionError",
        "otherError",
        "description"
    })
    public static class ErrorCondition
        implements Serializable
    {

        private final static long serialVersionUID = 1L;
        @XmlElement(name = "UnknownSubscriptionError")
        protected UnknownSubscriptionErrorStructure unknownSubscriptionError;
        @XmlElement(name = "OtherError")
        protected OtherErrorStructure otherError;
        @XmlElement(name = "Description")
        protected ErrorDescriptionStructure description;

        /**
         * Obtient la valeur de la propriété unknownSubscriptionError.
         * 
         * @return
         *     possible object is
         *     {@link UnknownSubscriptionErrorStructure }
         *     
         */
        public UnknownSubscriptionErrorStructure getUnknownSubscriptionError() {
            return unknownSubscriptionError;
        }

        /**
         * Définit la valeur de la propriété unknownSubscriptionError.
         * 
         * @param value
         *     allowed object is
         *     {@link UnknownSubscriptionErrorStructure }
         *     
         */
        public void setUnknownSubscriptionError(UnknownSubscriptionErrorStructure value) {
            this.unknownSubscriptionError = value;
        }

        public boolean isSetUnknownSubscriptionError() {
            return (this.unknownSubscriptionError!= null);
        }

        /**
         * Obtient la valeur de la propriété otherError.
         * 
         * @return
         *     possible object is
         *     {@link OtherErrorStructure }
         *     
         */
        public OtherErrorStructure getOtherError() {
            return otherError;
        }

        /**
         * Définit la valeur de la propriété otherError.
         * 
         * @param value
         *     allowed object is
         *     {@link OtherErrorStructure }
         *     
         */
        public void setOtherError(OtherErrorStructure value) {
            this.otherError = value;
        }

        public boolean isSetOtherError() {
            return (this.otherError!= null);
        }

        /**
         * Obtient la valeur de la propriété description.
         * 
         * @return
         *     possible object is
         *     {@link ErrorDescriptionStructure }
         *     
         */
        public ErrorDescriptionStructure getDescription() {
            return description;
        }

        /**
         * Définit la valeur de la propriété description.
         * 
         * @param value
         *     allowed object is
         *     {@link ErrorDescriptionStructure }
         *     
         */
        public void setDescription(ErrorDescriptionStructure value) {
            this.description = value;
        }

        public boolean isSetDescription() {
            return (this.description!= null);
        }

    }

}
