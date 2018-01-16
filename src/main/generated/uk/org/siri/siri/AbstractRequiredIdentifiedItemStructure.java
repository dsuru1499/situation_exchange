
package uk.org.siri.siri;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * Type for an Activity that can be referenced.
 * 
 * <p>Classe Java pour AbstractRequiredIdentifiedItemStructure complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="AbstractRequiredIdentifiedItemStructure">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.siri.org.uk/siri}AbstractItemStructure">
 *       &lt;sequence>
 *         &lt;element name="ItemIdentifier" type="{http://www.siri.org.uk/siri}ItemIdentifierType"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AbstractRequiredIdentifiedItemStructure", propOrder = {
    "itemIdentifier"
})
@XmlSeeAlso({
    StopNoticeStructure.class
})
public abstract class AbstractRequiredIdentifiedItemStructure
    extends AbstractItemStructure
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "ItemIdentifier", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String itemIdentifier;

    /**
     * Obtient la valeur de la propriété itemIdentifier.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getItemIdentifier() {
        return itemIdentifier;
    }

    /**
     * Définit la valeur de la propriété itemIdentifier.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setItemIdentifier(String value) {
        this.itemIdentifier = value;
    }

    public boolean isSetItemIdentifier() {
        return (this.itemIdentifier!= null);
    }

}
