
package uk.org.siri.siri;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.Duration;


/**
 * Type for Vehicle Monitoring Capabilities.
 * 
 * <p>Classe Java pour FacilityMonitoringServiceCapabilitiesStructure complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="FacilityMonitoringServiceCapabilitiesStructure">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.siri.org.uk/siri}AbstractCapabilitiesStructure">
 *       &lt;sequence>
 *         &lt;element name="TopicFiltering" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="DefaultPreviewInterval" type="{http://www.siri.org.uk/siri}PositiveDurationType"/>
 *                   &lt;element ref="{http://www.siri.org.uk/siri}FilterByFacilityRef"/>
 *                   &lt;element name="FilterByLocationRef" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *                   &lt;element ref="{http://www.siri.org.uk/siri}FilterByVehicleRef" minOccurs="0"/>
 *                   &lt;element ref="{http://www.siri.org.uk/siri}FilterByLineRef" minOccurs="0"/>
 *                   &lt;element ref="{http://www.siri.org.uk/siri}FilterByStopPointRef" minOccurs="0"/>
 *                   &lt;element ref="{http://www.siri.org.uk/siri}FilterByVehicleJourneyRef" minOccurs="0"/>
 *                   &lt;element ref="{http://www.siri.org.uk/siri}FilterByConnectionLinkRef" minOccurs="0"/>
 *                   &lt;element ref="{http://www.siri.org.uk/siri}FilterByInterchangeRef" minOccurs="0"/>
 *                   &lt;element name="FilterBySpecificNeed" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="RequestPolicy" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;extension base="{http://www.siri.org.uk/siri}CapabilityRequestPolicyStructure">
 *                 &lt;sequence>
 *                   &lt;group ref="{http://www.siri.org.uk/siri}FacilityMonitoringVolumeGroup"/>
 *                 &lt;/sequence>
 *               &lt;/extension>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="SubscriptionPolicy" type="{http://www.siri.org.uk/siri}CapabilitySubscriptionPolicyStructure" minOccurs="0"/>
 *         &lt;element name="AccessControl" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;extension base="{http://www.siri.org.uk/siri}CapabilityAccessControlStructure">
 *                 &lt;sequence>
 *                   &lt;element ref="{http://www.siri.org.uk/siri}CheckOperatorRef" minOccurs="0"/>
 *                   &lt;element ref="{http://www.siri.org.uk/siri}CheckLineRef" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/extension>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="ResponseFeatures" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="HasRemedy" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *                   &lt;element name="HasFacilityLocation" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element ref="{http://www.siri.org.uk/siri}Extensions" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FacilityMonitoringServiceCapabilitiesStructure", propOrder = {
    "topicFiltering",
    "requestPolicy",
    "subscriptionPolicy",
    "accessControl",
    "responseFeatures",
    "extensions"
})
public class FacilityMonitoringServiceCapabilitiesStructure
    extends AbstractCapabilitiesStructure
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "TopicFiltering")
    protected FacilityMonitoringServiceCapabilitiesStructure.TopicFiltering topicFiltering;
    @XmlElement(name = "RequestPolicy")
    protected FacilityMonitoringServiceCapabilitiesStructure.RequestPolicy requestPolicy;
    @XmlElement(name = "SubscriptionPolicy")
    protected CapabilitySubscriptionPolicyStructure subscriptionPolicy;
    @XmlElement(name = "AccessControl")
    protected FacilityMonitoringServiceCapabilitiesStructure.AccessControl accessControl;
    @XmlElement(name = "ResponseFeatures")
    protected FacilityMonitoringServiceCapabilitiesStructure.ResponseFeatures responseFeatures;
    @XmlElement(name = "Extensions")
    protected ExtensionsStructure extensions;

    /**
     * Obtient la valeur de la propriété topicFiltering.
     * 
     * @return
     *     possible object is
     *     {@link FacilityMonitoringServiceCapabilitiesStructure.TopicFiltering }
     *     
     */
    public FacilityMonitoringServiceCapabilitiesStructure.TopicFiltering getTopicFiltering() {
        return topicFiltering;
    }

    /**
     * Définit la valeur de la propriété topicFiltering.
     * 
     * @param value
     *     allowed object is
     *     {@link FacilityMonitoringServiceCapabilitiesStructure.TopicFiltering }
     *     
     */
    public void setTopicFiltering(FacilityMonitoringServiceCapabilitiesStructure.TopicFiltering value) {
        this.topicFiltering = value;
    }

    public boolean isSetTopicFiltering() {
        return (this.topicFiltering!= null);
    }

    /**
     * Obtient la valeur de la propriété requestPolicy.
     * 
     * @return
     *     possible object is
     *     {@link FacilityMonitoringServiceCapabilitiesStructure.RequestPolicy }
     *     
     */
    public FacilityMonitoringServiceCapabilitiesStructure.RequestPolicy getRequestPolicy() {
        return requestPolicy;
    }

    /**
     * Définit la valeur de la propriété requestPolicy.
     * 
     * @param value
     *     allowed object is
     *     {@link FacilityMonitoringServiceCapabilitiesStructure.RequestPolicy }
     *     
     */
    public void setRequestPolicy(FacilityMonitoringServiceCapabilitiesStructure.RequestPolicy value) {
        this.requestPolicy = value;
    }

    public boolean isSetRequestPolicy() {
        return (this.requestPolicy!= null);
    }

    /**
     * Obtient la valeur de la propriété subscriptionPolicy.
     * 
     * @return
     *     possible object is
     *     {@link CapabilitySubscriptionPolicyStructure }
     *     
     */
    public CapabilitySubscriptionPolicyStructure getSubscriptionPolicy() {
        return subscriptionPolicy;
    }

    /**
     * Définit la valeur de la propriété subscriptionPolicy.
     * 
     * @param value
     *     allowed object is
     *     {@link CapabilitySubscriptionPolicyStructure }
     *     
     */
    public void setSubscriptionPolicy(CapabilitySubscriptionPolicyStructure value) {
        this.subscriptionPolicy = value;
    }

    public boolean isSetSubscriptionPolicy() {
        return (this.subscriptionPolicy!= null);
    }

    /**
     * Obtient la valeur de la propriété accessControl.
     * 
     * @return
     *     possible object is
     *     {@link FacilityMonitoringServiceCapabilitiesStructure.AccessControl }
     *     
     */
    public FacilityMonitoringServiceCapabilitiesStructure.AccessControl getAccessControl() {
        return accessControl;
    }

    /**
     * Définit la valeur de la propriété accessControl.
     * 
     * @param value
     *     allowed object is
     *     {@link FacilityMonitoringServiceCapabilitiesStructure.AccessControl }
     *     
     */
    public void setAccessControl(FacilityMonitoringServiceCapabilitiesStructure.AccessControl value) {
        this.accessControl = value;
    }

    public boolean isSetAccessControl() {
        return (this.accessControl!= null);
    }

    /**
     * Obtient la valeur de la propriété responseFeatures.
     * 
     * @return
     *     possible object is
     *     {@link FacilityMonitoringServiceCapabilitiesStructure.ResponseFeatures }
     *     
     */
    public FacilityMonitoringServiceCapabilitiesStructure.ResponseFeatures getResponseFeatures() {
        return responseFeatures;
    }

    /**
     * Définit la valeur de la propriété responseFeatures.
     * 
     * @param value
     *     allowed object is
     *     {@link FacilityMonitoringServiceCapabilitiesStructure.ResponseFeatures }
     *     
     */
    public void setResponseFeatures(FacilityMonitoringServiceCapabilitiesStructure.ResponseFeatures value) {
        this.responseFeatures = value;
    }

    public boolean isSetResponseFeatures() {
        return (this.responseFeatures!= null);
    }

    /**
     * Obtient la valeur de la propriété extensions.
     * 
     * @return
     *     possible object is
     *     {@link ExtensionsStructure }
     *     
     */
    public ExtensionsStructure getExtensions() {
        return extensions;
    }

    /**
     * Définit la valeur de la propriété extensions.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtensionsStructure }
     *     
     */
    public void setExtensions(ExtensionsStructure value) {
        this.extensions = value;
    }

    public boolean isSetExtensions() {
        return (this.extensions!= null);
    }


    /**
     * <p>Classe Java pour anonymous complex type.
     * 
     * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;extension base="{http://www.siri.org.uk/siri}CapabilityAccessControlStructure">
     *       &lt;sequence>
     *         &lt;element ref="{http://www.siri.org.uk/siri}CheckOperatorRef" minOccurs="0"/>
     *         &lt;element ref="{http://www.siri.org.uk/siri}CheckLineRef" minOccurs="0"/>
     *       &lt;/sequence>
     *     &lt;/extension>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "checkOperatorRef",
        "checkLineRef"
    })
    public static class AccessControl
        extends CapabilityAccessControlStructure
        implements Serializable
    {

        private final static long serialVersionUID = 1L;
        @XmlElement(name = "CheckOperatorRef", defaultValue = "true")
        protected Boolean checkOperatorRef;
        @XmlElement(name = "CheckLineRef", defaultValue = "true")
        protected Boolean checkLineRef;

        /**
         * Obtient la valeur de la propriété checkOperatorRef.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isCheckOperatorRef() {
            return checkOperatorRef;
        }

        /**
         * Définit la valeur de la propriété checkOperatorRef.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setCheckOperatorRef(Boolean value) {
            this.checkOperatorRef = value;
        }

        public boolean isSetCheckOperatorRef() {
            return (this.checkOperatorRef!= null);
        }

        /**
         * Obtient la valeur de la propriété checkLineRef.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isCheckLineRef() {
            return checkLineRef;
        }

        /**
         * Définit la valeur de la propriété checkLineRef.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setCheckLineRef(Boolean value) {
            this.checkLineRef = value;
        }

        public boolean isSetCheckLineRef() {
            return (this.checkLineRef!= null);
        }

    }


    /**
     * <p>Classe Java pour anonymous complex type.
     * 
     * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;extension base="{http://www.siri.org.uk/siri}CapabilityRequestPolicyStructure">
     *       &lt;sequence>
     *         &lt;group ref="{http://www.siri.org.uk/siri}FacilityMonitoringVolumeGroup"/>
     *       &lt;/sequence>
     *     &lt;/extension>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "hasMaximumFacilityStatus"
    })
    public static class RequestPolicy
        extends CapabilityRequestPolicyStructure
        implements Serializable
    {

        private final static long serialVersionUID = 1L;
        @XmlElement(name = "HasMaximumFacilityStatus", defaultValue = "false")
        protected Boolean hasMaximumFacilityStatus;

        /**
         * Obtient la valeur de la propriété hasMaximumFacilityStatus.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isHasMaximumFacilityStatus() {
            return hasMaximumFacilityStatus;
        }

        /**
         * Définit la valeur de la propriété hasMaximumFacilityStatus.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setHasMaximumFacilityStatus(Boolean value) {
            this.hasMaximumFacilityStatus = value;
        }

        public boolean isSetHasMaximumFacilityStatus() {
            return (this.hasMaximumFacilityStatus!= null);
        }

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
     *         &lt;element name="HasRemedy" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
     *         &lt;element name="HasFacilityLocation" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
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
        "hasRemedy",
        "hasFacilityLocation"
    })
    public static class ResponseFeatures
        implements Serializable
    {

        private final static long serialVersionUID = 1L;
        @XmlElement(name = "HasRemedy", defaultValue = "false")
        protected Boolean hasRemedy;
        @XmlElement(name = "HasFacilityLocation", defaultValue = "true")
        protected Boolean hasFacilityLocation;

        /**
         * Obtient la valeur de la propriété hasRemedy.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isHasRemedy() {
            return hasRemedy;
        }

        /**
         * Définit la valeur de la propriété hasRemedy.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setHasRemedy(Boolean value) {
            this.hasRemedy = value;
        }

        public boolean isSetHasRemedy() {
            return (this.hasRemedy!= null);
        }

        /**
         * Obtient la valeur de la propriété hasFacilityLocation.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isHasFacilityLocation() {
            return hasFacilityLocation;
        }

        /**
         * Définit la valeur de la propriété hasFacilityLocation.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setHasFacilityLocation(Boolean value) {
            this.hasFacilityLocation = value;
        }

        public boolean isSetHasFacilityLocation() {
            return (this.hasFacilityLocation!= null);
        }

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
     *         &lt;element name="DefaultPreviewInterval" type="{http://www.siri.org.uk/siri}PositiveDurationType"/>
     *         &lt;element ref="{http://www.siri.org.uk/siri}FilterByFacilityRef"/>
     *         &lt;element name="FilterByLocationRef" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
     *         &lt;element ref="{http://www.siri.org.uk/siri}FilterByVehicleRef" minOccurs="0"/>
     *         &lt;element ref="{http://www.siri.org.uk/siri}FilterByLineRef" minOccurs="0"/>
     *         &lt;element ref="{http://www.siri.org.uk/siri}FilterByStopPointRef" minOccurs="0"/>
     *         &lt;element ref="{http://www.siri.org.uk/siri}FilterByVehicleJourneyRef" minOccurs="0"/>
     *         &lt;element ref="{http://www.siri.org.uk/siri}FilterByConnectionLinkRef" minOccurs="0"/>
     *         &lt;element ref="{http://www.siri.org.uk/siri}FilterByInterchangeRef" minOccurs="0"/>
     *         &lt;element name="FilterBySpecificNeed" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
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
        "defaultPreviewInterval",
        "filterByFacilityRef",
        "filterByLocationRef",
        "filterByVehicleRef",
        "filterByLineRef",
        "filterByStopPointRef",
        "filterByVehicleJourneyRef",
        "filterByConnectionLinkRef",
        "filterByInterchangeRef",
        "filterBySpecificNeed"
    })
    public static class TopicFiltering
        implements Serializable
    {

        private final static long serialVersionUID = 1L;
        @XmlElement(name = "DefaultPreviewInterval", required = true, defaultValue = "PT60M")
        protected Duration defaultPreviewInterval;
        @XmlElement(name = "FilterByFacilityRef", defaultValue = "true")
        protected boolean filterByFacilityRef;
        @XmlElement(name = "FilterByLocationRef")
        protected boolean filterByLocationRef;
        @XmlElement(name = "FilterByVehicleRef", defaultValue = "false")
        protected Boolean filterByVehicleRef;
        @XmlElement(name = "FilterByLineRef", defaultValue = "true")
        protected Boolean filterByLineRef;
        @XmlElement(name = "FilterByStopPointRef", defaultValue = "true")
        protected Boolean filterByStopPointRef;
        @XmlElement(name = "FilterByVehicleJourneyRef", defaultValue = "false")
        protected Boolean filterByVehicleJourneyRef;
        @XmlElement(name = "FilterByConnectionLinkRef", defaultValue = "true")
        protected Boolean filterByConnectionLinkRef;
        @XmlElement(name = "FilterByInterchangeRef", defaultValue = "false")
        protected Boolean filterByInterchangeRef;
        @XmlElement(name = "FilterBySpecificNeed", defaultValue = "true")
        protected Boolean filterBySpecificNeed;

        /**
         * Obtient la valeur de la propriété defaultPreviewInterval.
         * 
         * @return
         *     possible object is
         *     {@link Duration }
         *     
         */
        public Duration getDefaultPreviewInterval() {
            return defaultPreviewInterval;
        }

        /**
         * Définit la valeur de la propriété defaultPreviewInterval.
         * 
         * @param value
         *     allowed object is
         *     {@link Duration }
         *     
         */
        public void setDefaultPreviewInterval(Duration value) {
            this.defaultPreviewInterval = value;
        }

        public boolean isSetDefaultPreviewInterval() {
            return (this.defaultPreviewInterval!= null);
        }

        /**
         * Obtient la valeur de la propriété filterByFacilityRef.
         * 
         */
        public boolean isFilterByFacilityRef() {
            return filterByFacilityRef;
        }

        /**
         * Définit la valeur de la propriété filterByFacilityRef.
         * 
         */
        public void setFilterByFacilityRef(boolean value) {
            this.filterByFacilityRef = value;
        }

        public boolean isSetFilterByFacilityRef() {
            return true;
        }

        /**
         * Obtient la valeur de la propriété filterByLocationRef.
         * 
         */
        public boolean isFilterByLocationRef() {
            return filterByLocationRef;
        }

        /**
         * Définit la valeur de la propriété filterByLocationRef.
         * 
         */
        public void setFilterByLocationRef(boolean value) {
            this.filterByLocationRef = value;
        }

        public boolean isSetFilterByLocationRef() {
            return true;
        }

        /**
         * Obtient la valeur de la propriété filterByVehicleRef.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isFilterByVehicleRef() {
            return filterByVehicleRef;
        }

        /**
         * Définit la valeur de la propriété filterByVehicleRef.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setFilterByVehicleRef(Boolean value) {
            this.filterByVehicleRef = value;
        }

        public boolean isSetFilterByVehicleRef() {
            return (this.filterByVehicleRef!= null);
        }

        /**
         * Obtient la valeur de la propriété filterByLineRef.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isFilterByLineRef() {
            return filterByLineRef;
        }

        /**
         * Définit la valeur de la propriété filterByLineRef.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setFilterByLineRef(Boolean value) {
            this.filterByLineRef = value;
        }

        public boolean isSetFilterByLineRef() {
            return (this.filterByLineRef!= null);
        }

        /**
         * Obtient la valeur de la propriété filterByStopPointRef.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isFilterByStopPointRef() {
            return filterByStopPointRef;
        }

        /**
         * Définit la valeur de la propriété filterByStopPointRef.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setFilterByStopPointRef(Boolean value) {
            this.filterByStopPointRef = value;
        }

        public boolean isSetFilterByStopPointRef() {
            return (this.filterByStopPointRef!= null);
        }

        /**
         * Obtient la valeur de la propriété filterByVehicleJourneyRef.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isFilterByVehicleJourneyRef() {
            return filterByVehicleJourneyRef;
        }

        /**
         * Définit la valeur de la propriété filterByVehicleJourneyRef.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setFilterByVehicleJourneyRef(Boolean value) {
            this.filterByVehicleJourneyRef = value;
        }

        public boolean isSetFilterByVehicleJourneyRef() {
            return (this.filterByVehicleJourneyRef!= null);
        }

        /**
         * Obtient la valeur de la propriété filterByConnectionLinkRef.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isFilterByConnectionLinkRef() {
            return filterByConnectionLinkRef;
        }

        /**
         * Définit la valeur de la propriété filterByConnectionLinkRef.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setFilterByConnectionLinkRef(Boolean value) {
            this.filterByConnectionLinkRef = value;
        }

        public boolean isSetFilterByConnectionLinkRef() {
            return (this.filterByConnectionLinkRef!= null);
        }

        /**
         * Obtient la valeur de la propriété filterByInterchangeRef.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isFilterByInterchangeRef() {
            return filterByInterchangeRef;
        }

        /**
         * Définit la valeur de la propriété filterByInterchangeRef.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setFilterByInterchangeRef(Boolean value) {
            this.filterByInterchangeRef = value;
        }

        public boolean isSetFilterByInterchangeRef() {
            return (this.filterByInterchangeRef!= null);
        }

        /**
         * Obtient la valeur de la propriété filterBySpecificNeed.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isFilterBySpecificNeed() {
            return filterBySpecificNeed;
        }

        /**
         * Définit la valeur de la propriété filterBySpecificNeed.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setFilterBySpecificNeed(Boolean value) {
            this.filterBySpecificNeed = value;
        }

        public boolean isSetFilterBySpecificNeed() {
            return (this.filterBySpecificNeed!= null);
        }

    }

}
