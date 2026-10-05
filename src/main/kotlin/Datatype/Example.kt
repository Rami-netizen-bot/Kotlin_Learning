package com.core.Datatype
typealias RestaurantId = String
typealias OnPreparing = () -> Unit
typealias OnSuccess = (OrderRecipt) -> Unit
typealias OnFailure = (errorCode : String, errorMessage: String) -> Unit
fun main() {
 val myTargetId: RestaurantId = "Restaurant02"
    placeOrder(
        targetRestaurantId = myTargetId,
        onPreparing = {
            println("Connecting to database...")
        },
        onSucess = {
                receipt -> println("Found Order! Restaurant: ${receipt.restaurantName}, Total: ${receipt.totalCost}")
        },
        onFailure = {
            errorCode, errorMessage -> println("Error occurred: $errorCode, $errorMessage")
        }

    )
}

fun placeOrder(
    targetRestaurantId: RestaurantId,
    onPreparing : OnPreparing,
    onSucess: OnSuccess,
    onFailure : OnFailure,
){
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
    // implement to find the order and callback
    val result = listOrders.find { order -> order.restaurantId == order1.restaurantId }

    if (result == null) {
        onFailure( "404", "Restaurant $targetRestaurantId not found.")
    } else {
        onSucess(result)
    }
}