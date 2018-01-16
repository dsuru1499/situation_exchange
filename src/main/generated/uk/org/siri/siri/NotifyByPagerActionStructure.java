
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
 * Type for Notify user by Pager.
 * 
 * <p>Classe Java pour NotifyByPagerActionStructure complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="NotifyByPagerActionStructure">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.siri.org.uk/siri}PushedActionStructure">
 *       &lt;sequence>
 *         &lt;element name="PagerGroupRef" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Pager" type="{http://www.w3.org/2001/XMLSchema}NMTOKEN" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NotifyByPagerActionStructure", propOrder = {
    "pagerGroupRef",
    "pager"
})
public class NotifyByPagerActionStructure
    extends PushedActionStructure
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "PagerGroupRef")
    protected String pagerGroupRef;
    @XmlElement(name = "Pager", defaultValue = "true")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NMTOKEN")
    protected String pager;

    /**
     * Obtient la valeur de la propriété pagerGroupRef.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPagerGroupRef() {
        return pagerGroupRef;
    }

    /**
     * Définit la valeur de la propriété pagerGroupRef.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPagerGroupRef(String value) {
        this.pagerGroupRef = value;
    }

    public boolean isSetPagerGroupRef() {
        return (this.pagerGroupRef!= null);
    }

    /**
     * Obtient la valeur de la propriété pager.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPager() {
        return pager;
    }

    /**
     * Définit la valeur de la propriété pager.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPager(String value) {
        this.pager = value;
    }

    public boolean isSetPager() {
        return (this.pager!= null);
    }

}
