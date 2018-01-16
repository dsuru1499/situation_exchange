
package uk.org.siri.siri;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Type for information about a FACILITY affected by an SITUATION. (+SIRI 2.0)
 * 
 * <p>Classe Java pour AffectedFacilityStructure complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="AffectedFacilityStructure">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.siri.org.uk/siri}FacilityRef" minOccurs="0"/>
 *         &lt;element name="StartStopPointRef" type="{http://www.siri.org.uk/siri}StopPointRefStructure" minOccurs="0"/>
 *         &lt;element name="EndStopPointRef" type="{http://www.siri.org.uk/siri}StopPointRefStructure" minOccurs="0"/>
 *         &lt;element name="FacilityName" type="{http://www.siri.org.uk/siri}NaturalLanguageStringStructure" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="FacilityStatus" type="{http://www.siri.org.uk/siri}FacilityStatusEnumeration" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://www.siri.org.uk/siri}Extensions" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AffectedFacilityStructure", propOrder = {
    "facilityRef",
    "startStopPointRef",
    "endStopPointRef",
    "facilityName",
    "facilityStatus",
    "extensions"
})
public class AffectedFacilityStructure
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "FacilityRef")
    protected FacilityRefStructure facilityRef;
    @XmlElement(name = "StartStopPointRef")
    protected StopPointRefStructure startStopPointRef;
    @XmlElement(name = "EndStopPointRef")
    protected StopPointRefStructure endStopPointRef;
    @XmlElement(name = "FacilityName")
    protected List<NaturalLanguageStringStructure> facilityName;
    @XmlElement(name = "FacilityStatus")
    protected List<FacilityStatusEnumeration> facilityStatus;
    @XmlElement(name = "Extensions")
    protected List<ExtensionsStructure> extensions;

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
     * Obtient la valeur de la propriété startStopPointRef.
     * 
     * @return
     *     possible object is
     *     {@link StopPointRefStructure }
     *     
     */
    public StopPointRefStructure getStartStopPointRef() {
        return startStopPointRef;
    }

    /**
     * Définit la valeur de la propriété startStopPointRef.
     * 
     * @param value
     *     allowed object is
     *     {@link StopPointRefStructure }
     *     
     */
    public void setStartStopPointRef(StopPointRefStructure value) {
        this.startStopPointRef = value;
    }

    public boolean isSetStartStopPointRef() {
        return (this.startStopPointRef!= null);
    }

    /**
     * Obtient la valeur de la propriété endStopPointRef.
     * 
     * @return
     *     possible object is
     *     {@link StopPointRefStructure }
     *     
     */
    public StopPointRefStructure getEndStopPointRef() {
        return endStopPointRef;
    }

    /**
     * Définit la valeur de la propriété endStopPointRef.
     * 
     * @param value
     *     allowed object is
     *     {@link StopPointRefStructure }
     *     
     */
    public void setEndStopPointRef(StopPointRefStructure value) {
        this.endStopPointRef = value;
    }

    public boolean isSetEndStopPointRef() {
        return (this.endStopPointRef!= null);
    }

    /**
     * Gets the value of the facilityName property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the facilityName property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFacilityName().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link NaturalLanguageStringStructure }
     * 
     * 
     */
    public List<NaturalLanguageStringStructure> getFacilityName() {
        if (facilityName == null) {
            facilityName = new ArrayList<NaturalLanguageStringStructure>();
        }
        return this.facilityName;
    }

    public boolean isSetFacilityName() {
        return ((this.facilityName!= null)&&(!this.facilityName.isEmpty()));
    }

    public void unsetFacilityName() {
        this.facilityName = null;
    }

    /**
     * Gets the value of the facilityStatus property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the facilityStatus property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFacilityStatus().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FacilityStatusEnumeration }
     * 
     * 
     */
    public List<FacilityStatusEnumeration> getFacilityStatus() {
        if (facilityStatus == null) {
            facilityStatus = new ArrayList<FacilityStatusEnumeration>();
        }
        return this.facilityStatus;
    }

    public boolean isSetFacilityStatus() {
        return ((this.facilityStatus!= null)&&(!this.facilityStatus.isEmpty()));
    }

    public void unsetFacilityStatus() {
        this.facilityStatus = null;
    }

    /**
     * Gets the value of the extensions property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the extensions property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getExtensions().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ExtensionsStructure }
     * 
     * 
     */
    public List<ExtensionsStructure> getExtensions() {
        if (extensions == null) {
            extensions = new ArrayList<ExtensionsStructure>();
        }
        return this.extensions;
    }

    public boolean isSetExtensions() {
        return ((this.extensions!= null)&&(!this.extensions.isEmpty()));
    }

    public void unsetExtensions() {
        this.extensions = null;
    }

}
