package starterPack/*
mutable: you can update, add more
im-mutable : you cannot update, you cannot add more
 */

fun main(){

    //1- list

    //immutable
    val listImmutable = listOf("Valodik","Laya")
    //list[0]="Hussein" // We cant add more cause it's immutable
    for (name in listImmutable){
        println(name)
    }

    //mutable
    var listMutable = mutableListOf("Jena","Vahramik")
    listMutable[0]="Hussein"// We can change insides cause it's mutable
    for (name in listMutable){
        println(name)
    }


    val listOfUsersI = mapOf(1 to "hussein", 2 to "jena")

    var listOfUsersM = mutableMapOf(1 to "hussein", 2 to "jena")







}