
package uk.org.ifopt.ifopt;

import java.io.Serializable;
import java.math.BigDecimal;
import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import uk.org.siri.siri.CoordinatesStructure;


/**
 * Type for geospatial Position of a point. May be expressed in concrete WGS 84 Coordinates or any GML compatible point coordinates format.  
 * 
 * <p>Classe Java pour PointProjectionStructure complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="PointProjectionStructure">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.ifopt.org.uk/ifopt}AbstractProjection">
 *       &lt;sequence>
 *         &lt;group ref="{http://www.ifopt.org.uk/ifopt}Wgs84Group" minOccurs="0"/>
 *         &lt;element name="Coordinates" type="{http://www.siri.org.uk/siri}CoordinatesStructure" minOccurs="0"/>
 *         &lt;element name="Precision" type="{http://www.siri.org.uk/siri}DistanceType" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="id" type="{http://www.w3.org/2001/XMLSchema}NMTOKEN" />
 *       &lt;attribute name="srsName" type="{http://www.siri.org.uk/siri}SrsNameType" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PointProjectionStructure", propOrder = {
    "longitude",
    "latitude",
    "altitude",
    "coordinates",
    "precision"
})
public class PointProjectionStructure
    extends AbstractProjection
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "Longitude")
    protected BigDecimal longitude;
    @XmlElement(name = "Latitude")
    protected BigDecimal latitude;
    @XmlElement(name = "Altitude")
    protected BigDecimal altitude;
    @XmlElement(name = "Coordinates")
    protected CoordinatesStructure coordinates;
    @XmlElement(name = "Precision")
    protected BigInteger precision;
    @XmlAttribute(name = "id")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NMTOKEN")
    protected String id;
    @XmlAttribute(name = "srsName")
    protected String srsName;

    /**
     * Obtient la valeur de la propriété longitude.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getLongitude() {
        return longitude;
    }

    /**
     * Définit la valeur de la propriété longitude.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setLongitude(BigDecimal value) {
        this.longitude = value;
    }

    public boolean isSetLongitude() {
        return (this.longitude!= null);
    }

    /**
     * Obtient la valeur de la propriété latitude.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getLatitude() {
        return latitude;
    }

    /**
     * Définit la valeur de la propriété latitude.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setLatitude(BigDecimal value) {
        this.latitude = value;
    }

    public boolean isSetLatitude() {
        return (this.latitude!= null);
    }

    /**
     * Obtient la valeur de la propriété altitude.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getAltitude() {
        return altitude;
    }

    /**
     * Définit la valeur de la propriété altitude.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setAltitude(BigDecimal value) {
        this.altitude = value;
    }

    public boolean isSetAltitude() {
        return (this.altitude!= null);
    }

    /**
     * Obtient la valeur de la propriété coordinates.
     * 
     * @return
     *     possible object is
     *     {@link CoordinatesStructure }
     *     
     */
    public CoordinatesStructure getCoordinates() {
        return coordinates;
    }

    /**
     * Définit la valeur de la propriété coordinates.
     * 
     * @param value
     *     allowed object is
     *     {@link CoordinatesStructure }
     *     
     */
    public void setCoordinates(CoordinatesStructure value) {
        this.coordinates = value;
    }

    public boolean isSetCoordinates() {
        return (this.coordinates!= null);
    }

    /**
     * Obtient la valeur de la propriété precision.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getPrecision() {
        return precision;
    }

    /**
     * Définit la valeur de la propriété precision.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setPrecision(BigInteger value) {
        this.precision = value;
    }

    public boolean isSetPrecision() {
        return (this.precision!= null);
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
     * Obtient la valeur de la propriété srsName.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSrsName() {
        return srsName;
    }

    /**
     * Définit la valeur de la propriété srsName.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSrsName(String value) {
        this.srsName = value;
    }

    public boolean isSetSrsName() {
        return (this.srsName!= null);
    }

}
