
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
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Classe Java pour TrafficView complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="TrafficView">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="trafficViewTime" type="{http://datex2.eu/schema/2_0RC1/2_0}DateTime"/>
 *         &lt;element name="predefinedLocationSetReference" type="{http://datex2.eu/schema/2_0RC1/2_0}Reference"/>
 *         &lt;element name="linearTrafficView" type="{http://datex2.eu/schema/2_0RC1/2_0}LinearTrafficView" maxOccurs="unbounded"/>
 *         &lt;element name="trafficViewExtension" type="{http://datex2.eu/schema/2_0RC1/2_0}ExtensionType" minOccurs="0"/>
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
@XmlType(name = "TrafficView", propOrder = {
    "trafficViewTime",
    "predefinedLocationSetReference",
    "linearTrafficView",
    "trafficViewExtension"
})
public class TrafficView
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(required = true)
    protected XMLGregorianCalendar trafficViewTime;
    @XmlElement(required = true)
    protected String predefinedLocationSetReference;
    @XmlElement(required = true)
    protected List<LinearTrafficView> linearTrafficView;
    protected ExtensionType trafficViewExtension;
    @XmlAttribute(name = "id", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlID
    @XmlSchemaType(name = "ID")
    protected String id;

    /**
     * Obtient la valeur de la propriété trafficViewTime.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getTrafficViewTime() {
        return trafficViewTime;
    }

    /**
     * Définit la valeur de la propriété trafficViewTime.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setTrafficViewTime(XMLGregorianCalendar value) {
        this.trafficViewTime = value;
    }

    public boolean isSetTrafficViewTime() {
        return (this.trafficViewTime!= null);
    }

    /**
     * Obtient la valeur de la propriété predefinedLocationSetReference.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPredefinedLocationSetReference() {
        return predefinedLocationSetReference;
    }

    /**
     * Définit la valeur de la propriété predefinedLocationSetReference.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPredefinedLocationSetReference(String value) {
        this.predefinedLocationSetReference = value;
    }

    public boolean isSetPredefinedLocationSetReference() {
        return (this.predefinedLocationSetReference!= null);
    }

    /**
     * Gets the value of the linearTrafficView property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the linearTrafficView property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLinearTrafficView().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LinearTrafficView }
     * 
     * 
     */
    public List<LinearTrafficView> getLinearTrafficView() {
        if (linearTrafficView == null) {
            linearTrafficView = new ArrayList<LinearTrafficView>();
        }
        return this.linearTrafficView;
    }

    public boolean isSetLinearTrafficView() {
        return ((this.linearTrafficView!= null)&&(!this.linearTrafficView.isEmpty()));
    }

    public void unsetLinearTrafficView() {
        this.linearTrafficView = null;
    }

    /**
     * Obtient la valeur de la propriété trafficViewExtension.
     * 
     * @return
     *     possible object is
     *     {@link ExtensionType }
     *     
     */
    public ExtensionType getTrafficViewExtension() {
        return trafficViewExtension;
    }

    /**
     * Définit la valeur de la propriété trafficViewExtension.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtensionType }
     *     
     */
    public void setTrafficViewExtension(ExtensionType value) {
        this.trafficViewExtension = value;
    }

    public boolean isSetTrafficViewExtension() {
        return (this.trafficViewExtension!= null);
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
