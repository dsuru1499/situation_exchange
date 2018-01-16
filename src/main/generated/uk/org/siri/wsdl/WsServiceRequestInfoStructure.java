
package uk.org.siri.wsdl;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import uk.org.siri.siri.ContextualisedRequestStructure;


/**
 * <p>Classe Java pour WsServiceRequestInfoStructure complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="WsServiceRequestInfoStructure">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.siri.org.uk/siri}ContextualisedRequestStructure">
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "WsServiceRequestInfoStructure")
public class WsServiceRequestInfoStructure
    extends ContextualisedRequestStructure
    implements Serializable
{

    private final static long serialVersionUID = 1L;

}
