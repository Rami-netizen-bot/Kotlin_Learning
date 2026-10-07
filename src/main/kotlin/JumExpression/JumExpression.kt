package com.core.JumExpression

fun main() {
    val accountlist: List<String> = listOf("Saving", "Deposit", "Junior", "Business", "Loan")
    val account = getAccount(accountlist) {

    }
    println("Account it is $account")

    accountlist.forEach {
        if (it == "") {
            println("Account is ${it}")
        }
    }
}
// lambda not need return
fun getAccount(list: List<String>, onResult: (String) -> Unit) {
    for (item in list) {
        if (item.lowercase() == "Junior") {
            onResult(item)
            break
        }
        println(item)
    }

}

/**
 * Homework related to jump Expression
 * - data class to create a model for Transaction
 * - Create transaction list
 * - Loop transaction , check transaction id , break
 * - Apply it with continue
 * - Create function that contain a list transaction a parameter return transaction object
 */