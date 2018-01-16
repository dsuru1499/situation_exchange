
package uk.org.siri.siri;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import javax.xml.datatype.Duration;


/**
 * Type for Type for Functional Service Request for Estimated Timetable.
 * 
 * <p>Classe Java pour EstimatedTimetableRequestStructure complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="EstimatedTimetableRequestStructure">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.siri.org.uk/siri}AbstractFunctionalServiceRequestStructure">
 *       &lt;sequence>
 *         &lt;group ref="{http://www.siri.org.uk/siri}EstimatedTimetableTopicGroup"/>
 *         &lt;group ref="{http://www.siri.org.uk/siri}EstimatedTimetableRequestPolicyGroup"/>
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
@XmlType(name = "EstimatedTimetableRequestStructure", propOrder = {
    "previewInterval",
    "timetableVersionRef",
    "operatorRef",
    "lines",
    "language",
    "includeTranslations",
    "estimatedTimetableDetailLevel",
    "extensions"
})
public class EstimatedTimetableRequestStructure
    extends AbstractFunctionalServiceRequestStructure
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "PreviewInterval")
    protected Duration previewInterval;
    @XmlElement(name = "TimetableVersionRef")
    protected VersionRefStructure timetableVersionRef;
    @XmlElement(name = "OperatorRef")
    protected List<OperatorRefStructure> operatorRef;
    @XmlElement(name = "Lines")
    protected EstimatedTimetableRequestStructure.Lines lines;
    @XmlElement(name = "Language", defaultValue = "en")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "language")
    protected String language;
    @XmlElement(name = "IncludeTranslations")
    protected Boolean includeTranslations;
    @XmlElement(name = "EstimatedTimetableDetailLevel", defaultValue = "calls")
    protected EstimatedTimetableDetailEnumeration estimatedTimetableDetailLevel;
    @XmlElement(name = "Extensions")
    protected ExtensionsStructure extensions;
    @XmlAttribute(name = "version")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String version;

    /**
     * Obtient la valeur de la propriété previewInterval.
     * 
     * @return
     *     possible object is
     *     {@link Duration }
     *     
     */
    public Duration getPreviewInterval() {
        return previewInterval;
    }

    /**
     * Définit la valeur de la propriété previewInterval.
     * 
     * @param value
     *     allowed object is
     *     {@link Duration }
     *     
     */
    public void setPreviewInterval(Duration value) {
        this.previewInterval = value;
    }

    public boolean isSetPreviewInterval() {
        return (this.previewInterval!= null);
    }

    /**
     * Obtient la valeur de la propriété timetableVersionRef.
     * 
     * @return
     *     possible object is
     *     {@link VersionRefStructure }
     *     
     */
    public VersionRefStructure getTimetableVersionRef() {
        return timetableVersionRef;
    }

    /**
     * Définit la valeur de la propriété timetableVersionRef.
     * 
     * @param value
     *     allowed object is
     *     {@link VersionRefStructure }
     *     
     */
    public void setTimetableVersionRef(VersionRefStructure value) {
        this.timetableVersionRef = value;
    }

    public boolean isSetTimetableVersionRef() {
        return (this.timetableVersionRef!= null);
    }

    /**
     * Gets the value of the operatorRef property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the operatorRef property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOperatorRef().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OperatorRefStructure }
     * 
     * 
     */
    public List<OperatorRefStructure> getOperatorRef() {
        if (operatorRef == null) {
            operatorRef = new ArrayList<OperatorRefStructure>();
        }
        return this.operatorRef;
    }

    public boolean isSetOperatorRef() {
        return ((this.operatorRef!= null)&&(!this.operatorRef.isEmpty()));
    }

    public void unsetOperatorRef() {
        this.operatorRef = null;
    }

    /**
     * Obtient la valeur de la propriété lines.
     * 
     * @return
     *     possible object is
     *     {@link EstimatedTimetableRequestStructure.Lines }
     *     
     */
    public EstimatedTimetableRequestStructure.Lines getLines() {
        return lines;
    }

    /**
     * Définit la valeur de la propriété lines.
     * 
     * @param value
     *     allowed object is
     *     {@link EstimatedTimetableRequestStructure.Lines }
     *     
     */
    public void setLines(EstimatedTimetableRequestStructure.Lines value) {
        this.lines = value;
    }

    public boolean isSetLines() {
        return (this.lines!= null);
    }

    /**
     * Obtient la valeur de la propriété language.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLanguage() {
        return language;
    }

    /**
     * Définit la valeur de la propriété language.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLanguage(String value) {
        this.language = value;
    }

    public boolean isSetLanguage() {
        return (this.language!= null);
    }

    /**
     * Obtient la valeur de la propriété includeTranslations.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIncludeTranslations() {
        return includeTranslations;
    }

    /**
     * Définit la valeur de la propriété includeTranslations.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIncludeTranslations(Boolean value) {
        this.includeTranslations = value;
    }

    public boolean isSetIncludeTranslations() {
        return (this.includeTranslations!= null);
    }

    /**
     * Obtient la valeur de la propriété estimatedTimetableDetailLevel.
     * 
     * @return
     *     possible object is
     *     {@link EstimatedTimetableDetailEnumeration }
     *     
     */
    public EstimatedTimetableDetailEnumeration getEstimatedTimetableDetailLevel() {
        return estimatedTimetableDetailLevel;
    }

    /**
     * Définit la valeur de la propriété estimatedTimetableDetailLevel.
     * 
     * @param value
     *     allowed object is
     *     {@link EstimatedTimetableDetailEnumeration }
     *     
     */
    public void setEstimatedTimetableDetailLevel(EstimatedTimetableDetailEnumeration value) {
        this.estimatedTimetableDetailLevel = value;
    }

    public boolean isSetEstimatedTimetableDetailLevel() {
        return (this.estimatedTimetableDetailLevel!= null);
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
     *         &lt;element name="LineDirection" type="{http://www.siri.org.uk/siri}LineDirectionStructure" maxOccurs="unbounded"/>
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
        "lineDirection"
    })
    public static class Lines
        implements Serializable
    {

        private final static long serialVersionUID = 1L;
        @XmlElement(name = "LineDirection", required = true)
        protected List<LineDirectionStructure> lineDirection;

        /**
         * Gets the value of the lineDirection property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the lineDirection property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getLineDirection().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link LineDirectionStructure }
         * 
         * 
         */
        public List<LineDirectionStructure> getLineDirection() {
            if (lineDirection == null) {
                lineDirection = new ArrayList<LineDirectionStructure>();
            }
            return this.lineDirection;
        }

        public boolean isSetLineDirection() {
            return ((this.lineDirection!= null)&&(!this.lineDirection.isEmpty()));
        }

        public void unsetLineDirection() {
            this.lineDirection = null;
        }

    }

}
