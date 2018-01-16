
package uk.org.siri.siri;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Type for a Stop Line Notice.
 * 
 * <p>Classe Java pour StopLineNoticeStructure complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="StopLineNoticeStructure">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.siri.org.uk/siri}AbstractIdentifiedItemStructure">
 *       &lt;sequence>
 *         &lt;element name="MonitoringRef" type="{http://www.siri.org.uk/siri}MonitoringRefStructure"/>
 *         &lt;group ref="{http://www.siri.org.uk/siri}LineIdentityGroup"/>
 *         &lt;element name="PublishedLineName" type="{http://www.siri.org.uk/siri}NaturalLanguageStringStructure" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="LineNote" type="{http://www.siri.org.uk/siri}NaturalLanguageStringStructure" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="DeliveryVariant" type="{http://www.siri.org.uk/siri}DeliveryVariantStructure" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://www.siri.org.uk/siri}SituationRef" maxOccurs="unbounded" minOccurs="0"/>
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
@XmlType(name = "StopLineNoticeStructure", propOrder = {
    "monitoringRef",
    "lineRef",
    "directionRef",
    "publishedLineName",
    "lineNote",
    "deliveryVariant",
    "situationRef",
    "extensions"
})
public class StopLineNoticeStructure
    extends AbstractIdentifiedItemStructure
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "MonitoringRef", required = true)
    protected MonitoringRefStructure monitoringRef;
    @XmlElement(name = "LineRef", required = true)
    protected LineRefStructure lineRef;
    @XmlElement(name = "DirectionRef", required = true)
    protected DirectionRefStructure directionRef;
    @XmlElement(name = "PublishedLineName")
    protected List<NaturalLanguageStringStructure> publishedLineName;
    @XmlElement(name = "LineNote")
    protected List<NaturalLanguageStringStructure> lineNote;
    @XmlElement(name = "DeliveryVariant")
    protected List<DeliveryVariantStructure> deliveryVariant;
    @XmlElement(name = "SituationRef")
    protected List<SituationRefStructure> situationRef;
    @XmlElement(name = "Extensions")
    protected ExtensionsStructure extensions;

    /**
     * Obtient la valeur de la propriété monitoringRef.
     * 
     * @return
     *     possible object is
     *     {@link MonitoringRefStructure }
     *     
     */
    public MonitoringRefStructure getMonitoringRef() {
        return monitoringRef;
    }

    /**
     * Définit la valeur de la propriété monitoringRef.
     * 
     * @param value
     *     allowed object is
     *     {@link MonitoringRefStructure }
     *     
     */
    public void setMonitoringRef(MonitoringRefStructure value) {
        this.monitoringRef = value;
    }

    public boolean isSetMonitoringRef() {
        return (this.monitoringRef!= null);
    }

    /**
     * Obtient la valeur de la propriété lineRef.
     * 
     * @return
     *     possible object is
     *     {@link LineRefStructure }
     *     
     */
    public LineRefStructure getLineRef() {
        return lineRef;
    }

    /**
     * Définit la valeur de la propriété lineRef.
     * 
     * @param value
     *     allowed object is
     *     {@link LineRefStructure }
     *     
     */
    public void setLineRef(LineRefStructure value) {
        this.lineRef = value;
    }

    public boolean isSetLineRef() {
        return (this.lineRef!= null);
    }

    /**
     * Obtient la valeur de la propriété directionRef.
     * 
     * @return
     *     possible object is
     *     {@link DirectionRefStructure }
     *     
     */
    public DirectionRefStructure getDirectionRef() {
        return directionRef;
    }

    /**
     * Définit la valeur de la propriété directionRef.
     * 
     * @param value
     *     allowed object is
     *     {@link DirectionRefStructure }
     *     
     */
    public void setDirectionRef(DirectionRefStructure value) {
        this.directionRef = value;
    }

    public boolean isSetDirectionRef() {
        return (this.directionRef!= null);
    }

    /**
     * Gets the value of the publishedLineName property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the publishedLineName property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPublishedLineName().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link NaturalLanguageStringStructure }
     * 
     * 
     */
    public List<NaturalLanguageStringStructure> getPublishedLineName() {
        if (publishedLineName == null) {
            publishedLineName = new ArrayList<NaturalLanguageStringStructure>();
        }
        return this.publishedLineName;
    }

    public boolean isSetPublishedLineName() {
        return ((this.publishedLineName!= null)&&(!this.publishedLineName.isEmpty()));
    }

    public void unsetPublishedLineName() {
        this.publishedLineName = null;
    }

    /**
     * Gets the value of the lineNote property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the lineNote property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLineNote().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link NaturalLanguageStringStructure }
     * 
     * 
     */
    public List<NaturalLanguageStringStructure> getLineNote() {
        if (lineNote == null) {
            lineNote = new ArrayList<NaturalLanguageStringStructure>();
        }
        return this.lineNote;
    }

    public boolean isSetLineNote() {
        return ((this.lineNote!= null)&&(!this.lineNote.isEmpty()));
    }

    public void unsetLineNote() {
        this.lineNote = null;
    }

    /**
     * Gets the value of the deliveryVariant property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the deliveryVariant property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDeliveryVariant().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DeliveryVariantStructure }
     * 
     * 
     */
    public List<DeliveryVariantStructure> getDeliveryVariant() {
        if (deliveryVariant == null) {
            deliveryVariant = new ArrayList<DeliveryVariantStructure>();
        }
        return this.deliveryVariant;
    }

    public boolean isSetDeliveryVariant() {
        return ((this.deliveryVariant!= null)&&(!this.deliveryVariant.isEmpty()));
    }

    public void unsetDeliveryVariant() {
        this.deliveryVariant = null;
    }

    /**
     * Gets the value of the situationRef property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the situationRef property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSituationRef().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SituationRefStructure }
     * 
     * 
     */
    public List<SituationRefStructure> getSituationRef() {
        if (situationRef == null) {
            situationRef = new ArrayList<SituationRefStructure>();
        }
        return this.situationRef;
    }

    public boolean isSetSituationRef() {
        return ((this.situationRef!= null)&&(!this.situationRef.isEmpty()));
    }

    public void unsetSituationRef() {
        this.situationRef = null;
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
