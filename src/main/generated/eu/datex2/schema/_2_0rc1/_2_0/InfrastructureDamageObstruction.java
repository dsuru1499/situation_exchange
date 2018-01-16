
package eu.datex2.schema._2_0rc1._2_0;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour InfrastructureDamageObstruction complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="InfrastructureDamageObstruction">
 *   &lt;complexContent>
 *     &lt;extension base="{http://datex2.eu/schema/2_0RC1/2_0}Obstruction">
 *       &lt;sequence>
 *         &lt;element name="infrastructureDamageType" type="{http://datex2.eu/schema/2_0RC1/2_0}InfrastructureDamageTypeEnum"/>
 *         &lt;element name="infrastructureDamageObstructionExtension" type="{http://datex2.eu/schema/2_0RC1/2_0}ExtensionType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InfrastructureDamageObstruction", propOrder = {
    "infrastructureDamageType",
    "infrastructureDamageObstructionExtension"
})
public class InfrastructureDamageObstruction
    extends Obstruction
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(required = true)
    protected InfrastructureDamageTypeEnum infrastructureDamageType;
    protected ExtensionType infrastructureDamageObstructionExtension;

    /**
     * Obtient la valeur de la propriété infrastructureDamageType.
     * 
     * @return
     *     possible object is
     *     {@link InfrastructureDamageTypeEnum }
     *     
     */
    public InfrastructureDamageTypeEnum getInfrastructureDamageType() {
        return infrastructureDamageType;
    }

    /**
     * Définit la valeur de la propriété infrastructureDamageType.
     * 
     * @param value
     *     allowed object is
     *     {@link InfrastructureDamageTypeEnum }
     *     
     */
    public void setInfrastructureDamageType(InfrastructureDamageTypeEnum value) {
        this.infrastructureDamageType = value;
    }

    public boolean isSetInfrastructureDamageType() {
        return (this.infrastructureDamageType!= null);
    }

    /**
     * Obtient la valeur de la propriété infrastructureDamageObstructionExtension.
     * 
     * @return
     *     possible object is
     *     {@link ExtensionType }
     *     
     */
    public ExtensionType getInfrastructureDamageObstructionExtension() {
        return infrastructureDamageObstructionExtension;
    }

    /**
     * Définit la valeur de la propriété infrastructureDamageObstructionExtension.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtensionType }
     *     
     */
    public void setInfrastructureDamageObstructionExtension(ExtensionType value) {
        this.infrastructureDamageObstructionExtension = value;
    }

    public boolean isSetInfrastructureDamageObstructionExtension() {
        return (this.infrastructureDamageObstructionExtension!= null);
    }

}
