
package uk.org.siri.siri;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Type for RequestErrorCondition.
 * 
 * <p>Classe Java pour ErrorConditionStructure complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="ErrorConditionStructure">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;choice>
 *           &lt;group ref="{http://www.siri.org.uk/siri}ApplicationErrorGroup"/>
 *         &lt;/choice>
 *         &lt;element name="Description" type="{http://www.siri.org.uk/siri}NaturalLanguageStringStructure" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ErrorConditionStructure", propOrder = {
    "serviceNotAvailableError",
    "capabilityNotSupportedError",
    "accessNotAllowedError",
    "invalidDataReferencesError",
    "beyondDataHorizon",
    "noInfoForTopicError",
    "parametersIgnoredError",
    "unknownExtensionsError",
    "allowedResourceUsageExceededError",
    "otherError",
    "description"
})
public class ErrorConditionStructure
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "ServiceNotAvailableError")
    protected ServiceNotAvailableErrorStructure serviceNotAvailableError;
    @XmlElement(name = "CapabilityNotSupportedError")
    protected CapabilityNotSupportedErrorStructure capabilityNotSupportedError;
    @XmlElement(name = "AccessNotAllowedError")
    protected AccessNotAllowedErrorStructure accessNotAllowedError;
    @XmlElement(name = "InvalidDataReferencesError")
    protected InvalidDataReferencesErrorStructure invalidDataReferencesError;
    @XmlElement(name = "BeyondDataHorizon")
    protected BeyondDataHorizonErrorStructure beyondDataHorizon;
    @XmlElement(name = "NoInfoForTopicError")
    protected NoInfoForTopicErrorStructure noInfoForTopicError;
    @XmlElement(name = "ParametersIgnoredError")
    protected ParametersIgnoredErrorStructure parametersIgnoredError;
    @XmlElement(name = "UnknownExtensionsError")
    protected UnknownExtensionsErrorStructure unknownExtensionsError;
    @XmlElement(name = "AllowedResourceUsageExceededError")
    protected AllowedResourceUsageExceededErrorStructure allowedResourceUsageExceededError;
    @XmlElement(name = "OtherError")
    protected OtherErrorStructure otherError;
    @XmlElement(name = "Description")
    protected NaturalLanguageStringStructure description;

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
     * Obtient la valeur de la propriété capabilityNotSupportedError.
     * 
     * @return
     *     possible object is
     *     {@link CapabilityNotSupportedErrorStructure }
     *     
     */
    public CapabilityNotSupportedErrorStructure getCapabilityNotSupportedError() {
        return capabilityNotSupportedError;
    }

    /**
     * Définit la valeur de la propriété capabilityNotSupportedError.
     * 
     * @param value
     *     allowed object is
     *     {@link CapabilityNotSupportedErrorStructure }
     *     
     */
    public void setCapabilityNotSupportedError(CapabilityNotSupportedErrorStructure value) {
        this.capabilityNotSupportedError = value;
    }

    public boolean isSetCapabilityNotSupportedError() {
        return (this.capabilityNotSupportedError!= null);
    }

    /**
     * Obtient la valeur de la propriété accessNotAllowedError.
     * 
     * @return
     *     possible object is
     *     {@link AccessNotAllowedErrorStructure }
     *     
     */
    public AccessNotAllowedErrorStructure getAccessNotAllowedError() {
        return accessNotAllowedError;
    }

    /**
     * Définit la valeur de la propriété accessNotAllowedError.
     * 
     * @param value
     *     allowed object is
     *     {@link AccessNotAllowedErrorStructure }
     *     
     */
    public void setAccessNotAllowedError(AccessNotAllowedErrorStructure value) {
        this.accessNotAllowedError = value;
    }

    public boolean isSetAccessNotAllowedError() {
        return (this.accessNotAllowedError!= null);
    }

    /**
     * Obtient la valeur de la propriété invalidDataReferencesError.
     * 
     * @return
     *     possible object is
     *     {@link InvalidDataReferencesErrorStructure }
     *     
     */
    public InvalidDataReferencesErrorStructure getInvalidDataReferencesError() {
        return invalidDataReferencesError;
    }

    /**
     * Définit la valeur de la propriété invalidDataReferencesError.
     * 
     * @param value
     *     allowed object is
     *     {@link InvalidDataReferencesErrorStructure }
     *     
     */
    public void setInvalidDataReferencesError(InvalidDataReferencesErrorStructure value) {
        this.invalidDataReferencesError = value;
    }

    public boolean isSetInvalidDataReferencesError() {
        return (this.invalidDataReferencesError!= null);
    }

    /**
     * Error: Data period or subscription period is outside of period covered by service.   +SIRI v2.0.
     * 
     * @return
     *     possible object is
     *     {@link BeyondDataHorizonErrorStructure }
     *     
     */
    public BeyondDataHorizonErrorStructure getBeyondDataHorizon() {
        return beyondDataHorizon;
    }

    /**
     * Définit la valeur de la propriété beyondDataHorizon.
     * 
     * @param value
     *     allowed object is
     *     {@link BeyondDataHorizonErrorStructure }
     *     
     */
    public void setBeyondDataHorizon(BeyondDataHorizonErrorStructure value) {
        this.beyondDataHorizon = value;
    }

    public boolean isSetBeyondDataHorizon() {
        return (this.beyondDataHorizon!= null);
    }

    /**
     * Obtient la valeur de la propriété noInfoForTopicError.
     * 
     * @return
     *     possible object is
     *     {@link NoInfoForTopicErrorStructure }
     *     
     */
    public NoInfoForTopicErrorStructure getNoInfoForTopicError() {
        return noInfoForTopicError;
    }

    /**
     * Définit la valeur de la propriété noInfoForTopicError.
     * 
     * @param value
     *     allowed object is
     *     {@link NoInfoForTopicErrorStructure }
     *     
     */
    public void setNoInfoForTopicError(NoInfoForTopicErrorStructure value) {
        this.noInfoForTopicError = value;
    }

    public boolean isSetNoInfoForTopicError() {
        return (this.noInfoForTopicError!= null);
    }

    /**
     * Obtient la valeur de la propriété parametersIgnoredError.
     * 
     * @return
     *     possible object is
     *     {@link ParametersIgnoredErrorStructure }
     *     
     */
    public ParametersIgnoredErrorStructure getParametersIgnoredError() {
        return parametersIgnoredError;
    }

    /**
     * Définit la valeur de la propriété parametersIgnoredError.
     * 
     * @param value
     *     allowed object is
     *     {@link ParametersIgnoredErrorStructure }
     *     
     */
    public void setParametersIgnoredError(ParametersIgnoredErrorStructure value) {
        this.parametersIgnoredError = value;
    }

    public boolean isSetParametersIgnoredError() {
        return (this.parametersIgnoredError!= null);
    }

    /**
     * Error: Request contained extensions that were not supported by the producer. A response has been provided but some or all extensions have been ignored.  +SIRI v2.0.
     * 
     * @return
     *     possible object is
     *     {@link UnknownExtensionsErrorStructure }
     *     
     */
    public UnknownExtensionsErrorStructure getUnknownExtensionsError() {
        return unknownExtensionsError;
    }

    /**
     * Définit la valeur de la propriété unknownExtensionsError.
     * 
     * @param value
     *     allowed object is
     *     {@link UnknownExtensionsErrorStructure }
     *     
     */
    public void setUnknownExtensionsError(UnknownExtensionsErrorStructure value) {
        this.unknownExtensionsError = value;
    }

    public boolean isSetUnknownExtensionsError() {
        return (this.unknownExtensionsError!= null);
    }

    /**
     * Obtient la valeur de la propriété allowedResourceUsageExceededError.
     * 
     * @return
     *     possible object is
     *     {@link AllowedResourceUsageExceededErrorStructure }
     *     
     */
    public AllowedResourceUsageExceededErrorStructure getAllowedResourceUsageExceededError() {
        return allowedResourceUsageExceededError;
    }

    /**
     * Définit la valeur de la propriété allowedResourceUsageExceededError.
     * 
     * @param value
     *     allowed object is
     *     {@link AllowedResourceUsageExceededErrorStructure }
     *     
     */
    public void setAllowedResourceUsageExceededError(AllowedResourceUsageExceededErrorStructure value) {
        this.allowedResourceUsageExceededError = value;
    }

    public boolean isSetAllowedResourceUsageExceededError() {
        return (this.allowedResourceUsageExceededError!= null);
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
     *     {@link NaturalLanguageStringStructure }
     *     
     */
    public NaturalLanguageStringStructure getDescription() {
        return description;
    }

    /**
     * Définit la valeur de la propriété description.
     * 
     * @param value
     *     allowed object is
     *     {@link NaturalLanguageStringStructure }
     *     
     */
    public void setDescription(NaturalLanguageStringStructure value) {
        this.description = value;
    }

    public boolean isSetDescription() {
        return (this.description!= null);
    }

}
