
package uk.org.siri.siri;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Type for Action Publish SITUATION To Displays.
 * 
 * <p>Classe Java pour PublishToMobileActionStructure complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="PublishToMobileActionStructure">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.siri.org.uk/siri}ParameterisedActionStructure">
 *       &lt;sequence>
 *         &lt;element name="Incidents" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="HomePage" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PublishToMobileActionStructure", propOrder = {
    "incidents",
    "homePage"
})
public class PublishToMobileActionStructure
    extends ParameterisedActionStructure
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "Incidents", defaultValue = "true")
    protected Boolean incidents;
    @XmlElement(name = "HomePage", defaultValue = "false")
    protected Boolean homePage;

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

}
