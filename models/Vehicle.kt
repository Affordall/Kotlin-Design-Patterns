package models

interface Vehicle {
    fun moveForward()
    fun moveBack()
    fun moveRight()
    fun moveLeft()
    fun stop()

    fun getType(): VehicleType
}