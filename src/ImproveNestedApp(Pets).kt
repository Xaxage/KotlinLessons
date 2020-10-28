import java.util.*
import kotlin.collections.HashMap

fun main(){

    var listOfUsers=HashMap<String,LinkedList<String>>()

    while(true ){
        print("Enter your name or quit: ")
        val name = readLine()!!.toString()
        if(name=="quit"){
            break
        }
        print("Where do you live: ")
        val livePlace = readLine()!!.toString()

        /*
        var petName:String?=""
        print("Enter number of Pets: ")
        val petsCount= readLine()!!.toInt()
        This was deleted cause we started to use LinkedList,so we don't need the count of objects in it.
         */

        var listOfUserPets= LinkedList<String>()

        do{

            print("Enter pet name or next:")
            val petName= readLine()!!.toString()
            if(petName!="next"){
                listOfUserPets.add(petName)
            }

        }while(petName!="next")

        //listOfUsers[name + ":" + livePlace]=listOfUserPets
        listOfUsers["$name:$livePlace"]=listOfUserPets//Keys contain String of name and livePlace together.
        //We give a list to this variable(key) and on the next loop's move start again. Make America great again !

        for(key in listOfUsers.keys){
            println("===== User info ====")
            println("name and living place: $key")
            for(petName in listOfUsers[key]!!){//Using key we find LinkedLists and type them.
                println("petName: $petName")
            }
        }

        if (listOfUserPets.contains("cat")){
            println("We have program for your cat  ^_^")
        }



    }
}