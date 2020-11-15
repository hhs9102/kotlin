package me.ham.basic.domain.site

data class SiteVisit(val path: String, val duration: Double, val os: OS)

enum class OS {WINDOWS, LINUX, MAC, IOS, ANDROID}

val log = listOf(SiteVisit("/", 34.0, OS.WINDOWS),
    SiteVisit("/", 22.0, OS.MAC),
    SiteVisit("/login", 12.0, OS.WINDOWS),
    SiteVisit("/signup", 8.0, OS.IOS),
    SiteVisit("/", 16.3, OS.ANDROID)
)

fun main() {
    val averageWindowsDuration = log
        .filter { s-> s.os == OS.WINDOWS }
        .map (SiteVisit::duration)
        .average()

    println(averageWindowsDuration)
    println(log.averageDurationFor(OS.WINDOWS))
    println(log.averageDurationFor(OS.IOS))
}

fun List<SiteVisit>.averageDurationFor(os:OS): Double
        = filter { it.os == os }.map(SiteVisit::duration).average()