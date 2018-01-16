
package eu.datex2.schema._2_0rc1._2_0;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour TimePeriodOfDay complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="TimePeriodOfDay">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="timePeriodOfDayExtension" type="{http://datex2.eu/schema/2_0RC1/2_0}ExtensionType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TimePeriodOfDay", propOrder = {
    "timePeriodOfDayExtension"
})
@XmlSeeAlso({
    TimePeriodByHour.class
})
public abstract class TimePeriodOfDay
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    protected ExtensionType timePeriodOfDayExtension;

    /**
     * Obtient la valeur de la propriété timePeriodOfDayExtension.
     * 
     * @return
     *     possible object is
     *     {@link ExtensionType }
     *     
     */
    public ExtensionType getTimePeriodOfDayExtension() {
        return timePeriodOfDayExtension;
    }

    /**
     * Définit la valeur de la propriété timePeriodOfDayExtension.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtensionType }
     *     
     */
    public void setTimePeriodOfDayExtension(ExtensionType value) {
        this.timePeriodOfDayExtension = value;
    }

    public boolean isSetTimePeriodOfDayExtension() {
        return (this.timePeriodOfDayExtension!= null);
    }

}
