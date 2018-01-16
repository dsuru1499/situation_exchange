
package uk.org.siri.siri;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour RoutePointTypeEnumeration.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * <p>
 * <pre>
 * &lt;simpleType name="RoutePointTypeEnumeration">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN">
 *     &lt;enumeration value="pti15_0"/>
 *     &lt;enumeration value="unknown"/>
 *     &lt;enumeration value="pti15_1"/>
 *     &lt;enumeration value="startPoint"/>
 *     &lt;enumeration value="pti15_2"/>
 *     &lt;enumeration value="destination"/>
 *     &lt;enumeration value="pti15_3"/>
 *     &lt;enumeration value="stop"/>
 *     &lt;enumeration value="pti15_4"/>
 *     &lt;enumeration value="via"/>
 *     &lt;enumeration value="pti15_5"/>
 *     &lt;enumeration value="notStopping"/>
 *     &lt;enumeration value="pti15_6"/>
 *     &lt;enumeration value="temporaryStop"/>
 *     &lt;enumeration value="pti15_7"/>
 *     &lt;enumeration value="temporarilyNotStopping"/>
 *     &lt;enumeration value="pti15_8"/>
 *     &lt;enumeration value="exceptionalStop"/>
 *     &lt;enumeration value="pti15_9"/>
 *     &lt;enumeration value="additionalStop"/>
 *     &lt;enumeration value="pti15_10"/>
 *     &lt;enumeration value="requestStop"/>
 *     &lt;enumeration value="pti15_11"/>
 *     &lt;enumeration value="frontTrainDestination"/>
 *     &lt;enumeration value="pti15_12"/>
 *     &lt;enumeration value="rearTrainDestination"/>
 *     &lt;enumeration value="pti15_13"/>
 *     &lt;enumeration value="throughServiceDestination"/>
 *     &lt;enumeration value="pti15_14"/>
 *     &lt;enumeration value="notVia"/>
 *     &lt;enumeration value="pti15_15"/>
 *     &lt;enumeration value="alteredStartPoint"/>
 *     &lt;enumeration value="pti15_16"/>
 *     &lt;enumeration value="alteredDestination"/>
 *     &lt;enumeration value="pti15_255"/>
 *     &lt;enumeration value="undefinedRoutePoint"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "RoutePointTypeEnumeration")
@XmlEnum
public enum RoutePointTypeEnumeration {

    @XmlEnumValue("pti15_0")
    PTI_15_0("pti15_0"),
    @XmlEnumValue("unknown")
    UNKNOWN("unknown"),
    @XmlEnumValue("pti15_1")
    PTI_15_1("pti15_1"),
    @XmlEnumValue("startPoint")
    START_POINT("startPoint"),
    @XmlEnumValue("pti15_2")
    PTI_15_2("pti15_2"),
    @XmlEnumValue("destination")
    DESTINATION("destination"),
    @XmlEnumValue("pti15_3")
    PTI_15_3("pti15_3"),
    @XmlEnumValue("stop")
    STOP("stop"),
    @XmlEnumValue("pti15_4")
    PTI_15_4("pti15_4"),
    @XmlEnumValue("via")
    VIA("via"),
    @XmlEnumValue("pti15_5")
    PTI_15_5("pti15_5"),
    @XmlEnumValue("notStopping")
    NOT_STOPPING("notStopping"),
    @XmlEnumValue("pti15_6")
    PTI_15_6("pti15_6"),
    @XmlEnumValue("temporaryStop")
    TEMPORARY_STOP("temporaryStop"),
    @XmlEnumValue("pti15_7")
    PTI_15_7("pti15_7"),
    @XmlEnumValue("temporarilyNotStopping")
    TEMPORARILY_NOT_STOPPING("temporarilyNotStopping"),
    @XmlEnumValue("pti15_8")
    PTI_15_8("pti15_8"),
    @XmlEnumValue("exceptionalStop")
    EXCEPTIONAL_STOP("exceptionalStop"),
    @XmlEnumValue("pti15_9")
    PTI_15_9("pti15_9"),
    @XmlEnumValue("additionalStop")
    ADDITIONAL_STOP("additionalStop"),
    @XmlEnumValue("pti15_10")
    PTI_15_10("pti15_10"),
    @XmlEnumValue("requestStop")
    REQUEST_STOP("requestStop"),
    @XmlEnumValue("pti15_11")
    PTI_15_11("pti15_11"),
    @XmlEnumValue("frontTrainDestination")
    FRONT_TRAIN_DESTINATION("frontTrainDestination"),
    @XmlEnumValue("pti15_12")
    PTI_15_12("pti15_12"),
    @XmlEnumValue("rearTrainDestination")
    REAR_TRAIN_DESTINATION("rearTrainDestination"),
    @XmlEnumValue("pti15_13")
    PTI_15_13("pti15_13"),
    @XmlEnumValue("throughServiceDestination")
    THROUGH_SERVICE_DESTINATION("throughServiceDestination"),
    @XmlEnumValue("pti15_14")
    PTI_15_14("pti15_14"),
    @XmlEnumValue("notVia")
    NOT_VIA("notVia"),
    @XmlEnumValue("pti15_15")
    PTI_15_15("pti15_15"),
    @XmlEnumValue("alteredStartPoint")
    ALTERED_START_POINT("alteredStartPoint"),
    @XmlEnumValue("pti15_16")
    PTI_15_16("pti15_16"),
    @XmlEnumValue("alteredDestination")
    ALTERED_DESTINATION("alteredDestination"),
    @XmlEnumValue("pti15_255")
    PTI_15_255("pti15_255"),
    @XmlEnumValue("undefinedRoutePoint")
    UNDEFINED_ROUTE_POINT("undefinedRoutePoint");
    private final String value;

    RoutePointTypeEnumeration(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static RoutePointTypeEnumeration fromValue(String v) {
        for (RoutePointTypeEnumeration c: RoutePointTypeEnumeration.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
