package com.tweentyscoops.calculator

class MainController(private val view: MainContarct.View?,
                     private val cal: Calculator) :
        MainContarct.ControllerAble {

    override fun plus(x: Int, y: Int) {
        view?.displayResult(cal.plus(x, y).toString())
    }

    override fun minus(x: Int, y: Int) {
        view?.displayResult(cal.minus(x, y).toString())
    }

    override fun divide(x: Int, y: Int) {
        view?.displayResult(cal.divide(x, y).toString())
    }

    override fun multiply(x: Int, y: Int) {
        view?.displayResult(cal.multiply(x, y).toString())
    }
}