
package eu.datex2.schema._2_0rc1._2_0;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour Point complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="Point">
 *   &lt;complexContent>
 *     &lt;extension base="{http://datex2.eu/schema/2_0RC1/2_0}NetworkLocation">
 *       &lt;sequence>
 *         &lt;element name="tpegPointLocation" type="{http://datex2.eu/schema/2_0RC1/2_0}TpegPointLocation" minOccurs="0"/>
 *         &lt;element name="alertCPoint" type="{http://datex2.eu/schema/2_0RC1/2_0}AlertCPoint" minOccurs="0"/>
 *         &lt;element name="roadsideReferencePoint" type="{http://datex2.eu/schema/2_0RC1/2_0}RoadsideReferencePoint" minOccurs="0"/>
 *         &lt;element name="pointByCoordinates" type="{http://datex2.eu/schema/2_0RC1/2_0}PointByCoordinates" minOccurs="0"/>
 *         &lt;element name="pointExtension" type="{http://datex2.eu/schema/2_0RC1/2_0}ExtensionType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Point", propOrder = {
    "tpegPointLocation",
    "alertCPoint",
    "roadsideReferencePoint",
    "pointByCoordinates",
    "pointExtension"
})
public class Point
    extends NetworkLocation
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    protected TpegPointLocation tpegPointLocation;
    protected AlertCPoint alertCPoint;
    protected RoadsideReferencePoint roadsideReferencePoint;
    protected PointByCoordinates pointByCoordinates;
    protected ExtensionType pointExtension;

    /**
     * Obtient la valeur de la propriété tpegPointLocation.
     * 
     * @return
     *     possible object is
     *     {@link TpegPointLocation }
     *     
     */
    public TpegPointLocation getTpegPointLocation() {
        return tpegPointLocation;
    }

    /**
     * Définit la valeur de la propriété tpegPointLocation.
     * 
     * @param value
     *     allowed object is
     *     {@link TpegPointLocation }
     *     
     */
    public void setTpegPointLocation(TpegPointLocation value) {
        this.tpegPointLocation = value;
    }

    public boolean isSetTpegPointLocation() {
        return (this.tpegPointLocation!= null);
    }

    /**
     * Obtient la valeur de la propriété alertCPoint.
     * 
     * @return
     *     possible object is
     *     {@link AlertCPoint }
     *     
     */
    public AlertCPoint getAlertCPoint() {
        return alertCPoint;
    }

    /**
     * Définit la valeur de la propriété alertCPoint.
     * 
     * @param value
     *     allowed object is
     *     {@link AlertCPoint }
     *     
     */
    public void setAlertCPoint(AlertCPoint value) {
        this.alertCPoint = value;
    }

    public boolean isSetAlertCPoint() {
        return (this.alertCPoint!= null);
    }

    /**
     * Obtient la valeur de la propriété roadsideReferencePoint.
     * 
     * @return
     *     possible object is
     *     {@link RoadsideReferencePoint }
     *     
     */
    public RoadsideReferencePoint getRoadsideReferencePoint() {
        return roadsideReferencePoint;
    }

    /**
     * Définit la valeur de la propriété roadsideReferencePoint.
     * 
     * @param value
     *     allowed object is
     *     {@link RoadsideReferencePoint }
     *     
     */
    public void setRoadsideReferencePoint(RoadsideReferencePoint value) {
        this.roadsideReferencePoint = value;
    }

    public boolean isSetRoadsideReferencePoint() {
        return (this.roadsideReferencePoint!= null);
    }

    /**
     * Obtient la valeur de la propriété pointByCoordinates.
     * 
     * @return
     *     possible object is
     *     {@link PointByCoordinates }
     *     
     */
    public PointByCoordinates getPointByCoordinates() {
        return pointByCoordinates;
    }

    /**
     * Définit la valeur de la propriété pointByCoordinates.
     * 
     * @param value
     *     allowed object is
     *     {@link PointByCoordinates }
     *     
     */
    public void setPointByCoordinates(PointByCoordinates value) {
        this.pointByCoordinates = value;
    }

    public boolean isSetPointByCoordinates() {
        return (this.pointByCoordinates!= null);
    }

    /**
     * Obtient la valeur de la propriété pointExtension.
     * 
     * @return
     *     possible object is
     *     {@link ExtensionType }
     *     
     */
    public ExtensionType getPointExtension() {
        return pointExtension;
    }

    /**
     * Définit la valeur de la propriété pointExtension.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtensionType }
     *     
     */
    public void setPointExtension(ExtensionType value) {
        this.pointExtension = value;
    }

    public boolean isSetPointExtension() {
        return (this.pointExtension!= null);
    }

}
