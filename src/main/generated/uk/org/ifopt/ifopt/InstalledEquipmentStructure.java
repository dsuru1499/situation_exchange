
package uk.org.ifopt.ifopt;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * Type for INSTALLED EQUIPMENT.
 * 
 * <p>Classe Java pour InstalledEquipmentStructure complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="InstalledEquipmentStructure">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.ifopt.org.uk/ifopt}AbstractEquipmentStructure">
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InstalledEquipmentStructure")
@XmlSeeAlso({
    PlaceEquipmentStructure.class,
    LocalServiceStructure.class
})
public abstract class InstalledEquipmentStructure
    extends AbstractEquipmentStructure
    implements Serializable
{

    private final static long serialVersionUID = 1L;

}
