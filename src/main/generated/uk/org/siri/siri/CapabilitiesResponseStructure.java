
package uk.org.siri.siri;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * Type for the capabilities of an implementation.
 * 
 * <p>Classe Java pour CapabilitiesResponseStructure complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="CapabilitiesResponseStructure">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.siri.org.uk/siri}ProducerResponseStructure">
 *       &lt;sequence>
 *         &lt;group ref="{http://www.siri.org.uk/siri}SiriServiceCapabilitiesResponseGroup"/>
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
@XmlType(name = "CapabilitiesResponseStructure", propOrder = {
    "productionTimetableCapabilitiesResponse",
    "estimatedTimetableCapabilitiesResponse",
    "stopTimetableCapabilitiesResponse",
    "stopMonitoringCapabilitiesResponse",
    "vehicleMonitoringCapabilitiesResponse",
    "connectionTimetableCapabilitiesResponse",
    "connectionMonitoringCapabilitiesResponse",
    "generalMessageCapabilitiesResponse",
    "facilityMonitoringCapabilitiesResponse",
    "situationExchangeCapabilitiesResponse"
})
public class CapabilitiesResponseStructure
    extends ProducerResponseStructure
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "ProductionTimetableCapabilitiesResponse")
    protected ProductionTimetableCapabilitiesResponseStructure productionTimetableCapabilitiesResponse;
    @XmlElement(name = "EstimatedTimetableCapabilitiesResponse")
    protected EstimatedTimetableCapabilitiesResponseStructure estimatedTimetableCapabilitiesResponse;
    @XmlElement(name = "StopTimetableCapabilitiesResponse")
    protected StopTimetableCapabilitiesResponseStructure stopTimetableCapabilitiesResponse;
    @XmlElement(name = "StopMonitoringCapabilitiesResponse")
    protected StopMonitoringCapabilitiesResponseStructure stopMonitoringCapabilitiesResponse;
    @XmlElement(name = "VehicleMonitoringCapabilitiesResponse")
    protected VehicleMonitoringCapabilitiesResponseStructure vehicleMonitoringCapabilitiesResponse;
    @XmlElement(name = "ConnectionTimetableCapabilitiesResponse")
    protected ConnectionTimetableCapabilitiesResponseStructure connectionTimetableCapabilitiesResponse;
    @XmlElement(name = "ConnectionMonitoringCapabilitiesResponse")
    protected ConnectionMonitoringCapabilitiesResponseStructure connectionMonitoringCapabilitiesResponse;
    @XmlElement(name = "GeneralMessageCapabilitiesResponse")
    protected GeneralMessageCapabilitiesResponseStructure generalMessageCapabilitiesResponse;
    @XmlElement(name = "FacilityMonitoringCapabilitiesResponse")
    protected FacilityMonitoringCapabilitiesResponseStructure facilityMonitoringCapabilitiesResponse;
    @XmlElement(name = "SituationExchangeCapabilitiesResponse")
    protected SituationExchangeCapabilitiesResponseStructure situationExchangeCapabilitiesResponse;
    @XmlAttribute(name = "version")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String version;

    /**
     * Obtient la valeur de la propriété productionTimetableCapabilitiesResponse.
     * 
     * @return
     *     possible object is
     *     {@link ProductionTimetableCapabilitiesResponseStructure }
     *     
     */
    public ProductionTimetableCapabilitiesResponseStructure getProductionTimetableCapabilitiesResponse() {
        return productionTimetableCapabilitiesResponse;
    }

    /**
     * Définit la valeur de la propriété productionTimetableCapabilitiesResponse.
     * 
     * @param value
     *     allowed object is
     *     {@link ProductionTimetableCapabilitiesResponseStructure }
     *     
     */
    public void setProductionTimetableCapabilitiesResponse(ProductionTimetableCapabilitiesResponseStructure value) {
        this.productionTimetableCapabilitiesResponse = value;
    }

    public boolean isSetProductionTimetableCapabilitiesResponse() {
        return (this.productionTimetableCapabilitiesResponse!= null);
    }

    /**
     * Obtient la valeur de la propriété estimatedTimetableCapabilitiesResponse.
     * 
     * @return
     *     possible object is
     *     {@link EstimatedTimetableCapabilitiesResponseStructure }
     *     
     */
    public EstimatedTimetableCapabilitiesResponseStructure getEstimatedTimetableCapabilitiesResponse() {
        return estimatedTimetableCapabilitiesResponse;
    }

    /**
     * Définit la valeur de la propriété estimatedTimetableCapabilitiesResponse.
     * 
     * @param value
     *     allowed object is
     *     {@link EstimatedTimetableCapabilitiesResponseStructure }
     *     
     */
    public void setEstimatedTimetableCapabilitiesResponse(EstimatedTimetableCapabilitiesResponseStructure value) {
        this.estimatedTimetableCapabilitiesResponse = value;
    }

    public boolean isSetEstimatedTimetableCapabilitiesResponse() {
        return (this.estimatedTimetableCapabilitiesResponse!= null);
    }

    /**
     * Obtient la valeur de la propriété stopTimetableCapabilitiesResponse.
     * 
     * @return
     *     possible object is
     *     {@link StopTimetableCapabilitiesResponseStructure }
     *     
     */
    public StopTimetableCapabilitiesResponseStructure getStopTimetableCapabilitiesResponse() {
        return stopTimetableCapabilitiesResponse;
    }

    /**
     * Définit la valeur de la propriété stopTimetableCapabilitiesResponse.
     * 
     * @param value
     *     allowed object is
     *     {@link StopTimetableCapabilitiesResponseStructure }
     *     
     */
    public void setStopTimetableCapabilitiesResponse(StopTimetableCapabilitiesResponseStructure value) {
        this.stopTimetableCapabilitiesResponse = value;
    }

    public boolean isSetStopTimetableCapabilitiesResponse() {
        return (this.stopTimetableCapabilitiesResponse!= null);
    }

    /**
     * Obtient la valeur de la propriété stopMonitoringCapabilitiesResponse.
     * 
     * @return
     *     possible object is
     *     {@link StopMonitoringCapabilitiesResponseStructure }
     *     
     */
    public StopMonitoringCapabilitiesResponseStructure getStopMonitoringCapabilitiesResponse() {
        return stopMonitoringCapabilitiesResponse;
    }

    /**
     * Définit la valeur de la propriété stopMonitoringCapabilitiesResponse.
     * 
     * @param value
     *     allowed object is
     *     {@link StopMonitoringCapabilitiesResponseStructure }
     *     
     */
    public void setStopMonitoringCapabilitiesResponse(StopMonitoringCapabilitiesResponseStructure value) {
        this.stopMonitoringCapabilitiesResponse = value;
    }

    public boolean isSetStopMonitoringCapabilitiesResponse() {
        return (this.stopMonitoringCapabilitiesResponse!= null);
    }

    /**
     * Obtient la valeur de la propriété vehicleMonitoringCapabilitiesResponse.
     * 
     * @return
     *     possible object is
     *     {@link VehicleMonitoringCapabilitiesResponseStructure }
     *     
     */
    public VehicleMonitoringCapabilitiesResponseStructure getVehicleMonitoringCapabilitiesResponse() {
        return vehicleMonitoringCapabilitiesResponse;
    }

    /**
     * Définit la valeur de la propriété vehicleMonitoringCapabilitiesResponse.
     * 
     * @param value
     *     allowed object is
     *     {@link VehicleMonitoringCapabilitiesResponseStructure }
     *     
     */
    public void setVehicleMonitoringCapabilitiesResponse(VehicleMonitoringCapabilitiesResponseStructure value) {
        this.vehicleMonitoringCapabilitiesResponse = value;
    }

    public boolean isSetVehicleMonitoringCapabilitiesResponse() {
        return (this.vehicleMonitoringCapabilitiesResponse!= null);
    }

    /**
     * Obtient la valeur de la propriété connectionTimetableCapabilitiesResponse.
     * 
     * @return
     *     possible object is
     *     {@link ConnectionTimetableCapabilitiesResponseStructure }
     *     
     */
    public ConnectionTimetableCapabilitiesResponseStructure getConnectionTimetableCapabilitiesResponse() {
        return connectionTimetableCapabilitiesResponse;
    }

    /**
     * Définit la valeur de la propriété connectionTimetableCapabilitiesResponse.
     * 
     * @param value
     *     allowed object is
     *     {@link ConnectionTimetableCapabilitiesResponseStructure }
     *     
     */
    public void setConnectionTimetableCapabilitiesResponse(ConnectionTimetableCapabilitiesResponseStructure value) {
        this.connectionTimetableCapabilitiesResponse = value;
    }

    public boolean isSetConnectionTimetableCapabilitiesResponse() {
        return (this.connectionTimetableCapabilitiesResponse!= null);
    }

    /**
     * Obtient la valeur de la propriété connectionMonitoringCapabilitiesResponse.
     * 
     * @return
     *     possible object is
     *     {@link ConnectionMonitoringCapabilitiesResponseStructure }
     *     
     */
    public ConnectionMonitoringCapabilitiesResponseStructure getConnectionMonitoringCapabilitiesResponse() {
        return connectionMonitoringCapabilitiesResponse;
    }

    /**
     * Définit la valeur de la propriété connectionMonitoringCapabilitiesResponse.
     * 
     * @param value
     *     allowed object is
     *     {@link ConnectionMonitoringCapabilitiesResponseStructure }
     *     
     */
    public void setConnectionMonitoringCapabilitiesResponse(ConnectionMonitoringCapabilitiesResponseStructure value) {
        this.connectionMonitoringCapabilitiesResponse = value;
    }

    public boolean isSetConnectionMonitoringCapabilitiesResponse() {
        return (this.connectionMonitoringCapabilitiesResponse!= null);
    }

    /**
     * Obtient la valeur de la propriété generalMessageCapabilitiesResponse.
     * 
     * @return
     *     possible object is
     *     {@link GeneralMessageCapabilitiesResponseStructure }
     *     
     */
    public GeneralMessageCapabilitiesResponseStructure getGeneralMessageCapabilitiesResponse() {
        return generalMessageCapabilitiesResponse;
    }

    /**
     * Définit la valeur de la propriété generalMessageCapabilitiesResponse.
     * 
     * @param value
     *     allowed object is
     *     {@link GeneralMessageCapabilitiesResponseStructure }
     *     
     */
    public void setGeneralMessageCapabilitiesResponse(GeneralMessageCapabilitiesResponseStructure value) {
        this.generalMessageCapabilitiesResponse = value;
    }

    public boolean isSetGeneralMessageCapabilitiesResponse() {
        return (this.generalMessageCapabilitiesResponse!= null);
    }

    /**
     * Obtient la valeur de la propriété facilityMonitoringCapabilitiesResponse.
     * 
     * @return
     *     possible object is
     *     {@link FacilityMonitoringCapabilitiesResponseStructure }
     *     
     */
    public FacilityMonitoringCapabilitiesResponseStructure getFacilityMonitoringCapabilitiesResponse() {
        return facilityMonitoringCapabilitiesResponse;
    }

    /**
     * Définit la valeur de la propriété facilityMonitoringCapabilitiesResponse.
     * 
     * @param value
     *     allowed object is
     *     {@link FacilityMonitoringCapabilitiesResponseStructure }
     *     
     */
    public void setFacilityMonitoringCapabilitiesResponse(FacilityMonitoringCapabilitiesResponseStructure value) {
        this.facilityMonitoringCapabilitiesResponse = value;
    }

    public boolean isSetFacilityMonitoringCapabilitiesResponse() {
        return (this.facilityMonitoringCapabilitiesResponse!= null);
    }

    /**
     * Obtient la valeur de la propriété situationExchangeCapabilitiesResponse.
     * 
     * @return
     *     possible object is
     *     {@link SituationExchangeCapabilitiesResponseStructure }
     *     
     */
    public SituationExchangeCapabilitiesResponseStructure getSituationExchangeCapabilitiesResponse() {
        return situationExchangeCapabilitiesResponse;
    }

    /**
     * Définit la valeur de la propriété situationExchangeCapabilitiesResponse.
     * 
     * @param value
     *     allowed object is
     *     {@link SituationExchangeCapabilitiesResponseStructure }
     *     
     */
    public void setSituationExchangeCapabilitiesResponse(SituationExchangeCapabilitiesResponseStructure value) {
        this.situationExchangeCapabilitiesResponse = value;
    }

    public boolean isSetSituationExchangeCapabilitiesResponse() {
        return (this.situationExchangeCapabilitiesResponse!= null);
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
