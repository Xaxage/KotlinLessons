package OOP
//extension-дополнение
fun ArrayList<Int>.findMax():Int{//Here we add an extension to a "ArrayList" class.
    //After adding we can call this function, using ArrayList object.
    var maxNumber =0
    for(item in this){//Finding max element.
        if(item > maxNumber){
            maxNumber =item
        }
    }
    return maxNumber
}
fun main() {

    val listOfElements = ArrayList<Int>()
    //"listOfElements" is a object(instance) of class "ArrayList".
    listOfElements.add(12)
    listOfElements.add(1)
    listOfElements.add(4)
    listOfElements.add(5)
    for(item in listOfElements){//printing elements of an arrayList
        println(item)
    }

    println("Max: ${listOfElements.findMax()}")
    //Using our class's extension, by calling it via this class's object.
}