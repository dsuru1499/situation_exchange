
package uk.org.siri.siri;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Type for whether service is unavailable for all or some services SIRI 2.0
 * 
 * <p>Classe Java pour ServiceExceptionStructure complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="ServiceExceptionStructure">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.siri.org.uk/siri}AbstractItemStructure">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.siri.org.uk/siri}LineRef" minOccurs="0"/>
 *         &lt;element name="DirectionRef" type="{http://www.siri.org.uk/siri}DirectionRefStructure" minOccurs="0"/>
 *         &lt;element ref="{http://www.siri.org.uk/siri}StopPointRef" minOccurs="0"/>
 *         &lt;element name="ServiceStatus" type="{http://www.siri.org.uk/siri}ServiceExceptionEnumeration" minOccurs="0"/>
 *         &lt;element name="Notice" type="{http://www.siri.org.uk/siri}NaturalLanguageStringStructure" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="SituationRef" type="{http://www.siri.org.uk/siri}SituationSimpleRefStructure" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ServiceExceptionStructure", propOrder = {
    "lineRef",
    "directionRef",
    "stopPointRef",
    "serviceStatus",
    "notice",
    "situationRef"
})
public class ServiceExceptionStructure
    extends AbstractItemStructure
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "LineRef")
    protected LineRefStructure lineRef;
    @XmlElement(name = "DirectionRef")
    protected DirectionRefStructure directionRef;
    @XmlElement(name = "StopPointRef")
    protected StopPointRefStructure stopPointRef;
    @XmlElement(name = "ServiceStatus")
    protected ServiceExceptionEnumeration serviceStatus;
    @XmlElement(name = "Notice")
    protected List<NaturalLanguageStringStructure> notice;
    @XmlElement(name = "SituationRef")
    protected SituationSimpleRefStructure situationRef;

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
     * Obtient la valeur de la propriété stopPointRef.
     * 
     * @return
     *     possible object is
     *     {@link StopPointRefStructure }
     *     
     */
    public StopPointRefStructure getStopPointRef() {
        return stopPointRef;
    }

    /**
     * Définit la valeur de la propriété stopPointRef.
     * 
     * @param value
     *     allowed object is
     *     {@link StopPointRefStructure }
     *     
     */
    public void setStopPointRef(StopPointRefStructure value) {
        this.stopPointRef = value;
    }

    public boolean isSetStopPointRef() {
        return (this.stopPointRef!= null);
    }

    /**
     * Obtient la valeur de la propriété serviceStatus.
     * 
     * @return
     *     possible object is
     *     {@link ServiceExceptionEnumeration }
     *     
     */
    public ServiceExceptionEnumeration getServiceStatus() {
        return serviceStatus;
    }

    /**
     * Définit la valeur de la propriété serviceStatus.
     * 
     * @param value
     *     allowed object is
     *     {@link ServiceExceptionEnumeration }
     *     
     */
    public void setServiceStatus(ServiceExceptionEnumeration value) {
        this.serviceStatus = value;
    }

    public boolean isSetServiceStatus() {
        return (this.serviceStatus!= null);
    }

    /**
     * Gets the value of the notice property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the notice property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getNotice().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link NaturalLanguageStringStructure }
     * 
     * 
     */
    public List<NaturalLanguageStringStructure> getNotice() {
        if (notice == null) {
            notice = new ArrayList<NaturalLanguageStringStructure>();
        }
        return this.notice;
    }

    public boolean isSetNotice() {
        return ((this.notice!= null)&&(!this.notice.isEmpty()));
    }

    public void unsetNotice() {
        this.notice = null;
    }

    /**
     * Obtient la valeur de la propriété situationRef.
     * 
     * @return
     *     possible object is
     *     {@link SituationSimpleRefStructure }
     *     
     */
    public SituationSimpleRefStructure getSituationRef() {
        return situationRef;
    }

    /**
     * Définit la valeur de la propriété situationRef.
     * 
     * @param value
     *     allowed object is
     *     {@link SituationSimpleRefStructure }
     *     
     */
    public void setSituationRef(SituationSimpleRefStructure value) {
        this.situationRef = value;
    }

    public boolean isSetSituationRef() {
        return (this.situationRef!= null);
    }

}
