
package uk.org.siri.siri;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import uk.org.ifopt.acsb.SuitabilityStructure;


/**
 * Type for disruption.
 * 
 * <p>Classe Java pour PtConsequenceStructure complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="PtConsequenceStructure">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Period" type="{http://www.siri.org.uk/siri}HalfOpenTimestampOutputRangeStructure" minOccurs="0"/>
 *         &lt;element ref="{http://www.siri.org.uk/siri}Condition" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Severity" type="{http://www.siri.org.uk/siri}SeverityEnumeration"/>
 *         &lt;element name="Affects" type="{http://www.siri.org.uk/siri}AffectsScopeStructure" minOccurs="0"/>
 *         &lt;element name="Suitabilities" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="Suitability" type="{http://www.ifopt.org.uk/acsb}SuitabilityStructure" maxOccurs="unbounded"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="Advice" type="{http://www.siri.org.uk/siri}PtAdviceStructure" minOccurs="0"/>
 *         &lt;element name="Blocking" type="{http://www.siri.org.uk/siri}BlockingStructure" minOccurs="0"/>
 *         &lt;element name="Boarding" type="{http://www.siri.org.uk/siri}BoardingStructure" minOccurs="0"/>
 *         &lt;element name="Delays" type="{http://www.siri.org.uk/siri}DelaysStructure" minOccurs="0"/>
 *         &lt;element name="Casualties" type="{http://www.siri.org.uk/siri}CasualtiesStructure" minOccurs="0"/>
 *         &lt;element name="Easements" type="{http://www.siri.org.uk/siri}EasementsStructure" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://www.siri.org.uk/siri}Extensions" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PtConsequenceStructure", propOrder = {
    "period",
    "condition",
    "severity",
    "affects",
    "suitabilities",
    "advice",
    "blocking",
    "boarding",
    "delays",
    "casualties",
    "easements",
    "extensions"
})
public class PtConsequenceStructure
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "Period")
    protected HalfOpenTimestampOutputRangeStructure period;
    @XmlElement(name = "Condition")
    protected List<ServiceConditionEnumeration> condition;
    @XmlElement(name = "Severity", required = true)
    protected SeverityEnumeration severity;
    @XmlElement(name = "Affects")
    protected AffectsScopeStructure affects;
    @XmlElement(name = "Suitabilities")
    protected PtConsequenceStructure.Suitabilities suitabilities;
    @XmlElement(name = "Advice")
    protected PtAdviceStructure advice;
    @XmlElement(name = "Blocking")
    protected BlockingStructure blocking;
    @XmlElement(name = "Boarding")
    protected BoardingStructure boarding;
    @XmlElement(name = "Delays")
    protected DelaysStructure delays;
    @XmlElement(name = "Casualties")
    protected CasualtiesStructure casualties;
    @XmlElement(name = "Easements")
    protected List<EasementsStructure> easements;
    @XmlElement(name = "Extensions")
    protected ExtensionsStructure extensions;

    /**
     * Obtient la valeur de la propriété period.
     * 
     * @return
     *     possible object is
     *     {@link HalfOpenTimestampOutputRangeStructure }
     *     
     */
    public HalfOpenTimestampOutputRangeStructure getPeriod() {
        return period;
    }

    /**
     * Définit la valeur de la propriété period.
     * 
     * @param value
     *     allowed object is
     *     {@link HalfOpenTimestampOutputRangeStructure }
     *     
     */
    public void setPeriod(HalfOpenTimestampOutputRangeStructure value) {
        this.period = value;
    }

    public boolean isSetPeriod() {
        return (this.period!= null);
    }

    /**
     * Gets the value of the condition property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the condition property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCondition().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ServiceConditionEnumeration }
     * 
     * 
     */
    public List<ServiceConditionEnumeration> getCondition() {
        if (condition == null) {
            condition = new ArrayList<ServiceConditionEnumeration>();
        }
        return this.condition;
    }

    public boolean isSetCondition() {
        return ((this.condition!= null)&&(!this.condition.isEmpty()));
    }

    public void unsetCondition() {
        this.condition = null;
    }

    /**
     * Obtient la valeur de la propriété severity.
     * 
     * @return
     *     possible object is
     *     {@link SeverityEnumeration }
     *     
     */
    public SeverityEnumeration getSeverity() {
        return severity;
    }

    /**
     * Définit la valeur de la propriété severity.
     * 
     * @param value
     *     allowed object is
     *     {@link SeverityEnumeration }
     *     
     */
    public void setSeverity(SeverityEnumeration value) {
        this.severity = value;
    }

    public boolean isSetSeverity() {
        return (this.severity!= null);
    }

    /**
     * Obtient la valeur de la propriété affects.
     * 
     * @return
     *     possible object is
     *     {@link AffectsScopeStructure }
     *     
     */
    public AffectsScopeStructure getAffects() {
        return affects;
    }

    /**
     * Définit la valeur de la propriété affects.
     * 
     * @param value
     *     allowed object is
     *     {@link AffectsScopeStructure }
     *     
     */
    public void setAffects(AffectsScopeStructure value) {
        this.affects = value;
    }

    public boolean isSetAffects() {
        return (this.affects!= null);
    }

    /**
     * Obtient la valeur de la propriété suitabilities.
     * 
     * @return
     *     possible object is
     *     {@link PtConsequenceStructure.Suitabilities }
     *     
     */
    public PtConsequenceStructure.Suitabilities getSuitabilities() {
        return suitabilities;
    }

    /**
     * Définit la valeur de la propriété suitabilities.
     * 
     * @param value
     *     allowed object is
     *     {@link PtConsequenceStructure.Suitabilities }
     *     
     */
    public void setSuitabilities(PtConsequenceStructure.Suitabilities value) {
        this.suitabilities = value;
    }

    public boolean isSetSuitabilities() {
        return (this.suitabilities!= null);
    }

    /**
     * Obtient la valeur de la propriété advice.
     * 
     * @return
     *     possible object is
     *     {@link PtAdviceStructure }
     *     
     */
    public PtAdviceStructure getAdvice() {
        return advice;
    }

    /**
     * Définit la valeur de la propriété advice.
     * 
     * @param value
     *     allowed object is
     *     {@link PtAdviceStructure }
     *     
     */
    public void setAdvice(PtAdviceStructure value) {
        this.advice = value;
    }

    public boolean isSetAdvice() {
        return (this.advice!= null);
    }

    /**
     * Obtient la valeur de la propriété blocking.
     * 
     * @return
     *     possible object is
     *     {@link BlockingStructure }
     *     
     */
    public BlockingStructure getBlocking() {
        return blocking;
    }

    /**
     * Définit la valeur de la propriété blocking.
     * 
     * @param value
     *     allowed object is
     *     {@link BlockingStructure }
     *     
     */
    public void setBlocking(BlockingStructure value) {
        this.blocking = value;
    }

    public boolean isSetBlocking() {
        return (this.blocking!= null);
    }

    /**
     * Obtient la valeur de la propriété boarding.
     * 
     * @return
     *     possible object is
     *     {@link BoardingStructure }
     *     
     */
    public BoardingStructure getBoarding() {
        return boarding;
    }

    /**
     * Définit la valeur de la propriété boarding.
     * 
     * @param value
     *     allowed object is
     *     {@link BoardingStructure }
     *     
     */
    public void setBoarding(BoardingStructure value) {
        this.boarding = value;
    }

    public boolean isSetBoarding() {
        return (this.boarding!= null);
    }

    /**
     * Obtient la valeur de la propriété delays.
     * 
     * @return
     *     possible object is
     *     {@link DelaysStructure }
     *     
     */
    public DelaysStructure getDelays() {
        return delays;
    }

    /**
     * Définit la valeur de la propriété delays.
     * 
     * @param value
     *     allowed object is
     *     {@link DelaysStructure }
     *     
     */
    public void setDelays(DelaysStructure value) {
        this.delays = value;
    }

    public boolean isSetDelays() {
        return (this.delays!= null);
    }

    /**
     * Obtient la valeur de la propriété casualties.
     * 
     * @return
     *     possible object is
     *     {@link CasualtiesStructure }
     *     
     */
    public CasualtiesStructure getCasualties() {
        return casualties;
    }

    /**
     * Définit la valeur de la propriété casualties.
     * 
     * @param value
     *     allowed object is
     *     {@link CasualtiesStructure }
     *     
     */
    public void setCasualties(CasualtiesStructure value) {
        this.casualties = value;
    }

    public boolean isSetCasualties() {
        return (this.casualties!= null);
    }

    /**
     * Gets the value of the easements property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the easements property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEasements().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link EasementsStructure }
     * 
     * 
     */
    public List<EasementsStructure> getEasements() {
        if (easements == null) {
            easements = new ArrayList<EasementsStructure>();
        }
        return this.easements;
    }

    public boolean isSetEasements() {
        return ((this.easements!= null)&&(!this.easements.isEmpty()));
    }

    public void unsetEasements() {
        this.easements = null;
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
     * <p>Classe Java pour anonymous complex type.
     * 
     * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="Suitability" type="{http://www.ifopt.org.uk/acsb}SuitabilityStructure" maxOccurs="unbounded"/>
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
        "suitability"
    })
    public static class Suitabilities
        implements Serializable
    {

        private final static long serialVersionUID = 1L;
        @XmlElement(name = "Suitability", required = true)
        protected List<SuitabilityStructure> suitability;

        /**
         * Gets the value of the suitability property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the suitability property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getSuitability().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link SuitabilityStructure }
         * 
         * 
         */
        public List<SuitabilityStructure> getSuitability() {
            if (suitability == null) {
                suitability = new ArrayList<SuitabilityStructure>();
            }
            return this.suitability;
        }

        public boolean isSetSuitability() {
            return ((this.suitability!= null)&&(!this.suitability.isEmpty()));
        }

        public void unsetSuitability() {
            this.suitability = null;
        }

    }

}
