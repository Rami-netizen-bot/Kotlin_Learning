package com.core.encapulationandinheritance

/**
 * Parent Class Use Keyword Open for other class can extance or inherit
 */
open class Loan {
    /**
     * allow all access
     */
    var loanId: String = "030303" // Public
    private var borrowName: String = ""  // Private use only in class or Internal member
    protected var amountBorrow : Double = 0.0 // Protected only internal member and sub class

    fun assignBorrow(name: String) {
        borrowName = name
    }
}

/**
 * Subclass or child class extance from Parent class
 */

class CarLoan : Loan(){
    fun update(name:  String, amount: Double){
        this.loanId = "020202" // can modify
        this.amountBorrow = amount
    }
}


fun main() {
    val loan1 = Loan()
    loan1.loanId = "030303###"

}


/**
 * Apply loan Business formated
 */