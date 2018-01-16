
package uk.org.siri.siri;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * Type for Body of Subscription Response. Used in WSDL.
 * 
 * <p>Classe Java pour SubscriptionResponseBodyStructure complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="SubscriptionResponseBodyStructure">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.siri.org.uk/siri}ResponseStatus" maxOccurs="unbounded"/>
 *         &lt;element name="SubscriptionManagerAddress" type="{http://www.siri.org.uk/siri}EndpointAddress" minOccurs="0"/>
 *         &lt;element name="ServiceStartedTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SubscriptionResponseBodyStructure", propOrder = {
    "responseStatus",
    "subscriptionManagerAddress",
    "serviceStartedTime"
})
public class SubscriptionResponseBodyStructure
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "ResponseStatus", required = true)
    protected List<StatusResponseStructure> responseStatus;
    @XmlElement(name = "SubscriptionManagerAddress")
    protected String subscriptionManagerAddress;
    @XmlElement(name = "ServiceStartedTime")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar serviceStartedTime;

    /**
     * Gets the value of the responseStatus property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the responseStatus property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getResponseStatus().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link StatusResponseStructure }
     * 
     * 
     */
    public List<StatusResponseStructure> getResponseStatus() {
        if (responseStatus == null) {
            responseStatus = new ArrayList<StatusResponseStructure>();
        }
        return this.responseStatus;
    }

    public boolean isSetResponseStatus() {
        return ((this.responseStatus!= null)&&(!this.responseStatus.isEmpty()));
    }

    public void unsetResponseStatus() {
        this.responseStatus = null;
    }

    /**
     * Obtient la valeur de la propriété subscriptionManagerAddress.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSubscriptionManagerAddress() {
        return subscriptionManagerAddress;
    }

    /**
     * Définit la valeur de la propriété subscriptionManagerAddress.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSubscriptionManagerAddress(String value) {
        this.subscriptionManagerAddress = value;
    }

    public boolean isSetSubscriptionManagerAddress() {
        return (this.subscriptionManagerAddress!= null);
    }

    /**
     * Obtient la valeur de la propriété serviceStartedTime.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getServiceStartedTime() {
        return serviceStartedTime;
    }

    /**
     * Définit la valeur de la propriété serviceStartedTime.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setServiceStartedTime(XMLGregorianCalendar value) {
        this.serviceStartedTime = value;
    }

    public boolean isSetServiceStartedTime() {
        return (this.serviceStartedTime!= null);
    }

}
