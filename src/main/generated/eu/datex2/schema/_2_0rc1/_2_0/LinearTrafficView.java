
package eu.datex2.schema._2_0rc1._2_0;

import java.io.Serializable;
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
 * <p>Classe Java pour LinearTrafficView complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="LinearTrafficView">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="linearPredefinedLocationReference" type="{http://datex2.eu/schema/2_0RC1/2_0}Reference"/>
 *         &lt;element name="trafficViewRecord" type="{http://datex2.eu/schema/2_0RC1/2_0}TrafficViewRecord" maxOccurs="unbounded"/>
 *         &lt;element name="linearTrafficViewExtension" type="{http://datex2.eu/schema/2_0RC1/2_0}ExtensionType" minOccurs="0"/>
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
@XmlType(name = "LinearTrafficView", propOrder = {
    "linearPredefinedLocationReference",
    "trafficViewRecord",
    "linearTrafficViewExtension"
})
public class LinearTrafficView
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(required = true)
    protected String linearPredefinedLocationReference;
    @XmlElement(required = true)
    protected List<TrafficViewRecord> trafficViewRecord;
    protected ExtensionType linearTrafficViewExtension;
    @XmlAttribute(name = "id", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlID
    @XmlSchemaType(name = "ID")
    protected String id;

    /**
     * Obtient la valeur de la propriété linearPredefinedLocationReference.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLinearPredefinedLocationReference() {
        return linearPredefinedLocationReference;
    }

    /**
     * Définit la valeur de la propriété linearPredefinedLocationReference.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLinearPredefinedLocationReference(String value) {
        this.linearPredefinedLocationReference = value;
    }

    public boolean isSetLinearPredefinedLocationReference() {
        return (this.linearPredefinedLocationReference!= null);
    }

    /**
     * Gets the value of the trafficViewRecord property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the trafficViewRecord property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTrafficViewRecord().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TrafficViewRecord }
     * 
     * 
     */
    public List<TrafficViewRecord> getTrafficViewRecord() {
        if (trafficViewRecord == null) {
            trafficViewRecord = new ArrayList<TrafficViewRecord>();
        }
        return this.trafficViewRecord;
    }

    public boolean isSetTrafficViewRecord() {
        return ((this.trafficViewRecord!= null)&&(!this.trafficViewRecord.isEmpty()));
    }

    public void unsetTrafficViewRecord() {
        this.trafficViewRecord = null;
    }

    /**
     * Obtient la valeur de la propriété linearTrafficViewExtension.
     * 
     * @return
     *     possible object is
     *     {@link ExtensionType }
     *     
     */
    public ExtensionType getLinearTrafficViewExtension() {
        return linearTrafficViewExtension;
    }

    /**
     * Définit la valeur de la propriété linearTrafficViewExtension.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtensionType }
     *     
     */
    public void setLinearTrafficViewExtension(ExtensionType value) {
        this.linearTrafficViewExtension = value;
    }

    public boolean isSetLinearTrafficViewExtension() {
        return (this.linearTrafficViewExtension!= null);
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
