
package uk.org.ifopt.ifopt;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Type for a collection of one or more references to ADMINISTRATIVE ZONEs.
 * 
 * <p>Classe Java pour AdministrativeAreaRefsStructure complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="AdministrativeAreaRefsStructure">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="AdministrativeAreaRef" type="{http://www.ifopt.org.uk/ifopt}AdministrativeAreaVersionedRefStructure" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AdministrativeAreaRefsStructure", propOrder = {
    "administrativeAreaRef"
})
public class AdministrativeAreaRefsStructure
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "AdministrativeAreaRef", required = true)
    protected List<AdministrativeAreaVersionedRefStructure> administrativeAreaRef;

    /**
     * Gets the value of the administrativeAreaRef property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the administrativeAreaRef property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAdministrativeAreaRef().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AdministrativeAreaVersionedRefStructure }
     * 
     * 
     */
    public List<AdministrativeAreaVersionedRefStructure> getAdministrativeAreaRef() {
        if (administrativeAreaRef == null) {
            administrativeAreaRef = new ArrayList<AdministrativeAreaVersionedRefStructure>();
        }
        return this.administrativeAreaRef;
    }

    public boolean isSetAdministrativeAreaRef() {
        return ((this.administrativeAreaRef!= null)&&(!this.administrativeAreaRef.isEmpty()));
    }

    public void unsetAdministrativeAreaRef() {
        this.administrativeAreaRef = null;
    }

}
