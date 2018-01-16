
package uk.org.siri.siri;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import uk.org.ifopt.ifopt.CountryRefStructure;


/**
 * Type for reference to a SITUATION.
 * 
 * <p>Classe Java pour SituationFullRefStructure complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="SituationFullRefStructure">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;group ref="{http://www.siri.org.uk/siri}SituationFullIdentityGroup"/>
 *         &lt;group ref="{http://www.siri.org.uk/siri}SituationUpdateIdentityGroup"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SituationFullRefStructure", propOrder = {
    "versionCountryRef",
    "participantRef",
    "situationNumber",
    "updateCountryRef",
    "updateParticipantRef",
    "version"
})
public class SituationFullRefStructure
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "VersionCountryRef")
    protected CountryRefStructure versionCountryRef;
    @XmlElement(name = "ParticipantRef", required = true)
    protected ParticipantRefStructure participantRef;
    @XmlElement(name = "SituationNumber", required = true)
    protected EntryQualifierStructure situationNumber;
    @XmlElement(name = "UpdateCountryRef")
    protected CountryRefStructure updateCountryRef;
    @XmlElement(name = "UpdateParticipantRef")
    protected ParticipantRefStructure updateParticipantRef;
    @XmlElement(name = "Version")
    protected SituationVersion version;

    /**
     * Obtient la valeur de la propriété versionCountryRef.
     * 
     * @return
     *     possible object is
     *     {@link CountryRefStructure }
     *     
     */
    public CountryRefStructure getVersionCountryRef() {
        return versionCountryRef;
    }

    /**
     * Définit la valeur de la propriété versionCountryRef.
     * 
     * @param value
     *     allowed object is
     *     {@link CountryRefStructure }
     *     
     */
    public void setVersionCountryRef(CountryRefStructure value) {
        this.versionCountryRef = value;
    }

    public boolean isSetVersionCountryRef() {
        return (this.versionCountryRef!= null);
    }

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

    /**
     * Unique identifier of SITUATION within a Participant. Excludes any version number.
     * 
     * @return
     *     possible object is
     *     {@link EntryQualifierStructure }
     *     
     */
    public EntryQualifierStructure getSituationNumber() {
        return situationNumber;
    }

    /**
     * Définit la valeur de la propriété situationNumber.
     * 
     * @param value
     *     allowed object is
     *     {@link EntryQualifierStructure }
     *     
     */
    public void setSituationNumber(EntryQualifierStructure value) {
        this.situationNumber = value;
    }

    public boolean isSetSituationNumber() {
        return (this.situationNumber!= null);
    }

    /**
     * Obtient la valeur de la propriété updateCountryRef.
     * 
     * @return
     *     possible object is
     *     {@link CountryRefStructure }
     *     
     */
    public CountryRefStructure getUpdateCountryRef() {
        return updateCountryRef;
    }

    /**
     * Définit la valeur de la propriété updateCountryRef.
     * 
     * @param value
     *     allowed object is
     *     {@link CountryRefStructure }
     *     
     */
    public void setUpdateCountryRef(CountryRefStructure value) {
        this.updateCountryRef = value;
    }

    public boolean isSetUpdateCountryRef() {
        return (this.updateCountryRef!= null);
    }

    /**
     * Obtient la valeur de la propriété updateParticipantRef.
     * 
     * @return
     *     possible object is
     *     {@link ParticipantRefStructure }
     *     
     */
    public ParticipantRefStructure getUpdateParticipantRef() {
        return updateParticipantRef;
    }

    /**
     * Définit la valeur de la propriété updateParticipantRef.
     * 
     * @param value
     *     allowed object is
     *     {@link ParticipantRefStructure }
     *     
     */
    public void setUpdateParticipantRef(ParticipantRefStructure value) {
        this.updateParticipantRef = value;
    }

    public boolean isSetUpdateParticipantRef() {
        return (this.updateParticipantRef!= null);
    }

    /**
     * Obtient la valeur de la propriété version.
     * 
     * @return
     *     possible object is
     *     {@link SituationVersion }
     *     
     */
    public SituationVersion getVersion() {
        return version;
    }

    /**
     * Définit la valeur de la propriété version.
     * 
     * @param value
     *     allowed object is
     *     {@link SituationVersion }
     *     
     */
    public void setVersion(SituationVersion value) {
        this.version = value;
    }

    public boolean isSetVersion() {
        return (this.version!= null);
    }

}
