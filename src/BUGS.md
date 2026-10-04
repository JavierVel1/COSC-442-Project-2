1. First Bug: 
•	The observed failure

•	The test that exposed it
  void testAddItemEmptySlot() 
•	The source-code fault that caused it
    for (int i = 0; i <= NUM_SLOTS; i++) 
•	How you diagnosed the fault
I looked it up on google the error message because i thought there was something wrong with the test method. 
It told me it had do something with Arrays. It told me the error was on line 13 which was VendingMachine vend = new VendingMachine(); 
•	The correction you made
    for (int i = 0; i < NUM_SLOTS; i++) 


1. Second Bug: 
•	The observed failure
VendingMachineException: Invalid amount.  Amount must be >= 0
        at VendingMachine.insertMoney(VendingMachine.java:162)
        at VendingMachineTest.testInsertMoneyValidCase(VendingMachineTest.java:45)
        at java.base/java.lang.reflect.Method.invoke(Method.java:565)
        at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
        at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
•	The test that exposed it
void testInsertMoneyValidCase()
•	The source-code fault that caused it
if (amount < 1)
•	How you diagnosed the fault
Honestly, I saw this error when i was studying the code to be able to understand it
•	The correction you made
if (amount < 0)

1. First Bug: 
•	The observed failure

•	The test that exposed it

•	The source-code fault that caused it

•	How you diagnosed the fault

•	The correction you made


1. First Bug: 
•	The observed failure

•	The test that exposed it

•	The source-code fault that caused it

•	How you diagnosed the fault

•	The correction you made