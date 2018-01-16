
package eu.datex2.schema._2_0rc1._2_0;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour RoadMaintenanceTypeEnum.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * <p>
 * <pre>
 * &lt;simpleType name="RoadMaintenanceTypeEnum">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="clearanceWork"/>
 *     &lt;enumeration value="controlledAvalanche"/>
 *     &lt;enumeration value="installationWork"/>
 *     &lt;enumeration value="grassCuttingWork"/>
 *     &lt;enumeration value="maintenanceWork"/>
 *     &lt;enumeration value="overheadWorks"/>
 *     &lt;enumeration value="repairWork"/>
 *     &lt;enumeration value="resurfacingWork"/>
 *     &lt;enumeration value="roadMarkingWork"/>
 *     &lt;enumeration value="roadsideWork"/>
 *     &lt;enumeration value="roadworksClearance"/>
 *     &lt;enumeration value="roadworks"/>
 *     &lt;enumeration value="rockFallPreventativeMaintenance"/>
 *     &lt;enumeration value="saltingInProgress"/>
 *     &lt;enumeration value="snowploughsInUse"/>
 *     &lt;enumeration value="treeAndVegetationCuttingWork"/>
 *     &lt;enumeration value="other"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "RoadMaintenanceTypeEnum")
@XmlEnum
public enum RoadMaintenanceTypeEnum {

    @XmlEnumValue("clearanceWork")
    CLEARANCE_WORK("clearanceWork"),
    @XmlEnumValue("controlledAvalanche")
    CONTROLLED_AVALANCHE("controlledAvalanche"),
    @XmlEnumValue("installationWork")
    INSTALLATION_WORK("installationWork"),
    @XmlEnumValue("grassCuttingWork")
    GRASS_CUTTING_WORK("grassCuttingWork"),
    @XmlEnumValue("maintenanceWork")
    MAINTENANCE_WORK("maintenanceWork"),
    @XmlEnumValue("overheadWorks")
    OVERHEAD_WORKS("overheadWorks"),
    @XmlEnumValue("repairWork")
    REPAIR_WORK("repairWork"),
    @XmlEnumValue("resurfacingWork")
    RESURFACING_WORK("resurfacingWork"),
    @XmlEnumValue("roadMarkingWork")
    ROAD_MARKING_WORK("roadMarkingWork"),
    @XmlEnumValue("roadsideWork")
    ROADSIDE_WORK("roadsideWork"),
    @XmlEnumValue("roadworksClearance")
    ROADWORKS_CLEARANCE("roadworksClearance"),
    @XmlEnumValue("roadworks")
    ROADWORKS("roadworks"),
    @XmlEnumValue("rockFallPreventativeMaintenance")
    ROCK_FALL_PREVENTATIVE_MAINTENANCE("rockFallPreventativeMaintenance"),
    @XmlEnumValue("saltingInProgress")
    SALTING_IN_PROGRESS("saltingInProgress"),
    @XmlEnumValue("snowploughsInUse")
    SNOWPLOUGHS_IN_USE("snowploughsInUse"),
    @XmlEnumValue("treeAndVegetationCuttingWork")
    TREE_AND_VEGETATION_CUTTING_WORK("treeAndVegetationCuttingWork"),
    @XmlEnumValue("other")
    OTHER("other");
    private final String value;

    RoadMaintenanceTypeEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static RoadMaintenanceTypeEnum fromValue(String v) {
        for (RoadMaintenanceTypeEnum c: RoadMaintenanceTypeEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
