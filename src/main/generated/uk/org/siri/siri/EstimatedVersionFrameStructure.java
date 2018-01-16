
package uk.org.siri.siri;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * Type for version frame structure.
 * 
 * <p>Classe Java pour EstimatedVersionFrameStructure complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="EstimatedVersionFrameStructure">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.siri.org.uk/siri}AbstractItemStructure">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.siri.org.uk/siri}VersionRef" minOccurs="0"/>
 *         &lt;element ref="{http://www.siri.org.uk/siri}EstimatedVehicleJourney" maxOccurs="unbounded"/>
 *         &lt;element ref="{http://www.siri.org.uk/siri}EstimatedServiceJourneyInterchange" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EstimatedVersionFrameStructure", propOrder = {
    "versionRef",
    "estimatedVehicleJourney",
    "estimatedServiceJourneyInterchange"
})
public class EstimatedVersionFrameStructure
    extends AbstractItemStructure
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "VersionRef")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String versionRef;
    @XmlElement(name = "EstimatedVehicleJourney", required = true)
    protected List<EstimatedVehicleJourneyStructure> estimatedVehicleJourney;
    @XmlElement(name = "EstimatedServiceJourneyInterchange")
    protected List<EstimatedServiceJourneyInterchangeStructure> estimatedServiceJourneyInterchange;

    /**
     * Obtient la valeur de la propriété versionRef.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVersionRef() {
        return versionRef;
    }

    /**
     * Définit la valeur de la propriété versionRef.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVersionRef(String value) {
        this.versionRef = value;
    }

    public boolean isSetVersionRef() {
        return (this.versionRef!= null);
    }

    /**
     * Gets the value of the estimatedVehicleJourney property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the estimatedVehicleJourney property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEstimatedVehicleJourney().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link EstimatedVehicleJourneyStructure }
     * 
     * 
     */
    public List<EstimatedVehicleJourneyStructure> getEstimatedVehicleJourney() {
        if (estimatedVehicleJourney == null) {
            estimatedVehicleJourney = new ArrayList<EstimatedVehicleJourneyStructure>();
        }
        return this.estimatedVehicleJourney;
    }

    public boolean isSetEstimatedVehicleJourney() {
        return ((this.estimatedVehicleJourney!= null)&&(!this.estimatedVehicleJourney.isEmpty()));
    }

    public void unsetEstimatedVehicleJourney() {
        this.estimatedVehicleJourney = null;
    }

    /**
     * Connection parameters for a monitored SERVICE JOURNEY INTERCHANGE between a feeder and distributor journey. SIRI 2.0 Gets the value of the estimatedServiceJourneyInterchange property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the estimatedServiceJourneyInterchange property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEstimatedServiceJourneyInterchange().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link EstimatedServiceJourneyInterchangeStructure }
     * 
     * 
     */
    public List<EstimatedServiceJourneyInterchangeStructure> getEstimatedServiceJourneyInterchange() {
        if (estimatedServiceJourneyInterchange == null) {
            estimatedServiceJourneyInterchange = new ArrayList<EstimatedServiceJourneyInterchangeStructure>();
        }
        return this.estimatedServiceJourneyInterchange;
    }

    public boolean isSetEstimatedServiceJourneyInterchange() {
        return ((this.estimatedServiceJourneyInterchange!= null)&&(!this.estimatedServiceJourneyInterchange.isEmpty()));
    }

    public void unsetEstimatedServiceJourneyInterchange() {
        this.estimatedServiceJourneyInterchange = null;
    }

}
