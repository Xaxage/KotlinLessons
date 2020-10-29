package StarterPack

fun main(args : Array<String>){
    println("Enter the value of x")
    var x = readLine()!!.toInt()
    when(x){

        1-> println("Value of x is 1")
        2->print("Value of x is 2")
        in 3..10->println("Value of x is in range from 3 to 10 ")
        !in 3..10->println("Value of x is not in range from 3 to 10 ")
        else->{
            println("Fuck this shit")
        }
    }
}