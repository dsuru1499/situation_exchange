
package uk.org.siri.siri;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Type for effect of EQUIPMENT availability change on impaired access users.
 * 
 * <p>Classe Java pour MobilityDisruptionStructure complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="MobilityDisruptionStructure">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="MobilityImpairedAccess" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element ref="{http://www.siri.org.uk/siri}AccessFacility" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MobilityDisruptionStructure", propOrder = {
    "mobilityImpairedAccess",
    "accessFacility"
})
public class MobilityDisruptionStructure
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "MobilityImpairedAccess")
    protected boolean mobilityImpairedAccess;
    @XmlElement(name = "AccessFacility", defaultValue = "unknown")
    protected List<AccessFacilityEnumeration> accessFacility;

    /**
     * Obtient la valeur de la propriété mobilityImpairedAccess.
     * 
     */
    public boolean isMobilityImpairedAccess() {
        return mobilityImpairedAccess;
    }

    /**
     * Définit la valeur de la propriété mobilityImpairedAccess.
     * 
     */
    public void setMobilityImpairedAccess(boolean value) {
        this.mobilityImpairedAccess = value;
    }

    public boolean isSetMobilityImpairedAccess() {
        return true;
    }

    /**
     * Classification of Mobility Facility type - Based on Tpeg pti23.Gets the value of the accessFacility property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the accessFacility property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAccessFacility().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AccessFacilityEnumeration }
     * 
     * 
     */
    public List<AccessFacilityEnumeration> getAccessFacility() {
        if (accessFacility == null) {
            accessFacility = new ArrayList<AccessFacilityEnumeration>();
        }
        return this.accessFacility;
    }

    public boolean isSetAccessFacility() {
        return ((this.accessFacility!= null)&&(!this.accessFacility.isEmpty()));
    }

    public void unsetAccessFacility() {
        this.accessFacility = null;
    }

}
