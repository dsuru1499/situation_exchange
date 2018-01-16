
package eu.datex2.schema._2_0rc1._2_0;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour GenericSituationRecord complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="GenericSituationRecord">
 *   &lt;complexContent>
 *     &lt;extension base="{http://datex2.eu/schema/2_0RC1/2_0}SituationRecord">
 *       &lt;sequence>
 *         &lt;element name="genericSituationRecordName" type="{http://datex2.eu/schema/2_0RC1/2_0}String"/>
 *         &lt;element name="genericSituationRecordExtension" type="{http://datex2.eu/schema/2_0RC1/2_0}ExtensionType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GenericSituationRecord", propOrder = {
    "genericSituationRecordName",
    "genericSituationRecordExtension"
})
public abstract class GenericSituationRecord
    extends SituationRecord
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(required = true)
    protected String genericSituationRecordName;
    protected ExtensionType genericSituationRecordExtension;

    /**
     * Obtient la valeur de la propriété genericSituationRecordName.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGenericSituationRecordName() {
        return genericSituationRecordName;
    }

    /**
     * Définit la valeur de la propriété genericSituationRecordName.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGenericSituationRecordName(String value) {
        this.genericSituationRecordName = value;
    }

    public boolean isSetGenericSituationRecordName() {
        return (this.genericSituationRecordName!= null);
    }

    /**
     * Obtient la valeur de la propriété genericSituationRecordExtension.
     * 
     * @return
     *     possible object is
     *     {@link ExtensionType }
     *     
     */
    public ExtensionType getGenericSituationRecordExtension() {
        return genericSituationRecordExtension;
    }

    /**
     * Définit la valeur de la propriété genericSituationRecordExtension.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtensionType }
     *     
     */
    public void setGenericSituationRecordExtension(ExtensionType value) {
        this.genericSituationRecordExtension = value;
    }

    public boolean isSetGenericSituationRecordExtension() {
        return (this.genericSituationRecordExtension!= null);
    }

}
