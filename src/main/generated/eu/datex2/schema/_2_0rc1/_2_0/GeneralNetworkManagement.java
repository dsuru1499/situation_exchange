
package eu.datex2.schema._2_0rc1._2_0;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour GeneralNetworkManagement complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="GeneralNetworkManagement">
 *   &lt;complexContent>
 *     &lt;extension base="{http://datex2.eu/schema/2_0RC1/2_0}NetworkManagement">
 *       &lt;sequence>
 *         &lt;element name="generalNetworkManagementType" type="{http://datex2.eu/schema/2_0RC1/2_0}GeneralNetworkManagementTypeEnum"/>
 *         &lt;element name="trafficManuallyDirectedBy" type="{http://datex2.eu/schema/2_0RC1/2_0}PersonCategoryEnum" minOccurs="0"/>
 *         &lt;element name="generalNetworkManagementExtension" type="{http://datex2.eu/schema/2_0RC1/2_0}ExtensionType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GeneralNetworkManagement", propOrder = {
    "generalNetworkManagementType",
    "trafficManuallyDirectedBy",
    "generalNetworkManagementExtension"
})
public class GeneralNetworkManagement
    extends NetworkManagement
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(required = true)
    protected GeneralNetworkManagementTypeEnum generalNetworkManagementType;
    protected PersonCategoryEnum trafficManuallyDirectedBy;
    protected ExtensionType generalNetworkManagementExtension;

    /**
     * Obtient la valeur de la propriété generalNetworkManagementType.
     * 
     * @return
     *     possible object is
     *     {@link GeneralNetworkManagementTypeEnum }
     *     
     */
    public GeneralNetworkManagementTypeEnum getGeneralNetworkManagementType() {
        return generalNetworkManagementType;
    }

    /**
     * Définit la valeur de la propriété generalNetworkManagementType.
     * 
     * @param value
     *     allowed object is
     *     {@link GeneralNetworkManagementTypeEnum }
     *     
     */
    public void setGeneralNetworkManagementType(GeneralNetworkManagementTypeEnum value) {
        this.generalNetworkManagementType = value;
    }

    public boolean isSetGeneralNetworkManagementType() {
        return (this.generalNetworkManagementType!= null);
    }

    /**
     * Obtient la valeur de la propriété trafficManuallyDirectedBy.
     * 
     * @return
     *     possible object is
     *     {@link PersonCategoryEnum }
     *     
     */
    public PersonCategoryEnum getTrafficManuallyDirectedBy() {
        return trafficManuallyDirectedBy;
    }

    /**
     * Définit la valeur de la propriété trafficManuallyDirectedBy.
     * 
     * @param value
     *     allowed object is
     *     {@link PersonCategoryEnum }
     *     
     */
    public void setTrafficManuallyDirectedBy(PersonCategoryEnum value) {
        this.trafficManuallyDirectedBy = value;
    }

    public boolean isSetTrafficManuallyDirectedBy() {
        return (this.trafficManuallyDirectedBy!= null);
    }

    /**
     * Obtient la valeur de la propriété generalNetworkManagementExtension.
     * 
     * @return
     *     possible object is
     *     {@link ExtensionType }
     *     
     */
    public ExtensionType getGeneralNetworkManagementExtension() {
        return generalNetworkManagementExtension;
    }

    /**
     * Définit la valeur de la propriété generalNetworkManagementExtension.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtensionType }
     *     
     */
    public void setGeneralNetworkManagementExtension(ExtensionType value) {
        this.generalNetworkManagementExtension = value;
    }

    public boolean isSetGeneralNetworkManagementExtension() {
        return (this.generalNetworkManagementExtension!= null);
    }

}
