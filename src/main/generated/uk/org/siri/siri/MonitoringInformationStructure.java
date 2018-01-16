
package uk.org.siri.siri;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.Duration;


/**
 * Allowed values for the monitoring conditions (frequency of mesurement, etc): an automatic monitoring of the satus of a lift with pushed alert in case of incident is very different from a daily manual/visual check.
 * 
 * <p>Classe Java pour MonitoringInformationStructure complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="MonitoringInformationStructure">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="MonitoringInterval" type="{http://www.w3.org/2001/XMLSchema}duration" minOccurs="0"/>
 *         &lt;element name="MonitoringType" type="{http://www.siri.org.uk/siri}MonitoringTypeEnumeration" minOccurs="0"/>
 *         &lt;element name="MonitoringPeriod" type="{http://www.siri.org.uk/siri}MonitoringValidityConditionStructure" minOccurs="0"/>
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
@XmlType(name = "MonitoringInformationStructure", propOrder = {
    "monitoringInterval",
    "monitoringType",
    "monitoringPeriod",
    "extensions"
})
public class MonitoringInformationStructure
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "MonitoringInterval")
    protected Duration monitoringInterval;
    @XmlElement(name = "MonitoringType")
    protected MonitoringTypeEnumeration monitoringType;
    @XmlElement(name = "MonitoringPeriod")
    protected MonitoringValidityConditionStructure monitoringPeriod;
    @XmlElement(name = "Extensions")
    protected ExtensionsStructure extensions;

    /**
     * Obtient la valeur de la propriété monitoringInterval.
     * 
     * @return
     *     possible object is
     *     {@link Duration }
     *     
     */
    public Duration getMonitoringInterval() {
        return monitoringInterval;
    }

    /**
     * Définit la valeur de la propriété monitoringInterval.
     * 
     * @param value
     *     allowed object is
     *     {@link Duration }
     *     
     */
    public void setMonitoringInterval(Duration value) {
        this.monitoringInterval = value;
    }

    public boolean isSetMonitoringInterval() {
        return (this.monitoringInterval!= null);
    }

    /**
     * Obtient la valeur de la propriété monitoringType.
     * 
     * @return
     *     possible object is
     *     {@link MonitoringTypeEnumeration }
     *     
     */
    public MonitoringTypeEnumeration getMonitoringType() {
        return monitoringType;
    }

    /**
     * Définit la valeur de la propriété monitoringType.
     * 
     * @param value
     *     allowed object is
     *     {@link MonitoringTypeEnumeration }
     *     
     */
    public void setMonitoringType(MonitoringTypeEnumeration value) {
        this.monitoringType = value;
    }

    public boolean isSetMonitoringType() {
        return (this.monitoringType!= null);
    }

    /**
     * Obtient la valeur de la propriété monitoringPeriod.
     * 
     * @return
     *     possible object is
     *     {@link MonitoringValidityConditionStructure }
     *     
     */
    public MonitoringValidityConditionStructure getMonitoringPeriod() {
        return monitoringPeriod;
    }

    /**
     * Définit la valeur de la propriété monitoringPeriod.
     * 
     * @param value
     *     allowed object is
     *     {@link MonitoringValidityConditionStructure }
     *     
     */
    public void setMonitoringPeriod(MonitoringValidityConditionStructure value) {
        this.monitoringPeriod = value;
    }

    public boolean isSetMonitoringPeriod() {
        return (this.monitoringPeriod!= null);
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
