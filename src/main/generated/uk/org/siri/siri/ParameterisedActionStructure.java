
package uk.org.siri.siri;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * Type for parameterised, i.e. user definable, actions.
 * 
 * <p>Classe Java pour ParameterisedActionStructure complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="ParameterisedActionStructure">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.siri.org.uk/siri}SimpleActionStructure">
 *       &lt;sequence>
 *         &lt;element name="Description" type="{http://www.siri.org.uk/siri}NaturalLanguageStringStructure" minOccurs="0"/>
 *         &lt;element name="ActionData" type="{http://www.siri.org.uk/siri}ActionDataStructure" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ParameterisedActionStructure", propOrder = {
    "description",
    "actionData"
})
@XmlSeeAlso({
    PublishToMobileActionStructure.class,
    PublishToWebActionStructure.class,
    PublishToTvActionStructure.class,
    PublishToDisplayActionStructure.class,
    PushedActionStructure.class,
    ManualActionStructure.class
})
public class ParameterisedActionStructure
    extends SimpleActionStructure
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "Description")
    protected NaturalLanguageStringStructure description;
    @XmlElement(name = "ActionData")
    protected List<ActionDataStructure> actionData;

    /**
     * Obtient la valeur de la propriété description.
     * 
     * @return
     *     possible object is
     *     {@link NaturalLanguageStringStructure }
     *     
     */
    public NaturalLanguageStringStructure getDescription() {
        return description;
    }

    /**
     * Définit la valeur de la propriété description.
     * 
     * @param value
     *     allowed object is
     *     {@link NaturalLanguageStringStructure }
     *     
     */
    public void setDescription(NaturalLanguageStringStructure value) {
        this.description = value;
    }

    public boolean isSetDescription() {
        return (this.description!= null);
    }

    /**
     * Gets the value of the actionData property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the actionData property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getActionData().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ActionDataStructure }
     * 
     * 
     */
    public List<ActionDataStructure> getActionData() {
        if (actionData == null) {
            actionData = new ArrayList<ActionDataStructure>();
        }
        return this.actionData;
    }

    public boolean isSetActionData() {
        return ((this.actionData!= null)&&(!this.actionData.isEmpty()));
    }

    public void unsetActionData() {
        this.actionData = null;
    }

}
