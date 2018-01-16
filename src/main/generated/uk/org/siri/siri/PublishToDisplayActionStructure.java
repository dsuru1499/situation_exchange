
package uk.org.siri.siri;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Type for Action Publish SITUATION To Web.
 * 
 * <p>Classe Java pour PublishToDisplayActionStructure complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="PublishToDisplayActionStructure">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.siri.org.uk/siri}ParameterisedActionStructure">
 *       &lt;sequence>
 *         &lt;element name="OnPlace" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="OnBoard" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PublishToDisplayActionStructure", propOrder = {
    "onPlace",
    "onBoard"
})
public class PublishToDisplayActionStructure
    extends ParameterisedActionStructure
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "OnPlace", defaultValue = "true")
    protected Boolean onPlace;
    @XmlElement(name = "OnBoard", defaultValue = "false")
    protected Boolean onBoard;

    /**
     * Obtient la valeur de la propriété onPlace.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isOnPlace() {
        return onPlace;
    }

    /**
     * Définit la valeur de la propriété onPlace.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setOnPlace(Boolean value) {
        this.onPlace = value;
    }

    public boolean isSetOnPlace() {
        return (this.onPlace!= null);
    }

    /**
     * Obtient la valeur de la propriété onBoard.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isOnBoard() {
        return onBoard;
    }

    /**
     * Définit la valeur de la propriété onBoard.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setOnBoard(Boolean value) {
        this.onBoard = value;
    }

    public boolean isSetOnBoard() {
        return (this.onBoard!= null);
    }

}
