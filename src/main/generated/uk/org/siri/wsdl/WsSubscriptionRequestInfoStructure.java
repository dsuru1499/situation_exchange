
package uk.org.siri.wsdl;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import uk.org.siri.siri.AbstractSubscriptionRequestStructure;


/**
 * <p>Classe Java pour WsSubscriptionRequestInfoStructure complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="WsSubscriptionRequestInfoStructure">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.siri.org.uk/siri}AbstractSubscriptionRequestStructure">
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "WsSubscriptionRequestInfoStructure")
public class WsSubscriptionRequestInfoStructure
    extends AbstractSubscriptionRequestStructure
    implements Serializable
{

    private final static long serialVersionUID = 1L;

}
