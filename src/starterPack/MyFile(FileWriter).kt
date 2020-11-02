package starterPack

import java.io.File
import java.io.FileReader
import java.io.FileWriter
import java.lang.Exception

fun main(args : Array<String>){
    read()
    write("Xaxage",5)
    write("Robson",5)
}

fun write (str:String,count:Int){
    try {
        var x = FileWriter("FirstTimeWritingFile.txt",true)//Writing file name."true" helps us to add multiple words.
        var i:Int=0
        while (i < count) {
            x.write(str + "\n")
            i++
        }
        x.write("--------------------- \n")
        x.close()//We must close the file, so it'll be saved.
    }catch (ex:Exception){
        println(ex.message)
    }
}

fun read(){
    try {
    var fin=FileReader("FirstTimeWritingFile.txt")//We must mention file format as well
        var c:Int?
        do{
            c=fin.read()
            println(c.toChar())
        }while (c!=-1)

    }catch (ex:Exception){
        println(ex.message)
    }
}