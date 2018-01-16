
package uk.org.siri.siri;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * Type for an Activity that references a previous Activity.
 * 
 * <p>Classe Java pour AbstractReferencingItemStructure complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="AbstractReferencingItemStructure">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.siri.org.uk/siri}AbstractItemStructure">
 *       &lt;sequence>
 *         &lt;element name="ItemRef" type="{http://www.siri.org.uk/siri}ItemRefStructure" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AbstractReferencingItemStructure", propOrder = {
    "itemRef"
})
@XmlSeeAlso({
    TimetabledFeederArrivalCancellationStructure.class,
    MonitoredStopVisitCancellationStructure.class,
    InfoMessageCancellationStructure.class,
    StopLineNoticeCancellationStructure.class,
    TimetabledStopVisitCancellationStructure.class,
    VehicleActivityCancellationStructure.class
})
public abstract class AbstractReferencingItemStructure
    extends AbstractItemStructure
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "ItemRef")
    protected ItemRefStructure itemRef;

    /**
     * Obtient la valeur de la propriété itemRef.
     * 
     * @return
     *     possible object is
     *     {@link ItemRefStructure }
     *     
     */
    public ItemRefStructure getItemRef() {
        return itemRef;
    }

    /**
     * Définit la valeur de la propriété itemRef.
     * 
     * @param value
     *     allowed object is
     *     {@link ItemRefStructure }
     *     
     */
    public void setItemRef(ItemRefStructure value) {
        this.itemRef = value;
    }

    public boolean isSetItemRef() {
        return (this.itemRef!= null);
    }

}
