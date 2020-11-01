package OOP

enum class Direction {
    NORTH,SOUTH,WEST,EAST
}

fun main(args : Array<String>){

        var userDirection=Direction.SOUTH

    if(userDirection==Direction.SOUTH){
        println("He went to North.")
    }else{
        println("I don't know :(")
    }
}