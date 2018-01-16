
package uk.org.siri.siri;

import java.io.Serializable;
import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import uk.org.ifopt.ifopt.LinkProjectionStructure;


/**
 * Summary information about a stop within line 
 * 
 * <p>Classe Java pour StopPointInPatternStructure complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="StopPointInPatternStructure">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.siri.org.uk/siri}AnnotatedStopPointStructure">
 *       &lt;sequence>
 *         &lt;element name="Order" type="{http://www.w3.org/2001/XMLSchema}positiveInteger"/>
 *         &lt;element name="OnwardLinkShape" type="{http://www.siri.org.uk/siri}LineShapeStructure" minOccurs="0"/>
 *         &lt;element name="LinkProjectionToNextStopPoint" type="{http://www.ifopt.org.uk/ifopt}LinkProjectionStructure" minOccurs="0"/>
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
@XmlType(name = "StopPointInPatternStructure", propOrder = {
    "order",
    "onwardLinkShape",
    "linkProjectionToNextStopPoint",
    "extensions"
})
public class StopPointInPatternStructure
    extends AnnotatedStopPointStructure
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "Order", required = true)
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger order;
    @XmlElement(name = "OnwardLinkShape")
    protected LineShapeStructure onwardLinkShape;
    @XmlElement(name = "LinkProjectionToNextStopPoint")
    protected LinkProjectionStructure linkProjectionToNextStopPoint;
    @XmlElement(name = "Extensions")
    protected ExtensionsStructure extensions;

    /**
     * Obtient la valeur de la propriété order.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getOrder() {
        return order;
    }

    /**
     * Définit la valeur de la propriété order.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setOrder(BigInteger value) {
        this.order = value;
    }

    public boolean isSetOrder() {
        return (this.order!= null);
    }

    /**
     * Obtient la valeur de la propriété onwardLinkShape.
     * 
     * @return
     *     possible object is
     *     {@link LineShapeStructure }
     *     
     */
    public LineShapeStructure getOnwardLinkShape() {
        return onwardLinkShape;
    }

    /**
     * Définit la valeur de la propriété onwardLinkShape.
     * 
     * @param value
     *     allowed object is
     *     {@link LineShapeStructure }
     *     
     */
    public void setOnwardLinkShape(LineShapeStructure value) {
        this.onwardLinkShape = value;
    }

    public boolean isSetOnwardLinkShape() {
        return (this.onwardLinkShape!= null);
    }

    /**
     * Obtient la valeur de la propriété linkProjectionToNextStopPoint.
     * 
     * @return
     *     possible object is
     *     {@link LinkProjectionStructure }
     *     
     */
    public LinkProjectionStructure getLinkProjectionToNextStopPoint() {
        return linkProjectionToNextStopPoint;
    }

    /**
     * Définit la valeur de la propriété linkProjectionToNextStopPoint.
     * 
     * @param value
     *     allowed object is
     *     {@link LinkProjectionStructure }
     *     
     */
    public void setLinkProjectionToNextStopPoint(LinkProjectionStructure value) {
        this.linkProjectionToNextStopPoint = value;
    }

    public boolean isSetLinkProjectionToNextStopPoint() {
        return (this.linkProjectionToNextStopPoint!= null);
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
