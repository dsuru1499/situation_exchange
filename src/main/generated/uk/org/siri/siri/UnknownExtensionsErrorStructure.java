
package uk.org.siri.siri;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Type for Unknown Extensions Error:. +SIRI v2.0.
 * 
 * <p>Classe Java pour UnknownExtensionsErrorStructure complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="UnknownExtensionsErrorStructure">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.siri.org.uk/siri}ErrorCodeStructure">
 *       &lt;sequence>
 *         &lt;element name="ExtensionName" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UnknownExtensionsErrorStructure", propOrder = {
    "extensionName"
})
public class UnknownExtensionsErrorStructure
    extends ErrorCodeStructure
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "ExtensionName")
    protected List<String> extensionName;

    /**
     * Gets the value of the extensionName property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the extensionName property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getExtensionName().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getExtensionName() {
        if (extensionName == null) {
            extensionName = new ArrayList<String>();
        }
        return this.extensionName;
    }

    public boolean isSetExtensionName() {
        return ((this.extensionName!= null)&&(!this.extensionName.isEmpty()));
    }

    public void unsetExtensionName() {
        this.extensionName = null;
    }

}
