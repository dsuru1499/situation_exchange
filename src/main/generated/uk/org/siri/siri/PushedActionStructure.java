
package uk.org.siri.siri;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.Duration;


/**
 * Type for publication action.
 * 
 * <p>Classe Java pour PushedActionStructure complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="PushedActionStructure">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.siri.org.uk/siri}ParameterisedActionStructure">
 *       &lt;sequence>
 *         &lt;element name="BeforeNotices" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="Interval" type="{http://www.siri.org.uk/siri}DurationType" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="ClearNotice" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PushedActionStructure", propOrder = {
    "beforeNotices",
    "clearNotice"
})
@XmlSeeAlso({
    PublishToAlertsActionStructure.class,
    NotifyBySmsActionStructure.class,
    NotifyByPagerActionStructure.class,
    NotifyByEmailActionStructure.class,
    NotifyUserActionStructure.class
})
public class PushedActionStructure
    extends ParameterisedActionStructure
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "BeforeNotices")
    protected PushedActionStructure.BeforeNotices beforeNotices;
    @XmlElement(name = "ClearNotice")
    protected Boolean clearNotice;

    /**
     * Obtient la valeur de la propriété beforeNotices.
     * 
     * @return
     *     possible object is
     *     {@link PushedActionStructure.BeforeNotices }
     *     
     */
    public PushedActionStructure.BeforeNotices getBeforeNotices() {
        return beforeNotices;
    }

    /**
     * Définit la valeur de la propriété beforeNotices.
     * 
     * @param value
     *     allowed object is
     *     {@link PushedActionStructure.BeforeNotices }
     *     
     */
    public void setBeforeNotices(PushedActionStructure.BeforeNotices value) {
        this.beforeNotices = value;
    }

    public boolean isSetBeforeNotices() {
        return (this.beforeNotices!= null);
    }

    /**
     * Obtient la valeur de la propriété clearNotice.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isClearNotice() {
        return clearNotice;
    }

    /**
     * Définit la valeur de la propriété clearNotice.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setClearNotice(Boolean value) {
        this.clearNotice = value;
    }

    public boolean isSetClearNotice() {
        return (this.clearNotice!= null);
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
     *         &lt;element name="Interval" type="{http://www.siri.org.uk/siri}DurationType" maxOccurs="unbounded" minOccurs="0"/>
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
        "interval"
    })
    public static class BeforeNotices
        implements Serializable
    {

        private final static long serialVersionUID = 1L;
        @XmlElement(name = "Interval")
        protected List<Duration> interval;

        /**
         * Gets the value of the interval property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the interval property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getInterval().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link Duration }
         * 
         * 
         */
        public List<Duration> getInterval() {
            if (interval == null) {
                interval = new ArrayList<Duration>();
            }
            return this.interval;
        }

        public boolean isSetInterval() {
            return ((this.interval!= null)&&(!this.interval.isEmpty()));
        }

        public void unsetInterval() {
            this.interval = null;
        }

    }

}
