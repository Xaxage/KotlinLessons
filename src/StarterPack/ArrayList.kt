package StarterPack

fun main(args : Array<String>){

    var arrayList=ArrayList<String>()//We can not mention the size of the arrayList.

    arrayList.add("Erik Hovhannisyan")
    arrayList.add("Robert Nzdehyan")
    arrayList.add("Spartak Vardanyan")
    arrayList.add("Andre Zohrabyan")
    arrayList.add("Mark Margaryan")

    println("First name : " + arrayList.get(0))
    arrayList.set(1,"Xaxage")//Replaces mentioned element with provided one.

    if(arrayList.contains("Xaxage") ){
        //If upper or lower case are different , search will not find it.
        println("Name was found.")
    }
    else{
        println("Name wasn't found.")
    }

}