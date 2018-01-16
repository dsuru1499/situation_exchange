
package eu.datex2.schema._2_0rc1._2_0;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour SpeedManagement complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="SpeedManagement">
 *   &lt;complexContent>
 *     &lt;extension base="{http://datex2.eu/schema/2_0RC1/2_0}NetworkManagement">
 *       &lt;sequence>
 *         &lt;element name="speedManagementType" type="{http://datex2.eu/schema/2_0RC1/2_0}SpeedManagementTypeEnum" minOccurs="0"/>
 *         &lt;element name="temporarySpeedLimit" type="{http://datex2.eu/schema/2_0RC1/2_0}KilometresPerHour" minOccurs="0"/>
 *         &lt;element name="speedManagementExtension" type="{http://datex2.eu/schema/2_0RC1/2_0}ExtensionType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SpeedManagement", propOrder = {
    "speedManagementType",
    "temporarySpeedLimit",
    "speedManagementExtension"
})
public class SpeedManagement
    extends NetworkManagement
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    protected SpeedManagementTypeEnum speedManagementType;
    protected Float temporarySpeedLimit;
    protected ExtensionType speedManagementExtension;

    /**
     * Obtient la valeur de la propriété speedManagementType.
     * 
     * @return
     *     possible object is
     *     {@link SpeedManagementTypeEnum }
     *     
     */
    public SpeedManagementTypeEnum getSpeedManagementType() {
        return speedManagementType;
    }

    /**
     * Définit la valeur de la propriété speedManagementType.
     * 
     * @param value
     *     allowed object is
     *     {@link SpeedManagementTypeEnum }
     *     
     */
    public void setSpeedManagementType(SpeedManagementTypeEnum value) {
        this.speedManagementType = value;
    }

    public boolean isSetSpeedManagementType() {
        return (this.speedManagementType!= null);
    }

    /**
     * Obtient la valeur de la propriété temporarySpeedLimit.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getTemporarySpeedLimit() {
        return temporarySpeedLimit;
    }

    /**
     * Définit la valeur de la propriété temporarySpeedLimit.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setTemporarySpeedLimit(Float value) {
        this.temporarySpeedLimit = value;
    }

    public boolean isSetTemporarySpeedLimit() {
        return (this.temporarySpeedLimit!= null);
    }

    /**
     * Obtient la valeur de la propriété speedManagementExtension.
     * 
     * @return
     *     possible object is
     *     {@link ExtensionType }
     *     
     */
    public ExtensionType getSpeedManagementExtension() {
        return speedManagementExtension;
    }

    /**
     * Définit la valeur de la propriété speedManagementExtension.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtensionType }
     *     
     */
    public void setSpeedManagementExtension(ExtensionType value) {
        this.speedManagementExtension = value;
    }

    public boolean isSetSpeedManagementExtension() {
        return (this.speedManagementExtension!= null);
    }

}
