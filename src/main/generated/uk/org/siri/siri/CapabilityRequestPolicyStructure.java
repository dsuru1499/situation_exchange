
package uk.org.siri.siri;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * Type for Common Request Policy capabilities.
 * 
 * <p>Classe Java pour CapabilityRequestPolicyStructure complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="CapabilityRequestPolicyStructure">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="NationalLanguage" type="{http://www.w3.org/2001/XMLSchema}language" maxOccurs="unbounded"/>
 *         &lt;element name="Translations" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;choice>
 *           &lt;element name="GmlCoordinateFormat" type="{http://www.siri.org.uk/siri}SrsNameType"/>
 *           &lt;element name="WgsDecimalDegrees" type="{http://www.siri.org.uk/siri}EmptyType"/>
 *         &lt;/choice>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CapabilityRequestPolicyStructure", propOrder = {
    "nationalLanguage",
    "translations",
    "gmlCoordinateFormat",
    "wgsDecimalDegrees"
})
@XmlSeeAlso({
    uk.org.siri.siri.SituationExchangeServiceCapabilitiesStructure.RequestPolicy.class,
    uk.org.siri.siri.ProductionTimetableServiceCapabilitiesStructure.RequestPolicy.class,
    uk.org.siri.siri.VehicleMonitoringServiceCapabilitiesStructure.RequestPolicy.class,
    uk.org.siri.siri.ConnectionMonitoringServiceCapabilitiesStructure.RequestPolicy.class,
    uk.org.siri.siri.FacilityMonitoringServiceCapabilitiesStructure.RequestPolicy.class,
    uk.org.siri.siri.ConnectionTimetableServiceCapabilitiesStructure.RequestPolicy.class,
    uk.org.siri.siri.EstimatedTimetableServiceCapabilitiesStructure.RequestPolicy.class,
    StopTimetableCapabilityRequestPolicyStructure.class,
    EstimatedTimetableCapabilityRequestPolicyStructure.class,
    VehicleMonitoringCapabilityRequestPolicyStructure.class,
    ConnectionTimetableCapabilityRequestPolicyStructure.class,
    ConnectionMonitoringCapabilityRequestPolicyStructure.class,
    ProductionTimetableCapabilityRequestPolicyStructure.class,
    StopMonitoringCapabilityRequestPolicyStructure.class
})
public class CapabilityRequestPolicyStructure
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "NationalLanguage", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "language")
    protected List<String> nationalLanguage;
    @XmlElement(name = "Translations")
    protected Boolean translations;
    @XmlElement(name = "GmlCoordinateFormat")
    protected String gmlCoordinateFormat;
    @XmlElement(name = "WgsDecimalDegrees")
    protected String wgsDecimalDegrees;

    /**
     * Gets the value of the nationalLanguage property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the nationalLanguage property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getNationalLanguage().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getNationalLanguage() {
        if (nationalLanguage == null) {
            nationalLanguage = new ArrayList<String>();
        }
        return this.nationalLanguage;
    }

    public boolean isSetNationalLanguage() {
        return ((this.nationalLanguage!= null)&&(!this.nationalLanguage.isEmpty()));
    }

    public void unsetNationalLanguage() {
        this.nationalLanguage = null;
    }

    /**
     * Obtient la valeur de la propriété translations.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isTranslations() {
        return translations;
    }

    /**
     * Définit la valeur de la propriété translations.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setTranslations(Boolean value) {
        this.translations = value;
    }

    public boolean isSetTranslations() {
        return (this.translations!= null);
    }

    /**
     * Obtient la valeur de la propriété gmlCoordinateFormat.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGmlCoordinateFormat() {
        return gmlCoordinateFormat;
    }

    /**
     * Définit la valeur de la propriété gmlCoordinateFormat.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGmlCoordinateFormat(String value) {
        this.gmlCoordinateFormat = value;
    }

    public boolean isSetGmlCoordinateFormat() {
        return (this.gmlCoordinateFormat!= null);
    }

    /**
     * Obtient la valeur de la propriété wgsDecimalDegrees.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWgsDecimalDegrees() {
        return wgsDecimalDegrees;
    }

    /**
     * Définit la valeur de la propriété wgsDecimalDegrees.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWgsDecimalDegrees(String value) {
        this.wgsDecimalDegrees = value;
    }

    public boolean isSetWgsDecimalDegrees() {
        return (this.wgsDecimalDegrees!= null);
    }

}
