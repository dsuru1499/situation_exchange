
package uk.org.siri.siri;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Type for a reference Information about a CONNECTION link from a given stop that is affected by a SITUATION.
 * 
 * <p>Classe Java pour AffectedConnectionLinkStructure complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="AffectedConnectionLinkStructure">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ConnectionLinkRef" type="{http://www.siri.org.uk/siri}ConnectionLinkRefStructure" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="ConnectionName" type="{http://www.siri.org.uk/siri}NaturalLanguageStringStructure" minOccurs="0"/>
 *         &lt;choice minOccurs="0">
 *           &lt;element name="AllLines" type="{http://www.siri.org.uk/siri}EmptyType"/>
 *           &lt;sequence>
 *             &lt;group ref="{http://www.siri.org.uk/siri}LineGroup" minOccurs="0"/>
 *             &lt;element name="ConnectingStopPointRef" type="{http://www.siri.org.uk/siri}StopPointRefStructure" minOccurs="0"/>
 *             &lt;element name="ConnectingStopPointName" type="{http://www.siri.org.uk/siri}NaturalLanguageStringStructure" maxOccurs="unbounded" minOccurs="0"/>
 *             &lt;element name="ConnectingZoneRef" type="{http://www.siri.org.uk/siri}ZoneRefStructure" minOccurs="0"/>
 *           &lt;/sequence>
 *         &lt;/choice>
 *         &lt;element name="ConnectionDirection" type="{http://www.siri.org.uk/siri}ConnectionDirectionEnumeration" minOccurs="0"/>
 *         &lt;element name="AffectedPathLink" type="{http://www.siri.org.uk/siri}AffectedPathLinkStructure" maxOccurs="unbounded" minOccurs="0"/>
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
@XmlType(name = "AffectedConnectionLinkStructure", propOrder = {
    "connectionLinkRef",
    "connectionName",
    "allLines",
    "lineRef",
    "publishedLineName",
    "connectingStopPointRef",
    "connectingStopPointName",
    "connectingZoneRef",
    "connectionDirection",
    "affectedPathLink",
    "extensions"
})
public class AffectedConnectionLinkStructure
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "ConnectionLinkRef")
    protected List<ConnectionLinkRefStructure> connectionLinkRef;
    @XmlElement(name = "ConnectionName")
    protected NaturalLanguageStringStructure connectionName;
    @XmlElement(name = "AllLines")
    protected String allLines;
    @XmlElement(name = "LineRef")
    protected LineRefStructure lineRef;
    @XmlElement(name = "PublishedLineName")
    protected NaturalLanguageStringStructure publishedLineName;
    @XmlElement(name = "ConnectingStopPointRef")
    protected StopPointRefStructure connectingStopPointRef;
    @XmlElement(name = "ConnectingStopPointName")
    protected List<NaturalLanguageStringStructure> connectingStopPointName;
    @XmlElement(name = "ConnectingZoneRef")
    protected ZoneRefStructure connectingZoneRef;
    @XmlElement(name = "ConnectionDirection", defaultValue = "both")
    protected ConnectionDirectionEnumeration connectionDirection;
    @XmlElement(name = "AffectedPathLink")
    protected List<AffectedPathLinkStructure> affectedPathLink;
    @XmlElement(name = "Extensions")
    protected ExtensionsStructure extensions;

    /**
     * Gets the value of the connectionLinkRef property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the connectionLinkRef property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getConnectionLinkRef().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ConnectionLinkRefStructure }
     * 
     * 
     */
    public List<ConnectionLinkRefStructure> getConnectionLinkRef() {
        if (connectionLinkRef == null) {
            connectionLinkRef = new ArrayList<ConnectionLinkRefStructure>();
        }
        return this.connectionLinkRef;
    }

    public boolean isSetConnectionLinkRef() {
        return ((this.connectionLinkRef!= null)&&(!this.connectionLinkRef.isEmpty()));
    }

    public void unsetConnectionLinkRef() {
        this.connectionLinkRef = null;
    }

    /**
     * Obtient la valeur de la propriété connectionName.
     * 
     * @return
     *     possible object is
     *     {@link NaturalLanguageStringStructure }
     *     
     */
    public NaturalLanguageStringStructure getConnectionName() {
        return connectionName;
    }

    /**
     * Définit la valeur de la propriété connectionName.
     * 
     * @param value
     *     allowed object is
     *     {@link NaturalLanguageStringStructure }
     *     
     */
    public void setConnectionName(NaturalLanguageStringStructure value) {
        this.connectionName = value;
    }

    public boolean isSetConnectionName() {
        return (this.connectionName!= null);
    }

    /**
     * Obtient la valeur de la propriété allLines.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAllLines() {
        return allLines;
    }

    /**
     * Définit la valeur de la propriété allLines.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAllLines(String value) {
        this.allLines = value;
    }

    public boolean isSetAllLines() {
        return (this.allLines!= null);
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
     * Obtient la valeur de la propriété publishedLineName.
     * 
     * @return
     *     possible object is
     *     {@link NaturalLanguageStringStructure }
     *     
     */
    public NaturalLanguageStringStructure getPublishedLineName() {
        return publishedLineName;
    }

    /**
     * Définit la valeur de la propriété publishedLineName.
     * 
     * @param value
     *     allowed object is
     *     {@link NaturalLanguageStringStructure }
     *     
     */
    public void setPublishedLineName(NaturalLanguageStringStructure value) {
        this.publishedLineName = value;
    }

    public boolean isSetPublishedLineName() {
        return (this.publishedLineName!= null);
    }

    /**
     * Obtient la valeur de la propriété connectingStopPointRef.
     * 
     * @return
     *     possible object is
     *     {@link StopPointRefStructure }
     *     
     */
    public StopPointRefStructure getConnectingStopPointRef() {
        return connectingStopPointRef;
    }

    /**
     * Définit la valeur de la propriété connectingStopPointRef.
     * 
     * @param value
     *     allowed object is
     *     {@link StopPointRefStructure }
     *     
     */
    public void setConnectingStopPointRef(StopPointRefStructure value) {
        this.connectingStopPointRef = value;
    }

    public boolean isSetConnectingStopPointRef() {
        return (this.connectingStopPointRef!= null);
    }

    /**
     * Gets the value of the connectingStopPointName property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the connectingStopPointName property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getConnectingStopPointName().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link NaturalLanguageStringStructure }
     * 
     * 
     */
    public List<NaturalLanguageStringStructure> getConnectingStopPointName() {
        if (connectingStopPointName == null) {
            connectingStopPointName = new ArrayList<NaturalLanguageStringStructure>();
        }
        return this.connectingStopPointName;
    }

    public boolean isSetConnectingStopPointName() {
        return ((this.connectingStopPointName!= null)&&(!this.connectingStopPointName.isEmpty()));
    }

    public void unsetConnectingStopPointName() {
        this.connectingStopPointName = null;
    }

    /**
     * Obtient la valeur de la propriété connectingZoneRef.
     * 
     * @return
     *     possible object is
     *     {@link ZoneRefStructure }
     *     
     */
    public ZoneRefStructure getConnectingZoneRef() {
        return connectingZoneRef;
    }

    /**
     * Définit la valeur de la propriété connectingZoneRef.
     * 
     * @param value
     *     allowed object is
     *     {@link ZoneRefStructure }
     *     
     */
    public void setConnectingZoneRef(ZoneRefStructure value) {
        this.connectingZoneRef = value;
    }

    public boolean isSetConnectingZoneRef() {
        return (this.connectingZoneRef!= null);
    }

    /**
     * Obtient la valeur de la propriété connectionDirection.
     * 
     * @return
     *     possible object is
     *     {@link ConnectionDirectionEnumeration }
     *     
     */
    public ConnectionDirectionEnumeration getConnectionDirection() {
        return connectionDirection;
    }

    /**
     * Définit la valeur de la propriété connectionDirection.
     * 
     * @param value
     *     allowed object is
     *     {@link ConnectionDirectionEnumeration }
     *     
     */
    public void setConnectionDirection(ConnectionDirectionEnumeration value) {
        this.connectionDirection = value;
    }

    public boolean isSetConnectionDirection() {
        return (this.connectionDirection!= null);
    }

    /**
     * Gets the value of the affectedPathLink property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the affectedPathLink property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAffectedPathLink().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AffectedPathLinkStructure }
     * 
     * 
     */
    public List<AffectedPathLinkStructure> getAffectedPathLink() {
        if (affectedPathLink == null) {
            affectedPathLink = new ArrayList<AffectedPathLinkStructure>();
        }
        return this.affectedPathLink;
    }

    public boolean isSetAffectedPathLink() {
        return ((this.affectedPathLink!= null)&&(!this.affectedPathLink.isEmpty()));
    }

    public void unsetAffectedPathLink() {
        this.affectedPathLink = null;
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
