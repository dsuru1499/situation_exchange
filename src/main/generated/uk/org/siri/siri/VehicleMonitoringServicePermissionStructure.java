
package uk.org.siri.siri;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Type for Monitoring Service Permissions.
 * 
 * <p>Classe Java pour VehicleMonitoringServicePermissionStructure complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="VehicleMonitoringServicePermissionStructure">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.siri.org.uk/siri}AbstractPermissionStructure">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.siri.org.uk/siri}OperatorPermissions"/>
 *         &lt;element ref="{http://www.siri.org.uk/siri}LinePermissions"/>
 *         &lt;element name="VehicleMonitoringPermissions">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;choice>
 *                   &lt;element ref="{http://www.siri.org.uk/siri}AllowAll"/>
 *                   &lt;element name="VehicleMonitorPermission" type="{http://www.siri.org.uk/siri}VehicleMonitorPermissionStructure" maxOccurs="unbounded"/>
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
@XmlType(name = "VehicleMonitoringServicePermissionStructure", propOrder = {
    "operatorPermissions",
    "linePermissions",
    "vehicleMonitoringPermissions",
    "extensions"
})
public class VehicleMonitoringServicePermissionStructure
    extends AbstractPermissionStructure
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "OperatorPermissions", required = true)
    protected OperatorPermissions operatorPermissions;
    @XmlElement(name = "LinePermissions", required = true)
    protected LinePermissions linePermissions;
    @XmlElement(name = "VehicleMonitoringPermissions", required = true)
    protected VehicleMonitoringServicePermissionStructure.VehicleMonitoringPermissions vehicleMonitoringPermissions;
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
     * Obtient la valeur de la propriété vehicleMonitoringPermissions.
     * 
     * @return
     *     possible object is
     *     {@link VehicleMonitoringServicePermissionStructure.VehicleMonitoringPermissions }
     *     
     */
    public VehicleMonitoringServicePermissionStructure.VehicleMonitoringPermissions getVehicleMonitoringPermissions() {
        return vehicleMonitoringPermissions;
    }

    /**
     * Définit la valeur de la propriété vehicleMonitoringPermissions.
     * 
     * @param value
     *     allowed object is
     *     {@link VehicleMonitoringServicePermissionStructure.VehicleMonitoringPermissions }
     *     
     */
    public void setVehicleMonitoringPermissions(VehicleMonitoringServicePermissionStructure.VehicleMonitoringPermissions value) {
        this.vehicleMonitoringPermissions = value;
    }

    public boolean isSetVehicleMonitoringPermissions() {
        return (this.vehicleMonitoringPermissions!= null);
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
     *         &lt;element name="VehicleMonitorPermission" type="{http://www.siri.org.uk/siri}VehicleMonitorPermissionStructure" maxOccurs="unbounded"/>
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
        "vehicleMonitorPermission"
    })
    public static class VehicleMonitoringPermissions
        implements Serializable
    {

        private final static long serialVersionUID = 1L;
        @XmlElement(name = "AllowAll")
        protected Boolean allowAll;
        @XmlElement(name = "VehicleMonitorPermission")
        protected List<VehicleMonitorPermissionStructure> vehicleMonitorPermission;

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
         * Gets the value of the vehicleMonitorPermission property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the vehicleMonitorPermission property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getVehicleMonitorPermission().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link VehicleMonitorPermissionStructure }
         * 
         * 
         */
        public List<VehicleMonitorPermissionStructure> getVehicleMonitorPermission() {
            if (vehicleMonitorPermission == null) {
                vehicleMonitorPermission = new ArrayList<VehicleMonitorPermissionStructure>();
            }
            return this.vehicleMonitorPermission;
        }

        public boolean isSetVehicleMonitorPermission() {
            return ((this.vehicleMonitorPermission!= null)&&(!this.vehicleMonitorPermission.isEmpty()));
        }

        public void unsetVehicleMonitorPermission() {
            this.vehicleMonitorPermission = null;
        }

    }

}
