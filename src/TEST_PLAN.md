1. Mehtod: getPrice(); 
Valid case: 10, 1.0
Invalid case: -1
Boundary case: 
Oracle / Expected Result: 
Valid case- I expect it to return 10 and 1.0 because its a simple method that returns a double and its not lower than 0.
Invalid case- I expect it to return "Price cannot be less than zero" because its lower than 0 and that class javadocs says that the price
cant be less than 0. 
Related JUnit 5 test: assertEquals and assertThrows

2. Method: getSlotIndex
Valid case: A, B, C, D
Invalid case: 1, Chips 
Oracle / Expected Result: 
Valid case - I expect it to return 0, 1, 2, 3 because this method checks if you are using the right code, which is written in the javadocs, and returns a number
Invalid case: I execpt it to return the INVALID_CODE_MESSAGE because its one of the specification of the method
Related JUnit 5 test: @ParameterizedTest and assertEquals and assertThrows, I will use a Parameterized Test because there are 5 if statement in the method and i want to test those statements.

3. Method: addItem
Valid case:[("Chips", 10), "A"], [("Cookie", 5), "B"]
Invalid case:[("Candy", 10), "A"]
Oracle / Expected Result:
Valid case: I expect the item to be in the Vending Machine when those slots are emtpy because i am following the specification of the method. 
Invalid case: I expect it to return the VendingMachineException because i am trying to add an item to an filled slots which should not be allowed.
Related JUnit 5 test: assertEquals and assertThrows

4. Method: removeItem
Valid case: A, B, C,
Invalid case: D which is Null
Oracle / Expected Result:
Valid case: I expect the item at A, B, C, D are removed because its a specification of the method
Invalid case: I expect it to return a VendingMachineException because its a specification of the method

Related JUnit 5 test: assertEquals and assertThrows

5. Method: insertMoney
Valid case: 1, 10.30, 0
Invalid case: -10.24
Oracle / Expected Result:
Valid case: I expect my balance, of Zero to begin with, to be 1 or 10.30 because that is what is specify The Javadocs. But i expect the 0 to Throws a VendingMachineException because its told to us in the javadocs
Invalid case: I expect it to throw a VendingMachineException because its an condition of an if statement in the method

Related JUnit 5 test:assertEquals and assertThrows

6. Method: makePurchase
Prep :Balance:10 (item "Chip", price:4, Slot : A), (item "Cookie", price:2, Slot : B), (item "Pizza", price:11, Slot : C)
Valid case: A, B
Invalid case: Chip, Null, C
Oracle / Expected Result:
Valid Case:I expect to be able to purchase A and B because it follows the specification of the method
Invalid case: I expect to not able to purchase Chip, Null, and C because of the if condition in the method and the specification of the method

Related JUnit 5 test:assertEquals and assertThrows
