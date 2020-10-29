/*
 fun sum(number1:Int , number2:Int):Int{
 return number1+number2
 }
*/

val sum = {number1:Int, number2: Int ->
    number1 +number2
    //We don't need to use "return" or mention type, cause it is Lambda.
}

fun main() {

    val addNumbers =  sum(3,4)
    println("addNumbers:  $addNumbers")


    println("List of numbers ")
    val listOfNumbers = listOf(10,15,22,34,80)

    /*
            //normal for loop
        for (number in listOfNumbers){
            println(number)
        }
     */

//forEach is a Lambda function and we just implement it here.
    listOfNumbers.forEach {number ->
        println(number)
    }
}