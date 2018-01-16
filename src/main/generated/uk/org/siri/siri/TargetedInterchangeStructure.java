
package uk.org.siri.siri;

import java.io.Serializable;
import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import javax.xml.datatype.Duration;


/**
 * Planned Connection between two VEHICLE JOURNEYs.
 * 
 * <p>Classe Java pour TargetedInterchangeStructure complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="TargetedInterchangeStructure">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;sequence>
 *           &lt;element name="InterchangeCode" type="{http://www.siri.org.uk/siri}InterchangeCodeType" minOccurs="0"/>
 *           &lt;element name="DistributorVehicleJourneyRef" type="{http://www.siri.org.uk/siri}DatedVehicleJourneyRefStructure"/>
 *           &lt;choice>
 *             &lt;element name="DistributorConnectionLinkRef" type="{http://www.siri.org.uk/siri}ConnectionLinkRefStructure"/>
 *             &lt;element name="DistributorConnectionLink" type="{http://www.siri.org.uk/siri}ContextualisedConnectionLinkStructure"/>
 *           &lt;/choice>
 *         &lt;/sequence>
 *         &lt;element name="DistributorVisitNumber" type="{http://www.siri.org.uk/siri}VisitNumberType" minOccurs="0"/>
 *         &lt;element name="DistributorOrder" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" minOccurs="0"/>
 *         &lt;group ref="{http://www.siri.org.uk/siri}InterchangePropertyGroup"/>
 *         &lt;group ref="{http://www.siri.org.uk/siri}InterchangeTimesGroup"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TargetedInterchangeStructure", propOrder = {
    "interchangeCode",
    "distributorVehicleJourneyRef",
    "distributorConnectionLinkRef",
    "distributorConnectionLink",
    "distributorVisitNumber",
    "distributorOrder",
    "staySeated",
    "guaranteed",
    "advertised",
    "standardWaitTime",
    "maximumWaitTime",
    "maximumAutomaticWaitTime",
    "standardTransferTime",
    "minimumTransferTime",
    "maximumTransferTime"
})
public class TargetedInterchangeStructure
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "InterchangeCode")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String interchangeCode;
    @XmlElement(name = "DistributorVehicleJourneyRef", required = true)
    protected DatedVehicleJourneyRefStructure distributorVehicleJourneyRef;
    @XmlElement(name = "DistributorConnectionLinkRef")
    protected ConnectionLinkRefStructure distributorConnectionLinkRef;
    @XmlElement(name = "DistributorConnectionLink")
    protected ContextualisedConnectionLinkStructure distributorConnectionLink;
    @XmlElement(name = "DistributorVisitNumber")
    protected BigInteger distributorVisitNumber;
    @XmlElement(name = "DistributorOrder")
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger distributorOrder;
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
     * Obtient la valeur de la propriété distributorVehicleJourneyRef.
     * 
     * @return
     *     possible object is
     *     {@link DatedVehicleJourneyRefStructure }
     *     
     */
    public DatedVehicleJourneyRefStructure getDistributorVehicleJourneyRef() {
        return distributorVehicleJourneyRef;
    }

    /**
     * Définit la valeur de la propriété distributorVehicleJourneyRef.
     * 
     * @param value
     *     allowed object is
     *     {@link DatedVehicleJourneyRefStructure }
     *     
     */
    public void setDistributorVehicleJourneyRef(DatedVehicleJourneyRefStructure value) {
        this.distributorVehicleJourneyRef = value;
    }

    public boolean isSetDistributorVehicleJourneyRef() {
        return (this.distributorVehicleJourneyRef!= null);
    }

    /**
     * Obtient la valeur de la propriété distributorConnectionLinkRef.
     * 
     * @return
     *     possible object is
     *     {@link ConnectionLinkRefStructure }
     *     
     */
    public ConnectionLinkRefStructure getDistributorConnectionLinkRef() {
        return distributorConnectionLinkRef;
    }

    /**
     * Définit la valeur de la propriété distributorConnectionLinkRef.
     * 
     * @param value
     *     allowed object is
     *     {@link ConnectionLinkRefStructure }
     *     
     */
    public void setDistributorConnectionLinkRef(ConnectionLinkRefStructure value) {
        this.distributorConnectionLinkRef = value;
    }

    public boolean isSetDistributorConnectionLinkRef() {
        return (this.distributorConnectionLinkRef!= null);
    }

    /**
     * Obtient la valeur de la propriété distributorConnectionLink.
     * 
     * @return
     *     possible object is
     *     {@link ContextualisedConnectionLinkStructure }
     *     
     */
    public ContextualisedConnectionLinkStructure getDistributorConnectionLink() {
        return distributorConnectionLink;
    }

    /**
     * Définit la valeur de la propriété distributorConnectionLink.
     * 
     * @param value
     *     allowed object is
     *     {@link ContextualisedConnectionLinkStructure }
     *     
     */
    public void setDistributorConnectionLink(ContextualisedConnectionLinkStructure value) {
        this.distributorConnectionLink = value;
    }

    public boolean isSetDistributorConnectionLink() {
        return (this.distributorConnectionLink!= null);
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
     * Obtient la valeur de la propriété distributorOrder.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getDistributorOrder() {
        return distributorOrder;
    }

    /**
     * Définit la valeur de la propriété distributorOrder.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setDistributorOrder(BigInteger value) {
        this.distributorOrder = value;
    }

    public boolean isSetDistributorOrder() {
        return (this.distributorOrder!= null);
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

}
