/**
 * Topic: Secondary constructor, encapulation and inheritance and also research about OOP
 * 1. Create class and apply the secondary constructor
 * 2. Create a small loan class and apply both encapulation and inheritance
 * 3. Crate subclass and inherit from loan class
 *      - CarLoan
 *      - SamsungLoan
 *      - HouseLoan
 *      - .......
 */
package com.core.Homework

fun main() {
    val car = CarLoan("Car-001",15000.0,"Toyota Pruis")
    val samsung = Samsung("SS-002",1200.0,002.2)
    val houseLocation = HouseLoan("Takeo-Bati","001-LO",1589.02)

    println("================")
    car.displayInfo()
    println("================")
    samsung.displayInfo()
    println("================")
    houseLocation.displayInfo()
}

// Create Class and Apply the scondary construtor
class Loan1 {
    var loanId: String = ""
    var borrowerAmount: String = ""
    var loanAmount: Double = 0.0

    constructor(loanId: String, borrowerAmount: String, loanAmount: Double) {
        this.loanId = loanId
        this.borrowerAmount = borrowerAmount
        this.loanAmount = loanAmount
    }

    constructor(loanId: String, borrowerAmount: String) {
        this.loanId = loanId
        this.borrowerAmount = borrowerAmount
        this.loanAmount = 100.0
    }

}

open class ParentLoan() {
    private var loanId: String = ""
    private var loanAmount: Double = 0.0

    constructor(loanId: String, borrowerAmount: String, loanAmount: Double) : this() {
        this.loanId = loanId
        if (loanAmount > 0) {
            this.loanAmount = loanAmount
        } else {
            this.loanAmount = 100.0
        }
    }
    fun setLoanData(loanId: String,loanAmount: Double){
        this.loanId = loanId
        if (loanAmount > 0) {
            this.loanAmount = loanAmount
        } else {
            this.loanAmount = 100.0
        }
    }

    fun getLoanId(): String = this.loanId
    fun getLoanAmount(): Double = this.loanAmount

    open fun displayInfo() {
        println("$loanId : $loanAmount")
    }

}

class PersonLoan : ParentLoan {
    private var interestRate: Double = 0.0

    constructor(interestRate: Double, loanId: String, loanAmount: Double) {
        this.interestRate = interestRate
    }

    fun getInterestRate(): Double = this.interestRate

    override fun displayInfo() {
        super.displayInfo()
        println("$interestRate%")
    }

}

class CarLoan: ParentLoan {
    private var carModel: String = ""

    constructor(loanId: String, loanAmount: Double, carModel: String)  {
        this.carModel = carModel
        setLoanData(loanId, loanAmount)
    }

    fun getCarModel(): String = this.carModel
    override fun displayInfo(){
        super.displayInfo()
        println("$carModel%")
    }

}

class HouseLoan: ParentLoan {
    private var houseLocation: String = ""
    constructor(houseLocation: String, loanId: String, loanAmount: Double) {
        this.houseLocation = houseLocation
        setLoanData(loanId, loanAmount)
    }

    fun getHouseLocation(): String = this.houseLocation
    override fun displayInfo() {
        super.displayInfo()
        println("$houseLocation%")
    }
}

class Samsung : ParentLoan {
    private var deviceName: String = ""
    constructor(deviceName: String , loanId: String, loanAmount: Double) {
        this.deviceName = deviceName
        setLoanData(loanId, loanAmount)
    }

    constructor(deviceName: String, loanId: Double, loanAmount: Double)

    fun getDeviceName(): String = this.deviceName
    override fun displayInfo() {
        super.displayInfo()
        println("$deviceName%")
    }
}


