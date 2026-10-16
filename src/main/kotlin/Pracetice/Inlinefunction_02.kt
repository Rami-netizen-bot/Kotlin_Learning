/*
- Homework: Order Management
- 1. Create an Order model using data class
-    - orderId : Int (required)
-    - totalPrice : Double (required)
-    - customerName : String (required)
- 2. Create a list that contains 10 objects of Order
- 3. Create a function with a return type that can search an Order by orderId and return the Order object (nullable Order?)
- 4. Create an inline function that executes the search and records the execution time in milliseconds
- 5. Add a new lambda parameter in the inline function (e.g., onComplete) and mark it as noinline
*/
package com.core.Pracetice

import kotlin.system.measureTimeMillis


fun main() {
println("Get to input ther Homework to finde order id : ")
    val resulttargetid =readLine().toString()
    
    val timeInlinefunction = measureTimeMillis {
       recordOrderInline(
           block = {
               val result = searchOrder(orderList, resulttargetid)
           },
           otherblock = {
               println("Search loan list ...")
           }
       )
    }
}

// Data class Model
data class Order(
    val orderId : String,
    val totalPrice: Double,
    val customerName : String,
    val productsName : String,
    val quantity : Int,
    val status : String,
)
// list
val orderList = listOf(
    Order(
        orderId = "1001",
        totalPrice = 129.99,
        customerName = "Sokha Chan",
        productsName = "Mechanical Keyboard",
        quantity = 1,
        status = "Delivered"
    ),
    Order(
        orderId = "1002",
        totalPrice = 49.98,
        customerName = "Dara Kim",
        productsName = "Wireless Gaming Mouse",
        quantity = 2,
        status = "Processing"
    ),
    Order(
        orderId = "1003",
        totalPrice = 899.00,
        customerName = "Bopha Pich",
        productsName = "27-inch 4K Monitor",
        quantity = 1,
        status = "Shipped"
    ),
    Order(
        orderId = "1004",
        totalPrice = 45.00,
        customerName = "Vireak Lim",
        productsName = "USB-C Fast Charger",
        quantity = 3,
        status = "Delivered"
    ),
    Order(
        orderId = "1005",
        totalPrice = 199.50,
        customerName = "Channary Heng",
        productsName = "Noise-Canceling Headphones",
        quantity = 1,
        status = "Pending"
    ),
    Order(
        orderId = "1006",
        totalPrice = 35.99,
        customerName = "Rithy Meas",
        productsName = "Laptop Stand",
        quantity = 1,
        status = "Cancelled"
    ),
    Order(
        orderId = "1007",
        totalPrice = 159.98,
        customerName = "Sreyneang Ouk",
        productsName = "1TB Portable SSD",
        quantity = 2,
        status = "Shipped"
    ),
    Order(
        orderId = "1008",
        totalPrice = 24.00,
        customerName = "Kosal Chea",
        productsName = "HDMI 2.1 Cable",
        quantity = 4,
        status = "Delivered"
    ),
    Order(
        orderId = "1009",
        totalPrice = 349.99,
        customerName = "Malis Tep",
        productsName = "Ergonomic Office Chair",
        quantity = 1,
        status = "Processing"
    ),
    Order(
        orderId = "1010",
        totalPrice = 59.97,
        customerName = "Narith Sam",
        productsName = "Extended Desk Mat",
        quantity = 3,
        status = "Pending"
    )
)

fun searchOrder(list: List<Order>, orderId: String): Order? {
    for (order in list) {
        if (order.orderId == orderId) {
            return order
        }
    }
    return null
}

inline fun recordOrderInline(block: ()-> Unit, noinline otherblock: ()-> Unit) {
    val ordertime = measureTimeMillis {
        block ()
        otherblock()
    }
    println("Take $ordertime ms")
}