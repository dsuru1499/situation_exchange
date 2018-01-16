
package eu.datex2.schema._2_0rc1._2_0;

import java.io.Serializable;
import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour AxleWeight complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="AxleWeight">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="axlePositionIdentifier" type="{http://datex2.eu/schema/2_0RC1/2_0}NonNegativeInteger"/>
 *         &lt;element name="axleWeight" type="{http://datex2.eu/schema/2_0RC1/2_0}Tonnes" minOccurs="0"/>
 *         &lt;element name="maximumPermittedAxleWeight" type="{http://datex2.eu/schema/2_0RC1/2_0}Tonnes" minOccurs="0"/>
 *         &lt;element name="axleWeightExtension" type="{http://datex2.eu/schema/2_0RC1/2_0}ExtensionType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AxleWeight", propOrder = {
    "axlePositionIdentifier",
    "axleWeight",
    "maximumPermittedAxleWeight",
    "axleWeightExtension"
})
public class AxleWeight
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(required = true)
    protected BigInteger axlePositionIdentifier;
    protected Float axleWeight;
    protected Float maximumPermittedAxleWeight;
    protected ExtensionType axleWeightExtension;

    /**
     * Obtient la valeur de la propriété axlePositionIdentifier.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getAxlePositionIdentifier() {
        return axlePositionIdentifier;
    }

    /**
     * Définit la valeur de la propriété axlePositionIdentifier.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setAxlePositionIdentifier(BigInteger value) {
        this.axlePositionIdentifier = value;
    }

    public boolean isSetAxlePositionIdentifier() {
        return (this.axlePositionIdentifier!= null);
    }

    /**
     * Obtient la valeur de la propriété axleWeight.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getAxleWeight() {
        return axleWeight;
    }

    /**
     * Définit la valeur de la propriété axleWeight.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setAxleWeight(Float value) {
        this.axleWeight = value;
    }

    public boolean isSetAxleWeight() {
        return (this.axleWeight!= null);
    }

    /**
     * Obtient la valeur de la propriété maximumPermittedAxleWeight.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getMaximumPermittedAxleWeight() {
        return maximumPermittedAxleWeight;
    }

    /**
     * Définit la valeur de la propriété maximumPermittedAxleWeight.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setMaximumPermittedAxleWeight(Float value) {
        this.maximumPermittedAxleWeight = value;
    }

    public boolean isSetMaximumPermittedAxleWeight() {
        return (this.maximumPermittedAxleWeight!= null);
    }

    /**
     * Obtient la valeur de la propriété axleWeightExtension.
     * 
     * @return
     *     possible object is
     *     {@link ExtensionType }
     *     
     */
    public ExtensionType getAxleWeightExtension() {
        return axleWeightExtension;
    }

    /**
     * Définit la valeur de la propriété axleWeightExtension.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtensionType }
     *     
     */
    public void setAxleWeightExtension(ExtensionType value) {
        this.axleWeightExtension = value;
    }

    public boolean isSetAxleWeightExtension() {
        return (this.axleWeightExtension!= null);
    }

}
