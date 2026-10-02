package com.core.Amount

class Amount {
    var value = 0
    var currency  :String = "USD"

    fun addfound(amountTotal: Int) : Int {
        value += amountTotal
        return amountTotal
    }

    fun display(){
        println("Total $value  $currency")
    }
}