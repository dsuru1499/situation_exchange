
package uk.org.siri.siri;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * Type for error.
 * 
 * <p>Classe Java pour BeyondDataHorizonErrorStructure complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="BeyondDataHorizonErrorStructure">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.siri.org.uk/siri}ErrorCodeStructure">
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BeyondDataHorizonErrorStructure")
public class BeyondDataHorizonErrorStructure
    extends ErrorCodeStructure
    implements Serializable
{

    private final static long serialVersionUID = 1L;

}
