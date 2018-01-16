
package uk.org.siri.siri;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour MobilityFacilityEnumeration.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * <p>
 * <pre>
 * &lt;simpleType name="MobilityFacilityEnumeration">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN">
 *     &lt;enumeration value="pti23_255_4"/>
 *     &lt;enumeration value="unknown"/>
 *     &lt;enumeration value="pti23_16"/>
 *     &lt;enumeration value="suitableForWheelChairs"/>
 *     &lt;enumeration value="pti23_16_1"/>
 *     &lt;enumeration value="lowFloor"/>
 *     &lt;enumeration value="pti23_16_2"/>
 *     &lt;enumeration value="boardingAssistance"/>
 *     &lt;enumeration value="pti23_16_3"/>
 *     &lt;enumeration value="stepFreeAccess"/>
 *     &lt;enumeration value="tactilePatformEdges"/>
 *     &lt;enumeration value="onboardAssistance"/>
 *     &lt;enumeration value="unaccompaniedMinorAssistance"/>
 *     &lt;enumeration value="audioInformation"/>
 *     &lt;enumeration value="visualInformation"/>
 *     &lt;enumeration value="displaysForVisuallyImpaired"/>
 *     &lt;enumeration value="audioForHearingImpaired"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "MobilityFacilityEnumeration")
@XmlEnum
public enum MobilityFacilityEnumeration {

    @XmlEnumValue("pti23_255_4")
    PTI_23_255_4("pti23_255_4"),
    @XmlEnumValue("unknown")
    UNKNOWN("unknown"),
    @XmlEnumValue("pti23_16")
    PTI_23_16("pti23_16"),
    @XmlEnumValue("suitableForWheelChairs")
    SUITABLE_FOR_WHEEL_CHAIRS("suitableForWheelChairs"),
    @XmlEnumValue("pti23_16_1")
    PTI_23_16_1("pti23_16_1"),
    @XmlEnumValue("lowFloor")
    LOW_FLOOR("lowFloor"),
    @XmlEnumValue("pti23_16_2")
    PTI_23_16_2("pti23_16_2"),
    @XmlEnumValue("boardingAssistance")
    BOARDING_ASSISTANCE("boardingAssistance"),
    @XmlEnumValue("pti23_16_3")
    PTI_23_16_3("pti23_16_3"),
    @XmlEnumValue("stepFreeAccess")
    STEP_FREE_ACCESS("stepFreeAccess"),
    @XmlEnumValue("tactilePatformEdges")
    TACTILE_PATFORM_EDGES("tactilePatformEdges"),
    @XmlEnumValue("onboardAssistance")
    ONBOARD_ASSISTANCE("onboardAssistance"),
    @XmlEnumValue("unaccompaniedMinorAssistance")
    UNACCOMPANIED_MINOR_ASSISTANCE("unaccompaniedMinorAssistance"),
    @XmlEnumValue("audioInformation")
    AUDIO_INFORMATION("audioInformation"),
    @XmlEnumValue("visualInformation")
    VISUAL_INFORMATION("visualInformation"),
    @XmlEnumValue("displaysForVisuallyImpaired")
    DISPLAYS_FOR_VISUALLY_IMPAIRED("displaysForVisuallyImpaired"),
    @XmlEnumValue("audioForHearingImpaired")
    AUDIO_FOR_HEARING_IMPAIRED("audioForHearingImpaired");
    private final String value;

    MobilityFacilityEnumeration(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static MobilityFacilityEnumeration fromValue(String v) {
        for (MobilityFacilityEnumeration c: MobilityFacilityEnumeration.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}