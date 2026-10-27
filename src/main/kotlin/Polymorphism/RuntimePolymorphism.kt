package com.core.Polymorphism

//open class User{
//    open var username: String = "" // property or member
//
//    open fun onLogin(id :String,password:String){
//        println("$id : $password")
//    }
//    open fun downloadProfile(profileId:String){
//
//    }
//}
//
//
//class Sok: User() {
//    override var username: String = ""
//    get() = super.username // make parent class do work
//
//    override fun downloadProfile(profileId: String) {
//        super.downloadProfile(profileId)
//    }
//
//    override fun onLogin(id: String, password: String) {
//
//    }
//}

open class CalculateScore(private val passScore: Double) {
    open fun isPassed(curentScore : Double): Boolean {
        return passScore >= curentScore
    }
}

class CalculateScoreAtUniversity : CalculateScore(60.5) {
    override fun isPassed(curentScore : Double): Boolean {
        return super.isPassed(curentScore)
    }
}

class CalculateSccoreAtPrimarySchool : CalculateScore(25.0) {
    override fun isPassed(curentScore : Double): Boolean {
        return curentScore >= 25
    }
}

fun main() {
    val kotlinProgramingScore : Double = 48.5
    val calculated =  CalculateSccoreAtPrimarySchool()
    val isPassed = calculated.isPassed(kotlinProgramingScore)
}

/**
 * Practice
 *  - create class apply open class and open member
 *  - create subclass and inherit form superclass
 *  - create method overriding
 */