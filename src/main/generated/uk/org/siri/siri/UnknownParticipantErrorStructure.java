
package uk.org.siri.siri;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Type for Error: Unknown Participant. +SIRI v2.0
 * 
 * <p>Classe Java pour UnknownParticipantErrorStructure complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="UnknownParticipantErrorStructure">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.siri.org.uk/siri}ErrorCodeStructure">
 *       &lt;sequence>
 *         &lt;element name="ParticipantRef" type="{http://www.siri.org.uk/siri}ParticipantRefStructure" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UnknownParticipantErrorStructure", propOrder = {
    "participantRef"
})
public class UnknownParticipantErrorStructure
    extends ErrorCodeStructure
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "ParticipantRef")
    protected ParticipantRefStructure participantRef;

    /**
     * Obtient la valeur de la propriété participantRef.
     * 
     * @return
     *     possible object is
     *     {@link ParticipantRefStructure }
     *     
     */
    public ParticipantRefStructure getParticipantRef() {
        return participantRef;
    }

    /**
     * Définit la valeur de la propriété participantRef.
     * 
     * @param value
     *     allowed object is
     *     {@link ParticipantRefStructure }
     *     
     */
    public void setParticipantRef(ParticipantRefStructure value) {
        this.participantRef = value;
    }

    public boolean isSetParticipantRef() {
        return (this.participantRef!= null);
    }

}
