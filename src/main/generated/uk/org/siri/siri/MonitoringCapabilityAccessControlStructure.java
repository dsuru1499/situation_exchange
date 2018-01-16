
package uk.org.siri.siri;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Type for Monitoring Service Capability access control.
 * 
 * <p>Classe Java pour MonitoringCapabilityAccessControlStructure complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="MonitoringCapabilityAccessControlStructure">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.siri.org.uk/siri}CapabilityAccessControlStructure">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.siri.org.uk/siri}CheckOperatorRef" minOccurs="0"/>
 *         &lt;element ref="{http://www.siri.org.uk/siri}CheckLineRef" minOccurs="0"/>
 *         &lt;element ref="{http://www.siri.org.uk/siri}CheckMonitoringRef" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MonitoringCapabilityAccessControlStructure", propOrder = {
    "checkOperatorRef",
    "checkLineRef",
    "checkMonitoringRef"
})
public class MonitoringCapabilityAccessControlStructure
    extends CapabilityAccessControlStructure
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "CheckOperatorRef", defaultValue = "true")
    protected Boolean checkOperatorRef;
    @XmlElement(name = "CheckLineRef", defaultValue = "true")
    protected Boolean checkLineRef;
    @XmlElement(name = "CheckMonitoringRef", defaultValue = "true")
    protected Boolean checkMonitoringRef;

    /**
     * Obtient la valeur de la propriété checkOperatorRef.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCheckOperatorRef() {
        return checkOperatorRef;
    }

    /**
     * Définit la valeur de la propriété checkOperatorRef.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCheckOperatorRef(Boolean value) {
        this.checkOperatorRef = value;
    }

    public boolean isSetCheckOperatorRef() {
        return (this.checkOperatorRef!= null);
    }

    /**
     * Obtient la valeur de la propriété checkLineRef.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCheckLineRef() {
        return checkLineRef;
    }

    /**
     * Définit la valeur de la propriété checkLineRef.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCheckLineRef(Boolean value) {
        this.checkLineRef = value;
    }

    public boolean isSetCheckLineRef() {
        return (this.checkLineRef!= null);
    }

    /**
     * Obtient la valeur de la propriété checkMonitoringRef.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCheckMonitoringRef() {
        return checkMonitoringRef;
    }

    /**
     * Définit la valeur de la propriété checkMonitoringRef.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCheckMonitoringRef(Boolean value) {
        this.checkMonitoringRef = value;
    }

    public boolean isSetCheckMonitoringRef() {
        return (this.checkMonitoringRef!= null);
    }

}
