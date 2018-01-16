
package eu.datex2.schema._2_0rc1._2_0;

import java.io.Serializable;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlID;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Classe Java pour TrafficViewRecord complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="TrafficViewRecord">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="recordSequenceNumber" type="{http://datex2.eu/schema/2_0RC1/2_0}NonNegativeInteger"/>
 *         &lt;element name="trafficElement" type="{http://datex2.eu/schema/2_0RC1/2_0}TrafficElement" minOccurs="0"/>
 *         &lt;element name="operatorAction" type="{http://datex2.eu/schema/2_0RC1/2_0}OperatorAction" minOccurs="0"/>
 *         &lt;element name="elaboratedData" type="{http://datex2.eu/schema/2_0RC1/2_0}ElaboratedData" minOccurs="0"/>
 *         &lt;element name="urlLink" type="{http://datex2.eu/schema/2_0RC1/2_0}UrlLink" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="trafficViewRecordExtension" type="{http://datex2.eu/schema/2_0RC1/2_0}ExtensionType" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="id" use="required" type="{http://www.w3.org/2001/XMLSchema}ID" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TrafficViewRecord", propOrder = {
    "recordSequenceNumber",
    "trafficElement",
    "operatorAction",
    "elaboratedData",
    "urlLink",
    "trafficViewRecordExtension"
})
public class TrafficViewRecord
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(required = true)
    protected BigInteger recordSequenceNumber;
    protected TrafficElement trafficElement;
    protected OperatorAction operatorAction;
    protected ElaboratedData elaboratedData;
    protected List<UrlLink> urlLink;
    protected ExtensionType trafficViewRecordExtension;
    @XmlAttribute(name = "id", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlID
    @XmlSchemaType(name = "ID")
    protected String id;

    /**
     * Obtient la valeur de la propriété recordSequenceNumber.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getRecordSequenceNumber() {
        return recordSequenceNumber;
    }

    /**
     * Définit la valeur de la propriété recordSequenceNumber.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setRecordSequenceNumber(BigInteger value) {
        this.recordSequenceNumber = value;
    }

    public boolean isSetRecordSequenceNumber() {
        return (this.recordSequenceNumber!= null);
    }

    /**
     * Obtient la valeur de la propriété trafficElement.
     * 
     * @return
     *     possible object is
     *     {@link TrafficElement }
     *     
     */
    public TrafficElement getTrafficElement() {
        return trafficElement;
    }

    /**
     * Définit la valeur de la propriété trafficElement.
     * 
     * @param value
     *     allowed object is
     *     {@link TrafficElement }
     *     
     */
    public void setTrafficElement(TrafficElement value) {
        this.trafficElement = value;
    }

    public boolean isSetTrafficElement() {
        return (this.trafficElement!= null);
    }

    /**
     * Obtient la valeur de la propriété operatorAction.
     * 
     * @return
     *     possible object is
     *     {@link OperatorAction }
     *     
     */
    public OperatorAction getOperatorAction() {
        return operatorAction;
    }

    /**
     * Définit la valeur de la propriété operatorAction.
     * 
     * @param value
     *     allowed object is
     *     {@link OperatorAction }
     *     
     */
    public void setOperatorAction(OperatorAction value) {
        this.operatorAction = value;
    }

    public boolean isSetOperatorAction() {
        return (this.operatorAction!= null);
    }

    /**
     * Obtient la valeur de la propriété elaboratedData.
     * 
     * @return
     *     possible object is
     *     {@link ElaboratedData }
     *     
     */
    public ElaboratedData getElaboratedData() {
        return elaboratedData;
    }

    /**
     * Définit la valeur de la propriété elaboratedData.
     * 
     * @param value
     *     allowed object is
     *     {@link ElaboratedData }
     *     
     */
    public void setElaboratedData(ElaboratedData value) {
        this.elaboratedData = value;
    }

    public boolean isSetElaboratedData() {
        return (this.elaboratedData!= null);
    }

    /**
     * Gets the value of the urlLink property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the urlLink property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getUrlLink().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link UrlLink }
     * 
     * 
     */
    public List<UrlLink> getUrlLink() {
        if (urlLink == null) {
            urlLink = new ArrayList<UrlLink>();
        }
        return this.urlLink;
    }

    public boolean isSetUrlLink() {
        return ((this.urlLink!= null)&&(!this.urlLink.isEmpty()));
    }

    public void unsetUrlLink() {
        this.urlLink = null;
    }

    /**
     * Obtient la valeur de la propriété trafficViewRecordExtension.
     * 
     * @return
     *     possible object is
     *     {@link ExtensionType }
     *     
     */
    public ExtensionType getTrafficViewRecordExtension() {
        return trafficViewRecordExtension;
    }

    /**
     * Définit la valeur de la propriété trafficViewRecordExtension.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtensionType }
     *     
     */
    public void setTrafficViewRecordExtension(ExtensionType value) {
        this.trafficViewRecordExtension = value;
    }

    public boolean isSetTrafficViewRecordExtension() {
        return (this.trafficViewRecordExtension!= null);
    }

    /**
     * Obtient la valeur de la propriété id.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getId() {
        return id;
    }

    /**
     * Définit la valeur de la propriété id.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setId(String value) {
        this.id = value;
    }

    public boolean isSetId() {
        return (this.id!= null);
    }

}
