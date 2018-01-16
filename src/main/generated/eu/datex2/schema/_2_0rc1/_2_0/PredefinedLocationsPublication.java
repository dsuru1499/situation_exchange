
package eu.datex2.schema._2_0rc1._2_0;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour PredefinedLocationsPublication complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="PredefinedLocationsPublication">
 *   &lt;complexContent>
 *     &lt;extension base="{http://datex2.eu/schema/2_0RC1/2_0}PayloadPublication">
 *       &lt;sequence>
 *         &lt;element name="headerInformation" type="{http://datex2.eu/schema/2_0RC1/2_0}HeaderInformation"/>
 *         &lt;element name="predefinedLocationSet" type="{http://datex2.eu/schema/2_0RC1/2_0}PredefinedLocationSet" maxOccurs="unbounded"/>
 *         &lt;element name="predefinedLocationsPublicationExtension" type="{http://datex2.eu/schema/2_0RC1/2_0}ExtensionType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PredefinedLocationsPublication", propOrder = {
    "headerInformation",
    "predefinedLocationSet",
    "predefinedLocationsPublicationExtension"
})
public class PredefinedLocationsPublication
    extends PayloadPublication
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(required = true)
    protected HeaderInformation headerInformation;
    @XmlElement(required = true)
    protected List<PredefinedLocationSet> predefinedLocationSet;
    protected ExtensionType predefinedLocationsPublicationExtension;

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
     * Gets the value of the predefinedLocationSet property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the predefinedLocationSet property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPredefinedLocationSet().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PredefinedLocationSet }
     * 
     * 
     */
    public List<PredefinedLocationSet> getPredefinedLocationSet() {
        if (predefinedLocationSet == null) {
            predefinedLocationSet = new ArrayList<PredefinedLocationSet>();
        }
        return this.predefinedLocationSet;
    }

    public boolean isSetPredefinedLocationSet() {
        return ((this.predefinedLocationSet!= null)&&(!this.predefinedLocationSet.isEmpty()));
    }

    public void unsetPredefinedLocationSet() {
        this.predefinedLocationSet = null;
    }

    /**
     * Obtient la valeur de la propriété predefinedLocationsPublicationExtension.
     * 
     * @return
     *     possible object is
     *     {@link ExtensionType }
     *     
     */
    public ExtensionType getPredefinedLocationsPublicationExtension() {
        return predefinedLocationsPublicationExtension;
    }

    /**
     * Définit la valeur de la propriété predefinedLocationsPublicationExtension.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtensionType }
     *     
     */
    public void setPredefinedLocationsPublicationExtension(ExtensionType value) {
        this.predefinedLocationsPublicationExtension = value;
    }

    public boolean isSetPredefinedLocationsPublicationExtension() {
        return (this.predefinedLocationsPublicationExtension!= null);
    }

}
