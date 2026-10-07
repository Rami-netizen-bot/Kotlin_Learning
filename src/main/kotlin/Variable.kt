package com.core

fun main() {
    val name : String = "name"

    var age : Int = 0

// val immutable
// var mmutable


    var status : String = "PREPARING"

    val myArray = arrayOf("Apple", "Banana", "Pear", "Grape")
    myArray[0] = "Ramy"

    println(myArray[0])
    var myVarray = arrayOf("Apple", "Banana", "Pear", "Grape")
    myVarray[0] = "Ramy"

    println(myVarray[0])
    var studenList : List<String> = listOf("Apple", "Banana", "Pear", "Grape")
    println(studenList)
    studenList = emptyList()
}