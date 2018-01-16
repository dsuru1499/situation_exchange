
package uk.org.siri.siri;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * Type for Service Feature description.
 * 
 * <p>Classe Java pour ServiceFeatureStructure complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="ServiceFeatureStructure">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ServiceFeatureCode" type="{http://www.siri.org.uk/siri}ServiceFeatureCodeType"/>
 *         &lt;element name="Name" type="{http://www.siri.org.uk/siri}NaturalLanguageStringStructure" maxOccurs="unbounded"/>
 *         &lt;element name="Icon" type="{http://www.w3.org/2001/XMLSchema}anyURI"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ServiceFeatureStructure", propOrder = {
    "serviceFeatureCode",
    "name",
    "icon"
})
public class ServiceFeatureStructure implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "ServiceFeatureCode", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String serviceFeatureCode;
    @XmlElement(name = "Name", required = true)
    protected List<NaturalLanguageStringStructure> name;
    @XmlElement(name = "Icon", required = true)
    @XmlSchemaType(name = "anyURI")
    protected String icon;

    /**
     * Obtient la valeur de la propriété serviceFeatureCode.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getServiceFeatureCode() {
        return serviceFeatureCode;
    }

    /**
     * Définit la valeur de la propriété serviceFeatureCode.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setServiceFeatureCode(String value) {
        this.serviceFeatureCode = value;
    }

    public boolean isSetServiceFeatureCode() {
        return (this.serviceFeatureCode!= null);
    }

    /**
     * Gets the value of the name property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the name property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getName().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link NaturalLanguageStringStructure }
     * 
     * 
     */
    public List<NaturalLanguageStringStructure> getName() {
        if (name == null) {
            name = new ArrayList<NaturalLanguageStringStructure>();
        }
        return this.name;
    }

    public boolean isSetName() {
        return ((this.name!= null)&&(!this.name.isEmpty()));
    }

    public void unsetName() {
        this.name = null;
    }

    /**
     * Obtient la valeur de la propriété icon.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIcon() {
        return icon;
    }

    /**
     * Définit la valeur de la propriété icon.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIcon(String value) {
        this.icon = value;
    }

    public boolean isSetIcon() {
        return (this.icon!= null);
    }

}
