
package uk.org.siri.siri;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Type for ProductionTimetable Capabilities.
 * 
 * <p>Classe Java pour ProductionTimetableServiceCapabilitiesStructure complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="ProductionTimetableServiceCapabilitiesStructure">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.siri.org.uk/siri}AbstractCapabilitiesStructure">
 *       &lt;sequence>
 *         &lt;element name="TopicFiltering" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element ref="{http://www.siri.org.uk/siri}FilterByValidityPeriod"/>
 *                   &lt;element ref="{http://www.siri.org.uk/siri}FilterByOperatorRef"/>
 *                   &lt;element ref="{http://www.siri.org.uk/siri}FilterByLineRef"/>
 *                   &lt;element name="FilterByVersionRef" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="RequestPolicy" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;extension base="{http://www.siri.org.uk/siri}CapabilityRequestPolicyStructure">
 *               &lt;/extension>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="SubscriptionPolicy" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="HasIncrementalUpdates" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="AccessControl" type="{http://www.siri.org.uk/siri}ConnectionCapabilityAccessControlStructure" minOccurs="0"/>
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
@XmlType(name = "ProductionTimetableServiceCapabilitiesStructure", propOrder = {
    "topicFiltering",
    "requestPolicy",
    "subscriptionPolicy",
    "accessControl",
    "extensions"
})
public class ProductionTimetableServiceCapabilitiesStructure
    extends AbstractCapabilitiesStructure
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "TopicFiltering")
    protected ProductionTimetableServiceCapabilitiesStructure.TopicFiltering topicFiltering;
    @XmlElement(name = "RequestPolicy")
    protected ProductionTimetableServiceCapabilitiesStructure.RequestPolicy requestPolicy;
    @XmlElement(name = "SubscriptionPolicy")
    protected ProductionTimetableServiceCapabilitiesStructure.SubscriptionPolicy subscriptionPolicy;
    @XmlElement(name = "AccessControl")
    protected ConnectionCapabilityAccessControlStructure accessControl;
    @XmlElement(name = "Extensions")
    protected ExtensionsStructure extensions;

    /**
     * Obtient la valeur de la propriété topicFiltering.
     * 
     * @return
     *     possible object is
     *     {@link ProductionTimetableServiceCapabilitiesStructure.TopicFiltering }
     *     
     */
    public ProductionTimetableServiceCapabilitiesStructure.TopicFiltering getTopicFiltering() {
        return topicFiltering;
    }

    /**
     * Définit la valeur de la propriété topicFiltering.
     * 
     * @param value
     *     allowed object is
     *     {@link ProductionTimetableServiceCapabilitiesStructure.TopicFiltering }
     *     
     */
    public void setTopicFiltering(ProductionTimetableServiceCapabilitiesStructure.TopicFiltering value) {
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
     *     {@link ProductionTimetableServiceCapabilitiesStructure.RequestPolicy }
     *     
     */
    public ProductionTimetableServiceCapabilitiesStructure.RequestPolicy getRequestPolicy() {
        return requestPolicy;
    }

    /**
     * Définit la valeur de la propriété requestPolicy.
     * 
     * @param value
     *     allowed object is
     *     {@link ProductionTimetableServiceCapabilitiesStructure.RequestPolicy }
     *     
     */
    public void setRequestPolicy(ProductionTimetableServiceCapabilitiesStructure.RequestPolicy value) {
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
     *     {@link ProductionTimetableServiceCapabilitiesStructure.SubscriptionPolicy }
     *     
     */
    public ProductionTimetableServiceCapabilitiesStructure.SubscriptionPolicy getSubscriptionPolicy() {
        return subscriptionPolicy;
    }

    /**
     * Définit la valeur de la propriété subscriptionPolicy.
     * 
     * @param value
     *     allowed object is
     *     {@link ProductionTimetableServiceCapabilitiesStructure.SubscriptionPolicy }
     *     
     */
    public void setSubscriptionPolicy(ProductionTimetableServiceCapabilitiesStructure.SubscriptionPolicy value) {
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
     *     {@link ConnectionCapabilityAccessControlStructure }
     *     
     */
    public ConnectionCapabilityAccessControlStructure getAccessControl() {
        return accessControl;
    }

    /**
     * Définit la valeur de la propriété accessControl.
     * 
     * @param value
     *     allowed object is
     *     {@link ConnectionCapabilityAccessControlStructure }
     *     
     */
    public void setAccessControl(ConnectionCapabilityAccessControlStructure value) {
        this.accessControl = value;
    }

    public boolean isSetAccessControl() {
        return (this.accessControl!= null);
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
     *     &lt;extension base="{http://www.siri.org.uk/siri}CapabilityRequestPolicyStructure">
     *     &lt;/extension>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class RequestPolicy
        extends CapabilityRequestPolicyStructure
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
     *         &lt;element name="HasIncrementalUpdates" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
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
        "hasIncrementalUpdates"
    })
    public static class SubscriptionPolicy
        implements Serializable
    {

        private final static long serialVersionUID = 1L;
        @XmlElement(name = "HasIncrementalUpdates", defaultValue = "true")
        protected boolean hasIncrementalUpdates;

        /**
         * Obtient la valeur de la propriété hasIncrementalUpdates.
         * 
         */
        public boolean isHasIncrementalUpdates() {
            return hasIncrementalUpdates;
        }

        /**
         * Définit la valeur de la propriété hasIncrementalUpdates.
         * 
         */
        public void setHasIncrementalUpdates(boolean value) {
            this.hasIncrementalUpdates = value;
        }

        public boolean isSetHasIncrementalUpdates() {
            return true;
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
     *         &lt;element ref="{http://www.siri.org.uk/siri}FilterByValidityPeriod"/>
     *         &lt;element ref="{http://www.siri.org.uk/siri}FilterByOperatorRef"/>
     *         &lt;element ref="{http://www.siri.org.uk/siri}FilterByLineRef"/>
     *         &lt;element name="FilterByVersionRef" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
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
        "filterByValidityPeriod",
        "filterByOperatorRef",
        "filterByLineRef",
        "filterByVersionRef"
    })
    public static class TopicFiltering
        implements Serializable
    {

        private final static long serialVersionUID = 1L;
        @XmlElement(name = "FilterByValidityPeriod", defaultValue = "true")
        protected boolean filterByValidityPeriod;
        @XmlElement(name = "FilterByOperatorRef", defaultValue = "true")
        protected boolean filterByOperatorRef;
        @XmlElement(name = "FilterByLineRef", defaultValue = "true")
        protected boolean filterByLineRef;
        @XmlElement(name = "FilterByVersionRef", defaultValue = "true")
        protected boolean filterByVersionRef;

        /**
         * Obtient la valeur de la propriété filterByValidityPeriod.
         * 
         */
        public boolean isFilterByValidityPeriod() {
            return filterByValidityPeriod;
        }

        /**
         * Définit la valeur de la propriété filterByValidityPeriod.
         * 
         */
        public void setFilterByValidityPeriod(boolean value) {
            this.filterByValidityPeriod = value;
        }

        public boolean isSetFilterByValidityPeriod() {
            return true;
        }

        /**
         * Obtient la valeur de la propriété filterByOperatorRef.
         * 
         */
        public boolean isFilterByOperatorRef() {
            return filterByOperatorRef;
        }

        /**
         * Définit la valeur de la propriété filterByOperatorRef.
         * 
         */
        public void setFilterByOperatorRef(boolean value) {
            this.filterByOperatorRef = value;
        }

        public boolean isSetFilterByOperatorRef() {
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
         * Obtient la valeur de la propriété filterByVersionRef.
         * 
         */
        public boolean isFilterByVersionRef() {
            return filterByVersionRef;
        }

        /**
         * Définit la valeur de la propriété filterByVersionRef.
         * 
         */
        public void setFilterByVersionRef(boolean value) {
            this.filterByVersionRef = value;
        }

        public boolean isSetFilterByVersionRef() {
            return true;
        }

    }

}
