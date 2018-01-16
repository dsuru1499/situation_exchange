
package eu.datex2.schema._2_0rc1._2_0;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Classe Java pour ElaboratedDataPublication complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="ElaboratedDataPublication">
 *   &lt;complexContent>
 *     &lt;extension base="{http://datex2.eu/schema/2_0RC1/2_0}PayloadPublication">
 *       &lt;sequence>
 *         &lt;element name="forecastDefault" type="{http://datex2.eu/schema/2_0RC1/2_0}Boolean" minOccurs="0"/>
 *         &lt;element name="periodDefault" type="{http://datex2.eu/schema/2_0RC1/2_0}Seconds" minOccurs="0"/>
 *         &lt;element name="timeDefault" type="{http://datex2.eu/schema/2_0RC1/2_0}DateTime" minOccurs="0"/>
 *         &lt;element name="headerInformation" type="{http://datex2.eu/schema/2_0RC1/2_0}HeaderInformation"/>
 *         &lt;element name="referenceSettings" type="{http://datex2.eu/schema/2_0RC1/2_0}ReferenceSettings" minOccurs="0"/>
 *         &lt;element name="elaboratedData" type="{http://datex2.eu/schema/2_0RC1/2_0}ElaboratedData" maxOccurs="unbounded"/>
 *         &lt;element name="elaboratedDataPublicationExtension" type="{http://datex2.eu/schema/2_0RC1/2_0}ExtensionType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ElaboratedDataPublication", propOrder = {
    "forecastDefault",
    "periodDefault",
    "timeDefault",
    "headerInformation",
    "referenceSettings",
    "elaboratedData",
    "elaboratedDataPublicationExtension"
})
public class ElaboratedDataPublication
    extends PayloadPublication
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    protected Boolean forecastDefault;
    protected Float periodDefault;
    protected XMLGregorianCalendar timeDefault;
    @XmlElement(required = true)
    protected HeaderInformation headerInformation;
    protected ReferenceSettings referenceSettings;
    @XmlElement(required = true)
    protected List<ElaboratedData> elaboratedData;
    protected ExtensionType elaboratedDataPublicationExtension;

    /**
     * Obtient la valeur de la propriété forecastDefault.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isForecastDefault() {
        return forecastDefault;
    }

    /**
     * Définit la valeur de la propriété forecastDefault.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setForecastDefault(Boolean value) {
        this.forecastDefault = value;
    }

    public boolean isSetForecastDefault() {
        return (this.forecastDefault!= null);
    }

    /**
     * Obtient la valeur de la propriété periodDefault.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getPeriodDefault() {
        return periodDefault;
    }

    /**
     * Définit la valeur de la propriété periodDefault.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setPeriodDefault(Float value) {
        this.periodDefault = value;
    }

    public boolean isSetPeriodDefault() {
        return (this.periodDefault!= null);
    }

    /**
     * Obtient la valeur de la propriété timeDefault.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getTimeDefault() {
        return timeDefault;
    }

    /**
     * Définit la valeur de la propriété timeDefault.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setTimeDefault(XMLGregorianCalendar value) {
        this.timeDefault = value;
    }

    public boolean isSetTimeDefault() {
        return (this.timeDefault!= null);
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
     * Obtient la valeur de la propriété referenceSettings.
     * 
     * @return
     *     possible object is
     *     {@link ReferenceSettings }
     *     
     */
    public ReferenceSettings getReferenceSettings() {
        return referenceSettings;
    }

    /**
     * Définit la valeur de la propriété referenceSettings.
     * 
     * @param value
     *     allowed object is
     *     {@link ReferenceSettings }
     *     
     */
    public void setReferenceSettings(ReferenceSettings value) {
        this.referenceSettings = value;
    }

    public boolean isSetReferenceSettings() {
        return (this.referenceSettings!= null);
    }

    /**
     * Gets the value of the elaboratedData property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the elaboratedData property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getElaboratedData().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ElaboratedData }
     * 
     * 
     */
    public List<ElaboratedData> getElaboratedData() {
        if (elaboratedData == null) {
            elaboratedData = new ArrayList<ElaboratedData>();
        }
        return this.elaboratedData;
    }

    public boolean isSetElaboratedData() {
        return ((this.elaboratedData!= null)&&(!this.elaboratedData.isEmpty()));
    }

    public void unsetElaboratedData() {
        this.elaboratedData = null;
    }

    /**
     * Obtient la valeur de la propriété elaboratedDataPublicationExtension.
     * 
     * @return
     *     possible object is
     *     {@link ExtensionType }
     *     
     */
    public ExtensionType getElaboratedDataPublicationExtension() {
        return elaboratedDataPublicationExtension;
    }

    /**
     * Définit la valeur de la propriété elaboratedDataPublicationExtension.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtensionType }
     *     
     */
    public void setElaboratedDataPublicationExtension(ExtensionType value) {
        this.elaboratedDataPublicationExtension = value;
    }

    public boolean isSetElaboratedDataPublicationExtension() {
        return (this.elaboratedDataPublicationExtension!= null);
    }

}
