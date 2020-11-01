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

class PayPal(client:CreditCard) : CreditCard by client{

}

fun main() {

    val visa =Visa("74262374238462")
    visa.score(60)

    val masterCard =  MasterCard("847563487435734")
    masterCard.score(60)

}