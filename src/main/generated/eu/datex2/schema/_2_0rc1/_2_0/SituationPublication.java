
package eu.datex2.schema._2_0rc1._2_0;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour SituationPublication complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="SituationPublication">
 *   &lt;complexContent>
 *     &lt;extension base="{http://datex2.eu/schema/2_0RC1/2_0}PayloadPublication">
 *       &lt;sequence>
 *         &lt;element name="situation" type="{http://datex2.eu/schema/2_0RC1/2_0}Situation" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="situationPublicationExtension" type="{http://datex2.eu/schema/2_0RC1/2_0}ExtensionType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SituationPublication", propOrder = {
    "situation",
    "situationPublicationExtension"
})
public class SituationPublication
    extends PayloadPublication
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    protected List<Situation> situation;
    protected ExtensionType situationPublicationExtension;

    /**
     * Gets the value of the situation property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the situation property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSituation().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Situation }
     * 
     * 
     */
    public List<Situation> getSituation() {
        if (situation == null) {
            situation = new ArrayList<Situation>();
        }
        return this.situation;
    }

    public boolean isSetSituation() {
        return ((this.situation!= null)&&(!this.situation.isEmpty()));
    }

    public void unsetSituation() {
        this.situation = null;
    }

    /**
     * Obtient la valeur de la propriété situationPublicationExtension.
     * 
     * @return
     *     possible object is
     *     {@link ExtensionType }
     *     
     */
    public ExtensionType getSituationPublicationExtension() {
        return situationPublicationExtension;
    }

    /**
     * Définit la valeur de la propriété situationPublicationExtension.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtensionType }
     *     
     */
    public void setSituationPublicationExtension(ExtensionType value) {
        this.situationPublicationExtension = value;
    }

    public boolean isSetSituationPublicationExtension() {
        return (this.situationPublicationExtension!= null);
    }

}
