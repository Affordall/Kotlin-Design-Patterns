package сreational.factory_method.optionOne

import models.Ship
import models.Vehicle
import models.VehicleType

/*
Factory can be an object and still works
 */

object WatercraftVehicleFactory: VehicleFactory {

    override fun createVehicle(type: VehicleType): Vehicle {
        return when (type) {
            VehicleType.SHIP -> Ship()
            VehicleType.BOAT -> TODO()
            else -> throw IllegalArgumentException("Unknown watercraft vehicle type: $type")
        }
    }

}