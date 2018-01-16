
package uk.org.ifopt.ifopt;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * Abstract Type for DATA MANAGED OBJECT, that is an object that may be assigned a RESPONSIBILITY SET dictating a responsbile ORGANISATION and/or ADMINISTRATIVE ZONE.
 * 
 * <p>Classe Java pour DataManagedObjectStructure complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="DataManagedObjectStructure">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.ifopt.org.uk/ifopt}VersionedObjectStructure">
 *       &lt;sequence>
 *         &lt;group ref="{http://www.ifopt.org.uk/ifopt}DataManagedObjectGroup"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DataManagedObjectStructure", propOrder = {
    "managedByAreaRef",
    "infoLinks"
})
@XmlSeeAlso({
    AbstractEquipmentStructure.class
})
public abstract class DataManagedObjectStructure
    extends VersionedObjectStructure
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "ManagedByAreaRef")
    protected AdministrativeAreaRefStructure managedByAreaRef;
    @XmlElement(name = "InfoLinks")
    protected InfoLinksStructure infoLinks;

    /**
     * Obtient la valeur de la propriété managedByAreaRef.
     * 
     * @return
     *     possible object is
     *     {@link AdministrativeAreaRefStructure }
     *     
     */
    public AdministrativeAreaRefStructure getManagedByAreaRef() {
        return managedByAreaRef;
    }

    /**
     * Définit la valeur de la propriété managedByAreaRef.
     * 
     * @param value
     *     allowed object is
     *     {@link AdministrativeAreaRefStructure }
     *     
     */
    public void setManagedByAreaRef(AdministrativeAreaRefStructure value) {
        this.managedByAreaRef = value;
    }

    public boolean isSetManagedByAreaRef() {
        return (this.managedByAreaRef!= null);
    }

    /**
     * Obtient la valeur de la propriété infoLinks.
     * 
     * @return
     *     possible object is
     *     {@link InfoLinksStructure }
     *     
     */
    public InfoLinksStructure getInfoLinks() {
        return infoLinks;
    }

    /**
     * Définit la valeur de la propriété infoLinks.
     * 
     * @param value
     *     allowed object is
     *     {@link InfoLinksStructure }
     *     
     */
    public void setInfoLinks(InfoLinksStructure value) {
        this.infoLinks = value;
    }

    public boolean isSetInfoLinks() {
        return (this.infoLinks!= null);
    }

}
