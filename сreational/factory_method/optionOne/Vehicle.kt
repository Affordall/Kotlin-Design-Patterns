package сreational.factory_method.optionOne

interface Vehicle {
    fun moveForward()
    fun moveBack()
    fun moveRight()
    fun moveLeft()
    fun stop()

    fun getType(): VehicleType
}