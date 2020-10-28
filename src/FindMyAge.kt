
import java.util.*

fun main(args : Array<String>){
    println("Enter your date of birth")
    var DOB:Int= readLine()!!.toInt()
    var currentTime:Int=Calendar.getInstance().get(Calendar.YEAR)
    var result:Int=currentTime-DOB
    print("You are $result years old now")
}