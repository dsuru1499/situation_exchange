
package eu.datex2.schema._2_0rc1._2_0;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour OperatorAction complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="OperatorAction">
 *   &lt;complexContent>
 *     &lt;extension base="{http://datex2.eu/schema/2_0RC1/2_0}SituationRecord">
 *       &lt;sequence>
 *         &lt;element name="actionOrigin" type="{http://datex2.eu/schema/2_0RC1/2_0}OperatorActionOriginEnum" minOccurs="0"/>
 *         &lt;element name="operatorActionStatus" type="{http://datex2.eu/schema/2_0RC1/2_0}OperatorActionStatusEnum" minOccurs="0"/>
 *         &lt;element name="operatorActionExtension" type="{http://datex2.eu/schema/2_0RC1/2_0}ExtensionType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OperatorAction", propOrder = {
    "actionOrigin",
    "operatorActionStatus",
    "operatorActionExtension"
})
@XmlSeeAlso({
    RoadsideAssistance.class,
    Roadworks.class,
    SignSetting.class,
    NetworkManagement.class
})
public abstract class OperatorAction
    extends SituationRecord
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    protected OperatorActionOriginEnum actionOrigin;
    protected OperatorActionStatusEnum operatorActionStatus;
    protected ExtensionType operatorActionExtension;

    /**
     * Obtient la valeur de la propriété actionOrigin.
     * 
     * @return
     *     possible object is
     *     {@link OperatorActionOriginEnum }
     *     
     */
    public OperatorActionOriginEnum getActionOrigin() {
        return actionOrigin;
    }

    /**
     * Définit la valeur de la propriété actionOrigin.
     * 
     * @param value
     *     allowed object is
     *     {@link OperatorActionOriginEnum }
     *     
     */
    public void setActionOrigin(OperatorActionOriginEnum value) {
        this.actionOrigin = value;
    }

    public boolean isSetActionOrigin() {
        return (this.actionOrigin!= null);
    }

    /**
     * Obtient la valeur de la propriété operatorActionStatus.
     * 
     * @return
     *     possible object is
     *     {@link OperatorActionStatusEnum }
     *     
     */
    public OperatorActionStatusEnum getOperatorActionStatus() {
        return operatorActionStatus;
    }

    /**
     * Définit la valeur de la propriété operatorActionStatus.
     * 
     * @param value
     *     allowed object is
     *     {@link OperatorActionStatusEnum }
     *     
     */
    public void setOperatorActionStatus(OperatorActionStatusEnum value) {
        this.operatorActionStatus = value;
    }

    public boolean isSetOperatorActionStatus() {
        return (this.operatorActionStatus!= null);
    }

    /**
     * Obtient la valeur de la propriété operatorActionExtension.
     * 
     * @return
     *     possible object is
     *     {@link ExtensionType }
     *     
     */
    public ExtensionType getOperatorActionExtension() {
        return operatorActionExtension;
    }

    /**
     * Définit la valeur de la propriété operatorActionExtension.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtensionType }
     *     
     */
    public void setOperatorActionExtension(ExtensionType value) {
        this.operatorActionExtension = value;
    }

    public boolean isSetOperatorActionExtension() {
        return (this.operatorActionExtension!= null);
    }

}
