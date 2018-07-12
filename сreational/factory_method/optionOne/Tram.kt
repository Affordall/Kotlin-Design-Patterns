package сreational.factory_method.optionOne

class Tram: Vehicle {

    override fun moveForward() {
        TODO("not implemented")
    }

    override fun moveBack() {
        TODO("not implemented")
    }

    override fun moveRight() {
        TODO("not implemented")
    }

    override fun moveLeft() {
        TODO("not implemented")
    }

    override fun stop() {
        TODO("not implemented")
    }

    override fun getType(): VehicleType {
        return VehicleType.TRAM
    }


}