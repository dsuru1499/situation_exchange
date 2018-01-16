
package eu.datex2.schema._2_0rc1._2_0;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour RoadsideAssistance complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="RoadsideAssistance">
 *   &lt;complexContent>
 *     &lt;extension base="{http://datex2.eu/schema/2_0RC1/2_0}OperatorAction">
 *       &lt;sequence>
 *         &lt;element name="roadsideAssistanceType" type="{http://datex2.eu/schema/2_0RC1/2_0}RoadsideAssistanceTypeEnum"/>
 *         &lt;element name="roadsideAssistanceExtension" type="{http://datex2.eu/schema/2_0RC1/2_0}ExtensionType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RoadsideAssistance", propOrder = {
    "roadsideAssistanceType",
    "roadsideAssistanceExtension"
})
public class RoadsideAssistance
    extends OperatorAction
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(required = true)
    protected RoadsideAssistanceTypeEnum roadsideAssistanceType;
    protected ExtensionType roadsideAssistanceExtension;

    /**
     * Obtient la valeur de la propriété roadsideAssistanceType.
     * 
     * @return
     *     possible object is
     *     {@link RoadsideAssistanceTypeEnum }
     *     
     */
    public RoadsideAssistanceTypeEnum getRoadsideAssistanceType() {
        return roadsideAssistanceType;
    }

    /**
     * Définit la valeur de la propriété roadsideAssistanceType.
     * 
     * @param value
     *     allowed object is
     *     {@link RoadsideAssistanceTypeEnum }
     *     
     */
    public void setRoadsideAssistanceType(RoadsideAssistanceTypeEnum value) {
        this.roadsideAssistanceType = value;
    }

    public boolean isSetRoadsideAssistanceType() {
        return (this.roadsideAssistanceType!= null);
    }

    /**
     * Obtient la valeur de la propriété roadsideAssistanceExtension.
     * 
     * @return
     *     possible object is
     *     {@link ExtensionType }
     *     
     */
    public ExtensionType getRoadsideAssistanceExtension() {
        return roadsideAssistanceExtension;
    }

    /**
     * Définit la valeur de la propriété roadsideAssistanceExtension.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtensionType }
     *     
     */
    public void setRoadsideAssistanceExtension(ExtensionType value) {
        this.roadsideAssistanceExtension = value;
    }

    public boolean isSetRoadsideAssistanceExtension() {
        return (this.roadsideAssistanceExtension!= null);
    }

}
