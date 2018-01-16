
package eu.datex2.schema._2_0rc1._2_0;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour GenericPublication complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="GenericPublication">
 *   &lt;complexContent>
 *     &lt;extension base="{http://datex2.eu/schema/2_0RC1/2_0}PayloadPublication">
 *       &lt;sequence>
 *         &lt;element name="genericPublicationName" type="{http://datex2.eu/schema/2_0RC1/2_0}String"/>
 *         &lt;element name="genericPublicationExtension" type="{http://datex2.eu/schema/2_0RC1/2_0}ExtensionType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GenericPublication", propOrder = {
    "genericPublicationName",
    "genericPublicationExtension"
})
public class GenericPublication
    extends PayloadPublication
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(required = true)
    protected String genericPublicationName;
    protected ExtensionType genericPublicationExtension;

    /**
     * Obtient la valeur de la propriété genericPublicationName.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGenericPublicationName() {
        return genericPublicationName;
    }

    /**
     * Définit la valeur de la propriété genericPublicationName.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGenericPublicationName(String value) {
        this.genericPublicationName = value;
    }

    public boolean isSetGenericPublicationName() {
        return (this.genericPublicationName!= null);
    }

    /**
     * Obtient la valeur de la propriété genericPublicationExtension.
     * 
     * @return
     *     possible object is
     *     {@link ExtensionType }
     *     
     */
    public ExtensionType getGenericPublicationExtension() {
        return genericPublicationExtension;
    }

    /**
     * Définit la valeur de la propriété genericPublicationExtension.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtensionType }
     *     
     */
    public void setGenericPublicationExtension(ExtensionType value) {
        this.genericPublicationExtension = value;
    }

    public boolean isSetGenericPublicationExtension() {
        return (this.genericPublicationExtension!= null);
    }

}
