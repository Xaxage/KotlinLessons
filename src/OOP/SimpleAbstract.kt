package OOP

abstract class CreditCardAbstract(){
/*interfaces can have no state or implementation

a class that implements an interface must provide an implementation of all the methods of that interface

abstract classes may contain state (data members) and/or implementation (methods)

abstract classes can be inherited without implementing the abstract methods
(though such a derived class is abstract itself)

interfaces may be multiple-inherited, abstract classes may not.*/
    fun CreditID():String
    { return "23432dsdfds"}
    abstract fun newCredit()

}

class UserInfo(): CreditCardAbstract(){

    fun getInfo():String{
        return CreditID();
    }
    override  fun newCredit(){
        println(" new cart created")
    }
}



fun main(args:Array<String>){

    //var credit=CreditCard()
    //println(credit.CreditID())
    var user=UserInfo()
    println(user.getInfo())
}