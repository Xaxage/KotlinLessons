//Functions polymorphism is having functions
// with the same name and arguments quantity, but with another return type.
fun showInfo(cardID:Int){
    // check if card is valid
    print("CardLD: $cardID")
}

fun  showInfo(name:String){
    // check if user is active
    print("Name: $name")
}

fun  main(){

    showInfo("Albert Bejanyan")
    showInfo(7264374)
}