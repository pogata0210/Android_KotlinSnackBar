fun main (args: Array<String>){

    println("Jane's Cash On Hand After Soda is ${buyItem(7.50, 45.25)}")
    println("Quantity Of Soda is ${quantityInStock(24, 3)}")

    println("Jane's Cash On Hand After Pretzel is ${buyItem(2.00, 37.75)}")
    println("Quantity Of Pretzel is ${quantityInStock(30, 1)}")

    println("Bob's Cash On Hand After Soda is ${buyItem(5.00, 33.14)}")
    println("Quantity Of Soda is ${quantityInStock(21, 2)}")

    println("Jane's Cash On Hand After Finding Money ${addMoney(37.50, 10.0)}")

    println("Jane's Cash On Hand After Chocolate Bar is ${buyItem(1.00, 47.50)}")
    println("Quantity Of Soda is ${quantityInStock(36, 1)}")

    println("Quantity Of Soda is ${AddquantityInStock(30, 12)}")

    println("BOb's Cash On Hand After Pretzel is ${buyItem(2.00, 28.14 )}")
    println("Quantity Of Pretzel is ${quantityInStock(42, 3)}")
    

    val jane = Customer(1,"Jane", 45.25 )
    val bob = Customer(2, "Bob", 33.14)

    val food = VendingMachine(1, "food")
    val drink = VendingMachine(2, "drink")
    val office = VendingMachine(3, "office")

    val chips = Snack(1, "Chips", 36, 1.75, 1)
    val chocolate = Snack(2, "Chocolate Bar", 36, 1.00, 1)
    val pretzel = Snack(3, "Pretzel", 30, 2.00, 1)

    val soda = Snack(1, "Soda", 24, 2.50, 2)
    val water = Snack(2, "Water", 20, 2.75, 2)


}

fun AddquantityInStock(quantity: Int, num: Int = 1): Int {
    return quantity + num

}

fun addMoney(cashLeft: Double, num: Double = 1.0): Double{
    return cashLeft + num

}

class Customer (val id: Int, var name: String , val cashLeft: Double)



fun buyItem(cost: Double, cashLeft: Double = 1.0): Double {
    return cashLeft - cost


}
class VendingMachine (val id: Int, var name: String)
class Snack (val id: Int, var name: String, private val quantity: Int, var cost: Double, var vendingMachineNum: Int)

fun quantityInStock(quantity: Int, num: Int = 1): Int{
    return quantity - num
}