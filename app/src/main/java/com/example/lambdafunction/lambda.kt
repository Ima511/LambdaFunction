package com.example.lambdafunction

fun main(){

    // 1 - With Parameters and Return Value :
    val add1:  (Int, Int) -> Int = {a:Int, b:Int -> a + b}
    println(add1(10, 20))

    // 2 - With Parameters and no return value :
    val add2: (Int, Int) -> Unit = {a,b -> println(a+b) }
    add2(40, 50)

    // 3 - No Parameters But with return value
    val add3 : () -> String = { "Welcome to our Course" }
    println(add3())

    // 4 - No Parameters and No Return values
    val add4: () -> Unit = { println("Welcome to lambda function") }
    add4.invoke()

    // Important Note :- Direct Use of lambda Expressoin
    println({a: Int, b: Int -> a * b}(4, 5)) // These type of functions are inline function to know more just hover over  it.

}