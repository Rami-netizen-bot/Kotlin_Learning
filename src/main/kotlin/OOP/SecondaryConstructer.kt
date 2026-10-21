package com.core.OOP

// Primary constructor
class Person(val fullName: String, val sex: String) {
    var ages = 0
    constructor(firstName: String, lastName: String, sex: String): this(
        fullName = "$firstName $lastName",
        sex = sex
    ){
        if (firstName.isEmpty()) {
            println("First name is cann't be empty")
        } else if (lastName.isEmpty()) {
            println("Last name is cann't be empty")
        }
    }

    fun display() {
        println("$fullName is displayed")
        println("$sex is displayed")
    }

    constructor(firstName: String,lastName: String,sex: String,age: Int) : this(fullName = "$firstName $lastName", sex = sex){ // delegate to primary constructor
        if ( age < 0 ){
            println("Age invalid ")
        }
    }
}

/**
 * if Class it doesn't have  primary constructor that not call keyword this ()
 * but if it Inherit for Super class use keyword Supper()
 */

fun main() {
    val fistName: String = "Ramy"
    val lastName: String = "Oop"

    val fullName: String = "$lastName, $fistName" // String Template or  Concat in JavaScrip

    val person1 = Person(fullName = fullName, sex = "Male")

    getUserinput()

}

fun getUserinput(){
    val fistName: String = "Oop"
    val lastName: String = "Oop2"
    val sex: String = "Female"

    val person2 = Person(firstName = fistName, lastName = lastName, sex = sex)
    person2.display()
}

