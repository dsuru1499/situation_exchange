
package uk.org.ifopt.ifopt;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * Type for reference to VEHICLE STOPPING POSITION.
 * 
 * <p>Classe Java pour VehicleStoppingPositionRefStructure complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="VehicleStoppingPositionRefStructure">
 *   &lt;simpleContent>
 *     &lt;extension base="&lt;http://www.ifopt.org.uk/ifopt>StopPlaceSpaceRefStructure">
 *     &lt;/extension>
 *   &lt;/simpleContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VehicleStoppingPositionRefStructure")
public class VehicleStoppingPositionRefStructure
    extends StopPlaceSpaceRefStructure
    implements Serializable
{

    private final static long serialVersionUID = 1L;

}
