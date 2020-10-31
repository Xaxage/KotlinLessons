package OOP

class Truck:CarConstructor {//Inherits from class "CarConstructor".

    var subType: String? = null//Only field that we add additional

    constructor(type: String, model: Int, price: Double,
                milesDrive: Int, owner: String, subType: String) ://The fields that we'll get
            super(type, model, price, milesDrive, owner) {//Calls our first(secondary) constructor from super class.
        //First cause params number equals to the first(secondary).

        this.subType = subType//We add only this field , cause previous ones were already assigned by calling
        // super constructor (first(secondary))/
    }

    constructor(type: String, model: Int, price: Double, milesDrive: Int, subType: String) :
            super(type, model, price, milesDrive) {//Calls our second(secondary) constructor from super class.
        //Second cause params number equals to the second(secondary)  constructor.

        this.subType = subType//We add only this field , cause previous ones were already assigned by calling
        // super constructor (second(secondary))/

    }

    override fun getCarPriceCalculated(): Double {
        return this.getCarPrice()!!- (this.milesDrive!!.toDouble()*20)
        //We decided to change truck's price by its usage*20.
    }
}

fun main(args : Array<String>) {

    val truck1 = Truck("BMW",2015,10000.0,105,"Muhammed ","Dump")
    truck1.type="Mercedes"
    println(truck1.type)
    println(truck1.owner)
    println(truck1.getCarPriceCalculated())
    println("------------------------")

    val truck2 = Truck("Toyota",2019,39000.0,10,"Garbage")
    println(truck2.type)
    println(truck2.owner)
    println(truck2.getCarPriceCalculated())

}
