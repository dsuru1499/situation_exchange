
package eu.datex2.schema._2_0rc1._2_0;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour RoadsideReferencePointSecondaryLocation complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="RoadsideReferencePointSecondaryLocation">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="roadsideReferencePoint" type="{http://datex2.eu/schema/2_0RC1/2_0}RoadsideReferencePoint"/>
 *         &lt;element name="roadsideReferencePointSecondaryLocationExtension" type="{http://datex2.eu/schema/2_0RC1/2_0}ExtensionType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RoadsideReferencePointSecondaryLocation", propOrder = {
    "roadsideReferencePoint",
    "roadsideReferencePointSecondaryLocationExtension"
})
public class RoadsideReferencePointSecondaryLocation
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(required = true)
    protected RoadsideReferencePoint roadsideReferencePoint;
    protected ExtensionType roadsideReferencePointSecondaryLocationExtension;

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
     * Obtient la valeur de la propriété roadsideReferencePointSecondaryLocationExtension.
     * 
     * @return
     *     possible object is
     *     {@link ExtensionType }
     *     
     */
    public ExtensionType getRoadsideReferencePointSecondaryLocationExtension() {
        return roadsideReferencePointSecondaryLocationExtension;
    }

    /**
     * Définit la valeur de la propriété roadsideReferencePointSecondaryLocationExtension.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtensionType }
     *     
     */
    public void setRoadsideReferencePointSecondaryLocationExtension(ExtensionType value) {
        this.roadsideReferencePointSecondaryLocationExtension = value;
    }

    public boolean isSetRoadsideReferencePointSecondaryLocationExtension() {
        return (this.roadsideReferencePointSecondaryLocationExtension!= null);
    }

}
