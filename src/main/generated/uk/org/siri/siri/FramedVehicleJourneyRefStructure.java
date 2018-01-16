
package uk.org.siri.siri;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * Type for identifer of a VEHICLE JOURNEY within data Horizon of a service.
 * 
 * <p>Classe Java pour FramedVehicleJourneyRefStructure complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="FramedVehicleJourneyRefStructure">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="DataFrameRef" type="{http://www.siri.org.uk/siri}DataFrameRefStructure"/>
 *         &lt;element name="DatedVehicleJourneyRef" type="{http://www.siri.org.uk/siri}DatedVehicleJourneyCodeType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FramedVehicleJourneyRefStructure", propOrder = {
    "dataFrameRef",
    "datedVehicleJourneyRef"
})
public class FramedVehicleJourneyRefStructure
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "DataFrameRef", required = true)
    protected DataFrameRefStructure dataFrameRef;
    @XmlElement(name = "DatedVehicleJourneyRef", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String datedVehicleJourneyRef;

    /**
     * Obtient la valeur de la propriété dataFrameRef.
     * 
     * @return
     *     possible object is
     *     {@link DataFrameRefStructure }
     *     
     */
    public DataFrameRefStructure getDataFrameRef() {
        return dataFrameRef;
    }

    /**
     * Définit la valeur de la propriété dataFrameRef.
     * 
     * @param value
     *     allowed object is
     *     {@link DataFrameRefStructure }
     *     
     */
    public void setDataFrameRef(DataFrameRefStructure value) {
        this.dataFrameRef = value;
    }

    public boolean isSetDataFrameRef() {
        return (this.dataFrameRef!= null);
    }

    /**
     * Obtient la valeur de la propriété datedVehicleJourneyRef.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDatedVehicleJourneyRef() {
        return datedVehicleJourneyRef;
    }

    /**
     * Définit la valeur de la propriété datedVehicleJourneyRef.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDatedVehicleJourneyRef(String value) {
        this.datedVehicleJourneyRef = value;
    }

    public boolean isSetDatedVehicleJourneyRef() {
        return (this.datedVehicleJourneyRef!= null);
    }

}
