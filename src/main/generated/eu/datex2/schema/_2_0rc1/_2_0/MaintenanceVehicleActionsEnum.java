
package eu.datex2.schema._2_0rc1._2_0;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour MaintenanceVehicleActionsEnum.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * <p>
 * <pre>
 * &lt;simpleType name="MaintenanceVehicleActionsEnum">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="maintenanceVehiclesMergingIntoTrafficFlow"/>
 *     &lt;enumeration value="saltAndGritSpreading"/>
 *     &lt;enumeration value="slowMoving"/>
 *     &lt;enumeration value="snowClearing"/>
 *     &lt;enumeration value="stoppingToServiceEquipments"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "MaintenanceVehicleActionsEnum")
@XmlEnum
public enum MaintenanceVehicleActionsEnum {

    @XmlEnumValue("maintenanceVehiclesMergingIntoTrafficFlow")
    MAINTENANCE_VEHICLES_MERGING_INTO_TRAFFIC_FLOW("maintenanceVehiclesMergingIntoTrafficFlow"),
    @XmlEnumValue("saltAndGritSpreading")
    SALT_AND_GRIT_SPREADING("saltAndGritSpreading"),
    @XmlEnumValue("slowMoving")
    SLOW_MOVING("slowMoving"),
    @XmlEnumValue("snowClearing")
    SNOW_CLEARING("snowClearing"),
    @XmlEnumValue("stoppingToServiceEquipments")
    STOPPING_TO_SERVICE_EQUIPMENTS("stoppingToServiceEquipments");
    private final String value;

    MaintenanceVehicleActionsEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static MaintenanceVehicleActionsEnum fromValue(String v) {
        for (MaintenanceVehicleActionsEnum c: MaintenanceVehicleActionsEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
