
package uk.org.siri.siri;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.NormalizedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * Type for a refernces to  JOURNEY PARTs. +SIRI v2.0  
 * 
 * <p>Classe Java pour JourneyPartInfoStructure complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="JourneyPartInfoStructure">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="JourneyPartRef" type="{http://www.w3.org/2001/XMLSchema}normalizedString"/>
 *         &lt;element name="TrainNumberRef" type="{http://www.siri.org.uk/siri}TrainNumberRefStructure" minOccurs="0"/>
 *         &lt;element name="OperatorRef" type="{http://www.siri.org.uk/siri}OperatorRefStructure" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "JourneyPartInfoStructure", propOrder = {
    "journeyPartRef",
    "trainNumberRef",
    "operatorRef"
})
public class JourneyPartInfoStructure
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "JourneyPartRef", required = true)
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String journeyPartRef;
    @XmlElement(name = "TrainNumberRef")
    protected TrainNumberRefStructure trainNumberRef;
    @XmlElement(name = "OperatorRef")
    protected OperatorRefStructure operatorRef;

    /**
     * Obtient la valeur de la propriété journeyPartRef.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getJourneyPartRef() {
        return journeyPartRef;
    }

    /**
     * Définit la valeur de la propriété journeyPartRef.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setJourneyPartRef(String value) {
        this.journeyPartRef = value;
    }

    public boolean isSetJourneyPartRef() {
        return (this.journeyPartRef!= null);
    }

    /**
     * Obtient la valeur de la propriété trainNumberRef.
     * 
     * @return
     *     possible object is
     *     {@link TrainNumberRefStructure }
     *     
     */
    public TrainNumberRefStructure getTrainNumberRef() {
        return trainNumberRef;
    }

    /**
     * Définit la valeur de la propriété trainNumberRef.
     * 
     * @param value
     *     allowed object is
     *     {@link TrainNumberRefStructure }
     *     
     */
    public void setTrainNumberRef(TrainNumberRefStructure value) {
        this.trainNumberRef = value;
    }

    public boolean isSetTrainNumberRef() {
        return (this.trainNumberRef!= null);
    }

    /**
     * Obtient la valeur de la propriété operatorRef.
     * 
     * @return
     *     possible object is
     *     {@link OperatorRefStructure }
     *     
     */
    public OperatorRefStructure getOperatorRef() {
        return operatorRef;
    }

    /**
     * Définit la valeur de la propriété operatorRef.
     * 
     * @param value
     *     allowed object is
     *     {@link OperatorRefStructure }
     *     
     */
    public void setOperatorRef(OperatorRefStructure value) {
        this.operatorRef = value;
    }

    public boolean isSetOperatorRef() {
        return (this.operatorRef!= null);
    }

}
