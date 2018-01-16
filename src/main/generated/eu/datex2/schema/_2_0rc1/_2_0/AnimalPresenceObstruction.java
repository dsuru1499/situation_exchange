
package eu.datex2.schema._2_0rc1._2_0;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour AnimalPresenceObstruction complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="AnimalPresenceObstruction">
 *   &lt;complexContent>
 *     &lt;extension base="{http://datex2.eu/schema/2_0RC1/2_0}Obstruction">
 *       &lt;sequence>
 *         &lt;element name="alive" type="{http://datex2.eu/schema/2_0RC1/2_0}Boolean" minOccurs="0"/>
 *         &lt;element name="animalPresenceType" type="{http://datex2.eu/schema/2_0RC1/2_0}AnimalPresenceTypeEnum"/>
 *         &lt;element name="animalPresenceObstructionExtension" type="{http://datex2.eu/schema/2_0RC1/2_0}ExtensionType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AnimalPresenceObstruction", propOrder = {
    "alive",
    "animalPresenceType",
    "animalPresenceObstructionExtension"
})
public class AnimalPresenceObstruction
    extends Obstruction
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    protected Boolean alive;
    @XmlElement(required = true)
    protected AnimalPresenceTypeEnum animalPresenceType;
    protected ExtensionType animalPresenceObstructionExtension;

    /**
     * Obtient la valeur de la propriété alive.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAlive() {
        return alive;
    }

    /**
     * Définit la valeur de la propriété alive.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAlive(Boolean value) {
        this.alive = value;
    }

    public boolean isSetAlive() {
        return (this.alive!= null);
    }

    /**
     * Obtient la valeur de la propriété animalPresenceType.
     * 
     * @return
     *     possible object is
     *     {@link AnimalPresenceTypeEnum }
     *     
     */
    public AnimalPresenceTypeEnum getAnimalPresenceType() {
        return animalPresenceType;
    }

    /**
     * Définit la valeur de la propriété animalPresenceType.
     * 
     * @param value
     *     allowed object is
     *     {@link AnimalPresenceTypeEnum }
     *     
     */
    public void setAnimalPresenceType(AnimalPresenceTypeEnum value) {
        this.animalPresenceType = value;
    }

    public boolean isSetAnimalPresenceType() {
        return (this.animalPresenceType!= null);
    }

    /**
     * Obtient la valeur de la propriété animalPresenceObstructionExtension.
     * 
     * @return
     *     possible object is
     *     {@link ExtensionType }
     *     
     */
    public ExtensionType getAnimalPresenceObstructionExtension() {
        return animalPresenceObstructionExtension;
    }

    /**
     * Définit la valeur de la propriété animalPresenceObstructionExtension.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtensionType }
     *     
     */
    public void setAnimalPresenceObstructionExtension(ExtensionType value) {
        this.animalPresenceObstructionExtension = value;
    }

    public boolean isSetAnimalPresenceObstructionExtension() {
        return (this.animalPresenceObstructionExtension!= null);
    }

}
