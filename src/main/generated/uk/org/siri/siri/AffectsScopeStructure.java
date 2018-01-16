
package uk.org.siri.siri;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import eu.datex2.schema._2_0rc1._2_0.AreaOfInterestEnum;


/**
 * Type for Location model for scope of SITUATION or effect.
 * 
 * <p>Classe Java pour AffectsScopeStructure complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="AffectsScopeStructure">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="AreaOfInterest" type="{http://datex2.eu/schema/2_0RC1/2_0}AreaOfInterestEnum" minOccurs="0"/>
 *         &lt;element name="Operators" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;choice>
 *                   &lt;element name="AllOperators" type="{http://www.siri.org.uk/siri}EmptyType"/>
 *                   &lt;element name="AffectedOperator" type="{http://www.siri.org.uk/siri}AffectedOperatorStructure" maxOccurs="unbounded"/>
 *                 &lt;/choice>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="Networks" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="AffectedNetwork" maxOccurs="unbounded">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;extension base="{http://www.siri.org.uk/siri}AffectedNetworkStructure">
 *                         &lt;/extension>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="StopPoints" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="AffectedStopPoint" type="{http://www.siri.org.uk/siri}AffectedStopPointStructure" maxOccurs="unbounded"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="StopPlaces" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="AffectedStopPlace" type="{http://www.siri.org.uk/siri}AffectedStopPlaceStructure" maxOccurs="unbounded"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="Places" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="AffectedPlace" type="{http://www.siri.org.uk/siri}AffectedPlaceStructure" maxOccurs="unbounded"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="VehicleJourneys" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="AffectedVehicleJourney" type="{http://www.siri.org.uk/siri}AffectedVehicleJourneyStructure" maxOccurs="unbounded"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="Vehicles" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="AffectedVehicle" type="{http://www.siri.org.uk/siri}AffectedVehicleStructure" maxOccurs="unbounded"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="Roads" type="{http://www.siri.org.uk/siri}AffectedRoadsStructure" minOccurs="0"/>
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
@XmlType(name = "AffectsScopeStructure", propOrder = {
    "areaOfInterest",
    "operators",
    "networks",
    "stopPoints",
    "stopPlaces",
    "places",
    "vehicleJourneys",
    "vehicles",
    "roads",
    "extensions"
})
public class AffectsScopeStructure
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "AreaOfInterest")
    protected AreaOfInterestEnum areaOfInterest;
    @XmlElement(name = "Operators")
    protected AffectsScopeStructure.Operators operators;
    @XmlElement(name = "Networks")
    protected AffectsScopeStructure.Networks networks;
    @XmlElement(name = "StopPoints")
    protected AffectsScopeStructure.StopPoints stopPoints;
    @XmlElement(name = "StopPlaces")
    protected AffectsScopeStructure.StopPlaces stopPlaces;
    @XmlElement(name = "Places")
    protected AffectsScopeStructure.Places places;
    @XmlElement(name = "VehicleJourneys")
    protected AffectsScopeStructure.VehicleJourneys vehicleJourneys;
    @XmlElement(name = "Vehicles")
    protected AffectsScopeStructure.Vehicles vehicles;
    @XmlElement(name = "Roads")
    protected AffectedRoadsStructure roads;
    @XmlElement(name = "Extensions")
    protected ExtensionsStructure extensions;

    /**
     * Obtient la valeur de la propriété areaOfInterest.
     * 
     * @return
     *     possible object is
     *     {@link AreaOfInterestEnum }
     *     
     */
    public AreaOfInterestEnum getAreaOfInterest() {
        return areaOfInterest;
    }

    /**
     * Définit la valeur de la propriété areaOfInterest.
     * 
     * @param value
     *     allowed object is
     *     {@link AreaOfInterestEnum }
     *     
     */
    public void setAreaOfInterest(AreaOfInterestEnum value) {
        this.areaOfInterest = value;
    }

    public boolean isSetAreaOfInterest() {
        return (this.areaOfInterest!= null);
    }

    /**
     * Obtient la valeur de la propriété operators.
     * 
     * @return
     *     possible object is
     *     {@link AffectsScopeStructure.Operators }
     *     
     */
    public AffectsScopeStructure.Operators getOperators() {
        return operators;
    }

    /**
     * Définit la valeur de la propriété operators.
     * 
     * @param value
     *     allowed object is
     *     {@link AffectsScopeStructure.Operators }
     *     
     */
    public void setOperators(AffectsScopeStructure.Operators value) {
        this.operators = value;
    }

    public boolean isSetOperators() {
        return (this.operators!= null);
    }

    /**
     * Obtient la valeur de la propriété networks.
     * 
     * @return
     *     possible object is
     *     {@link AffectsScopeStructure.Networks }
     *     
     */
    public AffectsScopeStructure.Networks getNetworks() {
        return networks;
    }

    /**
     * Définit la valeur de la propriété networks.
     * 
     * @param value
     *     allowed object is
     *     {@link AffectsScopeStructure.Networks }
     *     
     */
    public void setNetworks(AffectsScopeStructure.Networks value) {
        this.networks = value;
    }

    public boolean isSetNetworks() {
        return (this.networks!= null);
    }

    /**
     * Obtient la valeur de la propriété stopPoints.
     * 
     * @return
     *     possible object is
     *     {@link AffectsScopeStructure.StopPoints }
     *     
     */
    public AffectsScopeStructure.StopPoints getStopPoints() {
        return stopPoints;
    }

    /**
     * Définit la valeur de la propriété stopPoints.
     * 
     * @param value
     *     allowed object is
     *     {@link AffectsScopeStructure.StopPoints }
     *     
     */
    public void setStopPoints(AffectsScopeStructure.StopPoints value) {
        this.stopPoints = value;
    }

    public boolean isSetStopPoints() {
        return (this.stopPoints!= null);
    }

    /**
     * Obtient la valeur de la propriété stopPlaces.
     * 
     * @return
     *     possible object is
     *     {@link AffectsScopeStructure.StopPlaces }
     *     
     */
    public AffectsScopeStructure.StopPlaces getStopPlaces() {
        return stopPlaces;
    }

    /**
     * Définit la valeur de la propriété stopPlaces.
     * 
     * @param value
     *     allowed object is
     *     {@link AffectsScopeStructure.StopPlaces }
     *     
     */
    public void setStopPlaces(AffectsScopeStructure.StopPlaces value) {
        this.stopPlaces = value;
    }

    public boolean isSetStopPlaces() {
        return (this.stopPlaces!= null);
    }

    /**
     * Obtient la valeur de la propriété places.
     * 
     * @return
     *     possible object is
     *     {@link AffectsScopeStructure.Places }
     *     
     */
    public AffectsScopeStructure.Places getPlaces() {
        return places;
    }

    /**
     * Définit la valeur de la propriété places.
     * 
     * @param value
     *     allowed object is
     *     {@link AffectsScopeStructure.Places }
     *     
     */
    public void setPlaces(AffectsScopeStructure.Places value) {
        this.places = value;
    }

    public boolean isSetPlaces() {
        return (this.places!= null);
    }

    /**
     * Obtient la valeur de la propriété vehicleJourneys.
     * 
     * @return
     *     possible object is
     *     {@link AffectsScopeStructure.VehicleJourneys }
     *     
     */
    public AffectsScopeStructure.VehicleJourneys getVehicleJourneys() {
        return vehicleJourneys;
    }

    /**
     * Définit la valeur de la propriété vehicleJourneys.
     * 
     * @param value
     *     allowed object is
     *     {@link AffectsScopeStructure.VehicleJourneys }
     *     
     */
    public void setVehicleJourneys(AffectsScopeStructure.VehicleJourneys value) {
        this.vehicleJourneys = value;
    }

    public boolean isSetVehicleJourneys() {
        return (this.vehicleJourneys!= null);
    }

    /**
     * Obtient la valeur de la propriété vehicles.
     * 
     * @return
     *     possible object is
     *     {@link AffectsScopeStructure.Vehicles }
     *     
     */
    public AffectsScopeStructure.Vehicles getVehicles() {
        return vehicles;
    }

    /**
     * Définit la valeur de la propriété vehicles.
     * 
     * @param value
     *     allowed object is
     *     {@link AffectsScopeStructure.Vehicles }
     *     
     */
    public void setVehicles(AffectsScopeStructure.Vehicles value) {
        this.vehicles = value;
    }

    public boolean isSetVehicles() {
        return (this.vehicles!= null);
    }

    /**
     * Obtient la valeur de la propriété roads.
     * 
     * @return
     *     possible object is
     *     {@link AffectedRoadsStructure }
     *     
     */
    public AffectedRoadsStructure getRoads() {
        return roads;
    }

    /**
     * Définit la valeur de la propriété roads.
     * 
     * @param value
     *     allowed object is
     *     {@link AffectedRoadsStructure }
     *     
     */
    public void setRoads(AffectedRoadsStructure value) {
        this.roads = value;
    }

    public boolean isSetRoads() {
        return (this.roads!= null);
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
     * <p>Classe Java pour anonymous complex type.
     * 
     * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="AffectedNetwork" maxOccurs="unbounded">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;extension base="{http://www.siri.org.uk/siri}AffectedNetworkStructure">
     *               &lt;/extension>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
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
        "affectedNetwork"
    })
    public static class Networks
        implements Serializable
    {

        private final static long serialVersionUID = 1L;
        @XmlElement(name = "AffectedNetwork", required = true)
        protected List<AffectsScopeStructure.Networks.AffectedNetwork> affectedNetwork;

        /**
         * Gets the value of the affectedNetwork property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the affectedNetwork property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getAffectedNetwork().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link AffectsScopeStructure.Networks.AffectedNetwork }
         * 
         * 
         */
        public List<AffectsScopeStructure.Networks.AffectedNetwork> getAffectedNetwork() {
            if (affectedNetwork == null) {
                affectedNetwork = new ArrayList<AffectsScopeStructure.Networks.AffectedNetwork>();
            }
            return this.affectedNetwork;
        }

        public boolean isSetAffectedNetwork() {
            return ((this.affectedNetwork!= null)&&(!this.affectedNetwork.isEmpty()));
        }

        public void unsetAffectedNetwork() {
            this.affectedNetwork = null;
        }


        /**
         * <p>Classe Java pour anonymous complex type.
         * 
         * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;extension base="{http://www.siri.org.uk/siri}AffectedNetworkStructure">
         *     &lt;/extension>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class AffectedNetwork
            extends AffectedNetworkStructure
            implements Serializable
        {

            private final static long serialVersionUID = 1L;

        }

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
     *       &lt;choice>
     *         &lt;element name="AllOperators" type="{http://www.siri.org.uk/siri}EmptyType"/>
     *         &lt;element name="AffectedOperator" type="{http://www.siri.org.uk/siri}AffectedOperatorStructure" maxOccurs="unbounded"/>
     *       &lt;/choice>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "allOperators",
        "affectedOperator"
    })
    public static class Operators
        implements Serializable
    {

        private final static long serialVersionUID = 1L;
        @XmlElement(name = "AllOperators")
        protected String allOperators;
        @XmlElement(name = "AffectedOperator")
        protected List<AffectedOperatorStructure> affectedOperator;

        /**
         * Obtient la valeur de la propriété allOperators.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getAllOperators() {
            return allOperators;
        }

        /**
         * Définit la valeur de la propriété allOperators.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setAllOperators(String value) {
            this.allOperators = value;
        }

        public boolean isSetAllOperators() {
            return (this.allOperators!= null);
        }

        /**
         * Gets the value of the affectedOperator property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the affectedOperator property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getAffectedOperator().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link AffectedOperatorStructure }
         * 
         * 
         */
        public List<AffectedOperatorStructure> getAffectedOperator() {
            if (affectedOperator == null) {
                affectedOperator = new ArrayList<AffectedOperatorStructure>();
            }
            return this.affectedOperator;
        }

        public boolean isSetAffectedOperator() {
            return ((this.affectedOperator!= null)&&(!this.affectedOperator.isEmpty()));
        }

        public void unsetAffectedOperator() {
            this.affectedOperator = null;
        }

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
     *         &lt;element name="AffectedPlace" type="{http://www.siri.org.uk/siri}AffectedPlaceStructure" maxOccurs="unbounded"/>
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
        "affectedPlace"
    })
    public static class Places
        implements Serializable
    {

        private final static long serialVersionUID = 1L;
        @XmlElement(name = "AffectedPlace", required = true)
        protected List<AffectedPlaceStructure> affectedPlace;

        /**
         * Gets the value of the affectedPlace property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the affectedPlace property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getAffectedPlace().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link AffectedPlaceStructure }
         * 
         * 
         */
        public List<AffectedPlaceStructure> getAffectedPlace() {
            if (affectedPlace == null) {
                affectedPlace = new ArrayList<AffectedPlaceStructure>();
            }
            return this.affectedPlace;
        }

        public boolean isSetAffectedPlace() {
            return ((this.affectedPlace!= null)&&(!this.affectedPlace.isEmpty()));
        }

        public void unsetAffectedPlace() {
            this.affectedPlace = null;
        }

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
     *         &lt;element name="AffectedStopPlace" type="{http://www.siri.org.uk/siri}AffectedStopPlaceStructure" maxOccurs="unbounded"/>
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
        "affectedStopPlace"
    })
    public static class StopPlaces
        implements Serializable
    {

        private final static long serialVersionUID = 1L;
        @XmlElement(name = "AffectedStopPlace", required = true)
        protected List<AffectedStopPlaceStructure> affectedStopPlace;

        /**
         * Gets the value of the affectedStopPlace property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the affectedStopPlace property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getAffectedStopPlace().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link AffectedStopPlaceStructure }
         * 
         * 
         */
        public List<AffectedStopPlaceStructure> getAffectedStopPlace() {
            if (affectedStopPlace == null) {
                affectedStopPlace = new ArrayList<AffectedStopPlaceStructure>();
            }
            return this.affectedStopPlace;
        }

        public boolean isSetAffectedStopPlace() {
            return ((this.affectedStopPlace!= null)&&(!this.affectedStopPlace.isEmpty()));
        }

        public void unsetAffectedStopPlace() {
            this.affectedStopPlace = null;
        }

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
     *         &lt;element name="AffectedStopPoint" type="{http://www.siri.org.uk/siri}AffectedStopPointStructure" maxOccurs="unbounded"/>
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
        "affectedStopPoint"
    })
    public static class StopPoints
        implements Serializable
    {

        private final static long serialVersionUID = 1L;
        @XmlElement(name = "AffectedStopPoint", required = true)
        protected List<AffectedStopPointStructure> affectedStopPoint;

        /**
         * Gets the value of the affectedStopPoint property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the affectedStopPoint property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getAffectedStopPoint().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link AffectedStopPointStructure }
         * 
         * 
         */
        public List<AffectedStopPointStructure> getAffectedStopPoint() {
            if (affectedStopPoint == null) {
                affectedStopPoint = new ArrayList<AffectedStopPointStructure>();
            }
            return this.affectedStopPoint;
        }

        public boolean isSetAffectedStopPoint() {
            return ((this.affectedStopPoint!= null)&&(!this.affectedStopPoint.isEmpty()));
        }

        public void unsetAffectedStopPoint() {
            this.affectedStopPoint = null;
        }

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
     *         &lt;element name="AffectedVehicleJourney" type="{http://www.siri.org.uk/siri}AffectedVehicleJourneyStructure" maxOccurs="unbounded"/>
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
        "affectedVehicleJourney"
    })
    public static class VehicleJourneys
        implements Serializable
    {

        private final static long serialVersionUID = 1L;
        @XmlElement(name = "AffectedVehicleJourney", required = true)
        protected List<AffectedVehicleJourneyStructure> affectedVehicleJourney;

        /**
         * Gets the value of the affectedVehicleJourney property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the affectedVehicleJourney property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getAffectedVehicleJourney().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link AffectedVehicleJourneyStructure }
         * 
         * 
         */
        public List<AffectedVehicleJourneyStructure> getAffectedVehicleJourney() {
            if (affectedVehicleJourney == null) {
                affectedVehicleJourney = new ArrayList<AffectedVehicleJourneyStructure>();
            }
            return this.affectedVehicleJourney;
        }

        public boolean isSetAffectedVehicleJourney() {
            return ((this.affectedVehicleJourney!= null)&&(!this.affectedVehicleJourney.isEmpty()));
        }

        public void unsetAffectedVehicleJourney() {
            this.affectedVehicleJourney = null;
        }

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
     *         &lt;element name="AffectedVehicle" type="{http://www.siri.org.uk/siri}AffectedVehicleStructure" maxOccurs="unbounded"/>
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
        "affectedVehicle"
    })
    public static class Vehicles
        implements Serializable
    {

        private final static long serialVersionUID = 1L;
        @XmlElement(name = "AffectedVehicle", required = true)
        protected List<AffectedVehicleStructure> affectedVehicle;

        /**
         * Gets the value of the affectedVehicle property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the affectedVehicle property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getAffectedVehicle().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link AffectedVehicleStructure }
         * 
         * 
         */
        public List<AffectedVehicleStructure> getAffectedVehicle() {
            if (affectedVehicle == null) {
                affectedVehicle = new ArrayList<AffectedVehicleStructure>();
            }
            return this.affectedVehicle;
        }

        public boolean isSetAffectedVehicle() {
            return ((this.affectedVehicle!= null)&&(!this.affectedVehicle.isEmpty()));
        }

        public void unsetAffectedVehicle() {
            this.affectedVehicle = null;
        }

    }

}
