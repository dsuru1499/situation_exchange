
package uk.org.siri.siri;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Type for boarding restrictions.
 * 
 * <p>Classe Java pour BoardingStructure complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="BoardingStructure">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ArrivalBoardingActivity" type="{http://www.siri.org.uk/siri}ArrivalBoardingActivityEnumeration" minOccurs="0"/>
 *         &lt;element name="DepartureBoardingActivity" type="{http://www.siri.org.uk/siri}DepartureBoardingActivityEnumeration" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BoardingStructure", propOrder = {
    "arrivalBoardingActivity",
    "departureBoardingActivity"
})
public class BoardingStructure
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "ArrivalBoardingActivity", defaultValue = "alighting")
    protected ArrivalBoardingActivityEnumeration arrivalBoardingActivity;
    @XmlElement(name = "DepartureBoardingActivity", defaultValue = "boarding")
    protected DepartureBoardingActivityEnumeration departureBoardingActivity;

    /**
     * Obtient la valeur de la propriété arrivalBoardingActivity.
     * 
     * @return
     *     possible object is
     *     {@link ArrivalBoardingActivityEnumeration }
     *     
     */
    public ArrivalBoardingActivityEnumeration getArrivalBoardingActivity() {
        return arrivalBoardingActivity;
    }

    /**
     * Définit la valeur de la propriété arrivalBoardingActivity.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrivalBoardingActivityEnumeration }
     *     
     */
    public void setArrivalBoardingActivity(ArrivalBoardingActivityEnumeration value) {
        this.arrivalBoardingActivity = value;
    }

    public boolean isSetArrivalBoardingActivity() {
        return (this.arrivalBoardingActivity!= null);
    }

    /**
     * Obtient la valeur de la propriété departureBoardingActivity.
     * 
     * @return
     *     possible object is
     *     {@link DepartureBoardingActivityEnumeration }
     *     
     */
    public DepartureBoardingActivityEnumeration getDepartureBoardingActivity() {
        return departureBoardingActivity;
    }

    /**
     * Définit la valeur de la propriété departureBoardingActivity.
     * 
     * @param value
     *     allowed object is
     *     {@link DepartureBoardingActivityEnumeration }
     *     
     */
    public void setDepartureBoardingActivity(DepartureBoardingActivityEnumeration value) {
        this.departureBoardingActivity = value;
    }

    public boolean isSetDepartureBoardingActivity() {
        return (this.departureBoardingActivity!= null);
    }

}
