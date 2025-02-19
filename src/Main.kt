fun main(){
    println("Lines & Boxes")
    println("----------------")
    println("Enter some text: ")
    val userInput = readln()

    println()
    stringLength(userInput)
    println()
    stringUnderLine(userInput)
    println()
    boxedString(userInput)
    println()
    repeatString(userInput)
    println()
    boxedRepetition(userInput)

}



fun stringLength(userInput: String){
    println("The text, '$userInput', is ${userInput.length} characters long.")
}

fun drawLine(userInput: String){
    for (i in 0..userInput.length){
        print("-")
    }
}

fun stringUnderLine(userInput: String){
    println(userInput)
    drawLine(userInput)
}

fun boxedString(string: String){
    print("+")
    print("-".repeat(string.length+2))
    println("+")
    println("| $string |")
    print("+")
    print("-".repeat(string.length+2))
    print("+")
}

fun repeatString(string: String){
    val repeatCount = 4
    for (i in 0..repeatCount) {
        println(string)
    }
}

fun boxedRepetition(string: String){
    print("+")
    drawLine(string+2)
    println("+")
    repeatString("| $string |")
    print("+")
    drawLine(string+2)
    print("+")
}