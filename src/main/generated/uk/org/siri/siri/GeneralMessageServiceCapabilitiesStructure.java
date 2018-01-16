
package uk.org.siri.siri;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.Duration;


/**
 * Type for General Message Capabilities.
 * 
 * <p>Classe Java pour GeneralMessageServiceCapabilitiesStructure complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="GeneralMessageServiceCapabilitiesStructure">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.siri.org.uk/siri}AbstractCapabilitiesStructure">
 *       &lt;sequence>
 *         &lt;element name="TopicFiltering" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="DefaultPreviewInterval" type="{http://www.siri.org.uk/siri}PositiveDurationType"/>
 *                   &lt;element name="FilterByInfoChannel" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="RequestPolicy" type="{http://www.siri.org.uk/siri}CapabilityRequestPolicyStructure" minOccurs="0"/>
 *         &lt;element name="AccessControl" type="{http://www.siri.org.uk/siri}GeneralMessageCapabilityAccessControlStructure" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GeneralMessageServiceCapabilitiesStructure", propOrder = {
    "topicFiltering",
    "requestPolicy",
    "accessControl"
})
public class GeneralMessageServiceCapabilitiesStructure
    extends AbstractCapabilitiesStructure
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "TopicFiltering")
    protected GeneralMessageServiceCapabilitiesStructure.TopicFiltering topicFiltering;
    @XmlElement(name = "RequestPolicy")
    protected CapabilityRequestPolicyStructure requestPolicy;
    @XmlElement(name = "AccessControl")
    protected GeneralMessageCapabilityAccessControlStructure accessControl;

    /**
     * Obtient la valeur de la propriété topicFiltering.
     * 
     * @return
     *     possible object is
     *     {@link GeneralMessageServiceCapabilitiesStructure.TopicFiltering }
     *     
     */
    public GeneralMessageServiceCapabilitiesStructure.TopicFiltering getTopicFiltering() {
        return topicFiltering;
    }

    /**
     * Définit la valeur de la propriété topicFiltering.
     * 
     * @param value
     *     allowed object is
     *     {@link GeneralMessageServiceCapabilitiesStructure.TopicFiltering }
     *     
     */
    public void setTopicFiltering(GeneralMessageServiceCapabilitiesStructure.TopicFiltering value) {
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
     *     {@link CapabilityRequestPolicyStructure }
     *     
     */
    public CapabilityRequestPolicyStructure getRequestPolicy() {
        return requestPolicy;
    }

    /**
     * Définit la valeur de la propriété requestPolicy.
     * 
     * @param value
     *     allowed object is
     *     {@link CapabilityRequestPolicyStructure }
     *     
     */
    public void setRequestPolicy(CapabilityRequestPolicyStructure value) {
        this.requestPolicy = value;
    }

    public boolean isSetRequestPolicy() {
        return (this.requestPolicy!= null);
    }

    /**
     * Obtient la valeur de la propriété accessControl.
     * 
     * @return
     *     possible object is
     *     {@link GeneralMessageCapabilityAccessControlStructure }
     *     
     */
    public GeneralMessageCapabilityAccessControlStructure getAccessControl() {
        return accessControl;
    }

    /**
     * Définit la valeur de la propriété accessControl.
     * 
     * @param value
     *     allowed object is
     *     {@link GeneralMessageCapabilityAccessControlStructure }
     *     
     */
    public void setAccessControl(GeneralMessageCapabilityAccessControlStructure value) {
        this.accessControl = value;
    }

    public boolean isSetAccessControl() {
        return (this.accessControl!= null);
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
     *         &lt;element name="FilterByInfoChannel" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
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
        "filterByInfoChannel"
    })
    public static class TopicFiltering
        implements Serializable
    {

        private final static long serialVersionUID = 1L;
        @XmlElement(name = "DefaultPreviewInterval", required = true, defaultValue = "PT60M")
        protected Duration defaultPreviewInterval;
        @XmlElement(name = "FilterByInfoChannel", defaultValue = "true")
        protected Boolean filterByInfoChannel;

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
         * Obtient la valeur de la propriété filterByInfoChannel.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isFilterByInfoChannel() {
            return filterByInfoChannel;
        }

        /**
         * Définit la valeur de la propriété filterByInfoChannel.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setFilterByInfoChannel(Boolean value) {
            this.filterByInfoChannel = value;
        }

        public boolean isSetFilterByInfoChannel() {
            return (this.filterByInfoChannel!= null);
        }

    }

}
