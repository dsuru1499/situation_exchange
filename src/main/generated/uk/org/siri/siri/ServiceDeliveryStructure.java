
package uk.org.siri.siri;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * Type for SIRI Service Delivery.
 * 
 * <p>Classe Java pour ServiceDeliveryStructure complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="ServiceDeliveryStructure">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.siri.org.uk/siri}ProducerResponseStructure">
 *       &lt;sequence>
 *         &lt;group ref="{http://www.siri.org.uk/siri}ServiceDeliveryBodyGroup"/>
 *       &lt;/sequence>
 *       &lt;attribute name="srsName" type="{http://www.siri.org.uk/siri}SrsNameType" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ServiceDeliveryStructure", propOrder = {
    "status",
    "errorCondition",
    "moreData",
    "includedSituationExchangeDelivery",
    "productionTimetableDelivery",
    "estimatedTimetableDelivery",
    "stopTimetableDelivery",
    "stopMonitoringDelivery",
    "vehicleMonitoringDelivery",
    "connectionTimetableDelivery",
    "connectionMonitoringFeederDelivery",
    "connectionMonitoringDistributorDelivery",
    "generalMessageDelivery",
    "facilityMonitoringDelivery",
    "situationExchangeDelivery"
})
@XmlSeeAlso({
    ServiceDelivery.class
})
public class ServiceDeliveryStructure
    extends ProducerResponseStructure
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "Status", defaultValue = "true")
    protected Boolean status;
    @XmlElement(name = "ErrorCondition")
    protected ServiceDeliveryStructure.ErrorCondition errorCondition;
    @XmlElement(name = "MoreData", defaultValue = "false")
    protected Boolean moreData;
    @XmlElement(name = "IncludedSituationExchangeDelivery")
    protected List<SituationExchangeDeliveryStructure> includedSituationExchangeDelivery;
    @XmlElement(name = "ProductionTimetableDelivery")
    protected List<ProductionTimetableDeliveryStructure> productionTimetableDelivery;
    @XmlElement(name = "EstimatedTimetableDelivery")
    protected List<EstimatedTimetableDeliveryStructure> estimatedTimetableDelivery;
    @XmlElement(name = "StopTimetableDelivery")
    protected List<StopTimetableDeliveryStructure> stopTimetableDelivery;
    @XmlElement(name = "StopMonitoringDelivery")
    protected List<StopMonitoringDeliveryStructure> stopMonitoringDelivery;
    @XmlElement(name = "VehicleMonitoringDelivery")
    protected List<VehicleMonitoringDeliveryStructure> vehicleMonitoringDelivery;
    @XmlElement(name = "ConnectionTimetableDelivery")
    protected List<ConnectionTimetableDeliveryStructure> connectionTimetableDelivery;
    @XmlElement(name = "ConnectionMonitoringFeederDelivery")
    protected List<ConnectionMonitoringFeederDeliveryStructure> connectionMonitoringFeederDelivery;
    @XmlElement(name = "ConnectionMonitoringDistributorDelivery")
    protected List<ConnectionMonitoringDistributorDeliveryStructure> connectionMonitoringDistributorDelivery;
    @XmlElement(name = "GeneralMessageDelivery")
    protected List<GeneralMessageDeliveryStructure> generalMessageDelivery;
    @XmlElement(name = "FacilityMonitoringDelivery")
    protected List<FacilityMonitoringDeliveryStructure> facilityMonitoringDelivery;
    @XmlElement(name = "SituationExchangeDelivery")
    protected List<SituationExchangeDeliveryStructure> situationExchangeDelivery;
    @XmlAttribute(name = "srsName")
    protected String srsName;

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
     * Obtient la valeur de la propriété errorCondition.
     * 
     * @return
     *     possible object is
     *     {@link ServiceDeliveryStructure.ErrorCondition }
     *     
     */
    public ServiceDeliveryStructure.ErrorCondition getErrorCondition() {
        return errorCondition;
    }

    /**
     * Définit la valeur de la propriété errorCondition.
     * 
     * @param value
     *     allowed object is
     *     {@link ServiceDeliveryStructure.ErrorCondition }
     *     
     */
    public void setErrorCondition(ServiceDeliveryStructure.ErrorCondition value) {
        this.errorCondition = value;
    }

    public boolean isSetErrorCondition() {
        return (this.errorCondition!= null);
    }

    /**
     * Obtient la valeur de la propriété moreData.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMoreData() {
        return moreData;
    }

    /**
     * Définit la valeur de la propriété moreData.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMoreData(Boolean value) {
        this.moreData = value;
    }

    public boolean isSetMoreData() {
        return (this.moreData!= null);
    }

    /**
     * Gets the value of the includedSituationExchangeDelivery property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the includedSituationExchangeDelivery property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getIncludedSituationExchangeDelivery().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SituationExchangeDeliveryStructure }
     * 
     * 
     */
    public List<SituationExchangeDeliveryStructure> getIncludedSituationExchangeDelivery() {
        if (includedSituationExchangeDelivery == null) {
            includedSituationExchangeDelivery = new ArrayList<SituationExchangeDeliveryStructure>();
        }
        return this.includedSituationExchangeDelivery;
    }

    public boolean isSetIncludedSituationExchangeDelivery() {
        return ((this.includedSituationExchangeDelivery!= null)&&(!this.includedSituationExchangeDelivery.isEmpty()));
    }

    public void unsetIncludedSituationExchangeDelivery() {
        this.includedSituationExchangeDelivery = null;
    }

    /**
     * Gets the value of the productionTimetableDelivery property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the productionTimetableDelivery property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getProductionTimetableDelivery().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ProductionTimetableDeliveryStructure }
     * 
     * 
     */
    public List<ProductionTimetableDeliveryStructure> getProductionTimetableDelivery() {
        if (productionTimetableDelivery == null) {
            productionTimetableDelivery = new ArrayList<ProductionTimetableDeliveryStructure>();
        }
        return this.productionTimetableDelivery;
    }

    public boolean isSetProductionTimetableDelivery() {
        return ((this.productionTimetableDelivery!= null)&&(!this.productionTimetableDelivery.isEmpty()));
    }

    public void unsetProductionTimetableDelivery() {
        this.productionTimetableDelivery = null;
    }

    /**
     * Gets the value of the estimatedTimetableDelivery property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the estimatedTimetableDelivery property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEstimatedTimetableDelivery().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link EstimatedTimetableDeliveryStructure }
     * 
     * 
     */
    public List<EstimatedTimetableDeliveryStructure> getEstimatedTimetableDelivery() {
        if (estimatedTimetableDelivery == null) {
            estimatedTimetableDelivery = new ArrayList<EstimatedTimetableDeliveryStructure>();
        }
        return this.estimatedTimetableDelivery;
    }

    public boolean isSetEstimatedTimetableDelivery() {
        return ((this.estimatedTimetableDelivery!= null)&&(!this.estimatedTimetableDelivery.isEmpty()));
    }

    public void unsetEstimatedTimetableDelivery() {
        this.estimatedTimetableDelivery = null;
    }

    /**
     * Gets the value of the stopTimetableDelivery property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the stopTimetableDelivery property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getStopTimetableDelivery().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link StopTimetableDeliveryStructure }
     * 
     * 
     */
    public List<StopTimetableDeliveryStructure> getStopTimetableDelivery() {
        if (stopTimetableDelivery == null) {
            stopTimetableDelivery = new ArrayList<StopTimetableDeliveryStructure>();
        }
        return this.stopTimetableDelivery;
    }

    public boolean isSetStopTimetableDelivery() {
        return ((this.stopTimetableDelivery!= null)&&(!this.stopTimetableDelivery.isEmpty()));
    }

    public void unsetStopTimetableDelivery() {
        this.stopTimetableDelivery = null;
    }

    /**
     * Delviery for Stop Event service.Gets the value of the stopMonitoringDelivery property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the stopMonitoringDelivery property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getStopMonitoringDelivery().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link StopMonitoringDeliveryStructure }
     * 
     * 
     */
    public List<StopMonitoringDeliveryStructure> getStopMonitoringDelivery() {
        if (stopMonitoringDelivery == null) {
            stopMonitoringDelivery = new ArrayList<StopMonitoringDeliveryStructure>();
        }
        return this.stopMonitoringDelivery;
    }

    public boolean isSetStopMonitoringDelivery() {
        return ((this.stopMonitoringDelivery!= null)&&(!this.stopMonitoringDelivery.isEmpty()));
    }

    public void unsetStopMonitoringDelivery() {
        this.stopMonitoringDelivery = null;
    }

    /**
     * Delviery for Vehicle Activity Service.Gets the value of the vehicleMonitoringDelivery property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the vehicleMonitoringDelivery property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getVehicleMonitoringDelivery().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link VehicleMonitoringDeliveryStructure }
     * 
     * 
     */
    public List<VehicleMonitoringDeliveryStructure> getVehicleMonitoringDelivery() {
        if (vehicleMonitoringDelivery == null) {
            vehicleMonitoringDelivery = new ArrayList<VehicleMonitoringDeliveryStructure>();
        }
        return this.vehicleMonitoringDelivery;
    }

    public boolean isSetVehicleMonitoringDelivery() {
        return ((this.vehicleMonitoringDelivery!= null)&&(!this.vehicleMonitoringDelivery.isEmpty()));
    }

    public void unsetVehicleMonitoringDelivery() {
        this.vehicleMonitoringDelivery = null;
    }

    /**
     * Gets the value of the connectionTimetableDelivery property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the connectionTimetableDelivery property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getConnectionTimetableDelivery().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ConnectionTimetableDeliveryStructure }
     * 
     * 
     */
    public List<ConnectionTimetableDeliveryStructure> getConnectionTimetableDelivery() {
        if (connectionTimetableDelivery == null) {
            connectionTimetableDelivery = new ArrayList<ConnectionTimetableDeliveryStructure>();
        }
        return this.connectionTimetableDelivery;
    }

    public boolean isSetConnectionTimetableDelivery() {
        return ((this.connectionTimetableDelivery!= null)&&(!this.connectionTimetableDelivery.isEmpty()));
    }

    public void unsetConnectionTimetableDelivery() {
        this.connectionTimetableDelivery = null;
    }

    /**
     * Delivery for Connection Protection Fetcher Service.Gets the value of the connectionMonitoringFeederDelivery property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the connectionMonitoringFeederDelivery property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getConnectionMonitoringFeederDelivery().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ConnectionMonitoringFeederDeliveryStructure }
     * 
     * 
     */
    public List<ConnectionMonitoringFeederDeliveryStructure> getConnectionMonitoringFeederDelivery() {
        if (connectionMonitoringFeederDelivery == null) {
            connectionMonitoringFeederDelivery = new ArrayList<ConnectionMonitoringFeederDeliveryStructure>();
        }
        return this.connectionMonitoringFeederDelivery;
    }

    public boolean isSetConnectionMonitoringFeederDelivery() {
        return ((this.connectionMonitoringFeederDelivery!= null)&&(!this.connectionMonitoringFeederDelivery.isEmpty()));
    }

    public void unsetConnectionMonitoringFeederDelivery() {
        this.connectionMonitoringFeederDelivery = null;
    }

    /**
     * Delivery for Connection Protection Fetcher Service.Gets the value of the connectionMonitoringDistributorDelivery property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the connectionMonitoringDistributorDelivery property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getConnectionMonitoringDistributorDelivery().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ConnectionMonitoringDistributorDeliveryStructure }
     * 
     * 
     */
    public List<ConnectionMonitoringDistributorDeliveryStructure> getConnectionMonitoringDistributorDelivery() {
        if (connectionMonitoringDistributorDelivery == null) {
            connectionMonitoringDistributorDelivery = new ArrayList<ConnectionMonitoringDistributorDeliveryStructure>();
        }
        return this.connectionMonitoringDistributorDelivery;
    }

    public boolean isSetConnectionMonitoringDistributorDelivery() {
        return ((this.connectionMonitoringDistributorDelivery!= null)&&(!this.connectionMonitoringDistributorDelivery.isEmpty()));
    }

    public void unsetConnectionMonitoringDistributorDelivery() {
        this.connectionMonitoringDistributorDelivery = null;
    }

    /**
     * Delivery for general Message service.Gets the value of the generalMessageDelivery property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the generalMessageDelivery property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getGeneralMessageDelivery().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link GeneralMessageDeliveryStructure }
     * 
     * 
     */
    public List<GeneralMessageDeliveryStructure> getGeneralMessageDelivery() {
        if (generalMessageDelivery == null) {
            generalMessageDelivery = new ArrayList<GeneralMessageDeliveryStructure>();
        }
        return this.generalMessageDelivery;
    }

    public boolean isSetGeneralMessageDelivery() {
        return ((this.generalMessageDelivery!= null)&&(!this.generalMessageDelivery.isEmpty()));
    }

    public void unsetGeneralMessageDelivery() {
        this.generalMessageDelivery = null;
    }

    /**
     * Gets the value of the facilityMonitoringDelivery property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the facilityMonitoringDelivery property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFacilityMonitoringDelivery().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FacilityMonitoringDeliveryStructure }
     * 
     * 
     */
    public List<FacilityMonitoringDeliveryStructure> getFacilityMonitoringDelivery() {
        if (facilityMonitoringDelivery == null) {
            facilityMonitoringDelivery = new ArrayList<FacilityMonitoringDeliveryStructure>();
        }
        return this.facilityMonitoringDelivery;
    }

    public boolean isSetFacilityMonitoringDelivery() {
        return ((this.facilityMonitoringDelivery!= null)&&(!this.facilityMonitoringDelivery.isEmpty()));
    }

    public void unsetFacilityMonitoringDelivery() {
        this.facilityMonitoringDelivery = null;
    }

    /**
     * Gets the value of the situationExchangeDelivery property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the situationExchangeDelivery property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSituationExchangeDelivery().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SituationExchangeDeliveryStructure }
     * 
     * 
     */
    public List<SituationExchangeDeliveryStructure> getSituationExchangeDelivery() {
        if (situationExchangeDelivery == null) {
            situationExchangeDelivery = new ArrayList<SituationExchangeDeliveryStructure>();
        }
        return this.situationExchangeDelivery;
    }

    public boolean isSetSituationExchangeDelivery() {
        return ((this.situationExchangeDelivery!= null)&&(!this.situationExchangeDelivery.isEmpty()));
    }

    public void unsetSituationExchangeDelivery() {
        this.situationExchangeDelivery = null;
    }

    /**
     * Obtient la valeur de la propriété srsName.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSrsName() {
        return srsName;
    }

    /**
     * Définit la valeur de la propriété srsName.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSrsName(String value) {
        this.srsName = value;
    }

    public boolean isSetSrsName() {
        return (this.srsName!= null);
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
     *           &lt;element ref="{http://www.siri.org.uk/siri}CapabilityNotSupportedError"/>
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
        "capabilityNotSupportedError",
        "otherError",
        "description"
    })
    public static class ErrorCondition
        implements Serializable
    {

        private final static long serialVersionUID = 1L;
        @XmlElement(name = "CapabilityNotSupportedError")
        protected CapabilityNotSupportedErrorStructure capabilityNotSupportedError;
        @XmlElement(name = "OtherError")
        protected OtherErrorStructure otherError;
        @XmlElement(name = "Description")
        protected ErrorDescriptionStructure description;

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
