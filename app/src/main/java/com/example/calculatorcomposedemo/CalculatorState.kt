package com.example.calculatorcomposedemo

data class CalculatorState(
    val number1:String="",
    val number2:String="",
    val operation:CalculatorOperator?=null,
)
