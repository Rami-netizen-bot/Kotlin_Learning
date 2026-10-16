package com.core.function

import com.core.Datatype.TransactionAccount

/**
 *  + Fee Charge by transaction
 *  - 100 -1000 no fee
 *  - Greater 1000 - 5000 Free Charge 5$
 *  - Greater 5000 - 10000 Free Charge 15$
 *
 */
fun calculatefee(transactionAccount: Double, onResult: (feeCharge: Double) -> Unit) {
    when (transactionAccount) {
        in 100.0..1000.0 -> {
            onResult(0.0)
        }

        in 1000.1..5000.0 -> {
            onResult(5.0)
        }

        in 5000.1..100000.0 -> {
            onResult(15.0)
        }

        else -> {
            onResult(20.0)
        }
    }
}

fun main() {
    calculatefee(1000.0) {
        println(it)
    }
    calculatefee(1000.0, onResult = {
        println(it)
    })

    requestApi("", onSuccess = { message ->
        println(message)

    }) { errorCode, errorMessage ->
        println("$errorCode: $errorMessage")
    }

    requestApi(
        "Ramy",
        onSuccess = { println(it) },
        onFailure = { errorCode, errorMessage -> println("$errorCode: $errorMessage}") })
}


fun requestApi(
    value: String,
    onSuccess: (message: String) -> Unit,
    onFailure: (errorCode: String, errorMessage: String) -> Unit
) {
    if (value.isEmpty()) {
        onFailure("001", "Value to be empty")
    } else {
        onSuccess("Request is getting successful")
    }

}