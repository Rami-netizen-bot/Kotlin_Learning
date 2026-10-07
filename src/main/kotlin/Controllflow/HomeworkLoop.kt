package com.core.Controllflow

// Data class
data class BankAccount(
    val accountName: String,
    val accountNumber: String,
    val balance: Double

)

fun main() {
    // Account list
    val accounts : List<BankAccount> = listOf(
        BankAccount("Ramy","001", 1500.0),
        BankAccount("Dara","002", 1500.0),
        BankAccount("Nary","003", 1500.0),
        BankAccount("Kakada","004", 1500.0),
        BankAccount("Davy","002", 1500.0),
    )
    println ("----Bank Accounts---")
    for (account in accounts) {
        println("Account : ${account.accountName} | Balance: ${account.balance}")
    }
    println("--- Login System ----")

    var attempt = 0
    var isAuthenticated = false

    while (attempt < 3 && !isAuthenticated) {
        println("Enter Username : ")
        val username = readLine()
        println("Enter Password: : ")
        val password = readLine()

        if (username == "Ramy" && password == "040805") {
            println("Login Successful")
            isAuthenticated = true
        } else {
            attempt++
            println("Incorrect username or password")

            if (attempt == 3){
                println("Maximum attemps reached. Account Locked")
                break
            }
        }
    }


}