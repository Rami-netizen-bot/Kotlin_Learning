/*
- Homework 1
- **Research and Practice**
- Create a class related to Product Inventory
- Add Primary constructor (productId, productName, category, price, stockQuantity)
- Add few methods (onDiscount, onRestock, onDiscontinue)
- Create 5 instances
     - Electronics Product
     - Clothing Product
     - Grocery Product
     - Home Appliance Product
     - Digital Subscription Product
- Add init block to perform operations such as validation (e.g., price > 0, stockQuantity >= 0, productName is not blank)
*/
package com.core.Homework

fun main() {
    val product1 = ProductInventory(
        "P001", "Laptop", "Electronics", 750.0, 10
    )

    val product2 = ProductInventory(
        "P002", "Mouse", "Accessories", 15.0, 50
    )

    val product3 = ProductInventory(
        "P003", "Keyboard", "Accessories", 25.0, 30
    )

    val product4 = ProductInventory(
        "P004", "Monitor", "Electronics", 180.0, 15
    )

    val product5 = ProductInventory(
        "P005", "Smartphone", "Electronics", 500.0, 20
    )

    val product6 = ProductInventory(
        "P006", "Headphones", "Accessories", 45.0, 40
    )

    val product7 = ProductInventory(
        "P007", "Printer", "Office Equipment", 120.0, 12
    )

    val product8 = ProductInventory(
        "P008", "Tablet", "Electronics", 300.0, 18
    )

    val productList = listOf(product1, product2, product3, product4, product5, product6, product7, product8)

    println("---------------")
    for (product in productList) {
        product.displayInfo()
    }
}


class ProductInventory(
    var productId: String = "",
    var productName: String = "",
    var category: String = "",
    var price: Double,
    var Stockquantity: Int,
) {
    var isDiscontinued: Boolean = false
    fun onDiscount(discount: Double) {
        if (discount > 0 && discount <= 100) {
            price -= price * discount /100
            println("$productName : Discounted applied : $discount %")
            println("New Price : $price %")
        } else {
            println("Invalid Discount percentage")
        }
    }
    fun onRestock(quantity: Int) {
        if (isDiscontinued) {
            println("$productName has been discontinued. Cannot restock.")
        } else if (quantity > 0) {
            Stockquantity += quantity
            println("$productName has been restocked $quantity items.")
            println("Current Stock : $Stockquantity")
        } else{
            println("Invalid Stock quantity.")
        }
    }
    fun onDiscontinue() {
        isDiscontinued = true
        println("$productName has been  discontinued.")
    }
    fun displayInfo(){
        println("ProductInventory: $productId")
        println("ProductInventory: $productName")
        println("ProductInventory: $price")
        println("ProductInventory: $Stockquantity")
        println("Discount: $isDiscontinued")
        println("---------------------")
    }


}