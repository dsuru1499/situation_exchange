
package uk.org.siri.siri;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Type for General MessageService Permission.
 * 
 * <p>Classe Java pour GeneralMessageServicePermissionStructure complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="GeneralMessageServicePermissionStructure">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.siri.org.uk/siri}AbstractPermissionStructure">
 *       &lt;sequence>
 *         &lt;element name="InfoChannelPermissions">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;choice>
 *                   &lt;element ref="{http://www.siri.org.uk/siri}AllowAll"/>
 *                   &lt;element name="InfoChannelPermission" type="{http://www.siri.org.uk/siri}InfoChannelPermissionStructure" maxOccurs="unbounded"/>
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
@XmlType(name = "GeneralMessageServicePermissionStructure", propOrder = {
    "infoChannelPermissions",
    "extensions"
})
public class GeneralMessageServicePermissionStructure
    extends AbstractPermissionStructure
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "InfoChannelPermissions", required = true)
    protected GeneralMessageServicePermissionStructure.InfoChannelPermissions infoChannelPermissions;
    @XmlElement(name = "Extensions")
    protected ExtensionsStructure extensions;

    /**
     * Obtient la valeur de la propriété infoChannelPermissions.
     * 
     * @return
     *     possible object is
     *     {@link GeneralMessageServicePermissionStructure.InfoChannelPermissions }
     *     
     */
    public GeneralMessageServicePermissionStructure.InfoChannelPermissions getInfoChannelPermissions() {
        return infoChannelPermissions;
    }

    /**
     * Définit la valeur de la propriété infoChannelPermissions.
     * 
     * @param value
     *     allowed object is
     *     {@link GeneralMessageServicePermissionStructure.InfoChannelPermissions }
     *     
     */
    public void setInfoChannelPermissions(GeneralMessageServicePermissionStructure.InfoChannelPermissions value) {
        this.infoChannelPermissions = value;
    }

    public boolean isSetInfoChannelPermissions() {
        return (this.infoChannelPermissions!= null);
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
     *         &lt;element name="InfoChannelPermission" type="{http://www.siri.org.uk/siri}InfoChannelPermissionStructure" maxOccurs="unbounded"/>
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
        "infoChannelPermission"
    })
    public static class InfoChannelPermissions
        implements Serializable
    {

        private final static long serialVersionUID = 1L;
        @XmlElement(name = "AllowAll")
        protected Boolean allowAll;
        @XmlElement(name = "InfoChannelPermission")
        protected List<InfoChannelPermissionStructure> infoChannelPermission;

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
         * Gets the value of the infoChannelPermission property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the infoChannelPermission property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getInfoChannelPermission().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link InfoChannelPermissionStructure }
         * 
         * 
         */
        public List<InfoChannelPermissionStructure> getInfoChannelPermission() {
            if (infoChannelPermission == null) {
                infoChannelPermission = new ArrayList<InfoChannelPermissionStructure>();
            }
            return this.infoChannelPermission;
        }

        public boolean isSetInfoChannelPermission() {
            return ((this.infoChannelPermission!= null)&&(!this.infoChannelPermission.isEmpty()));
        }

        public void unsetInfoChannelPermission() {
            this.infoChannelPermission = null;
        }

    }

}
