/**
 *
 * Homework
 * *Research and Practice **
 * - Create a class related Bank Account
 * - Add Primary constructor
 * - Add few method (OnFreeze , onClose)
 * - Create 5 instance
 *      - Saving Account
 *      - Deposit Account
 *      - Loan Account
 *      - ...
 *      - ...
 *      - ...
 *      - Add init block to perform and operation such as validation and etc.
 */
package com.core.Homework
// Constructor
class BankAccount(
    var accountNumber: String,
    var accountHolder: String,
    var accountType: String,
    var balance: Double
) {
    var isFrozen = false
    var isClosed = false
    // Method to Frozen
    fun isFreezed(){
        if (!isClosed){
            isFrozen = true
            println("Frozen account: $accountNumber")
        } else {
            println("Closed account: $accountNumber")
        }
    }
    // Method to Closed
    fun isClosed(){
        if (!isClosed){
            isClosed = true
            isFrozen = false
            println("$accountNumber has been closed")
        } else {
            println("Closed account: $accountNumber")
        }
    }
    fun display(){
        println("Account Number: $accountNumber")
        println("Account Holder: $accountHolder")
        println("Account Type: $accountType")
        println("Balance: $balance")
        println("Frozen: $isFrozen")
        println("Closed: $isClosed")
        println("-------------------")
    }
}

fun main() {
    val accountMrOne = BankAccount(
        "ORK001", "Mr. One", "Saving Account", 1000.0
    )

    val accountMrTwo = BankAccount(
        "ORK002", "Mr. Two", "Deposit Account", 2500.0
    )

    val accountMrThree = BankAccount(
        "ORK003", "Mr. Three", "Loan Account", 5000.0
    )

    val accountMrFour = BankAccount(
        "ORK004", "Mr. Four", "Current Account", 3500.0
    ) //  Access modifier
//    println("Account 1: ${accountMrOne.accountNumber}, ${accountMrOne.accountHolder}, ${accountMrOne.accountType}, $${accountMrOne.balance}")
//    println("Account 2: ${accountMrTwo.accountNumber}, ${accountMrTwo.accountHolder}, ${accountMrTwo.accountType}, $${accountMrTwo.balance}")
//    println("Account 3: ${accountMrThree.accountNumber}, ${accountMrThree.accountHolder}, ${accountMrThree.accountType}, $${accountMrThree.balance}")
//    println("Account 4: ${accountMrFour.accountNumber}, ${accountMrFour.accountHolder}, ${accountMrFour.accountType}, $${accountMrFour.balance}")
//
    // Freeze account MrOne
    accountMrOne.isFreezed()
    // Close account MrTwo
    accountMrTwo.isClosed()
    println("----------------------")
    // Display all account
    accountMrOne.display()
    accountMrTwo.display()
    accountMrThree.display()
    accountMrFour.display()

}