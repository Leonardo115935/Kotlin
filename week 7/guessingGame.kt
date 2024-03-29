//leonardo Hernandez
//Angel Caro
//Jordan Pham

import kotlin.random.Random

fun main() {
    val randomNumber = Random.nextInt(1, 101)
    var guess: Int
    var attempts = 0

    println("Welcome to the Number Guessing Game!")


    do {
        print("Guess the number (between 1 and 100): ")
        guess = readLine()?.toIntOrNull() ?: 0


        when {
            guess > randomNumber -> println("Too high, try again.")
            guess < randomNumber -> println("Too low, try again.")
            else -> println("Congratulations! You guessed the number correctly in $attempts attempts.")
        }

        attempts++
    } while (guess != randomNumber)
}
