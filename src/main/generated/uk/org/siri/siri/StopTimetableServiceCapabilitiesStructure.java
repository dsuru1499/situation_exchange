
package uk.org.siri.siri;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Type for Capabilities of Stop Timetable Service.
 * 
 * <p>Classe Java pour StopTimetableServiceCapabilitiesStructure complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="StopTimetableServiceCapabilitiesStructure">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.siri.org.uk/siri}AbstractCapabilitiesStructure">
 *       &lt;sequence>
 *         &lt;element name="TopicFiltering" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element ref="{http://www.siri.org.uk/siri}FilterByMonitoringRef"/>
 *                   &lt;element ref="{http://www.siri.org.uk/siri}FilterByLineRef"/>
 *                   &lt;element ref="{http://www.siri.org.uk/siri}FilterByDirectionRef" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="RequestPolicy" type="{http://www.siri.org.uk/siri}StopTimetableCapabilityRequestPolicyStructure" minOccurs="0"/>
 *         &lt;element name="AccessControl" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;extension base="{http://www.siri.org.uk/siri}CapabilityAccessControlStructure">
 *                 &lt;sequence>
 *                   &lt;element ref="{http://www.siri.org.uk/siri}CheckOperatorRef" minOccurs="0"/>
 *                   &lt;element ref="{http://www.siri.org.uk/siri}CheckLineRef" minOccurs="0"/>
 *                   &lt;element ref="{http://www.siri.org.uk/siri}CheckMonitoringRef" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/extension>
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
@XmlType(name = "StopTimetableServiceCapabilitiesStructure", propOrder = {
    "topicFiltering",
    "requestPolicy",
    "accessControl",
    "extensions"
})
public class StopTimetableServiceCapabilitiesStructure
    extends AbstractCapabilitiesStructure
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "TopicFiltering")
    protected StopTimetableServiceCapabilitiesStructure.TopicFiltering topicFiltering;
    @XmlElement(name = "RequestPolicy")
    protected StopTimetableCapabilityRequestPolicyStructure requestPolicy;
    @XmlElement(name = "AccessControl")
    protected StopTimetableServiceCapabilitiesStructure.AccessControl accessControl;
    @XmlElement(name = "Extensions")
    protected ExtensionsStructure extensions;

    /**
     * Obtient la valeur de la propriété topicFiltering.
     * 
     * @return
     *     possible object is
     *     {@link StopTimetableServiceCapabilitiesStructure.TopicFiltering }
     *     
     */
    public StopTimetableServiceCapabilitiesStructure.TopicFiltering getTopicFiltering() {
        return topicFiltering;
    }

    /**
     * Définit la valeur de la propriété topicFiltering.
     * 
     * @param value
     *     allowed object is
     *     {@link StopTimetableServiceCapabilitiesStructure.TopicFiltering }
     *     
     */
    public void setTopicFiltering(StopTimetableServiceCapabilitiesStructure.TopicFiltering value) {
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
     *     {@link StopTimetableCapabilityRequestPolicyStructure }
     *     
     */
    public StopTimetableCapabilityRequestPolicyStructure getRequestPolicy() {
        return requestPolicy;
    }

    /**
     * Définit la valeur de la propriété requestPolicy.
     * 
     * @param value
     *     allowed object is
     *     {@link StopTimetableCapabilityRequestPolicyStructure }
     *     
     */
    public void setRequestPolicy(StopTimetableCapabilityRequestPolicyStructure value) {
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
     *     {@link StopTimetableServiceCapabilitiesStructure.AccessControl }
     *     
     */
    public StopTimetableServiceCapabilitiesStructure.AccessControl getAccessControl() {
        return accessControl;
    }

    /**
     * Définit la valeur de la propriété accessControl.
     * 
     * @param value
     *     allowed object is
     *     {@link StopTimetableServiceCapabilitiesStructure.AccessControl }
     *     
     */
    public void setAccessControl(StopTimetableServiceCapabilitiesStructure.AccessControl value) {
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
     *     &lt;extension base="{http://www.siri.org.uk/siri}CapabilityAccessControlStructure">
     *       &lt;sequence>
     *         &lt;element ref="{http://www.siri.org.uk/siri}CheckOperatorRef" minOccurs="0"/>
     *         &lt;element ref="{http://www.siri.org.uk/siri}CheckLineRef" minOccurs="0"/>
     *         &lt;element ref="{http://www.siri.org.uk/siri}CheckMonitoringRef" minOccurs="0"/>
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
        "checkMonitoringRef"
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
        @XmlElement(name = "CheckMonitoringRef", defaultValue = "true")
        protected Boolean checkMonitoringRef;

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
         * Obtient la valeur de la propriété checkMonitoringRef.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isCheckMonitoringRef() {
            return checkMonitoringRef;
        }

        /**
         * Définit la valeur de la propriété checkMonitoringRef.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setCheckMonitoringRef(Boolean value) {
            this.checkMonitoringRef = value;
        }

        public boolean isSetCheckMonitoringRef() {
            return (this.checkMonitoringRef!= null);
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
     *         &lt;element ref="{http://www.siri.org.uk/siri}FilterByMonitoringRef"/>
     *         &lt;element ref="{http://www.siri.org.uk/siri}FilterByLineRef"/>
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
        "filterByMonitoringRef",
        "filterByLineRef",
        "filterByDirectionRef"
    })
    public static class TopicFiltering
        implements Serializable
    {

        private final static long serialVersionUID = 1L;
        @XmlElement(name = "FilterByMonitoringRef")
        protected boolean filterByMonitoringRef;
        @XmlElement(name = "FilterByLineRef", defaultValue = "true")
        protected boolean filterByLineRef;
        @XmlElement(name = "FilterByDirectionRef", defaultValue = "true")
        protected Boolean filterByDirectionRef;

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

    }

}
