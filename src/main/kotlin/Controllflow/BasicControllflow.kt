package com.core.Controllflow

fun main() {

    val count = 13 // argument
    checkCount(count)
    checkPointStuent(12)
}

fun checkCount (count: Int){ // parameter
    if (count == 10){
        println("Hello World")
    } else if (count == 12){
        println("Hello it not true")
    } else {
        println("Hello it true")
    }
}

fun checkPointStuent(score: Int){
    var grade = ""

    if (score == 100){
        grade = "A"
    } else if (score >= 80 && score <= 90 ){
        grade = "B"
    } else if (score <= 80 && score >= 70){
        grade = "C"
    } else if (score <= 70 && score >= 60){
        grade = "D"
    } else if (score <= 59){
        grade = "F"
    } else {
        println("$score is not between 10 and 12")
    }
    println("$grade $score")
}

