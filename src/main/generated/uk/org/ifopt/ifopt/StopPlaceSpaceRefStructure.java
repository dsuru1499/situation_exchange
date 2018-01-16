
package uk.org.ifopt.ifopt;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * Type for reference to STOP PLACE Space.
 * 
 * <p>Classe Java pour StopPlaceSpaceRefStructure complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="StopPlaceSpaceRefStructure">
 *   &lt;simpleContent>
 *     &lt;extension base="&lt;http://www.ifopt.org.uk/ifopt>StopPlaceComponentRefStructure">
 *     &lt;/extension>
 *   &lt;/simpleContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "StopPlaceSpaceRefStructure")
@XmlSeeAlso({
    VehicleStoppingPositionRefStructure.class,
    QuayRefStructure.class,
    AccessSpaceRefStructure.class,
    StopPlaceEntranceRefStructure.class,
    BoardingPositionRefStructure.class,
    VehicleStoppingPlaceRefStructure.class
})
public class StopPlaceSpaceRefStructure
    extends StopPlaceComponentRefStructure
    implements Serializable
{

    private final static long serialVersionUID = 1L;

}
