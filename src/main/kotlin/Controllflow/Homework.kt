package com.core.Controllflow

import com.sun.org.apache.xml.internal.serializer.Version.getProduct

/**
 * Homework
 *  - Practices if/else condition (Convert day code to day name)
 *      - Example : "0.0" -> Sunday
 *  -Research and testing about when expression in kotlin
 *      -find few example for testing
 *
 */

fun main() {
    println(getDaynamewthIfelse("01"))
    println("========Example==========")
    println(getNamWhen("03"))
    println("========Example==========")
    println(getGrade(78))
    println("========Example==========")
    println(chechNum(0))
    println("========Example==========")
    println(identifyData("RamyMan"))
    println(identifyData(10))
    println("========Example==========")
    println(processCommand("Start"))
    println("========Example==========")
    val productId = "30000"
    val barCode = ""
    getTeacherIdcard("120000")

}

fun getDaynamewthIfelse(decode: String): String {
    var dayname: String

    if (decode == "00") {
        dayname = "Sunday"
    } else if (decode == "01") {
        dayname = "Monday"
    } else if (decode == "02") {
        dayname = "Tuesday"
    } else if (decode == "03") {
        dayname = "Wednesday"
    } else if (decode == "04") {
        dayname = "Thursday"
    } else if (decode == "05") {
        dayname = "Friday"
    } else if (decode == "06") {
        dayname = "Saturday"
    } else {
        dayname = "Invalid Code"
    }
    return dayname

}

// Use Expression Example
fun getNamWhen(daycode: String): String {
    return when (daycode) {
        "01" -> "Monday"
        "02" -> "Tuesday"
        "03" -> "Wednesday"
        "04" -> "Thursday"
        "05" -> "Friday"
        "06" -> "Saturday"
        "07" -> "Sunday"
        else -> "Invalid Code"
    }
}

// Use Expression to find Rang
fun getGrade(score: Int): String {
    return when (score) {
        in 90..100 -> "Grade A $score"
        in 80..89 -> "Grade B $score "
        in 70..79 -> "Grade C $score "
        in 60..69 -> "Grade D $score "
        in 0..59 -> "Grade E $score "
        else -> "Invalid Code"
    }
}


fun chekDay(day: String): String {
    return when (day) {
        "Saturday", "Sunday" -> "It's the weekend"
        "Monday", "Tuesday", "Wednesday", "Thursday", "Friday" -> "It's the weekday"
        else -> "Unkown day"
    }
}

// whithout agrument
fun chechNum(number: Int): String {
    return when {
        number == 0 -> "The number is exactly zero"
        number % 2 == 0 -> "The number is even"
        number % 2 == 1 -> "The number is odd"
        number < 0 -> "The number is negative"
        else -> "Invalid Number"
    }
}

// Use this on Expression
fun identifyData(data: Any) {
    when (data) {
        is String -> println("It's is text , and its length is ${data.length} characters")
        is Int -> println("It's a whole number , and multiplied by 2 it equals ${data * 2} .")
        is Boolean -> println("It's a true/false : $data")
        else -> println("Unkown datatype")
    }

}

fun processCommand(command: String) {
    when (command.uppercase()) {
        "START" -> {
            println("Booting up the system...")
            println("Loading files...")
            println("System is ready...")
        }

        "STOP" -> {
            println("saving data....")
            println("Shutting files...")
        }

        else -> println("Command not recognized. Please try again.")
    }
}

fun progressCode(barCode: String, productId: String) {
    when {
        barCode == "20000" && productId == "002" -> {
            println("Product A")
        }

        barCode == "20000" && productId == "003" -> {
            println("Product B")
        }

        barCode == "30000" -> {
            println("Another Product")
        }

        else -> println("Unkown Product")
    }

}

fun getTeacherIdcard(nidCard: String) {
    when (nidCard) {
        "120000", "130000" -> {
            println("Cambodian's Product")
        }
        else -> println("Unkown country Product")
    }
}

/**\
 * Researcher coding convention
 * -camel case (productName) : variable , function
 * -Pascal case(ProductName) : Class
 * -Upper Snack Case (PRODUCT_NAME) : compile time variable or property ,state
 */