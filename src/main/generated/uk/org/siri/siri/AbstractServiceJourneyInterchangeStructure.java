
package uk.org.siri.siri;

import java.io.Serializable;
import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import javax.xml.datatype.Duration;


/**
 * A planned SERVICE JOURNEY INTERCHANGE between two journeys. +SIRI v2.0
 * 
 * <p>Classe Java pour AbstractServiceJourneyInterchangeStructure complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="AbstractServiceJourneyInterchangeStructure">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="InterchangeCode" type="{http://www.siri.org.uk/siri}InterchangeCodeType" minOccurs="0"/>
 *         &lt;element name="ConnectionLinkRef" type="{http://www.siri.org.uk/siri}ConnectionLinkRefStructure" minOccurs="0"/>
 *         &lt;element name="FeederRef" type="{http://www.siri.org.uk/siri}ConnectingJourneyRefStructure" minOccurs="0"/>
 *         &lt;element name="FeederArrivalStopRef" type="{http://www.siri.org.uk/siri}StopPointRefStructure" minOccurs="0"/>
 *         &lt;element name="FeederVisitNumber" type="{http://www.siri.org.uk/siri}VisitNumberType" minOccurs="0"/>
 *         &lt;element name="DistributorRef" type="{http://www.siri.org.uk/siri}ConnectingJourneyRefStructure" minOccurs="0"/>
 *         &lt;element name="DistributorDepartureStopRef" type="{http://www.siri.org.uk/siri}StopPointRefStructure" minOccurs="0"/>
 *         &lt;element name="DistributorVisitNumber" type="{http://www.siri.org.uk/siri}VisitNumberType" minOccurs="0"/>
 *         &lt;group ref="{http://www.siri.org.uk/siri}InterchangePropertyGroup"/>
 *         &lt;group ref="{http://www.siri.org.uk/siri}InterchangeTimesGroup"/>
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
@XmlType(name = "AbstractServiceJourneyInterchangeStructure", propOrder = {
    "interchangeCode",
    "connectionLinkRef",
    "feederRef",
    "feederArrivalStopRef",
    "feederVisitNumber",
    "distributorRef",
    "distributorDepartureStopRef",
    "distributorVisitNumber",
    "staySeated",
    "guaranteed",
    "advertised",
    "standardWaitTime",
    "maximumWaitTime",
    "maximumAutomaticWaitTime",
    "standardTransferTime",
    "minimumTransferTime",
    "maximumTransferTime",
    "extensions"
})
@XmlSeeAlso({
    ToServiceJourneyInterchangeStructure.class,
    FromServiceJourneyInterchangeStructure.class,
    ServiceJourneyInterchangeStructure.class
})
public abstract class AbstractServiceJourneyInterchangeStructure
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "InterchangeCode")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String interchangeCode;
    @XmlElement(name = "ConnectionLinkRef")
    protected ConnectionLinkRefStructure connectionLinkRef;
    @XmlElement(name = "FeederRef")
    protected ConnectingJourneyRefStructure feederRef;
    @XmlElement(name = "FeederArrivalStopRef")
    protected StopPointRefStructure feederArrivalStopRef;
    @XmlElement(name = "FeederVisitNumber")
    protected BigInteger feederVisitNumber;
    @XmlElement(name = "DistributorRef")
    protected ConnectingJourneyRefStructure distributorRef;
    @XmlElement(name = "DistributorDepartureStopRef")
    protected StopPointRefStructure distributorDepartureStopRef;
    @XmlElement(name = "DistributorVisitNumber")
    protected BigInteger distributorVisitNumber;
    @XmlElement(name = "StaySeated", defaultValue = "false")
    protected Boolean staySeated;
    @XmlElement(name = "Guaranteed", defaultValue = "false")
    protected Boolean guaranteed;
    @XmlElement(name = "Advertised", defaultValue = "false")
    protected Boolean advertised;
    @XmlElement(name = "StandardWaitTime")
    protected Duration standardWaitTime;
    @XmlElement(name = "MaximumWaitTime")
    protected Duration maximumWaitTime;
    @XmlElement(name = "MaximumAutomaticWaitTime")
    protected Duration maximumAutomaticWaitTime;
    @XmlElement(name = "StandardTransferTime")
    protected Duration standardTransferTime;
    @XmlElement(name = "MinimumTransferTime")
    protected Duration minimumTransferTime;
    @XmlElement(name = "MaximumTransferTime")
    protected Duration maximumTransferTime;
    @XmlElement(name = "Extensions")
    protected ExtensionsStructure extensions;

    /**
     * Obtient la valeur de la propriété interchangeCode.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInterchangeCode() {
        return interchangeCode;
    }

    /**
     * Définit la valeur de la propriété interchangeCode.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInterchangeCode(String value) {
        this.interchangeCode = value;
    }

    public boolean isSetInterchangeCode() {
        return (this.interchangeCode!= null);
    }

    /**
     * Obtient la valeur de la propriété connectionLinkRef.
     * 
     * @return
     *     possible object is
     *     {@link ConnectionLinkRefStructure }
     *     
     */
    public ConnectionLinkRefStructure getConnectionLinkRef() {
        return connectionLinkRef;
    }

    /**
     * Définit la valeur de la propriété connectionLinkRef.
     * 
     * @param value
     *     allowed object is
     *     {@link ConnectionLinkRefStructure }
     *     
     */
    public void setConnectionLinkRef(ConnectionLinkRefStructure value) {
        this.connectionLinkRef = value;
    }

    public boolean isSetConnectionLinkRef() {
        return (this.connectionLinkRef!= null);
    }

    /**
     * Obtient la valeur de la propriété feederRef.
     * 
     * @return
     *     possible object is
     *     {@link ConnectingJourneyRefStructure }
     *     
     */
    public ConnectingJourneyRefStructure getFeederRef() {
        return feederRef;
    }

    /**
     * Définit la valeur de la propriété feederRef.
     * 
     * @param value
     *     allowed object is
     *     {@link ConnectingJourneyRefStructure }
     *     
     */
    public void setFeederRef(ConnectingJourneyRefStructure value) {
        this.feederRef = value;
    }

    public boolean isSetFeederRef() {
        return (this.feederRef!= null);
    }

    /**
     * Obtient la valeur de la propriété feederArrivalStopRef.
     * 
     * @return
     *     possible object is
     *     {@link StopPointRefStructure }
     *     
     */
    public StopPointRefStructure getFeederArrivalStopRef() {
        return feederArrivalStopRef;
    }

    /**
     * Définit la valeur de la propriété feederArrivalStopRef.
     * 
     * @param value
     *     allowed object is
     *     {@link StopPointRefStructure }
     *     
     */
    public void setFeederArrivalStopRef(StopPointRefStructure value) {
        this.feederArrivalStopRef = value;
    }

    public boolean isSetFeederArrivalStopRef() {
        return (this.feederArrivalStopRef!= null);
    }

    /**
     * Obtient la valeur de la propriété feederVisitNumber.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getFeederVisitNumber() {
        return feederVisitNumber;
    }

    /**
     * Définit la valeur de la propriété feederVisitNumber.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setFeederVisitNumber(BigInteger value) {
        this.feederVisitNumber = value;
    }

    public boolean isSetFeederVisitNumber() {
        return (this.feederVisitNumber!= null);
    }

    /**
     * Obtient la valeur de la propriété distributorRef.
     * 
     * @return
     *     possible object is
     *     {@link ConnectingJourneyRefStructure }
     *     
     */
    public ConnectingJourneyRefStructure getDistributorRef() {
        return distributorRef;
    }

    /**
     * Définit la valeur de la propriété distributorRef.
     * 
     * @param value
     *     allowed object is
     *     {@link ConnectingJourneyRefStructure }
     *     
     */
    public void setDistributorRef(ConnectingJourneyRefStructure value) {
        this.distributorRef = value;
    }

    public boolean isSetDistributorRef() {
        return (this.distributorRef!= null);
    }

    /**
     * Obtient la valeur de la propriété distributorDepartureStopRef.
     * 
     * @return
     *     possible object is
     *     {@link StopPointRefStructure }
     *     
     */
    public StopPointRefStructure getDistributorDepartureStopRef() {
        return distributorDepartureStopRef;
    }

    /**
     * Définit la valeur de la propriété distributorDepartureStopRef.
     * 
     * @param value
     *     allowed object is
     *     {@link StopPointRefStructure }
     *     
     */
    public void setDistributorDepartureStopRef(StopPointRefStructure value) {
        this.distributorDepartureStopRef = value;
    }

    public boolean isSetDistributorDepartureStopRef() {
        return (this.distributorDepartureStopRef!= null);
    }

    /**
     * Obtient la valeur de la propriété distributorVisitNumber.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getDistributorVisitNumber() {
        return distributorVisitNumber;
    }

    /**
     * Définit la valeur de la propriété distributorVisitNumber.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setDistributorVisitNumber(BigInteger value) {
        this.distributorVisitNumber = value;
    }

    public boolean isSetDistributorVisitNumber() {
        return (this.distributorVisitNumber!= null);
    }

    /**
     * Obtient la valeur de la propriété staySeated.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isStaySeated() {
        return staySeated;
    }

    /**
     * Définit la valeur de la propriété staySeated.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setStaySeated(Boolean value) {
        this.staySeated = value;
    }

    public boolean isSetStaySeated() {
        return (this.staySeated!= null);
    }

    /**
     * Obtient la valeur de la propriété guaranteed.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isGuaranteed() {
        return guaranteed;
    }

    /**
     * Définit la valeur de la propriété guaranteed.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setGuaranteed(Boolean value) {
        this.guaranteed = value;
    }

    public boolean isSetGuaranteed() {
        return (this.guaranteed!= null);
    }

    /**
     * Obtient la valeur de la propriété advertised.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAdvertised() {
        return advertised;
    }

    /**
     * Définit la valeur de la propriété advertised.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAdvertised(Boolean value) {
        this.advertised = value;
    }

    public boolean isSetAdvertised() {
        return (this.advertised!= null);
    }

    /**
     * Obtient la valeur de la propriété standardWaitTime.
     * 
     * @return
     *     possible object is
     *     {@link Duration }
     *     
     */
    public Duration getStandardWaitTime() {
        return standardWaitTime;
    }

    /**
     * Définit la valeur de la propriété standardWaitTime.
     * 
     * @param value
     *     allowed object is
     *     {@link Duration }
     *     
     */
    public void setStandardWaitTime(Duration value) {
        this.standardWaitTime = value;
    }

    public boolean isSetStandardWaitTime() {
        return (this.standardWaitTime!= null);
    }

    /**
     * Obtient la valeur de la propriété maximumWaitTime.
     * 
     * @return
     *     possible object is
     *     {@link Duration }
     *     
     */
    public Duration getMaximumWaitTime() {
        return maximumWaitTime;
    }

    /**
     * Définit la valeur de la propriété maximumWaitTime.
     * 
     * @param value
     *     allowed object is
     *     {@link Duration }
     *     
     */
    public void setMaximumWaitTime(Duration value) {
        this.maximumWaitTime = value;
    }

    public boolean isSetMaximumWaitTime() {
        return (this.maximumWaitTime!= null);
    }

    /**
     * Obtient la valeur de la propriété maximumAutomaticWaitTime.
     * 
     * @return
     *     possible object is
     *     {@link Duration }
     *     
     */
    public Duration getMaximumAutomaticWaitTime() {
        return maximumAutomaticWaitTime;
    }

    /**
     * Définit la valeur de la propriété maximumAutomaticWaitTime.
     * 
     * @param value
     *     allowed object is
     *     {@link Duration }
     *     
     */
    public void setMaximumAutomaticWaitTime(Duration value) {
        this.maximumAutomaticWaitTime = value;
    }

    public boolean isSetMaximumAutomaticWaitTime() {
        return (this.maximumAutomaticWaitTime!= null);
    }

    /**
     * Obtient la valeur de la propriété standardTransferTime.
     * 
     * @return
     *     possible object is
     *     {@link Duration }
     *     
     */
    public Duration getStandardTransferTime() {
        return standardTransferTime;
    }

    /**
     * Définit la valeur de la propriété standardTransferTime.
     * 
     * @param value
     *     allowed object is
     *     {@link Duration }
     *     
     */
    public void setStandardTransferTime(Duration value) {
        this.standardTransferTime = value;
    }

    public boolean isSetStandardTransferTime() {
        return (this.standardTransferTime!= null);
    }

    /**
     * Obtient la valeur de la propriété minimumTransferTime.
     * 
     * @return
     *     possible object is
     *     {@link Duration }
     *     
     */
    public Duration getMinimumTransferTime() {
        return minimumTransferTime;
    }

    /**
     * Définit la valeur de la propriété minimumTransferTime.
     * 
     * @param value
     *     allowed object is
     *     {@link Duration }
     *     
     */
    public void setMinimumTransferTime(Duration value) {
        this.minimumTransferTime = value;
    }

    public boolean isSetMinimumTransferTime() {
        return (this.minimumTransferTime!= null);
    }

    /**
     * Obtient la valeur de la propriété maximumTransferTime.
     * 
     * @return
     *     possible object is
     *     {@link Duration }
     *     
     */
    public Duration getMaximumTransferTime() {
        return maximumTransferTime;
    }

    /**
     * Définit la valeur de la propriété maximumTransferTime.
     * 
     * @param value
     *     allowed object is
     *     {@link Duration }
     *     
     */
    public void setMaximumTransferTime(Duration value) {
        this.maximumTransferTime = value;
    }

    public boolean isSetMaximumTransferTime() {
        return (this.maximumTransferTime!= null);
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
