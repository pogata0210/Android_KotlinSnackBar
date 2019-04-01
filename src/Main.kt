fun main (args: Array<String>){
    println("Jane's Cash On Hand is ${buyItem(7.50, 45.25)}")

    /**
     * Jane buys 3 of Soda. Print Jane Cash on hand. Print quantity of Soda.
    Jane buys 1 of Pretzel. Print Jane Cash on hand. Print quantity of Pretzel.
    Bob buys 2 of Soda. Print Bob Cash on Hand. Print quantity of Soda.
    Jane finds $10. Print Jane Cash on Hand.
    Jane buys 1 of Chocolate Bar. Print Jane Cash on Hand. Print quantity of Chocolate Bar.
    Snack 3 gets 12 more. Print quantity of Pretzel.
    Bob buys 3 of Pretzel. Print Bob Cash on hand. Print quantity of Pretzel.
     */

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
class Customer (val id: Int, var name: String , val cashLeft: Double)



fun buyItem(cost: Double, cashLeft: Double = 1.0): Double {
    return cashLeft - cost
}
class VendingMachine (val id: Int, var name: String)
class Snack (val id: Int, var name: String, private var quantity: Int, var cost: Double, var vendingMachineNum: Int){
}