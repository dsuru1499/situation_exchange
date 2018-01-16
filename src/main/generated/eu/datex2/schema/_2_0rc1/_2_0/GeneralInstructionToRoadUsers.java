
package eu.datex2.schema._2_0rc1._2_0;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour GeneralInstructionToRoadUsers complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="GeneralInstructionToRoadUsers">
 *   &lt;complexContent>
 *     &lt;extension base="{http://datex2.eu/schema/2_0RC1/2_0}NetworkManagement">
 *       &lt;sequence>
 *         &lt;element name="generalInstructionToRoadUsersType" type="{http://datex2.eu/schema/2_0RC1/2_0}GeneralInstructionToRoadUsersTypeEnum"/>
 *         &lt;element name="generalInstructionToRoadUsersExtension" type="{http://datex2.eu/schema/2_0RC1/2_0}ExtensionType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GeneralInstructionToRoadUsers", propOrder = {
    "generalInstructionToRoadUsersType",
    "generalInstructionToRoadUsersExtension"
})
public class GeneralInstructionToRoadUsers
    extends NetworkManagement
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(required = true)
    protected GeneralInstructionToRoadUsersTypeEnum generalInstructionToRoadUsersType;
    protected ExtensionType generalInstructionToRoadUsersExtension;

    /**
     * Obtient la valeur de la propriété generalInstructionToRoadUsersType.
     * 
     * @return
     *     possible object is
     *     {@link GeneralInstructionToRoadUsersTypeEnum }
     *     
     */
    public GeneralInstructionToRoadUsersTypeEnum getGeneralInstructionToRoadUsersType() {
        return generalInstructionToRoadUsersType;
    }

    /**
     * Définit la valeur de la propriété generalInstructionToRoadUsersType.
     * 
     * @param value
     *     allowed object is
     *     {@link GeneralInstructionToRoadUsersTypeEnum }
     *     
     */
    public void setGeneralInstructionToRoadUsersType(GeneralInstructionToRoadUsersTypeEnum value) {
        this.generalInstructionToRoadUsersType = value;
    }

    public boolean isSetGeneralInstructionToRoadUsersType() {
        return (this.generalInstructionToRoadUsersType!= null);
    }

    /**
     * Obtient la valeur de la propriété generalInstructionToRoadUsersExtension.
     * 
     * @return
     *     possible object is
     *     {@link ExtensionType }
     *     
     */
    public ExtensionType getGeneralInstructionToRoadUsersExtension() {
        return generalInstructionToRoadUsersExtension;
    }

    /**
     * Définit la valeur de la propriété generalInstructionToRoadUsersExtension.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtensionType }
     *     
     */
    public void setGeneralInstructionToRoadUsersExtension(ExtensionType value) {
        this.generalInstructionToRoadUsersExtension = value;
    }

    public boolean isSetGeneralInstructionToRoadUsersExtension() {
        return (this.generalInstructionToRoadUsersExtension!= null);
    }

}
