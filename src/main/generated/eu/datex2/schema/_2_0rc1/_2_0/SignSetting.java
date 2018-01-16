
package eu.datex2.schema._2_0rc1._2_0;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Classe Java pour SignSetting complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="SignSetting">
 *   &lt;complexContent>
 *     &lt;extension base="{http://datex2.eu/schema/2_0RC1/2_0}OperatorAction">
 *       &lt;sequence>
 *         &lt;element name="datexPictogram" type="{http://datex2.eu/schema/2_0RC1/2_0}DatexPictogramEnum" maxOccurs="2" minOccurs="0"/>
 *         &lt;element name="pictogramList" type="{http://datex2.eu/schema/2_0RC1/2_0}String" minOccurs="0"/>
 *         &lt;element name="pictogramListEntry" type="{http://datex2.eu/schema/2_0RC1/2_0}String" maxOccurs="2" minOccurs="0"/>
 *         &lt;element name="reasonForSetting" type="{http://datex2.eu/schema/2_0RC1/2_0}MultilingualString" minOccurs="0"/>
 *         &lt;element name="setBy" type="{http://datex2.eu/schema/2_0RC1/2_0}MultilingualString" minOccurs="0"/>
 *         &lt;element name="signAddress" type="{http://datex2.eu/schema/2_0RC1/2_0}String" minOccurs="0"/>
 *         &lt;element name="timeLastSet" type="{http://datex2.eu/schema/2_0RC1/2_0}DateTime" minOccurs="0"/>
 *         &lt;element name="signSettingExtension" type="{http://datex2.eu/schema/2_0RC1/2_0}ExtensionType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SignSetting", propOrder = {
    "datexPictogram",
    "pictogramList",
    "pictogramListEntry",
    "reasonForSetting",
    "setBy",
    "signAddress",
    "timeLastSet",
    "signSettingExtension"
})
@XmlSeeAlso({
    VariableMessageSignSetting.class,
    MatrixSignSetting.class
})
public abstract class SignSetting
    extends OperatorAction
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    protected List<DatexPictogramEnum> datexPictogram;
    protected String pictogramList;
    protected List<String> pictogramListEntry;
    protected MultilingualString reasonForSetting;
    protected MultilingualString setBy;
    protected String signAddress;
    protected XMLGregorianCalendar timeLastSet;
    protected ExtensionType signSettingExtension;

    /**
     * Gets the value of the datexPictogram property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the datexPictogram property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDatexPictogram().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DatexPictogramEnum }
     * 
     * 
     */
    public List<DatexPictogramEnum> getDatexPictogram() {
        if (datexPictogram == null) {
            datexPictogram = new ArrayList<DatexPictogramEnum>();
        }
        return this.datexPictogram;
    }

    public boolean isSetDatexPictogram() {
        return ((this.datexPictogram!= null)&&(!this.datexPictogram.isEmpty()));
    }

    public void unsetDatexPictogram() {
        this.datexPictogram = null;
    }

    /**
     * Obtient la valeur de la propriété pictogramList.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPictogramList() {
        return pictogramList;
    }

    /**
     * Définit la valeur de la propriété pictogramList.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPictogramList(String value) {
        this.pictogramList = value;
    }

    public boolean isSetPictogramList() {
        return (this.pictogramList!= null);
    }

    /**
     * Gets the value of the pictogramListEntry property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the pictogramListEntry property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPictogramListEntry().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getPictogramListEntry() {
        if (pictogramListEntry == null) {
            pictogramListEntry = new ArrayList<String>();
        }
        return this.pictogramListEntry;
    }

    public boolean isSetPictogramListEntry() {
        return ((this.pictogramListEntry!= null)&&(!this.pictogramListEntry.isEmpty()));
    }

    public void unsetPictogramListEntry() {
        this.pictogramListEntry = null;
    }

    /**
     * Obtient la valeur de la propriété reasonForSetting.
     * 
     * @return
     *     possible object is
     *     {@link MultilingualString }
     *     
     */
    public MultilingualString getReasonForSetting() {
        return reasonForSetting;
    }

    /**
     * Définit la valeur de la propriété reasonForSetting.
     * 
     * @param value
     *     allowed object is
     *     {@link MultilingualString }
     *     
     */
    public void setReasonForSetting(MultilingualString value) {
        this.reasonForSetting = value;
    }

    public boolean isSetReasonForSetting() {
        return (this.reasonForSetting!= null);
    }

    /**
     * Obtient la valeur de la propriété setBy.
     * 
     * @return
     *     possible object is
     *     {@link MultilingualString }
     *     
     */
    public MultilingualString getSetBy() {
        return setBy;
    }

    /**
     * Définit la valeur de la propriété setBy.
     * 
     * @param value
     *     allowed object is
     *     {@link MultilingualString }
     *     
     */
    public void setSetBy(MultilingualString value) {
        this.setBy = value;
    }

    public boolean isSetSetBy() {
        return (this.setBy!= null);
    }

    /**
     * Obtient la valeur de la propriété signAddress.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSignAddress() {
        return signAddress;
    }

    /**
     * Définit la valeur de la propriété signAddress.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSignAddress(String value) {
        this.signAddress = value;
    }

    public boolean isSetSignAddress() {
        return (this.signAddress!= null);
    }

    /**
     * Obtient la valeur de la propriété timeLastSet.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getTimeLastSet() {
        return timeLastSet;
    }

    /**
     * Définit la valeur de la propriété timeLastSet.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setTimeLastSet(XMLGregorianCalendar value) {
        this.timeLastSet = value;
    }

    public boolean isSetTimeLastSet() {
        return (this.timeLastSet!= null);
    }

    /**
     * Obtient la valeur de la propriété signSettingExtension.
     * 
     * @return
     *     possible object is
     *     {@link ExtensionType }
     *     
     */
    public ExtensionType getSignSettingExtension() {
        return signSettingExtension;
    }

    /**
     * Définit la valeur de la propriété signSettingExtension.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtensionType }
     *     
     */
    public void setSignSettingExtension(ExtensionType value) {
        this.signSettingExtension = value;
    }

    public boolean isSetSignSettingExtension() {
        return (this.signSettingExtension!= null);
    }

}
