
package eu.datex2.schema._2_0rc1._2_0;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour NonRoadEventInformation complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="NonRoadEventInformation">
 *   &lt;complexContent>
 *     &lt;extension base="{http://datex2.eu/schema/2_0RC1/2_0}SituationRecord">
 *       &lt;sequence>
 *         &lt;element name="nonRoadEventInformationExtension" type="{http://datex2.eu/schema/2_0RC1/2_0}ExtensionType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NonRoadEventInformation", propOrder = {
    "nonRoadEventInformationExtension"
})
@XmlSeeAlso({
    CarParks.class,
    TransitInformation.class,
    RoadsideServiceDisruption.class,
    RoadOperatorServiceDisruption.class
})
public abstract class NonRoadEventInformation
    extends SituationRecord
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    protected ExtensionType nonRoadEventInformationExtension;

    /**
     * Obtient la valeur de la propriété nonRoadEventInformationExtension.
     * 
     * @return
     *     possible object is
     *     {@link ExtensionType }
     *     
     */
    public ExtensionType getNonRoadEventInformationExtension() {
        return nonRoadEventInformationExtension;
    }

    /**
     * Définit la valeur de la propriété nonRoadEventInformationExtension.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtensionType }
     *     
     */
    public void setNonRoadEventInformationExtension(ExtensionType value) {
        this.nonRoadEventInformationExtension = value;
    }

    public boolean isSetNonRoadEventInformationExtension() {
        return (this.nonRoadEventInformationExtension!= null);
    }

}
