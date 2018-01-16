
package uk.org.siri.siri;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.Duration;


/**
 * Type for Stop Monitoring Capabilities.
 * 
 * <p>Classe Java pour StopMonitoringServiceCapabilitiesStructure complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="StopMonitoringServiceCapabilitiesStructure">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.siri.org.uk/siri}AbstractCapabilitiesStructure">
 *       &lt;sequence>
 *         &lt;element name="TopicFiltering" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="DefaultPreviewInterval" type="{http://www.siri.org.uk/siri}PositiveDurationType"/>
 *                   &lt;element name="ByStartTime" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *                   &lt;element ref="{http://www.siri.org.uk/siri}FilterByMonitoringRef"/>
 *                   &lt;element ref="{http://www.siri.org.uk/siri}FilterByLineRef"/>
 *                   &lt;element ref="{http://www.siri.org.uk/siri}FilterByDirectionRef" minOccurs="0"/>
 *                   &lt;element ref="{http://www.siri.org.uk/siri}FilterByDestination" minOccurs="0"/>
 *                   &lt;element name="FilterByVisitType" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="RequestPolicy" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;extension base="{http://www.siri.org.uk/siri}StopMonitoringCapabilityRequestPolicyStructure">
 *                 &lt;sequence>
 *                   &lt;group ref="{http://www.siri.org.uk/siri}StopMonitoringVolumeGroup"/>
 *                 &lt;/sequence>
 *               &lt;/extension>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="SubscriptionPolicy" type="{http://www.siri.org.uk/siri}CapabilitySubscriptionPolicyStructure" minOccurs="0"/>
 *         &lt;element name="AccessControl" type="{http://www.siri.org.uk/siri}MonitoringCapabilityAccessControlStructure" minOccurs="0"/>
 *         &lt;element name="ResponseFeatures" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="HasLineNotices" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *                   &lt;element name="HasSituations" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "StopMonitoringServiceCapabilitiesStructure", propOrder = {
    "topicFiltering",
    "requestPolicy",
    "subscriptionPolicy",
    "accessControl",
    "responseFeatures"
})
public class StopMonitoringServiceCapabilitiesStructure
    extends AbstractCapabilitiesStructure
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "TopicFiltering")
    protected StopMonitoringServiceCapabilitiesStructure.TopicFiltering topicFiltering;
    @XmlElement(name = "RequestPolicy")
    protected StopMonitoringServiceCapabilitiesStructure.RequestPolicy requestPolicy;
    @XmlElement(name = "SubscriptionPolicy")
    protected CapabilitySubscriptionPolicyStructure subscriptionPolicy;
    @XmlElement(name = "AccessControl")
    protected MonitoringCapabilityAccessControlStructure accessControl;
    @XmlElement(name = "ResponseFeatures")
    protected StopMonitoringServiceCapabilitiesStructure.ResponseFeatures responseFeatures;

    /**
     * Obtient la valeur de la propriété topicFiltering.
     * 
     * @return
     *     possible object is
     *     {@link StopMonitoringServiceCapabilitiesStructure.TopicFiltering }
     *     
     */
    public StopMonitoringServiceCapabilitiesStructure.TopicFiltering getTopicFiltering() {
        return topicFiltering;
    }

    /**
     * Définit la valeur de la propriété topicFiltering.
     * 
     * @param value
     *     allowed object is
     *     {@link StopMonitoringServiceCapabilitiesStructure.TopicFiltering }
     *     
     */
    public void setTopicFiltering(StopMonitoringServiceCapabilitiesStructure.TopicFiltering value) {
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
     *     {@link StopMonitoringServiceCapabilitiesStructure.RequestPolicy }
     *     
     */
    public StopMonitoringServiceCapabilitiesStructure.RequestPolicy getRequestPolicy() {
        return requestPolicy;
    }

    /**
     * Définit la valeur de la propriété requestPolicy.
     * 
     * @param value
     *     allowed object is
     *     {@link StopMonitoringServiceCapabilitiesStructure.RequestPolicy }
     *     
     */
    public void setRequestPolicy(StopMonitoringServiceCapabilitiesStructure.RequestPolicy value) {
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
     *     {@link MonitoringCapabilityAccessControlStructure }
     *     
     */
    public MonitoringCapabilityAccessControlStructure getAccessControl() {
        return accessControl;
    }

    /**
     * Définit la valeur de la propriété accessControl.
     * 
     * @param value
     *     allowed object is
     *     {@link MonitoringCapabilityAccessControlStructure }
     *     
     */
    public void setAccessControl(MonitoringCapabilityAccessControlStructure value) {
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
     *     {@link StopMonitoringServiceCapabilitiesStructure.ResponseFeatures }
     *     
     */
    public StopMonitoringServiceCapabilitiesStructure.ResponseFeatures getResponseFeatures() {
        return responseFeatures;
    }

    /**
     * Définit la valeur de la propriété responseFeatures.
     * 
     * @param value
     *     allowed object is
     *     {@link StopMonitoringServiceCapabilitiesStructure.ResponseFeatures }
     *     
     */
    public void setResponseFeatures(StopMonitoringServiceCapabilitiesStructure.ResponseFeatures value) {
        this.responseFeatures = value;
    }

    public boolean isSetResponseFeatures() {
        return (this.responseFeatures!= null);
    }


    /**
     * <p>Classe Java pour anonymous complex type.
     * 
     * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;extension base="{http://www.siri.org.uk/siri}StopMonitoringCapabilityRequestPolicyStructure">
     *       &lt;sequence>
     *         &lt;group ref="{http://www.siri.org.uk/siri}StopMonitoringVolumeGroup"/>
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
        "hasMaximumVisits",
        "hasMinimumVisitsPerLine",
        "hasMinimumVisitsPerVia",
        "hasNumberOfOnwardsCalls",
        "hasNumberOfPreviousCalls"
    })
    public static class RequestPolicy
        extends StopMonitoringCapabilityRequestPolicyStructure
        implements Serializable
    {

        private final static long serialVersionUID = 1L;
        @XmlElement(name = "HasDetailLevel", defaultValue = "false")
        protected Boolean hasDetailLevel;
        @XmlElement(name = "DefaultDetailLevel", defaultValue = "normal")
        protected StopMonitoringDetailEnumeration defaultDetailLevel;
        @XmlElement(name = "HasMaximumVisits", defaultValue = "true")
        protected Boolean hasMaximumVisits;
        @XmlElement(name = "HasMinimumVisitsPerLine", defaultValue = "true")
        protected Boolean hasMinimumVisitsPerLine;
        @XmlElement(name = "HasMinimumVisitsPerVia", defaultValue = "false")
        protected Boolean hasMinimumVisitsPerVia;
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
         *     {@link StopMonitoringDetailEnumeration }
         *     
         */
        public StopMonitoringDetailEnumeration getDefaultDetailLevel() {
            return defaultDetailLevel;
        }

        /**
         * Définit la valeur de la propriété defaultDetailLevel.
         * 
         * @param value
         *     allowed object is
         *     {@link StopMonitoringDetailEnumeration }
         *     
         */
        public void setDefaultDetailLevel(StopMonitoringDetailEnumeration value) {
            this.defaultDetailLevel = value;
        }

        public boolean isSetDefaultDetailLevel() {
            return (this.defaultDetailLevel!= null);
        }

        /**
         * Obtient la valeur de la propriété hasMaximumVisits.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isHasMaximumVisits() {
            return hasMaximumVisits;
        }

        /**
         * Définit la valeur de la propriété hasMaximumVisits.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setHasMaximumVisits(Boolean value) {
            this.hasMaximumVisits = value;
        }

        public boolean isSetHasMaximumVisits() {
            return (this.hasMaximumVisits!= null);
        }

        /**
         * Obtient la valeur de la propriété hasMinimumVisitsPerLine.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isHasMinimumVisitsPerLine() {
            return hasMinimumVisitsPerLine;
        }

        /**
         * Définit la valeur de la propriété hasMinimumVisitsPerLine.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setHasMinimumVisitsPerLine(Boolean value) {
            this.hasMinimumVisitsPerLine = value;
        }

        public boolean isSetHasMinimumVisitsPerLine() {
            return (this.hasMinimumVisitsPerLine!= null);
        }

        /**
         * Obtient la valeur de la propriété hasMinimumVisitsPerVia.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isHasMinimumVisitsPerVia() {
            return hasMinimumVisitsPerVia;
        }

        /**
         * Définit la valeur de la propriété hasMinimumVisitsPerVia.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setHasMinimumVisitsPerVia(Boolean value) {
            this.hasMinimumVisitsPerVia = value;
        }

        public boolean isSetHasMinimumVisitsPerVia() {
            return (this.hasMinimumVisitsPerVia!= null);
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
     *         &lt;element name="HasLineNotices" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
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
        "hasLineNotices",
        "hasSituations"
    })
    public static class ResponseFeatures
        implements Serializable
    {

        private final static long serialVersionUID = 1L;
        @XmlElement(name = "HasLineNotices", defaultValue = "true")
        protected Boolean hasLineNotices;
        @XmlElement(name = "HasSituations", defaultValue = "false")
        protected Boolean hasSituations;

        /**
         * Obtient la valeur de la propriété hasLineNotices.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isHasLineNotices() {
            return hasLineNotices;
        }

        /**
         * Définit la valeur de la propriété hasLineNotices.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setHasLineNotices(Boolean value) {
            this.hasLineNotices = value;
        }

        public boolean isSetHasLineNotices() {
            return (this.hasLineNotices!= null);
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
     *         &lt;element name="ByStartTime" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
     *         &lt;element ref="{http://www.siri.org.uk/siri}FilterByMonitoringRef"/>
     *         &lt;element ref="{http://www.siri.org.uk/siri}FilterByLineRef"/>
     *         &lt;element ref="{http://www.siri.org.uk/siri}FilterByDirectionRef" minOccurs="0"/>
     *         &lt;element ref="{http://www.siri.org.uk/siri}FilterByDestination" minOccurs="0"/>
     *         &lt;element name="FilterByVisitType" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
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
        "byStartTime",
        "filterByMonitoringRef",
        "filterByLineRef",
        "filterByDirectionRef",
        "filterByDestination",
        "filterByVisitType"
    })
    public static class TopicFiltering
        implements Serializable
    {

        private final static long serialVersionUID = 1L;
        @XmlElement(name = "DefaultPreviewInterval", required = true, defaultValue = "PT60M")
        protected Duration defaultPreviewInterval;
        @XmlElement(name = "ByStartTime", defaultValue = "true")
        protected Boolean byStartTime;
        @XmlElement(name = "FilterByMonitoringRef")
        protected boolean filterByMonitoringRef;
        @XmlElement(name = "FilterByLineRef", defaultValue = "true")
        protected boolean filterByLineRef;
        @XmlElement(name = "FilterByDirectionRef", defaultValue = "true")
        protected Boolean filterByDirectionRef;
        @XmlElement(name = "FilterByDestination", defaultValue = "false")
        protected Boolean filterByDestination;
        @XmlElement(name = "FilterByVisitType", defaultValue = "true")
        protected Boolean filterByVisitType;

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
         * Obtient la valeur de la propriété byStartTime.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isByStartTime() {
            return byStartTime;
        }

        /**
         * Définit la valeur de la propriété byStartTime.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setByStartTime(Boolean value) {
            this.byStartTime = value;
        }

        public boolean isSetByStartTime() {
            return (this.byStartTime!= null);
        }

        /**
         * Obtient la valeur de la propriété filterByMonitoringRef.
         * 
         */
        public boolean isFilterByMonitoringRef() {
            return filterByMonitoringRef;
        }

        /**
         * Définit la valeur de la propriété filterByMonitoringRef.
         * 
         */
        public void setFilterByMonitoringRef(boolean value) {
            this.filterByMonitoringRef = value;
        }

        public boolean isSetFilterByMonitoringRef() {
            return true;
        }

        /**
         * Obtient la valeur de la propriété filterByLineRef.
         * 
         */
        public boolean isFilterByLineRef() {
            return filterByLineRef;
        }

        /**
         * Définit la valeur de la propriété filterByLineRef.
         * 
         */
        public void setFilterByLineRef(boolean value) {
            this.filterByLineRef = value;
        }

        public boolean isSetFilterByLineRef() {
            return true;
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

        /**
         * Obtient la valeur de la propriété filterByDestination.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isFilterByDestination() {
            return filterByDestination;
        }

        /**
         * Définit la valeur de la propriété filterByDestination.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setFilterByDestination(Boolean value) {
            this.filterByDestination = value;
        }

        public boolean isSetFilterByDestination() {
            return (this.filterByDestination!= null);
        }

        /**
         * Obtient la valeur de la propriété filterByVisitType.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isFilterByVisitType() {
            return filterByVisitType;
        }

        /**
         * Définit la valeur de la propriété filterByVisitType.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setFilterByVisitType(Boolean value) {
            this.filterByVisitType = value;
        }

        public boolean isSetFilterByVisitType() {
            return (this.filterByVisitType!= null);
        }

    }

}
