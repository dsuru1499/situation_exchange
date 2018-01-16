
package eu.datex2.schema._2_0rc1._2_0;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour PrecipitationInformation complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="PrecipitationInformation">
 *   &lt;complexContent>
 *     &lt;extension base="{http://datex2.eu/schema/2_0RC1/2_0}WeatherValue">
 *       &lt;sequence>
 *         &lt;element name="noPrecipitation" type="{http://datex2.eu/schema/2_0RC1/2_0}Boolean" minOccurs="0"/>
 *         &lt;element name="precipitationDetail" type="{http://datex2.eu/schema/2_0RC1/2_0}PrecipitationDetail" minOccurs="0"/>
 *         &lt;element name="precipitationInformationExtension" type="{http://datex2.eu/schema/2_0RC1/2_0}ExtensionType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PrecipitationInformation", propOrder = {
    "noPrecipitation",
    "precipitationDetail",
    "precipitationInformationExtension"
})
public class PrecipitationInformation
    extends WeatherValue
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    protected Boolean noPrecipitation;
    protected PrecipitationDetail precipitationDetail;
    protected ExtensionType precipitationInformationExtension;

    /**
     * Obtient la valeur de la propriété noPrecipitation.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isNoPrecipitation() {
        return noPrecipitation;
    }

    /**
     * Définit la valeur de la propriété noPrecipitation.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setNoPrecipitation(Boolean value) {
        this.noPrecipitation = value;
    }

    public boolean isSetNoPrecipitation() {
        return (this.noPrecipitation!= null);
    }

    /**
     * Obtient la valeur de la propriété precipitationDetail.
     * 
     * @return
     *     possible object is
     *     {@link PrecipitationDetail }
     *     
     */
    public PrecipitationDetail getPrecipitationDetail() {
        return precipitationDetail;
    }

    /**
     * Définit la valeur de la propriété precipitationDetail.
     * 
     * @param value
     *     allowed object is
     *     {@link PrecipitationDetail }
     *     
     */
    public void setPrecipitationDetail(PrecipitationDetail value) {
        this.precipitationDetail = value;
    }

    public boolean isSetPrecipitationDetail() {
        return (this.precipitationDetail!= null);
    }

    /**
     * Obtient la valeur de la propriété precipitationInformationExtension.
     * 
     * @return
     *     possible object is
     *     {@link ExtensionType }
     *     
     */
    public ExtensionType getPrecipitationInformationExtension() {
        return precipitationInformationExtension;
    }

    /**
     * Définit la valeur de la propriété precipitationInformationExtension.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtensionType }
     *     
     */
    public void setPrecipitationInformationExtension(ExtensionType value) {
        this.precipitationInformationExtension = value;
    }

    public boolean isSetPrecipitationInformationExtension() {
        return (this.precipitationInformationExtension!= null);
    }

}
