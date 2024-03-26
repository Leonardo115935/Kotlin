fun main() {
    println("Enter the number of pyramid levels desired:")
    val levels = readLine()?.toIntOrNull()
    
    if (levels != null && levels > 0) {
        for (i in 1..levels) {
            for (j in 1..i) {
                print("*")
            }
            println()
        }
    } else {
        println("Please enter a valid positive number for pyramid levels.")
    }
}