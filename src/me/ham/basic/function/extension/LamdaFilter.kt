package me.ham.basic.function.extension

import junit.framework.Assert.assertEquals
import org.junit.Test

data class SiteVisit(
    val path: String,
    val duration: Double,
    val os: OS
)

enum class OS{
    WINDOWS, MAC, LINUX, IOS, ANDROID
}

fun List<SiteVisit>.averageDuration(predicate: (SiteVisit)->Boolean) =
    filter(predicate)
        .map{it.duration}
        .average()

val logs = listOf(
    SiteVisit("/", 34.0, OS.WINDOWS),
    SiteVisit("/", 22.0, OS.MAC),
    SiteVisit("/login", 12.0, OS.WINDOWS),
    SiteVisit("/signup", 8.0, OS.IOS),
    SiteVisit("/", 16.3, OS.ANDROID)
)

class LamdaFilterTest{
    @Test
    fun durationAverageTest(){
        val windowExpectedDuration = logs.filter { it.os == OS.WINDOWS }.map { it.duration }.average()
        assertEquals(windowExpectedDuration, logs.averageDuration { it.os == OS.WINDOWS })

        val macExpectedDuration = logs.filter { it.os == OS.MAC }.map { it.duration }.average()
        assertEquals(macExpectedDuration, logs.averageDuration { it.os == OS.MAC })
    }
}


