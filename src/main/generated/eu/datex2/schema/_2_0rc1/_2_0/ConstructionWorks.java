
package eu.datex2.schema._2_0rc1._2_0;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour ConstructionWorks complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="ConstructionWorks">
 *   &lt;complexContent>
 *     &lt;extension base="{http://datex2.eu/schema/2_0RC1/2_0}Roadworks">
 *       &lt;sequence>
 *         &lt;element name="constructionWorkType" type="{http://datex2.eu/schema/2_0RC1/2_0}ConstructionWorkTypeEnum" minOccurs="0"/>
 *         &lt;element name="constructionWorksExtension" type="{http://datex2.eu/schema/2_0RC1/2_0}ExtensionType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ConstructionWorks", propOrder = {
    "constructionWorkType",
    "constructionWorksExtension"
})
public class ConstructionWorks
    extends Roadworks
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    protected ConstructionWorkTypeEnum constructionWorkType;
    protected ExtensionType constructionWorksExtension;

    /**
     * Obtient la valeur de la propriété constructionWorkType.
     * 
     * @return
     *     possible object is
     *     {@link ConstructionWorkTypeEnum }
     *     
     */
    public ConstructionWorkTypeEnum getConstructionWorkType() {
        return constructionWorkType;
    }

    /**
     * Définit la valeur de la propriété constructionWorkType.
     * 
     * @param value
     *     allowed object is
     *     {@link ConstructionWorkTypeEnum }
     *     
     */
    public void setConstructionWorkType(ConstructionWorkTypeEnum value) {
        this.constructionWorkType = value;
    }

    public boolean isSetConstructionWorkType() {
        return (this.constructionWorkType!= null);
    }

    /**
     * Obtient la valeur de la propriété constructionWorksExtension.
     * 
     * @return
     *     possible object is
     *     {@link ExtensionType }
     *     
     */
    public ExtensionType getConstructionWorksExtension() {
        return constructionWorksExtension;
    }

    /**
     * Définit la valeur de la propriété constructionWorksExtension.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtensionType }
     *     
     */
    public void setConstructionWorksExtension(ExtensionType value) {
        this.constructionWorksExtension = value;
    }

    public boolean isSetConstructionWorksExtension() {
        return (this.constructionWorksExtension!= null);
    }

}
