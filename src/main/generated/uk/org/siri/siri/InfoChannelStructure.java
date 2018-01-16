
package uk.org.siri.siri;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * Type for Info Channels description.
 * 
 * <p>Classe Java pour InfoChannelStructure complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="InfoChannelStructure">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="InfoChannelCode" type="{http://www.siri.org.uk/siri}InfoChannelCodeType"/>
 *         &lt;element name="Name" type="{http://www.siri.org.uk/siri}NaturalLanguageStringStructure"/>
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
@XmlType(name = "InfoChannelStructure", propOrder = {
    "infoChannelCode",
    "name",
    "icon"
})
public class InfoChannelStructure
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "InfoChannelCode", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String infoChannelCode;
    @XmlElement(name = "Name", required = true)
    protected NaturalLanguageStringStructure name;
    @XmlElement(name = "Icon", required = true)
    @XmlSchemaType(name = "anyURI")
    protected String icon;

    /**
     * Obtient la valeur de la propriété infoChannelCode.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInfoChannelCode() {
        return infoChannelCode;
    }

    /**
     * Définit la valeur de la propriété infoChannelCode.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInfoChannelCode(String value) {
        this.infoChannelCode = value;
    }

    public boolean isSetInfoChannelCode() {
        return (this.infoChannelCode!= null);
    }

    /**
     * Obtient la valeur de la propriété name.
     * 
     * @return
     *     possible object is
     *     {@link NaturalLanguageStringStructure }
     *     
     */
    public NaturalLanguageStringStructure getName() {
        return name;
    }

    /**
     * Définit la valeur de la propriété name.
     * 
     * @param value
     *     allowed object is
     *     {@link NaturalLanguageStringStructure }
     *     
     */
    public void setName(NaturalLanguageStringStructure value) {
        this.name = value;
    }

    public boolean isSetName() {
        return (this.name!= null);
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
