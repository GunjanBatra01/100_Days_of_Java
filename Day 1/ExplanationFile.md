### Task: 
Given an integer, n perform the following conditional statements:
--> If n is odd, print Odd Number.
--> If n is even and in the inclusive range of 1 to 5, print the range in which it belongs.
--> If n is even and in the inclusive range of 6 to 20, print the range in which it belongs.
--> If n is even and greater than 20, print "Number is greater than 20".
Write code to print in which category the integer belongs.

### Programming Language: Java

### Input: 
	An integer, n

### Output: 
	if(positive even number)
	 ==> Even Number: n
	    if(n in the inclusive range of 1 and 5) 
	    	==> Number lies between 1 to 5
	    else if(n in the inclusive range 6 and 20)
		==> Number lies between 6 to 20
	    else(n is above 20)
		==> Number is greater than 20
	 else if(positive odd number)
		==> Odd Number: n
	 else
		==> Invalid Input


### Test Cases: 

**Case 1:** n = 3
	n is positive odd integer, so we print "Odd number: 3"

**Case 2:** n = 2
	n is positive even integer, so we print "Even Number: 2" 
	and (n=2 && n<5), so we print "Number lies between 1 to 5"

**Case 3:** n = 12
	n is positive even integer, so we print "Even Number: 12" 
	and (n>6 && n<20), so we print "Number lies between 6 to 20"

**Case 4:** n = 24
	n is positive even integer, so we print "Even Number: 24"
	and (n>20), so we print "Number is greater than 20"

**Case 5:** n = -10
	So, we print "Invalid Input"

**Case 6:** n = 0
	So, we print "Invalid Input"


### Logic:
Given an integer, n, we perform following actions:
==> If n is positive odd integer i.e. n is greater than 0 and on dividing n with 2 the remainder is non-zero, then it satisfies the else if statement mentioned on line 22. After entering else if statement, it will execute print statement "Odd Number: n".

==> If n is positive even integer i.e. n is greater than 0 and on dividing n with 2 the remainder is zero, then it satisfies the if statement mentioned on line 10. After entering if statement, it will execute print statement "Even Number: n". It will check for further if, else if, and else conditions.

==> Program will check if condition i.e. n is greater than & equal to 2 and n is less than 5, if this condition is met by the integer then it will execute print statement on line 13 and will print "Number lies between 1 to 5". If the "if" statement is not met then it will check for else if statement i.e. n is greater & equal to 6 and n is smaller & equal to 20, if this condition is met, it will print "Number lies between 6 to 20". If n doesn't satisfy else if statement, program will further check for else statement i.e. n is greater than 20 which on satisfaction will print "Number is greater than 20"

==> If the input from user is neither positive even integer nor positive odd integer then, it will execute else statement on line 25 and on its execution it will print "Invalid Input". 
