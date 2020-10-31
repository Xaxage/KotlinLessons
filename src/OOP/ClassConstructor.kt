package OOP

import java.awt.geom.Arc2D

open class CarConstructor(){//"open" means that we can inherit this class.
// If we write "public" without "open", it won't help. All classes by default are "final(from java)".

    var type:String?=null
    var model:Int?=null
    private var price:Double?=null//So no one can have an access outside of this class.
    var milesDrive:Int?=null
    var owner:String?=null

    constructor(type:String,  model:Int,  price:Double,
             milesDrive:Int,  owner:String):this(){
        this.type=type
        this.model=model
        this.price=price
        this.milesDrive=milesDrive
        this.owner=owner
    }

    constructor(  type:String,  model:Int,   price:Double, milesDrive:Int):this(){
//We add ":this()" cause we must first of all initialize fields in primary constructor,
//after we assign fields in secondary constructors
        this.type =type
        this.model=model
        this.price=price
        this.milesDrive=milesDrive
    }

    open fun  getCarPriceCalculated():Double{//Method.We add "open" so it can be overrided.
        return this.price!!- (this.milesDrive!!.toDouble()*10)
        //We decided to change car's price by its usage*10.
    }

    fun getCarPrice():Double{
        return  this.price!!
    }
}


fun main() {


    val car1 = CarConstructor("BMW",2015,10000.0,105,"Hussein Alrubaye")
    car1.type="KIA"
    println(car1.type)
    println(car1.owner)
    println(car1.getCarPriceCalculated())

    val car2 = CarConstructor("Toyota",2019,39000.0,10)
    println(car2.type)
    println(car2.owner)
    println(car2.getCarPriceCalculated())



}