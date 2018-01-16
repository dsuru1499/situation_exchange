
package eu.datex2.schema._2_0rc1._2_0;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Classe Java pour Exchange complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="Exchange">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="changedFlag" type="{http://datex2.eu/schema/2_0RC1/2_0}ChangedFlagEnum" minOccurs="0"/>
 *         &lt;element name="clientIdentification" type="{http://datex2.eu/schema/2_0RC1/2_0}String" minOccurs="0"/>
 *         &lt;element name="deliveryBreak" type="{http://datex2.eu/schema/2_0RC1/2_0}Boolean" minOccurs="0"/>
 *         &lt;element name="denyReason" type="{http://datex2.eu/schema/2_0RC1/2_0}DenyReasonEnum" minOccurs="0"/>
 *         &lt;element name="historicalStartDate" type="{http://datex2.eu/schema/2_0RC1/2_0}DateTime" minOccurs="0"/>
 *         &lt;element name="historicalStopDate" type="{http://datex2.eu/schema/2_0RC1/2_0}DateTime" minOccurs="0"/>
 *         &lt;element name="keepAlive" type="{http://datex2.eu/schema/2_0RC1/2_0}Boolean" minOccurs="0"/>
 *         &lt;element name="requestType" type="{http://datex2.eu/schema/2_0RC1/2_0}RequestTypeEnum" minOccurs="0"/>
 *         &lt;element name="response" type="{http://datex2.eu/schema/2_0RC1/2_0}ResponseEnum" minOccurs="0"/>
 *         &lt;element name="subscriptionReference" type="{http://datex2.eu/schema/2_0RC1/2_0}String" minOccurs="0"/>
 *         &lt;element name="supplierIdentification" type="{http://datex2.eu/schema/2_0RC1/2_0}InternationalIdentifier"/>
 *         &lt;element name="target" type="{http://datex2.eu/schema/2_0RC1/2_0}Target" minOccurs="0"/>
 *         &lt;element name="subscription" type="{http://datex2.eu/schema/2_0RC1/2_0}Subscription" minOccurs="0"/>
 *         &lt;element name="filterReference" type="{http://datex2.eu/schema/2_0RC1/2_0}FilterReference" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="catalogueReference" type="{http://datex2.eu/schema/2_0RC1/2_0}CatalogueReference" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="exchangeExtension" type="{http://datex2.eu/schema/2_0RC1/2_0}ExtensionType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Exchange", propOrder = {
    "changedFlag",
    "clientIdentification",
    "deliveryBreak",
    "denyReason",
    "historicalStartDate",
    "historicalStopDate",
    "keepAlive",
    "requestType",
    "response",
    "subscriptionReference",
    "supplierIdentification",
    "target",
    "subscription",
    "filterReference",
    "catalogueReference",
    "exchangeExtension"
})
public class Exchange
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    protected ChangedFlagEnum changedFlag;
    protected String clientIdentification;
    protected Boolean deliveryBreak;
    protected DenyReasonEnum denyReason;
    protected XMLGregorianCalendar historicalStartDate;
    protected XMLGregorianCalendar historicalStopDate;
    protected Boolean keepAlive;
    protected RequestTypeEnum requestType;
    protected ResponseEnum response;
    protected String subscriptionReference;
    @XmlElement(required = true)
    protected InternationalIdentifier supplierIdentification;
    protected Target target;
    protected Subscription subscription;
    protected List<FilterReference> filterReference;
    protected List<CatalogueReference> catalogueReference;
    protected ExtensionType exchangeExtension;

    /**
     * Obtient la valeur de la propriété changedFlag.
     * 
     * @return
     *     possible object is
     *     {@link ChangedFlagEnum }
     *     
     */
    public ChangedFlagEnum getChangedFlag() {
        return changedFlag;
    }

    /**
     * Définit la valeur de la propriété changedFlag.
     * 
     * @param value
     *     allowed object is
     *     {@link ChangedFlagEnum }
     *     
     */
    public void setChangedFlag(ChangedFlagEnum value) {
        this.changedFlag = value;
    }

    public boolean isSetChangedFlag() {
        return (this.changedFlag!= null);
    }

    /**
     * Obtient la valeur de la propriété clientIdentification.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClientIdentification() {
        return clientIdentification;
    }

    /**
     * Définit la valeur de la propriété clientIdentification.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClientIdentification(String value) {
        this.clientIdentification = value;
    }

    public boolean isSetClientIdentification() {
        return (this.clientIdentification!= null);
    }

    /**
     * Obtient la valeur de la propriété deliveryBreak.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isDeliveryBreak() {
        return deliveryBreak;
    }

    /**
     * Définit la valeur de la propriété deliveryBreak.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDeliveryBreak(Boolean value) {
        this.deliveryBreak = value;
    }

    public boolean isSetDeliveryBreak() {
        return (this.deliveryBreak!= null);
    }

    /**
     * Obtient la valeur de la propriété denyReason.
     * 
     * @return
     *     possible object is
     *     {@link DenyReasonEnum }
     *     
     */
    public DenyReasonEnum getDenyReason() {
        return denyReason;
    }

    /**
     * Définit la valeur de la propriété denyReason.
     * 
     * @param value
     *     allowed object is
     *     {@link DenyReasonEnum }
     *     
     */
    public void setDenyReason(DenyReasonEnum value) {
        this.denyReason = value;
    }

    public boolean isSetDenyReason() {
        return (this.denyReason!= null);
    }

    /**
     * Obtient la valeur de la propriété historicalStartDate.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getHistoricalStartDate() {
        return historicalStartDate;
    }

    /**
     * Définit la valeur de la propriété historicalStartDate.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setHistoricalStartDate(XMLGregorianCalendar value) {
        this.historicalStartDate = value;
    }

    public boolean isSetHistoricalStartDate() {
        return (this.historicalStartDate!= null);
    }

    /**
     * Obtient la valeur de la propriété historicalStopDate.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getHistoricalStopDate() {
        return historicalStopDate;
    }

    /**
     * Définit la valeur de la propriété historicalStopDate.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setHistoricalStopDate(XMLGregorianCalendar value) {
        this.historicalStopDate = value;
    }

    public boolean isSetHistoricalStopDate() {
        return (this.historicalStopDate!= null);
    }

    /**
     * Obtient la valeur de la propriété keepAlive.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isKeepAlive() {
        return keepAlive;
    }

    /**
     * Définit la valeur de la propriété keepAlive.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setKeepAlive(Boolean value) {
        this.keepAlive = value;
    }

    public boolean isSetKeepAlive() {
        return (this.keepAlive!= null);
    }

    /**
     * Obtient la valeur de la propriété requestType.
     * 
     * @return
     *     possible object is
     *     {@link RequestTypeEnum }
     *     
     */
    public RequestTypeEnum getRequestType() {
        return requestType;
    }

    /**
     * Définit la valeur de la propriété requestType.
     * 
     * @param value
     *     allowed object is
     *     {@link RequestTypeEnum }
     *     
     */
    public void setRequestType(RequestTypeEnum value) {
        this.requestType = value;
    }

    public boolean isSetRequestType() {
        return (this.requestType!= null);
    }

    /**
     * Obtient la valeur de la propriété response.
     * 
     * @return
     *     possible object is
     *     {@link ResponseEnum }
     *     
     */
    public ResponseEnum getResponse() {
        return response;
    }

    /**
     * Définit la valeur de la propriété response.
     * 
     * @param value
     *     allowed object is
     *     {@link ResponseEnum }
     *     
     */
    public void setResponse(ResponseEnum value) {
        this.response = value;
    }

    public boolean isSetResponse() {
        return (this.response!= null);
    }

    /**
     * Obtient la valeur de la propriété subscriptionReference.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSubscriptionReference() {
        return subscriptionReference;
    }

    /**
     * Définit la valeur de la propriété subscriptionReference.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSubscriptionReference(String value) {
        this.subscriptionReference = value;
    }

    public boolean isSetSubscriptionReference() {
        return (this.subscriptionReference!= null);
    }

    /**
     * Obtient la valeur de la propriété supplierIdentification.
     * 
     * @return
     *     possible object is
     *     {@link InternationalIdentifier }
     *     
     */
    public InternationalIdentifier getSupplierIdentification() {
        return supplierIdentification;
    }

    /**
     * Définit la valeur de la propriété supplierIdentification.
     * 
     * @param value
     *     allowed object is
     *     {@link InternationalIdentifier }
     *     
     */
    public void setSupplierIdentification(InternationalIdentifier value) {
        this.supplierIdentification = value;
    }

    public boolean isSetSupplierIdentification() {
        return (this.supplierIdentification!= null);
    }

    /**
     * Obtient la valeur de la propriété target.
     * 
     * @return
     *     possible object is
     *     {@link Target }
     *     
     */
    public Target getTarget() {
        return target;
    }

    /**
     * Définit la valeur de la propriété target.
     * 
     * @param value
     *     allowed object is
     *     {@link Target }
     *     
     */
    public void setTarget(Target value) {
        this.target = value;
    }

    public boolean isSetTarget() {
        return (this.target!= null);
    }

    /**
     * Obtient la valeur de la propriété subscription.
     * 
     * @return
     *     possible object is
     *     {@link Subscription }
     *     
     */
    public Subscription getSubscription() {
        return subscription;
    }

    /**
     * Définit la valeur de la propriété subscription.
     * 
     * @param value
     *     allowed object is
     *     {@link Subscription }
     *     
     */
    public void setSubscription(Subscription value) {
        this.subscription = value;
    }

    public boolean isSetSubscription() {
        return (this.subscription!= null);
    }

    /**
     * Gets the value of the filterReference property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the filterReference property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFilterReference().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FilterReference }
     * 
     * 
     */
    public List<FilterReference> getFilterReference() {
        if (filterReference == null) {
            filterReference = new ArrayList<FilterReference>();
        }
        return this.filterReference;
    }

    public boolean isSetFilterReference() {
        return ((this.filterReference!= null)&&(!this.filterReference.isEmpty()));
    }

    public void unsetFilterReference() {
        this.filterReference = null;
    }

    /**
     * Gets the value of the catalogueReference property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the catalogueReference property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCatalogueReference().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CatalogueReference }
     * 
     * 
     */
    public List<CatalogueReference> getCatalogueReference() {
        if (catalogueReference == null) {
            catalogueReference = new ArrayList<CatalogueReference>();
        }
        return this.catalogueReference;
    }

    public boolean isSetCatalogueReference() {
        return ((this.catalogueReference!= null)&&(!this.catalogueReference.isEmpty()));
    }

    public void unsetCatalogueReference() {
        this.catalogueReference = null;
    }

    /**
     * Obtient la valeur de la propriété exchangeExtension.
     * 
     * @return
     *     possible object is
     *     {@link ExtensionType }
     *     
     */
    public ExtensionType getExchangeExtension() {
        return exchangeExtension;
    }

    /**
     * Définit la valeur de la propriété exchangeExtension.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtensionType }
     *     
     */
    public void setExchangeExtension(ExtensionType value) {
        this.exchangeExtension = value;
    }

    public boolean isSetExchangeExtension() {
        return (this.exchangeExtension!= null);
    }

}
