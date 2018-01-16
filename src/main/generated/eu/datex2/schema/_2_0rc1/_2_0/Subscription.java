
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
 * <p>Classe Java pour Subscription complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="Subscription">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="deleteSubscription" type="{http://datex2.eu/schema/2_0RC1/2_0}Boolean" minOccurs="0"/>
 *         &lt;element name="deliveryInterval" type="{http://datex2.eu/schema/2_0RC1/2_0}Seconds" minOccurs="0"/>
 *         &lt;element name="operatingMode" type="{http://datex2.eu/schema/2_0RC1/2_0}OperatingModeEnum"/>
 *         &lt;element name="subscriptionStartTime" type="{http://datex2.eu/schema/2_0RC1/2_0}DateTime"/>
 *         &lt;element name="subscriptionState" type="{http://datex2.eu/schema/2_0RC1/2_0}SubscriptionStateEnum"/>
 *         &lt;element name="subscriptionStopTime" type="{http://datex2.eu/schema/2_0RC1/2_0}DateTime" minOccurs="0"/>
 *         &lt;element name="updateMethod" type="{http://datex2.eu/schema/2_0RC1/2_0}UpdateMethodEnum"/>
 *         &lt;element name="target" type="{http://datex2.eu/schema/2_0RC1/2_0}Target" maxOccurs="unbounded"/>
 *         &lt;element name="filterReference" type="{http://datex2.eu/schema/2_0RC1/2_0}FilterReference" minOccurs="0"/>
 *         &lt;element name="catalogueReference" type="{http://datex2.eu/schema/2_0RC1/2_0}CatalogueReference" minOccurs="0"/>
 *         &lt;element name="subscriptionExtension" type="{http://datex2.eu/schema/2_0RC1/2_0}ExtensionType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Subscription", propOrder = {
    "deleteSubscription",
    "deliveryInterval",
    "operatingMode",
    "subscriptionStartTime",
    "subscriptionState",
    "subscriptionStopTime",
    "updateMethod",
    "target",
    "filterReference",
    "catalogueReference",
    "subscriptionExtension"
})
public class Subscription
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    protected Boolean deleteSubscription;
    protected Float deliveryInterval;
    @XmlElement(required = true)
    protected OperatingModeEnum operatingMode;
    @XmlElement(required = true)
    protected XMLGregorianCalendar subscriptionStartTime;
    @XmlElement(required = true)
    protected SubscriptionStateEnum subscriptionState;
    protected XMLGregorianCalendar subscriptionStopTime;
    @XmlElement(required = true)
    protected UpdateMethodEnum updateMethod;
    @XmlElement(required = true)
    protected List<Target> target;
    protected FilterReference filterReference;
    protected CatalogueReference catalogueReference;
    protected ExtensionType subscriptionExtension;

    /**
     * Obtient la valeur de la propriété deleteSubscription.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isDeleteSubscription() {
        return deleteSubscription;
    }

    /**
     * Définit la valeur de la propriété deleteSubscription.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDeleteSubscription(Boolean value) {
        this.deleteSubscription = value;
    }

    public boolean isSetDeleteSubscription() {
        return (this.deleteSubscription!= null);
    }

    /**
     * Obtient la valeur de la propriété deliveryInterval.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getDeliveryInterval() {
        return deliveryInterval;
    }

    /**
     * Définit la valeur de la propriété deliveryInterval.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setDeliveryInterval(Float value) {
        this.deliveryInterval = value;
    }

    public boolean isSetDeliveryInterval() {
        return (this.deliveryInterval!= null);
    }

    /**
     * Obtient la valeur de la propriété operatingMode.
     * 
     * @return
     *     possible object is
     *     {@link OperatingModeEnum }
     *     
     */
    public OperatingModeEnum getOperatingMode() {
        return operatingMode;
    }

    /**
     * Définit la valeur de la propriété operatingMode.
     * 
     * @param value
     *     allowed object is
     *     {@link OperatingModeEnum }
     *     
     */
    public void setOperatingMode(OperatingModeEnum value) {
        this.operatingMode = value;
    }

    public boolean isSetOperatingMode() {
        return (this.operatingMode!= null);
    }

    /**
     * Obtient la valeur de la propriété subscriptionStartTime.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getSubscriptionStartTime() {
        return subscriptionStartTime;
    }

    /**
     * Définit la valeur de la propriété subscriptionStartTime.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setSubscriptionStartTime(XMLGregorianCalendar value) {
        this.subscriptionStartTime = value;
    }

    public boolean isSetSubscriptionStartTime() {
        return (this.subscriptionStartTime!= null);
    }

    /**
     * Obtient la valeur de la propriété subscriptionState.
     * 
     * @return
     *     possible object is
     *     {@link SubscriptionStateEnum }
     *     
     */
    public SubscriptionStateEnum getSubscriptionState() {
        return subscriptionState;
    }

    /**
     * Définit la valeur de la propriété subscriptionState.
     * 
     * @param value
     *     allowed object is
     *     {@link SubscriptionStateEnum }
     *     
     */
    public void setSubscriptionState(SubscriptionStateEnum value) {
        this.subscriptionState = value;
    }

    public boolean isSetSubscriptionState() {
        return (this.subscriptionState!= null);
    }

    /**
     * Obtient la valeur de la propriété subscriptionStopTime.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getSubscriptionStopTime() {
        return subscriptionStopTime;
    }

    /**
     * Définit la valeur de la propriété subscriptionStopTime.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setSubscriptionStopTime(XMLGregorianCalendar value) {
        this.subscriptionStopTime = value;
    }

    public boolean isSetSubscriptionStopTime() {
        return (this.subscriptionStopTime!= null);
    }

    /**
     * Obtient la valeur de la propriété updateMethod.
     * 
     * @return
     *     possible object is
     *     {@link UpdateMethodEnum }
     *     
     */
    public UpdateMethodEnum getUpdateMethod() {
        return updateMethod;
    }

    /**
     * Définit la valeur de la propriété updateMethod.
     * 
     * @param value
     *     allowed object is
     *     {@link UpdateMethodEnum }
     *     
     */
    public void setUpdateMethod(UpdateMethodEnum value) {
        this.updateMethod = value;
    }

    public boolean isSetUpdateMethod() {
        return (this.updateMethod!= null);
    }

    /**
     * Gets the value of the target property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the target property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTarget().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Target }
     * 
     * 
     */
    public List<Target> getTarget() {
        if (target == null) {
            target = new ArrayList<Target>();
        }
        return this.target;
    }

    public boolean isSetTarget() {
        return ((this.target!= null)&&(!this.target.isEmpty()));
    }

    public void unsetTarget() {
        this.target = null;
    }

    /**
     * Obtient la valeur de la propriété filterReference.
     * 
     * @return
     *     possible object is
     *     {@link FilterReference }
     *     
     */
    public FilterReference getFilterReference() {
        return filterReference;
    }

    /**
     * Définit la valeur de la propriété filterReference.
     * 
     * @param value
     *     allowed object is
     *     {@link FilterReference }
     *     
     */
    public void setFilterReference(FilterReference value) {
        this.filterReference = value;
    }

    public boolean isSetFilterReference() {
        return (this.filterReference!= null);
    }

    /**
     * Obtient la valeur de la propriété catalogueReference.
     * 
     * @return
     *     possible object is
     *     {@link CatalogueReference }
     *     
     */
    public CatalogueReference getCatalogueReference() {
        return catalogueReference;
    }

    /**
     * Définit la valeur de la propriété catalogueReference.
     * 
     * @param value
     *     allowed object is
     *     {@link CatalogueReference }
     *     
     */
    public void setCatalogueReference(CatalogueReference value) {
        this.catalogueReference = value;
    }

    public boolean isSetCatalogueReference() {
        return (this.catalogueReference!= null);
    }

    /**
     * Obtient la valeur de la propriété subscriptionExtension.
     * 
     * @return
     *     possible object is
     *     {@link ExtensionType }
     *     
     */
    public ExtensionType getSubscriptionExtension() {
        return subscriptionExtension;
    }

    /**
     * Définit la valeur de la propriété subscriptionExtension.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtensionType }
     *     
     */
    public void setSubscriptionExtension(ExtensionType value) {
        this.subscriptionExtension = value;
    }

    public boolean isSetSubscriptionExtension() {
        return (this.subscriptionExtension!= null);
    }

}
