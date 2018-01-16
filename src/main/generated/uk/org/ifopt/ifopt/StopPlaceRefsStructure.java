
package uk.org.ifopt.ifopt;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Type for a collection of one or more references to a STOP PLACE.
 * 
 * <p>Classe Java pour StopPlaceRefsStructure complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="StopPlaceRefsStructure">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.ifopt.org.uk/ifopt}StopPlaceRef" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "StopPlaceRefsStructure", propOrder = {
    "stopPlaceRef"
})
public class StopPlaceRefsStructure
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "StopPlaceRef", required = true)
    protected List<StopPlaceRefStructure> stopPlaceRef;

    /**
     * Gets the value of the stopPlaceRef property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the stopPlaceRef property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getStopPlaceRef().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link StopPlaceRefStructure }
     * 
     * 
     */
    public List<StopPlaceRefStructure> getStopPlaceRef() {
        if (stopPlaceRef == null) {
            stopPlaceRef = new ArrayList<StopPlaceRefStructure>();
        }
        return this.stopPlaceRef;
    }

    public boolean isSetStopPlaceRef() {
        return ((this.stopPlaceRef!= null)&&(!this.stopPlaceRef.isEmpty()));
    }

    public void unsetStopPlaceRef() {
        this.stopPlaceRef = null;
    }

}
