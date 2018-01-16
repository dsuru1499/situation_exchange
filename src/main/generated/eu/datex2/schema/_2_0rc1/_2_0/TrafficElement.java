
package eu.datex2.schema._2_0rc1._2_0;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour TrafficElement complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="TrafficElement">
 *   &lt;complexContent>
 *     &lt;extension base="{http://datex2.eu/schema/2_0RC1/2_0}SituationRecord">
 *       &lt;sequence>
 *         &lt;element name="trafficElementExtension" type="{http://datex2.eu/schema/2_0RC1/2_0}ExtensionType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TrafficElement", propOrder = {
    "trafficElementExtension"
})
@XmlSeeAlso({
    Accident.class,
    EquipmentOrSystemFault.class,
    Conditions.class,
    Activity.class,
    AbnormalTraffic.class,
    Obstruction.class
})
public abstract class TrafficElement
    extends SituationRecord
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    protected ExtensionType trafficElementExtension;

    /**
     * Obtient la valeur de la propriété trafficElementExtension.
     * 
     * @return
     *     possible object is
     *     {@link ExtensionType }
     *     
     */
    public ExtensionType getTrafficElementExtension() {
        return trafficElementExtension;
    }

    /**
     * Définit la valeur de la propriété trafficElementExtension.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtensionType }
     *     
     */
    public void setTrafficElementExtension(ExtensionType value) {
        this.trafficElementExtension = value;
    }

    public boolean isSetTrafficElementExtension() {
        return (this.trafficElementExtension!= null);
    }

}
