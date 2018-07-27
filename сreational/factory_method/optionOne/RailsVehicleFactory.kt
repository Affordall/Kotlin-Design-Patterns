package сreational.factory_method.optionOne

import models.Train
import models.Tram
import models.Vehicle
import models.VehicleType

class RailsVehicleFactory: VehicleFactory {

    /*
    Functions marked with the infix keyword can also
    be called using the infix notation
    (omitting the dot and the parentheses for the call)
     */

    override infix fun createVehicle(type: VehicleType): Vehicle {
        return when (type) {
            VehicleType.TRAIN -> Train()
            VehicleType.TRAM -> Tram()
            else -> throw IllegalArgumentException("Unknown rails vehicle type: $type")
        }
    }

}