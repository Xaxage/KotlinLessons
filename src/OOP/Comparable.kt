package OOP

import java.util.*
import kotlin.collections.ArrayList

class Person (var name:String,var age:Int) : Comparable<Person>{//This class doesn't have comparable by default ,so we create it .
    override fun compareTo(other: Person): Int {//This one is responsible for comparing and sorting "Person" objects.
       return this.age-other.age
        /*
        If return value is positive number ,than this>other
        If return value is negative number ,than this<other
        If return value is 0 ,than this=other


        */
    }

}

fun main(args: Array<String>){
    var listOfNames=ArrayList<Person>()

    listOfNames.add(Person("Xaxage",20))
    listOfNames.add(Person("Nendre",19))
    listOfNames.add(Person("Robson",20))
    println("Before sorting.")

    for(person in listOfNames){
        println("Name: " + person.name)
        println("Age: " + person.age)
    }
    println("------------------")

    println("After sorting.")
    Collections.sort(listOfNames)
    for(person in listOfNames){
        println("Name: " + person.name)
        println("Age: " + person.age)
    }
}