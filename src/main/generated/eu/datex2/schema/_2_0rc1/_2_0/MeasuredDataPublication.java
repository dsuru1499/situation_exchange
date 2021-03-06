
package eu.datex2.schema._2_0rc1._2_0;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour MeasuredDataPublication complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="MeasuredDataPublication">
 *   &lt;complexContent>
 *     &lt;extension base="{http://datex2.eu/schema/2_0RC1/2_0}PayloadPublication">
 *       &lt;sequence>
 *         &lt;element name="measurementSiteTableReference" type="{http://datex2.eu/schema/2_0RC1/2_0}Reference"/>
 *         &lt;element name="headerInformation" type="{http://datex2.eu/schema/2_0RC1/2_0}HeaderInformation"/>
 *         &lt;element name="siteMeasurements" type="{http://datex2.eu/schema/2_0RC1/2_0}SiteMeasurements" maxOccurs="unbounded"/>
 *         &lt;element name="measuredDataPublicationExtension" type="{http://datex2.eu/schema/2_0RC1/2_0}ExtensionType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MeasuredDataPublication", propOrder = {
    "measurementSiteTableReference",
    "headerInformation",
    "siteMeasurements",
    "measuredDataPublicationExtension"
})
public class MeasuredDataPublication
    extends PayloadPublication
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(required = true)
    protected String measurementSiteTableReference;
    @XmlElement(required = true)
    protected HeaderInformation headerInformation;
    @XmlElement(required = true)
    protected List<SiteMeasurements> siteMeasurements;
    protected ExtensionType measuredDataPublicationExtension;

    /**
     * Obtient la valeur de la propriété measurementSiteTableReference.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMeasurementSiteTableReference() {
        return measurementSiteTableReference;
    }

    /**
     * Définit la valeur de la propriété measurementSiteTableReference.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMeasurementSiteTableReference(String value) {
        this.measurementSiteTableReference = value;
    }

    public boolean isSetMeasurementSiteTableReference() {
        return (this.measurementSiteTableReference!= null);
    }

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
     * Gets the value of the siteMeasurements property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the siteMeasurements property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSiteMeasurements().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SiteMeasurements }
     * 
     * 
     */
    public List<SiteMeasurements> getSiteMeasurements() {
        if (siteMeasurements == null) {
            siteMeasurements = new ArrayList<SiteMeasurements>();
        }
        return this.siteMeasurements;
    }

    public boolean isSetSiteMeasurements() {
        return ((this.siteMeasurements!= null)&&(!this.siteMeasurements.isEmpty()));
    }

    public void unsetSiteMeasurements() {
        this.siteMeasurements = null;
    }

    /**
     * Obtient la valeur de la propriété measuredDataPublicationExtension.
     * 
     * @return
     *     possible object is
     *     {@link ExtensionType }
     *     
     */
    public ExtensionType getMeasuredDataPublicationExtension() {
        return measuredDataPublicationExtension;
    }

    /**
     * Définit la valeur de la propriété measuredDataPublicationExtension.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtensionType }
     *     
     */
    public void setMeasuredDataPublicationExtension(ExtensionType value) {
        this.measuredDataPublicationExtension = value;
    }

    public boolean isSetMeasuredDataPublicationExtension() {
        return (this.measuredDataPublicationExtension!= null);
    }

}
