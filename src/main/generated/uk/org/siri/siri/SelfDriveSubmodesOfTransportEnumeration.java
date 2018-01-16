
package uk.org.siri.siri;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour SelfDriveSubmodesOfTransportEnumeration.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * <p>
 * <pre>
 * &lt;simpleType name="SelfDriveSubmodesOfTransportEnumeration">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN">
 *     &lt;enumeration value="pti12_0"/>
 *     &lt;enumeration value="unknown"/>
 *     &lt;enumeration value="pti12_1"/>
 *     &lt;enumeration value="hireCar"/>
 *     &lt;enumeration value="pti12_2"/>
 *     &lt;enumeration value="hireVan"/>
 *     &lt;enumeration value="pti12_3"/>
 *     &lt;enumeration value="hireMotorbike"/>
 *     &lt;enumeration value="pti12_4"/>
 *     &lt;enumeration value="hireCycle"/>
 *     &lt;enumeration value="pti12_5"/>
 *     &lt;enumeration value="allHireVehicles"/>
 *     &lt;enumeration value="pti12_255"/>
 *     &lt;enumeration value="undefinedHireVehicle"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "SelfDriveSubmodesOfTransportEnumeration")
@XmlEnum
public enum SelfDriveSubmodesOfTransportEnumeration {

    @XmlEnumValue("pti12_0")
    PTI_12_0("pti12_0"),
    @XmlEnumValue("unknown")
    UNKNOWN("unknown"),
    @XmlEnumValue("pti12_1")
    PTI_12_1("pti12_1"),
    @XmlEnumValue("hireCar")
    HIRE_CAR("hireCar"),
    @XmlEnumValue("pti12_2")
    PTI_12_2("pti12_2"),
    @XmlEnumValue("hireVan")
    HIRE_VAN("hireVan"),
    @XmlEnumValue("pti12_3")
    PTI_12_3("pti12_3"),
    @XmlEnumValue("hireMotorbike")
    HIRE_MOTORBIKE("hireMotorbike"),
    @XmlEnumValue("pti12_4")
    PTI_12_4("pti12_4"),
    @XmlEnumValue("hireCycle")
    HIRE_CYCLE("hireCycle"),
    @XmlEnumValue("pti12_5")
    PTI_12_5("pti12_5"),
    @XmlEnumValue("allHireVehicles")
    ALL_HIRE_VEHICLES("allHireVehicles"),
    @XmlEnumValue("pti12_255")
    PTI_12_255("pti12_255"),
    @XmlEnumValue("undefinedHireVehicle")
    UNDEFINED_HIRE_VEHICLE("undefinedHireVehicle");
    private final String value;

    SelfDriveSubmodesOfTransportEnumeration(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static SelfDriveSubmodesOfTransportEnumeration fromValue(String v) {
        for (SelfDriveSubmodesOfTransportEnumeration c: SelfDriveSubmodesOfTransportEnumeration.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}