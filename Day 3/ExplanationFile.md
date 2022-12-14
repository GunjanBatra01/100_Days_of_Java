### Task: 
Implementing prime numbers in a user defined range using for loop.

### Programming Language: Java

### Input: 
An integer value, which will be stored in variable named 'upperlimit'.

### Output: 
Display all the prime numbers from 1 to upperlimit provided by the user. If the user enters a negative integer then the output will be "Invalid Input".

### Test Cases: 

**Case 1:** upperlimit = 10
        For 2, 3, 5, and 7 --> Since they are divisible by 1 and the number itself, counter will be equals to 2.
        For 4 --> Counter will be equal to 3 --> Therefore, not a prime number
        For 6 --> Counter will be equalto 4 --> Therefore, not a prime number
        For 8 --> Counter will be equal to 4 --> Therefore, not a prime number
        For 9 --> Counter will be equal to 3 --> Therefore, not a prime number
        For 10 --> Counter will be equal to 4 --> Therefore, not a prime number

**Case 2:** upperlimit = -10
            Print "Invalid Input" 

**Case 3:** upperlimit = 1
            Print "1 is neither prime nor composite."

**Case 4:** upperlimit = 0
            Print "Invalid Input", since upperlimit is not greater than 1.

**Case 5:** upperlimit = A
            ERROR --> input data type doesn't match, it must be an integer.


### Logic:

==> Program will ask user to enter an upper limit of the range upto which prime numbers must be displayed.

==> We have taken an integer variable named counter, which is initialised with value 0. Counter variable will be storing the number of times a number is divisible by another numbers from the range. If counter == 2 that means number is divisible by 1 and itself. Otherwise, counter != 2 which shows that the number is not prime.

==> Prime numbers begin with 2 because 1 is neither prime nor composite. So, we have made an if condition to check whether the upperlimit is greater than 1 or not. If the condition is met, then further for loop for prime numbers will be executed.

==> When if condition is not met, program will check for else if condition i.e. mentioned on line 29. It will check if upperlimit == 1, then print "1 is neither prime nor composite".

==> Else it will print "Invalid Input".
