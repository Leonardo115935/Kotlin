open class Vehicle(val make: String, val model: String, val year: Int) {
    open fun startEngine() {
        println("Engine started")
    }
}


class Car(make: String, model: String, year: Int) : Vehicle(make, model, year) {
    override fun startEngine() {
        println("Car engine started")
    }
}


class Motorcycle(make: String, model: String, year: Int) : Vehicle(make, model, year) {
    override fun startEngine() {
        println("Motorcycle engine started")
    }
}


fun main() {
    val myCar = Car("Toyota", "Camry", 2022)
    val myMotorcycle = Motorcycle("Honda", "CBR500R", 2021)


    myCar.startEngine()
    myMotorcycle.startEngine()
}

