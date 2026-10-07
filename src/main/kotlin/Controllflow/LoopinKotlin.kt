package com.core.Controllflow

fun main() {
    val accountlist: List<String> = listOf("Saving", "Deposit", "Junior", "Business", "Loan")

    for (item in accountlist) {
        println("====> $item")
    }
    println("loop is ended")

    println("=========Example=========")
    deviceElec()
    println("=========Example=========")
    exampleWithArray()
}


/**
 * - Practice for loop
 * - Create an array relate electronic device
 * - Use for loop and print the element of an array
 */

fun deviceElec() {
    val devices: List<String> = listOf("Laptop", "Airpod", "Smart Phone", "Head Phone")
    for (item in devices.indices) {
        println("Item ${devices[item]} is at position $item")
    }
    println("loop is ended")
}

fun exampleWithArray() {
    val days: Array<String> = arrayOf("01", "02", "03", "04", "05", "06", "07")
    val listStudent: List<Studentinfo> = listOf(
        Studentinfo(
            stuentId = "001", stuentName = "Laptop", age = 21
        ),
        Studentinfo(
            stuentId = "001", stuentName = "Laptop", age = 21
        ),
        Studentinfo(
            stuentId = "001", stuentName = "Laptop", age = 21
        ),
        Studentinfo(
            stuentId = "001", stuentName = "Laptop", age = 21
        ),
        Studentinfo(
            stuentId = "001", stuentName = "Laptop", age = 21
        ),
        Studentinfo(
            stuentId = "001", stuentName = "Laptop", age = 21
        ),


        )
    // Create obj implement studentInfo Model
//    val data = Studentinfo(
//        stuentId = "001", stuentName = "Laptop", age = 21
//    )
//    for (day in days) {
//        when (day) {
//            "01" -> {
//                println("Monday")
//            }
//
//            "02" -> {
//                println("Tuesday")
//            }
//
//            "03" -> {
//                println("Wednesday")
//            }
//
//            "04" -> {
//                println("Thursday")
//            }
//
//            "05" -> {
//                println("Friday")
//            }
//
//            "06" -> {
//                println("Saturday")
//            }
//
//            "07" -> {
//                println("Sunday")
//            }
//
//            else -> {
//                println("Unknown day")
//            }
//        }
        // can use foreach loop
        listStudent.forEach {
            student -> if (student.age >= 18) {
                println("Student ${student.stuentName} is ${student.age} years old")
            } else {
                println("Student ${student.stuentName} is under 18 years old")
        }
        }
    }




// create object hold dynamic data or call model
data class Studentinfo(
    val stuentId: String, val stuentName: String, val age: Int
)
