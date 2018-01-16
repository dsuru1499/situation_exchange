
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
 * <p>Classe Java pour MeasurementSiteTable complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="MeasurementSiteTable">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="measurementSiteTableIdentification" type="{http://datex2.eu/schema/2_0RC1/2_0}String" minOccurs="0"/>
 *         &lt;element name="measurementSiteTableVersion" type="{http://datex2.eu/schema/2_0RC1/2_0}NonNegativeInteger" minOccurs="0"/>
 *         &lt;element name="measurementSiteRecord" type="{http://datex2.eu/schema/2_0RC1/2_0}MeasurementSiteRecord" maxOccurs="unbounded"/>
 *         &lt;element name="measurementSiteTableExtension" type="{http://datex2.eu/schema/2_0RC1/2_0}ExtensionType" minOccurs="0"/>
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
@XmlType(name = "MeasurementSiteTable", propOrder = {
    "measurementSiteTableIdentification",
    "measurementSiteTableVersion",
    "measurementSiteRecord",
    "measurementSiteTableExtension"
})
public class MeasurementSiteTable
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    protected String measurementSiteTableIdentification;
    protected BigInteger measurementSiteTableVersion;
    @XmlElement(required = true)
    protected List<MeasurementSiteRecord> measurementSiteRecord;
    protected ExtensionType measurementSiteTableExtension;
    @XmlAttribute(name = "id", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlID
    @XmlSchemaType(name = "ID")
    protected String id;

    /**
     * Obtient la valeur de la propriété measurementSiteTableIdentification.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMeasurementSiteTableIdentification() {
        return measurementSiteTableIdentification;
    }

    /**
     * Définit la valeur de la propriété measurementSiteTableIdentification.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMeasurementSiteTableIdentification(String value) {
        this.measurementSiteTableIdentification = value;
    }

    public boolean isSetMeasurementSiteTableIdentification() {
        return (this.measurementSiteTableIdentification!= null);
    }

    /**
     * Obtient la valeur de la propriété measurementSiteTableVersion.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getMeasurementSiteTableVersion() {
        return measurementSiteTableVersion;
    }

    /**
     * Définit la valeur de la propriété measurementSiteTableVersion.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setMeasurementSiteTableVersion(BigInteger value) {
        this.measurementSiteTableVersion = value;
    }

    public boolean isSetMeasurementSiteTableVersion() {
        return (this.measurementSiteTableVersion!= null);
    }

    /**
     * Gets the value of the measurementSiteRecord property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the measurementSiteRecord property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMeasurementSiteRecord().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MeasurementSiteRecord }
     * 
     * 
     */
    public List<MeasurementSiteRecord> getMeasurementSiteRecord() {
        if (measurementSiteRecord == null) {
            measurementSiteRecord = new ArrayList<MeasurementSiteRecord>();
        }
        return this.measurementSiteRecord;
    }

    public boolean isSetMeasurementSiteRecord() {
        return ((this.measurementSiteRecord!= null)&&(!this.measurementSiteRecord.isEmpty()));
    }

    public void unsetMeasurementSiteRecord() {
        this.measurementSiteRecord = null;
    }

    /**
     * Obtient la valeur de la propriété measurementSiteTableExtension.
     * 
     * @return
     *     possible object is
     *     {@link ExtensionType }
     *     
     */
    public ExtensionType getMeasurementSiteTableExtension() {
        return measurementSiteTableExtension;
    }

    /**
     * Définit la valeur de la propriété measurementSiteTableExtension.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtensionType }
     *     
     */
    public void setMeasurementSiteTableExtension(ExtensionType value) {
        this.measurementSiteTableExtension = value;
    }

    public boolean isSetMeasurementSiteTableExtension() {
        return (this.measurementSiteTableExtension!= null);
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
