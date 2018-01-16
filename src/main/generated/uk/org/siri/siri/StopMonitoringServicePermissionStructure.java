
package uk.org.siri.siri;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Type for Monitoring Service Permission.
 * 
 * <p>Classe Java pour StopMonitoringServicePermissionStructure complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="StopMonitoringServicePermissionStructure">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.siri.org.uk/siri}AbstractPermissionStructure">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.siri.org.uk/siri}OperatorPermissions"/>
 *         &lt;element ref="{http://www.siri.org.uk/siri}LinePermissions"/>
 *         &lt;element name="StopMonitorPermissions">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;choice>
 *                   &lt;element ref="{http://www.siri.org.uk/siri}AllowAll"/>
 *                   &lt;element name="StopMonitorPermission" type="{http://www.siri.org.uk/siri}StopMonitorPermissionStructure" maxOccurs="unbounded"/>
 *                 &lt;/choice>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
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
@XmlType(name = "StopMonitoringServicePermissionStructure", propOrder = {
    "operatorPermissions",
    "linePermissions",
    "stopMonitorPermissions",
    "extensions"
})
public class StopMonitoringServicePermissionStructure
    extends AbstractPermissionStructure
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "OperatorPermissions", required = true)
    protected OperatorPermissions operatorPermissions;
    @XmlElement(name = "LinePermissions", required = true)
    protected LinePermissions linePermissions;
    @XmlElement(name = "StopMonitorPermissions", required = true)
    protected StopMonitoringServicePermissionStructure.StopMonitorPermissions stopMonitorPermissions;
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
     * Obtient la valeur de la propriété stopMonitorPermissions.
     * 
     * @return
     *     possible object is
     *     {@link StopMonitoringServicePermissionStructure.StopMonitorPermissions }
     *     
     */
    public StopMonitoringServicePermissionStructure.StopMonitorPermissions getStopMonitorPermissions() {
        return stopMonitorPermissions;
    }

    /**
     * Définit la valeur de la propriété stopMonitorPermissions.
     * 
     * @param value
     *     allowed object is
     *     {@link StopMonitoringServicePermissionStructure.StopMonitorPermissions }
     *     
     */
    public void setStopMonitorPermissions(StopMonitoringServicePermissionStructure.StopMonitorPermissions value) {
        this.stopMonitorPermissions = value;
    }

    public boolean isSetStopMonitorPermissions() {
        return (this.stopMonitorPermissions!= null);
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
     *         &lt;element name="StopMonitorPermission" type="{http://www.siri.org.uk/siri}StopMonitorPermissionStructure" maxOccurs="unbounded"/>
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
        "stopMonitorPermission"
    })
    public static class StopMonitorPermissions
        implements Serializable
    {

        private final static long serialVersionUID = 1L;
        @XmlElement(name = "AllowAll")
        protected Boolean allowAll;
        @XmlElement(name = "StopMonitorPermission")
        protected List<StopMonitorPermissionStructure> stopMonitorPermission;

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
         * Gets the value of the stopMonitorPermission property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the stopMonitorPermission property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getStopMonitorPermission().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link StopMonitorPermissionStructure }
         * 
         * 
         */
        public List<StopMonitorPermissionStructure> getStopMonitorPermission() {
            if (stopMonitorPermission == null) {
                stopMonitorPermission = new ArrayList<StopMonitorPermissionStructure>();
            }
            return this.stopMonitorPermission;
        }

        public boolean isSetStopMonitorPermission() {
            return ((this.stopMonitorPermission!= null)&&(!this.stopMonitorPermission.isEmpty()));
        }

        public void unsetStopMonitorPermission() {
            this.stopMonitorPermission = null;
        }

    }

}
