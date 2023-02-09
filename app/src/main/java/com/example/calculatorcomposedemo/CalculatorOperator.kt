package com.example.calculatorcomposedemo

sealed class CalculatorOperator(val symbol:String){
    object Add:CalculatorOperator("+")
    object Minus:CalculatorOperator("-")
    object Multiply:CalculatorOperator("*")
    object Divide:CalculatorOperator("/")
}