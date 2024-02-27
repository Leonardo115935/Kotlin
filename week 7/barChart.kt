//leonardo Hernandez
//Angel Caro
//Jordan Pham

fun main() {
    val storeNames = arrayOf("Store 1", "Store 2", "Store 3", "Store 4", "Store 5")
    val sales = IntArray(5)


    for (i in 0 until 5) {
        print("Enter today's sales for ${storeNames[i]}: $")
        sales[i] = readLine()?.toIntOrNull() ?: 0
    }


    println("\nSales Bar Chart:")
    for (i in 0 until 5) {
        print("${storeNames[i]}: ")
        val barLength = sales[i] / 100
        for (j in 0 until barLength) {
            print("*")
        }
        println()
    }
}