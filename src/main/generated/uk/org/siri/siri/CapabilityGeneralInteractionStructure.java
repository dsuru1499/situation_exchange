
package uk.org.siri.siri;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Type for Common Request Policy capabilities.
 * 
 * <p>Classe Java pour CapabilityGeneralInteractionStructure complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="CapabilityGeneralInteractionStructure">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Interaction">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="RequestResponse" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *                   &lt;element name="PublishSubscribe" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="Delivery">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="DirectDelivery" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *                   &lt;element name="FetchedDelivery" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="MultipartDespatch" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="MultipleSubscriberFilter" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="HasConfirmDelivery" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="HasHeartbeat" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="VisitNumberisOrder" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CapabilityGeneralInteractionStructure", propOrder = {
    "interaction",
    "delivery",
    "multipartDespatch",
    "multipleSubscriberFilter",
    "hasConfirmDelivery",
    "hasHeartbeat",
    "visitNumberisOrder"
})
public class CapabilityGeneralInteractionStructure
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "Interaction", required = true)
    protected CapabilityGeneralInteractionStructure.Interaction interaction;
    @XmlElement(name = "Delivery", required = true)
    protected CapabilityGeneralInteractionStructure.Delivery delivery;
    @XmlElement(name = "MultipartDespatch", defaultValue = "true")
    protected boolean multipartDespatch;
    @XmlElement(name = "MultipleSubscriberFilter", defaultValue = "false")
    protected boolean multipleSubscriberFilter;
    @XmlElement(name = "HasConfirmDelivery", defaultValue = "false")
    protected boolean hasConfirmDelivery;
    @XmlElement(name = "HasHeartbeat", defaultValue = "false")
    protected boolean hasHeartbeat;
    @XmlElement(name = "VisitNumberisOrder", defaultValue = "false")
    protected Boolean visitNumberisOrder;

    /**
     * Obtient la valeur de la propriété interaction.
     * 
     * @return
     *     possible object is
     *     {@link CapabilityGeneralInteractionStructure.Interaction }
     *     
     */
    public CapabilityGeneralInteractionStructure.Interaction getInteraction() {
        return interaction;
    }

    /**
     * Définit la valeur de la propriété interaction.
     * 
     * @param value
     *     allowed object is
     *     {@link CapabilityGeneralInteractionStructure.Interaction }
     *     
     */
    public void setInteraction(CapabilityGeneralInteractionStructure.Interaction value) {
        this.interaction = value;
    }

    public boolean isSetInteraction() {
        return (this.interaction!= null);
    }

    /**
     * Obtient la valeur de la propriété delivery.
     * 
     * @return
     *     possible object is
     *     {@link CapabilityGeneralInteractionStructure.Delivery }
     *     
     */
    public CapabilityGeneralInteractionStructure.Delivery getDelivery() {
        return delivery;
    }

    /**
     * Définit la valeur de la propriété delivery.
     * 
     * @param value
     *     allowed object is
     *     {@link CapabilityGeneralInteractionStructure.Delivery }
     *     
     */
    public void setDelivery(CapabilityGeneralInteractionStructure.Delivery value) {
        this.delivery = value;
    }

    public boolean isSetDelivery() {
        return (this.delivery!= null);
    }

    /**
     * Obtient la valeur de la propriété multipartDespatch.
     * 
     */
    public boolean isMultipartDespatch() {
        return multipartDespatch;
    }

    /**
     * Définit la valeur de la propriété multipartDespatch.
     * 
     */
    public void setMultipartDespatch(boolean value) {
        this.multipartDespatch = value;
    }

    public boolean isSetMultipartDespatch() {
        return true;
    }

    /**
     * Obtient la valeur de la propriété multipleSubscriberFilter.
     * 
     */
    public boolean isMultipleSubscriberFilter() {
        return multipleSubscriberFilter;
    }

    /**
     * Définit la valeur de la propriété multipleSubscriberFilter.
     * 
     */
    public void setMultipleSubscriberFilter(boolean value) {
        this.multipleSubscriberFilter = value;
    }

    public boolean isSetMultipleSubscriberFilter() {
        return true;
    }

    /**
     * Obtient la valeur de la propriété hasConfirmDelivery.
     * 
     */
    public boolean isHasConfirmDelivery() {
        return hasConfirmDelivery;
    }

    /**
     * Définit la valeur de la propriété hasConfirmDelivery.
     * 
     */
    public void setHasConfirmDelivery(boolean value) {
        this.hasConfirmDelivery = value;
    }

    public boolean isSetHasConfirmDelivery() {
        return true;
    }

    /**
     * Obtient la valeur de la propriété hasHeartbeat.
     * 
     */
    public boolean isHasHeartbeat() {
        return hasHeartbeat;
    }

    /**
     * Définit la valeur de la propriété hasHeartbeat.
     * 
     */
    public void setHasHeartbeat(boolean value) {
        this.hasHeartbeat = value;
    }

    public boolean isSetHasHeartbeat() {
        return true;
    }

    /**
     * Obtient la valeur de la propriété visitNumberisOrder.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isVisitNumberisOrder() {
        return visitNumberisOrder;
    }

    /**
     * Définit la valeur de la propriété visitNumberisOrder.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setVisitNumberisOrder(Boolean value) {
        this.visitNumberisOrder = value;
    }

    public boolean isSetVisitNumberisOrder() {
        return (this.visitNumberisOrder!= null);
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
     *         &lt;element name="DirectDelivery" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
     *         &lt;element name="FetchedDelivery" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
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
        "directDelivery",
        "fetchedDelivery"
    })
    public static class Delivery
        implements Serializable
    {

        private final static long serialVersionUID = 1L;
        @XmlElement(name = "DirectDelivery")
        protected boolean directDelivery;
        @XmlElement(name = "FetchedDelivery")
        protected boolean fetchedDelivery;

        /**
         * Obtient la valeur de la propriété directDelivery.
         * 
         */
        public boolean isDirectDelivery() {
            return directDelivery;
        }

        /**
         * Définit la valeur de la propriété directDelivery.
         * 
         */
        public void setDirectDelivery(boolean value) {
            this.directDelivery = value;
        }

        public boolean isSetDirectDelivery() {
            return true;
        }

        /**
         * Obtient la valeur de la propriété fetchedDelivery.
         * 
         */
        public boolean isFetchedDelivery() {
            return fetchedDelivery;
        }

        /**
         * Définit la valeur de la propriété fetchedDelivery.
         * 
         */
        public void setFetchedDelivery(boolean value) {
            this.fetchedDelivery = value;
        }

        public boolean isSetFetchedDelivery() {
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
     *         &lt;element name="RequestResponse" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
     *         &lt;element name="PublishSubscribe" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
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
        "requestResponse",
        "publishSubscribe"
    })
    public static class Interaction
        implements Serializable
    {

        private final static long serialVersionUID = 1L;
        @XmlElement(name = "RequestResponse", defaultValue = "true")
        protected boolean requestResponse;
        @XmlElement(name = "PublishSubscribe", defaultValue = "true")
        protected boolean publishSubscribe;

        /**
         * Obtient la valeur de la propriété requestResponse.
         * 
         */
        public boolean isRequestResponse() {
            return requestResponse;
        }

        /**
         * Définit la valeur de la propriété requestResponse.
         * 
         */
        public void setRequestResponse(boolean value) {
            this.requestResponse = value;
        }

        public boolean isSetRequestResponse() {
            return true;
        }

        /**
         * Obtient la valeur de la propriété publishSubscribe.
         * 
         */
        public boolean isPublishSubscribe() {
            return publishSubscribe;
        }

        /**
         * Définit la valeur de la propriété publishSubscribe.
         * 
         */
        public void setPublishSubscribe(boolean value) {
            this.publishSubscribe = value;
        }

        public boolean isSetPublishSubscribe() {
            return true;
        }

    }

}
