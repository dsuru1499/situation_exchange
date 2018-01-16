
package eu.datex2.schema._2_0rc1._2_0;

import java.io.Serializable;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour SupplementaryPositionalDescription complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="SupplementaryPositionalDescription">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="carriageway" type="{http://datex2.eu/schema/2_0RC1/2_0}CarriagewayEnum" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="footpath" type="{http://datex2.eu/schema/2_0RC1/2_0}Boolean" minOccurs="0"/>
 *         &lt;element name="lane" type="{http://datex2.eu/schema/2_0RC1/2_0}LaneEnum" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="lengthAffected" type="{http://datex2.eu/schema/2_0RC1/2_0}MetresAsFloat" minOccurs="0"/>
 *         &lt;element name="locationDescriptor" type="{http://datex2.eu/schema/2_0RC1/2_0}LocationDescriptorEnum" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="locationPrecision" type="{http://datex2.eu/schema/2_0RC1/2_0}MetresAsNonNegativeInteger" minOccurs="0"/>
 *         &lt;element name="sequentialRampNumber" type="{http://datex2.eu/schema/2_0RC1/2_0}NonNegativeInteger" minOccurs="0"/>
 *         &lt;element name="supplementaryPositionalDescriptionExtension" type="{http://datex2.eu/schema/2_0RC1/2_0}ExtensionType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SupplementaryPositionalDescription", propOrder = {
    "carriageway",
    "footpath",
    "lane",
    "lengthAffected",
    "locationDescriptor",
    "locationPrecision",
    "sequentialRampNumber",
    "supplementaryPositionalDescriptionExtension"
})
public class SupplementaryPositionalDescription
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    protected List<CarriagewayEnum> carriageway;
    protected Boolean footpath;
    protected List<LaneEnum> lane;
    protected Float lengthAffected;
    protected List<LocationDescriptorEnum> locationDescriptor;
    protected BigInteger locationPrecision;
    protected BigInteger sequentialRampNumber;
    protected ExtensionType supplementaryPositionalDescriptionExtension;

    /**
     * Gets the value of the carriageway property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the carriageway property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCarriageway().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CarriagewayEnum }
     * 
     * 
     */
    public List<CarriagewayEnum> getCarriageway() {
        if (carriageway == null) {
            carriageway = new ArrayList<CarriagewayEnum>();
        }
        return this.carriageway;
    }

    public boolean isSetCarriageway() {
        return ((this.carriageway!= null)&&(!this.carriageway.isEmpty()));
    }

    public void unsetCarriageway() {
        this.carriageway = null;
    }

    /**
     * Obtient la valeur de la propriété footpath.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isFootpath() {
        return footpath;
    }

    /**
     * Définit la valeur de la propriété footpath.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setFootpath(Boolean value) {
        this.footpath = value;
    }

    public boolean isSetFootpath() {
        return (this.footpath!= null);
    }

    /**
     * Gets the value of the lane property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the lane property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLane().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LaneEnum }
     * 
     * 
     */
    public List<LaneEnum> getLane() {
        if (lane == null) {
            lane = new ArrayList<LaneEnum>();
        }
        return this.lane;
    }

    public boolean isSetLane() {
        return ((this.lane!= null)&&(!this.lane.isEmpty()));
    }

    public void unsetLane() {
        this.lane = null;
    }

    /**
     * Obtient la valeur de la propriété lengthAffected.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getLengthAffected() {
        return lengthAffected;
    }

    /**
     * Définit la valeur de la propriété lengthAffected.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setLengthAffected(Float value) {
        this.lengthAffected = value;
    }

    public boolean isSetLengthAffected() {
        return (this.lengthAffected!= null);
    }

    /**
     * Gets the value of the locationDescriptor property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the locationDescriptor property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLocationDescriptor().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LocationDescriptorEnum }
     * 
     * 
     */
    public List<LocationDescriptorEnum> getLocationDescriptor() {
        if (locationDescriptor == null) {
            locationDescriptor = new ArrayList<LocationDescriptorEnum>();
        }
        return this.locationDescriptor;
    }

    public boolean isSetLocationDescriptor() {
        return ((this.locationDescriptor!= null)&&(!this.locationDescriptor.isEmpty()));
    }

    public void unsetLocationDescriptor() {
        this.locationDescriptor = null;
    }

    /**
     * Obtient la valeur de la propriété locationPrecision.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getLocationPrecision() {
        return locationPrecision;
    }

    /**
     * Définit la valeur de la propriété locationPrecision.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setLocationPrecision(BigInteger value) {
        this.locationPrecision = value;
    }

    public boolean isSetLocationPrecision() {
        return (this.locationPrecision!= null);
    }

    /**
     * Obtient la valeur de la propriété sequentialRampNumber.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getSequentialRampNumber() {
        return sequentialRampNumber;
    }

    /**
     * Définit la valeur de la propriété sequentialRampNumber.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setSequentialRampNumber(BigInteger value) {
        this.sequentialRampNumber = value;
    }

    public boolean isSetSequentialRampNumber() {
        return (this.sequentialRampNumber!= null);
    }

    /**
     * Obtient la valeur de la propriété supplementaryPositionalDescriptionExtension.
     * 
     * @return
     *     possible object is
     *     {@link ExtensionType }
     *     
     */
    public ExtensionType getSupplementaryPositionalDescriptionExtension() {
        return supplementaryPositionalDescriptionExtension;
    }

    /**
     * Définit la valeur de la propriété supplementaryPositionalDescriptionExtension.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtensionType }
     *     
     */
    public void setSupplementaryPositionalDescriptionExtension(ExtensionType value) {
        this.supplementaryPositionalDescriptionExtension = value;
    }

    public boolean isSetSupplementaryPositionalDescriptionExtension() {
        return (this.supplementaryPositionalDescriptionExtension!= null);
    }

}
