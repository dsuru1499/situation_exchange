
package uk.org.siri.siri;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Information about a SERVICE JOURNEY INTERCHANGE at CONNECTION link from a given SCHEDULED STOP POINT.
 * 
 * <p>Classe Java pour AffectedInterchangeStructure complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="AffectedInterchangeStructure">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="InterchangeRef" type="{http://www.siri.org.uk/siri}InterchangeRefStructure" minOccurs="0"/>
 *         &lt;element name="InterchangeStopPointRef" type="{http://www.siri.org.uk/siri}StopPointRefStructure" minOccurs="0"/>
 *         &lt;element name="InterchangeStopPointName" type="{http://www.siri.org.uk/siri}NaturalLanguageStringStructure" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="ConnectingVehicleJourneyRef" type="{http://www.siri.org.uk/siri}DatedVehicleJourneyRefStructure" minOccurs="0"/>
 *         &lt;element ref="{http://www.siri.org.uk/siri}InterchangeStatusType" minOccurs="0"/>
 *         &lt;element name="ConnectionLink" type="{http://www.siri.org.uk/siri}AffectedConnectionLinkStructure" maxOccurs="unbounded" minOccurs="0"/>
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
@XmlType(name = "AffectedInterchangeStructure", propOrder = {
    "interchangeRef",
    "interchangeStopPointRef",
    "interchangeStopPointName",
    "connectingVehicleJourneyRef",
    "interchangeStatusType",
    "connectionLink",
    "extensions"
})
public class AffectedInterchangeStructure
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "InterchangeRef")
    protected InterchangeRefStructure interchangeRef;
    @XmlElement(name = "InterchangeStopPointRef")
    protected StopPointRefStructure interchangeStopPointRef;
    @XmlElement(name = "InterchangeStopPointName")
    protected List<NaturalLanguageStringStructure> interchangeStopPointName;
    @XmlElement(name = "ConnectingVehicleJourneyRef")
    protected DatedVehicleJourneyRefStructure connectingVehicleJourneyRef;
    @XmlElement(name = "InterchangeStatusType", defaultValue = "unknown")
    protected InterchangeStatusEnumeration interchangeStatusType;
    @XmlElement(name = "ConnectionLink")
    protected List<AffectedConnectionLinkStructure> connectionLink;
    @XmlElement(name = "Extensions")
    protected ExtensionsStructure extensions;

    /**
     * Obtient la valeur de la propriété interchangeRef.
     * 
     * @return
     *     possible object is
     *     {@link InterchangeRefStructure }
     *     
     */
    public InterchangeRefStructure getInterchangeRef() {
        return interchangeRef;
    }

    /**
     * Définit la valeur de la propriété interchangeRef.
     * 
     * @param value
     *     allowed object is
     *     {@link InterchangeRefStructure }
     *     
     */
    public void setInterchangeRef(InterchangeRefStructure value) {
        this.interchangeRef = value;
    }

    public boolean isSetInterchangeRef() {
        return (this.interchangeRef!= null);
    }

    /**
     * Obtient la valeur de la propriété interchangeStopPointRef.
     * 
     * @return
     *     possible object is
     *     {@link StopPointRefStructure }
     *     
     */
    public StopPointRefStructure getInterchangeStopPointRef() {
        return interchangeStopPointRef;
    }

    /**
     * Définit la valeur de la propriété interchangeStopPointRef.
     * 
     * @param value
     *     allowed object is
     *     {@link StopPointRefStructure }
     *     
     */
    public void setInterchangeStopPointRef(StopPointRefStructure value) {
        this.interchangeStopPointRef = value;
    }

    public boolean isSetInterchangeStopPointRef() {
        return (this.interchangeStopPointRef!= null);
    }

    /**
     * Gets the value of the interchangeStopPointName property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the interchangeStopPointName property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getInterchangeStopPointName().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link NaturalLanguageStringStructure }
     * 
     * 
     */
    public List<NaturalLanguageStringStructure> getInterchangeStopPointName() {
        if (interchangeStopPointName == null) {
            interchangeStopPointName = new ArrayList<NaturalLanguageStringStructure>();
        }
        return this.interchangeStopPointName;
    }

    public boolean isSetInterchangeStopPointName() {
        return ((this.interchangeStopPointName!= null)&&(!this.interchangeStopPointName.isEmpty()));
    }

    public void unsetInterchangeStopPointName() {
        this.interchangeStopPointName = null;
    }

    /**
     * Obtient la valeur de la propriété connectingVehicleJourneyRef.
     * 
     * @return
     *     possible object is
     *     {@link DatedVehicleJourneyRefStructure }
     *     
     */
    public DatedVehicleJourneyRefStructure getConnectingVehicleJourneyRef() {
        return connectingVehicleJourneyRef;
    }

    /**
     * Définit la valeur de la propriété connectingVehicleJourneyRef.
     * 
     * @param value
     *     allowed object is
     *     {@link DatedVehicleJourneyRefStructure }
     *     
     */
    public void setConnectingVehicleJourneyRef(DatedVehicleJourneyRefStructure value) {
        this.connectingVehicleJourneyRef = value;
    }

    public boolean isSetConnectingVehicleJourneyRef() {
        return (this.connectingVehicleJourneyRef!= null);
    }

    /**
     * Obtient la valeur de la propriété interchangeStatusType.
     * 
     * @return
     *     possible object is
     *     {@link InterchangeStatusEnumeration }
     *     
     */
    public InterchangeStatusEnumeration getInterchangeStatusType() {
        return interchangeStatusType;
    }

    /**
     * Définit la valeur de la propriété interchangeStatusType.
     * 
     * @param value
     *     allowed object is
     *     {@link InterchangeStatusEnumeration }
     *     
     */
    public void setInterchangeStatusType(InterchangeStatusEnumeration value) {
        this.interchangeStatusType = value;
    }

    public boolean isSetInterchangeStatusType() {
        return (this.interchangeStatusType!= null);
    }

    /**
     * Gets the value of the connectionLink property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the connectionLink property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getConnectionLink().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AffectedConnectionLinkStructure }
     * 
     * 
     */
    public List<AffectedConnectionLinkStructure> getConnectionLink() {
        if (connectionLink == null) {
            connectionLink = new ArrayList<AffectedConnectionLinkStructure>();
        }
        return this.connectionLink;
    }

    public boolean isSetConnectionLink() {
        return ((this.connectionLink!= null)&&(!this.connectionLink.isEmpty()));
    }

    public void unsetConnectionLink() {
        this.connectionLink = null;
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
