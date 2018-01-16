
package eu.datex2.schema._2_0rc1._2_0;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour Validity complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="Validity">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="validityStatus" type="{http://datex2.eu/schema/2_0RC1/2_0}ValidityStatusEnum"/>
 *         &lt;element name="overrunning" type="{http://datex2.eu/schema/2_0RC1/2_0}Boolean" minOccurs="0"/>
 *         &lt;element name="validityTimeSpecification" type="{http://datex2.eu/schema/2_0RC1/2_0}OverallPeriod"/>
 *         &lt;element name="validityExtension" type="{http://datex2.eu/schema/2_0RC1/2_0}ExtensionType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Validity", propOrder = {
    "validityStatus",
    "overrunning",
    "validityTimeSpecification",
    "validityExtension"
})
public class Validity
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(required = true)
    protected ValidityStatusEnum validityStatus;
    protected Boolean overrunning;
    @XmlElement(required = true)
    protected OverallPeriod validityTimeSpecification;
    protected ExtensionType validityExtension;

    /**
     * Obtient la valeur de la propriété validityStatus.
     * 
     * @return
     *     possible object is
     *     {@link ValidityStatusEnum }
     *     
     */
    public ValidityStatusEnum getValidityStatus() {
        return validityStatus;
    }

    /**
     * Définit la valeur de la propriété validityStatus.
     * 
     * @param value
     *     allowed object is
     *     {@link ValidityStatusEnum }
     *     
     */
    public void setValidityStatus(ValidityStatusEnum value) {
        this.validityStatus = value;
    }

    public boolean isSetValidityStatus() {
        return (this.validityStatus!= null);
    }

    /**
     * Obtient la valeur de la propriété overrunning.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isOverrunning() {
        return overrunning;
    }

    /**
     * Définit la valeur de la propriété overrunning.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setOverrunning(Boolean value) {
        this.overrunning = value;
    }

    public boolean isSetOverrunning() {
        return (this.overrunning!= null);
    }

    /**
     * Obtient la valeur de la propriété validityTimeSpecification.
     * 
     * @return
     *     possible object is
     *     {@link OverallPeriod }
     *     
     */
    public OverallPeriod getValidityTimeSpecification() {
        return validityTimeSpecification;
    }

    /**
     * Définit la valeur de la propriété validityTimeSpecification.
     * 
     * @param value
     *     allowed object is
     *     {@link OverallPeriod }
     *     
     */
    public void setValidityTimeSpecification(OverallPeriod value) {
        this.validityTimeSpecification = value;
    }

    public boolean isSetValidityTimeSpecification() {
        return (this.validityTimeSpecification!= null);
    }

    /**
     * Obtient la valeur de la propriété validityExtension.
     * 
     * @return
     *     possible object is
     *     {@link ExtensionType }
     *     
     */
    public ExtensionType getValidityExtension() {
        return validityExtension;
    }

    /**
     * Définit la valeur de la propriété validityExtension.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtensionType }
     *     
     */
    public void setValidityExtension(ExtensionType value) {
        this.validityExtension = value;
    }

    public boolean isSetValidityExtension() {
        return (this.validityExtension!= null);
    }

}
