package com.core.Model

class Order (
    val orderId: Long,
    val qunatity: Int,
    val uniprice: Double,
    val widgetPerItem: Float
) {
    fun calculateTotal(): Double {
        return qunatity * uniprice
    }

    fun calculateTotalWeight(): Float {
        return qunatity * widgetPerItem
    }

}