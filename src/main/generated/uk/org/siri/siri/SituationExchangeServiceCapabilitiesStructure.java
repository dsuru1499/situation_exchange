
package uk.org.siri.siri;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.Duration;


/**
 * Type for SItuation Exchange Service Capabilities.
 * 
 * <p>Classe Java pour SituationExchangeServiceCapabilitiesStructure complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="SituationExchangeServiceCapabilitiesStructure">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.siri.org.uk/siri}AbstractCapabilitiesStructure">
 *       &lt;sequence>
 *         &lt;element name="TopicFiltering" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="DefaultPreviewInterval" type="{http://www.siri.org.uk/siri}PositiveDurationType"/>
 *                   &lt;element ref="{http://www.siri.org.uk/siri}FilterByFacilityRef" minOccurs="0"/>
 *                   &lt;element name="FilterByLocationRef" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *                   &lt;element ref="{http://www.siri.org.uk/siri}FilterByVehicleRef" minOccurs="0"/>
 *                   &lt;element name="FilterByMode" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *                   &lt;element name="FilterByNetworkRef" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *                   &lt;element ref="{http://www.siri.org.uk/siri}FilterByLineRef" minOccurs="0"/>
 *                   &lt;element ref="{http://www.siri.org.uk/siri}FilterByStopPointRef" minOccurs="0"/>
 *                   &lt;element name="FilterByStopPlaceRef" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *                   &lt;element ref="{http://www.siri.org.uk/siri}FilterByVehicleJourneyRef" minOccurs="0"/>
 *                   &lt;element ref="{http://www.siri.org.uk/siri}FilterByConnectionLinkRef" minOccurs="0"/>
 *                   &lt;element ref="{http://www.siri.org.uk/siri}FilterByInterchangeRef" minOccurs="0"/>
 *                   &lt;element name="FilterBySpecificNeed" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *                   &lt;element name="FilterByKeword" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
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
 *                   &lt;group ref="{http://www.siri.org.uk/siri}SituationExchangeVolumeGroup"/>
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
@XmlType(name = "SituationExchangeServiceCapabilitiesStructure", propOrder = {
    "topicFiltering",
    "requestPolicy",
    "subscriptionPolicy",
    "accessControl",
    "responseFeatures",
    "extensions"
})
public class SituationExchangeServiceCapabilitiesStructure
    extends AbstractCapabilitiesStructure
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "TopicFiltering")
    protected SituationExchangeServiceCapabilitiesStructure.TopicFiltering topicFiltering;
    @XmlElement(name = "RequestPolicy")
    protected SituationExchangeServiceCapabilitiesStructure.RequestPolicy requestPolicy;
    @XmlElement(name = "SubscriptionPolicy")
    protected CapabilitySubscriptionPolicyStructure subscriptionPolicy;
    @XmlElement(name = "AccessControl")
    protected SituationExchangeServiceCapabilitiesStructure.AccessControl accessControl;
    @XmlElement(name = "ResponseFeatures")
    protected SituationExchangeServiceCapabilitiesStructure.ResponseFeatures responseFeatures;
    @XmlElement(name = "Extensions")
    protected ExtensionsStructure extensions;

    /**
     * Obtient la valeur de la propriété topicFiltering.
     * 
     * @return
     *     possible object is
     *     {@link SituationExchangeServiceCapabilitiesStructure.TopicFiltering }
     *     
     */
    public SituationExchangeServiceCapabilitiesStructure.TopicFiltering getTopicFiltering() {
        return topicFiltering;
    }

    /**
     * Définit la valeur de la propriété topicFiltering.
     * 
     * @param value
     *     allowed object is
     *     {@link SituationExchangeServiceCapabilitiesStructure.TopicFiltering }
     *     
     */
    public void setTopicFiltering(SituationExchangeServiceCapabilitiesStructure.TopicFiltering value) {
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
     *     {@link SituationExchangeServiceCapabilitiesStructure.RequestPolicy }
     *     
     */
    public SituationExchangeServiceCapabilitiesStructure.RequestPolicy getRequestPolicy() {
        return requestPolicy;
    }

    /**
     * Définit la valeur de la propriété requestPolicy.
     * 
     * @param value
     *     allowed object is
     *     {@link SituationExchangeServiceCapabilitiesStructure.RequestPolicy }
     *     
     */
    public void setRequestPolicy(SituationExchangeServiceCapabilitiesStructure.RequestPolicy value) {
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
     *     {@link SituationExchangeServiceCapabilitiesStructure.AccessControl }
     *     
     */
    public SituationExchangeServiceCapabilitiesStructure.AccessControl getAccessControl() {
        return accessControl;
    }

    /**
     * Définit la valeur de la propriété accessControl.
     * 
     * @param value
     *     allowed object is
     *     {@link SituationExchangeServiceCapabilitiesStructure.AccessControl }
     *     
     */
    public void setAccessControl(SituationExchangeServiceCapabilitiesStructure.AccessControl value) {
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
     *     {@link SituationExchangeServiceCapabilitiesStructure.ResponseFeatures }
     *     
     */
    public SituationExchangeServiceCapabilitiesStructure.ResponseFeatures getResponseFeatures() {
        return responseFeatures;
    }

    /**
     * Définit la valeur de la propriété responseFeatures.
     * 
     * @param value
     *     allowed object is
     *     {@link SituationExchangeServiceCapabilitiesStructure.ResponseFeatures }
     *     
     */
    public void setResponseFeatures(SituationExchangeServiceCapabilitiesStructure.ResponseFeatures value) {
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
     *         &lt;group ref="{http://www.siri.org.uk/siri}SituationExchangeVolumeGroup"/>
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
        "hasMaximumNumberOfSituations"
    })
    public static class RequestPolicy
        extends CapabilityRequestPolicyStructure
        implements Serializable
    {

        private final static long serialVersionUID = 1L;
        @XmlElement(name = "HasMaximumNumberOfSituations", defaultValue = "false")
        protected Boolean hasMaximumNumberOfSituations;

        /**
         * Obtient la valeur de la propriété hasMaximumNumberOfSituations.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isHasMaximumNumberOfSituations() {
            return hasMaximumNumberOfSituations;
        }

        /**
         * Définit la valeur de la propriété hasMaximumNumberOfSituations.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setHasMaximumNumberOfSituations(Boolean value) {
            this.hasMaximumNumberOfSituations = value;
        }

        public boolean isSetHasMaximumNumberOfSituations() {
            return (this.hasMaximumNumberOfSituations!= null);
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
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class ResponseFeatures
        implements Serializable
    {

        private final static long serialVersionUID = 1L;

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
     *         &lt;element ref="{http://www.siri.org.uk/siri}FilterByFacilityRef" minOccurs="0"/>
     *         &lt;element name="FilterByLocationRef" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
     *         &lt;element ref="{http://www.siri.org.uk/siri}FilterByVehicleRef" minOccurs="0"/>
     *         &lt;element name="FilterByMode" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
     *         &lt;element name="FilterByNetworkRef" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
     *         &lt;element ref="{http://www.siri.org.uk/siri}FilterByLineRef" minOccurs="0"/>
     *         &lt;element ref="{http://www.siri.org.uk/siri}FilterByStopPointRef" minOccurs="0"/>
     *         &lt;element name="FilterByStopPlaceRef" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
     *         &lt;element ref="{http://www.siri.org.uk/siri}FilterByVehicleJourneyRef" minOccurs="0"/>
     *         &lt;element ref="{http://www.siri.org.uk/siri}FilterByConnectionLinkRef" minOccurs="0"/>
     *         &lt;element ref="{http://www.siri.org.uk/siri}FilterByInterchangeRef" minOccurs="0"/>
     *         &lt;element name="FilterBySpecificNeed" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
     *         &lt;element name="FilterByKeword" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
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
        "filterByMode",
        "filterByNetworkRef",
        "filterByLineRef",
        "filterByStopPointRef",
        "filterByStopPlaceRef",
        "filterByVehicleJourneyRef",
        "filterByConnectionLinkRef",
        "filterByInterchangeRef",
        "filterBySpecificNeed",
        "filterByKeword"
    })
    public static class TopicFiltering
        implements Serializable
    {

        private final static long serialVersionUID = 1L;
        @XmlElement(name = "DefaultPreviewInterval", required = true, defaultValue = "PT60M")
        protected Duration defaultPreviewInterval;
        @XmlElement(name = "FilterByFacilityRef", defaultValue = "true")
        protected Boolean filterByFacilityRef;
        @XmlElement(name = "FilterByLocationRef")
        protected Boolean filterByLocationRef;
        @XmlElement(name = "FilterByVehicleRef", defaultValue = "false")
        protected Boolean filterByVehicleRef;
        @XmlElement(name = "FilterByMode")
        protected Boolean filterByMode;
        @XmlElement(name = "FilterByNetworkRef")
        protected Boolean filterByNetworkRef;
        @XmlElement(name = "FilterByLineRef", defaultValue = "true")
        protected Boolean filterByLineRef;
        @XmlElement(name = "FilterByStopPointRef", defaultValue = "true")
        protected Boolean filterByStopPointRef;
        @XmlElement(name = "FilterByStopPlaceRef")
        protected Boolean filterByStopPlaceRef;
        @XmlElement(name = "FilterByVehicleJourneyRef", defaultValue = "false")
        protected Boolean filterByVehicleJourneyRef;
        @XmlElement(name = "FilterByConnectionLinkRef", defaultValue = "true")
        protected Boolean filterByConnectionLinkRef;
        @XmlElement(name = "FilterByInterchangeRef", defaultValue = "false")
        protected Boolean filterByInterchangeRef;
        @XmlElement(name = "FilterBySpecificNeed", defaultValue = "true")
        protected Boolean filterBySpecificNeed;
        @XmlElement(name = "FilterByKeword", defaultValue = "true")
        protected Boolean filterByKeword;

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
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isFilterByFacilityRef() {
            return filterByFacilityRef;
        }

        /**
         * Définit la valeur de la propriété filterByFacilityRef.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setFilterByFacilityRef(Boolean value) {
            this.filterByFacilityRef = value;
        }

        public boolean isSetFilterByFacilityRef() {
            return (this.filterByFacilityRef!= null);
        }

        /**
         * Obtient la valeur de la propriété filterByLocationRef.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isFilterByLocationRef() {
            return filterByLocationRef;
        }

        /**
         * Définit la valeur de la propriété filterByLocationRef.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setFilterByLocationRef(Boolean value) {
            this.filterByLocationRef = value;
        }

        public boolean isSetFilterByLocationRef() {
            return (this.filterByLocationRef!= null);
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
         * Obtient la valeur de la propriété filterByMode.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isFilterByMode() {
            return filterByMode;
        }

        /**
         * Définit la valeur de la propriété filterByMode.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setFilterByMode(Boolean value) {
            this.filterByMode = value;
        }

        public boolean isSetFilterByMode() {
            return (this.filterByMode!= null);
        }

        /**
         * Obtient la valeur de la propriété filterByNetworkRef.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isFilterByNetworkRef() {
            return filterByNetworkRef;
        }

        /**
         * Définit la valeur de la propriété filterByNetworkRef.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setFilterByNetworkRef(Boolean value) {
            this.filterByNetworkRef = value;
        }

        public boolean isSetFilterByNetworkRef() {
            return (this.filterByNetworkRef!= null);
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
         * Obtient la valeur de la propriété filterByStopPlaceRef.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isFilterByStopPlaceRef() {
            return filterByStopPlaceRef;
        }

        /**
         * Définit la valeur de la propriété filterByStopPlaceRef.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setFilterByStopPlaceRef(Boolean value) {
            this.filterByStopPlaceRef = value;
        }

        public boolean isSetFilterByStopPlaceRef() {
            return (this.filterByStopPlaceRef!= null);
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

        /**
         * Obtient la valeur de la propriété filterByKeword.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isFilterByKeword() {
            return filterByKeword;
        }

        /**
         * Définit la valeur de la propriété filterByKeword.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setFilterByKeword(Boolean value) {
            this.filterByKeword = value;
        }

        public boolean isSetFilterByKeword() {
            return (this.filterByKeword!= null);
        }

    }

}
