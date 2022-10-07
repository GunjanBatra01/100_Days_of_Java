### Task: 
Show the usage of break statement in for, while, and do-while loop performing the same task in each loop.

### Programming Language: Java

### Output: 
Value of i, j, and k.

### Logic:

**for loop** 
    ==> Here, we are using variable i to print it's value in each iteration.
    ==> From i == 1 till i == 5, for loop will not execute if statement due to the dissatisfaction of condition.
    ==> When i == 6, 'if' condition will be satisfied and it will execute break statement which will terminate the for loop and will not print the value of i from 6.

**while loop**
    ==> First, we have initialized the value of variable j  with 1 because we want to start the value of j from 1.
    ==> while loop will work till j is less than equal to 10.
    ==> When (1<=j<=5), under while loop print 'j' will get executed and after that j will be incremented.
    ==> When j == 6, loop will be terminated and will not print any value of j from 6.

**do-while loop**
    ==> Initializing variable k with 1 since we need to print value of k from 1.
    ==> Do loop will execute and print the value of k from 1 to 5. At each iteration, k will also get incremented on line 34.
    ==> do-while loop would have printed value of k from 1 to 10 but due to the break statement which will get executed when k == 6 which will completely terminate the do-while loop.
