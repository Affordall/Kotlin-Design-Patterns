package behavioral.observer.optionOne

import kotlin.properties.Delegates

/**
 *
 */
class Observer {
    val optionOne: Int by Delegates.observable(0) { property, oldValue, newValue ->
        println("Property ${property} is changed from ${oldValue} to ${newValue}")
    }
}