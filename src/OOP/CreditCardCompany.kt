package OOP
/*Interface is used to describe a structure.
Future classes must override interface's methods.
We can't create an object of interface.*/
interface CreditCard{
    val cardNumber:String
    fun score(age:Int)
}


class MasterCard(override val cardNumber: String) :CreditCard{

    override fun score(age: Int) {

        if(age> 50){
            println("Negative")
        }else{
            println("Positive")
        }
    }

    fun print(){//We added another method that wasn't defined in Interface.
        println("hello")
    }
    /* Why method "print" isn't visible for object,that belongs
    to "PayPal", which, itself, delegates "CreditCard" interface,
    using "MasterCard" implementation. The answer is simple.
    We delegate interface and in interface there is no such a method.
    So only "cardNumber" and "score" is being changed in Interface,
    so delegated class's get those changes too, if we mention them :)
    */
}


class Visa(override val cardNumber: String) :CreditCard{

    override fun score(age: Int) {

        if(age> 60){
            println("Negative")
        }else{
            println("Positive")
        }
    }

}

class PayPal(card:CreditCard) : CreditCard by card{
    //Based on "card" input (In this case Mastercard's or Visa's object),
    // we'll decide how to treat them.
    fun print(){
        println(this.cardNumber)
    }
}

fun main() {

    val visa =Visa("1")
    visa.score(60)

    val palPal1=PayPal(visa)//We pass object that belongs to "Visa" class.
    println("PayPal card number: ${palPal1.cardNumber}")
    palPal1.print()

    val masterCard =  MasterCard("2")
    masterCard.score(60)

    val payPal2=PayPal(masterCard)
    println(println("PayPal card number: ${payPal2.cardNumber}"))
    payPal2.print()

}