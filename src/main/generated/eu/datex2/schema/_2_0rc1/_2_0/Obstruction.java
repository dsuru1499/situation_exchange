
package eu.datex2.schema._2_0rc1._2_0;

import java.io.Serializable;
import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour Obstruction complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="Obstruction">
 *   &lt;complexContent>
 *     &lt;extension base="{http://datex2.eu/schema/2_0RC1/2_0}TrafficElement">
 *       &lt;sequence>
 *         &lt;element name="numberOfObstructions" type="{http://datex2.eu/schema/2_0RC1/2_0}NonNegativeInteger" minOccurs="0"/>
 *         &lt;element name="mobilityOfObstruction" type="{http://datex2.eu/schema/2_0RC1/2_0}Mobility" minOccurs="0"/>
 *         &lt;element name="obstructionExtension" type="{http://datex2.eu/schema/2_0RC1/2_0}ExtensionType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Obstruction", propOrder = {
    "numberOfObstructions",
    "mobilityOfObstruction",
    "obstructionExtension"
})
@XmlSeeAlso({
    EnvironmentalObstruction.class,
    VehicleObstruction.class,
    InfrastructureDamageObstruction.class,
    GeneralObstruction.class,
    AnimalPresenceObstruction.class
})
public abstract class Obstruction
    extends TrafficElement
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    protected BigInteger numberOfObstructions;
    protected Mobility mobilityOfObstruction;
    protected ExtensionType obstructionExtension;

    /**
     * Obtient la valeur de la propriété numberOfObstructions.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getNumberOfObstructions() {
        return numberOfObstructions;
    }

    /**
     * Définit la valeur de la propriété numberOfObstructions.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setNumberOfObstructions(BigInteger value) {
        this.numberOfObstructions = value;
    }

    public boolean isSetNumberOfObstructions() {
        return (this.numberOfObstructions!= null);
    }

    /**
     * Obtient la valeur de la propriété mobilityOfObstruction.
     * 
     * @return
     *     possible object is
     *     {@link Mobility }
     *     
     */
    public Mobility getMobilityOfObstruction() {
        return mobilityOfObstruction;
    }

    /**
     * Définit la valeur de la propriété mobilityOfObstruction.
     * 
     * @param value
     *     allowed object is
     *     {@link Mobility }
     *     
     */
    public void setMobilityOfObstruction(Mobility value) {
        this.mobilityOfObstruction = value;
    }

    public boolean isSetMobilityOfObstruction() {
        return (this.mobilityOfObstruction!= null);
    }

    /**
     * Obtient la valeur de la propriété obstructionExtension.
     * 
     * @return
     *     possible object is
     *     {@link ExtensionType }
     *     
     */
    public ExtensionType getObstructionExtension() {
        return obstructionExtension;
    }

    /**
     * Définit la valeur de la propriété obstructionExtension.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtensionType }
     *     
     */
    public void setObstructionExtension(ExtensionType value) {
        this.obstructionExtension = value;
    }

    public boolean isSetObstructionExtension() {
        return (this.obstructionExtension!= null);
    }

}
