
package uk.org.siri.siri;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Type for Data supply Request.
 * 
 * <p>Classe Java pour DataSupplyRequestStructure complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="DataSupplyRequestStructure">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.siri.org.uk/siri}ConsumerRequestEndpointStructure">
 *       &lt;sequence>
 *         &lt;group ref="{http://www.siri.org.uk/siri}DataSupplyTopicGroup"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DataSupplyRequestStructure", propOrder = {
    "notificationRef",
    "allData"
})
public class DataSupplyRequestStructure
    extends ConsumerRequestEndpointStructure
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "NotificationRef")
    protected MessageRefStructure notificationRef;
    @XmlElement(name = "AllData", defaultValue = "false")
    protected Boolean allData;

    /**
     * Obtient la valeur de la propriété notificationRef.
     * 
     * @return
     *     possible object is
     *     {@link MessageRefStructure }
     *     
     */
    public MessageRefStructure getNotificationRef() {
        return notificationRef;
    }

    /**
     * Définit la valeur de la propriété notificationRef.
     * 
     * @param value
     *     allowed object is
     *     {@link MessageRefStructure }
     *     
     */
    public void setNotificationRef(MessageRefStructure value) {
        this.notificationRef = value;
    }

    public boolean isSetNotificationRef() {
        return (this.notificationRef!= null);
    }

    /**
     * Obtient la valeur de la propriété allData.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAllData() {
        return allData;
    }

    /**
     * Définit la valeur de la propriété allData.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAllData(Boolean value) {
        this.allData = value;
    }

    public boolean isSetAllData() {
        return (this.allData!= null);
    }

}
