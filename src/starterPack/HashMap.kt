package starterPack

fun main(args : Array<String>){
    var listOfUsers=HashMap<Int,String>()//First we write key type , than value type. We can easily change them.

    listOfUsers[3]="Allah"
    listOfUsers[6]="Ben Laden"
    listOfUsers[13]="Saddam Hussein"

    println(listOfUsers[3])
    println(listOfUsers[0])//If we didn't gave it a value , it'll become null

    for(key in listOfUsers.keys){//We loop in keys
        println("$key: ${listOfUsers[key]} ")
    }
}