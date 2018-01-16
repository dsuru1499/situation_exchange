
package uk.org.siri.siri;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * Type for Distributor Delivery for Connection Monitoring Service.
 * 
 * <p>Classe Java pour ConnectionMonitoringDistributorDeliveryStructure complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="ConnectionMonitoringDistributorDeliveryStructure">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.siri.org.uk/siri}AbstractServiceDeliveryStructure">
 *       &lt;sequence>
 *         &lt;group ref="{http://www.siri.org.uk/siri}ConnectionMonitoringDistributorPayloadGroup"/>
 *         &lt;element ref="{http://www.siri.org.uk/siri}Extensions" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="version" type="{http://www.siri.org.uk/siri}VersionString" default="2.0" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ConnectionMonitoringDistributorDeliveryStructure", propOrder = {
    "waitProlongedDeparture",
    "stoppingPositionChangedDeparture",
    "distributorDepartureCancellation",
    "extensions"
})
public class ConnectionMonitoringDistributorDeliveryStructure
    extends AbstractServiceDeliveryStructure
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "WaitProlongedDeparture")
    protected List<WaitProlongedDepartureStructure> waitProlongedDeparture;
    @XmlElement(name = "StoppingPositionChangedDeparture")
    protected List<StoppingPositionChangedDepartureStructure> stoppingPositionChangedDeparture;
    @XmlElement(name = "DistributorDepartureCancellation")
    protected List<DistributorDepartureCancellationStructure> distributorDepartureCancellation;
    @XmlElement(name = "Extensions")
    protected ExtensionsStructure extensions;
    @XmlAttribute(name = "version")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String version;

    /**
     * Gets the value of the waitProlongedDeparture property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the waitProlongedDeparture property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getWaitProlongedDeparture().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link WaitProlongedDepartureStructure }
     * 
     * 
     */
    public List<WaitProlongedDepartureStructure> getWaitProlongedDeparture() {
        if (waitProlongedDeparture == null) {
            waitProlongedDeparture = new ArrayList<WaitProlongedDepartureStructure>();
        }
        return this.waitProlongedDeparture;
    }

    public boolean isSetWaitProlongedDeparture() {
        return ((this.waitProlongedDeparture!= null)&&(!this.waitProlongedDeparture.isEmpty()));
    }

    public void unsetWaitProlongedDeparture() {
        this.waitProlongedDeparture = null;
    }

    /**
     * Gets the value of the stoppingPositionChangedDeparture property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the stoppingPositionChangedDeparture property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getStoppingPositionChangedDeparture().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link StoppingPositionChangedDepartureStructure }
     * 
     * 
     */
    public List<StoppingPositionChangedDepartureStructure> getStoppingPositionChangedDeparture() {
        if (stoppingPositionChangedDeparture == null) {
            stoppingPositionChangedDeparture = new ArrayList<StoppingPositionChangedDepartureStructure>();
        }
        return this.stoppingPositionChangedDeparture;
    }

    public boolean isSetStoppingPositionChangedDeparture() {
        return ((this.stoppingPositionChangedDeparture!= null)&&(!this.stoppingPositionChangedDeparture.isEmpty()));
    }

    public void unsetStoppingPositionChangedDeparture() {
        this.stoppingPositionChangedDeparture = null;
    }

    /**
     * Gets the value of the distributorDepartureCancellation property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the distributorDepartureCancellation property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDistributorDepartureCancellation().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DistributorDepartureCancellationStructure }
     * 
     * 
     */
    public List<DistributorDepartureCancellationStructure> getDistributorDepartureCancellation() {
        if (distributorDepartureCancellation == null) {
            distributorDepartureCancellation = new ArrayList<DistributorDepartureCancellationStructure>();
        }
        return this.distributorDepartureCancellation;
    }

    public boolean isSetDistributorDepartureCancellation() {
        return ((this.distributorDepartureCancellation!= null)&&(!this.distributorDepartureCancellation.isEmpty()));
    }

    public void unsetDistributorDepartureCancellation() {
        this.distributorDepartureCancellation = null;
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
     * Obtient la valeur de la propriété version.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVersion() {
        if (version == null) {
            return "2.0";
        } else {
            return version;
        }
    }

    /**
     * Définit la valeur de la propriété version.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVersion(String value) {
        this.version = value;
    }

    public boolean isSetVersion() {
        return (this.version!= null);
    }

}
