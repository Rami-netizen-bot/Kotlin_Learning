package com.core.function

fun main() {
    calculateTotal(50.5, 25.0) // Argument
    printValue("Hello world")
    println("====> Example")
    print("Please input command")
    val transactionDate = readLine()
    val transactionResult = filterTransactionBydate(transactionList,transactionDate)
    println("Transaction Date: $transactionResult")
    println("Enter transaction ID:")
    val transactionId : String? = readLine()
    val transaction = searchTransactionById(list = transactionList, transactionId = transactionId)
    println("Transaction ID: $transaction")
}

// function with parametter and block statement
fun calculateTotal(x: Double, y: Double) {
    var total = x * y
}

fun printValue(value: String) {
    println("Value is $value")
}

fun sum(x: Double, y: Double) {
    val x = x + y
}
// function Expression
fun concatFirstnamelastname(firstname: String, lastname: String) : String = "firstname $firstname $lastname"
/**
 * - Create a Model Transaction Model
 * - Create a list of transaction
 * - Create a function that allow to filter transaction by date
 * - Create a function that allow to filter search transaction by id
 */

data class Transaction(
    val transactionId: String,
    val senderName: String,
    val senderAccountNo: String,
    val receiverName: String,
    val receiverAccountNo: String,
    val transactionDate: String,  // yyyyMMdd -> Example 20260208
    val transactionAmount: Double,
    val transactionCurrency: String,
    val transactionTypeString: String,  // Bakong, ABA , Function transfer
    val debitAmount: Double,
    val creditAmount: Double,
)
fun filterTransactionBydate(list: List<Transaction>, transactionDate: String?) : List<Transaction> {
    val newList = list.filter { transaction ->  transaction.transactionDate == transactionDate }
    return newList
}

fun searchTransactionById(list: List<Transaction>, transactionId: String?): Transaction? { // optional when return null
    for (transaction in list) {
        if (transaction.transactionId == transactionId) {
          //  val date = if (transaction.transactionDate == "2026-10-04") "20261004" else ""
            // in block statement can be use expression
            return transaction
        }
    }
    return null
}
//val transactionList = listOf<Transaction>( // model obj
//    Transaction(
//        "TXN001",
//        "Dara",
//        "001234567",
//        "Sokha",
//        "002345678",
//        "2026-10-01",
//        250.00,
//        "USD",
//        "Transfer",
//        250.00,
//        0.00
//    ),
//
//    Transaction(
//        "TXN002",
//        "Sokha",
//        "002345678",
//        "Vanna",
//        "003456789",
//        "2026-10-02",
//        150.00,
//        "USD",
//        "Transfer",
//        150.00,
//        0.00
//    ),
//
//    Transaction(
//        "TXN003",
//        "Vanna",
//        "003456789",
//        "Dara",
//        "001234567",
//        "2026-10-03",
//        500000.00,
//        "KHR",
//        "Payment",
//        500000.00,
//        0.00
//    ),
//
//    Transaction(
//        "TXN004",
//        "Chantha",
//        "004567890",
//        "Sokha",
//        "002345678",
//        "2026-10-04",
//        75.50,
//        "USD",
//        "Transfer",
//        75.50,
//        0.00
//    ),
//
//    Transaction(
//        "TXN005",
//        "Dara",
//        "001234567",
//        "Chantha",
//        "004567890",
//        "2026-10-05",
//        120000.00,
//        "KHR",
//        "Payment",
//        120000.00,
//        0.00
//    ),
//
//    Transaction(
//        "TXN006",
//        "Sokha",
//        "002345678",
//        "Rith",
//        "005678901",
//        "2026-10-06",
//        300.00,
//        "USD",
//        "Transfer",
//        300.00,
//        0.00
//    ),
//
//    Transaction(
//        "TXN007",
//        "Rith",
//        "005678901",
//        "Vanna",
//        "003456789",
//        "2026-10-07",
//        95.00,
//        "USD",
//        "Payment",
//        95.00,
//        0.00
//    ),
//
//    Transaction(
//        "TXN008",
//        "Chantha",
//        "004567890",
//        "Dara",
//        "001234567",
//        "2026-10-08",
//        750000.00,
//        "KHR",
//        "Transfer",
//        750000.00,
//        0.00
//    ),
//
//    Transaction(
//        "TXN009",
//        "Vanna",
//        "003456789",
//        "Chantha",
//        "004567890",
//        "2026-10-08",
//        450.00,
//        "USD",
//        "Payment",
//        450.00,
//        0.00
//    ),
//
//    Transaction(
//        "TXN010",
//        "Rith",
//        "005678901",
//        "Sokha",
//        "002345678",
//        "2026-10-08",
//        200000.00,
//        "KHR",
//        "Transfer",
//        200000.00,
//        0.00
//    )
//)