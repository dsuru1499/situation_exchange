
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
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Classe Java pour MeasurementSiteRecord complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="MeasurementSiteRecord">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="measurementSiteRecordVersion" type="{http://datex2.eu/schema/2_0RC1/2_0}NonNegativeInteger" minOccurs="0"/>
 *         &lt;element name="measurementSiteRecordVersionTime" type="{http://datex2.eu/schema/2_0RC1/2_0}DateTime" minOccurs="0"/>
 *         &lt;element name="computationMethod" type="{http://datex2.eu/schema/2_0RC1/2_0}ComputationMethodEnum" minOccurs="0"/>
 *         &lt;element name="measurementEquipmentReference" type="{http://datex2.eu/schema/2_0RC1/2_0}String" minOccurs="0"/>
 *         &lt;element name="measurementEquipmentTypeUsed" type="{http://datex2.eu/schema/2_0RC1/2_0}MultilingualString" minOccurs="0"/>
 *         &lt;element name="measurementSiteName" type="{http://datex2.eu/schema/2_0RC1/2_0}MultilingualString" minOccurs="0"/>
 *         &lt;element name="measurementSiteNumberOfLanes" type="{http://datex2.eu/schema/2_0RC1/2_0}NonNegativeInteger" minOccurs="0"/>
 *         &lt;element name="measurementSiteIdentification" type="{http://datex2.eu/schema/2_0RC1/2_0}String" minOccurs="0"/>
 *         &lt;element name="measurementSide" type="{http://datex2.eu/schema/2_0RC1/2_0}DirectionEnum" minOccurs="0"/>
 *         &lt;element name="measurementSpecificCharacteristics" maxOccurs="unbounded">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;extension base="{http://datex2.eu/schema/2_0RC1/2_0}MeasurementSpecificCharacteristics">
 *                 &lt;attribute name="index" use="required" type="{http://www.w3.org/2001/XMLSchema}int" />
 *               &lt;/extension>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="measurementSiteLocation" type="{http://datex2.eu/schema/2_0RC1/2_0}Location"/>
 *         &lt;element name="measurementSiteRecordExtension" type="{http://datex2.eu/schema/2_0RC1/2_0}ExtensionType" minOccurs="0"/>
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
@XmlType(name = "MeasurementSiteRecord", propOrder = {
    "measurementSiteRecordVersion",
    "measurementSiteRecordVersionTime",
    "computationMethod",
    "measurementEquipmentReference",
    "measurementEquipmentTypeUsed",
    "measurementSiteName",
    "measurementSiteNumberOfLanes",
    "measurementSiteIdentification",
    "measurementSide",
    "measurementSpecificCharacteristics",
    "measurementSiteLocation",
    "measurementSiteRecordExtension"
})
public class MeasurementSiteRecord
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    protected BigInteger measurementSiteRecordVersion;
    protected XMLGregorianCalendar measurementSiteRecordVersionTime;
    protected ComputationMethodEnum computationMethod;
    protected String measurementEquipmentReference;
    protected MultilingualString measurementEquipmentTypeUsed;
    protected MultilingualString measurementSiteName;
    protected BigInteger measurementSiteNumberOfLanes;
    protected String measurementSiteIdentification;
    protected DirectionEnum measurementSide;
    @XmlElement(required = true)
    protected List<MeasurementSiteRecord.MeasurementSpecificCharacteristics> measurementSpecificCharacteristics;
    @XmlElement(required = true)
    protected Location measurementSiteLocation;
    protected ExtensionType measurementSiteRecordExtension;
    @XmlAttribute(name = "id", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlID
    @XmlSchemaType(name = "ID")
    protected String id;

    /**
     * Obtient la valeur de la propriété measurementSiteRecordVersion.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getMeasurementSiteRecordVersion() {
        return measurementSiteRecordVersion;
    }

    /**
     * Définit la valeur de la propriété measurementSiteRecordVersion.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setMeasurementSiteRecordVersion(BigInteger value) {
        this.measurementSiteRecordVersion = value;
    }

    public boolean isSetMeasurementSiteRecordVersion() {
        return (this.measurementSiteRecordVersion!= null);
    }

    /**
     * Obtient la valeur de la propriété measurementSiteRecordVersionTime.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getMeasurementSiteRecordVersionTime() {
        return measurementSiteRecordVersionTime;
    }

    /**
     * Définit la valeur de la propriété measurementSiteRecordVersionTime.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setMeasurementSiteRecordVersionTime(XMLGregorianCalendar value) {
        this.measurementSiteRecordVersionTime = value;
    }

    public boolean isSetMeasurementSiteRecordVersionTime() {
        return (this.measurementSiteRecordVersionTime!= null);
    }

    /**
     * Obtient la valeur de la propriété computationMethod.
     * 
     * @return
     *     possible object is
     *     {@link ComputationMethodEnum }
     *     
     */
    public ComputationMethodEnum getComputationMethod() {
        return computationMethod;
    }

    /**
     * Définit la valeur de la propriété computationMethod.
     * 
     * @param value
     *     allowed object is
     *     {@link ComputationMethodEnum }
     *     
     */
    public void setComputationMethod(ComputationMethodEnum value) {
        this.computationMethod = value;
    }

    public boolean isSetComputationMethod() {
        return (this.computationMethod!= null);
    }

    /**
     * Obtient la valeur de la propriété measurementEquipmentReference.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMeasurementEquipmentReference() {
        return measurementEquipmentReference;
    }

    /**
     * Définit la valeur de la propriété measurementEquipmentReference.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMeasurementEquipmentReference(String value) {
        this.measurementEquipmentReference = value;
    }

    public boolean isSetMeasurementEquipmentReference() {
        return (this.measurementEquipmentReference!= null);
    }

    /**
     * Obtient la valeur de la propriété measurementEquipmentTypeUsed.
     * 
     * @return
     *     possible object is
     *     {@link MultilingualString }
     *     
     */
    public MultilingualString getMeasurementEquipmentTypeUsed() {
        return measurementEquipmentTypeUsed;
    }

    /**
     * Définit la valeur de la propriété measurementEquipmentTypeUsed.
     * 
     * @param value
     *     allowed object is
     *     {@link MultilingualString }
     *     
     */
    public void setMeasurementEquipmentTypeUsed(MultilingualString value) {
        this.measurementEquipmentTypeUsed = value;
    }

    public boolean isSetMeasurementEquipmentTypeUsed() {
        return (this.measurementEquipmentTypeUsed!= null);
    }

    /**
     * Obtient la valeur de la propriété measurementSiteName.
     * 
     * @return
     *     possible object is
     *     {@link MultilingualString }
     *     
     */
    public MultilingualString getMeasurementSiteName() {
        return measurementSiteName;
    }

    /**
     * Définit la valeur de la propriété measurementSiteName.
     * 
     * @param value
     *     allowed object is
     *     {@link MultilingualString }
     *     
     */
    public void setMeasurementSiteName(MultilingualString value) {
        this.measurementSiteName = value;
    }

    public boolean isSetMeasurementSiteName() {
        return (this.measurementSiteName!= null);
    }

    /**
     * Obtient la valeur de la propriété measurementSiteNumberOfLanes.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getMeasurementSiteNumberOfLanes() {
        return measurementSiteNumberOfLanes;
    }

    /**
     * Définit la valeur de la propriété measurementSiteNumberOfLanes.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setMeasurementSiteNumberOfLanes(BigInteger value) {
        this.measurementSiteNumberOfLanes = value;
    }

    public boolean isSetMeasurementSiteNumberOfLanes() {
        return (this.measurementSiteNumberOfLanes!= null);
    }

    /**
     * Obtient la valeur de la propriété measurementSiteIdentification.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMeasurementSiteIdentification() {
        return measurementSiteIdentification;
    }

    /**
     * Définit la valeur de la propriété measurementSiteIdentification.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMeasurementSiteIdentification(String value) {
        this.measurementSiteIdentification = value;
    }

    public boolean isSetMeasurementSiteIdentification() {
        return (this.measurementSiteIdentification!= null);
    }

    /**
     * Obtient la valeur de la propriété measurementSide.
     * 
     * @return
     *     possible object is
     *     {@link DirectionEnum }
     *     
     */
    public DirectionEnum getMeasurementSide() {
        return measurementSide;
    }

    /**
     * Définit la valeur de la propriété measurementSide.
     * 
     * @param value
     *     allowed object is
     *     {@link DirectionEnum }
     *     
     */
    public void setMeasurementSide(DirectionEnum value) {
        this.measurementSide = value;
    }

    public boolean isSetMeasurementSide() {
        return (this.measurementSide!= null);
    }

    /**
     * Gets the value of the measurementSpecificCharacteristics property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the measurementSpecificCharacteristics property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMeasurementSpecificCharacteristics().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MeasurementSiteRecord.MeasurementSpecificCharacteristics }
     * 
     * 
     */
    public List<MeasurementSiteRecord.MeasurementSpecificCharacteristics> getMeasurementSpecificCharacteristics() {
        if (measurementSpecificCharacteristics == null) {
            measurementSpecificCharacteristics = new ArrayList<MeasurementSiteRecord.MeasurementSpecificCharacteristics>();
        }
        return this.measurementSpecificCharacteristics;
    }

    public boolean isSetMeasurementSpecificCharacteristics() {
        return ((this.measurementSpecificCharacteristics!= null)&&(!this.measurementSpecificCharacteristics.isEmpty()));
    }

    public void unsetMeasurementSpecificCharacteristics() {
        this.measurementSpecificCharacteristics = null;
    }

    /**
     * Obtient la valeur de la propriété measurementSiteLocation.
     * 
     * @return
     *     possible object is
     *     {@link Location }
     *     
     */
    public Location getMeasurementSiteLocation() {
        return measurementSiteLocation;
    }

    /**
     * Définit la valeur de la propriété measurementSiteLocation.
     * 
     * @param value
     *     allowed object is
     *     {@link Location }
     *     
     */
    public void setMeasurementSiteLocation(Location value) {
        this.measurementSiteLocation = value;
    }

    public boolean isSetMeasurementSiteLocation() {
        return (this.measurementSiteLocation!= null);
    }

    /**
     * Obtient la valeur de la propriété measurementSiteRecordExtension.
     * 
     * @return
     *     possible object is
     *     {@link ExtensionType }
     *     
     */
    public ExtensionType getMeasurementSiteRecordExtension() {
        return measurementSiteRecordExtension;
    }

    /**
     * Définit la valeur de la propriété measurementSiteRecordExtension.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtensionType }
     *     
     */
    public void setMeasurementSiteRecordExtension(ExtensionType value) {
        this.measurementSiteRecordExtension = value;
    }

    public boolean isSetMeasurementSiteRecordExtension() {
        return (this.measurementSiteRecordExtension!= null);
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


    /**
     * <p>Classe Java pour anonymous complex type.
     * 
     * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;extension base="{http://datex2.eu/schema/2_0RC1/2_0}MeasurementSpecificCharacteristics">
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
    public static class MeasurementSpecificCharacteristics
        extends eu.datex2.schema._2_0rc1._2_0.MeasurementSpecificCharacteristics
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
