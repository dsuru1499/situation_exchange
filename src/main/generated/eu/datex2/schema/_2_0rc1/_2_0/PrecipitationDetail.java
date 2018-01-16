
package eu.datex2.schema._2_0rc1._2_0;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour PrecipitationDetail complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="PrecipitationDetail">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="depositionDepth" type="{http://datex2.eu/schema/2_0RC1/2_0}MetresAsFloat" minOccurs="0"/>
 *         &lt;element name="precipitationIntensity" type="{http://datex2.eu/schema/2_0RC1/2_0}IntensityMillimetresPerHour" minOccurs="0"/>
 *         &lt;element name="precipitationType" type="{http://datex2.eu/schema/2_0RC1/2_0}PrecipitationTypeEnum" minOccurs="0"/>
 *         &lt;element name="precipitationDetailExtension" type="{http://datex2.eu/schema/2_0RC1/2_0}ExtensionType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PrecipitationDetail", propOrder = {
    "depositionDepth",
    "precipitationIntensity",
    "precipitationType",
    "precipitationDetailExtension"
})
public class PrecipitationDetail
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    protected Float depositionDepth;
    protected Float precipitationIntensity;
    protected PrecipitationTypeEnum precipitationType;
    protected ExtensionType precipitationDetailExtension;

    /**
     * Obtient la valeur de la propriété depositionDepth.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getDepositionDepth() {
        return depositionDepth;
    }

    /**
     * Définit la valeur de la propriété depositionDepth.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setDepositionDepth(Float value) {
        this.depositionDepth = value;
    }

    public boolean isSetDepositionDepth() {
        return (this.depositionDepth!= null);
    }

    /**
     * Obtient la valeur de la propriété precipitationIntensity.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getPrecipitationIntensity() {
        return precipitationIntensity;
    }

    /**
     * Définit la valeur de la propriété precipitationIntensity.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setPrecipitationIntensity(Float value) {
        this.precipitationIntensity = value;
    }

    public boolean isSetPrecipitationIntensity() {
        return (this.precipitationIntensity!= null);
    }

    /**
     * Obtient la valeur de la propriété precipitationType.
     * 
     * @return
     *     possible object is
     *     {@link PrecipitationTypeEnum }
     *     
     */
    public PrecipitationTypeEnum getPrecipitationType() {
        return precipitationType;
    }

    /**
     * Définit la valeur de la propriété precipitationType.
     * 
     * @param value
     *     allowed object is
     *     {@link PrecipitationTypeEnum }
     *     
     */
    public void setPrecipitationType(PrecipitationTypeEnum value) {
        this.precipitationType = value;
    }

    public boolean isSetPrecipitationType() {
        return (this.precipitationType!= null);
    }

    /**
     * Obtient la valeur de la propriété precipitationDetailExtension.
     * 
     * @return
     *     possible object is
     *     {@link ExtensionType }
     *     
     */
    public ExtensionType getPrecipitationDetailExtension() {
        return precipitationDetailExtension;
    }

    /**
     * Définit la valeur de la propriété precipitationDetailExtension.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtensionType }
     *     
     */
    public void setPrecipitationDetailExtension(ExtensionType value) {
        this.precipitationDetailExtension = value;
    }

    public boolean isSetPrecipitationDetailExtension() {
        return (this.precipitationDetailExtension!= null);
    }

}
