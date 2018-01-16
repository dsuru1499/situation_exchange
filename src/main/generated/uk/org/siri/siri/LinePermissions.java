
package uk.org.siri.siri;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour anonymous complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice>
 *         &lt;element ref="{http://www.siri.org.uk/siri}AllowAll"/>
 *         &lt;element name="LinePermission" type="{http://www.siri.org.uk/siri}LinePermissionStructure" maxOccurs="unbounded"/>
 *       &lt;/choice>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "allowAll",
    "linePermission"
})
@XmlRootElement(name = "LinePermissions")
public class LinePermissions
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "AllowAll")
    protected Boolean allowAll;
    @XmlElement(name = "LinePermission")
    protected List<LinePermissionStructure> linePermission;

    /**
     * Obtient la valeur de la propriété allowAll.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAllowAll() {
        return allowAll;
    }

    /**
     * Définit la valeur de la propriété allowAll.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAllowAll(Boolean value) {
        this.allowAll = value;
    }

    public boolean isSetAllowAll() {
        return (this.allowAll!= null);
    }

    /**
     * Gets the value of the linePermission property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the linePermission property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLinePermission().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LinePermissionStructure }
     * 
     * 
     */
    public List<LinePermissionStructure> getLinePermission() {
        if (linePermission == null) {
            linePermission = new ArrayList<LinePermissionStructure>();
        }
        return this.linePermission;
    }

    public boolean isSetLinePermission() {
        return ((this.linePermission!= null)&&(!this.linePermission.isEmpty()));
    }

    public void unsetLinePermission() {
        this.linePermission = null;
    }

}
