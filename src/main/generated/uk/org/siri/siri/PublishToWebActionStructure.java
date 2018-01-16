
package uk.org.siri.siri;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.NormalizedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * Type for Action Publish SITUATION To Web.
 * 
 * <p>Classe Java pour PublishToWebActionStructure complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="PublishToWebActionStructure">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.siri.org.uk/siri}ParameterisedActionStructure">
 *       &lt;sequence>
 *         &lt;element name="Incidents" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="HomePage" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="Ticker" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="SocialNetwork" type="{http://www.w3.org/2001/XMLSchema}normalizedString" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PublishToWebActionStructure", propOrder = {
    "incidents",
    "homePage",
    "ticker",
    "socialNetwork"
})
public class PublishToWebActionStructure
    extends ParameterisedActionStructure
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "Incidents", defaultValue = "true")
    protected Boolean incidents;
    @XmlElement(name = "HomePage", defaultValue = "false")
    protected Boolean homePage;
    @XmlElement(name = "Ticker", defaultValue = "false")
    protected Boolean ticker;
    @XmlElement(name = "SocialNetwork", defaultValue = "false")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected List<String> socialNetwork;

    /**
     * Obtient la valeur de la propriété incidents.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIncidents() {
        return incidents;
    }

    /**
     * Définit la valeur de la propriété incidents.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIncidents(Boolean value) {
        this.incidents = value;
    }

    public boolean isSetIncidents() {
        return (this.incidents!= null);
    }

    /**
     * Obtient la valeur de la propriété homePage.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isHomePage() {
        return homePage;
    }

    /**
     * Définit la valeur de la propriété homePage.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setHomePage(Boolean value) {
        this.homePage = value;
    }

    public boolean isSetHomePage() {
        return (this.homePage!= null);
    }

    /**
     * Obtient la valeur de la propriété ticker.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isTicker() {
        return ticker;
    }

    /**
     * Définit la valeur de la propriété ticker.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setTicker(Boolean value) {
        this.ticker = value;
    }

    public boolean isSetTicker() {
        return (this.ticker!= null);
    }

    /**
     * Gets the value of the socialNetwork property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the socialNetwork property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSocialNetwork().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getSocialNetwork() {
        if (socialNetwork == null) {
            socialNetwork = new ArrayList<String>();
        }
        return this.socialNetwork;
    }

    public boolean isSetSocialNetwork() {
        return ((this.socialNetwork!= null)&&(!this.socialNetwork.isEmpty()));
    }

    public void unsetSocialNetwork() {
        this.socialNetwork = null;
    }

}
