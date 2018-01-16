
package uk.org.siri.siri;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Type for Monitoring Service Permission.
 * 
 * <p>Classe Java pour ConnectionServicePermissionStructure complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="ConnectionServicePermissionStructure">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.siri.org.uk/siri}AbstractPermissionStructure">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.siri.org.uk/siri}OperatorPermissions"/>
 *         &lt;element ref="{http://www.siri.org.uk/siri}LinePermissions"/>
 *         &lt;element ref="{http://www.siri.org.uk/siri}ConnectionLinkPermissions"/>
 *         &lt;element ref="{http://www.siri.org.uk/siri}Extensions" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ConnectionServicePermissionStructure", propOrder = {
    "operatorPermissions",
    "linePermissions",
    "connectionLinkPermissions",
    "extensions"
})
public class ConnectionServicePermissionStructure
    extends AbstractPermissionStructure
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "OperatorPermissions", required = true)
    protected OperatorPermissions operatorPermissions;
    @XmlElement(name = "LinePermissions", required = true)
    protected LinePermissions linePermissions;
    @XmlElement(name = "ConnectionLinkPermissions", required = true)
    protected ConnectionLinkPermissions connectionLinkPermissions;
    @XmlElement(name = "Extensions")
    protected ExtensionsStructure extensions;

    /**
     * Obtient la valeur de la propriété operatorPermissions.
     * 
     * @return
     *     possible object is
     *     {@link OperatorPermissions }
     *     
     */
    public OperatorPermissions getOperatorPermissions() {
        return operatorPermissions;
    }

    /**
     * Définit la valeur de la propriété operatorPermissions.
     * 
     * @param value
     *     allowed object is
     *     {@link OperatorPermissions }
     *     
     */
    public void setOperatorPermissions(OperatorPermissions value) {
        this.operatorPermissions = value;
    }

    public boolean isSetOperatorPermissions() {
        return (this.operatorPermissions!= null);
    }

    /**
     * Obtient la valeur de la propriété linePermissions.
     * 
     * @return
     *     possible object is
     *     {@link LinePermissions }
     *     
     */
    public LinePermissions getLinePermissions() {
        return linePermissions;
    }

    /**
     * Définit la valeur de la propriété linePermissions.
     * 
     * @param value
     *     allowed object is
     *     {@link LinePermissions }
     *     
     */
    public void setLinePermissions(LinePermissions value) {
        this.linePermissions = value;
    }

    public boolean isSetLinePermissions() {
        return (this.linePermissions!= null);
    }

    /**
     * Obtient la valeur de la propriété connectionLinkPermissions.
     * 
     * @return
     *     possible object is
     *     {@link ConnectionLinkPermissions }
     *     
     */
    public ConnectionLinkPermissions getConnectionLinkPermissions() {
        return connectionLinkPermissions;
    }

    /**
     * Définit la valeur de la propriété connectionLinkPermissions.
     * 
     * @param value
     *     allowed object is
     *     {@link ConnectionLinkPermissions }
     *     
     */
    public void setConnectionLinkPermissions(ConnectionLinkPermissions value) {
        this.connectionLinkPermissions = value;
    }

    public boolean isSetConnectionLinkPermissions() {
        return (this.connectionLinkPermissions!= null);
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

}
