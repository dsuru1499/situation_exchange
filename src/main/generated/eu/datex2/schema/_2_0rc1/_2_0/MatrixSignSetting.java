
package eu.datex2.schema._2_0rc1._2_0;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour MatrixSignSetting complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="MatrixSignSetting">
 *   &lt;complexContent>
 *     &lt;extension base="{http://datex2.eu/schema/2_0RC1/2_0}SignSetting">
 *       &lt;sequence>
 *         &lt;element name="aspectDisplayed" type="{http://datex2.eu/schema/2_0RC1/2_0}String"/>
 *         &lt;element name="matrixFault" type="{http://datex2.eu/schema/2_0RC1/2_0}MatrixFaultEnum" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="matrixIdentifier" type="{http://datex2.eu/schema/2_0RC1/2_0}String"/>
 *         &lt;element name="matrixSignSettingExtension" type="{http://datex2.eu/schema/2_0RC1/2_0}ExtensionType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MatrixSignSetting", propOrder = {
    "aspectDisplayed",
    "matrixFault",
    "matrixIdentifier",
    "matrixSignSettingExtension"
})
public class MatrixSignSetting
    extends SignSetting
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(required = true)
    protected String aspectDisplayed;
    protected List<MatrixFaultEnum> matrixFault;
    @XmlElement(required = true)
    protected String matrixIdentifier;
    protected ExtensionType matrixSignSettingExtension;

    /**
     * Obtient la valeur de la propriété aspectDisplayed.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAspectDisplayed() {
        return aspectDisplayed;
    }

    /**
     * Définit la valeur de la propriété aspectDisplayed.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAspectDisplayed(String value) {
        this.aspectDisplayed = value;
    }

    public boolean isSetAspectDisplayed() {
        return (this.aspectDisplayed!= null);
    }

    /**
     * Gets the value of the matrixFault property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the matrixFault property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMatrixFault().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MatrixFaultEnum }
     * 
     * 
     */
    public List<MatrixFaultEnum> getMatrixFault() {
        if (matrixFault == null) {
            matrixFault = new ArrayList<MatrixFaultEnum>();
        }
        return this.matrixFault;
    }

    public boolean isSetMatrixFault() {
        return ((this.matrixFault!= null)&&(!this.matrixFault.isEmpty()));
    }

    public void unsetMatrixFault() {
        this.matrixFault = null;
    }

    /**
     * Obtient la valeur de la propriété matrixIdentifier.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMatrixIdentifier() {
        return matrixIdentifier;
    }

    /**
     * Définit la valeur de la propriété matrixIdentifier.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMatrixIdentifier(String value) {
        this.matrixIdentifier = value;
    }

    public boolean isSetMatrixIdentifier() {
        return (this.matrixIdentifier!= null);
    }

    /**
     * Obtient la valeur de la propriété matrixSignSettingExtension.
     * 
     * @return
     *     possible object is
     *     {@link ExtensionType }
     *     
     */
    public ExtensionType getMatrixSignSettingExtension() {
        return matrixSignSettingExtension;
    }

    /**
     * Définit la valeur de la propriété matrixSignSettingExtension.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtensionType }
     *     
     */
    public void setMatrixSignSettingExtension(ExtensionType value) {
        this.matrixSignSettingExtension = value;
    }

    public boolean isSetMatrixSignSettingExtension() {
        return (this.matrixSignSettingExtension!= null);
    }

}
