package com.core.Amount

class Verical {
    var position :Int = 0


    fun moveUp(steps: Int){
        position += steps
        println("Moving $position")
    }

    fun moveDown(steps: Int){
        position -= steps
        println("Moving $position")
    }
}