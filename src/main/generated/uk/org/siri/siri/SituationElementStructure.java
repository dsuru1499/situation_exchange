
package uk.org.siri.siri;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * Type for loggable Entry.
 * 
 * <p>Classe Java pour SituationElementStructure complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="SituationElementStructure">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.siri.org.uk/siri}AbstractSituationElementStructure">
 *       &lt;sequence>
 *         &lt;group ref="{http://www.siri.org.uk/siri}SituationInfoGroup"/>
 *         &lt;element name="VersionedAtTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SituationElementStructure", propOrder = {
    "references",
    "source",
    "versionedAtTime"
})
@XmlSeeAlso({
    RoadSituationElementStructure.class,
    PtSituationElementStructure.class
})
public class SituationElementStructure
    extends AbstractSituationElementStructure
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "References")
    protected ReferencesStructure references;
    @XmlElement(name = "Source", required = true)
    protected SituationSourceStructure source;
    @XmlElement(name = "VersionedAtTime")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar versionedAtTime;

    /**
     * Obtient la valeur de la propriété references.
     * 
     * @return
     *     possible object is
     *     {@link ReferencesStructure }
     *     
     */
    public ReferencesStructure getReferences() {
        return references;
    }

    /**
     * Définit la valeur de la propriété references.
     * 
     * @param value
     *     allowed object is
     *     {@link ReferencesStructure }
     *     
     */
    public void setReferences(ReferencesStructure value) {
        this.references = value;
    }

    public boolean isSetReferences() {
        return (this.references!= null);
    }

    /**
     * Obtient la valeur de la propriété source.
     * 
     * @return
     *     possible object is
     *     {@link SituationSourceStructure }
     *     
     */
    public SituationSourceStructure getSource() {
        return source;
    }

    /**
     * Définit la valeur de la propriété source.
     * 
     * @param value
     *     allowed object is
     *     {@link SituationSourceStructure }
     *     
     */
    public void setSource(SituationSourceStructure value) {
        this.source = value;
    }

    public boolean isSetSource() {
        return (this.source!= null);
    }

    /**
     * Obtient la valeur de la propriété versionedAtTime.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getVersionedAtTime() {
        return versionedAtTime;
    }

    /**
     * Définit la valeur de la propriété versionedAtTime.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setVersionedAtTime(XMLGregorianCalendar value) {
        this.versionedAtTime = value;
    }

    public boolean isSetVersionedAtTime() {
        return (this.versionedAtTime!= null);
    }

}
