package StarterPack

fun main(args : Array<String>){
    loop@ for(i in 1..3){

    for (i1 in 1..5) {
        println("count$i1")
        if (i1 == 1) {
            break//if we want to break current loop
            break@loop//if we want to break the selected outside loop either
        }
    }
    }
}