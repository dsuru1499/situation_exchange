
package eu.datex2.schema._2_0rc1._2_0;

import java.io.Serializable;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour VariableMessageSignSetting complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="VariableMessageSignSetting">
 *   &lt;complexContent>
 *     &lt;extension base="{http://datex2.eu/schema/2_0RC1/2_0}SignSetting">
 *       &lt;sequence>
 *         &lt;element name="numberOfCharacters" type="{http://datex2.eu/schema/2_0RC1/2_0}NonNegativeInteger" minOccurs="0"/>
 *         &lt;element name="numberOfRows" type="{http://datex2.eu/schema/2_0RC1/2_0}NonNegativeInteger" minOccurs="0"/>
 *         &lt;element name="vmsFault" type="{http://datex2.eu/schema/2_0RC1/2_0}VmsFaultEnum" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="vmsIdentifier" type="{http://datex2.eu/schema/2_0RC1/2_0}String" minOccurs="0"/>
 *         &lt;element name="vmsLegend" type="{http://datex2.eu/schema/2_0RC1/2_0}MultilingualString" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="vmsType" type="{http://datex2.eu/schema/2_0RC1/2_0}VmsTypeEnum" minOccurs="0"/>
 *         &lt;element name="variableMessageSignSettingExtension" type="{http://datex2.eu/schema/2_0RC1/2_0}ExtensionType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VariableMessageSignSetting", propOrder = {
    "numberOfCharacters",
    "numberOfRows",
    "vmsFault",
    "vmsIdentifier",
    "vmsLegend",
    "vmsType",
    "variableMessageSignSettingExtension"
})
public class VariableMessageSignSetting
    extends SignSetting
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    protected BigInteger numberOfCharacters;
    protected BigInteger numberOfRows;
    protected List<VmsFaultEnum> vmsFault;
    protected String vmsIdentifier;
    protected List<MultilingualString> vmsLegend;
    protected VmsTypeEnum vmsType;
    protected ExtensionType variableMessageSignSettingExtension;

    /**
     * Obtient la valeur de la propriété numberOfCharacters.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getNumberOfCharacters() {
        return numberOfCharacters;
    }

    /**
     * Définit la valeur de la propriété numberOfCharacters.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setNumberOfCharacters(BigInteger value) {
        this.numberOfCharacters = value;
    }

    public boolean isSetNumberOfCharacters() {
        return (this.numberOfCharacters!= null);
    }

    /**
     * Obtient la valeur de la propriété numberOfRows.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getNumberOfRows() {
        return numberOfRows;
    }

    /**
     * Définit la valeur de la propriété numberOfRows.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setNumberOfRows(BigInteger value) {
        this.numberOfRows = value;
    }

    public boolean isSetNumberOfRows() {
        return (this.numberOfRows!= null);
    }

    /**
     * Gets the value of the vmsFault property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the vmsFault property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getVmsFault().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link VmsFaultEnum }
     * 
     * 
     */
    public List<VmsFaultEnum> getVmsFault() {
        if (vmsFault == null) {
            vmsFault = new ArrayList<VmsFaultEnum>();
        }
        return this.vmsFault;
    }

    public boolean isSetVmsFault() {
        return ((this.vmsFault!= null)&&(!this.vmsFault.isEmpty()));
    }

    public void unsetVmsFault() {
        this.vmsFault = null;
    }

    /**
     * Obtient la valeur de la propriété vmsIdentifier.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVmsIdentifier() {
        return vmsIdentifier;
    }

    /**
     * Définit la valeur de la propriété vmsIdentifier.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVmsIdentifier(String value) {
        this.vmsIdentifier = value;
    }

    public boolean isSetVmsIdentifier() {
        return (this.vmsIdentifier!= null);
    }

    /**
     * Gets the value of the vmsLegend property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the vmsLegend property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getVmsLegend().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MultilingualString }
     * 
     * 
     */
    public List<MultilingualString> getVmsLegend() {
        if (vmsLegend == null) {
            vmsLegend = new ArrayList<MultilingualString>();
        }
        return this.vmsLegend;
    }

    public boolean isSetVmsLegend() {
        return ((this.vmsLegend!= null)&&(!this.vmsLegend.isEmpty()));
    }

    public void unsetVmsLegend() {
        this.vmsLegend = null;
    }

    /**
     * Obtient la valeur de la propriété vmsType.
     * 
     * @return
     *     possible object is
     *     {@link VmsTypeEnum }
     *     
     */
    public VmsTypeEnum getVmsType() {
        return vmsType;
    }

    /**
     * Définit la valeur de la propriété vmsType.
     * 
     * @param value
     *     allowed object is
     *     {@link VmsTypeEnum }
     *     
     */
    public void setVmsType(VmsTypeEnum value) {
        this.vmsType = value;
    }

    public boolean isSetVmsType() {
        return (this.vmsType!= null);
    }

    /**
     * Obtient la valeur de la propriété variableMessageSignSettingExtension.
     * 
     * @return
     *     possible object is
     *     {@link ExtensionType }
     *     
     */
    public ExtensionType getVariableMessageSignSettingExtension() {
        return variableMessageSignSettingExtension;
    }

    /**
     * Définit la valeur de la propriété variableMessageSignSettingExtension.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtensionType }
     *     
     */
    public void setVariableMessageSignSettingExtension(ExtensionType value) {
        this.variableMessageSignSettingExtension = value;
    }

    public boolean isSetVariableMessageSignSettingExtension() {
        return (this.variableMessageSignSettingExtension!= null);
    }

}
