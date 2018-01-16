
package eu.datex2.schema._2_0rc1._2_0;

import java.io.Serializable;
import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour Subjects complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="Subjects">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="subjectTypeOfWorks" type="{http://datex2.eu/schema/2_0RC1/2_0}SubjectTypeOfWorksEnum"/>
 *         &lt;element name="numberOfSubjects" type="{http://datex2.eu/schema/2_0RC1/2_0}NonNegativeInteger" minOccurs="0"/>
 *         &lt;element name="subjectsExtension" type="{http://datex2.eu/schema/2_0RC1/2_0}ExtensionType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Subjects", propOrder = {
    "subjectTypeOfWorks",
    "numberOfSubjects",
    "subjectsExtension"
})
public class Subjects
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(required = true)
    protected SubjectTypeOfWorksEnum subjectTypeOfWorks;
    protected BigInteger numberOfSubjects;
    protected ExtensionType subjectsExtension;

    /**
     * Obtient la valeur de la propriété subjectTypeOfWorks.
     * 
     * @return
     *     possible object is
     *     {@link SubjectTypeOfWorksEnum }
     *     
     */
    public SubjectTypeOfWorksEnum getSubjectTypeOfWorks() {
        return subjectTypeOfWorks;
    }

    /**
     * Définit la valeur de la propriété subjectTypeOfWorks.
     * 
     * @param value
     *     allowed object is
     *     {@link SubjectTypeOfWorksEnum }
     *     
     */
    public void setSubjectTypeOfWorks(SubjectTypeOfWorksEnum value) {
        this.subjectTypeOfWorks = value;
    }

    public boolean isSetSubjectTypeOfWorks() {
        return (this.subjectTypeOfWorks!= null);
    }

    /**
     * Obtient la valeur de la propriété numberOfSubjects.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getNumberOfSubjects() {
        return numberOfSubjects;
    }

    /**
     * Définit la valeur de la propriété numberOfSubjects.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setNumberOfSubjects(BigInteger value) {
        this.numberOfSubjects = value;
    }

    public boolean isSetNumberOfSubjects() {
        return (this.numberOfSubjects!= null);
    }

    /**
     * Obtient la valeur de la propriété subjectsExtension.
     * 
     * @return
     *     possible object is
     *     {@link ExtensionType }
     *     
     */
    public ExtensionType getSubjectsExtension() {
        return subjectsExtension;
    }

    /**
     * Définit la valeur de la propriété subjectsExtension.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtensionType }
     *     
     */
    public void setSubjectsExtension(ExtensionType value) {
        this.subjectsExtension = value;
    }

    public boolean isSetSubjectsExtension() {
        return (this.subjectsExtension!= null);
    }

}
