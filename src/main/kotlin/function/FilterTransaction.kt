package com.core.function

fun searchTransactionById3(list: List<Transaction>, transactionId: String?): Transaction? { // optional when return null
    for (transaction in list) {
        if (transaction.transactionId == transactionId) {
            //  val date = if (transaction.transactionDate == "2026-10-04") "20261004" else ""
            // in block statement can be use expression
            return transaction
        }
    }
    return null
}