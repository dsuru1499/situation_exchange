
package uk.org.siri.siri;

import java.io.Serializable;
import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * Type for Functional Service Request for Vehicle Monitoring Service.
 * 
 * <p>Classe Java pour VehicleMonitoringRequestStructure complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="VehicleMonitoringRequestStructure">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.siri.org.uk/siri}AbstractFunctionalServiceRequestStructure">
 *       &lt;sequence>
 *         &lt;group ref="{http://www.siri.org.uk/siri}VehicleMonitoringTopicGroup"/>
 *         &lt;group ref="{http://www.siri.org.uk/siri}VehicleMonitoringRequestPolicyGroup"/>
 *         &lt;element ref="{http://www.siri.org.uk/siri}Extensions" minOccurs="0"/>
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
@XmlType(name = "VehicleMonitoringRequestStructure", propOrder = {
    "vehicleMonitoringRef",
    "vehicleRef",
    "lineRef",
    "directionRef",
    "language",
    "includeTranslations",
    "maximumVehicles",
    "vehicleMonitoringDetailLevel",
    "maximumNumberOfCalls",
    "includeSituations",
    "extensions"
})
public class VehicleMonitoringRequestStructure
    extends AbstractFunctionalServiceRequestStructure
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "VehicleMonitoringRef")
    protected VehicleMonitoringRefStructure vehicleMonitoringRef;
    @XmlElement(name = "VehicleRef")
    protected VehicleRefStructure vehicleRef;
    @XmlElement(name = "LineRef")
    protected LineRefStructure lineRef;
    @XmlElement(name = "DirectionRef")
    protected DirectionRefStructure directionRef;
    @XmlElement(name = "Language", defaultValue = "en")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "language")
    protected String language;
    @XmlElement(name = "IncludeTranslations")
    protected Boolean includeTranslations;
    @XmlElement(name = "MaximumVehicles")
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger maximumVehicles;
    @XmlElement(name = "VehicleMonitoringDetailLevel")
    protected VehicleMonitoringDetailEnumeration vehicleMonitoringDetailLevel;
    @XmlElement(name = "MaximumNumberOfCalls")
    protected VehicleMonitoringRequestStructure.MaximumNumberOfCalls maximumNumberOfCalls;
    @XmlElement(name = "IncludeSituations")
    protected Boolean includeSituations;
    @XmlElement(name = "Extensions")
    protected ExtensionsStructure extensions;
    @XmlAttribute(name = "version")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String version;

    /**
     * Obtient la valeur de la propriété vehicleMonitoringRef.
     * 
     * @return
     *     possible object is
     *     {@link VehicleMonitoringRefStructure }
     *     
     */
    public VehicleMonitoringRefStructure getVehicleMonitoringRef() {
        return vehicleMonitoringRef;
    }

    /**
     * Définit la valeur de la propriété vehicleMonitoringRef.
     * 
     * @param value
     *     allowed object is
     *     {@link VehicleMonitoringRefStructure }
     *     
     */
    public void setVehicleMonitoringRef(VehicleMonitoringRefStructure value) {
        this.vehicleMonitoringRef = value;
    }

    public boolean isSetVehicleMonitoringRef() {
        return (this.vehicleMonitoringRef!= null);
    }

    /**
     * Obtient la valeur de la propriété vehicleRef.
     * 
     * @return
     *     possible object is
     *     {@link VehicleRefStructure }
     *     
     */
    public VehicleRefStructure getVehicleRef() {
        return vehicleRef;
    }

    /**
     * Définit la valeur de la propriété vehicleRef.
     * 
     * @param value
     *     allowed object is
     *     {@link VehicleRefStructure }
     *     
     */
    public void setVehicleRef(VehicleRefStructure value) {
        this.vehicleRef = value;
    }

    public boolean isSetVehicleRef() {
        return (this.vehicleRef!= null);
    }

    /**
     * Obtient la valeur de la propriété lineRef.
     * 
     * @return
     *     possible object is
     *     {@link LineRefStructure }
     *     
     */
    public LineRefStructure getLineRef() {
        return lineRef;
    }

    /**
     * Définit la valeur de la propriété lineRef.
     * 
     * @param value
     *     allowed object is
     *     {@link LineRefStructure }
     *     
     */
    public void setLineRef(LineRefStructure value) {
        this.lineRef = value;
    }

    public boolean isSetLineRef() {
        return (this.lineRef!= null);
    }

    /**
     * Obtient la valeur de la propriété directionRef.
     * 
     * @return
     *     possible object is
     *     {@link DirectionRefStructure }
     *     
     */
    public DirectionRefStructure getDirectionRef() {
        return directionRef;
    }

    /**
     * Définit la valeur de la propriété directionRef.
     * 
     * @param value
     *     allowed object is
     *     {@link DirectionRefStructure }
     *     
     */
    public void setDirectionRef(DirectionRefStructure value) {
        this.directionRef = value;
    }

    public boolean isSetDirectionRef() {
        return (this.directionRef!= null);
    }

    /**
     * Obtient la valeur de la propriété language.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLanguage() {
        return language;
    }

    /**
     * Définit la valeur de la propriété language.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLanguage(String value) {
        this.language = value;
    }

    public boolean isSetLanguage() {
        return (this.language!= null);
    }

    /**
     * Obtient la valeur de la propriété includeTranslations.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIncludeTranslations() {
        return includeTranslations;
    }

    /**
     * Définit la valeur de la propriété includeTranslations.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIncludeTranslations(Boolean value) {
        this.includeTranslations = value;
    }

    public boolean isSetIncludeTranslations() {
        return (this.includeTranslations!= null);
    }

    /**
     * Obtient la valeur de la propriété maximumVehicles.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getMaximumVehicles() {
        return maximumVehicles;
    }

    /**
     * Définit la valeur de la propriété maximumVehicles.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setMaximumVehicles(BigInteger value) {
        this.maximumVehicles = value;
    }

    public boolean isSetMaximumVehicles() {
        return (this.maximumVehicles!= null);
    }

    /**
     * Obtient la valeur de la propriété vehicleMonitoringDetailLevel.
     * 
     * @return
     *     possible object is
     *     {@link VehicleMonitoringDetailEnumeration }
     *     
     */
    public VehicleMonitoringDetailEnumeration getVehicleMonitoringDetailLevel() {
        return vehicleMonitoringDetailLevel;
    }

    /**
     * Définit la valeur de la propriété vehicleMonitoringDetailLevel.
     * 
     * @param value
     *     allowed object is
     *     {@link VehicleMonitoringDetailEnumeration }
     *     
     */
    public void setVehicleMonitoringDetailLevel(VehicleMonitoringDetailEnumeration value) {
        this.vehicleMonitoringDetailLevel = value;
    }

    public boolean isSetVehicleMonitoringDetailLevel() {
        return (this.vehicleMonitoringDetailLevel!= null);
    }

    /**
     * Obtient la valeur de la propriété maximumNumberOfCalls.
     * 
     * @return
     *     possible object is
     *     {@link VehicleMonitoringRequestStructure.MaximumNumberOfCalls }
     *     
     */
    public VehicleMonitoringRequestStructure.MaximumNumberOfCalls getMaximumNumberOfCalls() {
        return maximumNumberOfCalls;
    }

    /**
     * Définit la valeur de la propriété maximumNumberOfCalls.
     * 
     * @param value
     *     allowed object is
     *     {@link VehicleMonitoringRequestStructure.MaximumNumberOfCalls }
     *     
     */
    public void setMaximumNumberOfCalls(VehicleMonitoringRequestStructure.MaximumNumberOfCalls value) {
        this.maximumNumberOfCalls = value;
    }

    public boolean isSetMaximumNumberOfCalls() {
        return (this.maximumNumberOfCalls!= null);
    }

    /**
     * Obtient la valeur de la propriété includeSituations.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIncludeSituations() {
        return includeSituations;
    }

    /**
     * Définit la valeur de la propriété includeSituations.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIncludeSituations(Boolean value) {
        this.includeSituations = value;
    }

    public boolean isSetIncludeSituations() {
        return (this.includeSituations!= null);
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


    /**
     * <p>Classe Java pour anonymous complex type.
     * 
     * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="Previous" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" minOccurs="0"/>
     *         &lt;element name="Onwards" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" minOccurs="0"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "previous",
        "onwards"
    })
    public static class MaximumNumberOfCalls
        implements Serializable
    {

        private final static long serialVersionUID = 1L;
        @XmlElement(name = "Previous")
        @XmlSchemaType(name = "nonNegativeInteger")
        protected BigInteger previous;
        @XmlElement(name = "Onwards")
        @XmlSchemaType(name = "nonNegativeInteger")
        protected BigInteger onwards;

        /**
         * Obtient la valeur de la propriété previous.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getPrevious() {
            return previous;
        }

        /**
         * Définit la valeur de la propriété previous.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setPrevious(BigInteger value) {
            this.previous = value;
        }

        public boolean isSetPrevious() {
            return (this.previous!= null);
        }

        /**
         * Obtient la valeur de la propriété onwards.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getOnwards() {
            return onwards;
        }

        /**
         * Définit la valeur de la propriété onwards.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setOnwards(BigInteger value) {
            this.onwards = value;
        }

        public boolean isSetOnwards() {
            return (this.onwards!= null);
        }

    }

}
