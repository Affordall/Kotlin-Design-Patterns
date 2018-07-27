package сreational.factory_method.optionOne

import models.Vehicle
import models.VehicleType

interface VehicleFactory {
    fun createVehicle(type: VehicleType): Vehicle
}