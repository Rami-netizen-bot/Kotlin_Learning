package com.core.JumExpression

data class Transaction(
    val id: String,
    val username: String,
    val amount : Double,
    val type : String,
)

fun main() {
   // Create Transaction List
    val transactions = listOf(
        Transaction("T001", "Dara", 500.0, "Deposit"),
        Transaction("T002", "Sokha", 1000.0, "Withdraw"),
        Transaction("T003", "Rina", 750.0, "Deposit"),
        Transaction("T004", "Vanna", 750.0, "Withdraw"),
        Transaction("T005", "Ramy", 1000.0, "Withdraw"),
    )
}

fun checkTransactionBack(transactions: List<Transaction>) {
    for (transaction in transactions ) {
        println("Checking ${transaction.id}")
        if (transaction.id == "T001") {
            println("Transaction Found")
            println("${transaction.username}")
            break
        }
    }
    println("Loop ended")
}

//fun showDeposit(transactions: List<Transaction>) {
//    for
//
//}