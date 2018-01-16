
package uk.org.siri.siri;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * Type for Delivery for Situation Exchange Service. Provides information about one or more vehicles; each has its own VEHICLE activity element.
 * 
 * <p>Classe Java pour SituationExchangeDeliveryStructure complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="SituationExchangeDeliveryStructure">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.siri.org.uk/siri}AbstractServiceDeliveryStructure">
 *       &lt;sequence>
 *         &lt;group ref="{http://www.siri.org.uk/siri}SituationExchangePayloadGroup"/>
 *         &lt;element ref="{http://www.siri.org.uk/siri}Extensions" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="version" type="{http://www.siri.org.uk/siri}VersionString" default="2.0" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SituationExchangeDeliveryStructure", propOrder = {
    "ptSituationContext",
    "situations",
    "extensions"
})
public class SituationExchangeDeliveryStructure
    extends AbstractServiceDeliveryStructure
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "PtSituationContext")
    protected ContextStructure ptSituationContext;
    @XmlElement(name = "Situations")
    protected SituationExchangeDeliveryStructure.Situations situations;
    @XmlElement(name = "Extensions")
    protected ExtensionsStructure extensions;
    @XmlAttribute(name = "version")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String version;

    /**
     * Obtient la valeur de la propriété ptSituationContext.
     * 
     * @return
     *     possible object is
     *     {@link ContextStructure }
     *     
     */
    public ContextStructure getPtSituationContext() {
        return ptSituationContext;
    }

    /**
     * Définit la valeur de la propriété ptSituationContext.
     * 
     * @param value
     *     allowed object is
     *     {@link ContextStructure }
     *     
     */
    public void setPtSituationContext(ContextStructure value) {
        this.ptSituationContext = value;
    }

    public boolean isSetPtSituationContext() {
        return (this.ptSituationContext!= null);
    }

    /**
     * Obtient la valeur de la propriété situations.
     * 
     * @return
     *     possible object is
     *     {@link SituationExchangeDeliveryStructure.Situations }
     *     
     */
    public SituationExchangeDeliveryStructure.Situations getSituations() {
        return situations;
    }

    /**
     * Définit la valeur de la propriété situations.
     * 
     * @param value
     *     allowed object is
     *     {@link SituationExchangeDeliveryStructure.Situations }
     *     
     */
    public void setSituations(SituationExchangeDeliveryStructure.Situations value) {
        this.situations = value;
    }

    public boolean isSetSituations() {
        return (this.situations!= null);
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

    /**
     * Obtient la valeur de la propriété version.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVersion() {
        if (version == null) {
            return "2.0";
        } else {
            return version;
        }
    }

    /**
     * Définit la valeur de la propriété version.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVersion(String value) {
        this.version = value;
    }

    public boolean isSetVersion() {
        return (this.version!= null);
    }


    /**
     * <p>Classe Java pour anonymous complex type.
     * 
     * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="PtSituationElement" type="{http://www.siri.org.uk/siri}PtSituationElementStructure" maxOccurs="unbounded" minOccurs="0"/>
     *         &lt;element ref="{http://www.siri.org.uk/siri}RoadSituationElement" maxOccurs="unbounded" minOccurs="0"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "ptSituationElement",
        "roadSituationElement"
    })
    public static class Situations
        implements Serializable
    {

        private final static long serialVersionUID = 1L;
        @XmlElement(name = "PtSituationElement")
        protected List<PtSituationElementStructure> ptSituationElement;
        @XmlElement(name = "RoadSituationElement")
        protected List<RoadSituationElementStructure> roadSituationElement;

        /**
         * Gets the value of the ptSituationElement property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the ptSituationElement property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getPtSituationElement().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link PtSituationElementStructure }
         * 
         * 
         */
        public List<PtSituationElementStructure> getPtSituationElement() {
            if (ptSituationElement == null) {
                ptSituationElement = new ArrayList<PtSituationElementStructure>();
            }
            return this.ptSituationElement;
        }

        public boolean isSetPtSituationElement() {
            return ((this.ptSituationElement!= null)&&(!this.ptSituationElement.isEmpty()));
        }

        public void unsetPtSituationElement() {
            this.ptSituationElement = null;
        }

        /**
         * Gets the value of the roadSituationElement property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the roadSituationElement property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getRoadSituationElement().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link RoadSituationElementStructure }
         * 
         * 
         */
        public List<RoadSituationElementStructure> getRoadSituationElement() {
            if (roadSituationElement == null) {
                roadSituationElement = new ArrayList<RoadSituationElementStructure>();
            }
            return this.roadSituationElement;
        }

        public boolean isSetRoadSituationElement() {
            return ((this.roadSituationElement!= null)&&(!this.roadSituationElement.isEmpty()));
        }

        public void unsetRoadSituationElement() {
            this.roadSituationElement = null;
        }

    }

}
