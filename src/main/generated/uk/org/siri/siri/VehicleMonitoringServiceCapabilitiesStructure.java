
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
 * <p>Classe Java pour VehicleMonitoringServiceCapabilitiesStructure complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="VehicleMonitoringServiceCapabilitiesStructure">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.siri.org.uk/siri}AbstractCapabilitiesStructure">
 *       &lt;sequence>
 *         &lt;element name="TopicFiltering" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="DefaultPreviewInterval" type="{http://www.siri.org.uk/siri}PositiveDurationType"/>
 *                   &lt;element name="FilterByVehicleMonitoringRef" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *                   &lt;element ref="{http://www.siri.org.uk/siri}FilterByVehicleRef" minOccurs="0"/>
 *                   &lt;element ref="{http://www.siri.org.uk/siri}FilterByLineRef" minOccurs="0"/>
 *                   &lt;element ref="{http://www.siri.org.uk/siri}FilterByDirectionRef" minOccurs="0"/>
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
 *                   &lt;group ref="{http://www.siri.org.uk/siri}VehicleMonitoringVolumeGroup"/>
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
 *                   &lt;element name="CheckVehicleMonitoringRef" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
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
 *                   &lt;element name="HasLocation" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *                   &lt;element name="HasSituations" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
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
@XmlType(name = "VehicleMonitoringServiceCapabilitiesStructure", propOrder = {
    "topicFiltering",
    "requestPolicy",
    "subscriptionPolicy",
    "accessControl",
    "responseFeatures",
    "extensions"
})
public class VehicleMonitoringServiceCapabilitiesStructure
    extends AbstractCapabilitiesStructure
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "TopicFiltering")
    protected VehicleMonitoringServiceCapabilitiesStructure.TopicFiltering topicFiltering;
    @XmlElement(name = "RequestPolicy")
    protected VehicleMonitoringServiceCapabilitiesStructure.RequestPolicy requestPolicy;
    @XmlElement(name = "SubscriptionPolicy")
    protected CapabilitySubscriptionPolicyStructure subscriptionPolicy;
    @XmlElement(name = "AccessControl")
    protected VehicleMonitoringServiceCapabilitiesStructure.AccessControl accessControl;
    @XmlElement(name = "ResponseFeatures")
    protected VehicleMonitoringServiceCapabilitiesStructure.ResponseFeatures responseFeatures;
    @XmlElement(name = "Extensions")
    protected ExtensionsStructure extensions;

    /**
     * Obtient la valeur de la propriété topicFiltering.
     * 
     * @return
     *     possible object is
     *     {@link VehicleMonitoringServiceCapabilitiesStructure.TopicFiltering }
     *     
     */
    public VehicleMonitoringServiceCapabilitiesStructure.TopicFiltering getTopicFiltering() {
        return topicFiltering;
    }

    /**
     * Définit la valeur de la propriété topicFiltering.
     * 
     * @param value
     *     allowed object is
     *     {@link VehicleMonitoringServiceCapabilitiesStructure.TopicFiltering }
     *     
     */
    public void setTopicFiltering(VehicleMonitoringServiceCapabilitiesStructure.TopicFiltering value) {
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
     *     {@link VehicleMonitoringServiceCapabilitiesStructure.RequestPolicy }
     *     
     */
    public VehicleMonitoringServiceCapabilitiesStructure.RequestPolicy getRequestPolicy() {
        return requestPolicy;
    }

    /**
     * Définit la valeur de la propriété requestPolicy.
     * 
     * @param value
     *     allowed object is
     *     {@link VehicleMonitoringServiceCapabilitiesStructure.RequestPolicy }
     *     
     */
    public void setRequestPolicy(VehicleMonitoringServiceCapabilitiesStructure.RequestPolicy value) {
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
     *     {@link VehicleMonitoringServiceCapabilitiesStructure.AccessControl }
     *     
     */
    public VehicleMonitoringServiceCapabilitiesStructure.AccessControl getAccessControl() {
        return accessControl;
    }

    /**
     * Définit la valeur de la propriété accessControl.
     * 
     * @param value
     *     allowed object is
     *     {@link VehicleMonitoringServiceCapabilitiesStructure.AccessControl }
     *     
     */
    public void setAccessControl(VehicleMonitoringServiceCapabilitiesStructure.AccessControl value) {
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
     *     {@link VehicleMonitoringServiceCapabilitiesStructure.ResponseFeatures }
     *     
     */
    public VehicleMonitoringServiceCapabilitiesStructure.ResponseFeatures getResponseFeatures() {
        return responseFeatures;
    }

    /**
     * Définit la valeur de la propriété responseFeatures.
     * 
     * @param value
     *     allowed object is
     *     {@link VehicleMonitoringServiceCapabilitiesStructure.ResponseFeatures }
     *     
     */
    public void setResponseFeatures(VehicleMonitoringServiceCapabilitiesStructure.ResponseFeatures value) {
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
     *         &lt;element name="CheckVehicleMonitoringRef" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
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
        "checkLineRef",
        "checkVehicleMonitoringRef"
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
        @XmlElement(name = "CheckVehicleMonitoringRef", defaultValue = "true")
        protected Boolean checkVehicleMonitoringRef;

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

        /**
         * Obtient la valeur de la propriété checkVehicleMonitoringRef.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isCheckVehicleMonitoringRef() {
            return checkVehicleMonitoringRef;
        }

        /**
         * Définit la valeur de la propriété checkVehicleMonitoringRef.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setCheckVehicleMonitoringRef(Boolean value) {
            this.checkVehicleMonitoringRef = value;
        }

        public boolean isSetCheckVehicleMonitoringRef() {
            return (this.checkVehicleMonitoringRef!= null);
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
     *         &lt;group ref="{http://www.siri.org.uk/siri}VehicleMonitoringVolumeGroup"/>
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
        "hasDetailLevel",
        "defaultDetailLevel",
        "hasMaximumVehicles",
        "hasMaximumNumberOfCalls",
        "hasNumberOfOnwardsCalls",
        "hasNumberOfPreviousCalls"
    })
    public static class RequestPolicy
        extends CapabilityRequestPolicyStructure
        implements Serializable
    {

        private final static long serialVersionUID = 1L;
        @XmlElement(name = "HasDetailLevel", defaultValue = "false")
        protected Boolean hasDetailLevel;
        @XmlElement(name = "DefaultDetailLevel", defaultValue = "normal")
        protected VehicleMonitoringDetailEnumeration defaultDetailLevel;
        @XmlElement(name = "HasMaximumVehicles", defaultValue = "true")
        protected Boolean hasMaximumVehicles;
        @XmlElement(name = "HasMaximumNumberOfCalls", defaultValue = "false")
        protected Boolean hasMaximumNumberOfCalls;
        @XmlElement(name = "HasNumberOfOnwardsCalls", defaultValue = "false")
        protected Boolean hasNumberOfOnwardsCalls;
        @XmlElement(name = "HasNumberOfPreviousCalls", defaultValue = "false")
        protected Boolean hasNumberOfPreviousCalls;

        /**
         * Obtient la valeur de la propriété hasDetailLevel.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isHasDetailLevel() {
            return hasDetailLevel;
        }

        /**
         * Définit la valeur de la propriété hasDetailLevel.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setHasDetailLevel(Boolean value) {
            this.hasDetailLevel = value;
        }

        public boolean isSetHasDetailLevel() {
            return (this.hasDetailLevel!= null);
        }

        /**
         * Obtient la valeur de la propriété defaultDetailLevel.
         * 
         * @return
         *     possible object is
         *     {@link VehicleMonitoringDetailEnumeration }
         *     
         */
        public VehicleMonitoringDetailEnumeration getDefaultDetailLevel() {
            return defaultDetailLevel;
        }

        /**
         * Définit la valeur de la propriété defaultDetailLevel.
         * 
         * @param value
         *     allowed object is
         *     {@link VehicleMonitoringDetailEnumeration }
         *     
         */
        public void setDefaultDetailLevel(VehicleMonitoringDetailEnumeration value) {
            this.defaultDetailLevel = value;
        }

        public boolean isSetDefaultDetailLevel() {
            return (this.defaultDetailLevel!= null);
        }

        /**
         * Obtient la valeur de la propriété hasMaximumVehicles.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isHasMaximumVehicles() {
            return hasMaximumVehicles;
        }

        /**
         * Définit la valeur de la propriété hasMaximumVehicles.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setHasMaximumVehicles(Boolean value) {
            this.hasMaximumVehicles = value;
        }

        public boolean isSetHasMaximumVehicles() {
            return (this.hasMaximumVehicles!= null);
        }

        /**
         * Obtient la valeur de la propriété hasMaximumNumberOfCalls.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isHasMaximumNumberOfCalls() {
            return hasMaximumNumberOfCalls;
        }

        /**
         * Définit la valeur de la propriété hasMaximumNumberOfCalls.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setHasMaximumNumberOfCalls(Boolean value) {
            this.hasMaximumNumberOfCalls = value;
        }

        public boolean isSetHasMaximumNumberOfCalls() {
            return (this.hasMaximumNumberOfCalls!= null);
        }

        /**
         * Obtient la valeur de la propriété hasNumberOfOnwardsCalls.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isHasNumberOfOnwardsCalls() {
            return hasNumberOfOnwardsCalls;
        }

        /**
         * Définit la valeur de la propriété hasNumberOfOnwardsCalls.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setHasNumberOfOnwardsCalls(Boolean value) {
            this.hasNumberOfOnwardsCalls = value;
        }

        public boolean isSetHasNumberOfOnwardsCalls() {
            return (this.hasNumberOfOnwardsCalls!= null);
        }

        /**
         * Obtient la valeur de la propriété hasNumberOfPreviousCalls.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isHasNumberOfPreviousCalls() {
            return hasNumberOfPreviousCalls;
        }

        /**
         * Définit la valeur de la propriété hasNumberOfPreviousCalls.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setHasNumberOfPreviousCalls(Boolean value) {
            this.hasNumberOfPreviousCalls = value;
        }

        public boolean isSetHasNumberOfPreviousCalls() {
            return (this.hasNumberOfPreviousCalls!= null);
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
     *         &lt;element name="HasLocation" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
     *         &lt;element name="HasSituations" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
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
        "hasLocation",
        "hasSituations"
    })
    public static class ResponseFeatures
        implements Serializable
    {

        private final static long serialVersionUID = 1L;
        @XmlElement(name = "HasLocation", defaultValue = "true")
        protected Boolean hasLocation;
        @XmlElement(name = "HasSituations", defaultValue = "false")
        protected Boolean hasSituations;

        /**
         * Obtient la valeur de la propriété hasLocation.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isHasLocation() {
            return hasLocation;
        }

        /**
         * Définit la valeur de la propriété hasLocation.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setHasLocation(Boolean value) {
            this.hasLocation = value;
        }

        public boolean isSetHasLocation() {
            return (this.hasLocation!= null);
        }

        /**
         * Obtient la valeur de la propriété hasSituations.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isHasSituations() {
            return hasSituations;
        }

        /**
         * Définit la valeur de la propriété hasSituations.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setHasSituations(Boolean value) {
            this.hasSituations = value;
        }

        public boolean isSetHasSituations() {
            return (this.hasSituations!= null);
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
     *         &lt;element name="FilterByVehicleMonitoringRef" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
     *         &lt;element ref="{http://www.siri.org.uk/siri}FilterByVehicleRef" minOccurs="0"/>
     *         &lt;element ref="{http://www.siri.org.uk/siri}FilterByLineRef" minOccurs="0"/>
     *         &lt;element ref="{http://www.siri.org.uk/siri}FilterByDirectionRef" minOccurs="0"/>
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
        "filterByVehicleMonitoringRef",
        "filterByVehicleRef",
        "filterByLineRef",
        "filterByDirectionRef"
    })
    public static class TopicFiltering
        implements Serializable
    {

        private final static long serialVersionUID = 1L;
        @XmlElement(name = "DefaultPreviewInterval", required = true, defaultValue = "PT60M")
        protected Duration defaultPreviewInterval;
        @XmlElement(name = "FilterByVehicleMonitoringRef")
        protected boolean filterByVehicleMonitoringRef;
        @XmlElement(name = "FilterByVehicleRef", defaultValue = "false")
        protected Boolean filterByVehicleRef;
        @XmlElement(name = "FilterByLineRef", defaultValue = "true")
        protected Boolean filterByLineRef;
        @XmlElement(name = "FilterByDirectionRef", defaultValue = "true")
        protected Boolean filterByDirectionRef;

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
         * Obtient la valeur de la propriété filterByVehicleMonitoringRef.
         * 
         */
        public boolean isFilterByVehicleMonitoringRef() {
            return filterByVehicleMonitoringRef;
        }

        /**
         * Définit la valeur de la propriété filterByVehicleMonitoringRef.
         * 
         */
        public void setFilterByVehicleMonitoringRef(boolean value) {
            this.filterByVehicleMonitoringRef = value;
        }

        public boolean isSetFilterByVehicleMonitoringRef() {
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
         * Obtient la valeur de la propriété filterByDirectionRef.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isFilterByDirectionRef() {
            return filterByDirectionRef;
        }

        /**
         * Définit la valeur de la propriété filterByDirectionRef.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setFilterByDirectionRef(Boolean value) {
            this.filterByDirectionRef = value;
        }

        public boolean isSetFilterByDirectionRef() {
            return (this.filterByDirectionRef!= null);
        }

    }

}
