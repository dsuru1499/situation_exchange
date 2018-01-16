
package eu.datex2.schema._2_0rc1._2_0;

import java.io.Serializable;
import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour HazardousMaterials complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="HazardousMaterials">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="chemicalName" type="{http://datex2.eu/schema/2_0RC1/2_0}MultilingualString"/>
 *         &lt;element name="dangerousGoodsFlashPoint" type="{http://datex2.eu/schema/2_0RC1/2_0}TemperatureCelsius" minOccurs="0"/>
 *         &lt;element name="dangerousGoodsRegulations" type="{http://datex2.eu/schema/2_0RC1/2_0}DangerousGoodsRegulationsEnum" minOccurs="0"/>
 *         &lt;element name="hazardCodeIdentification" type="{http://datex2.eu/schema/2_0RC1/2_0}String" minOccurs="0"/>
 *         &lt;element name="hazardCodeVersionNumber" type="{http://datex2.eu/schema/2_0RC1/2_0}NonNegativeInteger" minOccurs="0"/>
 *         &lt;element name="hazardSubstanceItemPageNumber" type="{http://datex2.eu/schema/2_0RC1/2_0}String" minOccurs="0"/>
 *         &lt;element name="tremCardNumber" type="{http://datex2.eu/schema/2_0RC1/2_0}String" minOccurs="0"/>
 *         &lt;element name="undgNumber" type="{http://datex2.eu/schema/2_0RC1/2_0}String" minOccurs="0"/>
 *         &lt;element name="volumeOfDangerousGoods" type="{http://datex2.eu/schema/2_0RC1/2_0}CubicMetres" minOccurs="0"/>
 *         &lt;element name="weightOfDangerousGoods" type="{http://datex2.eu/schema/2_0RC1/2_0}Tonnes" minOccurs="0"/>
 *         &lt;element name="hazardousMaterialsExtension" type="{http://datex2.eu/schema/2_0RC1/2_0}ExtensionType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HazardousMaterials", propOrder = {
    "chemicalName",
    "dangerousGoodsFlashPoint",
    "dangerousGoodsRegulations",
    "hazardCodeIdentification",
    "hazardCodeVersionNumber",
    "hazardSubstanceItemPageNumber",
    "tremCardNumber",
    "undgNumber",
    "volumeOfDangerousGoods",
    "weightOfDangerousGoods",
    "hazardousMaterialsExtension"
})
public class HazardousMaterials
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(required = true)
    protected MultilingualString chemicalName;
    protected Float dangerousGoodsFlashPoint;
    protected DangerousGoodsRegulationsEnum dangerousGoodsRegulations;
    protected String hazardCodeIdentification;
    protected BigInteger hazardCodeVersionNumber;
    protected String hazardSubstanceItemPageNumber;
    protected String tremCardNumber;
    protected String undgNumber;
    protected Float volumeOfDangerousGoods;
    protected Float weightOfDangerousGoods;
    protected ExtensionType hazardousMaterialsExtension;

    /**
     * Obtient la valeur de la propriété chemicalName.
     * 
     * @return
     *     possible object is
     *     {@link MultilingualString }
     *     
     */
    public MultilingualString getChemicalName() {
        return chemicalName;
    }

    /**
     * Définit la valeur de la propriété chemicalName.
     * 
     * @param value
     *     allowed object is
     *     {@link MultilingualString }
     *     
     */
    public void setChemicalName(MultilingualString value) {
        this.chemicalName = value;
    }

    public boolean isSetChemicalName() {
        return (this.chemicalName!= null);
    }

    /**
     * Obtient la valeur de la propriété dangerousGoodsFlashPoint.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getDangerousGoodsFlashPoint() {
        return dangerousGoodsFlashPoint;
    }

    /**
     * Définit la valeur de la propriété dangerousGoodsFlashPoint.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setDangerousGoodsFlashPoint(Float value) {
        this.dangerousGoodsFlashPoint = value;
    }

    public boolean isSetDangerousGoodsFlashPoint() {
        return (this.dangerousGoodsFlashPoint!= null);
    }

    /**
     * Obtient la valeur de la propriété dangerousGoodsRegulations.
     * 
     * @return
     *     possible object is
     *     {@link DangerousGoodsRegulationsEnum }
     *     
     */
    public DangerousGoodsRegulationsEnum getDangerousGoodsRegulations() {
        return dangerousGoodsRegulations;
    }

    /**
     * Définit la valeur de la propriété dangerousGoodsRegulations.
     * 
     * @param value
     *     allowed object is
     *     {@link DangerousGoodsRegulationsEnum }
     *     
     */
    public void setDangerousGoodsRegulations(DangerousGoodsRegulationsEnum value) {
        this.dangerousGoodsRegulations = value;
    }

    public boolean isSetDangerousGoodsRegulations() {
        return (this.dangerousGoodsRegulations!= null);
    }

    /**
     * Obtient la valeur de la propriété hazardCodeIdentification.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHazardCodeIdentification() {
        return hazardCodeIdentification;
    }

    /**
     * Définit la valeur de la propriété hazardCodeIdentification.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHazardCodeIdentification(String value) {
        this.hazardCodeIdentification = value;
    }

    public boolean isSetHazardCodeIdentification() {
        return (this.hazardCodeIdentification!= null);
    }

    /**
     * Obtient la valeur de la propriété hazardCodeVersionNumber.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getHazardCodeVersionNumber() {
        return hazardCodeVersionNumber;
    }

    /**
     * Définit la valeur de la propriété hazardCodeVersionNumber.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setHazardCodeVersionNumber(BigInteger value) {
        this.hazardCodeVersionNumber = value;
    }

    public boolean isSetHazardCodeVersionNumber() {
        return (this.hazardCodeVersionNumber!= null);
    }

    /**
     * Obtient la valeur de la propriété hazardSubstanceItemPageNumber.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHazardSubstanceItemPageNumber() {
        return hazardSubstanceItemPageNumber;
    }

    /**
     * Définit la valeur de la propriété hazardSubstanceItemPageNumber.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHazardSubstanceItemPageNumber(String value) {
        this.hazardSubstanceItemPageNumber = value;
    }

    public boolean isSetHazardSubstanceItemPageNumber() {
        return (this.hazardSubstanceItemPageNumber!= null);
    }

    /**
     * Obtient la valeur de la propriété tremCardNumber.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTremCardNumber() {
        return tremCardNumber;
    }

    /**
     * Définit la valeur de la propriété tremCardNumber.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTremCardNumber(String value) {
        this.tremCardNumber = value;
    }

    public boolean isSetTremCardNumber() {
        return (this.tremCardNumber!= null);
    }

    /**
     * Obtient la valeur de la propriété undgNumber.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUndgNumber() {
        return undgNumber;
    }

    /**
     * Définit la valeur de la propriété undgNumber.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUndgNumber(String value) {
        this.undgNumber = value;
    }

    public boolean isSetUndgNumber() {
        return (this.undgNumber!= null);
    }

    /**
     * Obtient la valeur de la propriété volumeOfDangerousGoods.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getVolumeOfDangerousGoods() {
        return volumeOfDangerousGoods;
    }

    /**
     * Définit la valeur de la propriété volumeOfDangerousGoods.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setVolumeOfDangerousGoods(Float value) {
        this.volumeOfDangerousGoods = value;
    }

    public boolean isSetVolumeOfDangerousGoods() {
        return (this.volumeOfDangerousGoods!= null);
    }

    /**
     * Obtient la valeur de la propriété weightOfDangerousGoods.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getWeightOfDangerousGoods() {
        return weightOfDangerousGoods;
    }

    /**
     * Définit la valeur de la propriété weightOfDangerousGoods.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setWeightOfDangerousGoods(Float value) {
        this.weightOfDangerousGoods = value;
    }

    public boolean isSetWeightOfDangerousGoods() {
        return (this.weightOfDangerousGoods!= null);
    }

    /**
     * Obtient la valeur de la propriété hazardousMaterialsExtension.
     * 
     * @return
     *     possible object is
     *     {@link ExtensionType }
     *     
     */
    public ExtensionType getHazardousMaterialsExtension() {
        return hazardousMaterialsExtension;
    }

    /**
     * Définit la valeur de la propriété hazardousMaterialsExtension.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtensionType }
     *     
     */
    public void setHazardousMaterialsExtension(ExtensionType value) {
        this.hazardousMaterialsExtension = value;
    }

    public boolean isSetHazardousMaterialsExtension() {
        return (this.hazardousMaterialsExtension!= null);
    }

}
