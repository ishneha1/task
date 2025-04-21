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
    var  age1 = arrayOf (1,2,3)
    println (age)
    println("The first element of age is "+ age1[0])
    println("The second element of age is "+ age1[1])
    println("The third element of age is"+age1[2])

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
    println ("Number of elements: ${numbers.size}")
    println ("Third element: ${numbers.get(2)}")
    println ("Fourth elementa ${numbers [3]}")
    println("Index of element \"two\" ${numbers. indexOf("two")}")

    val lst = listOf("one", "two", "three")
    println ("Mutable list")
    for(i in lst. indices) {
        println(lst[i])
    }


        val mutableLst = mutableListOf ("one", "two", "three")
        mutableLst.add ("Four")
        println("Immutable list")
        for(i in mutableLst. indices) {
            println(mutableLst[i])
        }
}
fun displaylist() {
    val numbers: List<String> = listOf("one", "two", "three", "four")
    println("Number of elements : ${numbers.size}")

}


fun set() {
    val set1 = setOf(1, 2, 4, 5)
    for (elments in set1) {
        println(elments)
    }
    val setBackwards = setOf(4, 3, 2, 1)
    println("The sets are equal : ${set1 == setBackwards}")
}

fun map(){
    val countriesCapitals = mapOf(
        "Nepal" to "Kathmandu",
        "China" to "Beijung",
        "India" to "New Delhi"
    )

    println("All Keys : ${countriesCapitals.keys}")
    println("All values : ${countriesCapitals.values}")

    println("Capital of Nepal is ${countriesCapitals["Nepal"]}")

    //immutable map

    val studentMarks = mapOf(
        "ram" to 50,
        "shyam" to 56,
        "hari" to 45,
        "gita" to 45,
    )
    println("Enter student name :")
    val input : String = readln().lowercase()
    println(studentMarks[input])

}

//lesson 6








//Arithmetic Operator


fun operator(){

    var num1: Double = 10.6
    var num2 : Double = 5.0
    var result :Double = 0.0

    result = num1 + num2
    println("num1 + num2 is $result")

    result = num1 - num2
    println("num1 - num2 is $result")

    result = num1 * num2
    println("num1 * num2 is $result")

    result = num1 / num2
    println("num1 / num2 is $result")

    result = num1 % num2
    println("num1 % num2 is $result")

    //Assignment Operator

    var x:Int = 20
    var y:Int = 10
    var z:Int = 0

    z = x+y
    println("z = x + y = $z")

    z += x
    println("z += x $z")

    z -= x
    println("z -= x $z")

    z *= x
    println("z *= x $z")

    z %= x
    println("z %= x $z")

    //Unary Operator

    var number :Double = 7.6
    var isCheck :Boolean = true;
    println("+number = ${+number}");
    println("-number = ${+number}");
    println("++number = ${+number}");
    println("--number = ${+number}");
    println("+!ischeck = ${!isCheck}");

    var isresult:Double = 4.7
    println("result :$result")

    println("result++ : " + isresult++)

    //Equality and Relational Operators

    var a:Int = 5
    var b:Int = 5

    println("a == b :" + (a == b))
    println("a != b :" + (a != b))
    println("a < b :" + (a < b))
    println("a > b :" + (a > b))
    println("a >= b :" + (a >= b))
    println("a <+ b :" + (a <+ b))

    //Conditional Operators

    var number1 : Int = 5
    var number2 : Int = 8
    var number3 : Int = 12
    var result1 : Boolean = false;

    result1 = (number1 > number2) && (number3 > number2)
    println(result1)

    result1 =(number1 > number2) || (number3 > number2)
    println(result1)

    //Operator Precedence

    //BODMAS

    var result01 : Int = 5+2*4
    println("Result +" +result01)
    result01 = (5+2) *4
    println("Result =" +result01)
    var c : Int = 8
    var v : Int = 4
    var n : Int = 2
    var sum :Int = 0;
    sum = x + --y + --z
    println("x + --y + --z ::: $sum")

    //rangeTo()Function and "in" operator
    var myCharRange = 'a'.rangeTo('j')
    var testCharRange = 'a'

    var check = 'Z' in testCharRange
    println("mycharRange has z : $check")
    println(myCharRange)
    println(testCharRange)

    //console Input in Android App Development

    println("Enter name :: ")
    var name:String? = readln();

    println("Enter age :: ")
    var age:Int = readln()!!.toInt();

}

//lesson 7
fun conditionalStatement(){

    println("Please enter a number :")

    var number:Any = readln()!!.toInt()

    if(number.toString().toInt() % 2 ==0){
        println("$number is even")
    }else{
        println("$number is odd")
    }

    //if else -ilabber statment

    println("Please enter your age :: ")
    var yourAge: Int = readln()!!.toInt()
    if(yourAge < 13) {
        println("You are a chile")
    }else if (yourAge < 19){
        println("your are a teenager")
    }else{
        if(yourAge < 50){
            println("You are an adult")
        }else{
            println("You are a senior")
        }
    }

    //Nested if statement

    println("Please enter 3 number :")
    var number1 : Int = readln()!!.toInt()
    var number2 : Int = readln()!!.toInt()
    var number3 : Int = readln()!!.toInt()
    var largestNumber: Int
    if(number1 >= number2){
        if(number1 >= number3){
            largestNumber = number1
        }else{
            largestNumber = number3
        }
    }else{
        if(number2 >= number3){
            largestNumber = number3
        }else{
            largestNumber = number3
        }
    }
    println("The largest number is $largestNumber")


    //When statement

    println("Please enter a day number of week : ")
    var dayNumber :Int = readln()!!.toInt()
    var day:String
    when(dayNumber)
    {
        1 -> day = "Sundey"
        2 -> day = "Monday"
        3 -> day = "Tuesday"
        4 -> day = "Wednesday"
        5 -> day = "Thurday"
        6 -> day = "Friday"
        7 -> day = "Saturday"
        else -> day = "Invalid dat choice"
    }
    println(day)


    //For loop

    for (i in 1..9){
        println(i)
    }

    var sum:Int = 0
    for(x in 0 .. 5){
        println(x)
        sum += x // sum = sum + x
    }

    var sum1:Int = 0
    for (x in 0..10){
        println(x)
        sum += x
    }
}








