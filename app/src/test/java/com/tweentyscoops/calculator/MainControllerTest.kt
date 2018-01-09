package com.tweentyscoops.calculator

import org.junit.Test
import org.junit.runner.RunWith
import org.mockito.Mock
import org.mockito.Mockito
import org.mockito.MockitoAnnotations
import org.powermock.modules.junit4.PowerMockRunner

@RunWith(PowerMockRunner::class)
class MainControllerTest {

    @Mock lateinit var mockView: MainContarct.View

    private var controller: MainController
    private var cal: Calculator

    init {
        MockitoAnnotations.initMocks(this)
        cal = Calculator()
        controller = MainController(mockView, cal)
    }

    @Test
    fun fiveDivideFiveShouldBeOne() {
        controller.divide(5, 5)
        Mockito.verify(mockView, Mockito.times(1)).displayResult("1")
    }

    @Test
    fun fiveDivideFiveShouldBeOne1() {
        controller.plus(5, 5)
        Mockito.verify(mockView, Mockito.times(1)).displayResult("10")
    }

    @Test
    fun fiveDivideFiveShouldBeOne2() {
        controller.minus(5, 5)
        Mockito.verify(mockView, Mockito.times(1)).displayResult("0")
    }

    @Test
    fun fiveDivideFiveShouldBeOne3() {
        controller.multiply(5, 5)
        Mockito.verify(mockView, Mockito.times(1)).displayResult("25")
    }
}