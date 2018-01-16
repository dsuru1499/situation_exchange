
package eu.datex2.schema._2_0rc1._2_0;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour RoadsideReferencePointLinear complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="RoadsideReferencePointLinear">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="roadsideReferencePointPrimaryLocation" type="{http://datex2.eu/schema/2_0RC1/2_0}RoadsideReferencePointPrimaryLocation"/>
 *         &lt;element name="roadsideReferencePointSecondaryLocation" type="{http://datex2.eu/schema/2_0RC1/2_0}RoadsideReferencePointSecondaryLocation"/>
 *         &lt;element name="roadsideReferencePointLinearExtension" type="{http://datex2.eu/schema/2_0RC1/2_0}ExtensionType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RoadsideReferencePointLinear", propOrder = {
    "roadsideReferencePointPrimaryLocation",
    "roadsideReferencePointSecondaryLocation",
    "roadsideReferencePointLinearExtension"
})
public class RoadsideReferencePointLinear
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(required = true)
    protected RoadsideReferencePointPrimaryLocation roadsideReferencePointPrimaryLocation;
    @XmlElement(required = true)
    protected RoadsideReferencePointSecondaryLocation roadsideReferencePointSecondaryLocation;
    protected ExtensionType roadsideReferencePointLinearExtension;

    /**
     * Obtient la valeur de la propriété roadsideReferencePointPrimaryLocation.
     * 
     * @return
     *     possible object is
     *     {@link RoadsideReferencePointPrimaryLocation }
     *     
     */
    public RoadsideReferencePointPrimaryLocation getRoadsideReferencePointPrimaryLocation() {
        return roadsideReferencePointPrimaryLocation;
    }

    /**
     * Définit la valeur de la propriété roadsideReferencePointPrimaryLocation.
     * 
     * @param value
     *     allowed object is
     *     {@link RoadsideReferencePointPrimaryLocation }
     *     
     */
    public void setRoadsideReferencePointPrimaryLocation(RoadsideReferencePointPrimaryLocation value) {
        this.roadsideReferencePointPrimaryLocation = value;
    }

    public boolean isSetRoadsideReferencePointPrimaryLocation() {
        return (this.roadsideReferencePointPrimaryLocation!= null);
    }

    /**
     * Obtient la valeur de la propriété roadsideReferencePointSecondaryLocation.
     * 
     * @return
     *     possible object is
     *     {@link RoadsideReferencePointSecondaryLocation }
     *     
     */
    public RoadsideReferencePointSecondaryLocation getRoadsideReferencePointSecondaryLocation() {
        return roadsideReferencePointSecondaryLocation;
    }

    /**
     * Définit la valeur de la propriété roadsideReferencePointSecondaryLocation.
     * 
     * @param value
     *     allowed object is
     *     {@link RoadsideReferencePointSecondaryLocation }
     *     
     */
    public void setRoadsideReferencePointSecondaryLocation(RoadsideReferencePointSecondaryLocation value) {
        this.roadsideReferencePointSecondaryLocation = value;
    }

    public boolean isSetRoadsideReferencePointSecondaryLocation() {
        return (this.roadsideReferencePointSecondaryLocation!= null);
    }

    /**
     * Obtient la valeur de la propriété roadsideReferencePointLinearExtension.
     * 
     * @return
     *     possible object is
     *     {@link ExtensionType }
     *     
     */
    public ExtensionType getRoadsideReferencePointLinearExtension() {
        return roadsideReferencePointLinearExtension;
    }

    /**
     * Définit la valeur de la propriété roadsideReferencePointLinearExtension.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtensionType }
     *     
     */
    public void setRoadsideReferencePointLinearExtension(ExtensionType value) {
        this.roadsideReferencePointLinearExtension = value;
    }

    public boolean isSetRoadsideReferencePointLinearExtension() {
        return (this.roadsideReferencePointLinearExtension!= null);
    }

}
