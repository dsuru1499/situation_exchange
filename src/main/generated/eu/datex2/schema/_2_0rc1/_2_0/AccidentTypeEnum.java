
package eu.datex2.schema._2_0rc1._2_0;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour AccidentTypeEnum.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * <p>
 * <pre>
 * &lt;simpleType name="AccidentTypeEnum">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="accident"/>
 *     &lt;enumeration value="accidentInvolvingBicycles"/>
 *     &lt;enumeration value="accidentInvolvingBuses"/>
 *     &lt;enumeration value="accidentInvolvingHazardousMaterials"/>
 *     &lt;enumeration value="accidentInvolvingHeavyLorries"/>
 *     &lt;enumeration value="accidentInvolvingMassTransitVehicle"/>
 *     &lt;enumeration value="accidentInvolvingMopeds"/>
 *     &lt;enumeration value="accidentInvolvingMotorcycles"/>
 *     &lt;enumeration value="accidentInvolvingRadioactiveMaterial"/>
 *     &lt;enumeration value="accidentInvolvingTrain"/>
 *     &lt;enumeration value="chemicalSpillageAccident"/>
 *     &lt;enumeration value="collision"/>
 *     &lt;enumeration value="collisionWithAnimal"/>
 *     &lt;enumeration value="collisionWithObstruction"/>
 *     &lt;enumeration value="collisionWithPerson"/>
 *     &lt;enumeration value="earlierAccident"/>
 *     &lt;enumeration value="fuelSpillageAccident"/>
 *     &lt;enumeration value="headOnCollision"/>
 *     &lt;enumeration value="headOnOrSideCollision"/>
 *     &lt;enumeration value="jackknifedArticulatedLorry"/>
 *     &lt;enumeration value="jackknifedCaravan"/>
 *     &lt;enumeration value="jackknifedTrailer"/>
 *     &lt;enumeration value="multipleVehicleCollision"/>
 *     &lt;enumeration value="multivehicleAccident"/>
 *     &lt;enumeration value="oilSpillageAccident"/>
 *     &lt;enumeration value="overturnedHeavyLorry"/>
 *     &lt;enumeration value="overturnedTrailer"/>
 *     &lt;enumeration value="overturnedVehicle"/>
 *     &lt;enumeration value="rearCollision"/>
 *     &lt;enumeration value="secondaryAccident"/>
 *     &lt;enumeration value="seriousAccident"/>
 *     &lt;enumeration value="sideCollision"/>
 *     &lt;enumeration value="vehicleOffRoad"/>
 *     &lt;enumeration value="vehicleSpunAround"/>
 *     &lt;enumeration value="other"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "AccidentTypeEnum")
@XmlEnum
public enum AccidentTypeEnum {

    @XmlEnumValue("accident")
    ACCIDENT("accident"),
    @XmlEnumValue("accidentInvolvingBicycles")
    ACCIDENT_INVOLVING_BICYCLES("accidentInvolvingBicycles"),
    @XmlEnumValue("accidentInvolvingBuses")
    ACCIDENT_INVOLVING_BUSES("accidentInvolvingBuses"),
    @XmlEnumValue("accidentInvolvingHazardousMaterials")
    ACCIDENT_INVOLVING_HAZARDOUS_MATERIALS("accidentInvolvingHazardousMaterials"),
    @XmlEnumValue("accidentInvolvingHeavyLorries")
    ACCIDENT_INVOLVING_HEAVY_LORRIES("accidentInvolvingHeavyLorries"),
    @XmlEnumValue("accidentInvolvingMassTransitVehicle")
    ACCIDENT_INVOLVING_MASS_TRANSIT_VEHICLE("accidentInvolvingMassTransitVehicle"),
    @XmlEnumValue("accidentInvolvingMopeds")
    ACCIDENT_INVOLVING_MOPEDS("accidentInvolvingMopeds"),
    @XmlEnumValue("accidentInvolvingMotorcycles")
    ACCIDENT_INVOLVING_MOTORCYCLES("accidentInvolvingMotorcycles"),
    @XmlEnumValue("accidentInvolvingRadioactiveMaterial")
    ACCIDENT_INVOLVING_RADIOACTIVE_MATERIAL("accidentInvolvingRadioactiveMaterial"),
    @XmlEnumValue("accidentInvolvingTrain")
    ACCIDENT_INVOLVING_TRAIN("accidentInvolvingTrain"),
    @XmlEnumValue("chemicalSpillageAccident")
    CHEMICAL_SPILLAGE_ACCIDENT("chemicalSpillageAccident"),
    @XmlEnumValue("collision")
    COLLISION("collision"),
    @XmlEnumValue("collisionWithAnimal")
    COLLISION_WITH_ANIMAL("collisionWithAnimal"),
    @XmlEnumValue("collisionWithObstruction")
    COLLISION_WITH_OBSTRUCTION("collisionWithObstruction"),
    @XmlEnumValue("collisionWithPerson")
    COLLISION_WITH_PERSON("collisionWithPerson"),
    @XmlEnumValue("earlierAccident")
    EARLIER_ACCIDENT("earlierAccident"),
    @XmlEnumValue("fuelSpillageAccident")
    FUEL_SPILLAGE_ACCIDENT("fuelSpillageAccident"),
    @XmlEnumValue("headOnCollision")
    HEAD_ON_COLLISION("headOnCollision"),
    @XmlEnumValue("headOnOrSideCollision")
    HEAD_ON_OR_SIDE_COLLISION("headOnOrSideCollision"),
    @XmlEnumValue("jackknifedArticulatedLorry")
    JACKKNIFED_ARTICULATED_LORRY("jackknifedArticulatedLorry"),
    @XmlEnumValue("jackknifedCaravan")
    JACKKNIFED_CARAVAN("jackknifedCaravan"),
    @XmlEnumValue("jackknifedTrailer")
    JACKKNIFED_TRAILER("jackknifedTrailer"),
    @XmlEnumValue("multipleVehicleCollision")
    MULTIPLE_VEHICLE_COLLISION("multipleVehicleCollision"),
    @XmlEnumValue("multivehicleAccident")
    MULTIVEHICLE_ACCIDENT("multivehicleAccident"),
    @XmlEnumValue("oilSpillageAccident")
    OIL_SPILLAGE_ACCIDENT("oilSpillageAccident"),
    @XmlEnumValue("overturnedHeavyLorry")
    OVERTURNED_HEAVY_LORRY("overturnedHeavyLorry"),
    @XmlEnumValue("overturnedTrailer")
    OVERTURNED_TRAILER("overturnedTrailer"),
    @XmlEnumValue("overturnedVehicle")
    OVERTURNED_VEHICLE("overturnedVehicle"),
    @XmlEnumValue("rearCollision")
    REAR_COLLISION("rearCollision"),
    @XmlEnumValue("secondaryAccident")
    SECONDARY_ACCIDENT("secondaryAccident"),
    @XmlEnumValue("seriousAccident")
    SERIOUS_ACCIDENT("seriousAccident"),
    @XmlEnumValue("sideCollision")
    SIDE_COLLISION("sideCollision"),
    @XmlEnumValue("vehicleOffRoad")
    VEHICLE_OFF_ROAD("vehicleOffRoad"),
    @XmlEnumValue("vehicleSpunAround")
    VEHICLE_SPUN_AROUND("vehicleSpunAround"),
    @XmlEnumValue("other")
    OTHER("other");
    private final String value;

    AccidentTypeEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static AccidentTypeEnum fromValue(String v) {
        for (AccidentTypeEnum c: AccidentTypeEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
