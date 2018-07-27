package behavioral.observer.optionOne

import models.Train
import models.Vehicle
import kotlin.properties.Delegates

/**
 *
 */
class Observer {

    val vehicle: Vehicle by Delegates.observable(Train()) { property, oldValue, newValue ->
        println("Property ${property} is changed from ${oldValue} to ${newValue}")
    }
}