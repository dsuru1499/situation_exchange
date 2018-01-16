
package eu.datex2.schema._2_0rc1._2_0;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour VisibilityInformation complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="VisibilityInformation">
 *   &lt;complexContent>
 *     &lt;extension base="{http://datex2.eu/schema/2_0RC1/2_0}WeatherValue">
 *       &lt;sequence>
 *         &lt;element name="visibility" type="{http://datex2.eu/schema/2_0RC1/2_0}Visibility"/>
 *         &lt;element name="visibilityInformationExtension" type="{http://datex2.eu/schema/2_0RC1/2_0}ExtensionType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VisibilityInformation", propOrder = {
    "visibility",
    "visibilityInformationExtension"
})
public class VisibilityInformation
    extends WeatherValue
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(required = true)
    protected Visibility visibility;
    protected ExtensionType visibilityInformationExtension;

    /**
     * Obtient la valeur de la propriété visibility.
     * 
     * @return
     *     possible object is
     *     {@link Visibility }
     *     
     */
    public Visibility getVisibility() {
        return visibility;
    }

    /**
     * Définit la valeur de la propriété visibility.
     * 
     * @param value
     *     allowed object is
     *     {@link Visibility }
     *     
     */
    public void setVisibility(Visibility value) {
        this.visibility = value;
    }

    public boolean isSetVisibility() {
        return (this.visibility!= null);
    }

    /**
     * Obtient la valeur de la propriété visibilityInformationExtension.
     * 
     * @return
     *     possible object is
     *     {@link ExtensionType }
     *     
     */
    public ExtensionType getVisibilityInformationExtension() {
        return visibilityInformationExtension;
    }

    /**
     * Définit la valeur de la propriété visibilityInformationExtension.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtensionType }
     *     
     */
    public void setVisibilityInformationExtension(ExtensionType value) {
        this.visibilityInformationExtension = value;
    }

    public boolean isSetVisibilityInformationExtension() {
        return (this.visibilityInformationExtension!= null);
    }

}
