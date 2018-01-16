
package eu.datex2.schema._2_0rc1._2_0;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour PointCoordinates complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="PointCoordinates">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="latitude" type="{http://datex2.eu/schema/2_0RC1/2_0}Float"/>
 *         &lt;element name="longitude" type="{http://datex2.eu/schema/2_0RC1/2_0}Float"/>
 *         &lt;element name="pointCoordinatesExtension" type="{http://datex2.eu/schema/2_0RC1/2_0}ExtensionType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PointCoordinates", propOrder = {
    "latitude",
    "longitude",
    "pointCoordinatesExtension"
})
public class PointCoordinates
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    protected float latitude;
    protected float longitude;
    protected ExtensionType pointCoordinatesExtension;

    /**
     * Obtient la valeur de la propriété latitude.
     * 
     */
    public float getLatitude() {
        return latitude;
    }

    /**
     * Définit la valeur de la propriété latitude.
     * 
     */
    public void setLatitude(float value) {
        this.latitude = value;
    }

    public boolean isSetLatitude() {
        return true;
    }

    /**
     * Obtient la valeur de la propriété longitude.
     * 
     */
    public float getLongitude() {
        return longitude;
    }

    /**
     * Définit la valeur de la propriété longitude.
     * 
     */
    public void setLongitude(float value) {
        this.longitude = value;
    }

    public boolean isSetLongitude() {
        return true;
    }

    /**
     * Obtient la valeur de la propriété pointCoordinatesExtension.
     * 
     * @return
     *     possible object is
     *     {@link ExtensionType }
     *     
     */
    public ExtensionType getPointCoordinatesExtension() {
        return pointCoordinatesExtension;
    }

    /**
     * Définit la valeur de la propriété pointCoordinatesExtension.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtensionType }
     *     
     */
    public void setPointCoordinatesExtension(ExtensionType value) {
        this.pointCoordinatesExtension = value;
    }

    public boolean isSetPointCoordinatesExtension() {
        return (this.pointCoordinatesExtension!= null);
    }

}
