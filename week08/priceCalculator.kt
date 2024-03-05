fun main() {
    println("Enter the wholesale cost:")
    val wholesaleCost = readLine()?.toDoubleOrNull()
    if (wholesaleCost == null || wholesaleCost < 0) {
        println("Invalid input for wholesale cost. Please enter a valid positive number.")
        return
    }

    println("Enter the markup percentage:")
    val markupPercentage = readLine()?.toDoubleOrNull()
    if (markupPercentage == null || markupPercentage < 0) {
        println("Invalid input for markup percentage. Please enter a valid positive number.")
        return
    }
    
    val retailPrice = calculateRetail(wholesaleCost, markupPercentage)
    println("The item's retail price is: $retailPrice")
}

fun calculateRetail(wholesaleCost: Double, markupPercentage: Double): Double {
    return wholesaleCost + (wholesaleCost * markupPercentage / 100)
}
