package com.core.Datatype

// Model
// Referent type
data class BankAccount(
    val accountNumber: String,
    val accountName: String,
    val createdDate: String,
    val availableDate: String,
    val totalAmount: Double,
    val currency: String,
)

fun main() {
    val savingAccount: BankAccount = BankAccount(        // instance obj
        accountNumber = "10005155",
        accountName = "Ramy",
        createdDate = "2020",
        availableDate = "2030",
        totalAmount = 1278.4,
        currency = "USD"
    )
    val currencyAccount: BankAccount = BankAccount(        // instance obj
        accountNumber = "10005157",
        accountName = "PheakTra",
        createdDate = "2027",
        availableDate = "2030",
        totalAmount = 12898.4,
        currency = "KH"
    )
    val listAccount : List<BankAccount> = listOf(savingAccount, currencyAccount)
//    loop
    for (account in listAccount) {
        println(account)
    }
}