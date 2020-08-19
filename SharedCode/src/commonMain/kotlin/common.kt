package org.mifos.mobile

expect fun platformName(): String

fun createApplicationScreenMessage(): String {
    return "Mifos Mobile now running on ${platformName()}"
}
