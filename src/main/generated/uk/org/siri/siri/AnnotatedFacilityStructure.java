
package uk.org.siri.siri;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Summary information about  Facility. Used in DISCOVERY used 
 * 
 * <p>Classe Java pour AnnotatedFacilityStructure complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="AnnotatedFacilityStructure">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.siri.org.uk/siri}FacilityRef"/>
 *         &lt;element name="Monitored" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="Facility" type="{http://www.siri.org.uk/siri}FacilityStructure" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AnnotatedFacilityStructure", propOrder = {
    "facilityRef",
    "monitored",
    "facility"
})
public class AnnotatedFacilityStructure
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "FacilityRef", required = true)
    protected FacilityRefStructure facilityRef;
    @XmlElement(name = "Monitored", defaultValue = "true")
    protected Boolean monitored;
    @XmlElement(name = "Facility")
    protected FacilityStructure facility;

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
     * Obtient la valeur de la propriété monitored.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMonitored() {
        return monitored;
    }

    /**
     * Définit la valeur de la propriété monitored.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMonitored(Boolean value) {
        this.monitored = value;
    }

    public boolean isSetMonitored() {
        return (this.monitored!= null);
    }

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

}
