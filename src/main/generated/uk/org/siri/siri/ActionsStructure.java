
package uk.org.siri.siri;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Type for list of actions.
 * 
 * <p>Classe Java pour ActionsStructure complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="ActionsStructure">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence minOccurs="0">
 *         &lt;group ref="{http://www.siri.org.uk/siri}ActionsGroup"/>
 *         &lt;element name="Extensions" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ActionsStructure", propOrder = {
    "publishToWebAction",
    "publishToMobileAction",
    "publishToTvAction",
    "publishToAlertsAction",
    "manualAction",
    "notifyByEmailAction",
    "notifyBySmsAction",
    "notifyByPagerAction",
    "notifyUserAction",
    "extensions"
})
public class ActionsStructure
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "PublishToWebAction")
    protected List<PublishToWebActionStructure> publishToWebAction;
    @XmlElement(name = "PublishToMobileAction")
    protected List<PublishToMobileActionStructure> publishToMobileAction;
    @XmlElement(name = "PublishToTvAction")
    protected PublishToTvActionStructure publishToTvAction;
    @XmlElement(name = "PublishToAlertsAction")
    protected List<PublishToAlertsActionStructure> publishToAlertsAction;
    @XmlElement(name = "ManualAction")
    protected List<ManualAction> manualAction;
    @XmlElement(name = "NotifyByEmailAction")
    protected List<NotifyByEmailActionStructure> notifyByEmailAction;
    @XmlElement(name = "NotifyBySmsAction")
    protected NotifyBySmsActionStructure notifyBySmsAction;
    @XmlElement(name = "NotifyByPagerAction")
    protected List<NotifyByPagerActionStructure> notifyByPagerAction;
    @XmlElement(name = "NotifyUserAction")
    protected List<NotifyUserActionStructure> notifyUserAction;
    @XmlElement(name = "Extensions")
    protected Object extensions;

    /**
     * Gets the value of the publishToWebAction property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the publishToWebAction property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPublishToWebAction().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PublishToWebActionStructure }
     * 
     * 
     */
    public List<PublishToWebActionStructure> getPublishToWebAction() {
        if (publishToWebAction == null) {
            publishToWebAction = new ArrayList<PublishToWebActionStructure>();
        }
        return this.publishToWebAction;
    }

    public boolean isSetPublishToWebAction() {
        return ((this.publishToWebAction!= null)&&(!this.publishToWebAction.isEmpty()));
    }

    public void unsetPublishToWebAction() {
        this.publishToWebAction = null;
    }

    /**
     * Gets the value of the publishToMobileAction property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the publishToMobileAction property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPublishToMobileAction().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PublishToMobileActionStructure }
     * 
     * 
     */
    public List<PublishToMobileActionStructure> getPublishToMobileAction() {
        if (publishToMobileAction == null) {
            publishToMobileAction = new ArrayList<PublishToMobileActionStructure>();
        }
        return this.publishToMobileAction;
    }

    public boolean isSetPublishToMobileAction() {
        return ((this.publishToMobileAction!= null)&&(!this.publishToMobileAction.isEmpty()));
    }

    public void unsetPublishToMobileAction() {
        this.publishToMobileAction = null;
    }

    /**
     * Obtient la valeur de la propriété publishToTvAction.
     * 
     * @return
     *     possible object is
     *     {@link PublishToTvActionStructure }
     *     
     */
    public PublishToTvActionStructure getPublishToTvAction() {
        return publishToTvAction;
    }

    /**
     * Définit la valeur de la propriété publishToTvAction.
     * 
     * @param value
     *     allowed object is
     *     {@link PublishToTvActionStructure }
     *     
     */
    public void setPublishToTvAction(PublishToTvActionStructure value) {
        this.publishToTvAction = value;
    }

    public boolean isSetPublishToTvAction() {
        return (this.publishToTvAction!= null);
    }

    /**
     * Gets the value of the publishToAlertsAction property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the publishToAlertsAction property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPublishToAlertsAction().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PublishToAlertsActionStructure }
     * 
     * 
     */
    public List<PublishToAlertsActionStructure> getPublishToAlertsAction() {
        if (publishToAlertsAction == null) {
            publishToAlertsAction = new ArrayList<PublishToAlertsActionStructure>();
        }
        return this.publishToAlertsAction;
    }

    public boolean isSetPublishToAlertsAction() {
        return ((this.publishToAlertsAction!= null)&&(!this.publishToAlertsAction.isEmpty()));
    }

    public void unsetPublishToAlertsAction() {
        this.publishToAlertsAction = null;
    }

    /**
     * Gets the value of the manualAction property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the manualAction property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getManualAction().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ManualAction }
     * 
     * 
     */
    public List<ManualAction> getManualAction() {
        if (manualAction == null) {
            manualAction = new ArrayList<ManualAction>();
        }
        return this.manualAction;
    }

    public boolean isSetManualAction() {
        return ((this.manualAction!= null)&&(!this.manualAction.isEmpty()));
    }

    public void unsetManualAction() {
        this.manualAction = null;
    }

    /**
     * Gets the value of the notifyByEmailAction property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the notifyByEmailAction property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getNotifyByEmailAction().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link NotifyByEmailActionStructure }
     * 
     * 
     */
    public List<NotifyByEmailActionStructure> getNotifyByEmailAction() {
        if (notifyByEmailAction == null) {
            notifyByEmailAction = new ArrayList<NotifyByEmailActionStructure>();
        }
        return this.notifyByEmailAction;
    }

    public boolean isSetNotifyByEmailAction() {
        return ((this.notifyByEmailAction!= null)&&(!this.notifyByEmailAction.isEmpty()));
    }

    public void unsetNotifyByEmailAction() {
        this.notifyByEmailAction = null;
    }

    /**
     * Obtient la valeur de la propriété notifyBySmsAction.
     * 
     * @return
     *     possible object is
     *     {@link NotifyBySmsActionStructure }
     *     
     */
    public NotifyBySmsActionStructure getNotifyBySmsAction() {
        return notifyBySmsAction;
    }

    /**
     * Définit la valeur de la propriété notifyBySmsAction.
     * 
     * @param value
     *     allowed object is
     *     {@link NotifyBySmsActionStructure }
     *     
     */
    public void setNotifyBySmsAction(NotifyBySmsActionStructure value) {
        this.notifyBySmsAction = value;
    }

    public boolean isSetNotifyBySmsAction() {
        return (this.notifyBySmsAction!= null);
    }

    /**
     * Gets the value of the notifyByPagerAction property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the notifyByPagerAction property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getNotifyByPagerAction().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link NotifyByPagerActionStructure }
     * 
     * 
     */
    public List<NotifyByPagerActionStructure> getNotifyByPagerAction() {
        if (notifyByPagerAction == null) {
            notifyByPagerAction = new ArrayList<NotifyByPagerActionStructure>();
        }
        return this.notifyByPagerAction;
    }

    public boolean isSetNotifyByPagerAction() {
        return ((this.notifyByPagerAction!= null)&&(!this.notifyByPagerAction.isEmpty()));
    }

    public void unsetNotifyByPagerAction() {
        this.notifyByPagerAction = null;
    }

    /**
     * Gets the value of the notifyUserAction property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the notifyUserAction property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getNotifyUserAction().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link NotifyUserActionStructure }
     * 
     * 
     */
    public List<NotifyUserActionStructure> getNotifyUserAction() {
        if (notifyUserAction == null) {
            notifyUserAction = new ArrayList<NotifyUserActionStructure>();
        }
        return this.notifyUserAction;
    }

    public boolean isSetNotifyUserAction() {
        return ((this.notifyUserAction!= null)&&(!this.notifyUserAction.isEmpty()));
    }

    public void unsetNotifyUserAction() {
        this.notifyUserAction = null;
    }

    /**
     * Obtient la valeur de la propriété extensions.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getExtensions() {
        return extensions;
    }

    /**
     * Définit la valeur de la propriété extensions.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setExtensions(Object value) {
        this.extensions = value;
    }

    public boolean isSetExtensions() {
        return (this.extensions!= null);
    }

}
