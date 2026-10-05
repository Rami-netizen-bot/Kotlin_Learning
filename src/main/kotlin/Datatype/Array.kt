package com.core.Datatype

fun main() {
    val stringArray : Array<String> = arrayOf("Hello", "World")
    val inArray : Array<Int> = arrayOf(1, 2, 3)
    val doubleArray : Array<Double> = arrayOf(1.2, 3.3)
    var emptyArray : Array<String> = emptyArray()    // Not change

//    emptyArray[0] = "Hello"
//
//    println(emptyArray[0])
//    println("===========> $stringArray")

//    for (item in stringArray) {
//        println("===========>${item}")
//        println(item.length)
//    }

    for (item in stringArray) {
        if (item.isEmpty()) {
            println("====>${item}")
        }


    } // value = empty

    println(stringArray.isNotEmpty())//true
    println(stringArray.isEmpty())//false

    var mutableArray : MutableList<Int> = arrayListOf(1, 2, 3)
    val people : MutableList<String>  = mutableListOf("ramy", "Web", "Nano")

    people.add("Vantha")

    println("=>>>>>>>>>Befor Add ${people.size}")

    people.remove("ramy")
    println("=>>>>>>>>>>>After remove ${people.size}")
}