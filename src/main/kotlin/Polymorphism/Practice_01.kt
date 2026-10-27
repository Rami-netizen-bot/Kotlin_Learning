package com.core.Polymorphism

/**
 * 1. SUPERCLASS: Acts as the base blueprint for all payment types
 */
open class PaymentProcessor {
    /**
     * Open property: Allows subclasses to override and define their own fee percentage
     */
    open var feePercentage: Double = 0.0
    /**
     *
     * Open method: Calculates the transaction fee based on the active runtime subclass configuration
     * */
    open fun calculateFee(amount: Double): Double {
        return amount * (feePercentage / 100)
    }

    /**
     * Open method: Handles the core shared logic for displaying transaction statements
     */
    open fun processPayment(amount: Double) {
        val totalFee = calculateFee(amount)
        println("Processing For Payment")
        println("Total amount: $$amount , fee: $$totalFee")
        println("Total fee: $${amount + totalFee}")
    }
}

/**
 * SUBCLASS 1: Specializes the payment behavior for Stripe
 */
class StripeProcessor : PaymentProcessor() {
    /**
     * verride property: Changes the base fee percentage specifically for Stripe transactions
     */
    override var feePercentage: Double = 2.9

    /**
     * Override method: Intercepts execution to insert Stripe-specific behavior
     */
    override fun processPayment(amount: Double) {
        println("StripeProcessing For Payment")
        /**
         *  'super' keyword delegates execution up to the parent implementation to run shared logging logic
         */
        super.processPayment(amount)
        println("Payment has been send to email user")
    }
}

/**
 * SUBCLASS 2: Specializes the payment behavior for PayPal
 */
class PayPalProcessor : PaymentProcessor() {
    /**
     * Override property: Changes the base fee percentage specifically for PayPal transactions
     */
    override var feePercentage: Double = 4.0

    /**
     * Override method: Intercepts execution to insert PayPal-specific actions
     */
    override fun processPayment(amount: Double) {
        println("PayPal Direct Redirecting to PayPal Sandbox...")
        /**
         * Calls the parent implementation to execute standard processing logic
         */
        super.processPayment(amount)
        println("Process is save in database")
    }
}

fun main() {
    val paymentMethod: List<PaymentProcessor> = listOf(
        StripeProcessor(),
        PayPalProcessor(),
    )
    for (payment in paymentMethod) {
        payment.processPayment(1.2)
    }
}