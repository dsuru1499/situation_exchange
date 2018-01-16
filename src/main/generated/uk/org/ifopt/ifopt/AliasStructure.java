
package uk.org.ifopt.ifopt;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.NormalizedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * Alternative Private Code.
 * 
 * <p>Classe Java pour AliasStructure complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="AliasStructure">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="PrivateCode" type="{http://www.ifopt.org.uk/ifopt}PrivateCodeType"/>
 *         &lt;element name="IdentifierType" type="{http://www.w3.org/2001/XMLSchema}normalizedString" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AliasStructure", propOrder = {
    "privateCode",
    "identifierType"
})
public class AliasStructure
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "PrivateCode", required = true)
    protected String privateCode;
    @XmlElement(name = "IdentifierType")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String identifierType;

    /**
     * Obtient la valeur de la propriété privateCode.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrivateCode() {
        return privateCode;
    }

    /**
     * Définit la valeur de la propriété privateCode.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrivateCode(String value) {
        this.privateCode = value;
    }

    public boolean isSetPrivateCode() {
        return (this.privateCode!= null);
    }

    /**
     * Obtient la valeur de la propriété identifierType.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdentifierType() {
        return identifierType;
    }

    /**
     * Définit la valeur de la propriété identifierType.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdentifierType(String value) {
        this.identifierType = value;
    }

    public boolean isSetIdentifierType() {
        return (this.identifierType!= null);
    }

}
