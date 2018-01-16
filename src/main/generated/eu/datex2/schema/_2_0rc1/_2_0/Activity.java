
package eu.datex2.schema._2_0rc1._2_0;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour Activity complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="Activity">
 *   &lt;complexContent>
 *     &lt;extension base="{http://datex2.eu/schema/2_0RC1/2_0}TrafficElement">
 *       &lt;sequence>
 *         &lt;element name="mobilityOfActivity" type="{http://datex2.eu/schema/2_0RC1/2_0}Mobility" minOccurs="0"/>
 *         &lt;element name="activityExtension" type="{http://datex2.eu/schema/2_0RC1/2_0}ExtensionType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Activity", propOrder = {
    "mobilityOfActivity",
    "activityExtension"
})
@XmlSeeAlso({
    DisturbanceActivity.class,
    PublicEvent.class,
    AuthorityOperation.class
})
public abstract class Activity
    extends TrafficElement
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    protected Mobility mobilityOfActivity;
    protected ExtensionType activityExtension;

    /**
     * Obtient la valeur de la propriété mobilityOfActivity.
     * 
     * @return
     *     possible object is
     *     {@link Mobility }
     *     
     */
    public Mobility getMobilityOfActivity() {
        return mobilityOfActivity;
    }

    /**
     * Définit la valeur de la propriété mobilityOfActivity.
     * 
     * @param value
     *     allowed object is
     *     {@link Mobility }
     *     
     */
    public void setMobilityOfActivity(Mobility value) {
        this.mobilityOfActivity = value;
    }

    public boolean isSetMobilityOfActivity() {
        return (this.mobilityOfActivity!= null);
    }

    /**
     * Obtient la valeur de la propriété activityExtension.
     * 
     * @return
     *     possible object is
     *     {@link ExtensionType }
     *     
     */
    public ExtensionType getActivityExtension() {
        return activityExtension;
    }

    /**
     * Définit la valeur de la propriété activityExtension.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtensionType }
     *     
     */
    public void setActivityExtension(ExtensionType value) {
        this.activityExtension = value;
    }

    public boolean isSetActivityExtension() {
        return (this.activityExtension!= null);
    }

}
