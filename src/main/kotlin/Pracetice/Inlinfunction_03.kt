/*
- Homework: Patient Record System
- 1. Create a Patient model using data class
-    - patientCode : String (required)
-    - billAmount : Double (required)
-    - isDischarged : Boolean (optional, default = false)
- 2. Create a list that contains 10 objects of Patient
- 3. Create a function with a return type that can search a Patient by patientCode and return the Patient object
- 4. Create an inline function and test the search by recording the execution time in milliseconds
- 5. Add a new lambda parameter in the inline function (e.g., logger) and mark it as noinline so it can be stored in a variable
*/
package com.core.Pracetice

import kotlin.system.measureTimeMillis

fun main() {
    val targetPatient = readLine()!!.toInt()

//    val timeInlinfuction = measureTimeMillis {
//        recordPatient(block = {
//            val result = searchPatient(patientList,targetPatient)
//            println("Patient $result")
//        }, other = {
//            println("Search Patient for $targetPatient")
//        })
//    }
}


data class Patient(
    val patientcode: Int,
    val billAmount : Double,
    val isDischarge : Boolean = false
)


val patientList = listOf(
    Patient(1, 150.0),
    Patient(2, 250.0, true),
    Patient(3, 300.0),
    Patient(4, 175.0, true),
    Patient(5, 500.0),
    Patient(6, 120.0, false),
    Patient(7, 450.0, true),
    Patient(8, 220.0),
    Patient(9, 600.0, false),
    Patient(10, 180.0, true)
)

//fun searchPatient(list: List<Libaray>, patientcode: Int): Patient? {
//    for (patient in list) {
//        if (patient.patientcode == patientcode) {
//            return patient
//        }
//
//    }
//    return null
//}

inline fun recordPatient(block : ()-> Unit, noinline other : ()-> Unit) {
    val time = measureTimeMillis {
        block()
        other()
    }
}