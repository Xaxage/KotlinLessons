package starterPack

import java.lang.Exception

fun main(args : Array<String>){

    try {
        println("Enter number2")
        var n2 = readLine()!!.toInt()
        var div = 100 / n2
        println("div: $div")
    }catch (ex:Exception){
        println(ex.message + " is prohibited.")
    }

    println("App is done")
}