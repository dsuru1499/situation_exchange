
package uk.org.siri.siri;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * View of a SCHEDULED CONNECTION LINK description.
 * 
 * <p>Classe Java pour AnnotatedConnectionLinkStructure complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="AnnotatedConnectionLinkStructure">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ConnectionLinkRef" type="{http://www.siri.org.uk/siri}ConnectionLinkRefStructure"/>
 *         &lt;element name="FeederStopPointRef" type="{http://www.siri.org.uk/siri}StopPointRefStructure" minOccurs="0"/>
 *         &lt;element name="DistributorStopPointRef" type="{http://www.siri.org.uk/siri}StopPointRefStructure" minOccurs="0"/>
 *         &lt;element name="Monitored" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="ConnectionLinkName" type="{http://www.siri.org.uk/siri}NaturalLanguageStringStructure" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="FeederStopPointName" type="{http://www.siri.org.uk/siri}NaturalLanguageStringStructure" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="DistributorStopPointName" type="{http://www.siri.org.uk/siri}NaturalLanguageStringStructure" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Url" type="{http://www.w3.org/2001/XMLSchema}anyURI" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AnnotatedConnectionLinkStructure", propOrder = {
    "connectionLinkRef",
    "feederStopPointRef",
    "distributorStopPointRef",
    "monitored",
    "connectionLinkName",
    "feederStopPointName",
    "distributorStopPointName",
    "url"
})
public class AnnotatedConnectionLinkStructure
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "ConnectionLinkRef", required = true)
    protected ConnectionLinkRefStructure connectionLinkRef;
    @XmlElement(name = "FeederStopPointRef")
    protected StopPointRefStructure feederStopPointRef;
    @XmlElement(name = "DistributorStopPointRef")
    protected StopPointRefStructure distributorStopPointRef;
    @XmlElement(name = "Monitored", defaultValue = "true")
    protected Boolean monitored;
    @XmlElement(name = "ConnectionLinkName")
    protected List<NaturalLanguageStringStructure> connectionLinkName;
    @XmlElement(name = "FeederStopPointName")
    protected List<NaturalLanguageStringStructure> feederStopPointName;
    @XmlElement(name = "DistributorStopPointName")
    protected List<NaturalLanguageStringStructure> distributorStopPointName;
    @XmlElement(name = "Url")
    @XmlSchemaType(name = "anyURI")
    protected String url;

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
     * Obtient la valeur de la propriété feederStopPointRef.
     * 
     * @return
     *     possible object is
     *     {@link StopPointRefStructure }
     *     
     */
    public StopPointRefStructure getFeederStopPointRef() {
        return feederStopPointRef;
    }

    /**
     * Définit la valeur de la propriété feederStopPointRef.
     * 
     * @param value
     *     allowed object is
     *     {@link StopPointRefStructure }
     *     
     */
    public void setFeederStopPointRef(StopPointRefStructure value) {
        this.feederStopPointRef = value;
    }

    public boolean isSetFeederStopPointRef() {
        return (this.feederStopPointRef!= null);
    }

    /**
     * Obtient la valeur de la propriété distributorStopPointRef.
     * 
     * @return
     *     possible object is
     *     {@link StopPointRefStructure }
     *     
     */
    public StopPointRefStructure getDistributorStopPointRef() {
        return distributorStopPointRef;
    }

    /**
     * Définit la valeur de la propriété distributorStopPointRef.
     * 
     * @param value
     *     allowed object is
     *     {@link StopPointRefStructure }
     *     
     */
    public void setDistributorStopPointRef(StopPointRefStructure value) {
        this.distributorStopPointRef = value;
    }

    public boolean isSetDistributorStopPointRef() {
        return (this.distributorStopPointRef!= null);
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
     * Gets the value of the connectionLinkName property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the connectionLinkName property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getConnectionLinkName().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link NaturalLanguageStringStructure }
     * 
     * 
     */
    public List<NaturalLanguageStringStructure> getConnectionLinkName() {
        if (connectionLinkName == null) {
            connectionLinkName = new ArrayList<NaturalLanguageStringStructure>();
        }
        return this.connectionLinkName;
    }

    public boolean isSetConnectionLinkName() {
        return ((this.connectionLinkName!= null)&&(!this.connectionLinkName.isEmpty()));
    }

    public void unsetConnectionLinkName() {
        this.connectionLinkName = null;
    }

    /**
     * Gets the value of the feederStopPointName property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the feederStopPointName property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFeederStopPointName().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link NaturalLanguageStringStructure }
     * 
     * 
     */
    public List<NaturalLanguageStringStructure> getFeederStopPointName() {
        if (feederStopPointName == null) {
            feederStopPointName = new ArrayList<NaturalLanguageStringStructure>();
        }
        return this.feederStopPointName;
    }

    public boolean isSetFeederStopPointName() {
        return ((this.feederStopPointName!= null)&&(!this.feederStopPointName.isEmpty()));
    }

    public void unsetFeederStopPointName() {
        this.feederStopPointName = null;
    }

    /**
     * Gets the value of the distributorStopPointName property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the distributorStopPointName property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDistributorStopPointName().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link NaturalLanguageStringStructure }
     * 
     * 
     */
    public List<NaturalLanguageStringStructure> getDistributorStopPointName() {
        if (distributorStopPointName == null) {
            distributorStopPointName = new ArrayList<NaturalLanguageStringStructure>();
        }
        return this.distributorStopPointName;
    }

    public boolean isSetDistributorStopPointName() {
        return ((this.distributorStopPointName!= null)&&(!this.distributorStopPointName.isEmpty()));
    }

    public void unsetDistributorStopPointName() {
        this.distributorStopPointName = null;
    }

    /**
     * Obtient la valeur de la propriété url.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUrl() {
        return url;
    }

    /**
     * Définit la valeur de la propriété url.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUrl(String value) {
        this.url = value;
    }

    public boolean isSetUrl() {
        return (this.url!= null);
    }

}
