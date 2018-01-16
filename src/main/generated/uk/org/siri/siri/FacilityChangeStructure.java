
package uk.org.siri.siri;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Type for change to equipment availability. Basic structure defined in the first 1.0 SIRI XSd.
 * 
 * <p>Classe Java pour FacilityChangeStructure complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="FacilityChangeStructure">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="EquipmentAvailability" type="{http://www.siri.org.uk/siri}EquipmentAvailabilityStructure" minOccurs="0"/>
 *         &lt;element ref="{http://www.siri.org.uk/siri}SituationRef" minOccurs="0"/>
 *         &lt;element name="MobilityDisruption" type="{http://www.siri.org.uk/siri}MobilityDisruptionStructure" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FacilityChangeStructure", propOrder = {
    "equipmentAvailability",
    "situationRef",
    "mobilityDisruption"
})
public class FacilityChangeStructure
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "EquipmentAvailability")
    protected EquipmentAvailabilityStructure equipmentAvailability;
    @XmlElement(name = "SituationRef")
    protected SituationRefStructure situationRef;
    @XmlElement(name = "MobilityDisruption")
    protected MobilityDisruptionStructure mobilityDisruption;

    /**
     * Obtient la valeur de la propriété equipmentAvailability.
     * 
     * @return
     *     possible object is
     *     {@link EquipmentAvailabilityStructure }
     *     
     */
    public EquipmentAvailabilityStructure getEquipmentAvailability() {
        return equipmentAvailability;
    }

    /**
     * Définit la valeur de la propriété equipmentAvailability.
     * 
     * @param value
     *     allowed object is
     *     {@link EquipmentAvailabilityStructure }
     *     
     */
    public void setEquipmentAvailability(EquipmentAvailabilityStructure value) {
        this.equipmentAvailability = value;
    }

    public boolean isSetEquipmentAvailability() {
        return (this.equipmentAvailability!= null);
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
     * Obtient la valeur de la propriété mobilityDisruption.
     * 
     * @return
     *     possible object is
     *     {@link MobilityDisruptionStructure }
     *     
     */
    public MobilityDisruptionStructure getMobilityDisruption() {
        return mobilityDisruption;
    }

    /**
     * Définit la valeur de la propriété mobilityDisruption.
     * 
     * @param value
     *     allowed object is
     *     {@link MobilityDisruptionStructure }
     *     
     */
    public void setMobilityDisruption(MobilityDisruptionStructure value) {
        this.mobilityDisruption = value;
    }

    public boolean isSetMobilityDisruption() {
        return (this.mobilityDisruption!= null);
    }

}
