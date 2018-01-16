
package uk.org.siri.siri;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import uk.org.ifopt.ifopt.AccessModesEnumeration;


/**
 * Type for Annotated reference to a NETWORK affected by a SITUATION.
 * 
 * <p>Classe Java pour NetworkStructure complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="NetworkStructure">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="NetworkRef" type="{http://www.siri.org.uk/siri}OperatorRefStructure" minOccurs="0"/>
 *         &lt;element name="NetworkName" type="{http://www.siri.org.uk/siri}NaturalLanguageStringStructure" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;group ref="{http://www.siri.org.uk/siri}AffectedModeGroup"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NetworkStructure", propOrder = {
    "networkRef",
    "networkName",
    "vehicleMode",
    "airSubmode",
    "busSubmode",
    "coachSubmode",
    "metroSubmode",
    "railSubmode",
    "tramSubmode",
    "waterSubmode",
    "accessMode"
})
public class NetworkStructure
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "NetworkRef")
    protected OperatorRefStructure networkRef;
    @XmlElement(name = "NetworkName")
    protected List<NaturalLanguageStringStructure> networkName;
    @XmlElement(name = "VehicleMode", defaultValue = "unknown")
    protected VehicleModesOfTransportEnumeration vehicleMode;
    @XmlElement(name = "AirSubmode", defaultValue = "unknown")
    protected AirSubmodesOfTransportEnumeration airSubmode;
    @XmlElement(name = "BusSubmode", defaultValue = "unknown")
    protected BusSubmodesOfTransportEnumeration busSubmode;
    @XmlElement(name = "CoachSubmode", defaultValue = "unknown")
    protected CoachSubmodesOfTransportEnumeration coachSubmode;
    @XmlElement(name = "MetroSubmode", defaultValue = "unknown")
    protected MetroSubmodesOfTransportEnumeration metroSubmode;
    @XmlElement(name = "RailSubmode", defaultValue = "unknown")
    protected RailSubmodesOfTransportEnumeration railSubmode;
    @XmlElement(name = "TramSubmode", defaultValue = "unknown")
    protected TramSubmodesOfTransportEnumeration tramSubmode;
    @XmlElement(name = "WaterSubmode", defaultValue = "unknown")
    protected WaterSubmodesOfTransportEnumeration waterSubmode;
    @XmlElement(name = "AccessMode")
    protected AccessModesEnumeration accessMode;

    /**
     * Obtient la valeur de la propriété networkRef.
     * 
     * @return
     *     possible object is
     *     {@link OperatorRefStructure }
     *     
     */
    public OperatorRefStructure getNetworkRef() {
        return networkRef;
    }

    /**
     * Définit la valeur de la propriété networkRef.
     * 
     * @param value
     *     allowed object is
     *     {@link OperatorRefStructure }
     *     
     */
    public void setNetworkRef(OperatorRefStructure value) {
        this.networkRef = value;
    }

    public boolean isSetNetworkRef() {
        return (this.networkRef!= null);
    }

    /**
     * Gets the value of the networkName property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the networkName property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getNetworkName().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link NaturalLanguageStringStructure }
     * 
     * 
     */
    public List<NaturalLanguageStringStructure> getNetworkName() {
        if (networkName == null) {
            networkName = new ArrayList<NaturalLanguageStringStructure>();
        }
        return this.networkName;
    }

    public boolean isSetNetworkName() {
        return ((this.networkName!= null)&&(!this.networkName.isEmpty()));
    }

    public void unsetNetworkName() {
        this.networkName = null;
    }

    /**
     * Obtient la valeur de la propriété vehicleMode.
     * 
     * @return
     *     possible object is
     *     {@link VehicleModesOfTransportEnumeration }
     *     
     */
    public VehicleModesOfTransportEnumeration getVehicleMode() {
        return vehicleMode;
    }

    /**
     * Définit la valeur de la propriété vehicleMode.
     * 
     * @param value
     *     allowed object is
     *     {@link VehicleModesOfTransportEnumeration }
     *     
     */
    public void setVehicleMode(VehicleModesOfTransportEnumeration value) {
        this.vehicleMode = value;
    }

    public boolean isSetVehicleMode() {
        return (this.vehicleMode!= null);
    }

    /**
     * Obtient la valeur de la propriété airSubmode.
     * 
     * @return
     *     possible object is
     *     {@link AirSubmodesOfTransportEnumeration }
     *     
     */
    public AirSubmodesOfTransportEnumeration getAirSubmode() {
        return airSubmode;
    }

    /**
     * Définit la valeur de la propriété airSubmode.
     * 
     * @param value
     *     allowed object is
     *     {@link AirSubmodesOfTransportEnumeration }
     *     
     */
    public void setAirSubmode(AirSubmodesOfTransportEnumeration value) {
        this.airSubmode = value;
    }

    public boolean isSetAirSubmode() {
        return (this.airSubmode!= null);
    }

    /**
     * Obtient la valeur de la propriété busSubmode.
     * 
     * @return
     *     possible object is
     *     {@link BusSubmodesOfTransportEnumeration }
     *     
     */
    public BusSubmodesOfTransportEnumeration getBusSubmode() {
        return busSubmode;
    }

    /**
     * Définit la valeur de la propriété busSubmode.
     * 
     * @param value
     *     allowed object is
     *     {@link BusSubmodesOfTransportEnumeration }
     *     
     */
    public void setBusSubmode(BusSubmodesOfTransportEnumeration value) {
        this.busSubmode = value;
    }

    public boolean isSetBusSubmode() {
        return (this.busSubmode!= null);
    }

    /**
     * Obtient la valeur de la propriété coachSubmode.
     * 
     * @return
     *     possible object is
     *     {@link CoachSubmodesOfTransportEnumeration }
     *     
     */
    public CoachSubmodesOfTransportEnumeration getCoachSubmode() {
        return coachSubmode;
    }

    /**
     * Définit la valeur de la propriété coachSubmode.
     * 
     * @param value
     *     allowed object is
     *     {@link CoachSubmodesOfTransportEnumeration }
     *     
     */
    public void setCoachSubmode(CoachSubmodesOfTransportEnumeration value) {
        this.coachSubmode = value;
    }

    public boolean isSetCoachSubmode() {
        return (this.coachSubmode!= null);
    }

    /**
     * Obtient la valeur de la propriété metroSubmode.
     * 
     * @return
     *     possible object is
     *     {@link MetroSubmodesOfTransportEnumeration }
     *     
     */
    public MetroSubmodesOfTransportEnumeration getMetroSubmode() {
        return metroSubmode;
    }

    /**
     * Définit la valeur de la propriété metroSubmode.
     * 
     * @param value
     *     allowed object is
     *     {@link MetroSubmodesOfTransportEnumeration }
     *     
     */
    public void setMetroSubmode(MetroSubmodesOfTransportEnumeration value) {
        this.metroSubmode = value;
    }

    public boolean isSetMetroSubmode() {
        return (this.metroSubmode!= null);
    }

    /**
     * Obtient la valeur de la propriété railSubmode.
     * 
     * @return
     *     possible object is
     *     {@link RailSubmodesOfTransportEnumeration }
     *     
     */
    public RailSubmodesOfTransportEnumeration getRailSubmode() {
        return railSubmode;
    }

    /**
     * Définit la valeur de la propriété railSubmode.
     * 
     * @param value
     *     allowed object is
     *     {@link RailSubmodesOfTransportEnumeration }
     *     
     */
    public void setRailSubmode(RailSubmodesOfTransportEnumeration value) {
        this.railSubmode = value;
    }

    public boolean isSetRailSubmode() {
        return (this.railSubmode!= null);
    }

    /**
     * Obtient la valeur de la propriété tramSubmode.
     * 
     * @return
     *     possible object is
     *     {@link TramSubmodesOfTransportEnumeration }
     *     
     */
    public TramSubmodesOfTransportEnumeration getTramSubmode() {
        return tramSubmode;
    }

    /**
     * Définit la valeur de la propriété tramSubmode.
     * 
     * @param value
     *     allowed object is
     *     {@link TramSubmodesOfTransportEnumeration }
     *     
     */
    public void setTramSubmode(TramSubmodesOfTransportEnumeration value) {
        this.tramSubmode = value;
    }

    public boolean isSetTramSubmode() {
        return (this.tramSubmode!= null);
    }

    /**
     * Obtient la valeur de la propriété waterSubmode.
     * 
     * @return
     *     possible object is
     *     {@link WaterSubmodesOfTransportEnumeration }
     *     
     */
    public WaterSubmodesOfTransportEnumeration getWaterSubmode() {
        return waterSubmode;
    }

    /**
     * Définit la valeur de la propriété waterSubmode.
     * 
     * @param value
     *     allowed object is
     *     {@link WaterSubmodesOfTransportEnumeration }
     *     
     */
    public void setWaterSubmode(WaterSubmodesOfTransportEnumeration value) {
        this.waterSubmode = value;
    }

    public boolean isSetWaterSubmode() {
        return (this.waterSubmode!= null);
    }

    /**
     * Obtient la valeur de la propriété accessMode.
     * 
     * @return
     *     possible object is
     *     {@link AccessModesEnumeration }
     *     
     */
    public AccessModesEnumeration getAccessMode() {
        return accessMode;
    }

    /**
     * Définit la valeur de la propriété accessMode.
     * 
     * @param value
     *     allowed object is
     *     {@link AccessModesEnumeration }
     *     
     */
    public void setAccessMode(AccessModesEnumeration value) {
        this.accessMode = value;
    }

    public boolean isSetAccessMode() {
        return (this.accessMode!= null);
    }

}
