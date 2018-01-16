
package eu.datex2.schema._2_0rc1._2_0;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour TpegJunction complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="TpegJunction">
 *   &lt;complexContent>
 *     &lt;extension base="{http://datex2.eu/schema/2_0RC1/2_0}TpegPoint">
 *       &lt;sequence>
 *         &lt;element name="pointCoordinates" type="{http://datex2.eu/schema/2_0RC1/2_0}PointCoordinates"/>
 *         &lt;element name="name" type="{http://datex2.eu/schema/2_0RC1/2_0}TpegJunctionPointDescriptor" minOccurs="0"/>
 *         &lt;element name="ilc" type="{http://datex2.eu/schema/2_0RC1/2_0}TpegIlcPointDescriptor" maxOccurs="3"/>
 *         &lt;element name="otherName" type="{http://datex2.eu/schema/2_0RC1/2_0}TpegOtherPointDescriptor" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="tpegJunctionExtension" type="{http://datex2.eu/schema/2_0RC1/2_0}ExtensionType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TpegJunction", propOrder = {
    "pointCoordinates",
    "name",
    "ilc",
    "otherName",
    "tpegJunctionExtension"
})
public class TpegJunction
    extends TpegPoint
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(required = true)
    protected PointCoordinates pointCoordinates;
    protected TpegJunctionPointDescriptor name;
    @XmlElement(required = true)
    protected List<TpegIlcPointDescriptor> ilc;
    protected List<TpegOtherPointDescriptor> otherName;
    protected ExtensionType tpegJunctionExtension;

    /**
     * Obtient la valeur de la propriété pointCoordinates.
     * 
     * @return
     *     possible object is
     *     {@link PointCoordinates }
     *     
     */
    public PointCoordinates getPointCoordinates() {
        return pointCoordinates;
    }

    /**
     * Définit la valeur de la propriété pointCoordinates.
     * 
     * @param value
     *     allowed object is
     *     {@link PointCoordinates }
     *     
     */
    public void setPointCoordinates(PointCoordinates value) {
        this.pointCoordinates = value;
    }

    public boolean isSetPointCoordinates() {
        return (this.pointCoordinates!= null);
    }

    /**
     * Obtient la valeur de la propriété name.
     * 
     * @return
     *     possible object is
     *     {@link TpegJunctionPointDescriptor }
     *     
     */
    public TpegJunctionPointDescriptor getName() {
        return name;
    }

    /**
     * Définit la valeur de la propriété name.
     * 
     * @param value
     *     allowed object is
     *     {@link TpegJunctionPointDescriptor }
     *     
     */
    public void setName(TpegJunctionPointDescriptor value) {
        this.name = value;
    }

    public boolean isSetName() {
        return (this.name!= null);
    }

    /**
     * Gets the value of the ilc property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the ilc property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getIlc().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TpegIlcPointDescriptor }
     * 
     * 
     */
    public List<TpegIlcPointDescriptor> getIlc() {
        if (ilc == null) {
            ilc = new ArrayList<TpegIlcPointDescriptor>();
        }
        return this.ilc;
    }

    public boolean isSetIlc() {
        return ((this.ilc!= null)&&(!this.ilc.isEmpty()));
    }

    public void unsetIlc() {
        this.ilc = null;
    }

    /**
     * Gets the value of the otherName property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the otherName property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOtherName().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TpegOtherPointDescriptor }
     * 
     * 
     */
    public List<TpegOtherPointDescriptor> getOtherName() {
        if (otherName == null) {
            otherName = new ArrayList<TpegOtherPointDescriptor>();
        }
        return this.otherName;
    }

    public boolean isSetOtherName() {
        return ((this.otherName!= null)&&(!this.otherName.isEmpty()));
    }

    public void unsetOtherName() {
        this.otherName = null;
    }

    /**
     * Obtient la valeur de la propriété tpegJunctionExtension.
     * 
     * @return
     *     possible object is
     *     {@link ExtensionType }
     *     
     */
    public ExtensionType getTpegJunctionExtension() {
        return tpegJunctionExtension;
    }

    /**
     * Définit la valeur de la propriété tpegJunctionExtension.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtensionType }
     *     
     */
    public void setTpegJunctionExtension(ExtensionType value) {
        this.tpegJunctionExtension = value;
    }

    public boolean isSetTpegJunctionExtension() {
        return (this.tpegJunctionExtension!= null);
    }

}
