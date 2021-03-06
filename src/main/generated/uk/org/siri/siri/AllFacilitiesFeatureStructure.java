
package uk.org.siri.siri;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Description of the features of any of the available facilities.
 * 
 * <p>Classe Java pour AllFacilitiesFeatureStructure complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="AllFacilitiesFeatureStructure">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice>
 *         &lt;element ref="{http://www.siri.org.uk/siri}AccessFacility"/>
 *         &lt;element ref="{http://www.siri.org.uk/siri}AccommodationFacility"/>
 *         &lt;element ref="{http://www.siri.org.uk/siri}AssistanceFacility"/>
 *         &lt;element ref="{http://www.siri.org.uk/siri}FareClassFacility"/>
 *         &lt;element ref="{http://www.siri.org.uk/siri}HireFacility"/>
 *         &lt;element ref="{http://www.siri.org.uk/siri}LuggageFacility"/>
 *         &lt;element ref="{http://www.siri.org.uk/siri}MobilityFacility"/>
 *         &lt;element ref="{http://www.siri.org.uk/siri}NuisanceFacility"/>
 *         &lt;element ref="{http://www.siri.org.uk/siri}ParkingFacility"/>
 *         &lt;element ref="{http://www.siri.org.uk/siri}PassengerCommsFacility"/>
 *         &lt;element ref="{http://www.siri.org.uk/siri}PassengerInformationFacility"/>
 *         &lt;element ref="{http://www.siri.org.uk/siri}RefreshmentFacility"/>
 *         &lt;element ref="{http://www.siri.org.uk/siri}ReservedSpaceFacility"/>
 *         &lt;element ref="{http://www.siri.org.uk/siri}RetailFacility"/>
 *         &lt;element ref="{http://www.siri.org.uk/siri}SanitaryFacility"/>
 *         &lt;element ref="{http://www.siri.org.uk/siri}TicketingFacility"/>
 *       &lt;/choice>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AllFacilitiesFeatureStructure", propOrder = {
    "accessFacility",
    "accommodationFacility",
    "assistanceFacility",
    "fareClassFacility",
    "hireFacility",
    "luggageFacility",
    "mobilityFacility",
    "nuisanceFacility",
    "parkingFacility",
    "passengerCommsFacility",
    "passengerInformationFacility",
    "refreshmentFacility",
    "reservedSpaceFacility",
    "retailFacility",
    "sanitaryFacility",
    "ticketingFacility"
})
public class AllFacilitiesFeatureStructure
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "AccessFacility", defaultValue = "unknown")
    protected AccessFacilityEnumeration accessFacility;
    @XmlElement(name = "AccommodationFacility", defaultValue = "unknown")
    protected AccommodationFacilityEnumeration accommodationFacility;
    @XmlElement(name = "AssistanceFacility", defaultValue = "unknown")
    protected AssistanceFacilityEnumeration assistanceFacility;
    @XmlElement(name = "FareClassFacility", defaultValue = "unknown")
    protected FareClassFacilityEnumeration fareClassFacility;
    @XmlElement(name = "HireFacility", defaultValue = "unknown")
    protected HireFacilityEnumeration hireFacility;
    @XmlElement(name = "LuggageFacility", defaultValue = "unknown")
    protected LuggageFacilityEnumeration luggageFacility;
    @XmlElement(name = "MobilityFacility", defaultValue = "unknown")
    protected MobilityFacilityEnumeration mobilityFacility;
    @XmlElement(name = "NuisanceFacility", defaultValue = "unknown")
    protected NuisanceFacilityEnumeration nuisanceFacility;
    @XmlElement(name = "ParkingFacility")
    protected ParkingFacilityEnumeration parkingFacility;
    @XmlElement(name = "PassengerCommsFacility", defaultValue = "unknown")
    protected PassengerCommsFacilityEnumeration passengerCommsFacility;
    @XmlElement(name = "PassengerInformationFacility", defaultValue = "unknown")
    protected PassengerInformationFacilityEnumeration passengerInformationFacility;
    @XmlElement(name = "RefreshmentFacility", defaultValue = "unknown")
    protected RefreshmentFacilityEnumeration refreshmentFacility;
    @XmlElement(name = "ReservedSpaceFacility", defaultValue = "unknown")
    protected ReservedSpaceFacilityEnumeration reservedSpaceFacility;
    @XmlElement(name = "RetailFacility", defaultValue = "unknown")
    protected RetailFacilityEnumeration retailFacility;
    @XmlElement(name = "SanitaryFacility", defaultValue = "unknown")
    protected SanitaryFacilityEnumeration sanitaryFacility;
    @XmlElement(name = "TicketingFacility", defaultValue = "unknown")
    protected TicketingFacilityEnumeration ticketingFacility;

    /**
     * Obtient la valeur de la propriété accessFacility.
     * 
     * @return
     *     possible object is
     *     {@link AccessFacilityEnumeration }
     *     
     */
    public AccessFacilityEnumeration getAccessFacility() {
        return accessFacility;
    }

    /**
     * Définit la valeur de la propriété accessFacility.
     * 
     * @param value
     *     allowed object is
     *     {@link AccessFacilityEnumeration }
     *     
     */
    public void setAccessFacility(AccessFacilityEnumeration value) {
        this.accessFacility = value;
    }

    public boolean isSetAccessFacility() {
        return (this.accessFacility!= null);
    }

    /**
     * Obtient la valeur de la propriété accommodationFacility.
     * 
     * @return
     *     possible object is
     *     {@link AccommodationFacilityEnumeration }
     *     
     */
    public AccommodationFacilityEnumeration getAccommodationFacility() {
        return accommodationFacility;
    }

    /**
     * Définit la valeur de la propriété accommodationFacility.
     * 
     * @param value
     *     allowed object is
     *     {@link AccommodationFacilityEnumeration }
     *     
     */
    public void setAccommodationFacility(AccommodationFacilityEnumeration value) {
        this.accommodationFacility = value;
    }

    public boolean isSetAccommodationFacility() {
        return (this.accommodationFacility!= null);
    }

    /**
     * Obtient la valeur de la propriété assistanceFacility.
     * 
     * @return
     *     possible object is
     *     {@link AssistanceFacilityEnumeration }
     *     
     */
    public AssistanceFacilityEnumeration getAssistanceFacility() {
        return assistanceFacility;
    }

    /**
     * Définit la valeur de la propriété assistanceFacility.
     * 
     * @param value
     *     allowed object is
     *     {@link AssistanceFacilityEnumeration }
     *     
     */
    public void setAssistanceFacility(AssistanceFacilityEnumeration value) {
        this.assistanceFacility = value;
    }

    public boolean isSetAssistanceFacility() {
        return (this.assistanceFacility!= null);
    }

    /**
     * Obtient la valeur de la propriété fareClassFacility.
     * 
     * @return
     *     possible object is
     *     {@link FareClassFacilityEnumeration }
     *     
     */
    public FareClassFacilityEnumeration getFareClassFacility() {
        return fareClassFacility;
    }

    /**
     * Définit la valeur de la propriété fareClassFacility.
     * 
     * @param value
     *     allowed object is
     *     {@link FareClassFacilityEnumeration }
     *     
     */
    public void setFareClassFacility(FareClassFacilityEnumeration value) {
        this.fareClassFacility = value;
    }

    public boolean isSetFareClassFacility() {
        return (this.fareClassFacility!= null);
    }

    /**
     * Obtient la valeur de la propriété hireFacility.
     * 
     * @return
     *     possible object is
     *     {@link HireFacilityEnumeration }
     *     
     */
    public HireFacilityEnumeration getHireFacility() {
        return hireFacility;
    }

    /**
     * Définit la valeur de la propriété hireFacility.
     * 
     * @param value
     *     allowed object is
     *     {@link HireFacilityEnumeration }
     *     
     */
    public void setHireFacility(HireFacilityEnumeration value) {
        this.hireFacility = value;
    }

    public boolean isSetHireFacility() {
        return (this.hireFacility!= null);
    }

    /**
     * Obtient la valeur de la propriété luggageFacility.
     * 
     * @return
     *     possible object is
     *     {@link LuggageFacilityEnumeration }
     *     
     */
    public LuggageFacilityEnumeration getLuggageFacility() {
        return luggageFacility;
    }

    /**
     * Définit la valeur de la propriété luggageFacility.
     * 
     * @param value
     *     allowed object is
     *     {@link LuggageFacilityEnumeration }
     *     
     */
    public void setLuggageFacility(LuggageFacilityEnumeration value) {
        this.luggageFacility = value;
    }

    public boolean isSetLuggageFacility() {
        return (this.luggageFacility!= null);
    }

    /**
     * Obtient la valeur de la propriété mobilityFacility.
     * 
     * @return
     *     possible object is
     *     {@link MobilityFacilityEnumeration }
     *     
     */
    public MobilityFacilityEnumeration getMobilityFacility() {
        return mobilityFacility;
    }

    /**
     * Définit la valeur de la propriété mobilityFacility.
     * 
     * @param value
     *     allowed object is
     *     {@link MobilityFacilityEnumeration }
     *     
     */
    public void setMobilityFacility(MobilityFacilityEnumeration value) {
        this.mobilityFacility = value;
    }

    public boolean isSetMobilityFacility() {
        return (this.mobilityFacility!= null);
    }

    /**
     * Obtient la valeur de la propriété nuisanceFacility.
     * 
     * @return
     *     possible object is
     *     {@link NuisanceFacilityEnumeration }
     *     
     */
    public NuisanceFacilityEnumeration getNuisanceFacility() {
        return nuisanceFacility;
    }

    /**
     * Définit la valeur de la propriété nuisanceFacility.
     * 
     * @param value
     *     allowed object is
     *     {@link NuisanceFacilityEnumeration }
     *     
     */
    public void setNuisanceFacility(NuisanceFacilityEnumeration value) {
        this.nuisanceFacility = value;
    }

    public boolean isSetNuisanceFacility() {
        return (this.nuisanceFacility!= null);
    }

    /**
     * Obtient la valeur de la propriété parkingFacility.
     * 
     * @return
     *     possible object is
     *     {@link ParkingFacilityEnumeration }
     *     
     */
    public ParkingFacilityEnumeration getParkingFacility() {
        return parkingFacility;
    }

    /**
     * Définit la valeur de la propriété parkingFacility.
     * 
     * @param value
     *     allowed object is
     *     {@link ParkingFacilityEnumeration }
     *     
     */
    public void setParkingFacility(ParkingFacilityEnumeration value) {
        this.parkingFacility = value;
    }

    public boolean isSetParkingFacility() {
        return (this.parkingFacility!= null);
    }

    /**
     * Obtient la valeur de la propriété passengerCommsFacility.
     * 
     * @return
     *     possible object is
     *     {@link PassengerCommsFacilityEnumeration }
     *     
     */
    public PassengerCommsFacilityEnumeration getPassengerCommsFacility() {
        return passengerCommsFacility;
    }

    /**
     * Définit la valeur de la propriété passengerCommsFacility.
     * 
     * @param value
     *     allowed object is
     *     {@link PassengerCommsFacilityEnumeration }
     *     
     */
    public void setPassengerCommsFacility(PassengerCommsFacilityEnumeration value) {
        this.passengerCommsFacility = value;
    }

    public boolean isSetPassengerCommsFacility() {
        return (this.passengerCommsFacility!= null);
    }

    /**
     * Obtient la valeur de la propriété passengerInformationFacility.
     * 
     * @return
     *     possible object is
     *     {@link PassengerInformationFacilityEnumeration }
     *     
     */
    public PassengerInformationFacilityEnumeration getPassengerInformationFacility() {
        return passengerInformationFacility;
    }

    /**
     * Définit la valeur de la propriété passengerInformationFacility.
     * 
     * @param value
     *     allowed object is
     *     {@link PassengerInformationFacilityEnumeration }
     *     
     */
    public void setPassengerInformationFacility(PassengerInformationFacilityEnumeration value) {
        this.passengerInformationFacility = value;
    }

    public boolean isSetPassengerInformationFacility() {
        return (this.passengerInformationFacility!= null);
    }

    /**
     * Obtient la valeur de la propriété refreshmentFacility.
     * 
     * @return
     *     possible object is
     *     {@link RefreshmentFacilityEnumeration }
     *     
     */
    public RefreshmentFacilityEnumeration getRefreshmentFacility() {
        return refreshmentFacility;
    }

    /**
     * Définit la valeur de la propriété refreshmentFacility.
     * 
     * @param value
     *     allowed object is
     *     {@link RefreshmentFacilityEnumeration }
     *     
     */
    public void setRefreshmentFacility(RefreshmentFacilityEnumeration value) {
        this.refreshmentFacility = value;
    }

    public boolean isSetRefreshmentFacility() {
        return (this.refreshmentFacility!= null);
    }

    /**
     * Obtient la valeur de la propriété reservedSpaceFacility.
     * 
     * @return
     *     possible object is
     *     {@link ReservedSpaceFacilityEnumeration }
     *     
     */
    public ReservedSpaceFacilityEnumeration getReservedSpaceFacility() {
        return reservedSpaceFacility;
    }

    /**
     * Définit la valeur de la propriété reservedSpaceFacility.
     * 
     * @param value
     *     allowed object is
     *     {@link ReservedSpaceFacilityEnumeration }
     *     
     */
    public void setReservedSpaceFacility(ReservedSpaceFacilityEnumeration value) {
        this.reservedSpaceFacility = value;
    }

    public boolean isSetReservedSpaceFacility() {
        return (this.reservedSpaceFacility!= null);
    }

    /**
     * Obtient la valeur de la propriété retailFacility.
     * 
     * @return
     *     possible object is
     *     {@link RetailFacilityEnumeration }
     *     
     */
    public RetailFacilityEnumeration getRetailFacility() {
        return retailFacility;
    }

    /**
     * Définit la valeur de la propriété retailFacility.
     * 
     * @param value
     *     allowed object is
     *     {@link RetailFacilityEnumeration }
     *     
     */
    public void setRetailFacility(RetailFacilityEnumeration value) {
        this.retailFacility = value;
    }

    public boolean isSetRetailFacility() {
        return (this.retailFacility!= null);
    }

    /**
     * Obtient la valeur de la propriété sanitaryFacility.
     * 
     * @return
     *     possible object is
     *     {@link SanitaryFacilityEnumeration }
     *     
     */
    public SanitaryFacilityEnumeration getSanitaryFacility() {
        return sanitaryFacility;
    }

    /**
     * Définit la valeur de la propriété sanitaryFacility.
     * 
     * @param value
     *     allowed object is
     *     {@link SanitaryFacilityEnumeration }
     *     
     */
    public void setSanitaryFacility(SanitaryFacilityEnumeration value) {
        this.sanitaryFacility = value;
    }

    public boolean isSetSanitaryFacility() {
        return (this.sanitaryFacility!= null);
    }

    /**
     * Obtient la valeur de la propriété ticketingFacility.
     * 
     * @return
     *     possible object is
     *     {@link TicketingFacilityEnumeration }
     *     
     */
    public TicketingFacilityEnumeration getTicketingFacility() {
        return ticketingFacility;
    }

    /**
     * Définit la valeur de la propriété ticketingFacility.
     * 
     * @param value
     *     allowed object is
     *     {@link TicketingFacilityEnumeration }
     *     
     */
    public void setTicketingFacility(TicketingFacilityEnumeration value) {
        this.ticketingFacility = value;
    }

    public boolean isSetTicketingFacility() {
        return (this.ticketingFacility!= null);
    }

}
