package com.tweentyscoops.calculator

import org.junit.Assert
import org.junit.Before
import org.junit.Test

class CalculatorTest {

    private lateinit var cal: Calculator

    @Before
    fun setup() {
        cal = Calculator()
    }

    @Test
    fun fiveDivideFiveShouldBeOne() {
        val result = cal.divide(5, 5)
        Assert.assertEquals(result, "1".toInt())
    }

    @Test
    fun fiveDivideZeroShouldBeDivideByZero1() {
        val result = cal.minus(5, 0)
        Assert.assertEquals(result, 5)
    }

    @Test
    fun fiveDivideZeroShouldBeDivideByZero2() {
        val result = cal.plus(5, 0)
        Assert.assertEquals(result, 5)
    }

    @Test
    fun fiveDivideZeroShouldBeDivideByZero3() {
        val result = cal.multiply(5, 0)
        Assert.assertEquals(result, 0)
    }

    @Test
    fun fiveDivideZeroShouldBeDivideByZero() {
        val result = cal.divide(5, 0)
        Assert.assertEquals(result, "divide by zero fucking shit")
    }
}