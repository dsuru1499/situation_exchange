
package uk.org.siri.siri;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.Duration;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * Same as CheckStatusResponseStructure, but without extension to be consistent with the other operation definition.
 * 
 * <p>Classe Java pour CheckStatusResponseBodyStructure complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="CheckStatusResponseBodyStructure">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;group ref="{http://www.siri.org.uk/siri}CheckStatusPayloadGroup"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CheckStatusResponseBodyStructure", propOrder = {
    "status",
    "dataReady",
    "errorCondition",
    "validUntil",
    "shortestPossibleCycle",
    "serviceStartedTime"
})
public class CheckStatusResponseBodyStructure
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "Status", defaultValue = "true")
    protected Boolean status;
    @XmlElement(name = "DataReady")
    protected Boolean dataReady;
    @XmlElement(name = "ErrorCondition")
    protected CheckStatusResponseBodyStructure.ErrorCondition errorCondition;
    @XmlElement(name = "ValidUntil")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar validUntil;
    @XmlElement(name = "ShortestPossibleCycle")
    protected Duration shortestPossibleCycle;
    @XmlElement(name = "ServiceStartedTime")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar serviceStartedTime;

    /**
     * Obtient la valeur de la propriété status.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isStatus() {
        return status;
    }

    /**
     * Définit la valeur de la propriété status.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setStatus(Boolean value) {
        this.status = value;
    }

    public boolean isSetStatus() {
        return (this.status!= null);
    }

    /**
     * Obtient la valeur de la propriété dataReady.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isDataReady() {
        return dataReady;
    }

    /**
     * Définit la valeur de la propriété dataReady.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDataReady(Boolean value) {
        this.dataReady = value;
    }

    public boolean isSetDataReady() {
        return (this.dataReady!= null);
    }

    /**
     * Obtient la valeur de la propriété errorCondition.
     * 
     * @return
     *     possible object is
     *     {@link CheckStatusResponseBodyStructure.ErrorCondition }
     *     
     */
    public CheckStatusResponseBodyStructure.ErrorCondition getErrorCondition() {
        return errorCondition;
    }

    /**
     * Définit la valeur de la propriété errorCondition.
     * 
     * @param value
     *     allowed object is
     *     {@link CheckStatusResponseBodyStructure.ErrorCondition }
     *     
     */
    public void setErrorCondition(CheckStatusResponseBodyStructure.ErrorCondition value) {
        this.errorCondition = value;
    }

    public boolean isSetErrorCondition() {
        return (this.errorCondition!= null);
    }

    /**
     * Obtient la valeur de la propriété validUntil.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getValidUntil() {
        return validUntil;
    }

    /**
     * Définit la valeur de la propriété validUntil.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setValidUntil(XMLGregorianCalendar value) {
        this.validUntil = value;
    }

    public boolean isSetValidUntil() {
        return (this.validUntil!= null);
    }

    /**
     * Obtient la valeur de la propriété shortestPossibleCycle.
     * 
     * @return
     *     possible object is
     *     {@link Duration }
     *     
     */
    public Duration getShortestPossibleCycle() {
        return shortestPossibleCycle;
    }

    /**
     * Définit la valeur de la propriété shortestPossibleCycle.
     * 
     * @param value
     *     allowed object is
     *     {@link Duration }
     *     
     */
    public void setShortestPossibleCycle(Duration value) {
        this.shortestPossibleCycle = value;
    }

    public boolean isSetShortestPossibleCycle() {
        return (this.shortestPossibleCycle!= null);
    }

    /**
     * Obtient la valeur de la propriété serviceStartedTime.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getServiceStartedTime() {
        return serviceStartedTime;
    }

    /**
     * Définit la valeur de la propriété serviceStartedTime.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setServiceStartedTime(XMLGregorianCalendar value) {
        this.serviceStartedTime = value;
    }

    public boolean isSetServiceStartedTime() {
        return (this.serviceStartedTime!= null);
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
     *           &lt;element ref="{http://www.siri.org.uk/siri}ServiceNotAvailableError"/>
     *           &lt;element ref="{http://www.siri.org.uk/siri}OtherError"/>
     *         &lt;/choice>
     *         &lt;element name="Description" type="{http://www.siri.org.uk/siri}ErrorDescriptionStructure" minOccurs="0"/>
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
        "serviceNotAvailableError",
        "otherError",
        "description"
    })
    public static class ErrorCondition
        implements Serializable
    {

        private final static long serialVersionUID = 1L;
        @XmlElement(name = "ServiceNotAvailableError")
        protected ServiceNotAvailableErrorStructure serviceNotAvailableError;
        @XmlElement(name = "OtherError")
        protected OtherErrorStructure otherError;
        @XmlElement(name = "Description")
        protected ErrorDescriptionStructure description;

        /**
         * Obtient la valeur de la propriété serviceNotAvailableError.
         * 
         * @return
         *     possible object is
         *     {@link ServiceNotAvailableErrorStructure }
         *     
         */
        public ServiceNotAvailableErrorStructure getServiceNotAvailableError() {
            return serviceNotAvailableError;
        }

        /**
         * Définit la valeur de la propriété serviceNotAvailableError.
         * 
         * @param value
         *     allowed object is
         *     {@link ServiceNotAvailableErrorStructure }
         *     
         */
        public void setServiceNotAvailableError(ServiceNotAvailableErrorStructure value) {
            this.serviceNotAvailableError = value;
        }

        public boolean isSetServiceNotAvailableError() {
            return (this.serviceNotAvailableError!= null);
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
