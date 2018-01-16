
package uk.org.siri.siri;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * Abstract Service Request for SIRI Service request.
 * 
 * <p>Classe Java pour AbstractFunctionalServiceRequestStructure complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="AbstractFunctionalServiceRequestStructure">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.siri.org.uk/siri}AbstractServiceRequestStructure">
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AbstractFunctionalServiceRequestStructure")
@XmlSeeAlso({
    ProductionTimetableRequestStructure.class,
    EstimatedTimetableRequestStructure.class,
    StopTimetableRequestStructure.class,
    StopMonitoringMultipleRequestStructure.class,
    StopMonitoringRequestStructure.class,
    VehicleMonitoringRequestStructure.class,
    ConnectionTimetableRequestStructure.class,
    ConnectionMonitoringRequestStructure.class,
    GeneralMessageRequestStructure.class,
    FacilityMonitoringRequestStructure.class,
    SituationExchangeRequestStructure.class
})
public abstract class AbstractFunctionalServiceRequestStructure
    extends AbstractServiceRequestStructure
    implements Serializable
{

    private final static long serialVersionUID = 1L;

}
