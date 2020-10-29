package StarterPack

fun addNumbers(x:Double=0.0, y:Double=0.0):Double{
    //We mention return type "Double" , just like in Java.

    return x+y
}


fun displayInfo( vararg  names:String){//Void type function.Vararg is analog of "..." from Java.
//Vararg is used so we can enter multiple quantity of arguments without mentioning their quantity.
    for(name in names){
        println(name)
    }
}


fun main(){
    println("Start Main Fun")

    var returnAdd= addNumbers( 3.0, 4.0)
    println("returnAdd: $returnAdd")

    returnAdd= addNumbers(x=5.0,y=12.0)
    println("returnAdd: $returnAdd")


    returnAdd =  addNumbers(y=10.0)
    println("returnAdd: $returnAdd")

    returnAdd =  addNumbers(10.0)
    println("returnAdd: $returnAdd")


    displayInfo( names = *arrayOf("Jena","Laya","Dora"))

    println("End Main Fun")
}