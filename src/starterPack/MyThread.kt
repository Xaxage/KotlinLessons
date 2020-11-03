package starterPack
import java.lang.Exception

fun main(args : Array<String>){

var thread1=MyThread("Thread 1")
    thread1.start()//If we call "run()", it'll consider it as a method.We need thread!

    var thread2=MyThread("Thread 2")
    thread2.start()

    var thread3=MyThread("Thread 3")
    thread3.start()

    thread3.join()//This waits until thread was done, then continues the. code
    println("The threads finished executing.")
}

class MyThread : Thread{
    var threadName : String? =null
    constructor(threadName:String) : super(){
        this.threadName=threadName
        println("$threadName was started")
    }

    override fun run() {
        var count=0
        while (count<10){
            println("${this.threadName } Count: $count")
            count++

            try {//We use this standards when we use "sleep".
                Thread.sleep(1000) //This will stop loop for 1 second after each operation,
                // so we can see how it works.
            }catch (ex:Exception){
                println(ex.message)
            }
        }
    }
}