# Kotlin SnackBar

## Overview
Build a Simple Snack Bar program in Intellij using Kotlin

## Requirements
This app will consist of a map acitvity with your own buttons that will center the map on the user's current location and place a map marker on the centered location.

## Instructions

### Classes
Snack has id, name, quantity, cost, vending machine id
Snack can set name, get quantity, add quantity given quantity, buy snack given quantity, get total cost given a quantity.

Vending machine has id, name
Vending Machine set and return name and return the 

Customer has id, name, cash on hand
Customer can add cash, buy given total cash used in purchase, get and set name, get cash on hand.  
Add a property called "isBroke". Write a getter which will check if the customer has any money and return false if so.

### Instances
* Instantiate 2 customers
    * Jane with $45.25
    * Bob with $33.14
* Instantiate 3 Vending Machines
    * Food
    * Drink
    * Office
* Instantiate 5 snacks
    * In Vending Machine Food
        * 36 Chips at $1.75
        * 36 Chocolate Bar at $1.00
        * 30 Pretzel at $2.00
    * In Vending Machine Drink
        * 24 Soda at $2.50
        * 20 Water at $2.75

### Processing
1. Jane buys 3 of Soda. Print Jane Cash on hand. Print quantity of Soda.  
2. Jane buys 1 of Pretzel. Print Jane Cash on hand. Print quantity of Pretzel.  
3. Bob buys 2 of Soda. Print Bob Cash on Hand. Print quantity of Soda.  
4. Jane finds $10. Print Jane Cash on Hand.  
5. Jane buys 1 of Chocolate Bar. Print Jane Cash on Hand. Print quantity of Chocolate Bar.  
6. Snack 3 gets 12 more. Print quantity of Pretzel.  
7. Bob buys 3 of Pretzel. Print Bob Cash on hand. Print quantity of Pretzel.  

## Go Further
- Write the Base CrudySnacks JX app in Kotlin  
> TIP: The annotations work the same as they do in Java.  
> For your repositories, you can inheritf from JPA repository with this line: `interface VendingMachineRepository: JpaRepository<VendingMachine, Long>`  
