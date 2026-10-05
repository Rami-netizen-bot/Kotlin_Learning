package com.core.Datatype

data class OrderRecipt(
    val restaurantId : String,
    val restaurantName : String,
    val estimatedTime : String,
    val totalCost: Double,
    val status : String
)

fun main() {
    val order1  : OrderRecipt = OrderRecipt(
        restaurantId = "Restaurant01",
        restaurantName = "RestaurantCafe",
        estimatedTime = "10 mins ago",
        totalCost = 12.25,
        status = "OK"
    )
    val order2  : OrderRecipt = OrderRecipt(
        restaurantId = "Restaurant02",
        restaurantName = "Pizza Paradise",
        estimatedTime = "15 mins",
        totalCost = 24.99,
        status = "PREPARING"
    )
    val order3  : OrderRecipt = OrderRecipt(
        restaurantId = "Restaurant03",
        restaurantName = "Sushi Express",
        estimatedTime = "15 mins",
        totalCost = 45.99,
        status = "DELIVERED"
    )

    val listOrders : List<OrderRecipt> = listOf(order1, order2, order3)

    for (order in listOrders) {
        println(order)
    }
}