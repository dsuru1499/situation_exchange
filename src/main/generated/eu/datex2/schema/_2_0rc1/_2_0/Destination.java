
package eu.datex2.schema._2_0rc1._2_0;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour Destination complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="Destination">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="destinationExtension" type="{http://datex2.eu/schema/2_0RC1/2_0}ExtensionType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Destination", propOrder = {
    "destinationExtension"
})
@XmlSeeAlso({
    AreaDestination.class,
    PointDestination.class
})
public abstract class Destination
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    protected ExtensionType destinationExtension;

    /**
     * Obtient la valeur de la propriété destinationExtension.
     * 
     * @return
     *     possible object is
     *     {@link ExtensionType }
     *     
     */
    public ExtensionType getDestinationExtension() {
        return destinationExtension;
    }

    /**
     * Définit la valeur de la propriété destinationExtension.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtensionType }
     *     
     */
    public void setDestinationExtension(ExtensionType value) {
        this.destinationExtension = value;
    }

    public boolean isSetDestinationExtension() {
        return (this.destinationExtension!= null);
    }

}
