package com.tweentyscoops.calculator


class MainContarct {

    interface View {
        fun displayResult(result: String?)
    }

    interface ControllerAble {
        fun plus(x: Int, y: Int)
        fun minus(x: Int, y: Int)
        fun divide(x: Int, y: Int)
        fun multiply(x: Int, y: Int)
    }
}
