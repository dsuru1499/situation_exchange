
package eu.datex2.schema._2_0rc1._2_0;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour AuthorityOperation complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="AuthorityOperation">
 *   &lt;complexContent>
 *     &lt;extension base="{http://datex2.eu/schema/2_0RC1/2_0}Activity">
 *       &lt;sequence>
 *         &lt;element name="authorityOperationType" type="{http://datex2.eu/schema/2_0RC1/2_0}AuthorityOperationTypeEnum"/>
 *         &lt;element name="authorityOperationExtension" type="{http://datex2.eu/schema/2_0RC1/2_0}ExtensionType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AuthorityOperation", propOrder = {
    "authorityOperationType",
    "authorityOperationExtension"
})
public class AuthorityOperation
    extends Activity
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(required = true)
    protected AuthorityOperationTypeEnum authorityOperationType;
    protected ExtensionType authorityOperationExtension;

    /**
     * Obtient la valeur de la propriété authorityOperationType.
     * 
     * @return
     *     possible object is
     *     {@link AuthorityOperationTypeEnum }
     *     
     */
    public AuthorityOperationTypeEnum getAuthorityOperationType() {
        return authorityOperationType;
    }

    /**
     * Définit la valeur de la propriété authorityOperationType.
     * 
     * @param value
     *     allowed object is
     *     {@link AuthorityOperationTypeEnum }
     *     
     */
    public void setAuthorityOperationType(AuthorityOperationTypeEnum value) {
        this.authorityOperationType = value;
    }

    public boolean isSetAuthorityOperationType() {
        return (this.authorityOperationType!= null);
    }

    /**
     * Obtient la valeur de la propriété authorityOperationExtension.
     * 
     * @return
     *     possible object is
     *     {@link ExtensionType }
     *     
     */
    public ExtensionType getAuthorityOperationExtension() {
        return authorityOperationExtension;
    }

    /**
     * Définit la valeur de la propriété authorityOperationExtension.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtensionType }
     *     
     */
    public void setAuthorityOperationExtension(ExtensionType value) {
        this.authorityOperationExtension = value;
    }

    public boolean isSetAuthorityOperationExtension() {
        return (this.authorityOperationExtension!= null);
    }

}
