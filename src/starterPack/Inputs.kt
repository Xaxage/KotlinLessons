package starterPack

fun main(args : Array<String>){
    val name:String="Nendre"
    println("Enter the age, please.")
    var age:Int= readLine()!!.toInt()
    var dep:String?
    dep="Software Development"
    println("**** Output ****")
    println("name: " + name)
    println("age: " + age)
    println("department:" + dep)
}