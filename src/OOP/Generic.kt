package OOP

class UserAdmin<T>(credit:T){// Template

    init{
        println(credit)
    }

}

fun <T> display(process : T) {
    println(process)
}

fun main(args : Array<String>){
    var userAdmin1=UserAdmin<String>("Xaxage")
    var userAdmin2=UserAdmin<Int>(2000)
    var userAdmin=UserAdmin<Double>(135.6)

    display<String>("Hello, mate!I am ")
    display<Int>(22)
    display<String>("years old.")
}