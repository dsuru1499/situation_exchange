
package eu.datex2.schema._2_0rc1._2_0;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Classe Java pour SiteMeasurements complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="SiteMeasurements">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="measurementSiteReference" type="{http://datex2.eu/schema/2_0RC1/2_0}Reference"/>
 *         &lt;element name="measurementTimeDefault" type="{http://datex2.eu/schema/2_0RC1/2_0}DateTime"/>
 *         &lt;element name="measuredValue" maxOccurs="unbounded">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;extension base="{http://datex2.eu/schema/2_0RC1/2_0}MeasuredValue">
 *                 &lt;attribute name="index" use="required" type="{http://www.w3.org/2001/XMLSchema}int" />
 *               &lt;/extension>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="siteMeasurementsExtension" type="{http://datex2.eu/schema/2_0RC1/2_0}ExtensionType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SiteMeasurements", propOrder = {
    "measurementSiteReference",
    "measurementTimeDefault",
    "measuredValue",
    "siteMeasurementsExtension"
})
public class SiteMeasurements
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(required = true)
    protected String measurementSiteReference;
    @XmlElement(required = true)
    protected XMLGregorianCalendar measurementTimeDefault;
    @XmlElement(required = true)
    protected List<SiteMeasurements.MeasuredValue> measuredValue;
    protected ExtensionType siteMeasurementsExtension;

    /**
     * Obtient la valeur de la propriété measurementSiteReference.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMeasurementSiteReference() {
        return measurementSiteReference;
    }

    /**
     * Définit la valeur de la propriété measurementSiteReference.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMeasurementSiteReference(String value) {
        this.measurementSiteReference = value;
    }

    public boolean isSetMeasurementSiteReference() {
        return (this.measurementSiteReference!= null);
    }

    /**
     * Obtient la valeur de la propriété measurementTimeDefault.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getMeasurementTimeDefault() {
        return measurementTimeDefault;
    }

    /**
     * Définit la valeur de la propriété measurementTimeDefault.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setMeasurementTimeDefault(XMLGregorianCalendar value) {
        this.measurementTimeDefault = value;
    }

    public boolean isSetMeasurementTimeDefault() {
        return (this.measurementTimeDefault!= null);
    }

    /**
     * Gets the value of the measuredValue property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the measuredValue property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMeasuredValue().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SiteMeasurements.MeasuredValue }
     * 
     * 
     */
    public List<SiteMeasurements.MeasuredValue> getMeasuredValue() {
        if (measuredValue == null) {
            measuredValue = new ArrayList<SiteMeasurements.MeasuredValue>();
        }
        return this.measuredValue;
    }

    public boolean isSetMeasuredValue() {
        return ((this.measuredValue!= null)&&(!this.measuredValue.isEmpty()));
    }

    public void unsetMeasuredValue() {
        this.measuredValue = null;
    }

    /**
     * Obtient la valeur de la propriété siteMeasurementsExtension.
     * 
     * @return
     *     possible object is
     *     {@link ExtensionType }
     *     
     */
    public ExtensionType getSiteMeasurementsExtension() {
        return siteMeasurementsExtension;
    }

    /**
     * Définit la valeur de la propriété siteMeasurementsExtension.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtensionType }
     *     
     */
    public void setSiteMeasurementsExtension(ExtensionType value) {
        this.siteMeasurementsExtension = value;
    }

    public boolean isSetSiteMeasurementsExtension() {
        return (this.siteMeasurementsExtension!= null);
    }


    /**
     * <p>Classe Java pour anonymous complex type.
     * 
     * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;extension base="{http://datex2.eu/schema/2_0RC1/2_0}MeasuredValue">
     *       &lt;attribute name="index" use="required" type="{http://www.w3.org/2001/XMLSchema}int" />
     *     &lt;/extension>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class MeasuredValue
        extends eu.datex2.schema._2_0rc1._2_0.MeasuredValue
        implements Serializable
    {

        private final static long serialVersionUID = 1L;
        @XmlAttribute(name = "index", required = true)
        protected int index;

        /**
         * Obtient la valeur de la propriété index.
         * 
         */
        public int getIndex() {
            return index;
        }

        /**
         * Définit la valeur de la propriété index.
         * 
         */
        public void setIndex(int value) {
            this.index = value;
        }

        public boolean isSetIndex() {
            return true;
        }

    }

}
