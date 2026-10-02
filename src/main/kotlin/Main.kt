package com.core
import com.core.Model.Calculate
import com.core.Model.User
import com.core.Amount.Verical
import  com.core.Amount.Amount
import com.core.Model.Order
import com.core.Model.Student
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
    val calculator = Calculate()
    val result = calculator.plus(20, 20)
    val result2 = calculator.minus(5, 20)
    println(result)
    displayUser()
    displayAmount()
    displayVertical()
    displayOrder()
    showStudent()
}

fun show (i: Int, y: Int) : Int{
    return if(i % 5 == 0) i else 5
}
fun displayUser(){
    val userMy = User()
    userMy.name = "Ramy"
    userMy.Age = 23
    userMy.updateInfo(nameNew = "My name is ${userMy.name}" , AgeNew = 25)
    if (userMy.isAdulted()) {
        println("${userMy.Age} and ${userMy.name} is adulted")
    } else {
        println("${userMy.Age} is not adulted")
    }
}

fun displayAmount(){
    var myAmount = Amount()
    myAmount.value = 20000
    myAmount.currency = "real"
    myAmount.addfound(amountTotal = 2000)
    myAmount.display()
}

fun displayVertical(){
    var vericalMy = Verical()
    vericalMy.moveUp(steps = 20)
    vericalMy.moveDown(steps = 20)
}


fun displayOrder(){
    var orderMy = Order(orderId =100200300400500L, qunatity = 8, uniprice = 45.50, widgetPerItem = 1.25f )

    val totalCast = orderMy.calculateTotal()
    var totalWeight = orderMy.calculateTotal()


    println("=============")
    println("Order Reference : ${orderMy.orderId}")
    println("Qunatity : ${orderMy.qunatity}")

    println("Total Weight : $totalWeight")
    println("Uniprice: ${totalCast}")

}

fun showStudent(){
    var studentInfo = Student()
    println("------------------")
    studentInfo.Studentname = "Ramy"
    println("Student Name : ${studentInfo.Studentname}")
    studentInfo.studentId = 987654321
    println("Student Id : ${studentInfo.studentId}")
    studentInfo.age = 21
    println("Student Age : ${studentInfo.age}")
    studentInfo.gread = 'H'
    println("Student Gread : ${studentInfo.gread}")
    studentInfo.subjects.add("Java program")
    println("Subject Name : ${studentInfo.subjects}")
    studentInfo.testScores[0] = 15
    studentInfo.testScores[1] = 25
    println("Test Score : ${studentInfo.testScores.joinToString()}")

}
