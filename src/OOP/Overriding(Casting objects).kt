package OOP

open class Operations1 {

    open fun sum(n1:Int,n2:Int):Int{
        return n1+n2
    }
    fun div(n1:Int,n2:Int):Int{
        return n1/n2
    }
}

class  MultiOperations1:Operations1(){
    //constructor(): super()
    // This will be done automatically if we add brackets after inheriting from "Operations1".

    override fun sum(n1:Int,n2:Int):Int{

        return n1 + n2 + 2
    }

    fun sub(n1:Int,n2:Int):Int{//Subtraction
        return n1-n2
    }

    fun mul(n1:Int,n2:Int):Int{
        return n1*n2
    }
}

fun main(args:Array<String>){

    // first
    var op=Operations1()
    var sum=op.sum(10,15)
    println("sum:"+ sum)
    var div= op.div(12,11)
    println("div:"+ div)

    // second
    var op2=MultiOperations1() as Operations1/*After casting, op2'll be able to use methods from "Operations1",
    but if we have overrided methods from "Operation1" inside "MultiOperations1",
    p2'll use overrided one , not the original from "Operations1".*/
    sum=op2.sum(10,15)
    println("sum:"+ sum)
    div= op2.div(12,2)//It is only in "Operations1". After casting we can use it.
    println("div:"+ div)

}