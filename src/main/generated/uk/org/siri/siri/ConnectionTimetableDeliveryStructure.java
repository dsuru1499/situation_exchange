
package uk.org.siri.siri;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * Type for Delivery for Connection Protection.
 * 
 * <p>Classe Java pour ConnectionTimetableDeliveryStructure complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="ConnectionTimetableDeliveryStructure">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.siri.org.uk/siri}AbstractServiceDeliveryStructure">
 *       &lt;sequence>
 *         &lt;group ref="{http://www.siri.org.uk/siri}ConnectionTimetablePayloadGroup"/>
 *         &lt;element ref="{http://www.siri.org.uk/siri}Extensions" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="version" type="{http://www.siri.org.uk/siri}VersionString" default="2.0" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ConnectionTimetableDeliveryStructure", propOrder = {
    "timetabledFeederArrival",
    "timetabledFeederArrivalCancellation",
    "extensions"
})
public class ConnectionTimetableDeliveryStructure
    extends AbstractServiceDeliveryStructure
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "TimetabledFeederArrival")
    protected List<TimetabledFeederArrivalStructure> timetabledFeederArrival;
    @XmlElement(name = "TimetabledFeederArrivalCancellation")
    protected List<TimetabledFeederArrivalCancellationStructure> timetabledFeederArrivalCancellation;
    @XmlElement(name = "Extensions")
    protected ExtensionsStructure extensions;
    @XmlAttribute(name = "version")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String version;

    /**
     * Gets the value of the timetabledFeederArrival property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the timetabledFeederArrival property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTimetabledFeederArrival().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TimetabledFeederArrivalStructure }
     * 
     * 
     */
    public List<TimetabledFeederArrivalStructure> getTimetabledFeederArrival() {
        if (timetabledFeederArrival == null) {
            timetabledFeederArrival = new ArrayList<TimetabledFeederArrivalStructure>();
        }
        return this.timetabledFeederArrival;
    }

    public boolean isSetTimetabledFeederArrival() {
        return ((this.timetabledFeederArrival!= null)&&(!this.timetabledFeederArrival.isEmpty()));
    }

    public void unsetTimetabledFeederArrival() {
        this.timetabledFeederArrival = null;
    }

    /**
     * Gets the value of the timetabledFeederArrivalCancellation property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the timetabledFeederArrivalCancellation property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTimetabledFeederArrivalCancellation().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TimetabledFeederArrivalCancellationStructure }
     * 
     * 
     */
    public List<TimetabledFeederArrivalCancellationStructure> getTimetabledFeederArrivalCancellation() {
        if (timetabledFeederArrivalCancellation == null) {
            timetabledFeederArrivalCancellation = new ArrayList<TimetabledFeederArrivalCancellationStructure>();
        }
        return this.timetabledFeederArrivalCancellation;
    }

    public boolean isSetTimetabledFeederArrivalCancellation() {
        return ((this.timetabledFeederArrivalCancellation!= null)&&(!this.timetabledFeederArrivalCancellation.isEmpty()));
    }

    public void unsetTimetabledFeederArrivalCancellation() {
        this.timetabledFeederArrivalCancellation = null;
    }

    /**
     * Obtient la valeur de la propriété extensions.
     * 
     * @return
     *     possible object is
     *     {@link ExtensionsStructure }
     *     
     */
    public ExtensionsStructure getExtensions() {
        return extensions;
    }

    /**
     * Définit la valeur de la propriété extensions.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtensionsStructure }
     *     
     */
    public void setExtensions(ExtensionsStructure value) {
        this.extensions = value;
    }

    public boolean isSetExtensions() {
        return (this.extensions!= null);
    }

    /**
     * Obtient la valeur de la propriété version.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVersion() {
        if (version == null) {
            return "2.0";
        } else {
            return version;
        }
    }

    /**
     * Définit la valeur de la propriété version.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVersion(String value) {
        this.version = value;
    }

    public boolean isSetVersion() {
        return (this.version!= null);
    }

}
