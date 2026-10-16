package com.core.Pracetice

fun main() {
    val result = measureTime("Calculate Sum"){
        var sum = 0
        for (i in 1..1000) {
            sum +=i
        }
        sum
    }
    println("Result: $result")
}

inline fun <T> measureTime(taskName: String,block: () -> T): T {
    val startTime = System.nanoTime()
    val result = block()
    val endTime = System.nanoTime()
    val duration = (endTime - startTime) / 1000000
    println("$taskName took $duration ms")
    return result
}