
package uk.org.siri.siri;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Type for blocking.
 * 
 * <p>Classe Java pour BlockingStructure complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="BlockingStructure">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="JourneyPlanner" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="RealTime" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BlockingStructure", propOrder = {
    "journeyPlanner",
    "realTime"
})
public class BlockingStructure
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "JourneyPlanner", defaultValue = "false")
    protected Boolean journeyPlanner;
    @XmlElement(name = "RealTime", defaultValue = "false")
    protected Boolean realTime;

    /**
     * Obtient la valeur de la propriété journeyPlanner.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isJourneyPlanner() {
        return journeyPlanner;
    }

    /**
     * Définit la valeur de la propriété journeyPlanner.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setJourneyPlanner(Boolean value) {
        this.journeyPlanner = value;
    }

    public boolean isSetJourneyPlanner() {
        return (this.journeyPlanner!= null);
    }

    /**
     * Obtient la valeur de la propriété realTime.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isRealTime() {
        return realTime;
    }

    /**
     * Définit la valeur de la propriété realTime.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setRealTime(Boolean value) {
        this.realTime = value;
    }

    public boolean isSetRealTime() {
        return (this.realTime!= null);
    }

}
