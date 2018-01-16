
package eu.datex2.schema._2_0rc1._2_0;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour NetworkLocation complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="NetworkLocation">
 *   &lt;complexContent>
 *     &lt;extension base="{http://datex2.eu/schema/2_0RC1/2_0}Location">
 *       &lt;sequence>
 *         &lt;element name="supplementaryPositionalDescription" type="{http://datex2.eu/schema/2_0RC1/2_0}SupplementaryPositionalDescription" minOccurs="0"/>
 *         &lt;element name="destination" type="{http://datex2.eu/schema/2_0RC1/2_0}Destination" minOccurs="0"/>
 *         &lt;element name="networkLocationExtension" type="{http://datex2.eu/schema/2_0RC1/2_0}ExtensionType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NetworkLocation", propOrder = {
    "supplementaryPositionalDescription",
    "destination",
    "networkLocationExtension"
})
@XmlSeeAlso({
    Linear.class,
    Point.class
})
public abstract class NetworkLocation
    extends Location
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    protected SupplementaryPositionalDescription supplementaryPositionalDescription;
    protected Destination destination;
    protected ExtensionType networkLocationExtension;

    /**
     * Obtient la valeur de la propriété supplementaryPositionalDescription.
     * 
     * @return
     *     possible object is
     *     {@link SupplementaryPositionalDescription }
     *     
     */
    public SupplementaryPositionalDescription getSupplementaryPositionalDescription() {
        return supplementaryPositionalDescription;
    }

    /**
     * Définit la valeur de la propriété supplementaryPositionalDescription.
     * 
     * @param value
     *     allowed object is
     *     {@link SupplementaryPositionalDescription }
     *     
     */
    public void setSupplementaryPositionalDescription(SupplementaryPositionalDescription value) {
        this.supplementaryPositionalDescription = value;
    }

    public boolean isSetSupplementaryPositionalDescription() {
        return (this.supplementaryPositionalDescription!= null);
    }

    /**
     * Obtient la valeur de la propriété destination.
     * 
     * @return
     *     possible object is
     *     {@link Destination }
     *     
     */
    public Destination getDestination() {
        return destination;
    }

    /**
     * Définit la valeur de la propriété destination.
     * 
     * @param value
     *     allowed object is
     *     {@link Destination }
     *     
     */
    public void setDestination(Destination value) {
        this.destination = value;
    }

    public boolean isSetDestination() {
        return (this.destination!= null);
    }

    /**
     * Obtient la valeur de la propriété networkLocationExtension.
     * 
     * @return
     *     possible object is
     *     {@link ExtensionType }
     *     
     */
    public ExtensionType getNetworkLocationExtension() {
        return networkLocationExtension;
    }

    /**
     * Définit la valeur de la propriété networkLocationExtension.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtensionType }
     *     
     */
    public void setNetworkLocationExtension(ExtensionType value) {
        this.networkLocationExtension = value;
    }

    public boolean isSetNetworkLocationExtension() {
        return (this.networkLocationExtension!= null);
    }

}
