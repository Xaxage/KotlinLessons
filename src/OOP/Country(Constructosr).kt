package OOP

/*class Country{
    var name:String
    var population:Long

    constructor(name:String,population:Long){
        this.name=name
        this.population=population
    }
}*/

//The same on Kotlin
class Country(var name: String, var population: Long) {//Primary constructor
    //I think to make primary as default (without argument) then secondary as i wish . It'll be easier

    constructor():this("",0){
//Secondary constructor , in case we need an empty one.
// We have to use primary constructor first, so in "this()", we pass our THINKED default values.

    }

}