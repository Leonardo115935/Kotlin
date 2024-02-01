// VarAndVal/Task1.kt
package varAndValExercise1

fun main() {
  // TODO

    val first = "Leonardo"
    val last = "Hernandez"
    var age = 16

    println("Hello world! My name is $first $last, and I'm $age years old.")
    println("Did I tell you my first name is $first?")
    age = age - 5
    println("And you should believe I'm $age years")

    print("What day is it today?")
    val day = readLine()!!
    println(day)
}