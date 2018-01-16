
package eu.datex2.schema._2_0rc1._2_0;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour TrafficViewPublication complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="TrafficViewPublication">
 *   &lt;complexContent>
 *     &lt;extension base="{http://datex2.eu/schema/2_0RC1/2_0}PayloadPublication">
 *       &lt;sequence>
 *         &lt;element name="headerInformation" type="{http://datex2.eu/schema/2_0RC1/2_0}HeaderInformation"/>
 *         &lt;element name="trafficView" type="{http://datex2.eu/schema/2_0RC1/2_0}TrafficView" maxOccurs="unbounded"/>
 *         &lt;element name="trafficViewPublicationExtension" type="{http://datex2.eu/schema/2_0RC1/2_0}ExtensionType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TrafficViewPublication", propOrder = {
    "headerInformation",
    "trafficView",
    "trafficViewPublicationExtension"
})
public class TrafficViewPublication
    extends PayloadPublication
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(required = true)
    protected HeaderInformation headerInformation;
    @XmlElement(required = true)
    protected List<TrafficView> trafficView;
    protected ExtensionType trafficViewPublicationExtension;

    /**
     * Obtient la valeur de la propriété headerInformation.
     * 
     * @return
     *     possible object is
     *     {@link HeaderInformation }
     *     
     */
    public HeaderInformation getHeaderInformation() {
        return headerInformation;
    }

    /**
     * Définit la valeur de la propriété headerInformation.
     * 
     * @param value
     *     allowed object is
     *     {@link HeaderInformation }
     *     
     */
    public void setHeaderInformation(HeaderInformation value) {
        this.headerInformation = value;
    }

    public boolean isSetHeaderInformation() {
        return (this.headerInformation!= null);
    }

    /**
     * Gets the value of the trafficView property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the trafficView property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTrafficView().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TrafficView }
     * 
     * 
     */
    public List<TrafficView> getTrafficView() {
        if (trafficView == null) {
            trafficView = new ArrayList<TrafficView>();
        }
        return this.trafficView;
    }

    public boolean isSetTrafficView() {
        return ((this.trafficView!= null)&&(!this.trafficView.isEmpty()));
    }

    public void unsetTrafficView() {
        this.trafficView = null;
    }

    /**
     * Obtient la valeur de la propriété trafficViewPublicationExtension.
     * 
     * @return
     *     possible object is
     *     {@link ExtensionType }
     *     
     */
    public ExtensionType getTrafficViewPublicationExtension() {
        return trafficViewPublicationExtension;
    }

    /**
     * Définit la valeur de la propriété trafficViewPublicationExtension.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtensionType }
     *     
     */
    public void setTrafficViewPublicationExtension(ExtensionType value) {
        this.trafficViewPublicationExtension = value;
    }

    public boolean isSetTrafficViewPublicationExtension() {
        return (this.trafficViewPublicationExtension!= null);
    }

}
