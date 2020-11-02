package OOP
//In Kotlin we don't have "static", so we'll use it like this :).
class Singleton{
    var name:String?=null
    private constructor(){//We make it "private", so no one can have an access from outside.
        //For outside we use "companion object"
        println("An object was created.")
    }

    companion object{
     /*This one checks, if we have an object of "Singleton" class or not.
     If we don't - it'll call the constructor. If we have, it won't call the constructor again.
     It will give us the previous one , then we can make changes on it.
     For example i changed the name on 26.*/
        val instance:Singleton by lazy { Singleton() }//What is "lazy" for ? I don't know :(.....
    }
}

fun main(args : Array<String>){
    var s1=Singleton.instance
    s1.name="Xaxage"
    println(s1.name)

    println("----------------------")

    var s2=Singleton.instance
    s2.name="Nendre"
    println(s2.name)

    println("----------------------")

    var s3=Singleton.instance
    println(s3.name)

}

