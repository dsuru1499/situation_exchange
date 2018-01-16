
package uk.org.siri.siri;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Type for Transport MODEs.
 * 
 * <p>Classe Java pour ModesStructure complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="ModesStructure">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Mode" type="{http://www.siri.org.uk/siri}AllModesEnumeration" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *       &lt;attribute name="Exclude" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ModesStructure", propOrder = {
    "mode"
})
public class ModesStructure
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "Mode", required = true)
    protected List<AllModesEnumeration> mode;
    @XmlAttribute(name = "Exclude")
    protected Boolean exclude;

    /**
     * Gets the value of the mode property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the mode property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMode().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AllModesEnumeration }
     * 
     * 
     */
    public List<AllModesEnumeration> getMode() {
        if (mode == null) {
            mode = new ArrayList<AllModesEnumeration>();
        }
        return this.mode;
    }

    public boolean isSetMode() {
        return ((this.mode!= null)&&(!this.mode.isEmpty()));
    }

    public void unsetMode() {
        this.mode = null;
    }

    /**
     * Obtient la valeur de la propriété exclude.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isExclude() {
        if (exclude == null) {
            return false;
        } else {
            return exclude;
        }
    }

    /**
     * Définit la valeur de la propriété exclude.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setExclude(boolean value) {
        this.exclude = value;
    }

    public boolean isSetExclude() {
        return (this.exclude!= null);
    }

    public void unsetExclude() {
        this.exclude = null;
    }

}
