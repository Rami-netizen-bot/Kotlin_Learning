package com.core.function

import kotlin.system.measureTimeMillis

fun main() {
    val timeInlinefunction = measureTimeMillis {
        repeat(1000) {
            recordTimeInline {
                repeat(10000) {
                    var count = 1
                    for (i in 1..1000) {
                        count += i
                    }
                    while (count < 1000){
                        count--
                    }
                }
            }
        }
    }
    val timeNormalFunction = measureTimeMillis {

        repeat(1000) {
            recordTimeNoInline {
                repeat(10000) {
                    var count = 1
                    for (i in 1..1000) {
                        count += i
                    }
                    while (count < 1000){
                        count--
                    }
                }
            }
        }
    }
    println("Record Inline function is $timeInlinefunction")
    println("Record Normal function is $timeNormalFunction")
}


inline fun recordTimeInline(
    block: () -> Unit,
//   noinline block2: () -> Unit,
){
//    val time = measureTimeMillis {
//        block()
//    }
//    println("Inline function time: $time ms")
    block()
//    block2()
}

fun recordTimeNoInline(
    block: () -> Unit // optimize on this block only
) {
    val time = measureTimeMillis {
        block()
    }
    println("No Inline function time: $time ms")
}

/**
 * Homework
 * 1.Create a loan model using data class
 *  - id : required
 *  - borrowAmound : required
 * 2.Create a list that contain 10 object of loan
 * 3.Create a function return type that can search loan by id and return loan object
 * 4.Create an inline function and test with recording time as a millisecond
 * 5.Add new parameter in inline function and mark is as online
 */