package singleton.optionOne

/**
 * In Kotlin 'object' is a singleton.
 * Objects can’t have a constructor.
 * And the instance of 'object' will be created at the first time we use it. (lazy initialization)
 *
 * Usage:
 * Singleton.doSome()
 */

object Singleton {

    fun doSome() {
        TODO()
    }

}