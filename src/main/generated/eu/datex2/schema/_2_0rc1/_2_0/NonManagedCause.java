
package eu.datex2.schema._2_0rc1._2_0;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour NonManagedCause complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="NonManagedCause">
 *   &lt;complexContent>
 *     &lt;extension base="{http://datex2.eu/schema/2_0RC1/2_0}Cause">
 *       &lt;sequence>
 *         &lt;element name="causeDescription" type="{http://datex2.eu/schema/2_0RC1/2_0}MultilingualString" minOccurs="0"/>
 *         &lt;element name="causeType" type="{http://datex2.eu/schema/2_0RC1/2_0}CauseTypeEnum" minOccurs="0"/>
 *         &lt;element name="nonManagedCauseExtension" type="{http://datex2.eu/schema/2_0RC1/2_0}ExtensionType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NonManagedCause", propOrder = {
    "causeDescription",
    "causeType",
    "nonManagedCauseExtension"
})
public class NonManagedCause
    extends Cause
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    protected MultilingualString causeDescription;
    protected CauseTypeEnum causeType;
    protected ExtensionType nonManagedCauseExtension;

    /**
     * Obtient la valeur de la propriété causeDescription.
     * 
     * @return
     *     possible object is
     *     {@link MultilingualString }
     *     
     */
    public MultilingualString getCauseDescription() {
        return causeDescription;
    }

    /**
     * Définit la valeur de la propriété causeDescription.
     * 
     * @param value
     *     allowed object is
     *     {@link MultilingualString }
     *     
     */
    public void setCauseDescription(MultilingualString value) {
        this.causeDescription = value;
    }

    public boolean isSetCauseDescription() {
        return (this.causeDescription!= null);
    }

    /**
     * Obtient la valeur de la propriété causeType.
     * 
     * @return
     *     possible object is
     *     {@link CauseTypeEnum }
     *     
     */
    public CauseTypeEnum getCauseType() {
        return causeType;
    }

    /**
     * Définit la valeur de la propriété causeType.
     * 
     * @param value
     *     allowed object is
     *     {@link CauseTypeEnum }
     *     
     */
    public void setCauseType(CauseTypeEnum value) {
        this.causeType = value;
    }

    public boolean isSetCauseType() {
        return (this.causeType!= null);
    }

    /**
     * Obtient la valeur de la propriété nonManagedCauseExtension.
     * 
     * @return
     *     possible object is
     *     {@link ExtensionType }
     *     
     */
    public ExtensionType getNonManagedCauseExtension() {
        return nonManagedCauseExtension;
    }

    /**
     * Définit la valeur de la propriété nonManagedCauseExtension.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtensionType }
     *     
     */
    public void setNonManagedCauseExtension(ExtensionType value) {
        this.nonManagedCauseExtension = value;
    }

    public boolean isSetNonManagedCauseExtension() {
        return (this.nonManagedCauseExtension!= null);
    }

}
