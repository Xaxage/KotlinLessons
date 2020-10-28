
fun main(args : Array<String>){
    var title=" Welcome to New-York"
    var title1="  Esim inch.  "
    println("title:$title")
    println("Second char:" +title[2])//1-st char of String "title".
    println("title all lowerCase:" + title.toLowerCase())
    println("title all upperCase:" + title.toUpperCase())
    println(title.split("el","ew"))
    //It finds where those delimiters are found and exchange them with "," .
    println(title1.trim())//It deletes empty chars from start and the end .


}