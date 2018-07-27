package models

/**
 * By default, all the classes in Kotlin are final (non-inheritable).
 * To allow a class to be inherited by others, you must mark it with the open modifier.
 */

open class Car: Vehicle {

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
        return VehicleType.CAR
    }
}