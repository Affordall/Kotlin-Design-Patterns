package сreational.factory_method.optionOne

import models.VehicleType

/*
Classic implementations
 */
class FactoryMethod {

    // Factory used as a class
    val railsVehicleFactory = RailsVehicleFactory()
    val train = railsVehicleFactory.createVehicle(VehicleType.TRAIN)

    /**
     * If function [RailsVehicleFactory.createVehicle]
     * will be marked as 'infix' then you can use this syntax.
     */
    val tram = railsVehicleFactory createVehicle VehicleType.TRAM

    // Factory is an object
    val ship = WatercraftVehicleFactory.createVehicle(VehicleType.SHIP)

}