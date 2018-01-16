
package uk.org.siri.siri;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * Type for Abstract Permission Topic.
 * 
 * <p>Classe Java pour AbstractTopicPermissionStructure complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="AbstractTopicPermissionStructure">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Allow" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AbstractTopicPermissionStructure", propOrder = {
    "allow"
})
@XmlSeeAlso({
    ConnectionLinkPermissionStructure.class,
    LinePermissionStructure.class,
    OperatorPermissionStructure.class,
    InfoChannelPermissionStructure.class,
    StopMonitorPermissionStructure.class,
    VehicleMonitorPermissionStructure.class
})
public class AbstractTopicPermissionStructure
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "Allow", defaultValue = "true")
    protected boolean allow;

    /**
     * Obtient la valeur de la propriété allow.
     * 
     */
    public boolean isAllow() {
        return allow;
    }

    /**
     * Définit la valeur de la propriété allow.
     * 
     */
    public void setAllow(boolean value) {
        this.allow = value;
    }

    public boolean isSetAllow() {
        return true;
    }

}
