### Task: 
Ask user to select a number from 1 to 3. For each case, print the corresponding case on the screen. In case one, ask user to select one of the three fruits and for the corresponding cases, print different statements. Perform the following action using Switch statement.

### Programming Language: Java

### Input: 	

  	A positive integer, 'a' from 1 to 3,
	A string, 'fruit' from three provided options 

### Output: 

  	if(a==1)
		==> if(fruit=="Mango"), print "It's Mango! King of Fruits"
		==> if(fruit=="Apple"), print "An Apple a day does not keeps the doctor away, happiness does."
		==> if(fruit=="Cherry"), print "It's Cherry! Cutie Patootie"
	elseif(a==2), 
		print "a is 2"
	elseif(a==3), 
		print "a is 3"
	else, 
		print "Invalid Input"


### Test Cases:
 
**Case 1:** a = 1 and fruit = "Mango"
	==> Under Nested Switch statement "Mango" case will be executed.
	==> Print "It's Mango! King of Fruits"

**Case 2:** a = 1 and fruit = "Apple"
	==> Under Nested Switch statement "Apple" case will be executed.
	==> Print "An Apple a day does not keeps the doctor away, happiness does."

**Case 3:** a = 1 and fruit = "Cherry"
	==> Under Nested Switch statement "Cherry" case will be executed.
	==> Print "It's Cherry! Cutie Patootie"

**Case 4:** a = 2
	==> Under switch statement, case-2 will be executed.
	==> Print "a is 2"

**Case 5:** a = 3
	==> Under switch statement, case-3 will be executed.
	==> Print "a is 3"

**Case 6:** a = 4
	==> Under switch statement, default case will be executed.
	==> Print "Invalid Input"

**Case 7:** a = A
	==> Exception


### Logic:

==> Program will ask user to enter a choice from 1, 2 or 3, which will be stored in an integer data type variable named 'a'.

==> Switch statement will get executed which will check for the value of 'a'. If the entered choice by the user is 1,2 or 3, it will look for their particular cases. Otherwise, it will execute default case which will print "Invalid Input" on the screen.

==> Under switch statement, if a = 1 i.e. case-1 is satisfied, it will execute nested switch statement in which it will ask user to enter a choice from "Mango", "Apple", and "Cherry", and on user's choice corresponding cases will be executed along with the print statements.

==> Under switch statement, if a = 2 i.e. case-2 is satisfied, it will print "a is 2".

==> Under switch statement, if a = 3 i.e. case-3 is satisfied, it will print "a is 3".
