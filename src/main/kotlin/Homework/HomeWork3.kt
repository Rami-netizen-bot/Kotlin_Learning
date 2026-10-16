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

package com.core.Homework

import kotlin.system.measureTimeMillis

fun main() {
    println("Get to input the Homework to find Id : ")
    val targetId = readLine()

    val timeInlinefucntion = measureTimeMillis {
        recordInline(
            block = {
            val result = searchLoans(loanList,targetId)
            println("Loan list : $result")
            },
            otherblock = {
                println("Search loan list ...")
            }
        )


    }
    println("Inline function execution time: $timeInlinefucntion ms")
}

data class Loan(
    val id: String,
    val borrowerName: String,
    val borrowAmount: Double,
    val interestRate: Double,
    val loanTermMonths: Int,
    val loanDate: String,
    val dueDate: String,
    val loanStatus: String,
    val phoneNumber: String,
    val description: String
)

val loanList = listOf(
    Loan("L001", "Dara", 1000.0, 5.0, 12, "2026-01-01", "2027-01-01", "Approved", "012345678", "Personal loan"),
    Loan("L002", "Sokha", 2500.0, 7.0, 24, "2026-02-01", "2028-02-01", "Pending", "098765432", "Business loan"),
    Loan("L003", "Vanna", 500.0, 3.0, 6, "2026-03-01", "2026-09-01", "Rejected", "011223344", "Education loan"),
    Loan("L004", "Sophea", 3000.0, 6.0, 18, "2026-04-01", "2027-10-01", "Approved", "015123456", "Car loan"),
    Loan("L005", "Ratha", 1500.0, 4.5, 12, "2026-05-01", "2027-05-01", "Pending", "097123456", "Home improvement"),
    Loan("L006", "Malis", 5000.0, 8.0, 36, "2026-06-01", "2029-06-01", "Approved", "088123456", "Business expansion"),
    Loan("L007", "Borey", 800.0, 3.5, 6, "2026-07-01", "2027-01-01", "Rejected", "010123456", "Personal expenses"),
    Loan("L008", "Kanha", 2000.0, 5.5, 12, "2026-08-01", "2027-08-01", "Approved", "096123456", "Education expenses"),
    Loan("L009", "Dalin", 4000.0, 7.5, 24, "2026-09-01", "2028-09-01", "Pending", "092123456", "House renovation"),
    Loan("L010", "Piseth", 1200.0, 4.0, 12, "2026-10-01", "2027-10-01", "Approved", "069123456", "Motorcycle loan")
)


fun searchLoans(list: List<Loan>, id: String?): Loan? {
    for (loan in list) {
        if (loan.id == id) {
            return loan
        }
    }
    return null
}

inline fun recordInline(
    block: () -> Unit,
    noinline otherblock: () -> Unit
){
    val time = measureTimeMillis {
        block()
        otherblock()
    }
  println("Took $time ms")
}


