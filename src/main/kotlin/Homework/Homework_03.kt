package com.core.Homework

/**
 * Homework related to jump Expression
 * - data class to create a model for Transaction
 * - Create transaction list
 * - Loop transaction , check transaction id , break
 * - Apply it with continue
 * - Create function that contain a list transaction a parameter return transaction object
 */

fun main() {
    print("Get input Transaction Id ======>")
    val tragettrainsactionId = readLine()
    // loop transaction , check transaction id, break
    for (transaction in transactionList){
     //   println("Checking transaction : $tragettrainsactionId")
        if (transaction.transationId == tragettrainsactionId){
            println("Successfully checked transaction $transaction")
            break
        }
    }


    print("Get input Transaction Id ======>")
    // Apply Continue
    val skiptransactionId = readLine()
    for (transaction1 in transactionList){
        if (transaction1.transationId == skiptransactionId){
//            println("Skip transaction $skiptransactionId")
            continue
        }
        println("Transaction $transaction1")
    }
    val findId: String? = readLine()
    val result = findtransactionId(list = transactionList,findId)
    print("Found $result")

}

// Create Data class for Transaction
data class TransactionModel(
    val transationId: String,
    val senderName: String,
    val senderAccountNo: String,
    val receiverName: String,
    val receiverAccountNo: String,
    val transactionAmount: Double,
    val transactionCurrency: String,
    val transactionTypeString: String,
    val debitAmount: Double,
    val creditAmount: Double,
)

// Create transaction list
val transactionList = listOf(
    TransactionModel(
        transationId = "TXN1001",
        senderName = "Alice Smith",
        senderAccountNo = "1234567890",
        receiverName = "Bob Johnson",
        receiverAccountNo = "0987654321",
        transactionAmount = 150.00,
        transactionCurrency = "USD",
        transactionTypeString = "TRANSFER",
        debitAmount = 150.00,
        creditAmount = 0.0
    ),
    TransactionModel(
        transationId = "TXN1002",
        senderName = "Bob Johnson",
        senderAccountNo = "0987654321",
        receiverName = "Coffee Shop",
        receiverAccountNo = "5555555555",
        transactionAmount = 4.50,
        transactionCurrency = "USD",
        transactionTypeString = "PAYMENT",
        debitAmount = 4.50,
        creditAmount = 0.0
    ),
    TransactionModel(
        transationId = "TXN1003",
        senderName = "Employer Inc",
        senderAccountNo = "9998887776",
        receiverName = "Alice Smith",
        receiverAccountNo = "1234567890",
        transactionAmount = 2500.00,
        transactionCurrency = "USD",
        transactionTypeString = "SALARY",
        debitAmount = 0.0,
        creditAmount = 2500.00
    ),
    TransactionModel(
        transationId = "TXN1004",
        senderName = "Alice Smith",
        senderAccountNo = "1234567890",
        receiverName = "City Power & Light",
        receiverAccountNo = "1122334455",
        transactionAmount = 85.20,
        transactionCurrency = "USD",
        transactionTypeString = "BILL_PAY",
        debitAmount = 85.20,
        creditAmount = 0.0
    ),
    TransactionModel(
        transationId = "TXN1005",
        senderName = "Charlie Davis",
        senderAccountNo = "4444333322",
        receiverName = "Bob Johnson",
        receiverAccountNo = "0987654321",
        transactionAmount = 50.00,
        transactionCurrency = "USD",
        transactionTypeString = "TRANSFER",
        debitAmount = 0.0,
        creditAmount = 50.00
    ),
    TransactionModel(
        transationId = "TXN1006",
        senderName = "Alice Smith",
        senderAccountNo = "1234567890",
        receiverName = "Main St ATM",
        receiverAccountNo = "ATM0001",
        transactionAmount = 100.00,
        transactionCurrency = "USD",
        transactionTypeString = "WITHDRAWAL",
        debitAmount = 100.00,
        creditAmount = 0.0
    ),
    TransactionModel(
        transationId = "TXN1007",
        senderName = "Bob Johnson",
        senderAccountNo = "0987654321",
        receiverName = "Streaming Service",
        receiverAccountNo = "7778889990",
        transactionAmount = 14.99,
        transactionCurrency = "USD",
        transactionTypeString = "SUBSCRIPTION",
        debitAmount = 14.99,
        creditAmount = 0.0
    )
)

// Create function find id
fun findtransactionId(list: List<TransactionModel>, transationId: String?): TransactionModel?{
    for (transaction in list){
        if (transaction.transationId == transationId){
            return transaction
        }
    }
    return null
}