package com.core.OOP

/**
 * in Class has 2 = Class Header and class Body
 */

// contructer = Parametter
class Student(val name : String, val address : String) {
    /**
     * This is group is call data member or property or state store data
     * When we call property inside the class , it refers to data member
     */
    var studentName: String = ""
    var gender: String = ""
    lateinit var materialStatus: String
    val height: Int = 150
    var isAlive: Boolean = true
//    var isActive : Boolean = false
    /**
     * Behavior member or method = function
     *
     */

    fun walk() {

    }

    fun standUp() {

    }

    fun run() {

    }

    fun sing() {

    }

    fun study() {

    }
}

fun main() {
    val student1 = Student(name = "Ramy", address = "Takeo") // Create Object
    student1.gender = "Male" // setter Input Data
    student1.studentName = "Seyha"
    student1.height
    student1.materialStatus = "Single"

    println("Student1: ${student1.studentName}") // getter get data from object
    println("Student1: ${student1.gender}")
    println("Student1: ${student1.height}")
    println("Student1: ${student1.materialStatus}")
    println("============")
    val student2 = Student(name = "Ramy", address = "Takeo") // Access Modifier
    student1.gender = "Male"
    student1.studentName = "Seyha"
    student1.height
    student1.materialStatus = "Single"

    println("Student2: ${student1.studentName}")
    println("Student2: ${student1.gender}")
    println("Student2: ${student1.height}")
    println("Student2: ${student1.materialStatus}")

    /**
     * - Not override data but instancce data form class
     */
}


/**
 *
 * Homework
 * *Research and Practice **
 * - Create a class related Bank Account
 * - Add Primary constructor
 * - Add few method (OnFreeze , onClose)
 * - Create 5 instance
 *      - Saving Account
 *      - Deposit Account
 *      - Loan Account
 *      - ...
 *      - ...
 *      - ...
 *      - Add init block to perform and operation such as validation and etc.
 */