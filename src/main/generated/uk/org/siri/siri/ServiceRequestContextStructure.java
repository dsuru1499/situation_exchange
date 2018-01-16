
package uk.org.siri.siri;

import java.io.Serializable;
import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.NormalizedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import javax.xml.datatype.Duration;


/**
 * Configurable context for requests. Intended Primarily as a documentation mechanism.
 * 
 * <p>Classe Java pour ServiceRequestContextStructure complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="ServiceRequestContextStructure">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;group ref="{http://www.siri.org.uk/siri}ServiceEndpointAddressGroup"/>
 *         &lt;group ref="{http://www.siri.org.uk/siri}ClientEndpointAddressGroup"/>
 *         &lt;group ref="{http://www.siri.org.uk/siri}ReferenceContextGroup"/>
 *         &lt;group ref="{http://www.siri.org.uk/siri}TemporalContextGroup"/>
 *         &lt;group ref="{http://www.siri.org.uk/siri}DeliveryContextGroup"/>
 *         &lt;group ref="{http://www.siri.org.uk/siri}ResourceContextGroup"/>
 *         &lt;group ref="{http://www.siri.org.uk/siri}PredictionMethodGroup"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ServiceRequestContextStructure", propOrder = {
    "checkStatusAddress",
    "subscribeAddress",
    "manageSubscriptionAddress",
    "getDataAddress",
    "statusResponseAddress",
    "subscriberAddress",
    "notifyAddress",
    "consumerAddress",
    "dataNameSpaces",
    "language",
    "wgsDecimalDegrees",
    "gmlCoordinateFormat",
    "distanceUnits",
    "velocityUnits",
    "dataHorizon",
    "requestTimeout",
    "deliveryMethod",
    "multipartDespatch",
    "confirmDelivery",
    "maximimumNumberOfSubscriptions",
    "allowedPredictors",
    "predictionFunction"
})
public class ServiceRequestContextStructure
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "CheckStatusAddress")
    protected String checkStatusAddress;
    @XmlElement(name = "SubscribeAddress")
    protected String subscribeAddress;
    @XmlElement(name = "ManageSubscriptionAddress")
    protected String manageSubscriptionAddress;
    @XmlElement(name = "GetDataAddress")
    protected String getDataAddress;
    @XmlElement(name = "StatusResponseAddress")
    protected String statusResponseAddress;
    @XmlElement(name = "SubscriberAddress")
    protected String subscriberAddress;
    @XmlElement(name = "NotifyAddress")
    protected String notifyAddress;
    @XmlElement(name = "ConsumerAddress")
    protected String consumerAddress;
    @XmlElement(name = "DataNameSpaces")
    protected DataNameSpacesStructure dataNameSpaces;
    @XmlElement(name = "Language", defaultValue = "en")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "language")
    protected String language;
    @XmlElement(name = "WgsDecimalDegrees")
    protected String wgsDecimalDegrees;
    @XmlElement(name = "GmlCoordinateFormat")
    protected String gmlCoordinateFormat;
    @XmlElement(name = "DistanceUnits")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String distanceUnits;
    @XmlElement(name = "VelocityUnits")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String velocityUnits;
    @XmlElement(name = "DataHorizon")
    protected Duration dataHorizon;
    @XmlElement(name = "RequestTimeout")
    protected Duration requestTimeout;
    @XmlElement(name = "DeliveryMethod", defaultValue = "direct")
    protected DeliveryMethodEnumeration deliveryMethod;
    @XmlElement(name = "MultipartDespatch")
    protected Boolean multipartDespatch;
    @XmlElement(name = "ConfirmDelivery", defaultValue = "false")
    protected Boolean confirmDelivery;
    @XmlElement(name = "MaximimumNumberOfSubscriptions")
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger maximimumNumberOfSubscriptions;
    @XmlElement(name = "AllowedPredictors", defaultValue = "anyone")
    protected PredictorsEnumeration allowedPredictors;
    @XmlElement(name = "PredictionFunction")
    protected String predictionFunction;

    /**
     * Obtient la valeur de la propriété checkStatusAddress.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCheckStatusAddress() {
        return checkStatusAddress;
    }

    /**
     * Définit la valeur de la propriété checkStatusAddress.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCheckStatusAddress(String value) {
        this.checkStatusAddress = value;
    }

    public boolean isSetCheckStatusAddress() {
        return (this.checkStatusAddress!= null);
    }

    /**
     * Obtient la valeur de la propriété subscribeAddress.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSubscribeAddress() {
        return subscribeAddress;
    }

    /**
     * Définit la valeur de la propriété subscribeAddress.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSubscribeAddress(String value) {
        this.subscribeAddress = value;
    }

    public boolean isSetSubscribeAddress() {
        return (this.subscribeAddress!= null);
    }

    /**
     * Obtient la valeur de la propriété manageSubscriptionAddress.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getManageSubscriptionAddress() {
        return manageSubscriptionAddress;
    }

    /**
     * Définit la valeur de la propriété manageSubscriptionAddress.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setManageSubscriptionAddress(String value) {
        this.manageSubscriptionAddress = value;
    }

    public boolean isSetManageSubscriptionAddress() {
        return (this.manageSubscriptionAddress!= null);
    }

    /**
     * Obtient la valeur de la propriété getDataAddress.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGetDataAddress() {
        return getDataAddress;
    }

    /**
     * Définit la valeur de la propriété getDataAddress.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGetDataAddress(String value) {
        this.getDataAddress = value;
    }

    public boolean isSetGetDataAddress() {
        return (this.getDataAddress!= null);
    }

    /**
     * Obtient la valeur de la propriété statusResponseAddress.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStatusResponseAddress() {
        return statusResponseAddress;
    }

    /**
     * Définit la valeur de la propriété statusResponseAddress.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStatusResponseAddress(String value) {
        this.statusResponseAddress = value;
    }

    public boolean isSetStatusResponseAddress() {
        return (this.statusResponseAddress!= null);
    }

    /**
     * Obtient la valeur de la propriété subscriberAddress.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSubscriberAddress() {
        return subscriberAddress;
    }

    /**
     * Définit la valeur de la propriété subscriberAddress.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSubscriberAddress(String value) {
        this.subscriberAddress = value;
    }

    public boolean isSetSubscriberAddress() {
        return (this.subscriberAddress!= null);
    }

    /**
     * Obtient la valeur de la propriété notifyAddress.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNotifyAddress() {
        return notifyAddress;
    }

    /**
     * Définit la valeur de la propriété notifyAddress.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNotifyAddress(String value) {
        this.notifyAddress = value;
    }

    public boolean isSetNotifyAddress() {
        return (this.notifyAddress!= null);
    }

    /**
     * Obtient la valeur de la propriété consumerAddress.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getConsumerAddress() {
        return consumerAddress;
    }

    /**
     * Définit la valeur de la propriété consumerAddress.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setConsumerAddress(String value) {
        this.consumerAddress = value;
    }

    public boolean isSetConsumerAddress() {
        return (this.consumerAddress!= null);
    }

    /**
     * Obtient la valeur de la propriété dataNameSpaces.
     * 
     * @return
     *     possible object is
     *     {@link DataNameSpacesStructure }
     *     
     */
    public DataNameSpacesStructure getDataNameSpaces() {
        return dataNameSpaces;
    }

    /**
     * Définit la valeur de la propriété dataNameSpaces.
     * 
     * @param value
     *     allowed object is
     *     {@link DataNameSpacesStructure }
     *     
     */
    public void setDataNameSpaces(DataNameSpacesStructure value) {
        this.dataNameSpaces = value;
    }

    public boolean isSetDataNameSpaces() {
        return (this.dataNameSpaces!= null);
    }

    /**
     * Obtient la valeur de la propriété language.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLanguage() {
        return language;
    }

    /**
     * Définit la valeur de la propriété language.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLanguage(String value) {
        this.language = value;
    }

    public boolean isSetLanguage() {
        return (this.language!= null);
    }

    /**
     * Obtient la valeur de la propriété wgsDecimalDegrees.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWgsDecimalDegrees() {
        return wgsDecimalDegrees;
    }

    /**
     * Définit la valeur de la propriété wgsDecimalDegrees.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWgsDecimalDegrees(String value) {
        this.wgsDecimalDegrees = value;
    }

    public boolean isSetWgsDecimalDegrees() {
        return (this.wgsDecimalDegrees!= null);
    }

    /**
     * Obtient la valeur de la propriété gmlCoordinateFormat.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGmlCoordinateFormat() {
        return gmlCoordinateFormat;
    }

    /**
     * Définit la valeur de la propriété gmlCoordinateFormat.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGmlCoordinateFormat(String value) {
        this.gmlCoordinateFormat = value;
    }

    public boolean isSetGmlCoordinateFormat() {
        return (this.gmlCoordinateFormat!= null);
    }

    /**
     * Obtient la valeur de la propriété distanceUnits.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDistanceUnits() {
        return distanceUnits;
    }

    /**
     * Définit la valeur de la propriété distanceUnits.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDistanceUnits(String value) {
        this.distanceUnits = value;
    }

    public boolean isSetDistanceUnits() {
        return (this.distanceUnits!= null);
    }

    /**
     * Obtient la valeur de la propriété velocityUnits.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVelocityUnits() {
        return velocityUnits;
    }

    /**
     * Définit la valeur de la propriété velocityUnits.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVelocityUnits(String value) {
        this.velocityUnits = value;
    }

    public boolean isSetVelocityUnits() {
        return (this.velocityUnits!= null);
    }

    /**
     * Obtient la valeur de la propriété dataHorizon.
     * 
     * @return
     *     possible object is
     *     {@link Duration }
     *     
     */
    public Duration getDataHorizon() {
        return dataHorizon;
    }

    /**
     * Définit la valeur de la propriété dataHorizon.
     * 
     * @param value
     *     allowed object is
     *     {@link Duration }
     *     
     */
    public void setDataHorizon(Duration value) {
        this.dataHorizon = value;
    }

    public boolean isSetDataHorizon() {
        return (this.dataHorizon!= null);
    }

    /**
     * Obtient la valeur de la propriété requestTimeout.
     * 
     * @return
     *     possible object is
     *     {@link Duration }
     *     
     */
    public Duration getRequestTimeout() {
        return requestTimeout;
    }

    /**
     * Définit la valeur de la propriété requestTimeout.
     * 
     * @param value
     *     allowed object is
     *     {@link Duration }
     *     
     */
    public void setRequestTimeout(Duration value) {
        this.requestTimeout = value;
    }

    public boolean isSetRequestTimeout() {
        return (this.requestTimeout!= null);
    }

    /**
     * Obtient la valeur de la propriété deliveryMethod.
     * 
     * @return
     *     possible object is
     *     {@link DeliveryMethodEnumeration }
     *     
     */
    public DeliveryMethodEnumeration getDeliveryMethod() {
        return deliveryMethod;
    }

    /**
     * Définit la valeur de la propriété deliveryMethod.
     * 
     * @param value
     *     allowed object is
     *     {@link DeliveryMethodEnumeration }
     *     
     */
    public void setDeliveryMethod(DeliveryMethodEnumeration value) {
        this.deliveryMethod = value;
    }

    public boolean isSetDeliveryMethod() {
        return (this.deliveryMethod!= null);
    }

    /**
     * Obtient la valeur de la propriété multipartDespatch.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMultipartDespatch() {
        return multipartDespatch;
    }

    /**
     * Définit la valeur de la propriété multipartDespatch.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMultipartDespatch(Boolean value) {
        this.multipartDespatch = value;
    }

    public boolean isSetMultipartDespatch() {
        return (this.multipartDespatch!= null);
    }

    /**
     * Obtient la valeur de la propriété confirmDelivery.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isConfirmDelivery() {
        return confirmDelivery;
    }

    /**
     * Définit la valeur de la propriété confirmDelivery.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setConfirmDelivery(Boolean value) {
        this.confirmDelivery = value;
    }

    public boolean isSetConfirmDelivery() {
        return (this.confirmDelivery!= null);
    }

    /**
     * Obtient la valeur de la propriété maximimumNumberOfSubscriptions.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getMaximimumNumberOfSubscriptions() {
        return maximimumNumberOfSubscriptions;
    }

    /**
     * Définit la valeur de la propriété maximimumNumberOfSubscriptions.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setMaximimumNumberOfSubscriptions(BigInteger value) {
        this.maximimumNumberOfSubscriptions = value;
    }

    public boolean isSetMaximimumNumberOfSubscriptions() {
        return (this.maximimumNumberOfSubscriptions!= null);
    }

    /**
     * Obtient la valeur de la propriété allowedPredictors.
     * 
     * @return
     *     possible object is
     *     {@link PredictorsEnumeration }
     *     
     */
    public PredictorsEnumeration getAllowedPredictors() {
        return allowedPredictors;
    }

    /**
     * Définit la valeur de la propriété allowedPredictors.
     * 
     * @param value
     *     allowed object is
     *     {@link PredictorsEnumeration }
     *     
     */
    public void setAllowedPredictors(PredictorsEnumeration value) {
        this.allowedPredictors = value;
    }

    public boolean isSetAllowedPredictors() {
        return (this.allowedPredictors!= null);
    }

    /**
     * Obtient la valeur de la propriété predictionFunction.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPredictionFunction() {
        return predictionFunction;
    }

    /**
     * Définit la valeur de la propriété predictionFunction.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPredictionFunction(String value) {
        this.predictionFunction = value;
    }

    public boolean isSetPredictionFunction() {
        return (this.predictionFunction!= null);
    }

}
