///*
//- Homework: Library Book Tracker
//- 1. Create a Book model using data class
//-    - isbn : Int (required)
//-    - title : String (required)
//-    - rentalFee : Double (required)
//- 2. Create a list that contains 10 objects of Book
//- 3. Create two functions with return types:
//-    - Search a Book by isbn and return the Book object
//-    - Filter all Books where rentalFee is greater than a given amount and return List<Book>
//- 4. Create an inline function and test both functions while recording the execution time in milliseconds
//- 5. Add a new lambda parameter in the inline function for error handling and mark it as noinline
//*/
//
//package com.core.Pracetice
//
//import kotlin.system.measureTimeMillis
//
//fun main() {
//    print("Get to input the homeworks to find isbn :")
//    val targetIsbn = readLine()!!.toInt()
//    val timeInlinfuction = measureTimeMillis {
//        recordPatient(block = { val result = searchPatient(libraryList, targetIsbn) }, other = {
//            print("Search Patient list ...")
//        })
//    }
//}
//
//data class Libaray(
//    val isbn: Int,
//    val title: String,
//    val rentalFee: Double,
//)
//
//val libraryList = listOf(
//    Libaray(1001, "Kotlin Basics", 2.50),
//    Libaray(1002, "Android Development", 3.00),
//    Libaray(1003, "Java Programming", 2.75),
//    Libaray(1004, "Python for Beginners", 2.00),
//    Libaray(1005, "Data Structures", 3.50),
//    Libaray(1006, "Clean Code", 4.00),
//    Libaray(1007, "Computer Networks", 3.25),
//    Libaray(1008, "Database Systems", 3.75),
//    Libaray(1009, "Algorithms", 4.50),
//    Libaray(1010, "Software Engineering", 3.00)
//)
//
//fun researchLibrary(list: List<Libaray>, isbn: Int): Libaray? {
//    for (lib in list) {
//        if (lib.isbn == isbn) {
//            return lib
//        }
//    }
//    return null
//}
//
//inline fun recordLibray(block: () -> Unit, noinline other: () -> Unit) {
//    val times = measureTimeMillis {
//        block()
//        other()
//    }
//    println("Total Libray: ${times}ms")
//}