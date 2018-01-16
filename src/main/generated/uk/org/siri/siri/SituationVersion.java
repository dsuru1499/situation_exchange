
package uk.org.siri.siri;

import java.io.Serializable;
import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;


/**
 * Type for SITUATION version number if entry is update to a previous version. Unique within IncidentNumber. Monotonically increasing within IncidentNumber. Any values for classification, description, affects, effects that are present in an update replace any values on previous incidents and updates with the same identifier. Values that are not updated remain in effect.
 * 
 * <p>Classe Java pour SituationVersion complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="SituationVersion">
 *   &lt;simpleContent>
 *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>integer">
 *     &lt;/extension>
 *   &lt;/simpleContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SituationVersion", propOrder = {
    "value"
})
public class SituationVersion
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlValue
    protected BigInteger value;

    /**
     * Obtient la valeur de la propriété value.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getValue() {
        return value;
    }

    /**
     * Définit la valeur de la propriété value.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setValue(BigInteger value) {
        this.value = value;
    }

    public boolean isSetValue() {
        return (this.value!= null);
    }

}
