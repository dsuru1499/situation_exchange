
package uk.org.siri.siri;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Type for Connection Timetable Capabilities.
 * 
 * <p>Classe Java pour ConnectionTimetableServiceCapabilitiesStructure complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="ConnectionTimetableServiceCapabilitiesStructure">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.siri.org.uk/siri}AbstractCapabilitiesStructure">
 *       &lt;sequence>
 *         &lt;element name="TopicFiltering" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element ref="{http://www.siri.org.uk/siri}FilterByLineRef"/>
 *                   &lt;element ref="{http://www.siri.org.uk/siri}FilterByConnectionLinkRef"/>
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
 *                   &lt;element name="ForeignJourneysOnly" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/extension>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="SubscriptionPolicy" type="{http://www.siri.org.uk/siri}CapabilitySubscriptionPolicyStructure" minOccurs="0"/>
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
@XmlType(name = "ConnectionTimetableServiceCapabilitiesStructure", propOrder = {
    "topicFiltering",
    "requestPolicy",
    "subscriptionPolicy",
    "accessControl",
    "extensions"
})
public class ConnectionTimetableServiceCapabilitiesStructure
    extends AbstractCapabilitiesStructure
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "TopicFiltering")
    protected ConnectionTimetableServiceCapabilitiesStructure.TopicFiltering topicFiltering;
    @XmlElement(name = "RequestPolicy")
    protected ConnectionTimetableServiceCapabilitiesStructure.RequestPolicy requestPolicy;
    @XmlElement(name = "SubscriptionPolicy")
    protected CapabilitySubscriptionPolicyStructure subscriptionPolicy;
    @XmlElement(name = "AccessControl")
    protected ConnectionCapabilityAccessControlStructure accessControl;
    @XmlElement(name = "Extensions")
    protected ExtensionsStructure extensions;

    /**
     * Obtient la valeur de la propriété topicFiltering.
     * 
     * @return
     *     possible object is
     *     {@link ConnectionTimetableServiceCapabilitiesStructure.TopicFiltering }
     *     
     */
    public ConnectionTimetableServiceCapabilitiesStructure.TopicFiltering getTopicFiltering() {
        return topicFiltering;
    }

    /**
     * Définit la valeur de la propriété topicFiltering.
     * 
     * @param value
     *     allowed object is
     *     {@link ConnectionTimetableServiceCapabilitiesStructure.TopicFiltering }
     *     
     */
    public void setTopicFiltering(ConnectionTimetableServiceCapabilitiesStructure.TopicFiltering value) {
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
     *     {@link ConnectionTimetableServiceCapabilitiesStructure.RequestPolicy }
     *     
     */
    public ConnectionTimetableServiceCapabilitiesStructure.RequestPolicy getRequestPolicy() {
        return requestPolicy;
    }

    /**
     * Définit la valeur de la propriété requestPolicy.
     * 
     * @param value
     *     allowed object is
     *     {@link ConnectionTimetableServiceCapabilitiesStructure.RequestPolicy }
     *     
     */
    public void setRequestPolicy(ConnectionTimetableServiceCapabilitiesStructure.RequestPolicy value) {
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
     *       &lt;sequence>
     *         &lt;element name="ForeignJourneysOnly" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
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
        "foreignJourneysOnly"
    })
    public static class RequestPolicy
        extends CapabilityRequestPolicyStructure
        implements Serializable
    {

        private final static long serialVersionUID = 1L;
        @XmlElement(name = "ForeignJourneysOnly", defaultValue = "false")
        protected Boolean foreignJourneysOnly;

        /**
         * Obtient la valeur de la propriété foreignJourneysOnly.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isForeignJourneysOnly() {
            return foreignJourneysOnly;
        }

        /**
         * Définit la valeur de la propriété foreignJourneysOnly.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setForeignJourneysOnly(Boolean value) {
            this.foreignJourneysOnly = value;
        }

        public boolean isSetForeignJourneysOnly() {
            return (this.foreignJourneysOnly!= null);
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
     *         &lt;element ref="{http://www.siri.org.uk/siri}FilterByLineRef"/>
     *         &lt;element ref="{http://www.siri.org.uk/siri}FilterByConnectionLinkRef"/>
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
        "filterByLineRef",
        "filterByConnectionLinkRef"
    })
    public static class TopicFiltering
        implements Serializable
    {

        private final static long serialVersionUID = 1L;
        @XmlElement(name = "FilterByLineRef", defaultValue = "true")
        protected boolean filterByLineRef;
        @XmlElement(name = "FilterByConnectionLinkRef", defaultValue = "true")
        protected boolean filterByConnectionLinkRef;

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
         * Whether results can be filtered by Connection link. Default is ' true'.
         * 
         */
        public boolean isFilterByConnectionLinkRef() {
            return filterByConnectionLinkRef;
        }

        /**
         * Définit la valeur de la propriété filterByConnectionLinkRef.
         * 
         */
        public void setFilterByConnectionLinkRef(boolean value) {
            this.filterByConnectionLinkRef = value;
        }

        public boolean isSetFilterByConnectionLinkRef() {
            return true;
        }

    }

}
