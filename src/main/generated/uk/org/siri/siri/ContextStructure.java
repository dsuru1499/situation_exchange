
package uk.org.siri.siri;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import uk.org.ifopt.ifopt.CountryRefStructure;


/**
 * Common parameters for all SITUATIONs.
 * 
 * <p>Classe Java pour ContextStructure complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="ContextStructure">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CountryRef" type="{http://www.ifopt.org.uk/ifopt}CountryRefStructure" minOccurs="0"/>
 *         &lt;element name="ParticipantRef" type="{http://www.siri.org.uk/siri}ParticipantRefStructure"/>
 *         &lt;element name="TopographicPlaceRef" type="{http://www.w3.org/2001/XMLSchema}NMTOKEN" minOccurs="0"/>
 *         &lt;element name="TopographicPlaceName" type="{http://www.siri.org.uk/siri}NaturalLanguageStringStructure" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="DefaultLanguage" type="{http://www.w3.org/2001/XMLSchema}language" minOccurs="0"/>
 *         &lt;element name="NetworkContext" type="{http://www.siri.org.uk/siri}NetworkContextStructure" minOccurs="0"/>
 *         &lt;element name="Actions" type="{http://www.siri.org.uk/siri}ActionsStructure" minOccurs="0"/>
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
@XmlType(name = "ContextStructure", propOrder = {
    "countryRef",
    "participantRef",
    "topographicPlaceRef",
    "topographicPlaceName",
    "defaultLanguage",
    "networkContext",
    "actions",
    "extensions"
})
public class ContextStructure
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "CountryRef")
    protected CountryRefStructure countryRef;
    @XmlElement(name = "ParticipantRef", required = true)
    protected ParticipantRefStructure participantRef;
    @XmlElement(name = "TopographicPlaceRef")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NMTOKEN")
    protected String topographicPlaceRef;
    @XmlElement(name = "TopographicPlaceName")
    protected List<NaturalLanguageStringStructure> topographicPlaceName;
    @XmlElement(name = "DefaultLanguage")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "language")
    protected String defaultLanguage;
    @XmlElement(name = "NetworkContext")
    protected NetworkContextStructure networkContext;
    @XmlElement(name = "Actions")
    protected ActionsStructure actions;
    @XmlElement(name = "Extensions")
    protected ExtensionsStructure extensions;

    /**
     * Obtient la valeur de la propriété countryRef.
     * 
     * @return
     *     possible object is
     *     {@link CountryRefStructure }
     *     
     */
    public CountryRefStructure getCountryRef() {
        return countryRef;
    }

    /**
     * Définit la valeur de la propriété countryRef.
     * 
     * @param value
     *     allowed object is
     *     {@link CountryRefStructure }
     *     
     */
    public void setCountryRef(CountryRefStructure value) {
        this.countryRef = value;
    }

    public boolean isSetCountryRef() {
        return (this.countryRef!= null);
    }

    /**
     * Obtient la valeur de la propriété participantRef.
     * 
     * @return
     *     possible object is
     *     {@link ParticipantRefStructure }
     *     
     */
    public ParticipantRefStructure getParticipantRef() {
        return participantRef;
    }

    /**
     * Définit la valeur de la propriété participantRef.
     * 
     * @param value
     *     allowed object is
     *     {@link ParticipantRefStructure }
     *     
     */
    public void setParticipantRef(ParticipantRefStructure value) {
        this.participantRef = value;
    }

    public boolean isSetParticipantRef() {
        return (this.participantRef!= null);
    }

    /**
     * Obtient la valeur de la propriété topographicPlaceRef.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTopographicPlaceRef() {
        return topographicPlaceRef;
    }

    /**
     * Définit la valeur de la propriété topographicPlaceRef.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTopographicPlaceRef(String value) {
        this.topographicPlaceRef = value;
    }

    public boolean isSetTopographicPlaceRef() {
        return (this.topographicPlaceRef!= null);
    }

    /**
     * Gets the value of the topographicPlaceName property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the topographicPlaceName property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTopographicPlaceName().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link NaturalLanguageStringStructure }
     * 
     * 
     */
    public List<NaturalLanguageStringStructure> getTopographicPlaceName() {
        if (topographicPlaceName == null) {
            topographicPlaceName = new ArrayList<NaturalLanguageStringStructure>();
        }
        return this.topographicPlaceName;
    }

    public boolean isSetTopographicPlaceName() {
        return ((this.topographicPlaceName!= null)&&(!this.topographicPlaceName.isEmpty()));
    }

    public void unsetTopographicPlaceName() {
        this.topographicPlaceName = null;
    }

    /**
     * Obtient la valeur de la propriété defaultLanguage.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDefaultLanguage() {
        return defaultLanguage;
    }

    /**
     * Définit la valeur de la propriété defaultLanguage.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDefaultLanguage(String value) {
        this.defaultLanguage = value;
    }

    public boolean isSetDefaultLanguage() {
        return (this.defaultLanguage!= null);
    }

    /**
     * Obtient la valeur de la propriété networkContext.
     * 
     * @return
     *     possible object is
     *     {@link NetworkContextStructure }
     *     
     */
    public NetworkContextStructure getNetworkContext() {
        return networkContext;
    }

    /**
     * Définit la valeur de la propriété networkContext.
     * 
     * @param value
     *     allowed object is
     *     {@link NetworkContextStructure }
     *     
     */
    public void setNetworkContext(NetworkContextStructure value) {
        this.networkContext = value;
    }

    public boolean isSetNetworkContext() {
        return (this.networkContext!= null);
    }

    /**
     * Obtient la valeur de la propriété actions.
     * 
     * @return
     *     possible object is
     *     {@link ActionsStructure }
     *     
     */
    public ActionsStructure getActions() {
        return actions;
    }

    /**
     * Définit la valeur de la propriété actions.
     * 
     * @param value
     *     allowed object is
     *     {@link ActionsStructure }
     *     
     */
    public void setActions(ActionsStructure value) {
        this.actions = value;
    }

    public boolean isSetActions() {
        return (this.actions!= null);
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
