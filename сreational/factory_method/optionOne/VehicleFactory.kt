package сreational.factory_method.optionOne

interface VehicleFactory {
    fun createVehicle(type: VehicleType): Vehicle
}