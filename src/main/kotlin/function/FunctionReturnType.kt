package com.core.function

/**
 * Bank
 * - 01 ABA Bank
 * - 02 Chip Mong Bank
 * -03 Acleda
 * - 04 KB Prasac
 * - 05 Woori Bank
 * - 06 PPC Bank
 * - 07 Armret Bank
 */

fun main() {
    getTransaction()
}

fun getBank(){
    val bankCodeList = listOf<String>("01","02","03","04","05","06","07")
    for (code in bankCodeList){
        val bankname = convertBankCodetoBankname(bankCode = code)
        printValue(bankname)
    }
}

// We can use when expression
fun convertBankCodetoBankname(bankCode: String) : String {
    return when (bankCode) {
        "01" -> "ABA Bank"
        "02" -> "Chip Mong Bank"
        "03" -> "Acleda"
        "04" -> "KB Prasac"
        "05" -> "Woori Bank"
        "06" -> "PPC Bank"
        "07" -> "Amret Bank"
        else -> "Invalid Bank"
    }
}

fun getTransaction(){
    val transactionId2 = readLine()
    val transactionDetail = searchTransactionById2(transactionList,transactionId2)
    println(transactionDetail)
}

fun searchTransactionById2(list: List<Transaction>, transactionId: String?): Transaction? { // optional when return null
   // control flow
    for (transaction in list) {
        if (transaction.transactionId == transactionId) {
            return transaction
        }
    }
    return null
}

// inline function
