
package eu.datex2.schema._2_0rc1._2_0;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour VehicleTypeEnum.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * <p>
 * <pre>
 * &lt;simpleType name="VehicleTypeEnum">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="anyVehicle"/>
 *     &lt;enumeration value="articulatedVehicle"/>
 *     &lt;enumeration value="bicycle"/>
 *     &lt;enumeration value="bus"/>
 *     &lt;enumeration value="car"/>
 *     &lt;enumeration value="caravan"/>
 *     &lt;enumeration value="carOrLightVehicle"/>
 *     &lt;enumeration value="carWithCaravan"/>
 *     &lt;enumeration value="carWithTrailer"/>
 *     &lt;enumeration value="fourWheelDrive"/>
 *     &lt;enumeration value="highSidedVehicle"/>
 *     &lt;enumeration value="lorry"/>
 *     &lt;enumeration value="moped"/>
 *     &lt;enumeration value="motorcycle"/>
 *     &lt;enumeration value="motorcycleWithSideCar"/>
 *     &lt;enumeration value="motorscooter"/>
 *     &lt;enumeration value="tanker"/>
 *     &lt;enumeration value="threeWheeledVehicle"/>
 *     &lt;enumeration value="trailer"/>
 *     &lt;enumeration value="tram"/>
 *     &lt;enumeration value="twoWheeledVehicle"/>
 *     &lt;enumeration value="van"/>
 *     &lt;enumeration value="vehicleWithCatalyticConverter"/>
 *     &lt;enumeration value="vehicleWithoutCatalyticConverter"/>
 *     &lt;enumeration value="vehicleWithCaravan"/>
 *     &lt;enumeration value="vehicleWithTrailer"/>
 *     &lt;enumeration value="withEvenNumberedRegistrationPlates"/>
 *     &lt;enumeration value="withOddNumberedRegistrationPlates"/>
 *     &lt;enumeration value="other"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "VehicleTypeEnum")
@XmlEnum
public enum VehicleTypeEnum {

    @XmlEnumValue("anyVehicle")
    ANY_VEHICLE("anyVehicle"),
    @XmlEnumValue("articulatedVehicle")
    ARTICULATED_VEHICLE("articulatedVehicle"),
    @XmlEnumValue("bicycle")
    BICYCLE("bicycle"),
    @XmlEnumValue("bus")
    BUS("bus"),
    @XmlEnumValue("car")
    CAR("car"),
    @XmlEnumValue("caravan")
    CARAVAN("caravan"),
    @XmlEnumValue("carOrLightVehicle")
    CAR_OR_LIGHT_VEHICLE("carOrLightVehicle"),
    @XmlEnumValue("carWithCaravan")
    CAR_WITH_CARAVAN("carWithCaravan"),
    @XmlEnumValue("carWithTrailer")
    CAR_WITH_TRAILER("carWithTrailer"),
    @XmlEnumValue("fourWheelDrive")
    FOUR_WHEEL_DRIVE("fourWheelDrive"),
    @XmlEnumValue("highSidedVehicle")
    HIGH_SIDED_VEHICLE("highSidedVehicle"),
    @XmlEnumValue("lorry")
    LORRY("lorry"),
    @XmlEnumValue("moped")
    MOPED("moped"),
    @XmlEnumValue("motorcycle")
    MOTORCYCLE("motorcycle"),
    @XmlEnumValue("motorcycleWithSideCar")
    MOTORCYCLE_WITH_SIDE_CAR("motorcycleWithSideCar"),
    @XmlEnumValue("motorscooter")
    MOTORSCOOTER("motorscooter"),
    @XmlEnumValue("tanker")
    TANKER("tanker"),
    @XmlEnumValue("threeWheeledVehicle")
    THREE_WHEELED_VEHICLE("threeWheeledVehicle"),
    @XmlEnumValue("trailer")
    TRAILER("trailer"),
    @XmlEnumValue("tram")
    TRAM("tram"),
    @XmlEnumValue("twoWheeledVehicle")
    TWO_WHEELED_VEHICLE("twoWheeledVehicle"),
    @XmlEnumValue("van")
    VAN("van"),
    @XmlEnumValue("vehicleWithCatalyticConverter")
    VEHICLE_WITH_CATALYTIC_CONVERTER("vehicleWithCatalyticConverter"),
    @XmlEnumValue("vehicleWithoutCatalyticConverter")
    VEHICLE_WITHOUT_CATALYTIC_CONVERTER("vehicleWithoutCatalyticConverter"),
    @XmlEnumValue("vehicleWithCaravan")
    VEHICLE_WITH_CARAVAN("vehicleWithCaravan"),
    @XmlEnumValue("vehicleWithTrailer")
    VEHICLE_WITH_TRAILER("vehicleWithTrailer"),
    @XmlEnumValue("withEvenNumberedRegistrationPlates")
    WITH_EVEN_NUMBERED_REGISTRATION_PLATES("withEvenNumberedRegistrationPlates"),
    @XmlEnumValue("withOddNumberedRegistrationPlates")
    WITH_ODD_NUMBERED_REGISTRATION_PLATES("withOddNumberedRegistrationPlates"),
    @XmlEnumValue("other")
    OTHER("other");
    private final String value;

    VehicleTypeEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static VehicleTypeEnum fromValue(String v) {
        for (VehicleTypeEnum c: VehicleTypeEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
