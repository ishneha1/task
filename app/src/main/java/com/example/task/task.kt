package com.example.task
fun main(){
    //lesson 3
    //mutable
    var age=20
    age=25

    //immutable
    val roll=14
    //roll= 9 cannot reassign

    var a : Boolean = true
    var b : Char = 'R'
    var c : Byte = 12
    var d: Short =-356
    var e : Int = 4646
    var f  :Long = -4564646464646
    var g : Float = 4.65655F
    var h : Double = 7.46547747474747474747
    println(a)
    println(b)
    println(c)
    println(d)
    println(e)
    println(f)
    println(g)
    println(h)

    var x : Double = 132.33
    var y : Int = x.toInt()
    var z : Byte = y.toByte()
    println(x)
    println(y)
    println(z)

    var a1 : String = "hello world"
    var i1 : Int = a1.length
    var x1 : Boolean = a1.equals("Hello world")
    var username : String = "  softwarica"

    println(username.trim())
    println(a1)
    println(i1)
    println(a1.isEmpty())
    println(a1.lowercase())
    println(a1.uppercase())
    println(x1)
    println(a1.plus(", How are you?"))

    //lesson 4
    var  age = arrayOf (1,2,3)
    println (age)
    println("The first element of age is "+ age[0])
    println("The second element of age is "+ age [1])
    println("The third element of age is"+age[2])

    println("*********************************")

    var name = arrayOf ("ram", "shyam", "Hari")
    name [1] = "sandis"
    println("The first element of name is "+ name [0])
    println("The second element of name is "+ name [1])
    println("The third element of name is "+ name [2])

    var age1= ArrayList<Int>()
    age1. add (1)
    age1. add (  1,  20)
    age1.add(5)
    //we can add value directly in array while initializing variables.
    var age2 = arrayListOf<Int>(1, 20,5)
    var name = arrayListOf<String>("sandis", "ram"
        , "shyam")
    name. add ("hari" )
    name. add ( 4,  "Sita")
    name. remove (  "shyam")
    name. removeAt ( 0)
    var mixArrayList = arrayListOf<Any>("hello", 5, 2.0)
    println (mixArrayList[0]);
    println (mixArrayList [1]);
    println(mixArrayList[2]);

    //lesson 5
    val numbers : List<String> = listOf("one", "two", "three", "four")
    println ("Number of elements: ${numbers.size}") println ("Third element: ${numbers.get(2)}") println ("Fourth elementa ${numbers [3]}")
    println("Index of element \"two\" ${numbers. indexof("two")}")
}











}
