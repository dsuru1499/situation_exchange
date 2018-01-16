
package eu.datex2.schema._2_0rc1._2_0;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour ReferenceSettings complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="ReferenceSettings">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="predefinedLocationSetReference" type="{http://datex2.eu/schema/2_0RC1/2_0}Reference" minOccurs="0"/>
 *         &lt;element name="trafficStatusDefault" type="{http://datex2.eu/schema/2_0RC1/2_0}TrafficStatusEnum" minOccurs="0"/>
 *         &lt;element name="referenceSettingsExtension" type="{http://datex2.eu/schema/2_0RC1/2_0}ExtensionType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ReferenceSettings", propOrder = {
    "predefinedLocationSetReference",
    "trafficStatusDefault",
    "referenceSettingsExtension"
})
public class ReferenceSettings
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    protected String predefinedLocationSetReference;
    protected TrafficStatusEnum trafficStatusDefault;
    protected ExtensionType referenceSettingsExtension;

    /**
     * Obtient la valeur de la propriété predefinedLocationSetReference.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPredefinedLocationSetReference() {
        return predefinedLocationSetReference;
    }

    /**
     * Définit la valeur de la propriété predefinedLocationSetReference.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPredefinedLocationSetReference(String value) {
        this.predefinedLocationSetReference = value;
    }

    public boolean isSetPredefinedLocationSetReference() {
        return (this.predefinedLocationSetReference!= null);
    }

    /**
     * Obtient la valeur de la propriété trafficStatusDefault.
     * 
     * @return
     *     possible object is
     *     {@link TrafficStatusEnum }
     *     
     */
    public TrafficStatusEnum getTrafficStatusDefault() {
        return trafficStatusDefault;
    }

    /**
     * Définit la valeur de la propriété trafficStatusDefault.
     * 
     * @param value
     *     allowed object is
     *     {@link TrafficStatusEnum }
     *     
     */
    public void setTrafficStatusDefault(TrafficStatusEnum value) {
        this.trafficStatusDefault = value;
    }

    public boolean isSetTrafficStatusDefault() {
        return (this.trafficStatusDefault!= null);
    }

    /**
     * Obtient la valeur de la propriété referenceSettingsExtension.
     * 
     * @return
     *     possible object is
     *     {@link ExtensionType }
     *     
     */
    public ExtensionType getReferenceSettingsExtension() {
        return referenceSettingsExtension;
    }

    /**
     * Définit la valeur de la propriété referenceSettingsExtension.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtensionType }
     *     
     */
    public void setReferenceSettingsExtension(ExtensionType value) {
        this.referenceSettingsExtension = value;
    }

    public boolean isSetReferenceSettingsExtension() {
        return (this.referenceSettingsExtension!= null);
    }

}
