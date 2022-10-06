###Task: 
Build a basic calculator performing following actions on two user entered integer:
      (i) Addition
      (ii) Subtraction
      (iii) Multiplication
      (iv) Division
      using do-while loop.

###Programming Language: Java

###Input: 
Two integer values, a and b

###Output: 
Menu driven program that will ask user to enter the choice of operation on two user-entered operands.

###Test Cases: 

**Case 1:** if c = 'y'
        a = 10, b = 2
        choice = 1 --> it will execute case 1 of switch statement.
        print "Addition of 10 and 2 is: 12"

**Case 2:** if c = 'y'
        a = 10, b = 2
        choice = 2 --> it will execute case 2 of switch statement.
        print "Subtraction of 10 and 2 is: 8"

**Case 3:** if c = 'y'
        a = 10, b = 2
        choice = 3 --> it will execute case 3 of switch statement.
        print "Multiplication of 10 and 2 is: 20"

**Case 4:** if c = 'y'
        a = 10, b = 2
        choice = 4 --> it will execute case 4 of switch statement.
        print "Division of 10 and 2 is: 5"

**Case 5:** if c = 'y'
        a = 10, b = 2
        choice = 5 --> it will execute default case of switch statement.
        print "Please enter valid operation number!"

**Case 6:** if c = 'n'
        PROGRAM TERMINATED

**Case 7:** if c = 'y'
        a = 10, b = -2
        choice = 1 --> it will execute case 1 of switch statement.
        print "Addition of 10 and -2 is: 8"

**Case 8:** if c = 'y'
        a = 10, b = -2
        choice = 2 --> it will execute case 2 of switch statement.
        print "Subtraction of 10 and -2 is: 12"

**Case 9:** if c = 'y'
        a = 10, b = -2
        choice = 3 --> it will execute case 3 of switch statement.
        print "Multiplication of 10 and -2 is: -20"

**Case 10:** if c = 'y'
         a = 10, b = -2
         choice = 4 --> it will execute case 4 of switch statement.
         print "Division of 10 and -2 is: -5"

**Case 11:** if c = 'y'
         a = 2, b = 10
         choice = 2 --> it will execute case 2 of switch statement.
         print "Subtraction of 2 and 10 is: -8"

**Case 12:** if c = 'y'
         a = 2, b = 10
         choice = 4 --> it will execute case 4 of switch statement.
         print "Division of 2 and 10 is: 0"


###Logic:
==> On line 5, we have declared a character variable named c, which is taking input from user whether he wants to perform more opertions or not. It is used in while condition mentioned on line 33.
==> On line 6, we have declared three integer variables named a, b, and choice.
==> 'a' is acting as the first operand and 'b' is acting as the second operand.
==> 'choice' will be taking the operation number that the user wants to perform of the operands. It has been used in switch statement as part of different cases.
==> Now, the program is asking user to enter two operands or numbers which will be stored in 'a' and 'b'.
==> On line 11, the program will start executing the statements under do loop.
==> Under do loop, it will ask user to enter choice of operation and as per the choice, corresponding cases will get executed.
==> As the do loop will finish, program will check for the while condition and will execute do loop again only if the condition is met.
