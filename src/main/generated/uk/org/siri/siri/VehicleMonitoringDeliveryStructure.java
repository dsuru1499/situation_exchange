
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
 * Type for Delivery for Vehicle Monitoring Service. Provides information about one or more vehicles; each has its own VEHICLE activity element.
 * 
 * <p>Classe Java pour VehicleMonitoringDeliveryStructure complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="VehicleMonitoringDeliveryStructure">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.siri.org.uk/siri}AbstractServiceDeliveryStructure">
 *       &lt;sequence>
 *         &lt;group ref="{http://www.siri.org.uk/siri}VehicleMonitoringPayloadGroup"/>
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
@XmlType(name = "VehicleMonitoringDeliveryStructure", propOrder = {
    "vehicleActivity",
    "vehicleActivityCancellation",
    "vehicleActivityNote",
    "extensions"
})
public class VehicleMonitoringDeliveryStructure
    extends AbstractServiceDeliveryStructure
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "VehicleActivity")
    protected List<VehicleActivityStructure> vehicleActivity;
    @XmlElement(name = "VehicleActivityCancellation")
    protected List<VehicleActivityCancellationStructure> vehicleActivityCancellation;
    @XmlElement(name = "VehicleActivityNote")
    protected List<NaturalLanguageStringStructure> vehicleActivityNote;
    @XmlElement(name = "Extensions")
    protected ExtensionsStructure extensions;
    @XmlAttribute(name = "version")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String version;

    /**
     * Gets the value of the vehicleActivity property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the vehicleActivity property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getVehicleActivity().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link VehicleActivityStructure }
     * 
     * 
     */
    public List<VehicleActivityStructure> getVehicleActivity() {
        if (vehicleActivity == null) {
            vehicleActivity = new ArrayList<VehicleActivityStructure>();
        }
        return this.vehicleActivity;
    }

    public boolean isSetVehicleActivity() {
        return ((this.vehicleActivity!= null)&&(!this.vehicleActivity.isEmpty()));
    }

    public void unsetVehicleActivity() {
        this.vehicleActivity = null;
    }

    /**
     * Gets the value of the vehicleActivityCancellation property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the vehicleActivityCancellation property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getVehicleActivityCancellation().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link VehicleActivityCancellationStructure }
     * 
     * 
     */
    public List<VehicleActivityCancellationStructure> getVehicleActivityCancellation() {
        if (vehicleActivityCancellation == null) {
            vehicleActivityCancellation = new ArrayList<VehicleActivityCancellationStructure>();
        }
        return this.vehicleActivityCancellation;
    }

    public boolean isSetVehicleActivityCancellation() {
        return ((this.vehicleActivityCancellation!= null)&&(!this.vehicleActivityCancellation.isEmpty()));
    }

    public void unsetVehicleActivityCancellation() {
        this.vehicleActivityCancellation = null;
    }

    /**
     * Gets the value of the vehicleActivityNote property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the vehicleActivityNote property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getVehicleActivityNote().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link NaturalLanguageStringStructure }
     * 
     * 
     */
    public List<NaturalLanguageStringStructure> getVehicleActivityNote() {
        if (vehicleActivityNote == null) {
            vehicleActivityNote = new ArrayList<NaturalLanguageStringStructure>();
        }
        return this.vehicleActivityNote;
    }

    public boolean isSetVehicleActivityNote() {
        return ((this.vehicleActivityNote!= null)&&(!this.vehicleActivityNote.isEmpty()));
    }

    public void unsetVehicleActivityNote() {
        this.vehicleActivityNote = null;
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
