
package eu.datex2.schema._2_0rc1._2_0;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour Mobility complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="Mobility">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="mobilityType" type="{http://datex2.eu/schema/2_0RC1/2_0}MobilityEnum"/>
 *         &lt;element name="mobilityExtension" type="{http://datex2.eu/schema/2_0RC1/2_0}ExtensionType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Mobility", propOrder = {
    "mobilityType",
    "mobilityExtension"
})
public class Mobility
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(required = true)
    protected MobilityEnum mobilityType;
    protected ExtensionType mobilityExtension;

    /**
     * Obtient la valeur de la propriété mobilityType.
     * 
     * @return
     *     possible object is
     *     {@link MobilityEnum }
     *     
     */
    public MobilityEnum getMobilityType() {
        return mobilityType;
    }

    /**
     * Définit la valeur de la propriété mobilityType.
     * 
     * @param value
     *     allowed object is
     *     {@link MobilityEnum }
     *     
     */
    public void setMobilityType(MobilityEnum value) {
        this.mobilityType = value;
    }

    public boolean isSetMobilityType() {
        return (this.mobilityType!= null);
    }

    /**
     * Obtient la valeur de la propriété mobilityExtension.
     * 
     * @return
     *     possible object is
     *     {@link ExtensionType }
     *     
     */
    public ExtensionType getMobilityExtension() {
        return mobilityExtension;
    }

    /**
     * Définit la valeur de la propriété mobilityExtension.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtensionType }
     *     
     */
    public void setMobilityExtension(ExtensionType value) {
        this.mobilityExtension = value;
    }

    public boolean isSetMobilityExtension() {
        return (this.mobilityExtension!= null);
    }

}
