
package uk.org.siri.siri;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Type for Timetabled Visit of a VEHICLE to a stop. May provide information about the arrival, the departure or both.
 * 
 * <p>Classe Java pour TimetabledStopVisitStructure complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="TimetabledStopVisitStructure">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.siri.org.uk/siri}AbstractIdentifiedItemStructure">
 *       &lt;sequence>
 *         &lt;element name="MonitoringRef" type="{http://www.siri.org.uk/siri}MonitoringRefStructure"/>
 *         &lt;element ref="{http://www.siri.org.uk/siri}TargetedVehicleJourney"/>
 *         &lt;element ref="{http://www.siri.org.uk/siri}Extensions" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TimetabledStopVisitStructure", propOrder = {
    "monitoringRef",
    "targetedVehicleJourney",
    "extensions"
})
public class TimetabledStopVisitStructure
    extends AbstractIdentifiedItemStructure
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "MonitoringRef", required = true)
    protected MonitoringRefStructure monitoringRef;
    @XmlElement(name = "TargetedVehicleJourney", required = true)
    protected TargetedVehicleJourneyStructure targetedVehicleJourney;
    @XmlElement(name = "Extensions")
    protected ExtensionsStructure extensions;

    /**
     * Obtient la valeur de la propriété monitoringRef.
     * 
     * @return
     *     possible object is
     *     {@link MonitoringRefStructure }
     *     
     */
    public MonitoringRefStructure getMonitoringRef() {
        return monitoringRef;
    }

    /**
     * Définit la valeur de la propriété monitoringRef.
     * 
     * @param value
     *     allowed object is
     *     {@link MonitoringRefStructure }
     *     
     */
    public void setMonitoringRef(MonitoringRefStructure value) {
        this.monitoringRef = value;
    }

    public boolean isSetMonitoringRef() {
        return (this.monitoringRef!= null);
    }

    /**
     * Obtient la valeur de la propriété targetedVehicleJourney.
     * 
     * @return
     *     possible object is
     *     {@link TargetedVehicleJourneyStructure }
     *     
     */
    public TargetedVehicleJourneyStructure getTargetedVehicleJourney() {
        return targetedVehicleJourney;
    }

    /**
     * Définit la valeur de la propriété targetedVehicleJourney.
     * 
     * @param value
     *     allowed object is
     *     {@link TargetedVehicleJourneyStructure }
     *     
     */
    public void setTargetedVehicleJourney(TargetedVehicleJourneyStructure value) {
        this.targetedVehicleJourney = value;
    }

    public boolean isSetTargetedVehicleJourney() {
        return (this.targetedVehicleJourney!= null);
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
