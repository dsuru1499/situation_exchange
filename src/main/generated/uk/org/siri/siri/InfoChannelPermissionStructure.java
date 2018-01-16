
package uk.org.siri.siri;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Type for Info Channel Permission.
 * 
 * <p>Classe Java pour InfoChannelPermissionStructure complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="InfoChannelPermissionStructure">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.siri.org.uk/siri}AbstractTopicPermissionStructure">
 *       &lt;sequence>
 *         &lt;element name="InfoChannelRef" type="{http://www.siri.org.uk/siri}InfoChannelRefStructure"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InfoChannelPermissionStructure", propOrder = {
    "infoChannelRef"
})
public class InfoChannelPermissionStructure
    extends AbstractTopicPermissionStructure
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "InfoChannelRef", required = true)
    protected InfoChannelRefStructure infoChannelRef;

    /**
     * Obtient la valeur de la propriété infoChannelRef.
     * 
     * @return
     *     possible object is
     *     {@link InfoChannelRefStructure }
     *     
     */
    public InfoChannelRefStructure getInfoChannelRef() {
        return infoChannelRef;
    }

    /**
     * Définit la valeur de la propriété infoChannelRef.
     * 
     * @param value
     *     allowed object is
     *     {@link InfoChannelRefStructure }
     *     
     */
    public void setInfoChannelRef(InfoChannelRefStructure value) {
        this.infoChannelRef = value;
    }

    public boolean isSetInfoChannelRef() {
        return (this.infoChannelRef!= null);
    }

}
