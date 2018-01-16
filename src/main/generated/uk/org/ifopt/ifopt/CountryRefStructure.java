
package uk.org.ifopt.ifopt;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;


/**
 * Type for reference to a Country identifier.
 * 
 * <p>Classe Java pour CountryRefStructure complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="CountryRefStructure">
 *   &lt;simpleContent>
 *     &lt;extension base="&lt;http://www.ifopt.org.uk/ifopt>CountryCodeType">
 *     &lt;/extension>
 *   &lt;/simpleContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CountryRefStructure", propOrder = {
    "value"
})
public class CountryRefStructure
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlValue
    protected IanaCountryTldEnumeration value;

    /**
     * Type for Country identifier.
     * 
     * @return
     *     possible object is
     *     {@link IanaCountryTldEnumeration }
     *     
     */
    public IanaCountryTldEnumeration getValue() {
        return value;
    }

    /**
     * Définit la valeur de la propriété value.
     * 
     * @param value
     *     allowed object is
     *     {@link IanaCountryTldEnumeration }
     *     
     */
    public void setValue(IanaCountryTldEnumeration value) {
        this.value = value;
    }

    public boolean isSetValue() {
        return (this.value!= null);
    }

}
