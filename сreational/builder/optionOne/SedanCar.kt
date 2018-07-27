package сreational.builder.optionOne

import models.Car
import models.Vehicle
import models.VehicleType

/**
 * Builder class (Kotlin-way) with two required fields and one optional
 */
data class SedanCar(val model: String,
                    val manufacturer: String,
                    val maxSpeed: Int? = null): Car()

// Usage

// only with required fields:
// val bmwSedanCar = SedanCar("730i ", "BMW")

// full class:
// val bmwSedanCar = SedanCar("730i ", "BMW", maxSpeed = 250)