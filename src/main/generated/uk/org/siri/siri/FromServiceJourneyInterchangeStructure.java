
package uk.org.siri.siri;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * A planned SERVICE JOURNEY INTERCHANGE from a journey. +SIRI v2.0
 * 
 * <p>Classe Java pour FromServiceJourneyInterchangeStructure complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="FromServiceJourneyInterchangeStructure">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.siri.org.uk/siri}AbstractServiceJourneyInterchangeStructure">
 *       &lt;sequence>
 *         &lt;element name="InterchangeCode" type="{http://www.siri.org.uk/siri}InterchangeCodeType" minOccurs="0"/>
 *         &lt;element name="ConnectionLinkRef" type="{http://www.siri.org.uk/siri}ConnectionLinkRefStructure" minOccurs="0"/>
 *         &lt;element name="FeederRef" type="{http://www.siri.org.uk/siri}ConnectingJourneyRefStructure"/>
 *         &lt;element name="FeederArrivalStopRef" type="{http://www.siri.org.uk/siri}StopPointRefStructure"/>
 *         &lt;element name="FeederVisitNumber" type="{http://www.siri.org.uk/siri}VisitNumberType" minOccurs="0"/>
 *         &lt;element name="DistributorRef" type="{http://www.siri.org.uk/siri}ConnectingJourneyRefStructure" maxOccurs="0" minOccurs="0"/>
 *         &lt;element name="DistributorDepartureStopRef" type="{http://www.siri.org.uk/siri}StopPointRefStructure" maxOccurs="0" minOccurs="0"/>
 *         &lt;element name="DistributorVisitNumber" type="{http://www.siri.org.uk/siri}VisitNumberType" maxOccurs="0" minOccurs="0"/>
 *         &lt;group ref="{http://www.siri.org.uk/siri}InterchangePropertyGroup"/>
 *         &lt;group ref="{http://www.siri.org.uk/siri}InterchangeTimesGroup"/>
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
@XmlType(name = "FromServiceJourneyInterchangeStructure")
public class FromServiceJourneyInterchangeStructure
    extends AbstractServiceJourneyInterchangeStructure
    implements Serializable
{

    private final static long serialVersionUID = 1L;

}
