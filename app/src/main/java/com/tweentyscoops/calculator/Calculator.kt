package com.tweentyscoops.calculator

class Calculator {

    fun plus(x: Int, y: Int) = x + y

    fun minus(x: Int, y: Int) = x - y

    @Suppress("IMPLICIT_CAST_TO_ANY")
    fun divide(x: Int, y: Int) = when (y) {
        0 -> "divide by zero fucking shit"
        else -> x / y
    }

    fun multiply(x: Int, y: Int) = x * y
}