
package uk.org.siri.siri;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * Type for incoming visit by feeder journey to SERVICE JOURNEY NTERCHANGE
 * 
 * <p>Classe Java pour TimetabledFeederArrivalStructure complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="TimetabledFeederArrivalStructure">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.siri.org.uk/siri}AbstractFeederItemStructure">
 *       &lt;sequence>
 *         &lt;element name="FeederJourney" type="{http://www.siri.org.uk/siri}InterchangeJourneyStructure"/>
 *         &lt;element name="AimedArrivalTime" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
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
@XmlType(name = "TimetabledFeederArrivalStructure", propOrder = {
    "feederJourney",
    "aimedArrivalTime",
    "extensions"
})
public class TimetabledFeederArrivalStructure
    extends AbstractFeederItemStructure
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "FeederJourney", required = true)
    protected InterchangeJourneyStructure feederJourney;
    @XmlElement(name = "AimedArrivalTime", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar aimedArrivalTime;
    @XmlElement(name = "Extensions")
    protected ExtensionsStructure extensions;

    /**
     * Obtient la valeur de la propriété feederJourney.
     * 
     * @return
     *     possible object is
     *     {@link InterchangeJourneyStructure }
     *     
     */
    public InterchangeJourneyStructure getFeederJourney() {
        return feederJourney;
    }

    /**
     * Définit la valeur de la propriété feederJourney.
     * 
     * @param value
     *     allowed object is
     *     {@link InterchangeJourneyStructure }
     *     
     */
    public void setFeederJourney(InterchangeJourneyStructure value) {
        this.feederJourney = value;
    }

    public boolean isSetFeederJourney() {
        return (this.feederJourney!= null);
    }

    /**
     * Obtient la valeur de la propriété aimedArrivalTime.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getAimedArrivalTime() {
        return aimedArrivalTime;
    }

    /**
     * Définit la valeur de la propriété aimedArrivalTime.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setAimedArrivalTime(XMLGregorianCalendar value) {
        this.aimedArrivalTime = value;
    }

    public boolean isSetAimedArrivalTime() {
        return (this.aimedArrivalTime!= null);
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

}
