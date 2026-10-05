package com.core.Datatype

//import sun.security.krb5.KrbException.errorMessage
// lesson Aliase
typealias Username = String
typealias Progress = () -> Unit
typealias AccountNo = String
typealias TransactionAccount = Double
typealias Failue = (errorCode :String, errorMessage: String) -> Unit
typealias Success = (BankAccount) -> Unit

fun main() {

//    val name : String = "Ramy"
    //  val name : Username = "Ramy"

    val toAccountNo: AccountNo = "10005157"
    val transactionAmount: TransactionAccount = 100.0

    transfer(
        toAccountNo = toAccountNo, // access modifier
        transactionAmount = transactionAmount,
        onProgress = {println("Transfer is progress...")},
        onSuccess = {println("Successfully saved account $toAccountNo")},
        onFailure = {
                errorCode, errorMessage -> println("=>>>>>> Error")
        }
    )

}

fun transfer(
    onProgress: Progress,
    toAccountNo: String,
    transactionAmount: Double,
    onSuccess: (BankAccount) -> Unit,
    onFailure: Failue,
) {
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
    val listAccount: List<BankAccount> = listOf(savingAccount, currencyAccount)
    val result = listAccount.find { account -> account.accountNumber == toAccountNo }
//    println(result)

// return obj
    if (result == null) {
        onFailure("Error fetching account $toAccountNo", "Reciver fetching account $toAccountNo")
    } else {
        onSuccess(result)
    }
}