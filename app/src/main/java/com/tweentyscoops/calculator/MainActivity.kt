package com.tweentyscoops.calculator

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(), MainContarct.View {

    private val controller: MainController by lazy {
        MainController(this, Calculator())
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnPlus.setOnClickListener { controller.plus(getNumbers().first, getNumbers().second) }

        btnMinus.setOnClickListener { controller.minus(getNumbers().first, getNumbers().second) }

        btnDivide.setOnClickListener { controller.divide(getNumbers().first, getNumbers().second) }

        btnMultiply.setOnClickListener { controller.multiply(getNumbers().first, getNumbers().second) }
    }

    override fun displayResult(result: String?) {
        tvResult.text = result.toString()
    }

    private fun getNumbers(): Pair<Int, Int> = etNumberOne.text.toString().toInt() to
            etNumberTwo.text.toString().toInt()
}
