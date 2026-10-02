package com.core.Model

class  User {
    var Age : Int = 0
    var name : String = "Ramy"

    fun displayInfo() {
        println("User Info $name and ID $Age")
    }

    fun updateInfo(nameNew : String , AgeNew : Int) {
        name = nameNew
        Age = AgeNew

        println("Update for User Info $name and Age $Age")
    }

    fun isAdulted(): Boolean {
        return Age >= 18
    }
}