
package eu.datex2.schema._2_0rc1._2_0;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Classe Java pour Comment complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="Comment">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="comment" type="{http://datex2.eu/schema/2_0RC1/2_0}MultilingualString"/>
 *         &lt;element name="commentDateTime" type="{http://datex2.eu/schema/2_0RC1/2_0}DateTime" minOccurs="0"/>
 *         &lt;element name="commentExtension" type="{http://datex2.eu/schema/2_0RC1/2_0}ExtensionType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Comment", propOrder = {
    "comment",
    "commentDateTime",
    "commentExtension"
})
public class Comment
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(required = true)
    protected MultilingualString comment;
    protected XMLGregorianCalendar commentDateTime;
    protected ExtensionType commentExtension;

    /**
     * Obtient la valeur de la propriété comment.
     * 
     * @return
     *     possible object is
     *     {@link MultilingualString }
     *     
     */
    public MultilingualString getComment() {
        return comment;
    }

    /**
     * Définit la valeur de la propriété comment.
     * 
     * @param value
     *     allowed object is
     *     {@link MultilingualString }
     *     
     */
    public void setComment(MultilingualString value) {
        this.comment = value;
    }

    public boolean isSetComment() {
        return (this.comment!= null);
    }

    /**
     * Obtient la valeur de la propriété commentDateTime.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCommentDateTime() {
        return commentDateTime;
    }

    /**
     * Définit la valeur de la propriété commentDateTime.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCommentDateTime(XMLGregorianCalendar value) {
        this.commentDateTime = value;
    }

    public boolean isSetCommentDateTime() {
        return (this.commentDateTime!= null);
    }

    /**
     * Obtient la valeur de la propriété commentExtension.
     * 
     * @return
     *     possible object is
     *     {@link ExtensionType }
     *     
     */
    public ExtensionType getCommentExtension() {
        return commentExtension;
    }

    /**
     * Définit la valeur de la propriété commentExtension.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtensionType }
     *     
     */
    public void setCommentExtension(ExtensionType value) {
        this.commentExtension = value;
    }

    public boolean isSetCommentExtension() {
        return (this.commentExtension!= null);
    }

}
