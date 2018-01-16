
package uk.org.siri.siri;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Description of any change concerning a MONITORED FACILITY New structure defined in SIRI XSD 1.1 for Faclities Management.
 * 
 * <p>Classe Java pour FacilityConditionStructure complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="FacilityConditionStructure">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;choice>
 *           &lt;element name="Facility" type="{http://www.siri.org.uk/siri}FacilityStructure"/>
 *           &lt;element ref="{http://www.siri.org.uk/siri}FacilityRef"/>
 *         &lt;/choice>
 *         &lt;element name="FacilityStatus" type="{http://www.siri.org.uk/siri}FacilityStatusStructure"/>
 *         &lt;element ref="{http://www.siri.org.uk/siri}SituationRef" minOccurs="0"/>
 *         &lt;element name="Remedy" type="{http://www.siri.org.uk/siri}RemedyStructure" minOccurs="0"/>
 *         &lt;element name="MonitoringInfo" type="{http://www.siri.org.uk/siri}MonitoringInformationStructure" minOccurs="0"/>
 *         &lt;element name="ValidityPeriod" type="{http://www.siri.org.uk/siri}HalfOpenTimestampOutputRangeStructure" minOccurs="0"/>
 *         &lt;element ref="{http://www.siri.org.uk/siri}Extensions" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FacilityConditionStructure", propOrder = {
    "facility",
    "facilityRef",
    "facilityStatus",
    "situationRef",
    "remedy",
    "monitoringInfo",
    "validityPeriod",
    "extensions"
})
public class FacilityConditionStructure
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "Facility")
    protected FacilityStructure facility;
    @XmlElement(name = "FacilityRef")
    protected FacilityRefStructure facilityRef;
    @XmlElement(name = "FacilityStatus", required = true)
    protected FacilityStatusStructure facilityStatus;
    @XmlElement(name = "SituationRef")
    protected SituationRefStructure situationRef;
    @XmlElement(name = "Remedy")
    protected RemedyStructure remedy;
    @XmlElement(name = "MonitoringInfo")
    protected MonitoringInformationStructure monitoringInfo;
    @XmlElement(name = "ValidityPeriod")
    protected HalfOpenTimestampOutputRangeStructure validityPeriod;
    @XmlElement(name = "Extensions")
    protected ExtensionsStructure extensions;

    /**
     * Obtient la valeur de la propriété facility.
     * 
     * @return
     *     possible object is
     *     {@link FacilityStructure }
     *     
     */
    public FacilityStructure getFacility() {
        return facility;
    }

    /**
     * Définit la valeur de la propriété facility.
     * 
     * @param value
     *     allowed object is
     *     {@link FacilityStructure }
     *     
     */
    public void setFacility(FacilityStructure value) {
        this.facility = value;
    }

    public boolean isSetFacility() {
        return (this.facility!= null);
    }

    /**
     * Obtient la valeur de la propriété facilityRef.
     * 
     * @return
     *     possible object is
     *     {@link FacilityRefStructure }
     *     
     */
    public FacilityRefStructure getFacilityRef() {
        return facilityRef;
    }

    /**
     * Définit la valeur de la propriété facilityRef.
     * 
     * @param value
     *     allowed object is
     *     {@link FacilityRefStructure }
     *     
     */
    public void setFacilityRef(FacilityRefStructure value) {
        this.facilityRef = value;
    }

    public boolean isSetFacilityRef() {
        return (this.facilityRef!= null);
    }

    /**
     * Obtient la valeur de la propriété facilityStatus.
     * 
     * @return
     *     possible object is
     *     {@link FacilityStatusStructure }
     *     
     */
    public FacilityStatusStructure getFacilityStatus() {
        return facilityStatus;
    }

    /**
     * Définit la valeur de la propriété facilityStatus.
     * 
     * @param value
     *     allowed object is
     *     {@link FacilityStatusStructure }
     *     
     */
    public void setFacilityStatus(FacilityStatusStructure value) {
        this.facilityStatus = value;
    }

    public boolean isSetFacilityStatus() {
        return (this.facilityStatus!= null);
    }

    /**
     * Obtient la valeur de la propriété situationRef.
     * 
     * @return
     *     possible object is
     *     {@link SituationRefStructure }
     *     
     */
    public SituationRefStructure getSituationRef() {
        return situationRef;
    }

    /**
     * Définit la valeur de la propriété situationRef.
     * 
     * @param value
     *     allowed object is
     *     {@link SituationRefStructure }
     *     
     */
    public void setSituationRef(SituationRefStructure value) {
        this.situationRef = value;
    }

    public boolean isSetSituationRef() {
        return (this.situationRef!= null);
    }

    /**
     * Obtient la valeur de la propriété remedy.
     * 
     * @return
     *     possible object is
     *     {@link RemedyStructure }
     *     
     */
    public RemedyStructure getRemedy() {
        return remedy;
    }

    /**
     * Définit la valeur de la propriété remedy.
     * 
     * @param value
     *     allowed object is
     *     {@link RemedyStructure }
     *     
     */
    public void setRemedy(RemedyStructure value) {
        this.remedy = value;
    }

    public boolean isSetRemedy() {
        return (this.remedy!= null);
    }

    /**
     * Obtient la valeur de la propriété monitoringInfo.
     * 
     * @return
     *     possible object is
     *     {@link MonitoringInformationStructure }
     *     
     */
    public MonitoringInformationStructure getMonitoringInfo() {
        return monitoringInfo;
    }

    /**
     * Définit la valeur de la propriété monitoringInfo.
     * 
     * @param value
     *     allowed object is
     *     {@link MonitoringInformationStructure }
     *     
     */
    public void setMonitoringInfo(MonitoringInformationStructure value) {
        this.monitoringInfo = value;
    }

    public boolean isSetMonitoringInfo() {
        return (this.monitoringInfo!= null);
    }

    /**
     * Obtient la valeur de la propriété validityPeriod.
     * 
     * @return
     *     possible object is
     *     {@link HalfOpenTimestampOutputRangeStructure }
     *     
     */
    public HalfOpenTimestampOutputRangeStructure getValidityPeriod() {
        return validityPeriod;
    }

    /**
     * Définit la valeur de la propriété validityPeriod.
     * 
     * @param value
     *     allowed object is
     *     {@link HalfOpenTimestampOutputRangeStructure }
     *     
     */
    public void setValidityPeriod(HalfOpenTimestampOutputRangeStructure value) {
        this.validityPeriod = value;
    }

    public boolean isSetValidityPeriod() {
        return (this.validityPeriod!= null);
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

}
