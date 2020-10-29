package StarterPack

fun main(args : Array<String>){
    var arrayInt= Array<Int>(5){0}//creates array with 5 elements and all = to "0"

    var arrayName1= arrayOf(0,1,2,3,4)

    val arrayName2 = arrayOf<Int>(10, 20, 30, 40, 50)

    println("All elements by object")//Similar to "forEach" in Java,for me.
    for(element in arrayName1){
        println(element)
    }

    println("All elements by index")
    for(index in 0 until arrayName1.size){//We could use in range too.
        println(arrayName1[index])
    }

    var arrayString=Array<String>(4){""}
    for(index in 0..3){
        print("ArrayStr [$index] = ")
        arrayString[index]= readLine()!!
    }

    for(index in 0..arrayString.size-1){
        println("ArrayStr [$index] = " + arrayString[index])
    }




}

